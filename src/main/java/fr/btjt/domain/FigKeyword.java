package fr.btjt.domain;

import javax.persistence.*;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
@Table(name = "fig_keyword", schema = "w40k", catalog = "")
public class FigKeyword {
    private Integer idFigurine;
    private Keyword keyword;

    @Id
    @Column(name = "idFigurine")
    public Integer getIdFigurine() {
        return idFigurine;
    }

    public void setIdFigurine(Integer idFigurine) {
        this.idFigurine = idFigurine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FigKeyword that = (FigKeyword) o;

        if (idFigurine != null ? !idFigurine.equals(that.idFigurine) : that.idFigurine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idFigurine != null ? idFigurine.hashCode() : 0;
    }

    @ManyToOne
    @JoinColumn(name = "keyword", referencedColumnName = "code", nullable = false, insertable = false, updatable = false)
    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }
}
