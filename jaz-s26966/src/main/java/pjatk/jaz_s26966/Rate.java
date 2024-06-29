package pjatk.jaz_s26966;

import java.time.LocalDate;
import java.util.Date;

public class Rate {
    private String no;
    private LocalDate effectiveDate;
    private Float mid;

    public Rate() {

    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Float getMid() {
        return mid;
    }

    public void setMid(Float mid) {
        this.mid = mid;
    }
}
