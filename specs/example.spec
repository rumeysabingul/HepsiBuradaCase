Hepsi Burada Case
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs


Kullanıcı girişi yapılarak sepete ürün eklenmesi
------------------------------------------------
* "myAccount" elementinin üstüne gelinir
* "3" saniye beklenir
* "a[id='login']" elementine tıkla
* "3" saniye beklenir
* "txtUserName" elementine "rmysbngl07@gmail.com" değerini yaz
* "txtPassword" elementine "Abc12345" değerini yaz
* "2" saniye beklenir
* "btnLogin" objesine tıklanır
* "2" saniye beklenir
* "span[class='sf-OldMyAccount-1k66b']" bilgisi "Rümeysa BİNGÜL" ile karşılaştırılır
* "input[class='desktopOldAutosuggestTheme-input']" elementine "Iphone" değeri yazıldı
* "div[class='SearchBoxOld-buttonContainer']" elementine tıkla
* "5" saniye beklenir
* "a[data-productid='HB00000NSBZ4']" elementine tıkla
* "2" saniye beklenir
* "addToCart" objesine tıklanır
* "tr[data-bind='click: $parent.goToMerchant.bind($parent, true)']" elementine tıkla
* "2" saniye beklenir
* "addToCart" objesine tıklanır
* "2" saniye beklenir
* "shoppingCart" objesine tıklanır
* "div[class='product_name_3Lh3t']>a" bilgisi "iPhone 11 64 GB" ile karşılaştırılır
* "4" saniye beklenir


Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme
-----------------------------------------------------------
* "input[class='desktopOldAutosuggestTheme-input']" elementine "Iphone" değeri yazıldı
* "div[class='SearchBoxOld-buttonContainer']" elementine tıkla
* "5" saniye beklenir
* "a[data-productid='HB00000NSBZ4']" elementine tıkla
* "2" saniye beklenir
* "addToCart" objesine tıklanır
* "tr[data-bind='click: $parent.goToMerchant.bind($parent, true)']" elementine tıkla
* "2" saniye beklenir
* "addToCart" objesine tıklanır
* "2" saniye beklenir
* "shoppingCart" objesine tıklanır
* "div[class='product_name_3Lh3t']>a" bilgisi "iPhone 11 64 GB" ile karşılaştırılır
* "4" saniye beklenir

