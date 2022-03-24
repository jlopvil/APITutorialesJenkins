package org.valleinclan.tutoriales.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.valleinclan.tutoriales.controller.TutorialesAPI;
import org.valleinclan.tutoriales.model.TutorialesVO;
import org.valleinclan.tutoriales.repository.TutorialesRepository;
import org.valleinclan.tutoriales.service.TutorialesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class TutorialesController implements TutorialesAPI {

    @Autowired
    private TutorialesService tutorialesService;

    @Autowired
    private TutorialesRepository tutorialesRepository;

    @Override
    @GetMapping("/tutorials")
    public List<TutorialesVO> getAllTutorials() {
        return tutorialesService.getAllTutorials();
    }

    @Override
    @GetMapping("/tutorials/{id}")
    public Optional<TutorialesVO> getTutorialById(@PathVariable String id) {
        return tutorialesService.getTutorialById(id);
    }

    @Override
    @GetMapping("/tutorials/published")
    public List<TutorialesVO> findByPublished() {
        return tutorialesService.findByPublished();
    }

    @Override
    @PostMapping("/tutorials")
    public TutorialesVO save(@RequestBody TutorialesVO tutorial) {
        return tutorialesService.save(tutorial);
    }

    @Override
    @PutMapping("/tutorials/{id}")
    public TutorialesVO updateTutorial(@RequestBody TutorialesVO tutorial, @PathVariable String id) {
        if(tutorialesRepository.existsById(id)){
            return tutorialesService.updateTutorial(tutorial);
        }else{
            return null;
        }

    }

    @Override
    @DeleteMapping("/tutorials")
    public ResponseEntity deleteAllTutorials() {
        return tutorialesService.deleteAllTutorials();
    }

    @Override
    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity deleteTutorial(@PathVariable String id) {
        return tutorialesService.deleteTutorial(id);
    }
}
