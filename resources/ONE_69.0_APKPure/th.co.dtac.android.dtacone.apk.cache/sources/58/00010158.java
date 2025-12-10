package org.bson;

/* loaded from: classes6.dex */
public class BSONException extends RuntimeException {
    private static final long serialVersionUID = -4415279469780082174L;
    private Integer errorCode;

    public BSONException(String str) {
        super(str);
        this.errorCode = null;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public boolean hasErrorCode() {
        if (this.errorCode != null) {
            return true;
        }
        return false;
    }

    public BSONException(int i, String str) {
        super(str);
        this.errorCode = null;
        this.errorCode = Integer.valueOf(i);
    }

    public BSONException(String str, Throwable th2) {
        super(str, th2);
        this.errorCode = null;
    }

    public BSONException(int i, String str, Throwable th2) {
        super(str, th2);
        this.errorCode = null;
        this.errorCode = Integer.valueOf(i);
    }
}