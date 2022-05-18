package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-18
 * Time: 0:38
 */
public class Adminer extends User {
    public Adminer(String name) {
        super(name);
        this.iOperations=new IOperation[] {
                new ExitOperation(),
                new DisplatOperation(),
                new FindOperation(),
                new AddOperation(),
                new DeltOperation()
        };
    }

    public int menu() {
        System.out.println("hello "+name);
        System.out.println("1.显示图书");
        System.out.println("2.查找图书");
        System.out.println("3.添加图书");
        System.out.println("4.删除图书");
        System.out.println("0.退出系统");
        System.out.println("请输入你的操作》");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
