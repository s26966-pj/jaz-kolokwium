package pjatk.jaz_s26966;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping
public class CurrencyController {
    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("currency/{code}/{start}/{end}")
    public ResponseEntity<Request> getCurrency(@PathVariable String code, @PathVariable LocalDate start, @PathVariable LocalDate end) {
        return ResponseEntity.ok(currencyService.getCurrency(code, start, end));
    }
}
