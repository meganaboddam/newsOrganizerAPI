package models;

import java.util.Objects;

public class Departments {
    private String departmentName;
    private String departmentDescription;
    private int departmentEmployeesNumber;
    private int id;



    public Departments(String departmentName, String departmentDescription, int departmentEmployeesNumber){
        this.departmentName = departmentName;
        this.departmentDescription = departmentDescription;
        this.departmentEmployeesNumber = departmentEmployeesNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departments that = (Departments) o;
        return departmentEmployeesNumber == that.departmentEmployeesNumber &&
                id == that.id &&
                departmentName.equals(that.departmentName) &&
                departmentDescription.equals(that.departmentDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, departmentDescription, departmentEmployeesNumber, id);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public int getDepartmentEmployeesNumber() {
        return departmentEmployeesNumber;
    }

    public void setDepartmentEmployeesNumber(int departmentEmployeesNumber) {
        this.departmentEmployeesNumber = departmentEmployeesNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
