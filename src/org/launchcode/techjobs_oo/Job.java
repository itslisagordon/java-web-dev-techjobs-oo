package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id &&
                name.equals(job.name) &&
                employer.equals(job.employer) &&
                location.equals(job.location) &&
                positionType.equals(job.positionType) &&
                coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    @Override
    public String toString() {

//        ArrayList<Object> jobFieldList = new ArrayList<>();
//            jobFieldList.add(this.getEmployer());
//            jobFieldList.add(this.getLocation());
//            jobFieldList.add(this.getPositionType());
//            jobFieldList.add(this.getCoreCompetency());

        if (this.getName().trim().equals("")) {
            this.setName("Data not available");
        }

        if (this.getEmployer().getValue().trim().equals("")) {
            this.getEmployer().setValue("Data not available");
        }

        if (this.getLocation().getValue().trim().equals("")) {
                this.getLocation().setValue("Data not available");
        }

        if (this.getPositionType().getValue().trim().equals("")) {
            this.getPositionType().setValue("Data not available");
        }

        if (this.getCoreCompetency().getValue().trim().equals("")) {
            this.getCoreCompetency().setValue("Data not available");
        }

        return  "\nID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer +
                "\nLocation: " + location +
                "\nPosition Type: " + positionType +
                "\nCore Competency: " + coreCompetency +
                '\n';
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
