package fr.btjt.domain;

import javax.persistence.*;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
@Table(name = "fig_options", schema = "w40k", catalog = "")
@IdClass(FigOptionsPK.class)
public class FigOptions {
    private Integer idFigurine;
    private Integer idOptions;
    private Boolean isDefault;
    private Options option;

    @Id
    @Column(name = "idFigurine")
    public Integer getIdFigurine() {
        return idFigurine;
    }

    public void setIdFigurine(Integer idFigurine) {
        this.idFigurine = idFigurine;
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
    @Column(name = "isDefault")
    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FigOptions that = (FigOptions) o;

        if (idFigurine != null ? !idFigurine.equals(that.idFigurine) : that.idFigurine != null) return false;
        if (idOptions != null ? !idOptions.equals(that.idOptions) : that.idOptions != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFigurine != null ? idFigurine.hashCode() : 0;
        result = 31 * result + (idOptions != null ? idOptions.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idOptions", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Options getOption() {
        return option;
    }

    public void setOption(Options option) {
        this.option = option;
    }
}
