package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

public class HighestPriority extends Job{
	public HighestPriority() {
		
	}
	public JobDescription choose(List<JobDescription> jobs) {
		return jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
	}
}
