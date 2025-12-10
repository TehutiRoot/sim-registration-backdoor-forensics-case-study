package p046rx.exceptions;

/* renamed from: rx.exceptions.UnsubscribeFailedException */
/* loaded from: classes5.dex */
public final class UnsubscribeFailedException extends RuntimeException {
    private static final long serialVersionUID = 4594672310593167598L;

    public UnsubscribeFailedException(Throwable th2) {
        super(th2 == null ? new NullPointerException() : th2);
    }

    public UnsubscribeFailedException(String str, Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }
}