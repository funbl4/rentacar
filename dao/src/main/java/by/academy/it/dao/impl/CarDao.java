package by.academy.it.dao.impl;

import by.academy.it.dao.ICarDao;
import by.academy.it.pojo.Car;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao extends BaseDao<Car> implements ICarDao {

    private static Logger log = Logger.getLogger(BaseDao.class);

    @Autowired
    public CarDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}

/*
    private static final String SQL_QUERY_ADD_CAR = "INSERT INTO cars (brand, model, body_style, fuel_type, year, price, description, photo, color) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_QUERY_GET_ALL_CARS = "SELECT id_car, brand, model, name_body_style, fuel_type, year, price, description, photo, color FROM cars, body_styles WHERE cars.body_style = body_styles.id_body_style";
    private static final String SQL_QUERY_GET_CAR_BY_ID = "SELECT id_car, brand, model, name_body_style, fuel_type, year, price, description, photo, color FROM cars, body_styles WHERE cars.body_style = body_styles.id_body_style AND id_car = ?";
    private static final String SQL_QUERY_DELETE_CAR_BY_ID = "DELETE FROM cars WHERE id_car = ?";
    private static final String SQL_QUERY_UPDATE_CAR_BY_ID = "UPDATE cars SET brand = ?, model = ?, body_style = ?, fuel_type = ?, year = ?, price = ?, description = ?, photo = ?, color = ? WHERE id_car = ?";
    private static final String SQL_QUERY_GET_ALL_BODY_STYLE = "SELECT * FROM body_styles";

    private SimpleBasicDataSource dataSource;
    private Logger logger = Logger.getLogger(CarDao.class);
    private Transaction transaction = null;

    public CarDao() {
        dataSource = SimpleBasicDataSource.getInstance();
    }
*/

/*    public List<Car> getCars() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<Car> carList = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_ALL_CARS);
            resultSet = preparedStatement.executeQuery();
            carList = initCars(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return carList;
    }*/

/*    public Car getCarByID(Integer idCar) throws DaoException {
        try{
            Session session = HibernateUtil.getHibernateUtil().getSession();
            transaction = session.beginTransaction();
            String hql = "select U from by.academy.it.pojo.Car U where id=:idCar";
            Query query =session.createQuery(hql);
            query.setParameter("idCar", idCar);
            transaction.commit();
            List result = query.list();
            for (Object car : result) {
                return (Car) car;
            }
        } catch (HibernateException e) {
            logger.error("Error flush person - " + e);
            throw new DaoException(e);
        }
        return null;*/
/*        Car car = new Car();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_CAR_BY_ID);
            preparedStatement.setInt(1, idCar);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                car.setIdCar(resultSet.getInt(1));
                car.setBrand(resultSet.getString(2));
                car.setModel(resultSet.getString(3));
                car.setBodyStyle(resultSet.getString(4));
                car.setFuelType(resultSet.getString(5));
                car.setYear(resultSet.getString(6));
                car.setPrice(resultSet.getInt(7));
                car.setDescription(resultSet.getString(8));
                car.setPhoto(resultSet.getString(9));
                car.setColor(resultSet.getString(10));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return car;*/

/*    public boolean deleteCar(Integer idCar) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean flag = false;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_DELETE_CAR_BY_ID);
            preparedStatement.setInt(1, idCar);
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement);
        }
        return flag;
    }*/

/*    public void updateCar(Car car) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_UPDATE_CAR_BY_ID);
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setString(2, car.getModel());
            //preparedStatement.setString(3, car.getBodyStyle());
            preparedStatement.setString(4, car.getFuelType());
            preparedStatement.setString(5, car.getYear());
            preparedStatement.setInt(6, car.getPrice());
            preparedStatement.setString(7, car.getDescription());
            preparedStatement.setString(8, car.getPhoto());
            preparedStatement.setString(9, car.getColor());
            preparedStatement.setInt(10, car.getIdCar());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement);
        }
    }*/

/*    public List<BodyStyle> getBodyStyles() {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        List<BodyStyle> bodyStyleList = null;
        try {
            connection = dataSource.getConnection();
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_ALL_BODY_STYLE);
            resultSet = preparedStatement.executeQuery();
            bodyStyleList = initBodyStyles(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            UtilsDB.closeDBConnection(connection, preparedStatement, resultSet);
        }
        return bodyStyleList;
    }

    private List<BodyStyle> initBodyStyles(ResultSet resultSet) throws SQLException {
        List<BodyStyle> bodyStyleList = new ArrayList<BodyStyle>();
        while (resultSet.next()) {
            BodyStyle bodyStyle = new BodyStyle();
            bodyStyle.setIdBodyStyle(resultSet.getInt(1));
            bodyStyle.setNameBodyStyle(resultSet.getString(2));
            bodyStyleList.add(bodyStyle);
        }
        return bodyStyleList;
    }*/

//    public void addCar(Car car) {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            Session session = HibernateUtil.getHibernateUtil().getSession();
//            session.saveOrUpdate(car);
////            connection = dataSource.getConnection();
//
////            preparedStatement = connection.prepareStatement(SQL_QUERY_ADD_CAR);
////            preparedStatement.setString(1, car.getBrand());
////            preparedStatement.setString(2, car.getModel());
////           // preparedStatement.setString(3, car.getBodyStyle());
////            preparedStatement.setString(4, car.getFuelType());
////            preparedStatement.setString(5, car.getYear());
////            preparedStatement.setInt(6, car.getPrice());
////            preparedStatement.setString(7, car.getDescription());
////            preparedStatement.setString(8, car.getPhoto());
////            preparedStatement.setString(9, car.getColor());
////            preparedStatement.executeUpdate();
//        } finally {
//            UtilsDB.closeDBConnection(connection, preparedStatement);
//        }
//    }

/*    private List<Car> initCars(ResultSet resultSet) throws SQLException {
        List<Car> carList = new ArrayList<Car>();
        while (resultSet.next()) {
            Car car = new Car();
            car.setIdCar(resultSet.getInt(1));
            car.setBrand(resultSet.getString(2));
            car.setModel(resultSet.getString(3));
           // car.setBodyStyle(resultSet.getString(4));
            car.setFuelType(resultSet.getString(5));
            car.setYear(resultSet.getString(6));
            car.setPrice(resultSet.getInt(7));
            car.setDescription(resultSet.getString(8));
            car.setPhoto(resultSet.getString(9));
            car.setColor(resultSet.getString(10));
            carList.add(car);
        }
        return carList;
    }*/