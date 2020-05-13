package com.hexaware.hackathon.aldia.helpothers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HelpOtherServiceImpl implements HelpOtherService{
	
	HelpOtherService helpOtherService;
	
	@Autowired
	HelpOtherRepository helpOtherRepository;
	
	private static final Logger log = LoggerFactory.getLogger(HelpOtherServiceImpl.class);

	@Override
	public void addHelpOther(HelpOther helpOther) {
		log.info("Help Other Added");
		helpOtherRepository.save(helpOther);
	}

	@Override
	public void deleteHelpOther(String idHelpOther) {
		log.info("Help Other Deleted");
		helpOtherRepository.deleteById(idHelpOther);
	}

	@Override
	public List<HelpOther> findAllHelpOther() {
		log.info("All Help Others Found");
		List<HelpOther> helpOthers = new ArrayList<HelpOther>();
		helpOtherRepository.findAll().forEach(helpOthers::add);
		return helpOthers;
	}

	@Override
	public void updateHelpOther(HelpOther helpOther) {
		log.info("Help Other Updated");
		helpOtherRepository.save(helpOther);
	}

}
