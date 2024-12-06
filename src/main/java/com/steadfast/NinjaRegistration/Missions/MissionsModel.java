package com.steadfast.NinjaRegistration.Missions;

import com.steadfast.NinjaRegistration.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionsModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String difficulty;

    private String description;

    @OneToMany(mappedBy = "missions")
    @JoinColumn(name = "mission_id")
    private List<NinjaModel> ninja;

    }
