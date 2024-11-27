package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.*;

public abstract class Job {

	public abstract JobDescription choose(List<JobDescription> jobs);
	
}
