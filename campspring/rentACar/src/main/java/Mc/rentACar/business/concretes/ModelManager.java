package Mc.rentACar.business.concretes;

import Mc.rentACar.business.abstracts.ModelService;
import Mc.rentACar.business.responses.GetAllBrandsResponse;
import Mc.rentACar.business.responses.GetAllModelsResponse;
import Mc.rentACar.core.utilities.mappers.ModelMapperService;
import Mc.rentACar.dataAccess.abstracts.ModelRepository;
import Mc.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;



@Service
@AllArgsConstructor

public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
    List<Model> models = modelRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse =
                models.stream().map(brand1->this.modelMapperService.forResponse()
                        .map(brand1,GetAllBrandsResponse.class)).collect(Collectors.toList());

        return modelsResponse;

    }
}
