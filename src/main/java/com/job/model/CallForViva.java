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

    @Column(name = "GENERAL_INFORMATION_ID")
    private int generalInformationId;

    @Column(name = "viva_venue_name", length = 200)
    private String vivaVenueName;

    @Column(name = "date_viva")
    private String dateViva;

    @Column(name = "date_time")
    private String dateTime;


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

    public int getGeneralInformationId() {
        return generalInformationId;
    }

    public void setGeneralInformationId(int generalInformationId) {
        this.generalInformationId = generalInformationId;
    }

    public String getVivaVenueName() {
        return vivaVenueName;
    }

    public void setVivaVenueName(String vivaVenueName) {
        this.vivaVenueName = vivaVenueName;
    }

    public String getDateViva() {
        return dateViva;
    }

    public void setDateViva(String dateViva) {
        this.dateViva = dateViva;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "CallForViva{" +
                "id=" + id +
                ", generalInformationId=" + generalInformationId +
                ", vivaVenueName='" + vivaVenueName + '\'' +
                ", dateViva='" + dateViva + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
