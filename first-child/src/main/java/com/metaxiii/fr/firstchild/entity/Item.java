package com.metaxiii.fr.firstchild.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Item {
    @Id
    private UUID id;
    private String name;
    private double value;
}
