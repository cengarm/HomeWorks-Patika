package Mc.rentACar.webApi.controllers;

import Mc.rentACar.business.abstracts.ModelService;
import Mc.rentACar.business.requests.CreateModelRequest;
import Mc.rentACar.business.requests.UpdateBrandRequest;
import Mc.rentACar.business.responses.GetAllModelsResponse;
import Mc.rentACar.business.responses.GetByIdBrandResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ModelsController {
    private ModelService modelService;

    @Autowired
    public ModelsController(ModelService modelService){
        this.modelService = modelService;
    }

    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }

    @GetMapping("/{id}")
    public GetAllModelsResponse getById1(@PathVariable int id){
        return modelService.getById1(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }

    @PutMapping
    public  void update(@RequestBody UpdateBrandRequest updateBrandRequest) {

        this.modelService.uptade(updateBrandRequest);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.modelService.delete(id);
    }
}
