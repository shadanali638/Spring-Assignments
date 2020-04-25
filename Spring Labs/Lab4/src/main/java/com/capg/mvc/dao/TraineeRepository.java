package com.capg.mvc.dao;

import java.util.List;

import com.capg.mvc.entities.Trainee;

public interface TraineeRepository {
	
	
      public Trainee addTrainee(Trainee trainee);
      public void deleteTrainee(int traineeId);
      public Trainee searchById(int traineeId);
      
      public void modifyTrainee(Trainee t);
      public List<Trainee> searchAllTrainees();
      
      
}


