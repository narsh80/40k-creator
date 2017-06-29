package fr.btjt.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by bibi on 15/06/2017.
 */
public class FigAbilitiesPK implements Serializable {
    private Integer idFigurine;
    private Integer idAblity;

    @Column(name = "idFigurine")
    @Id
    public Integer getIdFigurine() {
        return idFigurine;
    }

    public void setIdFigurine(Integer idFigurine) {
        this.idFigurine = idFigurine;
    }

    @Column(name = "idAblity")
    @Id
    public Integer getIdAblity() {
        return idAblity;
    }

    public void setIdAblity(Integer idAblity) {
        this.idAblity = idAblity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FigAbilitiesPK that = (FigAbilitiesPK) o;

        if (idFigurine != null ? !idFigurine.equals(that.idFigurine) : that.idFigurine != null) return false;
        if (idAblity != null ? !idAblity.equals(that.idAblity) : that.idAblity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFigurine != null ? idFigurine.hashCode() : 0;
        result = 31 * result + (idAblity != null ? idAblity.hashCode() : 0);
        return result;
    }
}
