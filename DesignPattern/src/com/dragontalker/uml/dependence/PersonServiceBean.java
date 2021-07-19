package com.dragontalker.uml.dependence;

public class PersonServiceBean {
    // PersonDao: Dependency / Aggregation
    private PersonDao personDao;

    // Person: Dependency
    public void save(Person person) {}

    // IDCard: Dependency
    public IDCard getIDCard(Integer personId) {
        return null;
    }

    // Department: Dependency
    public void modify() {
        Department department = new Department();
    }
}
