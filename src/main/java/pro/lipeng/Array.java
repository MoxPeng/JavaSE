package pro.lipeng;

public class Array {
    public static void main(String[] args) {


        lightOn();
    }


    public static void lightOn() {

        boolean[] lights = new boolean[101];

        //第一次按下所有的开关开灯
        for (int i = 1; i < 101; i++) {
            lights[i] = true;
        }

        //指定的倍数按开关
        for (int i = 1; i < 101; i++) {

            for (int j = 2; j <101 ; j++) {
                if (i % j == 0) {
                    lights[i] = !lights[i];
                }
            }

        }

        for (int i = 1; i < 101; i++) {

            if (lights[i]) {
                System.out.println("编号---" + i + "---亮着");
            }
        }


    }
}
