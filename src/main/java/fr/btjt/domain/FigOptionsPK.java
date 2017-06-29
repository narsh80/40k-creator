package fr.btjt.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bibi on 15/06/2017.
 */
public class FigOptionsPK implements Serializable {
    private Integer idFigurine;
    private Integer idOptions;

    @Column(name = "idFigurine")
    @Id
    public Integer getIdFigurine() {
        return idFigurine;
    }

    public void setIdFigurine(Integer idFigurine) {
        this.idFigurine = idFigurine;
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

        FigOptionsPK that = (FigOptionsPK) o;

        if (idFigurine != null ? !idFigurine.equals(that.idFigurine) : that.idFigurine != null) return false;
        if (idOptions != null ? !idOptions.equals(that.idOptions) : that.idOptions != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFigurine != null ? idFigurine.hashCode() : 0;
        result = 31 * result + (idOptions != null ? idOptions.hashCode() : 0);
        return result;
    }
}
