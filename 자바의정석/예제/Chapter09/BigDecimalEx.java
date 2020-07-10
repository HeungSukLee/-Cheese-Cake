import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.math.*;
import static java.math.BigDecimal.*;
import static java.math.RoundingMode.*;
class BigDecimalEx {
    public static void main(String[] args) throws Exception {

        BigDecimal bd1 = new BigDecimal("123.4568");
        BigDecimal bd2 = new BigDecimal("10.0");

        System.out.print("bd1="+bd1); // 123.456
        System.out.print(",\tvalue="+bd1.unscaledValue()); // 123456
        System.out.print(",\tscale="+bd1.scale()); //소수점자리 4
        System.out.print(",\tprecision="+bd1.precision()); // 전체숫자 7
        System.out.println();

        System.out.print("bd2="+bd2); //1.0
        System.out.print(",\tvalue="+bd2.unscaledValue()); //10
        System.out.print(",\tscale="+bd2.scale()); //1
        System.out.print(",\tprecision="+bd2.precision()); //2
        System.out.println();

        BigDecimal bd3 = bd1.multiply(bd2);
        System.out.print("bd3="+bd3);
        System.out.print(",\tvalue="+bd3.unscaledValue());
        System.out.print(",\tscale="+bd3.scale());
        System.out.print(",\tprecision="+bd3.precision());
        System.out.println();

        System.out.println(bd1.divide(bd2, 2, HALF_UP));
        // 12.46 // bd1을 bd2로 나눈값의 scale 을 2로 반올림
        System.out.println(bd1.setScale(2, HALF_UP));
        // 123.46 // scale2로 반올림
        System.out.println(bd1.divide(bd2, new MathContext(2, HALF_UP))); //머지

    }
}