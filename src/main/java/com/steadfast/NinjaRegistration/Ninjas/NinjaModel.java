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
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(unique = true)
    private String email;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionsModel missions;


}