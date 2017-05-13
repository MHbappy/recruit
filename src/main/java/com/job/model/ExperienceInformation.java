package com.job.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "experience_information")
public class ExperienceInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String organizationName;

    private String organizationAddress;

    private Date from_date;

    private Date to_date;

//    private Date e
}
