class Sentou{
    //梅宮辰●を定義
    public static int umemiyaHp = 500;
    public static String enemy = "梅宮辰●";

    public static void main(String [] args){
        System.out.println("興奮した梅宮辰●が現れた！");

        int tarn = 1;
        while( umemiyaHp > 0){
            System.out.println("ターン" + tarn + "\n"
                             + "どうする？\n"
                             + "1.しばく 2.しゃぶる　3.逃げる　4.魔法");
            int selectNumber = new java.util.Scanner (System.in).nextInt();
            // コマンドを実行
            actionCommand(selectNumber);
            tarn += 1;
        }

        // 本当に倒したか判断する
        if(umemiyaHp <= 0){
            System.out.println("梅宮辰●を撃沈！！！");
        }
    }

    //コマンドの処理
    public static void actionCommand(int selectNumber){
        int damage = 0;
        String action = "";
        switch(selectNumber){
            case 1:
                damage = new java.util.Random().nextInt(10)+40;
                action = enemy + "をしばいた！\n" + enemy + "に" + damage +"ダメージを与えた！！"; 
                break;
            case 2:
                damage = new java.util.Random().nextInt(50)+20;
                action = enemy + "をしゃぶった！\n" + enemy + "に" + damage + "ダメージを与えた！！";
                break;
            case 3:
                action = "しかし回り込まれてしまった！";
                break;
            case 4:
                action = enemy + "に魔法をかけた！\n" + enemy + "が少し若返った！";
                break;
            default:
                action = "その入力は受け付けていません";
                break;
        }
        // コマンドの結果を出力
        System.out.println(action);

        // ダメージ計算
        umemiyaHp -= damage;
        if (umemiyaHp <= 0) {
            umemiyaHp = 0;
        }
        System.out.println("残り体力" + umemiyaHp + "\n");
    }
}