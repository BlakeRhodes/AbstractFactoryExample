package com.example.factorypattern.controllersV1;

import com.example.factorypattern.models.enums.Architecture;
import com.example.factorypattern.models.mmus.AlphaMmu;
import com.example.factorypattern.models.mmus.EmberMmu;
import com.example.factorypattern.models.mmus.EnginolaMmu;
import com.example.factorypattern.models.mmus.Mmu;
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
