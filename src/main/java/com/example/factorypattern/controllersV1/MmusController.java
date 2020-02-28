package com.example.factorypattern.controllersV1;

import com.example.factorypattern.Architecture;
import com.example.factorypattern.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/mmus")
public class MmusController {

    @GetMapping("/{architecture}")
    public Mmu get(@PathVariable Architecture architecture) throws Exception {
        Mmu mmu;

        switch(architecture) {
            case ALPHA:
                mmu = new AlphaMmu();
                break;
            case EMBER:
                mmu = new EmberMmu();
                break;
            case ENGINOLA:
                mmu = new EnginolaMmu();
                break;
            default:
                throw new Exception("Unsupported architecture.");
        }

        return mmu;
    }
}
