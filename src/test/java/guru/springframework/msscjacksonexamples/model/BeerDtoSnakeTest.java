package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles("snake")
@JsonTest
class BeerDtoSnakeTest extends  BaseTest{

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto = this.getDto();

        System.out.println(mapper.writeValueAsString(dto));
    }
}