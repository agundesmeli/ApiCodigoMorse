package com.example.codimomorse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodimoMorseController {

    @RequestMapping("/codigo_morse/{codigo}")
    public String codigoMorse(@PathVariable String codigo) {
        return CodigoMorseConverter.converterCodigoMorse(codigo);
    }


}
