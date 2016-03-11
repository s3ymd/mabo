package jp.co._3sss.mabo;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class MaboDofuTest {

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void writesTextToSystemOut() {
    new MaboDofu().showRecipe();
    String expected = "・麻婆豆腐の作り方\nフライパンに油をひく\nひき肉を炒める\n豆板醤を入れる\n豆腐を入れる\n完成！\n";
    assertEquals(expected, systemOutRule.getLog());
  }
}
