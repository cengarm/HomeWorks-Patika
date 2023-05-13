package Mc.rentACar.business.abstracts;

import Mc.rentACar.business.requests.CreateBrandRequest;
import Mc.rentACar.business.requests.UpdateBrandRequest;
import Mc.rentACar.business.responses.GetAllBrandsResponse;
import Mc.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService3 {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById (int id);
    void add(CreateBrandRequest createBrandRequest);
    void uptade(UpdateBrandRequest uptadeBrandRequest);
    void delete(int id);

}
