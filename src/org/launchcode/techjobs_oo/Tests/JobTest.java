package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.naming.Name;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
    }

    //Use assertEquals, assertTrue, or assertFalse to test that the
    //ID values for the two objects are NOT the same and differ by 1.

    @Test
    public void testSettingJobId() {
        assertTrue(test_job1.getId() == (test_job2.getId() - 1));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(newJob instanceof Job);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(newJob.getName(), "Product tester");
        assertEquals(newJob.getEmployer().getValue(), "ACME");
        assertEquals(newJob.getLocation().getValue(), "Desert");
        assertEquals(newJob.getPositionType().getValue(), "Quality control");
        assertEquals(newJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job newJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(newJob1.equals(newJob2));
    }











}
