package com.job.model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "send_appointment")
public class SendAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "create_post_id")
    private int createPostId;

    @Column(name = "file_data")
    private byte[] fileData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreatePostId() {
        return createPostId;
    }

    public void setCreatePostId(int createPostId) {
        this.createPostId = createPostId;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SendAppointment{" +
                "id=" + id +
                ", createPostId=" + createPostId +
                ", fileData=" + Arrays.toString(fileData) +
                '}';
    }
}
