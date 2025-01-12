package com.example.acessoapi.domain.ports.out;

import com.example.acessoapi.domain.entities.ResidentDomain;
import com.example.acessoapi.domain.entities.UserDomain;

import java.util.List;

public interface ResidentRepositoryPortOUT {

    ResidentDomain create (ResidentDomain doamin);

}
