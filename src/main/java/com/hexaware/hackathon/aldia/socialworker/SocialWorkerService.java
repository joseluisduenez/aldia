package com.hexaware.hackathon.aldia.socialworker;

import java.util.List;

public interface SocialWorkerService {
	void addSocialWorker(SocialWorker socialWorker);
	void deleteSocialWorker(String idSocialWorker);
	SocialWorker findSocialWorkerById(String idSocialWorker);
	List<SocialWorker> findAllSocialWorkers();
	void updateSocialWorker(SocialWorker socialWorker);
}
