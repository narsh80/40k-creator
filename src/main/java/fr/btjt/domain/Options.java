package fr.btjt.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
@Table( name = "options")
public class Options {
    private Integer id;
    private String nom;
    private String description;
    private String distance;
    private String type;
    private String strength;
    private String ap;
    private String d;
    private String abilitie;
    private String typeOption;
    private Collection<ArmyOptions> armyOptions;

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
    @Column(name = "distance")
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "strength")
    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Basic
    @Column(name = "AP")
    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    @Basic
    @Column(name = "D")
    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Basic
    @Column(name = "abilitie")
    public String getAbilitie() {
        return abilitie;
    }

    public void setAbilitie(String abilitie) {
        this.abilitie = abilitie;
    }

    @Basic
    @Column(name = "typeOption")
    public String getTypeOption() {
        return typeOption;
    }

    public void setTypeOption(String typeOption) {
        this.typeOption = typeOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Options options = (Options) o;

        if (id != null ? !id.equals(options.id) : options.id != null) return false;
        if (nom != null ? !nom.equals(options.nom) : options.nom != null) return false;
        if (description != null ? !description.equals(options.description) : options.description != null) return false;
        if (distance != null ? !distance.equals(options.distance) : options.distance != null) return false;
        if (type != null ? !type.equals(options.type) : options.type != null) return false;
        if (strength != null ? !strength.equals(options.strength) : options.strength != null) return false;
        if (ap != null ? !ap.equals(options.ap) : options.ap != null) return false;
        if (d != null ? !d.equals(options.d) : options.d != null) return false;
        if (abilitie != null ? !abilitie.equals(options.abilitie) : options.abilitie != null) return false;
        if (typeOption != null ? !typeOption.equals(options.typeOption) : options.typeOption != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (strength != null ? strength.hashCode() : 0);
        result = 31 * result + (ap != null ? ap.hashCode() : 0);
        result = 31 * result + (d != null ? d.hashCode() : 0);
        result = 31 * result + (abilitie != null ? abilitie.hashCode() : 0);
        result = 31 * result + (typeOption != null ? typeOption.hashCode() : 0);
        return result;
    }

    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn( name="idOptions", nullable=false, insertable = false, updatable = false)
    public Collection<ArmyOptions> getArmyOptions() {
        return armyOptions;
    }
    public void setArmyOptions(Collection<ArmyOptions> armyOptions) {
        this.armyOptions = armyOptions;
    }
}
