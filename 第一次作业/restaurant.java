import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {
        System.out.println("欢迎国民饭店，这是今天的菜单");
        menusystem menu = new menusystem();
        for (int i = 0; i < 5; i++) {
            System.out.println(menu.c[i] + "." + menu.b[i] + " " + menu.a[i] + "元");

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想点菜的序号");
        int f = sc.nextInt();
        System.out.println("你一共选择了：");
        System.out.println(menu.b[f - 1] + " " + menu.a[f - 1] + "元" + " " + "共计" + menu.a[f - 1] + "元");
        System.out.println("还有需要要点的菜吗？");
        for (int j = 0; j < 5; j++) {
            System.out.println(menu.c[j] + "." + menu.b[j] + " " + menu.a[j] + "元");
        }
        System.out.println("请输入你想点菜的序号");
        int k = sc.nextInt();
        System.out.println("你一共选择了：");
        System.out.println(menu.b[f - 1] + " " + menu.a[f - 1] + "元" + " ");
        System.out.println(menu.b[k - 1] + " " + menu.a[k - 1] + "元" + " " + "共计" + (menu.a[f - 1] + menu.a[k - 1]) + "元");

        System.out.println("请选择支付方式:");
        String[] d = {"支付宝", "微信", "刷脸支付"};
        System.out.println(menu.c[0] + "." + d[0] + menu.c[1] + "." + d[1] + menu.c[2] + "." + d[2]);
        int q = sc.nextInt();
        if (q <= 1) {
            System.out.print("支付宝" +" "+ "请出示付款码");}
            if (1 < q && q <= 2) {
                System.out.println("微信" +" "+ "请出示付款码");}
                if(2<q&&q<=3){
                    System.out.println("请正对刷脸机");
                }

                System.out.println("支付成功，请等候用餐");
            }
        }


