package com.example.factorypattern.controllersV1;

import com.example.factorypattern.models.enums.Architecture;
import com.example.factorypattern.models.*;
import com.example.factorypattern.models.cpu.AlphaCpu;
import com.example.factorypattern.models.cpu.EmberCpu;
import com.example.factorypattern.models.cpu.EnginolaCpu;
import com.example.factorypattern.models.mmus.AlphaMmu;
import com.example.factorypattern.models.mmus.EmberMmu;
import com.example.factorypattern.models.mmus.EnginolaMmu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/computers")
public class ComputerController {

    @GetMapping("/{architecture}")
    public Computer get(@PathVariable Architecture architecture) throws Exception {
        Computer computer;

        switch(architecture) {
            case ALPHA:
                computer = new Computer(new AlphaCpu(), new AlphaMmu());
                break;
            case EMBER:
                computer = new Computer(new EmberCpu(), new EmberMmu());
                break;
            case ENGINOLA:
                computer = new Computer(new EnginolaCpu(), new EnginolaMmu());
                break;
            default:
                throw new Exception("Unsupported architecture.");
        }

        return computer;
    }
}
