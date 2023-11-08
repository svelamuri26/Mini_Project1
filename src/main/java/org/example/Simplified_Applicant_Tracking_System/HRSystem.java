package org.example.Simplified_Applicant_Tracking_System;
import java.util.*;

class HRSystem {

    List<JobPosition> jobPositions;
    List<Recruiter> recruiters;
    List<Applicant> applicants;

    public HRSystem(List<JobPosition> jobPositions, List<Recruiter> recruiters,
                    List<Applicant> applicants) {
        this.jobPositions = jobPositions;
        this.recruiters = recruiters;
        this.applicants = applicants;
    }

    public List<JobPosition> getJobPositions() {
        return jobPositions;
    }

    public void setJobPositions(List<JobPosition> jobPositions) {
        this.jobPositions = jobPositions;
    }

    public List<Recruiter> getRecruiters() {
        return recruiters;
    }

    public void setRecruiters(List<Recruiter> recruiters) {
        this.recruiters = recruiters;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Applicant> applicants) {

        this.applicants = applicants;
    }

    public boolean addJobPosition(JobPosition jobPosition){
        if(jobPosition != null && jobPosition.offeredSalaryRangeStart <= jobPosition.offeredSalaryRangeEnd ){
            jobPositions.add(jobPosition) ;
        }
        return false;
    }

    public void addRecruiter(Recruiter recruiter){
        if(recruiter != null) {
            recruiters.add(recruiter);
        }

    }

    public void addApplicant(Applicant applicant){
        if(applicant != null){
            applicants.add(applicant);
        }

    }

    public void generateReports(){
        return ;
    }

}
