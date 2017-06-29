package fr.btjt.domain;

import javax.persistence.*;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
@Table(name = "army_options", schema = "w40k")
@IdClass(ArmyOptionsPK.class)
public class ArmyOptions {
    private Integer idArmy;
    private Integer idOptions;
    private Integer value;
    private Army army;

    @Id
    @Column(name = "idArmy")
    public Integer getIdArmy() {
        return idArmy;
    }

    public void setIdArmy(Integer idArmy) {
        this.idArmy = idArmy;
    }

    @Id
    @Column(name = "idOptions")
    public Integer getIdOptions() {
        return idOptions;
    }

    public void setIdOptions(Integer idOptions) {
        this.idOptions = idOptions;
    }

    @Basic
    @Column(name = "value")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArmyOptions that = (ArmyOptions) o;

        if (idArmy != null ? !idArmy.equals(that.idArmy) : that.idArmy != null) return false;
        if (idOptions != null ? !idOptions.equals(that.idOptions) : that.idOptions != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArmy != null ? idArmy.hashCode() : 0;
        result = 31 * result + (idOptions != null ? idOptions.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idArmy", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }
}
