import java.util.List;

public interface CityDAO {
    void createCity(City city);

    void deleteCityById(City city);

    City getCityById(int cityId);

    List<City> getAllCity();

    void correctiveCityById(City city);


}
