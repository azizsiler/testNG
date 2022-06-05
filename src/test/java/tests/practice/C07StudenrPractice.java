package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class C07StudenrPractice extends TestBase {

    @Test
    public void webTableTest() {

        // https://demoqa.com/webtables sayfasina gidin
     driver.get("https://demoqa.com/webtables");

        //heders ta bulunan departman isimlerini yazdirin

        List<WebElement> headersList=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
       // headersList.stream().forEach(t->System.out.println(t.getText()));
        int departmentIndex=0;
        for (int i = 0; i <headersList.size() ; i++) {
            if (headersList.get(i).getText().equals("Department")){
                departmentIndex++;
            }

        }
        departmentIndex++;


        List<WebElement>departmanList=driver.
                findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td']["+departmentIndex+"]"));
        departmanList.stream().filter(t->!(t.getText().equals(" "))).forEach(t->System.out.println(t.getText()));


        // 3. Sutunun basligini yazdirin
        System.out.println(headersList.get(3).getText());

        // tablodaki tum datalari yazdirin

       WebElement tumTable= driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        System.out.println(tumTable.getText());

        //Tablodaki satir sayisini yazdirin
       WebElement tumtable= driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        System.out.println(tumtable.getText());

        //tabloda kac tane cell vardir
       List <WebElement> tumceller=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td']"));
        System.out.println(tumceller.size());

        //tablodaki satir sayisini yazdirin
        List <WebElement> satirlar=driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-tr-group']"));
        System.out.println(satirlar.size());

        //tablodaki sutun sayisini bulun
        System.out.println(headersList.size());

        //tablodaki 3. kolonu yazdirin

       List <WebElement> kolon3= driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][3]"));
        kolon3.stream().forEach(t->System.out.println(t.getText()));

        // listede ismi Kierra olan kisinin salary sini yazdirin
        List<WebElement>ismlerList=driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][1]"));
        List<WebElement>salaryList=driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][5]"));

        for (int i = 0; i < ismlerList.size(); i++) {
            if (ismlerList.get(i).getText().equals("Kierra")){
                System.out.println(salaryList.get(i).getText());
            }

        }



    }
}
