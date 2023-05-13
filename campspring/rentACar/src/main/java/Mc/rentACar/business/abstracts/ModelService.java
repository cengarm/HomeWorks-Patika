package Mc.rentACar.business.abstracts;

import Mc.rentACar.business.requests.CreateModelRequest;
import Mc.rentACar.business.requests.UpdateBrandRequest;
import Mc.rentACar.business.responses.GetAllModelsResponse;
import Mc.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();

    GetByIdBrandResponse getById(int id);

    void add(CreateModelRequest createModelRequest);

    void uptade(UpdateBrandRequest updateBrandRequest);

    void delete(int id);

    GetAllModelsResponse getById1(int id);

}
