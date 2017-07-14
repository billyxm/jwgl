package jwgl.util;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
  
/** 
 * @author Billy 
 */  
public class DB {  
  
    // 连接实例  
    private static Connection conn = null;  
    static String url = "jdbc:mysql://localhost:3306/jwgl?useUnicode=true&characterEncoding=utf-8";  
    // MySQL用户名  
    static String user = "root";  
    // MySQL密码  
    static String password = "123456";  
  
      
    //获得连接对象  
    public static Connection getConnection() throws ClassNotFoundException, SQLException {  
    	 Class.forName("com.mysql.jdbc.Driver");  
         conn=DriverManager.getConnection(url,user,password);  
        return conn;  
    }  
      
    //关闭连接  
    public static void CloseCon() throws SQLException{  
        conn.close();  
    }  
}  