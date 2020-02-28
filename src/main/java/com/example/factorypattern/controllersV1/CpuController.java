package com.example.factorypattern.controllersV1;

import com.example.factorypattern.Architecture;
import com.example.factorypattern.models.AlphaCpu;
import com.example.factorypattern.models.Cpu;
import com.example.factorypattern.models.EmberCpu;
import com.example.factorypattern.models.EnginolaCpu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cpus")
public class CpuController {

    @GetMapping("/{architecture}")
    public Cpu get(@PathVariable Architecture architecture) throws Exception {
        Cpu cpu;

        switch(architecture) {
            case ALPHA:
                cpu = new AlphaCpu();
                break;
            case EMBER:
                cpu = new EmberCpu();
                break;
            case ENGINOLA:
                cpu = new EnginolaCpu();
                break;
            default:
                throw new Exception("Unsupported architecture.");
        }

        return cpu;
    }
}
