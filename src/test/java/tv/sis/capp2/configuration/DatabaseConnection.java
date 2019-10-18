package tv.sis.capp2.configuration;

import org.apache.commons.dbcp2.BasicDataSource;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) throws SQLException {

        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setDriverClassName("oracle.jdbc.OracleDriver");
        basicDataSource.setUrl("jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=slqv-spd-dbase5.sis.tv)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=SDSQA)))");
        basicDataSource.setUsername("sds");
        basicDataSource.setPassword("p0rp0ise");

        Connection connection = basicDataSource.getConnection();

        deleteNoClose(connection, new BigDecimal(1578866));

        //connection.commit();
        connection.close();
        basicDataSource.close();

    }
    public static void deleteNoClose(Connection conn, BigDecimal id) throws SQLException {

        String sql = "DELETE FROM MEETING WHERE ID = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setBigDecimal(1, id);
            ps.executeUpdate();

            System.out.println("Meeting id:{} was removed: " + id);
        } finally {
            try {if (ps != null) {ps.close();}
            } catch (SQLException e) {}
        }

    }

}
