package th.p047co.dtac.android.dtacone.model.error;

/* renamed from: th.co.dtac.android.dtacone.model.error.ServerErrorException */
/* loaded from: classes8.dex */
public class ServerErrorException extends RuntimeException {
    private int code;
    private ErrorCollection error;

    public ServerErrorException(int i, ErrorCollection errorCollection) {
        super(String.format("Server error http status:%s codeType:%s code:%s desc:%s", Integer.valueOf(i), errorCollection.getCodeType(), errorCollection.getStatusCode(), errorCollection.getDescription()));
        this.code = i;
        this.error = errorCollection;
    }

    public int code() {
        return this.code;
    }

    public ErrorCollection error() {
        return this.error;
    }
}