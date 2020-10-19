package jam.example.pbc;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;

import static org.assertj.core.api.Assertions.shouldHaveThrown;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SortedServantTest {

    @Test
    void sortByValue() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("c","d");
        hm.put("t","b");
        hm.put("a","a");


        SortedServant sortedServant=new SortedServant();
        hm=sortedServant.sortByValue(hm);
        assertThat(hm.size()==3).isTrue();
    }
}