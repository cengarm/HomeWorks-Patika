package Mc.rentACar.core.utilities.mappers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ModelMapperManager implements ModelMapperService {

    private ModelMapper modelMapper; // 1 tane model mapper yapar 50 tane üretmez.

    @Override
    public ModelMapper forResponse() { // cevaplar için.
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE); // Gevşek mapleme yap , id name ... karşılığı olmayanlar için uyarma

        return  this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() { // istekler için
        this.modelMapper.getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD); // standart mapleme yap , karşılığı olanlar için uyar.

        return  this.modelMapper;
    }
}
