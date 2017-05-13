package com.job.model;

import javax.persistence.*;

@Entity
@Table(name = "EDUCATION_INFORMATION")
public class EducationInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "degrees")
    private String degrees;

    @Column(name = "majors")
    private String majors;

    @Column(name = "edu_re")
    private String eduRe;

    @Column(name = "level_of_education")
    private String levelOfEducation;

    @Column(name = "result_publishing_date")
    private String resultPublishingDate;

    @Column(name = "certificate_sl_no")
    private int certificationSlNo;

    @Column(name = "certificate_session")
    private String certificateSession;

    @Column(name = "certificate_roll_no")
    private int certificateRollNo;

    @Column(name = "institute_name")
    private String instituteName;

    @Column(name = "scale_re")
    private String scaleRe;

    @Column(name = "passing_year")
    private String passingYear;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDegree() {
        return degrees;
    }

    public void setDegree(String degrees) {
        this.degrees = degrees;
    }

    public String getMajor() {
        return majors;
    }

    public void setMajor(String majors) {
        this.majors = majors;
    }

    public String getResult() {
        return eduRe;
    }

    public void setResult(String eduRe) {
        this.eduRe = eduRe;
    }

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public String getResultPublishingDate() {
        return resultPublishingDate;
    }

    public void setResultPublishingDate(String resultPublishingDate) {
        this.resultPublishingDate = resultPublishingDate;
    }

    public int getCertificationSlNo() {
        return certificationSlNo;
    }

    public void setCertificationSlNo(int certificationSlNo) {
        this.certificationSlNo = certificationSlNo;
    }

    public String getCertificateSession() {
        return certificateSession;
    }

    public void setCertificateSession(String certificateSession) {
        this.certificateSession = certificateSession;
    }

    public int getCertificateRollNo() {
        return certificateRollNo;
    }

    public void setCertificateRollNo(int certificateRollNo) {
        this.certificateRollNo = certificateRollNo;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getResultScale() {
        return scaleRe;
    }

    public void setResultScale(String scaleRe) {
        this.scaleRe = scaleRe;
    }

    public String getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    @Override
    public String toString() {
        return "EducationInformation{" +
                "id=" + id +
                ", degree='" + degrees + '\'' +
                ", major='" + majors + '\'' +
                ", result='" + eduRe+ '\'' +
                ", levelOfEducation='" + levelOfEducation + '\'' +
                ", resultPublishingDate='" + resultPublishingDate + '\'' +
                ", certificationSlNo=" + certificationSlNo +
                ", certificateSession='" + certificateSession + '\'' +
                ", certificateRollNo=" + certificateRollNo +
                ", instituteName='" + instituteName + '\'' +
                ", resultScale='" + scaleRe + '\'' +
                ", passingYear='" + passingYear + '\'' +
                '}';
    }
}
