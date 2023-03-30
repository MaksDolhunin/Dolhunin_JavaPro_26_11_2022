package com.hillel.dolhunin.homework.homework22;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) throws SQLException {

        DataBaseConnection dataBaseConnection = new DataBaseConnection();

        LessonDao lessonDao = new LessonDao(dataBaseConnection);

        lessonDao.lessonAdd("Math", Date.valueOf(LocalDate.of(2023, 03, 22)), 4);

        lessonDao.lessonDelete(1);

        lessonDao.getAllLesson();

        lessonDao.getLessonFromId(1);
    }
}
