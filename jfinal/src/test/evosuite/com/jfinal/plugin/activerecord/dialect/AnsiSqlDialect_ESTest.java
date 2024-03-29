/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 11:09:25 GMT 2018
 */

package com.jfinal.plugin.activerecord.dialect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.druid.mock.MockCallableStatement;
import com.alibaba.druid.mock.MockConnection;
import com.alibaba.druid.mock.MockDriver;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceC3P0Adapter;
import com.alibaba.druid.sql.visitor.SQLEvalVisitorImpl;
import com.alibaba.druid.sql.visitor.SchemaStatVisitor;
import com.jfinal.plugin.activerecord.OrderedFieldContainerFactory;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.Table;
import com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class AnsiSqlDialect_ESTest extends AnsiSqlDialect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      MockConnection mockConnection0 = new MockConnection();
      StringBuilder stringBuilder0 = new StringBuilder();
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        ansiSqlDialect0.takeOverDbPaginate(mockConnection0, (-343), (-145), (Boolean) null, "", stringBuilder0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.Db", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forModelUpdate((Table) null, (Map<String, Object>) null, (Set<String>) null, (StringBuilder) null, (List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      OrderedFieldContainerFactory orderedFieldContainerFactory0 = new OrderedFieldContainerFactory();
      Map<String, Object> map0 = orderedFieldContainerFactory0.getAttrsMap();
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLEvalVisitorImpl sQLEvalVisitorImpl0 = new SQLEvalVisitorImpl();
      List<Object> list0 = sQLEvalVisitorImpl0.getParameters();
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forModelSave((Table) null, map0, stringBuilder0, list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forModelFindById((Table) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forModelDeleteById((Table) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[9];
      Record record0 = new Record();
      StringBuilder stringBuilder0 = new StringBuilder();
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forDbUpdate("x}m", stringArray0, stringArray0, record0, stringBuilder0, (List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "Precall_2";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      Record record0 = new Record();
      StringBuilder stringBuilder0 = new StringBuilder();
      MockDriver mockDriver0 = new MockDriver();
      MockConnection mockConnection0 = new MockConnection();
      MockCallableStatement mockCallableStatement0 = mockDriver0.createMockCallableStatement(mockConnection0, "");
      List<Object> list0 = mockCallableStatement0.getParameters();
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forDbUpdate("{}", stringArray0, objectArray0, record0, stringBuilder0, list0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[2];
      Record record0 = new Record();
      MockConnection mockConnection0 = new MockConnection();
      MockCallableStatement mockCallableStatement0 = new MockCallableStatement(mockConnection0, " where ");
      List<Object> list0 = mockCallableStatement0.getParameters();
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forDbSave(" where ", stringArray0, record0, (StringBuilder) null, list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forDbFindById((String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forDbDeleteById((String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      MockDriver mockDriver0 = new MockDriver();
      DruidDataSourceC3P0Adapter druidDataSourceC3P0Adapter0 = new DruidDataSourceC3P0Adapter();
      Properties properties0 = druidDataSourceC3P0Adapter0.getProperties();
      MockConnection mockConnection0 = mockDriver0.createMockConnection(mockDriver0, (String) null, properties0);
      MockCallableStatement mockCallableStatement0 = mockDriver0.createMockCallableStatement(mockConnection0, "W=V2?%+&_!#Nl_");
      // Undeclared exception!
      try { 
        ansiSqlDialect0.fillStatement((PreparedStatement) mockCallableStatement0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      MockDriver mockDriver0 = MockDriver.instance;
      DruidDataSource druidDataSource0 = new DruidDataSource(true);
      Properties properties0 = druidDataSource0.getConnectProperties();
      MockConnection mockConnection0 = mockDriver0.createMockConnection((MockDriver) null, "w<BE 3Rz/bw|T'y=)&", properties0);
      int[] intArray0 = new int[3];
      PreparedStatement preparedStatement0 = mockConnection0.prepareStatement("w<BE 3Rz/bw|T'y=)&", intArray0);
      // Undeclared exception!
      try { 
        ansiSqlDialect0.fillStatement(preparedStatement0, (List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "Precall_2";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      Record record0 = new Record();
      StringBuilder stringBuilder0 = new StringBuilder();
      MockDriver mockDriver0 = new MockDriver();
      MockConnection mockConnection0 = new MockConnection();
      MockCallableStatement mockCallableStatement0 = mockDriver0.createMockCallableStatement(mockConnection0, "");
      List<Object> list0 = mockCallableStatement0.getParameters();
      ansiSqlDialect0.forDbUpdate("", stringArray0, stringArray0, record0, stringBuilder0, list0);
      assertFalse(list0.isEmpty());
      assertEquals("update  set  where  = ? and  = ? and Precall_2 = ? and  = ? and  = ? and  = ? and  = ?", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      StringBuilder stringBuilder0 = new StringBuilder();
      Record record0 = new Record();
      MockDriver mockDriver0 = new MockDriver();
      DruidDataSource druidDataSource0 = new DruidDataSource();
      Properties properties0 = druidDataSource0.getConnectProperties();
      MockConnection mockConnection0 = new MockConnection(mockDriver0, "2#a dbxvc*KV^", properties0);
      MockCallableStatement mockCallableStatement0 = new MockCallableStatement(mockConnection0, "");
      List<Object> list0 = mockCallableStatement0.getParameters();
      ansiSqlDialect0.forDbSave("", stringArray0, record0, stringBuilder0, list0);
      assertEquals("insert into () values()", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "Precall_2";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      String string0 = ansiSqlDialect0.forDbDeleteById("", stringArray0);
      assertEquals("delete from  where  = ? and  = ? and Precall_2 = ? and  = ? and  = ? and  = ? and  = ?", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String[] stringArray0 = new String[7];
      stringArray0[0] = ") values(";
      stringArray0[1] = "vmzd";
      stringArray0[2] = "vmzd";
      stringArray0[3] = "vmzd";
      stringArray0[4] = "vmzd";
      stringArray0[5] = "vmzd";
      stringArray0[6] = "vmzd";
      String string0 = ansiSqlDialect0.forDbFindById("vmzd", stringArray0);
      assertEquals("select * from vmzd where ) values( = ? and vmzd = ? and vmzd = ? and vmzd = ? and vmzd = ? and vmzd = ? and vmzd = ?", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      MockDriver mockDriver0 = new MockDriver();
      MockConnection mockConnection0 = new MockConnection();
      MockCallableStatement mockCallableStatement0 = mockDriver0.createMockCallableStatement(mockConnection0, "CpgC");
      SchemaStatVisitor schemaStatVisitor0 = new SchemaStatVisitor();
      List<Object> list0 = schemaStatVisitor0.getParameters();
      ansiSqlDialect0.fillStatement((PreparedStatement) mockCallableStatement0, list0);
      assertFalse(ansiSqlDialect0.isKeepByteAndShort());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      String string0 = ansiSqlDialect0.forTableBuilderDoBuild("_column_");
      assertEquals("select * from _column_ where 1 = 2", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      StringBuilder stringBuilder0 = new StringBuilder(">(-*x");
      // Undeclared exception!
      try { 
        ansiSqlDialect0.forPaginate(0, 0, stringBuilder0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Your should not invoke this method because takeOverDbPaginate(...) will take over it.
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.AnsiSqlDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      MockDriver mockDriver0 = MockDriver.instance;
      MockCallableStatement mockCallableStatement0 = mockDriver0.createMockCallableStatement((MockConnection) null, (String) null);
      Object[] objectArray0 = new Object[6];
      ansiSqlDialect0.fillStatement((PreparedStatement) mockCallableStatement0, objectArray0);
      assertTrue(ansiSqlDialect0.isTakeOverModelPaginate());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      boolean boolean0 = ansiSqlDialect0.isTakeOverModelPaginate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AnsiSqlDialect ansiSqlDialect0 = new AnsiSqlDialect();
      boolean boolean0 = ansiSqlDialect0.isTakeOverDbPaginate();
      assertTrue(boolean0);
  }
}
