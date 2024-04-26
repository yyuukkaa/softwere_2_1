//G22940
//検索した作品番号が存在していない場合の例外
package kadai3;

public class NumberNotInCollectionException extends Exception{
    public NumberNotInCollectionException(int query_num, int dbSize){
        // query_num = 検索したい作品番号
        // dbSize = 発売されたCDタイトルの総数
        super("Number: " + query_num + " is out of range in the collection. The number should be selected ranging from 1 " + "to " + dbSize + ".");
    }
}
