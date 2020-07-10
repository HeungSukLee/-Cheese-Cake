class ExceptionEx01 { // try문, catch문 안에 try catch문이 들어갈 수 있다.

    public static void main(String[] args)
    {
        try  {
            try	{	} catch (Exception e)	{ }
        } catch (Exception e)	{
           // try	{	} catch (Exception e) { }	// 에러. 변수 e가 중복 선언되었다.
        } // try-catch의 끝

        try  {

        } catch (Exception e)	{

        } // try-catch의 끝
    }	// main메서드의 끝
}