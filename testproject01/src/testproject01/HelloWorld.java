package testproject01;

public class HelloWorld {

	public static void main(String[] args) {
		// Hello World! の出力
		System.out.println("2018/03/28\r\njavaの学習開始\r\n\r\n");

		String name="狩野";
		System.out.println(name);
		String str1="鈴木";
		System.out.println(str1);
		String str2="佐藤";
		System.out.println(str2);
		String tel="090-1234-5678";
		System.out.println(tel);
		char char1='Z';
		System.out.println(char1);
		int num1=123;
		System.out.println(num1);
		boolean boo=true;
		System.out.println(boo);
		int a=231+924;
		System.out.println(a);
		String b="3+3";
		System.out.println(b);
		char mozi='は';
		System.out.println(mozi);
		String yamada="山田";
		System.out.println(yamada+"だよ");
		System.out.println("java5");
		int ab=-3+7;
		System.out.println(ab);
		int ac=300/10;
		System.out.println(ac);
		int ad=0/100;
		System.out.println(ad);
		int ae=8/3;
		System.out.println(ae);
        float af=(float)10/3;
        System.out.println(af);
        double ag=(double)7347547/3;
        System.out.println(ag);
        int ah=7%3;
        System.out.println(ah);
        System.out.println(98+2);
        System.out.println(5%2);
        //前置加算子･後置加算子
        int ai=48;
        System.out.println(ai++);
        System.out.println(ai++);
        System.out.println(ai++);
        System.out.println(++ai);
        System.out.println(ai++);
        String aj="山田";
        //if文
        if(aj.equals("山田")){
        	System.out.println(aj+"さん");}
        int ak=5;
        if(ak<10&&a>3){
        	System.out.println("A");}
        int al=0;
        if(al>=5||al<=0){

        System.out.println("b");}
        int am=7;
        if(am>=8){
        System.out.println("A");}
        else if(am<=10){

        System.out.println("B");}
        int an=11;
        if(an>8){
        	System.out.println("A");}
        else if(an<10){
        	System.out.println("B");}
        int ao=3;
        if(ao>5){
        	System.out.println("A");}
        else{
        	System.out.println("Z");}
        int ap=5;
        if(ap<8){
        	System.out.println("A");}
        else if(ao==8){
        	System.out.println("B");}
        else{
        	System.out.println("C");}
        int aq=20;
        if(aq>=20){
        	System.out.println("成人");}
        else{
        	System.out.println("未成年");}
        int age1=87;
        if(age1<20){
        	System.out.println("未成年");}
        else if(age1>80){
        	System.out.println("高齢者");}
        else{
        	System.out.println("成人");}
        int age2=50;
        if(age2<20){
        	System.out.println("未成年");}
        else if(age2>=20&&age2<=80){
            System.out.println("成人");}
        else{
            System.out.println("高齢者");}
        int ar=475757573;
        if(ar%2==0){
        	System.out.println("偶数");}
        else{
        	System.out.println("奇数");}
        int as=11;
        if(as>10){
        	if(as<30){
        		System.out.println("A");}
        }
        int at=7;
        if(at>3){
        	if(at<10){
        	    System.out.println("A");}
        }
        int au=29;
        if(au>10){
        	if(au<30){
        		System.out.println("A");}
        }
        int av=5;
        if(av>0){
        	if(av==2){
        		System.out.println("A");}
        	else if(av==3){
        		System.out.println("B");}
        else{
        	System.out.println("C");}
        }
        int aw=110;
        if(aw<=100){
        	if(aw<20){

        	System.out.println("未成年");}
        	else if(aw==77){

        	System.out.println("喜寿");}
        	else if(aw==88){

        	System.out.println("米寿");}
        	else{

        	System.out.println("成人");}
        }
        //switch文
        int ax=0;
        switch(ax){
        case 0:
        	System.out.println("axは0に等しい");
        	break;
        case 1:
        	System.out.println("axは1に等しい");
        	break;
        }
        int ay=0;
        switch(ay){
        case 0:
        	System.out.println("ayは0に等しい");
            break;
        case 1:
        	System.out.println("ayは1に等しい");
        	break;
        default:
        	System.out.println("ayは0でも1でもない");
        }
        String az="赤";
        switch(az){
        case "赤":
        	System.out.println("赤組です");
        	break;
        case "白":
        	System.out.println("白組です");
        	break;
        }
        String ba="白";
        switch(ba){

        case "赤":
            System.out.println("赤組です");
            break;
        case "白":
        	System.out.println("白組です");
        	break;
        default:
        	System.out.println("エラーです");
        }
        //配列･基礎
        //書き方1
        String[] name1=new String[3];
        name1[0]="田中";
        name1[1]="高橋";
        name1[2]="斉藤";
        System.out.println(name1[1]);
        //書き方2
        String[] name2={"田中","高橋","斉藤"};
        System.out.println(name2[0]);
        //キャラ型　''で囲む
        char[] c={'x','y','g'};
        System.out.println(c[0]);
        //int型　囲み無し
        int[] bb={1,43,744};
        System.out.println(bb[2]);
        //データの更新
        String[] bc={"田中","高橋","斉藤"};
        bc[0]="加藤";
        System.out.println(bc[0]);
        //多次元配列
        String[][] country={
        		{"日本","タイ"},
        		{"アメリカ","ブラジル"},
        		{"フランス","ロシア"}
        };
        System.out.println(country[1][1]);
        //『配列･基礎』の書き方1のような通常の変数と要素数を先に定義したあとにインデックス付きの変数に値を代入していくことできる
        String[][] country2=new String[3][2];
        country2[0][0]="日本";
        country2[0][1]="タイ";
        country2[1][0]="アメリカ";
        country2[1][1]="ブラジル";
        country2[2][0]="フランス";
        country2[2][1]="ロシア";
        System.out.println(country[0][0]);
        //for文(ループ処理)基礎


       }

}