package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Job strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.strategy = new FIFO();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Job getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(Job aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
        JobDescription nextJob =  strategy.choose(this.jobs);
        this.unschedule(nextJob);
        return nextJob;
    }

}
