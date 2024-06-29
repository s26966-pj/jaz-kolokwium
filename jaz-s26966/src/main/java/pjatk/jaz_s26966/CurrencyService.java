package pjatk.jaz_s26966;

import org.hibernate.type.descriptor.jdbc.DateJdbcType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CurrencyService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public Request getCurrency(String code, LocalDate start, LocalDate end) {
        Currency currency = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/"+code+"/" +start+"/"+end, Currency.class);
        List<Rate> rates = currency.getRates();
        Float value = 0f;
        for (Rate rate : rates) {
            value += rate.getMid();
        }
        Request request = new Request(code, start, end, value/ rates.size(), LocalDateTime.now());
        currencyRepository.save(request);
        return request;
    }

}
