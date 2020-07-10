// try with rescource문
// try구문안에 객체를 생성하는 문장을 넣으면
// 나중에 자동으로 close()가 호출이 된다
// but close도 예외를 발생시킬 수 있다.


class TryWithResourceEx {
    public static void main(String args[]) {

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false); // 예외가 발생하지 않는다.
        } catch(WorkException e) {
            e.printStackTrace();
        } catch(CloseException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true); // 예외가 발생한다.
        } catch(WorkException e) {
            e.printStackTrace();
        } catch(CloseException e) {
            e.printStackTrace();
        }
    } // main의 끝
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork("+exception+")가 호출됨");

        if(exception)
            throw new WorkException("WorkException발생!!!");
    }

    public void close() throws CloseException {
        System.out.println("close()가 호출됨");
        throw new CloseException("CloseException발생!!!");
    }
}

//WorkException과 CloseException생성

class WorkException extends Exception {
    WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
    CloseException(String msg) { super(msg); }
}