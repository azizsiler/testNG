package tests.practice;

import org.testng.annotations.Test;

public class C01Priority {
      /*
      ●TestNG (default ) olarak @Test methodları ni alfabetik sıraya gore run eder ..(Yukardan asagi degil)
      ●priority annotation Testlere öncelik vermek icin kullanilir, Kucuk olan Numara daha once calisir.
      priority:  TestNG testlerinde, testler konsola alfabetik sira ile yazdirilir.
      priority-> default sifirdir..
      enabled = false  methodu : Testi gormezden gelmek icin @Test in yanina    '(enabled = false)' fonksiyonunu kullaniriz.
     */

    @Test (priority = 3000, enabled = false)
    public void b (){
        System.out.println("b");

    }
    @Test (priority = 2001)
    public void a (){
        System.out.println("b");

    }
    @Test (priority = 2000)
    public void c (){
        System.out.println("b");

    }

    // enabled ==false methodu kullanildiginda o test
    // gormezden gelinir

    @Test ()
    public void test01 (){
        System.out.println("test01");

    }
    @Test ()
    public void test02 (){
        System.out.println("test02");

    }
    @Test (enabled = false)
    public void test03 (){
        System.out.println("test03");

    }
    @Test (enabled = false)
    public void test04 (){
        System.out.println("test04");

    }
    @Test (enabled = false)
    public void test05 (){
        System.out.println("test05");

    }
    @Test ()
    public void test06 (){
        System.out.println("test06");

    }
}
