package com.job.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "experience_information")
public class ExperienceInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "organization_name", length = 50)
    private String organizationName;

    @Column(name = "organization_address", length = 200)
    private String organizationAddress;

    @Column(name = "position", length = 50)
    private String position;

    @Column(name = "department", length = 50)
    private String department;

    @Column(name = "from_date")
    @Type(type="date")
    private Date fromDate;

    @Column(name = "to_date")
    @Type(type="date")
    private Date toDate;

    @Column(name = "status", length = 10)
    private String status;

    @Column(name = "contact_person", length = 50)
    private String contactPerson;

    @Column(name = "contact_name", length = 50)
    private String ContacName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContacName() {
        return ContacName;
    }

    public void setContacName(String contacName) {
        ContacName = contacName;
    }

    @Override
    public String toString() {
        return "ExperienceInformation{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
                ", organizationAddress='" + organizationAddress + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", status='" + status + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", ContacName='" + ContacName + '\'' +
                '}';
    }
}
