package com.javademo.basic._9_2_object_demo;

import java.util.Scanner;

public class ShoppingCarDemo {
    // 根据目前所学，模拟简易购物车模块demo
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];

        input:
        while (true) {
            System.out.println("请选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询购物车：query");
            System.out.println("修改商品购买数量：updateNum");
            System.out.println("结算购买商品金额：pay");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入命令：");
            String command = sc.next();

            switch (command) {
                case "add":
                    addGoods(sc, shopCar);
                    break;
                case "query":
                    queryShopCar(shopCar);
                    break;
                case "updateNum":
                    updateGoodsNum(sc, shopCar);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break input;
                default:
                    System.out.println("输入命令有误！");
                    break;
            }
        }
    }

    public static void addGoods(Scanner sc, Goods[] shopCar) {
        System.out.println("请输入商品名称：");
        String goodsName = sc.next();
        System.out.println("请输入商品描述：");
        String goodsDesc = sc.next();
        System.out.println("请输入商品价格：");
        double goodsPrice = sc.nextDouble();
        System.out.println("请输入商品数量：");
        int goodsNum = sc.nextInt();
        System.out.println("请输入商品编号（不允许重复）：");
        int goodsId = sc.nextInt();

        Goods goods = new Goods();
        goods.name = goodsName;
        goods.desc = goodsDesc;
        goods.price = goodsPrice;
        goods.num = goodsNum;
        goods.id = goodsId;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = goods;
                break;
            }
        }

        System.out.println("=====商品：" + goodsName + " 添加成功！=====");
    }

    public static void queryShopCar(Goods[] shopCar) {
        String goods = "";

        System.out.println("========查询购物车内商品如下========");

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                break;
            }
            goods += ("第" + (i + 1) + "个商品：" + "\n商品名称：" + shopCar[i].name + "\n商品描述：" + shopCar[i].desc + "\n商品价格：" + shopCar[i].price + "\n商品数量：" + shopCar[i].num + "\n商品编号：" + shopCar[i].id + "\n\n");
        }

        System.out.println(goods);
    }

    public static void updateGoodsNum(Scanner sc, Goods[] shopCar) {
        System.out.println("请输入要修改的商品编号：");
        int id = sc.nextInt();

        Goods goods = getGoodsById(shopCar, id);

        if (goods == null) {
            System.out.println("=====未查询到该编号商品！=====");
        } else {
            System.out.println("请输入商品 " + goods.name + " 新的购买数量：");
            int num = sc.nextInt();
            goods.num = num;
            System.out.println("=====修改成功！=====");
        }
    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if (g.id == id) {
                    return shopCar[i];
                }
            } else {
                return null;
            }
        }
        return null;
    }

    public static void payGoods(Goods[] shopCar) {
        queryShopCar(shopCar);

        int totalPrice = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (shopCar[i] == null) {
                break;
            }
            totalPrice += g.price * g.num;
        }

        System.out.println("订单总金额为：" + totalPrice + "元");
    }


}
