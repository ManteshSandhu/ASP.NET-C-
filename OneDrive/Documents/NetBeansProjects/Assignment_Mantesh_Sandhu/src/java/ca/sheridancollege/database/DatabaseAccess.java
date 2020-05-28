/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.Book;
import static java.lang.System.out;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author SandhuM
 */
public class DatabaseAccess {
    
   
    
    public void addBookDavis(Book b) {
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="INSERT INTO daviscampus (title,author,price,inventory,courses) "
                        + "VALUES(?,?,?,?,?)";
                       
                       
            PreparedStatement ps= con.prepareStatement(query);
                       
                       ps.setString(1,b.getTitle());
                       ps.setString(2,b.getAuthor());
                       ps.setDouble(3,b.getPrice());
                       ps.setInt(4,b.getInventory());
                       ps.setString(5,b.getCourses());
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                con.close();
                 
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
    }
    public void addBookTraf(Book b) {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                Statement st = cn.createStatement();
                String query="INSERT INTO trafalgarcampus (title,author,price,inventory,courses) "
                        + "VALUES(?,?,?,?,?)";
                       
                       
            PreparedStatement ps= cn.prepareStatement(query);
                       
                       ps.setString(1,b.getTitle());
                       ps.setString(2,b.getAuthor());
                       ps.setDouble(3,b.getPrice());
                       ps.setInt(4,b.getInventory());
                       ps.setString(5,b.getCourses());
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                cn.close();
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
    }
    public void addBookHazel(Book b) {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                Statement st = cn.createStatement();
                String query="insert into hazelmacallioncampus (title,author,price,inventory,courses) "
                        + "VALUES(?,?,?,?,?)";
                       
                       
            PreparedStatement ps= cn.prepareStatement(query);
                       
                       ps.setString(1,b.getTitle());
                       ps.setString(2,b.getAuthor());
                       ps.setDouble(3,b.getPrice());
                       ps.setInt(4,b.getInventory());
                       ps.setString(5,b.getCourses());
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                cn.close();
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
    }
    
    public ArrayList<Book> getBooksDavis(){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM daviscampus";
                Statement st= con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                }
                
             
                con.close();
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
     public ArrayList<Book> getBooksHazel(){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM hazelmacallioncampus";
                Statement st= con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                }
                
             
                con.close();
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
      public ArrayList<Book> getBooksTraf(){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM trafalgarcampus";
                Statement st= con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                }
                
             
                con.close();
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
      
