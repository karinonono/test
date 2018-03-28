document.write("Hello World<br>");
/*javascriptとjavaはまったく違うプログラミング言語です。間違えやすいので気をつけてください。*/
document.write("-2017年<br>");
//3月15日に書きました。
var name="高橋";
document.write(name);
var a=3+3;
document.write(a);               
var a=3;
if(a<10&&a>3){
    
document.write("A");}
document.write("<br>");
var b=11;
if(b<=5||b>=10){
    
document.write("b")}
document.write("<br>");
var a=8;
if(a>7){
    
document.write("A");}
else if(a<10){
    
document.write("B");}
document.write("<br>");
var a=10;
if(a>10){
document.write("A");}
else{
document.write("Z");}
document.write("<br>");
var a=5;
if(a>=20){
document.write("成人");}
else{
document.write("未成年")}
document.write("<br>");
var a=11;
if(a>10){
if(a<30){
document.write("A");}}
document.write("<br>");
var age=20;
if(age<20){
document.write("未成年");}
else{
document.write("成人");}
document.write("<br>");

var age=40;
if(age<20){
document.write("未成年");}
else if(age>80){
document.write("高齢者");}
else{
document.write("成人")}
document.write("<br>");

var age=30;
if(age<20){
document.write("未成年");}
else if(age>=20&&age<=80){
document.write("成人");}
else{
document.write("高齢者");}
document.write("<br>");

var a=55;
if(a%2==0){
document.write("偶数");}
else{
document.write("奇数");}
document.write("<br>");

var kokugo=9;
var suugaku=6;
if(kokugo>=70){
    if(suugaku>=70){
        document.write("合格");}
    else{
        document.write("不合格");
    }}




document.write("<br>");

var a=3;
if(a>1){
    if(a==2){
        document.write("A");}
else if(a==3){
    document.write("B");}
else{
    document.write("C");}}
document.write("<br>");

var a=1;
switch(a){
    case 0:("aは0に等しい");
    document.write("aは0に等しい");
         break;

    case 1:
    document.write("aは１に等しい");
　　　　　　break;}

document.write("<br>");

var a=6;
switch(a){
    case 0:
        document.write("aは0に等しい");
        break;

    case 1:
        document.write("aは1に等しい");
        break;
        
    default:
        document.write("aは0でも1でもない");}

document.write("<br>");

var a="午後";
switch(a){
    case "赤":
        document.write("赤組です");
        break;

    case "白":
        document.write("白組です");
        break;}

document.write("<br>")

for(var i=1;i<=5;i++){
    document.write(i);}

document.write("<br>")

for(var i=1;i<=10;i++){
    if(i%2==0){
        document.write(i+"<br>");}}

for(var i=1;i<=10;i++){
    if(i%2==0){
        document.write(i+"<br>");}}

for(var i=1;i<=2;i++){
    document.write("■外側のfor文"+i+"回目<br>");
        for(var a=1;a<=3;a++){
            document.write("内側のfor文"+a+"回目<br>");}}

document.write("<br>");

var i=5;
while(i>0){
document.write(i);
i--;}

document.write("<br>");

var myoji={"A組":"田中","B組":"高橋","C組":"斉藤"};
document.write(myoji["A組"]);

document.write("<br>");

var myoji=["田中","高橋","斉藤"];
myoji.unshift("鈴木");
document.write(myoji);

document.write("<br>");

var myoji=["田中","高橋","斉藤"];
myoji.push("鈴木");
document.write(myoji);



        
        
        
        
        
        
        


