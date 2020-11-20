package utils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30)
    @NotNull
    private String name;

    @Column(length = 30)
    private String city;

    @Column(length = 15)
    @Min(6)
    private String phone;

    /*
    Действует (true) или ликвидирована (false)
     */
    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    public Organization(String name, String city, String phone, Boolean isActive) {
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.isActive = isActive;
        creationDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getActive() {
        return isActive;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(city, that.city) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(isActive, that.isActive) &&
                Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, phone, isActive, creationDate);
    }
}
