@google_search
Feature: US_01 Google Search

  Background: Go to Google
    Given User goes to "https://www.google.com"

  @iphone
  Scenario: TC_01 Google Iphone Search
    When User searches for "iphone"
    Then Assert the result contains "iphone"
    And User close the application

  @tesla
  Scenario: TC_02 Google Tesla Search
    When User searches for "tesla"
    Then Assert the result contains "tesla"
    And User close the application


#1. Her feature file, Feature:(feature epic anlamina gelir fakat cucumber daki anlami test dosyasi) kelimesi ile baslamak zorundadir.
#2. Her bir file da sadece bir Feature: kullanilabilir.
#3. Scenario(Test case) olusturmak icin Scenario: kelimesi kullanilir.
#4. Bir feature da birden fazla Scenario: kullanilabilir.
#5. Her bir test step Given, When, And, Then, But, * kelimelerinden biriyle baslamalidir.
#6. Given -> Genelde ilk satirlarda pre condition step leri icin kullanilir, Given anahtar kelimesi ile ön koşul yani başlangıç durumu tanımlanır.
#7. Then -> Genelde son satirlarda, verification step leri icin kullanilir, Then anahtar kelimesi ile de sonuç tanımlanır.
#8. And, When -> Genelde ara adimlarda baglac olarak kullanilir, When, And anahtar kelimeleri ile olay tanimlanir. Teknik olarak istenilen kelime istenilen step te kullanilabilir.
#   Ama anlam karmasasi olmamasi icin bu adimlar takip edilir, yoksa Java icin hepsi birdir.
#9. Belirli scenario lari calistirmak icin cucumber da tags ler kullanilir.
#   Tag’lari onceden belirledigimiz senaryoları(scenario) ya da scenario outline lari çalıştırmak için kullanırız.(Feature: seviyesinde de kullanilabilir.)
#   Tag’lari senaryolarımızı gruplandırmak için de kullanabiliriz(smoke test, regression test, vs.)
#10.dryRun=false -> dryRun yokmus gibi normal sekilde calisir. Yani tum adimlari tek tek browser da acar.
#   dryRun=true -> Yeni bir STEP eklendiginde sadece tanimlanmamis step definitions lari olusturmak icin kullanilir, kullanilma sebebi zamandan tasarruftur.
#BDD(Behaviour driven development/Davranış güdümlü geliştirme): ilk olarak behavior(davranis) veya functionality leri yaziyorsunuz(Epic=Feature, Story, AC, etc), daha
#sonra development and testing basliyor.
#Gherkin: Projede her bir behavior için .feature uzantılı bir Gherkin dosyası oluşturulur. Bu feature dosyasına ilgili özelliğin farklı durumlardaki davranışları tanımlanır.
#Add Dependencies -> Selenium-java, WebDriverManager, cucumber java, cucumber junit, plugins(Cucumber for Java, Gherkin)
#Background
#Farklı senaryoların başında ortak adımlarımız varsa:
#1. Feature file in altina Background oluşturun.
#2. Bu ortak adımları Background altına yazın.
#3. Background, Feature file’daki her Scenario’dan önce çalıştırılır
#4. Duplication olmadigindan emin olun. Background un altındaki adımı yazdıktan sonra senaryolardan silin.

