package com.enyoi.apimesaayuda.aplicacion.payloads.requests;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class DependenciasRequests {
    @NonNull
    private Long id;
    @NonNull
    @NotBlank
    private String nombreDependencia;
    @NonNull
    @NotBlank
    @Email
    private String usuario;

}
