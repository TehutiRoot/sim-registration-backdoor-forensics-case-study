package com.google.api.client.googleapis.services;

import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;

/* loaded from: classes4.dex */
public class CommonGoogleClientRequestInitializer implements GoogleClientRequestInitializer {

    /* renamed from: a */
    public final String f52006a;

    /* renamed from: b */
    public final String f52007b;

    /* renamed from: c */
    public final String f52008c;

    /* renamed from: d */
    public final String f52009d;

    /* renamed from: e */
    public final String f52010e;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f52011a;

        /* renamed from: b */
        public String f52012b;

        /* renamed from: c */
        public String f52013c;

        /* renamed from: d */
        public String f52014d;

        /* renamed from: e */
        public String f52015e;

        public CommonGoogleClientRequestInitializer build() {
            return new CommonGoogleClientRequestInitializer(this);
        }

        public String getKey() {
            return this.f52011a;
        }

        public String getRequestReason() {
            return this.f52014d;
        }

        public String getUserAgent() {
            return this.f52013c;
        }

        public String getUserIp() {
            return this.f52012b;
        }

        public String getUserProject() {
            return this.f52015e;
        }

        public Builder self() {
            return this;
        }

        public Builder setKey(String str) {
            this.f52011a = str;
            return self();
        }

        public Builder setRequestReason(String str) {
            this.f52014d = str;
            return self();
        }

        public Builder setUserAgent(String str) {
            this.f52013c = str;
            return self();
        }

        public Builder setUserIp(String str) {
            this.f52012b = str;
            return self();
        }

        public Builder setUserProject(String str) {
            this.f52015e = str;
            return self();
        }
    }

    @Deprecated
    public CommonGoogleClientRequestInitializer() {
        this(newBuilder());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String getKey() {
        return this.f52006a;
    }

    public final String getRequestReason() {
        return this.f52009d;
    }

    public final String getUserAgent() {
        return this.f52008c;
    }

    public final String getUserIp() {
        return this.f52007b;
    }

    public final String getUserProject() {
        return this.f52010e;
    }

    @Override // com.google.api.client.googleapis.services.GoogleClientRequestInitializer
    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        String str = this.f52006a;
        if (str != null) {
            abstractGoogleClientRequest.put(Action.KEY_ATTRIBUTE, (Object) str);
        }
        String str2 = this.f52007b;
        if (str2 != null) {
            abstractGoogleClientRequest.put("userIp", (Object) str2);
        }
        if (this.f52008c != null) {
            abstractGoogleClientRequest.getRequestHeaders().setUserAgent(this.f52008c);
        }
        if (this.f52009d != null) {
            abstractGoogleClientRequest.getRequestHeaders().set("X-Goog-Request-Reason", (Object) this.f52009d);
        }
        if (this.f52010e != null) {
            abstractGoogleClientRequest.getRequestHeaders().set("X-Goog-User-Project", (Object) this.f52010e);
        }
    }

    @Deprecated
    public CommonGoogleClientRequestInitializer(String str) {
        this(str, null);
    }

    @Deprecated
    public CommonGoogleClientRequestInitializer(String str, String str2) {
        this(newBuilder().setKey(str).setUserIp(str2));
    }

    public CommonGoogleClientRequestInitializer(Builder builder) {
        this.f52006a = builder.getKey();
        this.f52007b = builder.getUserIp();
        this.f52008c = builder.getUserAgent();
        this.f52009d = builder.getRequestReason();
        this.f52010e = builder.getUserProject();
    }
}