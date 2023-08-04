package org.chandrayaan;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Chandrayaan_test {
    Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, 'N');

    @Test
    public void testInitialPosition(){
        Chandrayaan chandrayan = new Chandrayaan(0, 0, 0, 'N');
    }

    @Test
    public void testPassingDirectionCommands(){
        char[] commands = new char[] {'f', 'r', 'u', 'b', 'l'};
        chandrayaan.finalDirection(commands);
    }

    @Test
    public void testForwardIncrementsYBy1(){
        char[] commands = new char[] {'f'};
        String result = "(0,1,0,N)";
        assertEquals(result, chandrayaan.finalDirection(commands));
    }

}
