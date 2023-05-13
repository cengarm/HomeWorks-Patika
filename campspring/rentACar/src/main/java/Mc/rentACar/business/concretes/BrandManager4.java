package Mc.rentACar.business.concretes;

import Mc.rentACar.business.requests.CreateBrandRequest;
import Mc.rentACar.business.requests.UpdateBrandRequest;
import Mc.rentACar.business.responses.GetAllBrandsResponse;
import Mc.rentACar.business.responses.GetByIdBrandResponse;
import Mc.rentACar.core.utilities.mappers.ModelMapperService;
import Mc.rentACar.entities.concretes.Brand1;
import Mc.rentACar.business.abstracts.BrandService3;
import Mc.rentACar.dataAccess.abstracts.BrandRepository2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class BrandManager4 implements BrandService3 {
    private BrandRepository2 brandRepository2;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllBrandsResponse> getAll() {

    List<Brand1> brand1s = brandRepository2.findAll(); // data baseten gelen 3 marka var
        List<GetAllBrandsResponse> brandsResponse =
                brand1s.stream().map(brand1->this.modelMapperService.forResponse()
                        .map(brand1,GetAllBrandsResponse.class)).collect(Collectors.toList());

        return brandsResponse;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        return null;
    }


    @Override
    public void add(CreateBrandRequest createBrandRequest) {

    Brand1 brand1 = this.modelMapperService.forRequest().map(createBrandRequest,Brand1.class);
    //forRequest yaparak createBrandRequesti(source) Brand1 classına çeviriyor.


        this.brandRepository2.save(brand1);
    }

    @Override
    public void uptade(UpdateBrandRequest uptadeBrandRequest) {

        Brand1 brand1 = this.modelMapperService.forRequest().map(uptadeBrandRequest,Brand1.class);
        this.brandRepository2.save(brand1);
    }

    @Override
    public void delete(int id) {

        this.brandRepository2.deleteById(id);

    }
}
