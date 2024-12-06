package com.steadfast.NinjaRegistration.Ninjas;


import com.steadfast.NinjaRegistration.Missions.MissionsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_registration")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    @ManyToOne
    private List<MissionsModel> missions;


}