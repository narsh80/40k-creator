package fr.btjt.domain;

import javax.persistence.*;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
public class Abilities {
    private Integer id;
    private String nom;
    private String description;

    @Id
    @Column(name = "id")
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abilities abilities = (Abilities) o;

        if (id != null ? !id.equals(abilities.id) : abilities.id != null) return false;
        if (nom != null ? !nom.equals(abilities.nom) : abilities.nom != null) return false;
        if (description != null ? !description.equals(abilities.description) : abilities.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
