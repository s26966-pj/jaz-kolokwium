package pjatk.jaz_s26966;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Request {
    @Schema(description = "Id zapytania")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Schema(description = "Kod waluty")

    private String code;
    @Schema(description = "Początek zakresu daty")

    private LocalDate start;
    @Schema(description = "Konuec zakresu daty")
    private LocalDate end;

    @Schema(description = "Średni kurs waluty w zakresie dat")
    private Float value;
    @Schema(description = "Data wykonania zapytania")
    private LocalDateTime date;

    public Request(String code, LocalDate start, LocalDate end, Float value, LocalDateTime date) {
        this.code = code;
        this.start = start;
        this.end = end;
        this.value = value;
        this.date = date;
    }

    public Request() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
