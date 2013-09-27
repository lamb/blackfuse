package org.mynah.blackfuse.repository.impl;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mynah.blackfuse.util.ConstantsTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(ConstantsTest.CONTEXT)
@TransactionConfiguration
public class RepositoryTest {

    @Test
    @Transactional
    public void testGeneratId() {
        int id = 1;
        assertThat(id, greaterThan(0));
    }
}
