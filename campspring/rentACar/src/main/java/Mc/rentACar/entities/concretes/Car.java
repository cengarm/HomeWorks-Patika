package Mc.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Data // lombok getter ve setterlarını otomatik getiriyor.
@Table(name = "Cars") // otamatik tablo oluşturuyor.
@AllArgsConstructor // parametreli constructer getiriyor
@Getter // burada sadece getter olsun istersek
@Setter // Data = getter + setter
@NoArgsConstructor // parametresiz conctructer getiriyor.
@Entity // sen bir veri tabanı varlığısın demek.


public class Car {
    @Id // sen veri tabanında primery keysin
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik artırmak demek (genera.....)
    @Column(name = "id")
    private int id;

    @Column(name = "plate")
    private String plate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int state; // 1 - available (müsait) 2- Rented(Kiralandı) 3- Maintenance(bakımda)

    @ManyToOne
    @JoinColumn(name="model_id")
    private Model model;
}
