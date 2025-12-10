package com.google.api.client.http;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.IOException;

@Beta
/* loaded from: classes4.dex */
public class HttpBackOffIOExceptionHandler implements HttpIOExceptionHandler {

    /* renamed from: a */
    public final BackOff f52055a;

    /* renamed from: b */
    public Sleeper f52056b = Sleeper.DEFAULT;

    public HttpBackOffIOExceptionHandler(BackOff backOff) {
        this.f52055a = (BackOff) Preconditions.checkNotNull(backOff);
    }

    public final BackOff getBackOff() {
        return this.f52055a;
    }

    public final Sleeper getSleeper() {
        return this.f52056b;
    }

    @Override // com.google.api.client.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z) throws IOException {
        if (!z) {
            return false;
        }
        try {
            return BackOffUtils.next(this.f52056b, this.f52055a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public HttpBackOffIOExceptionHandler setSleeper(Sleeper sleeper) {
        this.f52056b = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }
}