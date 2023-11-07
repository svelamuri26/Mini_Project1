package org.example.Simplified_Applicant_Tracking_System;
import java.util.*;

class Recruiter {

    String name;
    List<JobPosition> jobPositionsManaged;
    Set<String> specializedIndustries;
    Set<String> specializedRoles ;

    public Recruiter(String name) {
        this.name = name;
        this.jobPositionsManaged = new ArrayList<>();
        }



    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setJobPositionsManaged(List<JobPosition> jobPositionsManaged) {
        this.jobPositionsManaged = jobPositionsManaged;
    }

    public List<JobPosition> getJobPositionsManaged() {

        return jobPositionsManaged;
    }

    public Set<String> getSpecializedIndustries() {

        return specializedIndustries;
    }

    public void setSpecializedIndustries(Set<String> specializedIndustries) {
        this.specializedIndustries = specializedIndustries;
    }

    public Set<String> getSpecializedRoles() {

        return specializedRoles;
    }

    public void setSpecializedRoles(Set<String> specializedRoles) {

        this.specializedRoles = specializedRoles;
    }

    public void assignJobPosition(JobPosition jobPosition) {

        jobPositionsManaged.add(jobPosition);
    }
    public void reviewApplicant(Applicant applicant) {
        if (applicant != null)
        applicant.setStatus("Reviewed");
    }

    public boolean isSpecializedFor(JobPosition jobPosition){
        return jobPositionsManaged.contains(jobPosition);
    }


    public boolean isnotSpecializedFor(JobPosition jobPosition) {
        return jobPositionsManaged.contains(jobPosition);
    }
}
