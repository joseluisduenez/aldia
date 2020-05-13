package com.hexaware.hackathon.aldia.helpothers;

import java.util.List;

public interface HelpOtherService {
	
	void addHelpOther(HelpOther helpOther);
	void deleteHelpOther(String idHelpOther);
	List<HelpOther> findAllHelpOther();
	void updateHelpOther(HelpOther helpOther);
}
