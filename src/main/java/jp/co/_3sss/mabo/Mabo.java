package jp.co._3sss.mabo;

/**
 * 麻婆豆腐や麻婆春雨のレシピを表示するためのクラス
 * 
 * 「テンプレートメソッド」パターンを使用して、 前後の処理を共通化します。
 * サブクラスではmainメソッドをオーバーライドし、各料理の独自の手順を出力してください。
 */
public abstract class Mabo {
  protected String title;

  // 料理に必ずタイトルが伴うことを保証するため、
  // コンストラクタでタイトルを設定する。
  public Mabo(String title) {
    this.title = title;
  }

  // テンプレートメソッド。
  // サブクラスでステップを変更できないよう、finalにしてもよい。
  public final void showRecipe() {
    title();
    setup();
    main();
    complete();
  }

  // テンプレートメソッドから呼び出されるメソッドは、
  // 個別に呼び出す必要がない場合は、protecetdにしてもよい。
  protected void title() {
    System.out.printf("・%sの作り方\n", title);
  }

  protected void setup() {
    System.out.println("フライパンに油をひく");
    System.out.println("ひき肉を炒める");
    System.out.println("豆板醤を入れる");
  }

  // 各料理の独自の手順を出力
  protected abstract void main();

  protected void complete() {
    System.out.println("完成！");
  }
}