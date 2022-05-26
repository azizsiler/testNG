package day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {
    // testNG test methodlarını isim sırasına gore calıştırır
    // eger isim sıralamasının dısından bır sıralama ile çalıştırılmasını
    // isterseniz o zaman test methodlarına oncelik(Priority) tanımlayabiliriz

    // priority buyukten kucuge dogru sıralanır
    // eger bir test methoduna öncelik sıralaması tanmlanmadıysa
    //sıralamyı sıfır olarak kabul eder ve sırasına gore çalıştırır.
    @Test(priority = 5)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
