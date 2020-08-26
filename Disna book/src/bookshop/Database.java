/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookshop;
import java.sql.*;


 public class Database {
//    private String name;
    private final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/bookshop1";
    private final String USER = "root";
    private final String PASSWORD ="";
    
   
     
     private Connection cnn = null;
     private Statement stmnt = null;
      static ResultSet rslt = null;
      private final PreparedStatement  pmn=null;
     
     private void setConnection() throws ClassNotFoundException,SQLException{
           Class.forName(JDBC_DRIVER);
           cnn = DriverManager.getConnection(DB_URL , USER,PASSWORD);
     }
     
     public void unsetConnection() throws SQLException {
         cnn.close();
         stmnt.close();
         rslt.close();
     }
     public void sqlInsert(String sqlStatement) throws SQLException,ClassNotFoundException {
              
              setConnection();
              
              stmnt = cnn.createStatement();
              stmnt.executeUpdate(sqlStatement);
              
              unsetConnection();
     }

    /**
     *
     *
     * @param tableName
     * @param 
     
     * @return 
     * @throws SQLException
     * @throws ClassNotFoundException
     */
   public ResultSet  getData(String tableName) throws SQLException, ClassNotFoundException{
        setConnection();
        stmnt = cnn.createStatement();
         rslt = stmnt.executeQuery("SELECT * FROM `"+ tableName+" " );
         return rslt;
         
        
         
         }
             
    }
    
    
    
    
    
    
    
    
    
        
     
 

/**
 *
 * @author Manisha
 */

    

