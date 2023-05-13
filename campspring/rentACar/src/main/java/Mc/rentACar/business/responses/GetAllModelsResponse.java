package Mc.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {
    private int id;
    private String name;
    private String brandName; /* mapper brandname arıcak ama olmadığı için brandin içinde ki name alıp otamatik oluşturacak */
    private String brandDescription;
}
