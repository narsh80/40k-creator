package fr.btjt.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bibi on 15/06/2017.
 */
public class ArmyOptionsPK implements Serializable {
    private Integer idArmy;
    private Integer idOptions;

    @Column(name = "idArmy")
    @Id
    public Integer getIdArmy() {
        return idArmy;
    }

    public void setIdArmy(Integer idArmy) {
        this.idArmy = idArmy;
    }

    @Column(name = "idOptions")
    @Id
    public Integer getIdOptions() {
        return idOptions;
    }

    public void setIdOptions(Integer idOptions) {
        this.idOptions = idOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArmyOptionsPK that = (ArmyOptionsPK) o;

        if (idArmy != null ? !idArmy.equals(that.idArmy) : that.idArmy != null) return false;
        if (idOptions != null ? !idOptions.equals(that.idOptions) : that.idOptions != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArmy != null ? idArmy.hashCode() : 0;
        result = 31 * result + (idOptions != null ? idOptions.hashCode() : 0);
        return result;
    }
}
