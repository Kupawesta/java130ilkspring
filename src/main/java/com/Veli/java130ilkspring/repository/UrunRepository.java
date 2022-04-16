package com.Veli.java130ilkspring.repository;

import com.Veli.java130ilkspring.repository.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Bir interdace nini repository olarak kullanılması için
 * @Repository annotation kullanılır.
 * Ayrıca bu repo ya hangi yapının entegre edileceğinin bildirilmesini için
 * jpa kullanılır ve miras alır.
 */
@Repository
public interface UrunRepository extends JpaRepository<Urun, Long> {

}
