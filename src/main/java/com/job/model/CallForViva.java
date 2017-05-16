package com.job.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bappy on 5/13/17.
 */

@Entity
@Table(name = "call_for_viva")
public class CallForViva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "create_post_id")
    private int createPostId;

    @Column(name = "viva_venue_name", length = 200)
    private String vivaVenueName;

    @Column(name = "date_viva")
    @Type(type = "date")
    private Date dateViva;

    @Column(name = "date_time")
    @Type(type = "date")
    private Date dateTime;

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

    public String getVivaVenueName() {
        return vivaVenueName;
    }

    public void setVivaVenueName(String vivaVenueName) {
        this.vivaVenueName = vivaVenueName;
    }

    public Date getDateViva() {
        return dateViva;
    }

    public void setDateViva(Date dateViva) {
        this.dateViva = dateViva;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "CallForViva{" +
                "id=" + id +
                ", createPostId=" + createPostId +
                ", vivaVenueName='" + vivaVenueName + '\'' +
                ", dateViva=" + dateViva +
                ", dateTime=" + dateTime +
                '}';
    }
}
