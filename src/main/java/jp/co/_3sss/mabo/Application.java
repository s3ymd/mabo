/*
 * テンプレートメソッドの説明用
 */
package jp.co._3sss.mabo;

public class Application {
  public static void main(String[] args) {
    // 麻婆豆腐のレシピを表示
    new MaboDofu().showRecipe();
    // 麻婆春雨のレシピを表示
    new MaboHarusame().showRecipe();
  }
}
