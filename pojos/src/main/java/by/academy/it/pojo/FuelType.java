package by.academy.it.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "fuel_types")
public class FuelType implements Serializable{

    private static final long serialVersionUID = 9018089323568659323L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fuel_type", unique = true, nullable = false)
    private int idFuelType;

    @Column(name = "name_fuel_type")
    private String nameFuelType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fuelType", cascade = CascadeType.ALL)
    public List<Car> carList;

    public FuelType() {
    }

    public FuelType(String nameFuelType) {
        this.nameFuelType = nameFuelType;
    }

    public int getIdFuelType() {
        return idFuelType;
    }

    public void setIdFuelType(int idFuelType) {
        this.idFuelType = idFuelType;
    }

    public String getNameFuelType() {
        return nameFuelType;
    }

    public void setNameFuelType(String nameFuelType) {
        this.nameFuelType = nameFuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FuelType fuelType = (FuelType) o;

        if (getIdFuelType() != fuelType.getIdFuelType()) return false;
        return !(getNameFuelType() != null ? !getNameFuelType().equals(fuelType.getNameFuelType()) : fuelType.getNameFuelType() != null);

    }

    @Override
    public int hashCode() {
        int result = getIdFuelType();
        result = 31 * result + (getNameFuelType() != null ? getNameFuelType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "idFuelType=" + idFuelType +
                ", nameFuelType='" + nameFuelType + '\n' +
                '}';
    }
}

