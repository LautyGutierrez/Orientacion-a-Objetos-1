package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class LIFO extends Job{
	
	public LIFO() {
		
	}
	public JobDescription choose(List<JobDescription> jobs) {
		if(!jobs.isEmpty()) return jobs.get(jobs.size()-1);
		return null;
	}
}
