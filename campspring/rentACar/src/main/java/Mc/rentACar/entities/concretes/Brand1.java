package Mc.rentACar.entities.concretes;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data // lombok getter ve setterlarını otomatik getiriyor.
@Table(name = "brands") // otamatik tablo oluşturuyor.
@AllArgsConstructor // parametreli constructer getiriyor
@Getter // burada sadece getter olsun istersek
@Setter // Data = getter + setter
@NoArgsConstructor // parametresiz conctructer getiriyor.
@Entity // sen bir veri tabanı varlığısın demek.


public class Brand1 {

    @Id // sen veri tabanında primery keysin
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik artırmak demek (genera.....)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand1") // 1 tane brand(nesnemiz var) - ama modeller çok fazla o yüzden onetomany
    List<Model> models;
}
 // normalde buraya getter setter oluşturmaktan kurtulduk @ leri kullanarak


