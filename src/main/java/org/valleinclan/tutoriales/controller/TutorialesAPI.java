package org.valleinclan.tutoriales.controller;

import org.springframework.http.ResponseEntity;
import org.valleinclan.tutoriales.model.TutorialesVO;

import java.util.List;
import java.util.Optional;

public interface TutorialesAPI {

    List<TutorialesVO> getAllTutorials();
    Optional<TutorialesVO> getTutorialById(String id);
    List<TutorialesVO> findByPublished();
    TutorialesVO save(TutorialesVO tutorial);
    TutorialesVO updateTutorial(TutorialesVO tutorial, String id);
    ResponseEntity deleteTutorial(String id);
    ResponseEntity deleteAllTutorials();
}
