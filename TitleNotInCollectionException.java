//G22940
//検索CDタイトルを保有してない時の例外
package kadai3;

public class TitleNotInCollectionException extends Exception{
    public TitleNotInCollectionException(String title){
        //検索CDタイトルを保有していない場合に呼ばれる例外
        // title = 検索したいCDタイトル
        super(title + " is not in the collection.");
    }
}
