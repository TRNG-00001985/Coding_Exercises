import java.sql.*;
public class DemoJDBC{
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
         */
        int sno = 6;
        int marks = 92;
        String name = "Vijay";


        String url = "jdbc:postgresql://localhost:5432/demo-post";
        String uname = "postgres";
        String pass = "Ksuneel143@";
        String sql = "insert into student values (?,?,?)";

       // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        PreparedStatement st = con.prepareStatement(sql);

        st.setInt(1,sno);
        st.setInt(2,marks);
        st.setString(3,name);
        st.execute();


      //  ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("name");
//        System.out.println("Name of the Student:"+name);
//        while(rs.next()){
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getInt(2)+" - ");
//            System.out.println(rs.getString(3));
//        }

        con.close();
        System.out.println("Connection closed");
    }
}