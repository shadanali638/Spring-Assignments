package com.capg.mvc.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.capg.mvc.entities.Trainee;

@Repository
public class TraineeRepositoryImpl implements TraineeRepository {
	
	@PersistenceContext
	public EntityManager manager;
	
	

@Override
	public Trainee addTrainee(Trainee trainee) {
	
		manager.persist(trainee);
		return trainee;
	}
@Override
public void deleteTrainee(int traineeId) {
	
	Trainee tr=  manager.find(Trainee.class, traineeId);
	 manager.remove(tr);
	
	
}
@Override
public Trainee searchById(int traineeId) {
    return  manager.find(Trainee.class, traineeId);
    
}

@Override
public void modifyTrainee(Trainee t) {
	 manager.merge(t);
}
@Override
public List<Trainee> searchAllTrainees() {
    Query q =  manager.createQuery("select t from Trainee t",Trainee.class);
    List<Trainee> li=q.getResultList();
    return li;
}



}
