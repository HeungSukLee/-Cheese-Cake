import java.text.SimpleDateFormat;
import java.util.Date;

class ImportTest
{
    public static void main(String[] args)
    {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("¿À´Ã ³¯Â¥´Â " + date.format(today));
        System.out.println("ÇöÀç ½Ã°£Àº " + time.format(today));
    }
}