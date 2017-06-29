package fr.btjt.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
public class Figurine {
    private Integer id;
    private String nom;
    private String description;
    private String m;
    private String ws;
    private String bs;
    private String s;
    private String t;
    private String w;
    private String a;
    private String ld;
    private String sv;
    private Integer pointValue;
    private Integer min;
    private Integer max;
    private Collection<FigKeyword> keywords;
    private Collection<FigOptions> options;
    private Integer idUnit;

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
    @Column(name = "M")
    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Basic
    @Column(name = "WS")
    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    @Basic
    @Column(name = "BS")
    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Basic
    @Column(name = "S")
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Basic
    @Column(name = "T")
    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Basic
    @Column(name = "W")
    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    @Basic
    @Column(name = "A")
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Basic
    @Column(name = "Ld")
    public String getLd() {
        return ld;
    }

    public void setLd(String ld) {
        this.ld = ld;
    }

    @Basic
    @Column(name = "Sv")
    public String getSv() {
        return sv;
    }

    public void setSv(String sv) {
        this.sv = sv;
    }

    @Basic
    @Column(name = "pointValue")
    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
        this.pointValue = pointValue;
    }

    @Basic
    @Column(name = "min")
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @Basic
    @Column(name = "max")
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @Basic
    @Column(name = "idUnit", insertable = false, updatable = false)
    public Integer getIdUnit() {
        return idUnit;
    }

    public void setIdUnit(Integer idUnit) {
        this.idUnit = idUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figurine figurine = (Figurine) o;

        if (id != null ? !id.equals(figurine.id) : figurine.id != null) return false;
        if (nom != null ? !nom.equals(figurine.nom) : figurine.nom != null) return false;
        if (description != null ? !description.equals(figurine.description) : figurine.description != null) return false;
        if (m != null ? !m.equals(figurine.m) : figurine.m != null) return false;
        if (ws != null ? !ws.equals(figurine.ws) : figurine.ws != null) return false;
        if (bs != null ? !bs.equals(figurine.bs) : figurine.bs != null) return false;
        if (s != null ? !s.equals(figurine.s) : figurine.s != null) return false;
        if (t != null ? !t.equals(figurine.t) : figurine.t != null) return false;
        if (w != null ? !w.equals(figurine.w) : figurine.w != null) return false;
        if (a != null ? !a.equals(figurine.a) : figurine.a != null) return false;
        if (ld != null ? !ld.equals(figurine.ld) : figurine.ld != null) return false;
        if (sv != null ? !sv.equals(figurine.sv) : figurine.sv != null) return false;
        if (pointValue != null ? !pointValue.equals(figurine.pointValue) : figurine.pointValue != null) return false;
        if (min != null ? !min.equals(figurine.min) : figurine.min != null) return false;
        if (max != null ? !max.equals(figurine.max) : figurine.max != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (m != null ? m.hashCode() : 0);
        result = 31 * result + (ws != null ? ws.hashCode() : 0);
        result = 31 * result + (bs != null ? bs.hashCode() : 0);
        result = 31 * result + (s != null ? s.hashCode() : 0);
        result = 31 * result + (t != null ? t.hashCode() : 0);
        result = 31 * result + (w != null ? w.hashCode() : 0);
        result = 31 * result + (a != null ? a.hashCode() : 0);
        result = 31 * result + (ld != null ? ld.hashCode() : 0);
        result = 31 * result + (sv != null ? sv.hashCode() : 0);
        result = 31 * result + (pointValue != null ? pointValue.hashCode() : 0);
        result = 31 * result + (min != null ? min.hashCode() : 0);
        result = 31 * result + (max != null ? max.hashCode() : 0);
        return result;
    }

    @OneToMany
    public Collection<FigKeyword> getKeywords() {
        return keywords;
    }

    public void setKeywords(Collection<FigKeyword> keywords) {
        this.keywords = keywords;
    }

    @OneToMany
    public Collection<FigOptions> getOptions() {
        return options;
    }

    public void setOptions(Collection<FigOptions> options) {
        this.options = options;
    }


}
