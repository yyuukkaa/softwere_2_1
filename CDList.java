//G22940
//管理システム
package kadai3;

public class CDList {
    private String [] m_titleDB; //CDタイトルが格納された配列
    public void setCDtitleList(String[] array){
        //CDタイトルデータベース（m_title）を設定するメソッド
        m_titleDB = array;
    }
    public String getCDtitleWithNumber(int num) throws NumberNotInCollectionException{
        //検索タイトルに対応するCDタイトルを返すメソッド
        //num = 作品番号
        if(num < 1 || num > m_titleDB.length){
            throw new NumberNotInCollectionException(num, m_titleDB.length);
        }
        return m_titleDB[num-1]; //CDタイトルを返す
    } 
    public int getNumberWithCDtitle(String title) throws TitleNotInCollectionException{
        //CDタイトルに対応する作品番号を返すメソッド
        
        for(int i = 0; i<m_titleDB.length; i++){
            if(title.equals(m_titleDB[i])){
                return i+1;
            }
        }
        throw new TitleNotInCollectionException(title);
    }
}
