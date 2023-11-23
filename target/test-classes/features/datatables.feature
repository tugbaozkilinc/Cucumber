@data_table
Feature: Datatable Login Test

  Scenario: TC_01 User Login Test
    Given User goes to "https://www.bluerentalcars.com/"
    When User enters valid username and password
      | username                      | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
    And User close the application

# Scenario: TC_02 User Login Test
#   Given User goes to "https://www.bluerentalcars.com/"
#   When User enters all required fields
#     | idUser  | idHotelRoom | price | dateStart  | dateEnd    |
#     | manager | Ayse        | 500   | 11/08/2021 | 11/12/2021 |
#   And User close the application

# Scenario: User comments on a product
#   Given the user is logged in
#   When the user navigates to the comment page
#   And makes comments on the following products
#     | Product   | Comment       |
#     | Apple     | Very fresh!   |
#     | Orange    | Sour but nice |
#     | Banana    | Very ripe     |
#   Then the user should have commented on each product.


#DataTables Scenario Outline ile de kullanilabilir, ara adimlarda da kullanabilirsin. Mesela burda 1. adım "" ile parametrelendirildi, 2. adım ise datatable ile, sen 3.
#adım a scenario outline ekleyebilirsin.
#What is collections in JAVA? -> list, set, queue
#How did you use collections in your framework? -> I use collections when especially I need to store multiple test data . I use Collections when I try to get data from Excel, or DataTables.
#For example, I store the multiple login credentials in my excel sheet, and I use ExcelUtil class to get the data as a List. I actually have ExcelUtil class that has Java Codes to get the
#data from an excel sheet. And in that ExcelUtil we use collection, I can get the list of each column name, or I can get the list of data in different form.
#I also use collections when I expect multiple elements. For example findElements() method returns a List of WebElement- List<WebElement>
#getWindowHandles returns set of string- Set<String>
#When I use Data Table in my cucumber framework, I use collections
#I can store the data that comes from DataTables as List<Map<String,String>>
#I can also store the data that comes from DataTables as List<List<String>> or Just List<String>
#I have Utils classes. In the util classes I used collection a lot. For example, I have Excel Util class
#When I get the column names of an excel sheet, I store column names in List<String>
#When I the data list from excel, I put data list in List<Map<String, String>>

#Scenario Outline ile DDT yapılabilir. Scenario Outline iyi bilinmelidir.
#Test adimlarini(STEPS) reusable yapmak icin kullanilir
#En çok kullanılan cucumber ozelliklerinden biridir
#Examples kelimesi veri girisleri icin kullanilmalidir
#Step definitions lardaki data tipi STRING dir
#Examples kelimesi en sonda kullanilir
#Data Tables ile DDT yapılabilir
#Test adimlarini(STEPS) reusable yapmak icin kullanilir
#Scenario Outline kadar yaygın degildir
#Examples kelimesi kullanılmaz
#Step definitions lardaki data tipi DATATABLE
#DataTable lar ara adimlarda da(STEPS) kullanilabilir
#NOT: Datatables ve Scenario Outline birlikle kullanilabilir



