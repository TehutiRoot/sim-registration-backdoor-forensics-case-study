package com.google.api.client.http;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.BackOffUtils;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.IOException;

@Beta
/* loaded from: classes4.dex */
public class HttpBackOffUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {

    /* renamed from: a */
    public final BackOff f52045a;

    /* renamed from: b */
    public BackOffRequired f52046b = BackOffRequired.ON_SERVER_ERROR;

    /* renamed from: c */
    public Sleeper f52047c = Sleeper.DEFAULT;

    @Beta
    /* loaded from: classes4.dex */
    public interface BackOffRequired {
        public static final BackOffRequired ALWAYS = new C7293a();
        public static final BackOffRequired ON_SERVER_ERROR = new C7294b();

        /* renamed from: com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler$BackOffRequired$a */
        /* loaded from: classes4.dex */
        public static class C7293a implements BackOffRequired {
            @Override // com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired
            public boolean isRequired(HttpResponse httpResponse) {
                return true;
            }
        }

        /* renamed from: com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler$BackOffRequired$b */
        /* loaded from: classes4.dex */
        public static class C7294b implements BackOffRequired {
            @Override // com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired
            public boolean isRequired(HttpResponse httpResponse) {
                if (httpResponse.getStatusCode() / 100 == 5) {
                    return true;
                }
                return false;
            }
        }

        boolean isRequired(HttpResponse httpResponse);
    }

    public HttpBackOffUnsuccessfulResponseHandler(BackOff backOff) {
        this.f52045a = (BackOff) Preconditions.checkNotNull(backOff);
    }

    public final BackOff getBackOff() {
        return this.f52045a;
    }

    public final BackOffRequired getBackOffRequired() {
        return this.f52046b;
    }

    public final Sleeper getSleeper() {
        return this.f52047c;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException {
        if (z && this.f52046b.isRequired(httpResponse)) {
            try {
                return BackOffUtils.next(this.f52047c, this.f52045a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return false;
    }

    public HttpBackOffUnsuccessfulResponseHandler setBackOffRequired(BackOffRequired backOffRequired) {
        this.f52046b = (BackOffRequired) Preconditions.checkNotNull(backOffRequired);
        return this;
    }

    public HttpBackOffUnsuccessfulResponseHandler setSleeper(Sleeper sleeper) {
        this.f52047c = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }
}
