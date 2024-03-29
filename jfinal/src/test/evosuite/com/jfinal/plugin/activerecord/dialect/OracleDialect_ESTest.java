/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 11:48:37 GMT 2018
 */

package com.jfinal.plugin.activerecord.dialect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.druid.mock.MockCallableStatement;
import com.alibaba.druid.mock.MockConnection;
import com.alibaba.druid.mock.MockDriver;
import com.alibaba.druid.mock.MockPreparedStatement;
import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidConnectionHolder;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.alibaba.druid.pool.DruidPooledPreparedStatement;
import com.alibaba.druid.pool.PreparedStatementHolder;
import com.alibaba.druid.pool.PreparedStatementPool;
import com.alibaba.druid.sql.visitor.ExportParameterizedOutputVisitor;
import com.alibaba.druid.sql.visitor.SQLEvalVisitorImpl;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.Table;
import com.jfinal.plugin.activerecord.dialect.OracleDialect;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.nio.CharBuffer;
import java.sql.PreparedStatement;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class OracleDialect_ESTest extends OracleDialect_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      StringBuilder stringBuilder0 = new StringBuilder("FFREE#");
      String string0 = oracleDialect0.forPaginate((-1), (-1), stringBuilder0);
      assertEquals("select * from ( select row_.*, rownum rownum_ from (  FFREE# ) row_ where rownum <= 1) table_alias where table_alias.rownum_ > 2", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      StringBuilder stringBuilder0 = new StringBuilder("\"YGH");
      String string0 = oracleDialect0.forPaginate(0, 3143, stringBuilder0);
      assertEquals("select * from ( select row_.*, rownum rownum_ from (  \"YGH ) row_ where rownum <= 0) table_alias where table_alias.rownum_ > -3143", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      MockDriver mockDriver0 = MockDriver.instance;
      Properties properties0 = new Properties();
      MockConnection mockConnection0 = new MockConnection(mockDriver0, "+", properties0);
      String[] stringArray0 = new String[6];
      MockPreparedStatement mockPreparedStatement0 = (MockPreparedStatement)mockConnection0.prepareStatement("", stringArray0);
      oracleDialect0.fillStatement((PreparedStatement) mockPreparedStatement0, (Object[]) stringArray0);
      assertEquals("", mockPreparedStatement0.getSql());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      ExportParameterizedOutputVisitor exportParameterizedOutputVisitor0 = new ExportParameterizedOutputVisitor();
      List<Object> list0 = exportParameterizedOutputVisitor0.getParameters();
      oracleDialect0.fillStatement((PreparedStatement) null, list0);
      assertFalse(oracleDialect0.isTakeOverDbPaginate());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLEvalVisitorImpl sQLEvalVisitorImpl0 = new SQLEvalVisitorImpl();
      List<Object> list0 = sQLEvalVisitorImpl0.getParameters();
      Locale locale0 = Locale.FRANCE;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      // Undeclared exception!
      try { 
        oracleDialect0.forModelUpdate((Table) null, (Map<String, Object>) null, set0, stringBuilder0, list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.OracleDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      StringBuilder stringBuilder0 = new StringBuilder();
      MockCallableStatement mockCallableStatement0 = new MockCallableStatement((MockConnection) null, "-g!o N'QJbB(BE0eI?p");
      List<Object> list0 = mockCallableStatement0.getOutParameters();
      // Undeclared exception!
      try { 
        oracleDialect0.forModelSave((Table) null, hashtable0, stringBuilder0, list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.OracleDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      // Undeclared exception!
      try { 
        oracleDialect0.forModelFindById((Table) null, "j'|EBYrNYw&g|\t");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.OracleDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      // Undeclared exception!
      try { 
        oracleDialect0.forModelDeleteById((Table) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.OracleDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      StringBuffer stringBuffer0 = new StringBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      Record record0 = new Record();
      // Undeclared exception!
      try { 
        oracleDialect0.forDbUpdate("E1v#CS#zkd6kqU=_h/t", (String[]) null, (Object[]) null, record0, stringBuilder0, (List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "+";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = " |h5f";
      stringArray0[4] = "";
      stringArray0[5] = "";
      StringBuilder stringBuilder0 = new StringBuilder(" where ");
      Record record0 = new Record();
      SQLEvalVisitorImpl sQLEvalVisitorImpl0 = new SQLEvalVisitorImpl();
      List<Object> list0 = sQLEvalVisitorImpl0.getParameters();
      String[] stringArray1 = new String[4];
      // Undeclared exception!
      try { 
        oracleDialect0.forDbUpdate("locate", stringArray0, stringArray1, record0, stringBuilder0, list0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.OracleDialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String[] stringArray0 = new String[4];
      Record record0 = new Record();
      MockDriver mockDriver0 = new MockDriver();
      ComboPooledDataSource comboPooledDataSource0 = new ComboPooledDataSource();
      Properties properties0 = comboPooledDataSource0.getProperties();
      MockConnection mockConnection0 = new MockConnection(mockDriver0, "n4wgctHlzSy)`w", properties0);
      MockCallableStatement mockCallableStatement0 = mockDriver0.createMockCallableStatement(mockConnection0, "");
      List<Object> list0 = mockCallableStatement0.getOutParameters();
      // Undeclared exception!
      try { 
        oracleDialect0.forDbSave("7T %^SE03", stringArray0, record0, (StringBuilder) null, list0);
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
      OracleDialect oracleDialect0 = new OracleDialect();
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        oracleDialect0.forDbFindById(" > max ", stringArray0);
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
      OracleDialect oracleDialect0 = new OracleDialect();
      // Undeclared exception!
      try { 
        oracleDialect0.forDbDeleteById(";gj KD0gPl", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "~`Y(? TdG-+";
      stringArray0[1] = "~`Y(? TdG-+";
      stringArray0[2] = "~`Y(? TdG-+";
      StringBuilder stringBuilder0 = new StringBuilder(", ");
      MockDriver mockDriver0 = new MockDriver();
      MockCallableStatement mockCallableStatement0 = mockDriver0.createMockCallableStatement((MockConnection) null, "q<gn/[6Hv-b8b");
      List<Object> list0 = mockCallableStatement0.getParameters();
      Record record0 = new Record();
      record0.set("", (Object) null);
      oracleDialect0.forDbUpdate("select * from ", stringArray0, stringArray0, record0, stringBuilder0, list0);
      assertTrue(list0.contains("~`Y(? TdG-+"));
      assertEquals(", update select * from set  = ?  where ~`Y(? TdG-+ = ? and ~`Y(? TdG-+ = ? and ~`Y(? TdG-+ = ?", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "A#6YY*g^'Sr";
      stringArray0[1] = "A#6YY*g^'Sr";
      stringArray0[2] = "A#6YY*g^'Sr";
      stringArray0[3] = "A#6YY*g^'Sr";
      stringArray0[4] = "A#6YY*g^'Sr";
      stringArray0[5] = "A#6YY*g^'Sr";
      stringArray0[6] = "A#6YY*g^'Sr";
      Record record0 = new Record();
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLEvalVisitorImpl sQLEvalVisitorImpl0 = new SQLEvalVisitorImpl();
      List<Object> list0 = sQLEvalVisitorImpl0.getParameters();
      oracleDialect0.forDbSave("A#6YY*g^'Sr", stringArray0, record0, stringBuilder0, list0);
      assertEquals("insert into A#6YY*g^'Sr() values()", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String[] stringArray0 = new String[3];
      stringArray0[0] = ", ";
      stringArray0[1] = "Vr@";
      stringArray0[2] = ":RGB~Qi#PK6EO4S.?I";
      String string0 = oracleDialect0.forDbDeleteById("Vr@", stringArray0);
      assertEquals("delete from Vr@ where , = ? and Vr@ = ? and :RGB~Qi#PK6EO4S.?I = ?", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      String string0 = oracleDialect0.forDbFindById("com.alibaba.druid.sql.ast.expr.SQLDefaultExpr", stringArray0);
      assertEquals("select * from com.alibaba.druid.sql.ast.expr.SQLDefaultExpr where  = ? and  = ?", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      boolean boolean0 = oracleDialect0.isOracle();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String string0 = oracleDialect0.getDefaultPrimaryKey();
      assertEquals("ID", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      StringBuilder stringBuilder0 = new StringBuilder(" where ");
      String string0 = oracleDialect0.forPaginate(0, 0, stringBuilder0);
      assertEquals("select * from ( select row_.*, rownum rownum_ from (   where  ) row_ where rownum <= 0) table_alias where table_alias.rownum_ > 0", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      DruidDataSource druidDataSource0 = new DruidDataSource(false);
      MockConnection mockConnection0 = new MockConnection();
      DruidAbstractDataSource.PhysicalConnectionInfo druidAbstractDataSource_PhysicalConnectionInfo0 = new DruidAbstractDataSource.PhysicalConnectionInfo(mockConnection0, 1800000L, 25200000L, 60000L, 0);
      DruidConnectionHolder druidConnectionHolder0 = new DruidConnectionHolder(druidDataSource0, druidAbstractDataSource_PhysicalConnectionInfo0);
      DruidPooledConnection druidPooledConnection0 = new DruidPooledConnection(druidConnectionHolder0);
      PreparedStatementPool.MethodType preparedStatementPool_MethodType0 = PreparedStatementPool.MethodType.M1;
      int[] intArray0 = new int[7];
      DruidPooledPreparedStatement.PreparedStatementKey druidPooledPreparedStatement_PreparedStatementKey0 = new DruidPooledPreparedStatement.PreparedStatementKey("s\u0006gLd4", "", preparedStatementPool_MethodType0, intArray0);
      MockCallableStatement mockCallableStatement0 = new MockCallableStatement(mockConnection0, "");
      PreparedStatementHolder preparedStatementHolder0 = new PreparedStatementHolder(druidPooledPreparedStatement_PreparedStatementKey0, mockCallableStatement0);
      DruidPooledPreparedStatement druidPooledPreparedStatement0 = new DruidPooledPreparedStatement(druidPooledConnection0, preparedStatementHolder0);
      // Undeclared exception!
      try { 
        oracleDialect0.fillStatement((PreparedStatement) druidPooledPreparedStatement0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      MockConnection mockConnection0 = new MockConnection();
      MockCallableStatement mockCallableStatement0 = new MockCallableStatement(mockConnection0, "select * from select * from EE L|UJRitk`^qH where rownum < 1 where rownum < 1");
      // Undeclared exception!
      try { 
        oracleDialect0.fillStatement((PreparedStatement) mockCallableStatement0, (List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.dialect.Dialect", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      String string0 = oracleDialect0.forTableBuilderDoBuild("");
      assertEquals("select * from  where rownum < 1", string0);
  }
}
