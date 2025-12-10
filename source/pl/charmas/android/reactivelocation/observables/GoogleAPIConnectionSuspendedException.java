package pl.charmas.android.reactivelocation.observables;

/* loaded from: classes5.dex */
public class GoogleAPIConnectionSuspendedException extends RuntimeException {
    private final int cause;

    public GoogleAPIConnectionSuspendedException(int i) {
        this.cause = i;
    }

    public int getErrorCause() {
        return this.cause;
    }
}
