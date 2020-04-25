package com.capg.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capg.mvc.dao.TraineeRepository;
import com.capg.mvc.entities.Trainee;
import com.capg.mvc.exception.TraineeException;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	private TraineeRepository repository;
	
	
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return repository.addTrainee(trainee);
	}
	
	@Override
	   public void deleteTrainee(int traineeId) {
				
				Trainee t=repository.searchById(traineeId);
				
				if(t!=null){
					repository.deleteTrainee(traineeId);
				}
				else{
			           throw new TraineeException("Trainee with ID: "+traineeId+" does not exist!!");
			    	}
				
			}
	   @Override
	   public Trainee searchTrainee(int traineeId) {
	        Trainee t=repository.searchById(traineeId);
	        if(t!=null)
	    		return repository.searchById(traineeId);
	        else
	    		 throw new TraineeException("Trainee with ID: "+traineeId+" does not exist!!");
			
		}
	   @Override
	   public void modifyTrainee(Trainee t) {
			
			Trainee t1=repository.searchById(t.getTraineeId());
			
			if(t1!=null){
				repository.modifyTrainee(t);
			}
			else
		           throw new TraineeException("Trainee with ID: "+t1.getTraineeId()+" does not exist!!");
		    	
			 	
		}
	   
	   
	   
	    
	    public List<Trainee> retrieveAllTrainees() {
	        return  repository.searchAllTrainees();
	    }
	   
	
	
	

}
