package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    public void serialize() throws JsonProcessingException {
        BeerDto dto = this.getDto();
        System.out.println(mapper.writeValueAsString(dto));
    }

    @Test
    public void deserialize() throws IOException {
        String json ="{\"id\":\"4329859e-32a4-49be-bb20-eb0007b34636\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2019-11-12T09:39:58.849446+01:00\",\"lastUpdatedDate\":\"2019-11-12T09:39:58.850605+01:00\"}\n";
        System.out.println(mapper.readValue(json, BeerDto.class));
    }
}