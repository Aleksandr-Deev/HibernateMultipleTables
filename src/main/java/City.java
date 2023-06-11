import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityId;
    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Employee> employeeList;

    public City() {
    }
    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public City(int cityId, String cityName, List<Employee> employeeList) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.employeeList = employeeList;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String city_name) {
        this.cityName = city_name;
    }
}
