package Model;

import java.util.Objects;

public class Production {
    String nameProd;
    String Nation;

    public Production(String nameProd, String nation) {
        this.nameProd = nameProd;
        Nation = nation;
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Production that = (Production) o;
        return Objects.equals(nameProd, that.nameProd) && Objects.equals(Nation, that.Nation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProd, Nation);
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    @Override
    public String toString() {
        return "Production{" +
                "nameProd='" + nameProd + '\'' +
                ", Nation='" + Nation + '\'' +
                '}';
    }
}
