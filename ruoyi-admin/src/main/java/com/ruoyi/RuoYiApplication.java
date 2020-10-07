package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
//        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
//                " .-------.       ____     __        \n" +
//                " |  _ _   \\      \\   \\   /  /    \n" +
//                " | ( ' )  |       \\  _. /  '       \n" +
//                " |(_ o _) /        _( )_ .'         \n" +
//                " | (_,_).' __  ___(_ o _)'          \n" +
//                " |  |\\ \\  |  ||   |(_,_)'         \n" +
//                " |  | \\ `'   /|   `-'  /           \n" +
//                " |  |  \\    /  \\      /           \n" +
//                " ''-'   `'-'    `-..-'              ");
        System.out.println(
              "        ____.                 _________               __                  \n" +
                        "    |    | ____________   /   _____/__.__. _______/  |_  ____   _____  \n" +
                        "    |    |/     \\_  __ \\  \\_____  <   |  |/  ___/\\   __\\/ __ \\ /     \\ \n" +
                        "/\\__|    |  Y Y  \\  | \\/  /        \\___  |\\___ \\  |  | \\  ___/|  Y Y  \\\n" +
                        "\\________|__|_|  /__|    /_______  / ____/____  > |__|  \\___  >__|_|  /\n" +
                        "               \\/                \\/\\/         \\/            \\/      \\/"


                );
        System.out.println("(♥◠‿◠)ﾉﾞ  JMR人岗匹配系统启动成功   ლ(´ڡ`ლ)ﾞ  \n");

    }
}