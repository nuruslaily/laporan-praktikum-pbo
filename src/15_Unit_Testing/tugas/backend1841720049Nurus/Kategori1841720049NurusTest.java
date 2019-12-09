/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720049Nurus;

import java.sql.ResultSet;
import java.util.ArrayList;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    public void setUp() {
        instance = new Kategori1841720049Nurus("Novel", "Novel is full words");
        System.out.format("Start Testing : %s \n", this.instance.getmNama());
    }
    
    @After
    public void tearDown() {
         System.out.format("Finish Test %s\n", this.instance.getmNama());
    }
    
    @Test
    public void testGetmIdkategori() {
        System.out.println("getmIdkategori");
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        int expResult = 0;
        int result = instance.getmIdkategori();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetmIdkategori() {
        System.out.println("setmIdkategori");
        int mIdkategori = 0;
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        instance.setmIdkategori(mIdkategori);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetmNama() {
        System.out.println("getmNama");
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        String expResult = "";
        String result = instance.getmNama();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetmNama() {
        System.out.println("setmNama");
        String mNama = "";
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        instance.setmNama(mNama);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetmKeterangan() {
        System.out.println("getmKeterangan");
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        String expResult = "";
        String result = instance.getmKeterangan();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetmKeterangan() {
        System.out.println("setmKeterangan");
        String mKeterangan = "";
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        instance.setmKeterangan(mKeterangan);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        Kategori1841720049Nurus expResult = null;
        Kategori1841720049Nurus result = instance.getById(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        ArrayList<Kategori1841720049Nurus> expResult = null;
        ArrayList<Kategori1841720049Nurus> result = instance.getAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Novel";
        ArrayList<Kategori1841720049Nurus> expResult = instance.getByNamaAndKeterangan(keyword, "");
        ArrayList<Kategori1841720049Nurus> result = instance.search(keyword);
        assertEquals(expResult.size(), result.size());
        fail("The test case is a prototype.");
    }

    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Kategori1841720049Nurus> expResult = instance.getByNamaAndKeterangan(instance.getmNama(), instance.getmKeterangan());
                assertTrue(expResult.size()>0);
       
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Kategori1841720049Nurus instance = new Kategori1841720049Nurus();
        instance.delete();
        fail("The test case is a prototype.");
    }
    
}
