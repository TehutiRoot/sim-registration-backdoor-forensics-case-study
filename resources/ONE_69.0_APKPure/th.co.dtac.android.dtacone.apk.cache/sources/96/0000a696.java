package com.google.auth;

import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class Credentials implements Serializable {
    public static final String GOOGLE_DEFAULT_UNIVERSE = "googleapis.com";
    private static final long serialVersionUID = 808575179767517313L;

    /* renamed from: com.google.auth.Credentials$a */
    /* loaded from: classes4.dex */
    public class RunnableC7319a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ URI f52402a;

        /* renamed from: b */
        public final /* synthetic */ RequestMetadataCallback f52403b;

        public RunnableC7319a(URI uri, RequestMetadataCallback requestMetadataCallback) {
            this.f52402a = uri;
            this.f52403b = requestMetadataCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Credentials.this.blockingGetToCallback(this.f52402a, this.f52403b);
        }
    }

    public final void blockingGetToCallback(URI uri, RequestMetadataCallback requestMetadataCallback) {
        try {
            requestMetadataCallback.onSuccess(getRequestMetadata(uri));
        } catch (Throwable th2) {
            requestMetadataCallback.onFailure(th2);
        }
    }

    public abstract String getAuthenticationType();

    public CredentialTypeForMetrics getMetricsCredentialType() {
        return CredentialTypeForMetrics.DO_NOT_SEND;
    }

    public Map<String, List<String>> getRequestMetadata() throws IOException {
        return getRequestMetadata(null);
    }

    public abstract Map<String, List<String>> getRequestMetadata(URI uri) throws IOException;

    public String getUniverseDomain() throws IOException {
        return GOOGLE_DEFAULT_UNIVERSE;
    }

    public abstract boolean hasRequestMetadata();

    public abstract boolean hasRequestMetadataOnly();

    public abstract void refresh() throws IOException;

    public void getRequestMetadata(URI uri, Executor executor, RequestMetadataCallback requestMetadataCallback) {
        executor.execute(new RunnableC7319a(uri, requestMetadataCallback));
    }
}