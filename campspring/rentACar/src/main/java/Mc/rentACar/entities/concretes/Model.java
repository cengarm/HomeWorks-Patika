package Mc.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data // lombok getter ve setterlarını otomatik getiriyor.
@Table(name = "models") // otamatik tablo oluşturuyor.
@AllArgsConstructor // parametreli constructer getiriyor
@Getter // burada sadece getter olsun istersek
@Setter // Data = getter + setter
@NoArgsConstructor // parametresiz conctructer getiriyor.
@Entity // sen bir veri tabanı varlığısın demek.


public class Model {

    @Id // sen veri tabanında primery keysin
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik artırmak demek (genera.....)
    @Column(name = "id")
    private int id;

    @Column(name = "name", unique = true) // Tekrar edemez demek
    private String name;

    @ManyToOne // burada model cllasında olduğumuz için mmodel çokkez tekrarlanıyor many to one
    @JoinColumn(name= "brand_id") // bir varlık ilişkilendirmesine veya öğe koleksiyonuna katılmak için bir sütun belirtmek için kullanılır.
    private Brand1 brand1;

    @OneToMany(mappedBy = "model")
    private List<Car> cars;

}
