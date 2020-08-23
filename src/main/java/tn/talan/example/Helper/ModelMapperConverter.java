package tn.talan.example.Helper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperConverter {
   @Autowired
    private ModelMapper mapper;
    public <S, D> D convert(S sourceObject, Class<D> targetObject)
    { return this.mapper.map(sourceObject, targetObject); }

}
