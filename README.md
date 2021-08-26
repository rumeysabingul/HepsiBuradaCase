HepsiburadaCaseStudy
Bu projede Hepsiburada tarafından verilen task oluşturulmuş olup senaryoların Page Object Model kullanılarak koşulması sağlanmıştır.


Proje Özellikleri
Webdriver ları projede eklenmiştir.

Annotasyonlar ve assertionlar için JUnit kütüphanesi kullanılmıştır.

Proje Java dilinde Selenium frameworku ile geliştirilmiştir . Mimaride POM kullanılmıştır.

Çalışma Kapsamı: Hepsiburada.com üzerinden sepete ürün eklenmesi 
1. Kullanıcı girişi yapılarak sepete ürün eklenmesi 
 Kullanıcı Hepsiburada.com sitesini ziyaret eder. 
 Kullanıcı giriş işlemi yapılır. 
 Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır 
 Kullanıcı, burada satın almak istediği ürün için arama yapacaktır(Örnek: “iphone” gibi popüler ve yorumu olan bir ürün) 
 Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş
olabilir) ürün seçer. 
 Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir. 
 Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır. 

2. Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme 
 Kullanıcı Hepsiburada.com sitesini ziyaret eder. 
 Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş
olabilir) ürün seçer. (Örnek: “iphone” gibi popüler ve yorumu olan bir ürün)
 Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir. 
 Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır. 

3. Test Otomasyonu API
Meyve ve sebze satan bir işletmenin api servis testlerini yazdığınız düşünün,
-Elimizde bize stok fiyat bilgisi dönen bir endpoint
GET /allGrocery
{
 "data": [
 {
 "id": 1,
 "name": "apple",
 "price": 3,
 "stock": 100
 },
 {
 "id": 2,
 "name": "grapes",
 "price": 5,
 "stock": 50
 }
 ]
}
- İsme göre cevap dönen bir endpoint
GET /allGrocery/{name}
{
 "data": [
 {
 "id": 1,
 "name": "apple",
 "price": 3,
 "stock": 100
 }
 ]
}
- Yeni ürün ekleyebildiğimiz bir endpoint
POST /add
{
 "id": 4,
 "name": "string",
 "price": 12.3,
 "stock": 3
}
Bu bilgilere göre REST ile en az 3 api testi yazınız. Farklı 200, 400, 404 gibi farklı http status kodları 
karşılayabilmesi iyi olur.
Not: Grocery için bir mock servis oluşturabilirsiniz

API testi Postman uygulamasında yapıldı .  Grocery için mock server oluşturuldu ve örnek response codelar eklendi
url: https://db28fb3d-ea82-4eb3-b3ee-4a2c9831eb1f.mock.pstmn.io


4. Login Case’leri
 Hepsiburada.com login case'lerini BDD'ye uygun şekilde çıkararak, feature dosyasına yazınız (sadece 
case’lerin çıkarılması yeterli, otomasyon yazılmayacak).

Notlar:
** Test yazılırken okunabilirlik, isimlendirmeler, kod tekrarı gibi standartlara dikkat edilmelidir.
** Testler herhangi bir platformda yazılabilir(Java-Selenium,Ruby-Capybara gibi)
