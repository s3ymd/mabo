package jp.co._3sss.mabo;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class MaboHarusameTest {

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void writesTextToSystemOut() {
    new MaboHarusame().showRecipe();
    String expected = "・麻婆春雨の作り方\nフライパンに油をひく\nひき肉を炒める\n豆板醤を入れる\n春雨を入れる\n完成！\n";
    assertEquals(expected, systemOutRule.getLog());
  }
}