      public void generateDummy(){
           try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="INSERT INTO daviscampus (title,author,price,inventory,courses) "
                        + "VALUES('Arabian nights','Muhsin Mahdi',19.99,10,'Arts,History'),"
                        + "('Absalom, Absalom!','William Faulkner',19.99,5,'Arts,History'),"
                        + "('Human Diseases','Neighbors',177.50,5,'Anat7001'),"
                        + "('Computer Analysis','Robert Mogambe',129.99,12,'PCOMP,SYST14524'),"
                        + "('Systems Design','Jana Farrow',89.99,5,'SYST12837, SYST13494'),"
                        + "('Java Fundamentals','Jacob Neilson',99.99,25,'JAVA13429, PGROM12344'),"
                        + "('Basics of Basic','John Algorithm',89.99,15,'BAS13293 ,PGOMP243456'),"
                        + "('Modulas Mathematics','Sunita Ram',99.99,15,'MATH23855 ,BMAT12456'),"
                        + "('Geometery is King','Sunita Ram- Bob Wooslon',129.99,6,'MATH23855 ,BMAT12456'),"
                        + "('King Kong Bundy','Oscar Ramses',39.99,5,'Arts, Literature'),"
                        + "('Titanic','James Cameron',19.99,15,'Arts, Film history'),"
                        + "('Advanced Java','Monty Ahuja',139.99,24,'PCOMP14563,JAV23534'),"
                        + "('OSHO is Not God','Bhagwaan Rajneesh',39.99,14,'SPIRT14435,MYTH98489'),"
                        + "('Absolute Programming','Bosco Ceasar',89.99,19,'SYST12405, MCQ39823'),"
                        + "('Python Fundamentas','Jacob Junior',129.99,26,'SYST13417, PROG12940, PROG23830'),"
                        + "('Ruby Fudamentals','Pablo Programmer',79.99,17,'PROG87349,PROG98932'),"
                        + "('Business Leadership','Donald Trump',89.99,105,'BUS12983, BUS23940, BMAT83933'),"
                        + "('Marketing Fundamentals','Ivanka Trump',99.99,85,'MKTG18944, MKTG91203'),"
                        + "('Business Mathematic','Ravindra Goswami',109.99,5,'BMAT18279, BMAT100, BMAT200'),"
                        + "('Ted Bundy','Oscar Delagama',79.99,5,'CRIM12940, HIST83793'),"
                        + "('Media Marketing ','Mediacre Singh',79.99,15,'MED12984, MKTG1287'),"
                        + "('Jack Ryan','Tom Clancy',29.99,5,'FILM12934, FICT92380'),"
                        + "('Lord of the Rings','RR tolkein',19.99,35,'FILM12983,WRIT93945, ART34562'),"
                        + "('Programming With Mantesh','Mantesh Sandhu',179.99,1,'PGOMP42554, PROG32983'),"
                        + "('Fundamentals of Relationships','Donald Singh',19.99,35,'FAM493843, MIN39283, PGOM32345'),"
                        + "('Johnny Gaddar','Dharmendra Singh',19.99,25,'FILM392889, FICT92830, MEDIA29380'),"
                        + "('Life of a Priest','Preet Singh',39.99,4,'CHRIT2938, HOL93849'),"
                        +"('Hardware and Networking','Ganju Ramayan',89.99,25,'PROG39802, PCOMP32255,IMDB30546'),"
                         +"('GODZILLA','RR martin',12.88,15,'FICT92302, WRIT92380,FILM39287'),"
                         +"('Mythologies of Subcontinent','Keshav Kumar',19.99,15,'FICT29383, MYYTH92130, MOTH30923'),"
                         +"('Complex Prgramming','Don John',129.99,9,'PCOMP23902, PGMOP98023,PGRO32900')"
                        
                        ;
                 String query1="INSERT INTO hazelmacallioncampus (title,author,price,inventory,courses) "
                        + "VALUES('Java Language','Muhsin Mahdi',89.99,10,'PCOM93289, POMP2938'),"
                        + "('Absalom, Absalom!','William Faulkner',19.99,15,'Arts,History'),"
                        + "('Human Diseases','Neighbors',177.50,8,'Anat7001'),"
                        + "('Computer Analysis','Robert Mogambe',129.99,10,'PCOMP,SYST14524'),"
                        + "('Systems Design Basics','John Farrow',89.99,8,'SYST12837, SYST13494'),"
                        + "('Java Fundamentals with ease','Jacob John',99.99,15,'JAVA13429, PGROM12344'),"
                        + "('Basics of Basic','John Algorithm',89.99,5,'BAS13293 ,PGOMP243456'),"
                        + "('Mathematics with Accounting','Bob Ram',99.99,14,'MATH23855 ,BMAT12456'),"
                        + "('Geometery is King','Sunita Ram- Bob Wooslon',129.99,6,'MATH23855 ,BMAT12456'),"
                        + "('R. Bundy','Oscar Ramses',29.99,5,'Arts, Literature'),"
                        + "('Terminator','James Cameron',19.99,15,'Arts, Film history'),"
                        + "('Super Advanced Java','Montu Ahuj',119.99,4,'PCOMP14563,JAV23534'),"
                        + "('Bhagwaan','Bhagwaan Rajneesh',39.99,4,'SPIRT14435,MYTH98489'),"
                        + "('Absolute Technology','Bosco Ceasar',89.99,19,'SYST12405, MCQ39823'),"
                        + "('Python Fundamentas','Jacob Junior',129.99,26,'SYST13417, PROG12940, PROG23830'),"
                        + "('Ruby on Rails','Pablo Proshotam',79.99,7,'PROG87349,PROG98932'),"
                        + "('Business Leadership','Donald Trump',89.99,10,'BUS12983, BUS23940, BMAT83933'),"
                        + "('Marketing Basic','Donald Trump',99.99,45,'MKTG18944, MKTG91203'),"
                        + "('Business Goals','Ravindra Goswami',99.99,15,'BMAT18279, BMAT100, BMAT200'),"
                        + "('Life of a Saint','Oscar Delagama',79.99,15,'CRIM12940, HIST83793'),"
                        + "('Media Marketing ','Mediacre Singh',79.99,10,'MED12984, MKTG1287'),"
                        + "('Jack Reacher','Tom Cruise',29.99,9,'FILM12934, FICT92380'),"
                        + "('Science Fiction Writing','Andrews Jeff',19.99,35,'FILM12983,WRIT93945, ART34562'),"
                        + "('Programming With Mantesh','Mantesh Sandhu',179.99,1,'PGOMP42554, PROG32983'),"
                        + "('Fundamentals of Relationships','Donald Singh',19.99,35,'FAM493843, MIN39283, PGOM32345'),"
                        + "('Java vs Python','Dharmendra Singh',109.99,23,'PCOM32984,POMP3948,PROG2398,PROF09239'),"
                        + "('Life of a Priest','Preet Singh',39.99,4,'CHRIT2938, HOL93849'),"
                        +"('Hardware and Networking','Ganju Ramayan',89.99,25,'PROG39802, PCOMP32255,IMDB30546'),"
                         +"('Maharbharta','RR martin',12.88,15,'FICT92302, WRIT92380,FILM39287'),"
                         +"('Mythologies of Subcontinent','Keshav Kumar',19.99,15,'FICT29383, MYYTH92130, MOTH30923'),"
                         +"('Advanced Fundamentals of Programming','Dobson Ethan',129.99,19,'PCOMP23902, PGMOP98023,PGRO32900')"
                        
                        ;
                  String query2="INSERT INTO trafalgarcampus (title,author,price,inventory,courses) "
                        + "VALUES('The Prophet','Muhsin Mahdi',19.99,10,'Arts,History'),"
                        + "('Java vs Python','William Faulkner',109.99,5,'PCOM3244,PROG9183,POG92834'),"
                        + "('Human Genome','Neighbors',177.50,5,'Anat7001'),"
                        + "('Computer Design','Robert Mogambe',129.99,12,'PCOMP,SYST14524'),"
                        + "('Analysis and Design Basics','Jane Awsome',89.99,9,'SYST12837, SYST13494'),"
                        + "('Python Fundamentals','Jacob Neilson',99.99,34,'JAVA13429, PGROM12344'),"
                        + "('Basics of Ruby','John Algorithm',89.99,5,'BAS13293 ,PGOMP243456'),"
                        + "('Financial Mathematics','Sunita Ram',99.99,30,'MATH23855 ,BMAT12456'),"
                        + "('Business Mathematics','Sunita Ram- Bob Wooslon',129.99,12,'MATH23855 ,BMAT12456'),"
                        + "('Lost World','Oscar Ramses',39.99,54,'Arts, Literature'),"
                        + "('Avatar','James Cameron',19.99,7,'Arts, Film history'),"
                        + "('Programming with Java','Monty Ahuja',139.99,8,'PCOMP14563,JAV23534'),"
                        + "('Spiritual Intensity','Bhagwaan Rajneesh',39.99,2,'SPIRT14435,MYTH98489'),"
                        + "('Easy Programming','Bosco Ceasar',89.99,19,'SYST12405, MCQ39823'),"
                        + "('Ruby Fundamentas','Jacob Junior',129.99,18,'SYST13417, PROG12940, PROG23830'),"
                        + "('Languages for Coding','Pablo Programmer',79.99,83,'PROG87349,PROG98932'),"
                        + "('Business Leadership','Donald Trump',89.99,34,'BUS12983, BUS23940, BMAT83933'),"
                        + "('Marketing Fundamentals','Ivanka Trump',99.99,2,'MKTG18944, MKTG91203'),"
                        + "('Business Entrepreneurship','Ravindra Goswami',109.99,56,'BMAT18279, BMAT100, BMAT200'),"
                        + "('Life of Pi','Oscar Delagama',79.99,6,'CRIM12940, HIST83793'),"
                        + "('Advanced Marketing ','Mediacre Singh',79.99,10,'MED12984, MKTG1287'),"
                        + "('Life of a freedom fighter','Tom Clancy',29.99,21,'FILM12934, FICT92380'),"
                        + "('Lord of the Rings','RR tolkein',19.99,12,'FILM12983,WRIT93945, ART34562'),"
                        + "('Programming With Mantesh','Mantesh Sandhu',179.99,4,'PGOMP42554, PROG32983'),"
                        + "('Fundamentals of Karma','Donald David',19.99,15,'FAM493843, MIN39283, PGOM32345'),"
                        + "('Astronomy','Dharmendra Singh',19.99,15,'FILM392889, FICT92830, MEDIA29380'),"
                        + "('Free World Rights','Preet Singh',39.99,7,'CHRIT2938, HOL93849'),"
                        +"('Hardware and Networking','Ganju Ramayan',89.99,19,'PROG39802, PCOMP32255,IMDB30546'),"
                         +"('Fiction and Writing','RR Lucas',12.88,18,'FICT92302, WRIT92380,FILM39287'),"
                         +"('Mythologies of Subcontinent','Keshav Kumar',19.99,12,'FICT29383, MYYTH92130, MOTH30923'),"
                         +"('Programming Logic','Matt henry',129.99,19,'PCOMP23902, PGMOP98023,PGRO32900')"
                        
                        ;
                st.executeUpdate(query);
                st.executeUpdate(query1);
                st.executeUpdate(query2);
                
          con.close();
      }
           catch(Exception e){
                System.out.println(e);
                
            }
           
}
      public void deleteBookDavis(int id){
          
         try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                Statement sqlStatement = con.createStatement();
                String q= "select id from daviscampus where id="+id+"";
                 sqlStatement.execute(q);
                
                       
                      ResultSet rs = sqlStatement.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
               
                String query= "DELETE from daviscampus where id=?";
                        PreparedStatement ps1= con.prepareStatement(query);
                       
                       ps1.setInt(1,id);
                        ps1.executeUpdate();
              JOptionPane.showMessageDialog(null, "Book Successfully deleted");
                 con.close();
                      }
          
                      
                        else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
}catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error:" + e);
}
}
      public void deleteBookHazel(int id){
     try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                Statement sqlStatement = con.createStatement();
                String q= "select id from hazelmacallioncampus where id="+id+"";
                 sqlStatement.execute(q);
                
                       
                      ResultSet rs = sqlStatement.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
               
                String query= "DELETE from hazelmacallioncampus where id=?";
                        PreparedStatement ps1= con.prepareStatement(query);
                       
                       ps1.setInt(1,id);
                        ps1.executeUpdate();
             JOptionPane.showMessageDialog(null, "Book Successfully deleted");
                 con.close();
                      }
          
                      
                        else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
}catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error:" + e);
}
}
      public void deleteBookTraf(int id){
          
         try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                Statement sqlStatement = con.createStatement();
                String q= "select id from Trafalgarcampus where id="+id+"";
                 sqlStatement.execute(q);
                
                       
                      ResultSet rs = sqlStatement.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
               
                String query= "DELETE from trafalgarcampus where id=?";
                        PreparedStatement ps1= con.prepareStatement(query);
                       
                       ps1.setInt(1,id);
                        ps1.executeUpdate();
             JOptionPane.showMessageDialog(null, "Book Successfully deleted");
                 con.close();
                      }
          
                      
                        else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
}catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error:" + e);
}
      }
