package org.mynah.blackfuse.service.impl;

import java.util.List;

import org.mynah.blackfuse.model.TtNaire;
import org.mynah.blackfuse.repository.INaireRepository;
import org.mynah.blackfuse.service.INaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NaireService implements INaireService {

    @Autowired
    private INaireRepository naireRepository;
    
    @Transactional(readOnly = true)
    public List<TtNaire> query() {
        return naireRepository.query();
    }
}
