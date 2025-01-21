package br.com.boletojuros.adapter.http.exception;

import lombok.*;
import java.util.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErroResponse {
    private List<String> mensagens = new ArrayList<>();
    private String erro;
    private int codigo;
    private Date timestamp;
    private String path;
}
