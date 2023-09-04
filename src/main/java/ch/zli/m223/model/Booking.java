package ch.zli.m223.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datum;

    @Column(nullable = false)
    private String zeitraum;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    // Konstruktor
    public Booking() {
    }

    // Getter-Methoden
    public Long getId() {
        return id;
    }

    public Date getDatum() {
        return datum;
    }

    public String getZeitraum() {
        return zeitraum;
    }

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Location getStandort() {
        return location;
    }

    // Setter-Methoden
    public void setId(Long id) {
        this.id = id;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setZeitraum(String zeitraum) {
        this.zeitraum = zeitraum;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStandort(Location location) {
        this.location = location;
    }
}
