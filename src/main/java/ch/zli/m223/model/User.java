package ch.zli.m223.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String vorname;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwort;

    @Column(nullable = false)
    private String rolle;

    // Konstruktor
    public User() {
    }

    // Getter-Methoden
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswort() {
        return passwort;
    }

    public String getRolle() {
        return rolle;
    }

    // Setter-Methoden
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }
}
