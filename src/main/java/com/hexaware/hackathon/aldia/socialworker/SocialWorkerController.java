package com.hexaware.hackathon.aldia.socialworker;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialWorkerController {
	
	@Autowired
	SocialWorkerServiceImpl socialWorkerServiceImpl;
	
	private final static Logger log = LoggerFactory.getLogger(SocialWorkerController.class);
	
	@PostMapping(path="/socialworker")
	public void addSocialWorker(@RequestBody SocialWorker socialWorker)
	{
		log.info("Social Worker Added");
		socialWorkerServiceImpl.addSocialWorker(socialWorker);
	}
	
	@DeleteMapping(path="/socialworker/{idSocialWorker}")
	public void deleteSocialWorker(@PathVariable String idSocialWorker)
	{
		log.info("Social Worker Deleted");
		socialWorkerServiceImpl.deleteSocialWorker(idSocialWorker);
	}
	
	@GetMapping(path="/socialworker/{idSocialWorker}")
	public SocialWorker findSocialWorkerById(@PathVariable String idSocialWorker)
	{
		log.info("Social Worker Found");
		return socialWorkerServiceImpl.findSocialWorkerById(idSocialWorker);
	}
	
	@GetMapping(path="/socialworker")
	public List<SocialWorker> findAllSocialWorker()
	{
		log.info("All Social Workers Found");
		return socialWorkerServiceImpl.findAllSocialWorkers();
	}
	
	@PutMapping(path="/socialworker")
	public void updateSocialWorker(@RequestBody SocialWorker socialWorker)
	{
		log.info("Social Worker Updated");
		socialWorkerServiceImpl.updateSocialWorker(socialWorker);
	}

}
