package com.novacom;

import com.novacom.mouse.MouseClass;
import com.novacom.mouse.classes.Table;

public class Main {

    public static void main(String[] args) {
        MouseClass mouse = new MouseClass();
        Table table = new Table(mouse.getPointRow(), mouse.getPointColumn());
        table.DrawTable(mouse.getPointRow(), mouse.getPointColumn());
        mouse.MoveDown();
        System.out.println("______________");
        table.DrawTable(mouse.getPointRow(), mouse.getPointColumn());
        mouse.MoveLeft();
        System.out.println("______________");
        table.DrawTable(mouse.getPointRow(), mouse.getPointColumn());

    }//commited first time in idea
}
