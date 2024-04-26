//G22940
//メイン
package kadai3;

public class p2_3_kadai3 {
    public static void main(String [] args){
        CDList cl = new CDList(); //インスタンス生成
        String titleDB [] = new String [3]; //タイトルを格納
        titleDB[0] = "Sheer Heart Attack";
        titleDB[1] = "A Night at the Opera";
        titleDB[2] = "A Day at the Races";
        cl.setCDtitleList(titleDB);

        try{
            int query_id = 1; //作品番号
            cl.getCDtitleWithNumber(query_id);
            System.out.println("The " + query_id + " th album is " + cl.getCDtitleWithNumber(query_id) + ".");

            String quety_cd = "Paradigms";
            cl.getNumberWithCDtitle(quety_cd);
            System.out.println(quety_cd + " is the " + cl.getNumberWithCDtitle(quety_cd) + " th album.");
        }
        catch(NumberNotInCollectionException e){
            e.printStackTrace();
        }
        catch(TitleNotInCollectionException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Search finished.");
        }
    }
}
