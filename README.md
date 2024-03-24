   /*
         * Nedir ?
         * Bu tasarımın amacı yazılım tasarımlarının daha anlaşılır bakımı daha kolay ve genişletilmesi daha kolay gele getirmek.
         */

        /*
         * Genel olarak solid prensiplerinin amacı 
         * 
         * Yapmış oldugmuz yazılımları sürdürülebilirligini saglamak sürekli geliştirilmeye açık hale getirmek,
         * Kod tekrarını önleyerek daha hızlı müdahaleler etmek
         * Kodu esnek bir biçimde kullanmak
         * yalın ve anlaşılır olmasını saglamak.
         */
         
          /*
         * Herhangi bir yazılımın esnek yeniden kullanılabilir sürdürülebilir ve anlaşılır olmasını saglayan ayrıca kod tekrarını önleyen 
         * prensiplerdir;
         * 
         */

        /*
         *  SOLID PRENSIPLERI
         *  (S)ingle Responsibility Principle (tek sorumluluk) : bir sınıfın veya methodun sadece bir sorumlulugu olmalıdır.Bir sınıfa veya fonksiyona birden fazla sorumluluk verilmemeli
        *  
        *  (O)pen/Closed Principle :(Değişime kapalı gelişime açık) : nesnelerin değişime kapalı gelişime açık olmasıdır yani yeni bir özellik geldigi zaman
        *   koda müdahale edilmeden yeni gelen özelligin adapte edilmesidir.
        *   
        *   (L)iskov ‘s Substitution Principle :(Yerine geçme prensibi) : aynı temel sınıftan türeyen tüm sınıflar birbirlerininn yerine kullanılmalıdır.
        *   Yani bir temel sınıf base sınıfı kalıtım veya implement ettigi zaman base sınıfta olan methodlar veya davranışlar türetilen sınıfta da kullanılmalıdır.
        *
        *   Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları,
            türedikleri(üst) sınıfların yerine kullanabilmeliyiz.
        *   
        *   (I)nterface Segregation Principle :sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz 
        *   oluştururak o arayüzü kullanan sınıf ihtiyacı olmayan methodları kullanılmasına zorlamamak.
        *   
        *    Nesneler asla ihtiyacı olmayan property/metot vs içeren interfaceleri implement etmeye zorlanmamalıdır
        *    
        *    
        *    (D)ependency Inversion Principle (bagımlılıkları en aza indirme) :
        *    Üst düzey modüller, kolayca yeniden kullanılabilir olmalı ve yardımcı program
             özellikleri sağlayan düşük düzeyli modüllerdeki değişikliklerden etkilenmemelidir. Bunu başarmak için,
             yüksek seviyeli ve düşük seviyeli modülleri birbirinden ayıran bir soyutlama sunmanız gerekir.
             Yüksek seviyeli modüller, düşük seviyeli modüllere bağlı olmamalıdır.
             Her ikisi de soyutlamalara bağlı olmalıdır.
            Kısaca : sınıflar arası bagımlılık en aza indirilerek sürdürülebilirlik saglamak.
            çözümü :her iki sınıfta soyutlama üzerinden yönetilmelidir.
        */
