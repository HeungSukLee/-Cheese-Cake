class FinallyTest2 {
    public static void main(String args[]) {
        try {
            startInstall();        // 프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
        } catch (Exception e) {
            e.printStackTrace(); //설치와 복사 시 에러가 발생하면 이를 해결 -> 임시파일삭제
        } finally {
            deleteTempFiles();    // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        } // try-catch의 끝
    }    // main의 끝

    static void startInstall() {
        /* 프로그램 설치에 필요한 준비를 하는 코드를 적는다.*/
    }

    static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }

    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다.*/}
}