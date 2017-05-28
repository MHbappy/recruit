package com.job.model;

import org.hibernate.annotations.Type;


import javax.persistence.*;



@Entity
@Table(name = "callForWrittenExam")
public class CallForWrittenExam {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "exam_id", length = 15)
    private int examId;

    @Column(name = "select_post", length = 100)
    private String selectPost;

    @Column(name = "venue_name", length = 100)
    private String vanueName;

    @Column(name = "exam_date")
    private String examDate;

    @Column(name = "exam_time")
    private String examTime;

    @Column(name = "selec_all", length = 50)
    private String selectAll;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getSelectPost() {
        return selectPost;
    }

    public void setSelectPost(String selectPost) {
        this.selectPost = selectPost;
    }

    public String getVanueName() {
        return vanueName;
    }

    public void setVanueName(String vanueName) {
        this.vanueName = vanueName;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public String getSelectAll() {
        return selectAll;
    }

    public void setSelectAll(String selectAll) {
        this.selectAll = selectAll;
    }

    @Override
    public String toString() {
        return "CallForWrittenExam{" +
                "id=" + id +
                ", examId=" + examId +
                ", selectPost='" + selectPost + '\'' +
                ", vanueName='" + vanueName + '\'' +
                ", examDate=" + examDate +
                ", examTime=" + examTime +
                ", selectAll='" + selectAll + '\'' +
                '}';
    }
}
