package Mc.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;

public interface ModelMapperService {  // core ortak kullanıcağımız kodları yazdığımız yer.
    ModelMapper forResponse();
    ModelMapper forRequest();

}
