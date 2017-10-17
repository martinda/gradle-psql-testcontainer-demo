package ca.martinda
 
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.junit.Rule
import org.junit.Test
import org.testcontainers.containers.PostgreSQLContainer
 
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

import spock.lang.Specification
 
class SimplePostgreSQLTest extends Specification { 
 
    @Rule 
    public PostgreSQLContainer postgres = new PostgreSQLContainer()
 
    @Test 
    def testSimple() {
        given:
        String a = 'a'

        when:
        a += 'a'

        then:
        a == 'aa'
    }
}
