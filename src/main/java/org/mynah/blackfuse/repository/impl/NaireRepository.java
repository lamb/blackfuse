package org.mynah.blackfuse.repository.impl;

import java.util.List;

import org.mynah.blackfuse.model.TtNaire;
import org.mynah.blackfuse.repository.INaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NaireRepository implements INaireRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedJdbcTemplate;

    @Override
    public List<TtNaire> query() {
        String sql = "select * from tt_naire";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<TtNaire>(TtNaire.class));
    }

}
