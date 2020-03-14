import java.sql.*;

public class App {

    public static void main( String[] args ) throws SQLException {
        //create connection for a server installed in localhost, with a user "root" with no password
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/movies_rented_out", "root", "olivepopeyeG20")) {
            
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                
                //execute query
                String strSelect = "SELECT data_movieslist.*, data_user.FULL_NAMES FROM data_movieslist INNER JOIN data_user ON data_movieslist.MEMBERSHIP_ID = data_user.MEMBERSHIP_ID WHERE FULL_NAMES = 'Janet Jones'";
                System.out.println("The SQL statement is: " + strSelect + "\n");
                ResultSet rs = stmt.executeQuery(strSelect);

                // process the resultSet
                System.out.println("Data diambil dari database mariaDB:\n");

                rs.first();
                String FULL_NAMES = rs.getString("FULL_NAMES");
                System.out.println("\t" + FULL_NAMES + " rented: ");

                rs.beforeFirst();
                int i = 0;
                while(rs.next()) { // move the cursor to the next row, return false if no more row
                    String MOVIES_RENTED = rs.getString(2);
                    System.out.println("\t" + (i+1) + ". " + MOVIES_RENTED);
                    i++;
                }
                System.out.println("\n\tJumlah baris = " + i);
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}