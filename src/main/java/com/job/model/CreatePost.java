package com.job.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "create_post")
public class CreatePost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "vacancyId" , length = 20)
    private int vacancyId;

    @Column(name = "vacancy_no" , length = 20)
    private int vacancyNo;

    @Column(name = "position_name" , length = 100)
    private String positionName;

    @Column(name = "depart_ment" , length = 20)
    private String departMent;

    @Column(name = "education_qualification" , length = 20)
    private String educationQualificaton;

    @Column(name = "qualification" , length = 20)
    private String qualification;

    @Column(name = "comments" , length = 20)
    private String comments;

    @Column(name = "publish_date")
    private String publishDate;

    @Column(name = "applicaton_dead_line")
    private String applicatonDeadLine;

    @Column(name = "file_data")
    private byte[] fileData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(int vacancyId) {
        this.vacancyId = vacancyId;
    }

    public int getVacancyNo() {
        return vacancyNo;
    }

    public void setVacancyNo(int vacancyNo) {
        this.vacancyNo = vacancyNo;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDepartMent() {
        return departMent;
    }

    public void setDepartMent(String departMent) {
        this.departMent = departMent;
    }

    public String getEducationQualificaton() {
        return educationQualificaton;
    }

    public void setEducationQualificaton(String educationQualificaton) {
        this.educationQualificaton = educationQualificaton;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getApplicatonDeadLine() {
        return applicatonDeadLine;
    }

    public void setApplicatonDeadLine(String applicatonDeadLine) {
        this.applicatonDeadLine = applicatonDeadLine;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }


    @Override
    public String toString() {
        return "CreatePost{" +
                "id=" + id +
                ", vacancyId=" + vacancyId +
                ", vacancyNo=" + vacancyNo +
                ", positionName='" + positionName + '\'' +
                ", departMent='" + departMent + '\'' +
                ", educationQualificaton='" + educationQualificaton + '\'' +
                ", qualification='" + qualification + '\'' +
                ", comments='" + comments + '\'' +
                ", publishDate=" + publishDate +
                ", applicatonDeadLine=" + applicatonDeadLine +
                ", fileData=" + Arrays.toString(fileData) +
                '}';
    }
}
