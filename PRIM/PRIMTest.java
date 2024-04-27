

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PRIMTest {



    @Test
    void MSTprime() {
        PRIM primAlgo = new PRIM("C:\\Users\\erayz\\IdeaProjects\\Hashtabelle\\src\\AlgoDat\\HA2\\bsp_mst_1.txt");
        Assertions.assertEquals(37, primAlgo.MSTprime());

        PRIM primAlgo2 = new PRIM("C:\\Users\\erayz\\IdeaProjects\\Hashtabelle\\src\\AlgoDat\\HA2\\bsp_mst_2.txt");
        Assertions.assertEquals("9",primAlgo2.MSTprime());

        PRIM primAlgo3 = new PRIM("C:\\Users\\erayz\\IdeaProjects\\Hashtabelle\\src\\AlgoDat\\HA2\\bsp_mst_3.txt");
        Assertions.assertEquals("17", primAlgo3.MSTprime());
    }

}