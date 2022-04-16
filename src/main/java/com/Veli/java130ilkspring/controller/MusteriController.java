package com.Veli.java130ilkspring.controller;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Bir sınıfın controlller olduğunu belirtmek için,
 * spring uygulamasına entegre etmek için,
 * @Controller annotations eklenir.
 * Controller -> son kullanıcı ile yani istemci yani pc ile iletişime geçer.
 * Genel de rest işlemleri için @RestController kullanılır.
 * Peki soru şu, bu sınıfa erişmek isteyen bir kullanıcı bu sınıfa nasıl gelecek??
 * Bu sınıfa ulaşabilecek bir url tanımlamak zorundayım.
 * peki bu url nasıl tanımlanır?
 * cevap: Sunucudan bir şey talep etmeye request-istek denir.
 * İstek url ile yapılır. url nın alınması işlemine mapping denir.
 * @RequestMapping gelen url isteğini yakalar.
 * Artık bu sınıfa erişmek isteyen kişi-kullanıcı
 * localhost:9090/musteri -> şeklinde erişim sağlayacak.
 */
@RestController
@RequestMapping("/musteri")

/**
 * eğer bir method u erişime açmak istiyorsanız erişim şeklini ve adresini(url) belirtmelisiniz.
 * Bu işlem için
 * @GetMapping, @PostMapping, @PutMapping şeklinde ihtiyaca göre kullanım yapmalısınız.
 * DİKKAT!!! biz burada dışarıdan her hangi bir bilgiye ihtiyaç duymadığımız için ve sadece gelen
 * isteğe cevap döneceğimiz için
 * @GetMapping annotations kullanacağız.
 */

public class MusteriController {
    @GetMapping("/menu")
    public String  Menu(){
        return "Çorba - Salata";
    }

    /**
     * Bu method a dışardan bir kullanıcının erişim sağlayıp veri gönderebilmesi için
     * @PostMapping annotation kullanılır.
     * kullanıcı post isteği atarak ad,soyad,adres, bilgisini bu methoda iletebilir.
     *
     * @param ad
     * @param soyad
     * @param adres
     * @return
     */
    @PostMapping("/saveuser")
    public String saveuser(String ad, String soyad, String adres){
        String uuid = UUID.randomUUID().toString();
        System.out.println("Kullanıcı kayıt edildi.");
        return uuid;
    }
}