public ArrayList editBook(int id){
     ArrayList<Book> books = new ArrayList<Book>();
    try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query= "SELECT * from daviscampus where id="+id+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                          
                         ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
                
                    
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book book= new Book(id,title,author,price,inventory,courses);
                   books.add(book);
                   
                 con.close();
          
      }
            
            
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}}
           catch(Exception e){
                System.out.println(e);
                
            }
    return books;}
        

public void UpdateBookDavis(Book b) {
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="UPDATE daviscampus  SET title=? ,author=?,"
                        + "price=?,inventory=?,courses=? WHERE id =?";
                       
                       
            PreparedStatement ps= con.prepareStatement(query);
                       
                       ps.setString(1,b.getTitle());
                       ps.setString(2,b.getAuthor());
                       ps.setDouble(3,b.getPrice());
                       ps.setInt(4,b.getInventory());
                       ps.setString(5,b.getCourses());
                       ps.setInt(6,b.getID());
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                con.close();
                 
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
    }
public ArrayList editBookHazel(int id){
     ArrayList<Book> books = new ArrayList<Book>();
    try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query= "SELECT * from hazelmacallioncampus where id="+id+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                          
                         ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
                
                    
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book book= new Book(id,title,author,price,inventory,courses);
                   books.add(book);
                 con.close();
          
      }
            
            
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}}
           catch(Exception e){
                System.out.println(e);
                
            }
    return books;}
        

