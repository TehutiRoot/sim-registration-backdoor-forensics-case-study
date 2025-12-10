package com.google.auth.oauth2;

import com.google.api.client.http.HttpResponseException;
import com.google.auth.Retryable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class GoogleAuthException extends IOException implements Retryable {
    private final boolean isRetryable;
    private final int retryCount;

    public GoogleAuthException(boolean z, int i, String str, Throwable th2) {
        super(str, th2);
        this.isRetryable = z;
        this.retryCount = i;
    }

    public static GoogleAuthException createWithTokenEndpointIOException(IOException iOException, String str) {
        if (str == null) {
            return new GoogleAuthException(true, 3, iOException);
        }
        return new GoogleAuthException(true, 3, str, iOException);
    }

    public static GoogleAuthException createWithTokenEndpointResponseException(HttpResponseException httpResponseException, String str) {
        boolean contains = CJ0.f698i.contains(Integer.valueOf(httpResponseException.getStatusCode()));
        int attemptCount = httpResponseException.getAttemptCount() - 1;
        if (str == null) {
            return new GoogleAuthException(contains, attemptCount, httpResponseException);
        }
        return new GoogleAuthException(contains, attemptCount, str, httpResponseException);
    }

    @Override // com.google.auth.Retryable
    public int getRetryCount() {
        return this.retryCount;
    }

    @Override // com.google.auth.Retryable
    public boolean isRetryable() {
        return this.isRetryable;
    }

    public static GoogleAuthException createWithTokenEndpointIOException(IOException iOException) {
        return createWithTokenEndpointIOException(iOException, null);
    }

    public GoogleAuthException(boolean z, int i, Throwable th2) {
        super(th2);
        this.isRetryable = z;
        this.retryCount = i;
    }

    public GoogleAuthException(boolean z, Throwable th2) {
        super(th2);
        this.isRetryable = z;
        this.retryCount = 0;
    }

    public static GoogleAuthException createWithTokenEndpointResponseException(HttpResponseException httpResponseException) {
        return createWithTokenEndpointResponseException(httpResponseException, null);
    }

    public GoogleAuthException(Throwable th2) {
        this(false, th2);
    }

    public GoogleAuthException() {
        this.isRetryable = false;
        this.retryCount = 0;
    }
}
