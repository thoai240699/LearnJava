package ConnDB;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

public class MSSQLServer {
    private final SQLServerDataSource ds;

    public MSSQLServer() {
        ds = new SQLServerDataSource();
        ds.setUser("sa"); // Ensure this is correct
        ds.setPassword("sa"); // Ensure this is correct
        ds.setServerName("thoai\\SQLEXPRESS"); // Ensure this is correct
        ds.setPortNumber(1433); // Ensure this is correct
        ds.setDatabaseName("qlnv"); // Ensure this is correct
    }

    public Connection getConnection() throws SQLServerException {
        System.out.println("Kết nối...");
        Connection connection = ds.getConnection();
        System.out.println("Kết nối thành công.");
        return connection;
    }
}
