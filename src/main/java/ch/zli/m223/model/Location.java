package ch.zli.m223.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.persistence.*;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false)
    private String gebaeude;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private String raum;

    // Konstruktor
    public Location() {
    }

    // Getter-Methoden
    public Long getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getGebaeude() {
        return gebaeude;
    }

    public Integer getStock() {
        return stock;
    }

    public String getRaum() {
        return raum;
    }

    // Setter-Methoden
    public void setId(Long id) {
        this.id = id;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setGebaeude(String gebaeude) {
        this.gebaeude = gebaeude;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }
}
