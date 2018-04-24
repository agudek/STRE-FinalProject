/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:51:16 GMT 2018
 */

package com.jfinal.plugin.ehcache;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.plugin.ehcache.RenderInfo;
import com.jfinal.render.FreeMarkerRender;
import com.jfinal.render.HtmlRender;
import com.jfinal.render.JsonRender;
import com.jfinal.render.JspRender;
import com.jfinal.render.Render;
import com.jfinal.render.VelocityRender;
import com.jfinal.render.XmlRender;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class RenderInfo_ESTest extends RenderInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[7];
      JsonRender jsonRender0 = new JsonRender(stringArray0);
      RenderInfo renderInfo0 = new RenderInfo(jsonRender0);
      HashMap<String, FreeMarkerRender> hashMap0 = new HashMap<String, FreeMarkerRender>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>(hashMap0);
      hashMap1.put("attrs", "attrs");
      renderInfo0.otherPara = (Map<String, Object>) hashMap1;
      // Undeclared exception!
      try { 
        renderInfo0.createRender();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to [Ljava.lang.String;
         //
         verifyException("com.jfinal.plugin.ehcache.RenderInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[34];
      JsonRender jsonRender0 = new JsonRender(stringArray0);
      jsonRender0.forIE();
      RenderInfo renderInfo0 = new RenderInfo(jsonRender0);
      JsonRender jsonRender1 = (JsonRender)renderInfo0.createRender();
      assertTrue(jsonRender1.getForIE());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[34];
      JsonRender jsonRender0 = new JsonRender(stringArray0);
      RenderInfo renderInfo0 = new RenderInfo(jsonRender0);
      JsonRender jsonRender1 = (JsonRender)renderInfo0.createRender();
      assertFalse(jsonRender1.getForIE());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JsonRender jsonRender0 = new JsonRender("r3~");
      RenderInfo renderInfo0 = new RenderInfo(jsonRender0);
      JsonRender jsonRender1 = (JsonRender)renderInfo0.createRender();
      assertEquals("r3~", jsonRender1.getJsonText());
      assertFalse(jsonRender1.getForIE());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VelocityRender velocityRender0 = new VelocityRender("\"c;R*A'Qb'ib^}K\")");
      RenderInfo renderInfo0 = new RenderInfo(velocityRender0);
      Integer integer0 = new Integer((-1277));
      renderInfo0.renderType = integer0;
      // Undeclared exception!
      try { 
        renderInfo0.createRender();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CacheInterceptor can not support the renderType of the value : -1277
         //
         verifyException("com.jfinal.plugin.ehcache.RenderInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JsonRender jsonRender0 = new JsonRender();
      RenderInfo renderInfo0 = new RenderInfo(jsonRender0);
      Integer integer0 = new Integer(4);
      renderInfo0.renderType = integer0;
      Render render0 = renderInfo0.createRender();
      assertEquals("UTF-8", render0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JsonRender jsonRender0 = new JsonRender();
      RenderInfo renderInfo0 = new RenderInfo(jsonRender0);
      JsonRender jsonRender1 = (JsonRender)renderInfo0.createRender();
      assertFalse(jsonRender1.getForIE());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JsonRender jsonRender0 = new JsonRender("application/json; charset=");
      RenderInfo renderInfo0 = new RenderInfo(jsonRender0);
      renderInfo0.otherPara = null;
      // Undeclared exception!
      try { 
        renderInfo0.createRender();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.RenderInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VelocityRender velocityRender0 = new VelocityRender("\"c;R*A'Qb'ib^}K\")");
      RenderInfo renderInfo0 = new RenderInfo(velocityRender0);
      Render render0 = renderInfo0.createRender();
      assertFalse(render0.getDevMode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JspRender jspRender0 = new JspRender("8-0yIZzNlx1pvv4)(");
      RenderInfo renderInfo0 = new RenderInfo(jspRender0);
      Render render0 = renderInfo0.createRender();
      assertEquals("UTF-8", render0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HtmlRender htmlRender0 = new HtmlRender("VtDEi{cr.S)c4!@Wtk");
      RenderInfo renderInfo0 = null;
      try {
        renderInfo0 = new RenderInfo(htmlRender0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // CacheInterceptor can not support the render of the type : com.jfinal.render.HtmlRender
         //
         verifyException("com.jfinal.plugin.ehcache.RenderInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlRender xmlRender0 = new XmlRender("YG?P[!]o*_Y/8x");
      RenderInfo renderInfo0 = new RenderInfo(xmlRender0);
      Render render0 = renderInfo0.createRender();
      assertFalse(render0.getDevMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RenderInfo renderInfo0 = null;
      try {
        renderInfo0 = new RenderInfo((Render) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Render can not be null.
         //
         verifyException("com.jfinal.plugin.ehcache.RenderInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FreeMarkerRender freeMarkerRender0 = new FreeMarkerRender("I");
      RenderInfo renderInfo0 = new RenderInfo(freeMarkerRender0);
      Render render0 = renderInfo0.createRender();
      assertNotSame(freeMarkerRender0, render0);
  }
}
