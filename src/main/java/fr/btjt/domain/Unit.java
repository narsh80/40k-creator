package fr.btjt.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
public class Unit {
    private Integer id;
    private String nom;
    private String description;
    private Boolean equipementPointInclude;
    private String typeFigurine;
    private Collection<Figurine> figurines;
    private Army army;

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

    @Basic
    @Column(name = "equipement_point_include")
    public Boolean getEquipementPointInclude() {
        return equipementPointInclude;
    }

    public void setEquipementPointInclude(Boolean equipementPointInclude) {
        this.equipementPointInclude = equipementPointInclude;
    }

    @Basic
    @Column(name = "typeFigurine")
    public String getTypeFigurine() {
        return typeFigurine;
    }

    public void setTypeFigurine(String typeFigurine) {
        this.typeFigurine = typeFigurine;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unit unit = (Unit) o;

        if (id != null ? !id.equals(unit.id) : unit.id != null) return false;
        if (nom != null ? !nom.equals(unit.nom) : unit.nom != null) return false;
        if (description != null ? !description.equals(unit.description) : unit.description != null) return false;
        if (equipementPointInclude != null ? !equipementPointInclude.equals(unit.equipementPointInclude) : unit.equipementPointInclude != null) return false;
        if (typeFigurine != null ? !typeFigurine.equals(unit.typeFigurine) : unit.typeFigurine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (equipementPointInclude != null ? equipementPointInclude.hashCode() : 0);
        result = 31 * result + (typeFigurine != null ? typeFigurine.hashCode() : 0);
        return result;
    }

    @OneToMany
    @JoinColumn( name="idUnit", nullable=false)
    public Collection<Figurine> getFigurines() {
        return figurines;
    }

    public void setFigurines(Collection<Figurine> figurines) {
        this.figurines = figurines;
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_army", referencedColumnName = "id", nullable = false)
    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }
}
