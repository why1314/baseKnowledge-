package demo;


/**
 * @author wz
 * @create 2019-02-12 20:19
 */
public class demo05 {
    public static void main(String[] args) {
//       String的+=的拼接时间
        String s = new String();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

//        StringBuilder的拼接时间
        StringBuilder builder = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

    }
}
