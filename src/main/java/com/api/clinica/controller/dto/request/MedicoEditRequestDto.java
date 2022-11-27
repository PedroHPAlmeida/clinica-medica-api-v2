package com.api.clinica.controller.dto.request;

import com.api.clinica.model.Medico;
import com.api.clinica.model.enums.Especialidade;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter @Setter
public class MedicoEditRequestDto {

    private String nome;
    private String crm;
    private Especialidade especialidade;
    private String email;
    private String senha;
    private String setor;

    public Medico converter(ModelMapper modelMapper) {
        return modelMapper.map(this, Medico.class);
    }

}
