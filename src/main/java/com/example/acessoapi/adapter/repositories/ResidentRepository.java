package com.example.acessoapi.adapter.repositories;

import com.example.acessoapi.adapter.entities.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository<ResidentEntity, Long> {
}
