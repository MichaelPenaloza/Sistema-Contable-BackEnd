package com.microservice.contabilidad.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.contabilidad.model.entity.CuentaContableEntity;
import com.microservice.contabilidad.service.CuentaContableService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/contabilidad/cuenta-contable")
@AllArgsConstructor
public class CuentaContableController {
    
    private final CuentaContableService asientoContableService;

    @PostMapping("/crear")
    public void crearCuentaContable(@RequestBody CuentaContableEntity cuentaContable) {
        asientoContableService.saveCuentaContable(cuentaContable);
    }

    @GetMapping("/obtener-cuentas")
    public List<CuentaContableEntity> obtenerCuentasContables() {
        return asientoContableService.obtenerCuentasContables();
    }

    @GetMapping("obtener-por-id")
    public CuentaContableEntity obtenerCuentaContablePorId(@RequestParam Long id) {
        return asientoContableService.obtenerCuentaContablePorId(id);
    }
}