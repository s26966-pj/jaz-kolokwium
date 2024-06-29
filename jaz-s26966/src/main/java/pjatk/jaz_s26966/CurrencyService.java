package pjatk.jaz_s26966;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CurrencyService {
    private final RestTemplate restTemplate = new RestTemplate();

    public Double getCurrency() {
        Currency currency = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/gbp/2012-01-02/2013-01-02/", Currency.class);
        List<Rate> rates = currency.getRates();
        Double value = 0.0;
        for (Rate rate : rates) {
            value += rate.getMid();
        }
        return value/rates.size();

    }

}
