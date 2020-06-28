import java.util.Scanner;

public class HeroGame {
    public static void main(String[] args) {
        //     System.out.println("1.李白 2。兰陵王");
        //     Scanner scanner = new Scanner(System.in);
        //     int heroIndex = scanner.nextInt();
        /*if (heroIndex == 1) {
            System.out.println("您选择的英雄是:李白");
        } else if (heroIndex == 2) {
            System.out.println("您选择的英雄是:兰陵王");
        }else{
            System.out.println("没有该英雄！");
        }*/
        /*switch (heroIndex) {
            case 1:
                System.out.println("您选择的英雄是:李白");
                break;
            case 2:
                System.out.println("您选择的英雄是:兰陵王");
                break;
            default:
                System.out.println("没有该英雄！");
                break;*/
        /*boolean flag =true;
        while (flag) {
            heroIndex = scanner.nextInt();
            switch (heroIndex) {
                case 1:
                    System.out.println("您选择的英雄是:李白");
                    break;
                case 2:
                    System.out.println("您选择的英雄是:兰陵王");
                    break;
                default:
                    System.out.println("没有该英雄！");
                    flag =false;
                    break;*/
      /*  int i = 0;
        while (i<5) {
            System.out.println("执行了第" + i +"次");
            i++;
        }*/
        /*int i = 0;
        do {
            System.out.println("执行了第" + i + "次");
            i++;
        } while (i < 5);*/
        /*int i = 0;
        do {
            System.out.println("执行了第" + i + "次");
            i++;
        } while (i != 0);*/
        /*for (int i = 0; i < 5; i++) {
            System.out.println("执行了第" + i + "次");
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("^^^^^");*/
        //展示台
        System.out.println("请输入您的英雄:");
        System.out.println("1.程咬金 2。后羿");
        String heroName = "";
        int blood = 300;
        int heroAttack = 40;

        //定义怪物
        String boos1 = "主宰";
        String boos2 = "暴君";
        int boos2Attack = 20;
        int boos2Blood =400;
        //控制台输入
        Scanner scanner = new Scanner(System.in);
        int heroIndex = scanner.nextInt();

        switch (heroIndex) {
            case 1:
                heroName = "程咬金";
                break;
            case 2:
                heroName = "后羿";
                break;
            default:
                System.out.println("您选择的编码没有英雄，系统即将退出！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
        }
        System.out.println("您选择的英雄是: " + heroName);


        //输入所打的怪物
        System.out.print("请输入您要打的怪物名称: ");
        String boss = scanner.next();
        switch (boss) {
            case "主宰":
                System.out.println("您被主宰干死了");
                break;
            case "暴君":
                System.out.println("您开始被暴君狂揍");
                //通过判断 暴君和英雄的血量 循环是否继续 如果都有血才继续打
                while (blood > 0 && boos2Blood >0){
                    //不要去理解原理，这就是一个使用随机数生成原理 生成20 到50 攻击力的方法

                    boos2Attack = (int) (Math.random() * 20 + 50);
                    heroAttack = (int) (Math.random() * 20 + 56);
                    //不要理解，能让程序睡一秒
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    blood -= boos2Attack;
                       boos2Blood -= heroAttack;
                       System.out.println("您被揍了" + boos2Attack + "滴血,剩余血量:"+(blood <=0 ? 0 : blood )) ;
                       System.out.println("暴君被你揍了" + heroAttack +"滴血。剩余血量:"+(boos2Blood <=0 ? 0 : boos2Blood));
                    }
                if (blood <=0) {
                    System.out.println("您已阵亡,游戏结束");
                }
                if (boos2Blood <= 0){
                    System.out.println("暴君被击杀，游戏退出");
                }
                System.exit(0);
                break;
            default:
                System.out.println("您选择的编码没有英雄，系统即将退出！");

                for (int i = 5; i > 0; i--) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("倒计时:" + i + "秒！");
                }
        }
    }
}
