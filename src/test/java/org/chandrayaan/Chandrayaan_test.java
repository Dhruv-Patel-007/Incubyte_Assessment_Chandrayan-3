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

    @Test
    public void testRightFromNorthChangesDirectionToEast(){
        char[] commands = new char[] {'r'};
        String result = "(0,0,0,E)";
        assertEquals(result, chandrayaan.finalDirection(commands));
    }

    @Test
    public void testLeftfromNorthChangesDirectionToWest(){
        char[] commands = new char[] {'l'};
        String result = "(0,0,0,W)";
        assertEquals(result, chandrayaan.finalDirection(commands));
    }

    @Test
    public void testBackwardFromUpDecrementsZBy1(){
        char[] commands = new char[] {'b'};
        Chandrayaan chandrayaan = new Chandrayaan(0, 0, 0, 'U');
        String result = "(0,0,-1,U)";
        assertEquals(result, chandrayaan.finalDirection(commands));
    }

    @Test
    public void testUpCommand(){
        char[] commands = new char[] {'u'};
        Chandrayaan chandrayan = new Chandrayaan(0, 0, 0, 'N');
        String result = "(0,0,0,U)";
        assertEquals(result, chandrayaan.finalDirection(commands));
    }

    @Test
    public void testDownCommand(){
        char[] commands = new char[] {'d'};
        Chandrayaan chandrayan = new Chandrayaan(0, 0, 0, 'N');
        String result = "(0,0,0,D)";
        assertEquals(result, chandrayaan.finalDirection(commands));
    }

    @Test
    public void testFinalDirection(){
        char[] commands = new char[] {'f','r', 'u', 'b', 'l'};
        Chandrayaan chandrayan = new Chandrayaan(0, 0, 0, 'N');
        String result = "(0,1,-1,W)";
        assertEquals(result, chandrayaan.finalDirection(commands));
    }
}
