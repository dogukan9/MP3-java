
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doğukan
 */
public class Database {
       private String kul_adı="root";
    private String parola="";
    private String db_isim="mp";
    private String host="localhost";
    private int port=3306;
    private String name="";
    private  Statement statement=null;
private  Connection con=null;
private  PreparedStatement preparedStatement=null;
public ArrayList<Yardımcı> showme(){
    ArrayList<Yardımcı> help=new ArrayList<Yardımcı>();
     String sorgu="Select *From favori";
           try {
               statement=con.createStatement();
               ResultSet rs=statement.executeQuery(sorgu);
               while(rs.next()){
                   String ad=rs.getString("ad");
                   int id=rs.getInt("id");
                  help.add(new Yardımcı(ad,id));
               }
               return help;
           } catch (SQLException ex) {
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
               return  null;
           }
    
    
    
} 
public String eklefav(int id){
  
         String sorgu="Select * From mp3 where id=?";
           try {
               preparedStatement=con.prepareStatement(sorgu);
               preparedStatement.setInt(1,id);
    ResultSet rs=preparedStatement.executeQuery();
               while (rs.next()) {
                   name=rs.getString("ad");
                   
               }
               return  name;
                 
                   
               }
         
           catch (SQLException ex) {
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
              return null;
           }
      
    
}
public void sil(int id){
    String sorgu="Delete From mp3 where id=?";
           try {
               preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
                     preparedStatement.executeUpdate();
           } catch (SQLException ex) {
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           }
    
}
public void sil2(int id){
    String sorgu="Delete From favori where id=?";
           try {
               preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
                     preparedStatement.executeUpdate();
           } catch (SQLException ex) {
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           }
    
}

public ArrayList<Yardımcı> gitgetir(){
    ArrayList<Yardımcı> help=new ArrayList<Yardımcı> ();
    String sorgu="Select *From mp3";
           try {
               statement=con.createStatement();
               ResultSet rs=statement.executeQuery(sorgu);
               while(rs.next()){
                   String ad=rs.getString("ad");
                   int id=rs.getInt("id");
                   help.add(new Yardımcı(ad,id));
               }
               return help;
           } catch (SQLException ex) {
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
               return  null;
           }
    
    
}
    public  void Ekle(String ad) {
        String sorgu="Insert Into mp3 (ad) VALUES (?)";
           try {
               preparedStatement=con.prepareStatement(sorgu);
               preparedStatement.setString(1, ad);
               preparedStatement.executeUpdate();
           } catch (SQLException ex) {
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           }
        
       
    }
     public  void ekle2(String ad) {
        String sorgu="Insert Into favori (ad) VALUES (?)";
           try {
               preparedStatement=con.prepareStatement(sorgu);
               preparedStatement.setString(1, ad);
               preparedStatement.executeUpdate();
           } catch (SQLException ex) {
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           }
        
       
    }

    public Database() {String url="jdbc:mysql://"+host+":"+port+"/"+db_isim+"?useUnicode=true&characterEncoding=utf8";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con=(Connection) DriverManager.getConnection(url,kul_adı, parola);
            System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlanti başarısız");
        }
    }

    
}
