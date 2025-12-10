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
    public final BackOff f52043a;

    /* renamed from: b */
    public Sleeper f52044b = Sleeper.DEFAULT;

    public HttpBackOffIOExceptionHandler(BackOff backOff) {
        this.f52043a = (BackOff) Preconditions.checkNotNull(backOff);
    }

    public final BackOff getBackOff() {
        return this.f52043a;
    }

    public final Sleeper getSleeper() {
        return this.f52044b;
    }

    @Override // com.google.api.client.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z) throws IOException {
        if (!z) {
            return false;
        }
        try {
            return BackOffUtils.next(this.f52044b, this.f52043a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public HttpBackOffIOExceptionHandler setSleeper(Sleeper sleeper) {
        this.f52044b = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }
}
