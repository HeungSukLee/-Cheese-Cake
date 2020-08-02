class Exercise8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFuctionException extends RuntimeException {
    final private int ERR_CODE;
    String Message;

    UnsupportedFuctionException(String s, int err) {
        this.Message = s;
        this.ERR_CODE=err;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "]" + Message;
    }

}