package meus.gatinhos.SpringBootApps.service;

import meus.gatinhos.SpringBootApps.entity.Gato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ServicoGato  {
    private List<Gato> listaGatos;

    public ServicoGato(){
        listaGatos = new ArrayList<Gato>();
    }
    public Gato saveGato(Gato gato){
        listaGatos.add(gato);
        return gato;
    }
    public List<Gato> getAllGatos(){
        return listaGatos;
    }
 }