public void UpdateBookHazel(Book b) {
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="UPDATE hazelmacallioncampus  SET title=? ,author=?,"
                        + "price=?,inventory=?,courses=? WHERE id =?";
                       
                       
            PreparedStatement ps= con.prepareStatement(query);
                       
                       ps.setString(1,b.getTitle());
                       ps.setString(2,b.getAuthor());
                       ps.setDouble(3,b.getPrice());
                       ps.setInt(4,b.getInventory());
                       ps.setString(5,b.getCourses());
                       ps.setInt(6,b.getID());
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                con.close();
                 
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
    }public ArrayList editBookTraf(int id){
     ArrayList<Book> books = new ArrayList<Book>();
    try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query= "SELECT * from trafalgarcampus where id="+id+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                          
                         ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
                
                    
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book book= new Book(id,title,author,price,inventory,courses);
                   books.add(book);
                 con.close();
          
      }
            
            
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}}
           catch(Exception e){
                System.out.println(e);
                
            }
    return books;}
        

public void UpdateBookTraf(Book b) {
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="UPDATE trafalgarcampus  SET title=? ,author=?,"
                        + "price=?,inventory=?,courses=? WHERE id =?";
                       
                       
            PreparedStatement ps= con.prepareStatement(query);
                       
                       ps.setString(1,b.getTitle());
                       ps.setString(2,b.getAuthor());
                       ps.setDouble(3,b.getPrice());
                       ps.setInt(4,b.getInventory());
                       ps.setString(5,b.getCourses());
                       ps.setInt(6,b.getID());
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                con.close();
                 
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
    }
