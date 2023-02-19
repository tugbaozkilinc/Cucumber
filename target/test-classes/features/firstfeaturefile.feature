Feature: first feature file

  Scenario: TC01_google_iphone_search
  Given User goes to the google
  When User searches for iphone
  Then Assert the result contains iphone


# 1. Her feature file, Feature: kelimesi ile baslamak zorundadir.
# 2. Her bir file da sadece bir Feature: kullanilabilir.
# 3. Senaryo(Test case) olusturmak icin Scenario: kelimesi kullanilir.
# 4. Birden fazla Scenario: kullanilabilir
# 5. Her bir adim Given, When, And, Then, But, * kelimelerinden biriyle baslamalidir.
# 6. Given -> Genelde ilk satirlarda pre condition step leri icin kullanilir.
# 7. Then -> Genelde son satirlarda, verification step leri icin kullanilir.
# 8. And, When -> Genelde ara adimlarda baglac olarak kullanilir.
# NOTE: Teknik olarak istenilen kelime istenilen step te kullanilabilir. Ama anlam karmasasi olmamasi cin bu adimlar takip edilir.
