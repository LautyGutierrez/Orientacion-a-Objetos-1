package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class MostEffort extends Job{
	public MostEffort() {
		
	}
	public JobDescription choose(List<JobDescription> jobs) {
		return jobs.stream()
        .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
        .orElse(null);
	}
}
