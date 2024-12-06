package com.steadfast.NinjaRegistration.Missions;

import com.steadfast.NinjaRegistration.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
