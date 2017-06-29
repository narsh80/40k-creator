package fr.btjt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by bibi on 15/06/2017.
 */
@Entity
public class Keyword {
    private String code;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Keyword keyword = (Keyword) o;

        if (code != null ? !code.equals(keyword.code) : keyword.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}
