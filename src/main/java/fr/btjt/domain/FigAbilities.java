package fr.btjt.domain;

import javax.persistence.*;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
@Table(name = "fig_abilities", schema = "w40k", catalog = "")
@IdClass(FigAbilitiesPK.class)
public class FigAbilities {
    private Integer idFigurine;
    private Integer idAblity;
    private Abilities ability;

    @Id
    @Column(name = "idFigurine")
    public Integer getIdFigurine() {
        return idFigurine;
    }

    public void setIdFigurine(Integer idFigurine) {
        this.idFigurine = idFigurine;
    }

    @Id
    @Column(name = "idAblity")
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

        FigAbilities that = (FigAbilities) o;

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

    @ManyToOne
    @JoinColumn(name = "idAblity", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Abilities getAbility() {
        return ability;
    }

    public void setAbility(Abilities ability) {
        this.ability = ability;
    }
}
