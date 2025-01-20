package br.com.boletojuros.adapter.http;

import br.com.boletojuros.adapter.http.dto.CalculoBoletoReponse;
import br.com.boletojuros.adapter.http.dto.CalculoBoletoRequest;
import br.com.boletojuros.adapter.http.mapper.CalculoBoletoMapper;
import br.com.boletojuros.core.port.in.CalculoBoletoPort;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/boleto")
public class CalculoBoletoController {

    private final CalculoBoletoPort calculoBoletoPort;
    private final CalculoBoletoMapper mapper;

    public CalculoBoletoController(CalculoBoletoPort calculoBoletoPort, CalculoBoletoMapper calculoBoletoMapper) {
        this.calculoBoletoPort = calculoBoletoPort;
        this.mapper = calculoBoletoMapper;
    }

    @PostMapping("/calculo")
    @Operation(summary = "Calcular Jursos em Boleto")
    public ResponseEntity<CalculoBoletoReponse> calcularBoleto(@Valid @RequestBody CalculoBoletoRequest boleto) {
        var boletoCalculado = calculoBoletoPort.executar(boleto.getCodigo(), boleto.getData_pagamento());
        return ResponseEntity.ok(mapper.toDTO(boletoCalculado));

    }
}
