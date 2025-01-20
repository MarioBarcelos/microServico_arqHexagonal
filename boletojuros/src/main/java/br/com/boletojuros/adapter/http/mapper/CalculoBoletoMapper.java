package br.com.boletojuros.adapter.http.mapper;

import br.com.boletojuros.adapter.http.dto.CalculoBoletoReponse;
import br.com.boletojuros.core.domain.BoletoCalculado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CalculoBoletoMapper {

    CalculoBoletoReponse toDTO(BoletoCalculado boleto);
}
