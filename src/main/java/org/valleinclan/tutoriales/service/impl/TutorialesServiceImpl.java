package org.valleinclan.tutoriales.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.valleinclan.tutoriales.model.TutorialesVO;
import org.valleinclan.tutoriales.repository.TutorialesRepository;
import org.valleinclan.tutoriales.service.TutorialesService;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialesServiceImpl implements TutorialesService {

    @Autowired
    private TutorialesRepository tutorialesRepository;


    @Override
    public List<TutorialesVO> getAllTutorials() {
        return tutorialesRepository.findAll();
    }

    @Override
    public Optional<TutorialesVO> getTutorialById(String id) {
        return tutorialesRepository.findById(id);
    }

    @Override
    public List<TutorialesVO> findByPublished() {
        return tutorialesRepository.findByPublicadoTrue();
    }

    @Override
    public TutorialesVO save(TutorialesVO tutorial) {
        return tutorialesRepository.save(tutorial);
    }

    @Override
    public TutorialesVO updateTutorial(TutorialesVO tutorial) {
        return tutorialesRepository.save(tutorial);
    }

    @Override
    public ResponseEntity deleteTutorial(String id) {
        if(tutorialesRepository.existsById(id)){
            tutorialesRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }

    @Override
    public ResponseEntity deleteAllTutorials() {
        tutorialesRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}
