package com.job.model;

import javax.persistence.*;

@Entity
@Table(name = "trainning_information")
public class TrainningInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "trainning_title", length = 200)
    private String trainningTitle;

    @Column(name = "organization_name", length = 200)
    private String organizationName;

    @Column(name = "duration", length = 50)
    private String duration;

    @Column(name = "grade", length = 50)
    private String grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainningTitle() {
        return trainningTitle;
    }

    public void setTrainningTitle(String trainningTitle) {
        this.trainningTitle = trainningTitle;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "TrainningInformation{" +
                "id=" + id +
                ", trainningTitle='" + trainningTitle + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", duration='" + duration + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
