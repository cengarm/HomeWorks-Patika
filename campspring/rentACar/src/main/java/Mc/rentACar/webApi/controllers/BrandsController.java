package Mc.rentACar.webApi.controllers;

import Mc.rentACar.business.requests.CreateBrandRequest;
import Mc.rentACar.business.requests.UpdateBrandRequest;
import Mc.rentACar.business.responses.GetAllBrandsResponse;
import Mc.rentACar.business.abstracts.BrandService3;
import Mc.rentACar.business.responses.GetByIdBrandResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//anotation ; bilgilendirme ifadesi (springframework çalışırken bulup erişim noktası olarak anlıyor)
@RequestMapping("/api/brands") // tarayıcıdaki adreslemenin aynısı.
public class BrandsController {
    private BrandService3 brandService3;

    @Autowired
    public BrandsController(BrandService3 brandService3) {

        this.brandService3 = brandService3;

    }
    @GetMapping() // data çekmek için
    public List<GetAllBrandsResponse> getAll(){

        return brandService3.getAll();
    }

    @GetMapping("/{id}") // data çekmek için
    public GetByIdBrandResponse getById(@PathVariable int id){

        return brandService3.getById(id);
    }

    @PostMapping() // eklemek için
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandService3.add(createBrandRequest);
    }

    @PutMapping
    public  void update(@RequestBody UpdateBrandRequest updateBrandRequest) {

        this.brandService3.uptade(updateBrandRequest);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.brandService3.delete(id);
    }
}
