package ru.kuper.trickyshop.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "clients")
@NoArgsConstructor
@Getter @Setter
public class Client {

    @Id
    @SequenceGenerator(name = "clients_sequence", sequenceName = "hibernate_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    private String phone;

}