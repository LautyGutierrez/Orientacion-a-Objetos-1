package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class FIFO extends Job{
	
	public FIFO() {
		
	}
	public JobDescription choose(List<JobDescription> jobs) {
		if(!jobs.isEmpty())return jobs.get(0);
		return null;
	}
	
}
