// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        zd1();
        zd2();
        zd3();
        zd4();
        zd5();
        zd6();
        zd7();
        zd8();
        zd9();
        zd10();

    }
    public static void zd1() {
        for(int i = 1;i <=10;i = i+1 ){
            System.out.println(i);
        }
    }
    public static void zd2(){
        System.out.println();
        for(int i = 10;i >0;i = i -1){
            System.out.println(i);
        }
    }
    public static void zd3() {
        System.out.println();
        for(int i = 0;i <=17;i = i+2 ){
            System.out.println(i);
        }
    }
    public static void zd4(){
        System.out.println();
        for(int i = 10;i >-11;i = i -1){
            System.out.println(i);
        }
    }
    public static void zd5(){
        System.out.println();
        for(int i = 1904;i <=2096;i = i +4){
            System.out.println(i+" год являеться високосным");
        }
    }
    public static void zd6() {
        System.out.println();
        for(int i = 1;i <=14;i = i+1 ){
            System.out.println(i*7);
        }
    }
    public static void zd7(){
        System.out.println();
        for(int i = 1;i <=512;i = i *2){
            System.out.println(i);
        }
    }
    public static void zd8(){
        System.out.println();
        int banka = 29000;
        for(int i = 1;i <=12; i ++){
            System.out.println("Месяц "+i+", сумма накоплений равна "+banka+" рублей");
            banka = banka + 29000;
        }
    }
    public static void zd9() {
        System.out.println();
        int attechment = 29000+(29000/100);
        int bank = attechment;
        for(int i = 1;i <=12;i = i+1 ){
            System.out.println("Месяц "+i+", сумма накоплений равна "+bank+" рублей");
            bank = bank + attechment;
        }
    }
    public static void zd10(){
        System.out.println();
        for(int i = 1;i <=10;i ++){
            System.out.println("2*"+i+"="+i*2);
        }
    }
}