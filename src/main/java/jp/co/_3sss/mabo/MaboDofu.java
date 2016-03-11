package jp.co._3sss.mabo;

/**
 * 麻婆豆腐のレシピを表示するクラス
 */
public class MaboDofu extends Mabo {

  public MaboDofu() {
    super("麻婆豆腐");
  }

  // @Overrideアノテーションを付けることで、
  // 誤ったオーバーライドを防止できる
  // （正しくオーバーライドしていない場合はコンパイルエラーが発生）
  @Override
  protected void main() {
    System.out.println("豆腐を入れる");
  }

}