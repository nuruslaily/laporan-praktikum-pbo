/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest1841720049Nurus;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author Nurus Laily
 */
public class Kategori1841720049NurusTest extends TestCase{
    Kategori1841720049Nurus instance;
    public Kategori1841720049NurusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() {
        instance = new Kategori1841720049Nurus("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    } 
    
    
    @After
    @Override
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720049Nurus> expResult = instance.getByNamaAndKeterangan(keyword, "");
        ArrayList<Kategori1841720049Nurus> result = instance.search(keyword);
        assertEquals(expResult, result);
    }

    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Kategori1841720049Nurus> expResult = instance.getByNamaAndKeterangan(instance.getmNama(), instance.getmKeterangan());
                assertTrue(expResult.size()>0);
    }

}
