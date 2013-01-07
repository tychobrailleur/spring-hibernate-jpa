package com.mycompany.coredev.dao;

import com.mycompany.coredev.model.Screen;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ScreenDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly=true)
    public Screen getScreenById(Long screenId) {
        return entityManager.find(Screen.class, screenId);
    }
}
