package org.valleinclan.tutoriales.service;

import org.springframework.http.ResponseEntity;
import org.valleinclan.tutoriales.model.TutorialesVO;

import java.util.List;
import java.util.Optional;

public interface TutorialesService {

    List<TutorialesVO> getAllTutorials();
    Optional<TutorialesVO> getTutorialById(String id);
    List<TutorialesVO> findByPublished();
    TutorialesVO save(TutorialesVO tutorial);
    TutorialesVO updateTutorial(TutorialesVO tutorial);
    ResponseEntity deleteTutorial(String id);
    ResponseEntity deleteAllTutorials();
}
