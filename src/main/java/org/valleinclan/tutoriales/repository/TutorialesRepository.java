package org.valleinclan.tutoriales.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.valleinclan.tutoriales.model.TutorialesVO;

import java.util.List;

@Repository
public interface TutorialesRepository extends MongoRepository<TutorialesVO, String> {

    List<TutorialesVO> findByPublicadoTrue();
}