public ArrayList PurchaseBook(int id){
     ArrayList<Book> books = new ArrayList<Book>();
    try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query= "SELECT * from daviscampus where id="+id+"";
               
                Statement st= con.createStatement();
                st.executeQuery(query);
                
                          
                         ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
                
                  
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book book= new Book(id,title,author,price,inventory,courses);
                   books.add(book);
                 con.close();
          
      }
            
            
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID  exists " +
                            "in the database");
        
                    
}}
           catch(Exception e){
                System.out.println(e);
                
            }
    return books;}

        public void Complete(int id,int q) {
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="UPDATE daviscampus  SET inventory=? WHERE id =?";
                       
                       
            PreparedStatement ps= con.prepareStatement(query);
                       
                       ps.setInt(1,q);
                       ps.setInt(2,id);
                       
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                con.close();
                 
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
        }
public ArrayList PurchaseBookHazel(int id){
     ArrayList<Book> books = new ArrayList<Book>();
    try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query= "SELECT * from hazelmacallioncampus where id="+id+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                          
                         ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
                
                    
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book book= new Book(id,title,author,price,inventory,courses);
                   books.add(book);
                 con.close();
          
      }
            
            
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}}
           catch(Exception e){
                System.out.println(e);
                
            }
    return books;}
public void CompleteHazel(int id,int q) {
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="UPDATE hazelmacallioncampus  SET inventory=? WHERE id =?";
                       
                       
            PreparedStatement ps= con.prepareStatement(query);
                       
                       ps.setInt(1,q);
                       ps.setInt(2,id);
                       
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                con.close();
                 
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
        }
