package ru.vtb.expertconclusions.outletcreateapi.service.printservice.impl;

import org.springframework.stereotype.Service;
import ru.vtb.expertconclusions.outletcreateapi.service.printservice.PrintService;

import java.util.List;

@Service
public class PrintServiceImpl implements PrintService {

    @Override
    public void print(List<String> worlds) {
        new TextFieldTest(worlds);
    }
}
