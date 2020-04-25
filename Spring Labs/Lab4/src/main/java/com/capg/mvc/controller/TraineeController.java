package com.capg.mvc.controller;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.capg.mvc.entities.Trainee;
import com.capg.mvc.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	private TraineeService service;
	
	
	//Login 
	@RequestMapping(value="/login",method= {RequestMethod.POST})
	public String loggedIn(@RequestParam("uname")String uname,@RequestParam("upass")String upass){
		if(uname.equals("shubhi")&&upass.equals("shubhi@12"))				
		return "operations";
		else
			return "login";
	}
	
	
	//Adding Trainee
	@RequestMapping(value="/addTrainee",method=RequestMethod.GET)
	public String add(){

			return "addTrainee";
	}
	
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addTrainee(@ModelAttribute("trainee")Trainee train,ModelMap map) {
		 Trainee savedTrainee = service.addTrainee(train);
		 if(savedTrainee!=null)
		 map.addAttribute("message", "Trainee added in the DB with Trainee ID:"+savedTrainee.getTraineeId());
		 else
		 map.addAttribute("message", "Trainee not added in the DB ");
				 
		 return "result";
	}
	
	//Delete Trainee
			@RequestMapping(value="/deletetrainee",method=RequestMethod.GET)
			public String delete() {
				
				return "deletetrainee";
			}
			
			@RequestMapping(value="/delete",method=RequestMethod.POST)
			public String deleteById(Model model,@RequestParam("traineeId") int traineeId) {
				Trainee trainee=service.searchTrainee(traineeId);
				model.addAttribute("t",trainee);
				return "deletetrainee";
			}
			
			@RequestMapping(value="/deletetrainee/{traineeId}",method=RequestMethod.POST)
			public String delete(Model model,@PathVariable("traineeId") int traineeId) {
				service.deleteTrainee(traineeId);
				return "deletetrainee";
			}
			
			
			//modify trainee
			@RequestMapping(value="/modifytrainee",method=RequestMethod.GET)
			public String modify() {
			
				return "modifytrainee";
			}
			
			@RequestMapping(value="/modify",method=RequestMethod.POST)
			public String modifyById(Model model,@RequestParam("traineeId") int traineeId) {
				Trainee trainee=service.searchTrainee(traineeId);
				model.addAttribute("t",trainee);
				return "modifytrainee";
			}
			
			@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
			public String modify(Model model,@ModelAttribute("trainee") Trainee trainee) {
				service.modifyTrainee(trainee);
				model.addAttribute("message","Trainee with ID: "+trainee.getTraineeId()+" is modified successfully");
				return "modifytrainee";
			}
			
			
			//retrieve trainee by id
			@RequestMapping(value="/retrievetrainee",method=RequestMethod.GET)
			public String retrieve(Model model) {
				model.addAttribute("message","Retrieve a Trainee ");
				return "retrievetrainee";
			}
			
			@RequestMapping(value="/retrieve",method=RequestMethod.POST)
			public String retrievebyid(Model model,@RequestParam("traineeId") int traineeId ) {
				Trainee trainee=service.searchTrainee(traineeId);
				model.addAttribute("t",trainee);
				
				return "retrievetrainee";
			}
			
			//for retrieving all trainee
			@RequestMapping(value="/retrievealltrainee",method=RequestMethod.GET)
			public String retrieveall(Model model) {
				List<Trainee> li=service.retrieveAllTrainees();
				model.addAttribute("li",li );
				
				return "retrievealltrainee";
			}
		

	
}
