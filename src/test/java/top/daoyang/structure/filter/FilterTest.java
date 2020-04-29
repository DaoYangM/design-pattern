package top.daoyang.structure.filter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    public void filter() {
        Filter.Rubbish harmfulRubbish = new Filter.Rubbish(true, false, false, false);
        Filter.Rubbish dryRubbish = new Filter.Rubbish(false, true, false, false);

        List<Filter.Rubbish> rubbishes = new ArrayList<>();
        rubbishes.add(dryRubbish);
        rubbishes.add(harmfulRubbish);

        Filter.DryRubbishFilter dryRubbishFilter = new Filter.DryRubbishFilter();
        assertEquals(dryRubbishFilter.filterRubbish(rubbishes).get(0), dryRubbish);
    }
}