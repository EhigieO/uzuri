package com.inclutab.uzuri;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class UzuriApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
    }

    public void connectionToDatabase() {
        String url = "jdbc:mysql//localhost.3306/lms_db";
        String userName = "lms_user/";
        String password = "my123";
        assertThat(dataSource).isNotNull();
        log.info("Datasource properties ->{}", dataSource);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            assertThat(connection).isNotNull();
        } catch (SQLException e) {
            log.info("An exception occured -> {}", e.getMessage());
        }
    }

}
