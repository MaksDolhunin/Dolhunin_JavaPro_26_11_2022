package com.hillel.dolhunin.homework.homework22;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LessonDao {

    private final DataBaseConnection dataBaseConnection;

    public LessonDao(DataBaseConnection dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }

    private final static String SQL_QUERY = " select *, a.id as a_id, a.name as a_name, a.description as a_description " +
            "from world.lessons as u join world.homework as a on a.id = u.homework_id; ";
    private final static String INSERT_SQL = "insert into world.lessons (name, updatedAt, homework_id) values (?, ?, ?)";
    private final static String DELETE_SQL = "delete from world.lessons where id = ?";
    private final static String FIND_SQL = "select u.*, a.id as a_id, a.name as a_name, a.description as a_description " +
            "from world.lessons as u join world.homework as a on a.id = u.homework_id where u.id = ? ";

    public Lesson getLesson(ResultSet resultSet) throws SQLException {

        Lesson lessons = new Lesson();
        lessons.setId(resultSet.getInt("id"));
        lessons.setName(resultSet.getString("name"));
        Homework homework = new Homework();
        homework.setId(resultSet.getInt("a_id"));
        homework.setName(resultSet.getString("a_name"));
        homework.setDescription(resultSet.getString("a_description"));
        lessons.setHomework(homework);
        return lessons;

    }

    public void lessonAdd(String name, Date date, int id) throws SQLException {

        try {
            Connection connection = dataBaseConnection.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
                preparedStatement.setString(1, name);
                preparedStatement.setDate(2, date);
                preparedStatement.setInt(3, id);
                int rows = preparedStatement.executeUpdate();
            }
        } finally {
            dataBaseConnection.close();
        }
    }

    public void lessonDelete(int id) throws SQLException {

        try {
            Connection connection = dataBaseConnection.getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL)) {
                preparedStatement.setInt(1, id);
                int rows = preparedStatement.executeUpdate();
            }
        } finally {
            dataBaseConnection.close();
        }

    }

    public List<Lesson> getAllLesson() throws SQLException {
        List<Lesson> lessonList = new ArrayList<>();
        try (Statement statement = dataBaseConnection.getConnection().createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(SQL_QUERY)) {
                while (resultSet.next()) {
                    lessonList.add(getLesson(resultSet));
                }
            }
        }
        return lessonList;
    }

    public Optional<Lesson> getLessonFromId(int id) throws SQLException {

        try (Connection connection = dataBaseConnection.getConnection()) {
            try(PreparedStatement preparedStatement = connection.prepareStatement(FIND_SQL)) {
                preparedStatement.setInt(1, id);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return Optional.empty();
                    }
                    return Optional.of(getLesson(resultSet));
                }
            }
        }

    }
}
