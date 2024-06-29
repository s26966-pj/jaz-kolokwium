package pjatk.jaz_s26966;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.net.ConnectException;

@RestControllerAdvice
public class CurrencyAdvice {
    @ExceptionHandler
    public ResponseEntity<String> handleMovieNotFoundException(HttpClientErrorException.NotFound exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleInternalServerError(HttpClientErrorException.BadRequest exception) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Bad request");
    }
}
