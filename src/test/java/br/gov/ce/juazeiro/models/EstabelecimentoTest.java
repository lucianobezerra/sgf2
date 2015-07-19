package br.gov.ce.juazeiro.models;

import app.models.Estabelecimento;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.Model;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

public class EstabelecimentoTest extends Model {

  public EstabelecimentoTest() {
    Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost/sgf", "postgres", "postgres");
  }

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }

  @org.junit.Test
  public void testSomeMethod() {
    Estabelecimento est = Estabelecimento.findById(1);
    assertEquals(1, est.getId());
  }

}
