package com.davinci.aerolineas.service;


import com.davinci.aerolineas.model.Ruta;

import java.util.List;

public interface RutaService {


    void saveRuta(Ruta ruta);

    List<Ruta> getAll();

    Ruta getById(int rutaid);
}
