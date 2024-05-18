import java.sql.*;

public class UniversityDatabase {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/university";
        String user = "root";
        String password = "APRAJITA@69sit";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Insert data into students table
            insertData(connection, "John Doe", 22);
            insertData(connection, "Jane Smith", 20);

            // Retrieve and print all records from the students table
            retrieveData(connection);

            // Update the age of one student
            updateData(connection, 1, 23);

            // Delete one student from the table
            deleteData(connection, 2);

            // Retrieve and print all records after the update and delete operations
            retrieveData(connection);

            // Close the connection
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Insert data into the students table
    private static void insertData(Connection connection, String name, int age) throws SQLException {
        String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();
        }
    }

    // Retrieve and print all records from the students table
    private static void retrieveData(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM students";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectQuery);
            System.out.println("Student Records:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
            System.out.println();
        }
    }

    // Update the age of one student
    private static void updateData(Connection connection, int studentId, int newAge) throws SQLException {
        String updateQuery = "UPDATE students SET age = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setInt(1, newAge);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();
        }
    }

    // Delete one student from the table
    private static void deleteData(Connection connection, int studentId) throws SQLException {
        String deleteQuery = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();
        }
    }
}

    