public ArrayList PurchaseBookTraf(int id){
     ArrayList<Book> books = new ArrayList<Book>();
    try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query= "SELECT * from trafalgarcampus where id="+id+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                          
                         ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
                
                    
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book book= new Book(id,title,author,price,inventory,courses);
                   books.add(book);
                 con.close();
          
      }
            
            
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists" +
                            "in the database");
                       
                    
}}
           catch(Exception e){
                System.out.println(e);
                
            }
    return books;}
public void CompleteTraf(int id,int q) {
        try{
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root","root");
                
                Statement st = con.createStatement();
                
                String query="UPDATE trafalgarcampus  SET inventory=? WHERE id =?";
                       
                       
            PreparedStatement ps= con.prepareStatement(query);
                       
                       ps.setInt(1,q);
                       ps.setInt(2,id);
                       
                //st.executeQuery(query); 
               
               
                ps.executeUpdate();
             
                con.close();
                 
            
} catch(Exception e){
    System.out.println("Connection failed");
    System.out.println(e);
}
        }
public ArrayList<Book> searchBook(String option ,int val){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM daviscampus WHERE "+option+"="+val+"";
                Statement st= con.createStatement();
                 st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
               
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
               
                
             
                con.close();}
                      
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
public ArrayList<Book> searchBook2(String option ,String val){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM daviscampus WHERE "+option+" like '%"+val+"%'";
                Statement st= con.createStatement();
                st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
             while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
             }
             
                con.close();}
                       
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
public ArrayList<Book> searchBook3(int val1, int val2){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM daviscampus WHERE inventory between "+val1+" AND "+val2+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
             while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                }
                
             
                con.close();}
                         
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}

            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
public ArrayList<Book> searchBookHaz(String option ,int val){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM hazelmacallioncampus WHERE "+option+" like "+val+"";
                Statement st= con.createStatement();
               st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
            
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                
                
             
                con.close();}
                       else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
                      
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
public ArrayList<Book> searchBookHaz2(String option ,String val){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM hazelmacallioncampus WHERE "+option+" like '%"+val+"%'";
                Statement st= con.createStatement();
                st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
             while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                }
                
             
                con.close();}
            
             else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}}
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
public ArrayList<Book> searchBookHaz3(int val1, int val2){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM hazelmacallioncampus WHERE inventory between "+val1+" AND "+val2+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
             while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                }
                
             
                con.close();}
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }public ArrayList<Book> searchBookTraf(String option ,int val){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM trafalgarcampus WHERE "+option+" like "+val+"";
                Statement st= con.createStatement();
               st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
            
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                
                
           
                con.close();}
            else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
public ArrayList<Book> searchBookTraf2(String option ,String val){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM trafalgarcampus WHERE "+option+" like '%"+val+"%'";
                Statement st= con.createStatement();
                st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
             while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
                }
                
             
                con.close();}
                      else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}
            }
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
public ArrayList<Book> searchBookTraf3(int val1, int val2){
        ArrayList<Book> books = new ArrayList<Book>();
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost/bookstore","root", "root");
                
                String query = "SELECT * FROM trafalgarcampus WHERE inventory between "+val1+" AND "+val2+"";
                Statement st= con.createStatement();
                st.executeQuery(query);
                 ResultSet rs = st.getResultSet();
                      boolean recordFound = rs.next();
                   
                      if (recordFound){
                    while(rs.next()){
                    int id=rs.getInt(1);
                   String title= rs.getString(2);
                   String author= rs.getString(3);
                   double price= rs.getDouble(4);
                   int inventory=rs.getInt(5);
                   String courses=rs.getString(6);
                   
                   
                   Book b= new Book(id,title,author,price,inventory,courses);
                   books.add(b);
                   
             }
                
             
                con.close();}
            
            else {
                    JOptionPane.showMessageDialog(null, "No Book with that ID exists " +
                            "in the database");
        
                    
}}
            catch(Exception e){
                System.out.println(e);
                
            }
        return books;
    }
}


