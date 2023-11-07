package org.example.Simplified_Applicant_Tracking_System;
import java.util.*;

class JobPosition {

    String title;
    String description;
    double offeredSalaryRangeStart;
    double offeredSalaryRangeEnd;
    List<String> requiredSkills;
    String location;
    String industry;
    String role;

    public JobPosition(String title, String description, double offeredSalaryRangeStart,
                       double offeredSalaryRangeEnd, List<String> requiredSkills,
                       String location, String industry, String role) {
        this.title = title;
        this.description = description;
        this.offeredSalaryRangeStart = offeredSalaryRangeStart;
        this.offeredSalaryRangeEnd = offeredSalaryRangeEnd;
        this.requiredSkills = requiredSkills;
        this.location = location;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getOfferedSalaryRangeStart() {

        return offeredSalaryRangeStart;
    }

    public void setOfferedSalaryRangeStart(double offeredSalaryRangeStart) {
        this.offeredSalaryRangeStart = offeredSalaryRangeStart;
    }

    public double getOfferedSalaryRangeEnd() {

        return offeredSalaryRangeEnd;
    }

    public void setOfferedSalaryRangeEnd(double offeredSalaryRangeEnd) {
        this.offeredSalaryRangeEnd = offeredSalaryRangeEnd;
    }

    public List<String> getRequiredSkills() {

        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {

        this.requiredSkills = requiredSkills;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isWithinBudget(Applicant applicant){
        double expectedSalary = applicant.getExpectedSalary();
        return expectedSalary >= offeredSalaryRangeStart &&
                expectedSalary <= offeredSalaryRangeEnd;
    }


}


