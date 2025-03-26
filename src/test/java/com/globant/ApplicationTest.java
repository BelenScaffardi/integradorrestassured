package com.globant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static io.restassured.RestAssured.*;

public class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void verificaConexion() {
        given().when().get("https://67e487d02ae442db76d4b3ea.mockapi.io/api/v1/usuarios")
                .then().statusCode(200).log().body();

    }

    @Test
    public void eliminarDatos(){
        given().when().delete("https://67e487d02ae442db76d4b3ea.mockapi.io/api/v1/usuarios")
        .then().statusCode(200);

       verificaConexion();
    }

}
