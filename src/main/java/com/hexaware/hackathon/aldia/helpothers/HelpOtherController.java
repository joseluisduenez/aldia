package com.hexaware.hackathon.aldia.helpothers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpOtherController {
	
	@Autowired
	HelpOtherServiceImpl helpOtherServiceImpl;
	
	@PostMapping(path="/helpother")
	public void addHelpOther(@RequestBody HelpOther helpOther)
	{
		helpOtherServiceImpl.addHelpOther(helpOther);
	}
	
	@DeleteMapping(path="/helpother/{idHelpOther}")
	public void deleteHelpOther(@PathVariable String idHelpOther)
	{
		helpOtherServiceImpl.deleteHelpOther(idHelpOther);
	}
	
	@GetMapping(path="/helpother")
	public List<HelpOther> findAllHelpOther()
	{
		return helpOtherServiceImpl.findAllHelpOther();
	}
}
