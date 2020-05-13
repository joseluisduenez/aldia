package com.hexaware.hackathon.aldia.socialworker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialWorkerServiceImpl implements SocialWorkerService {

	@Autowired
	SocialWorkerRepository socialWorkerRepository;
	
	@Override
	public void addSocialWorker(SocialWorker socialWorker) {
		socialWorkerRepository.save(socialWorker);
	}

	@Override
	public void deleteSocialWorker(String idSocialWorker) {
		socialWorkerRepository.deleteById(idSocialWorker);
	}

	@Override
	public SocialWorker findSocialWorkerById(String idSocialWorker) {
		Optional<SocialWorker> optionalSocialWorker = socialWorkerRepository.findById(idSocialWorker);
		SocialWorker socialWorkerEntity = optionalSocialWorker.get();
		return socialWorkerEntity;
	}

	@Override
	public List<SocialWorker> findAllSocialWorkers() {
		List<SocialWorker> socialWorkers = new ArrayList<SocialWorker>();
		socialWorkerRepository.findAll().forEach(socialWorkers::add);
		return socialWorkers;
	}

	@Override
	public void updateSocialWorker(SocialWorker socialWorker) {
		socialWorkerRepository.save(socialWorker);

	}

}
