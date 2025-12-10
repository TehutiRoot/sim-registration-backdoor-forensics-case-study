package com.google.api.client.googleapis.services;

import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;

/* loaded from: classes4.dex */
public class CommonGoogleClientRequestInitializer implements GoogleClientRequestInitializer {

    /* renamed from: a */
    public final String f51994a;

    /* renamed from: b */
    public final String f51995b;

    /* renamed from: c */
    public final String f51996c;

    /* renamed from: d */
    public final String f51997d;

    /* renamed from: e */
    public final String f51998e;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f51999a;

        /* renamed from: b */
        public String f52000b;

        /* renamed from: c */
        public String f52001c;

        /* renamed from: d */
        public String f52002d;

        /* renamed from: e */
        public String f52003e;

        public CommonGoogleClientRequestInitializer build() {
            return new CommonGoogleClientRequestInitializer(this);
        }

        public String getKey() {
            return this.f51999a;
        }

        public String getRequestReason() {
            return this.f52002d;
        }

        public String getUserAgent() {
            return this.f52001c;
        }

        public String getUserIp() {
            return this.f52000b;
        }

        public String getUserProject() {
            return this.f52003e;
        }

        public Builder self() {
            return this;
        }

        public Builder setKey(String str) {
            this.f51999a = str;
            return self();
        }

        public Builder setRequestReason(String str) {
            this.f52002d = str;
            return self();
        }

        public Builder setUserAgent(String str) {
            this.f52001c = str;
            return self();
        }

        public Builder setUserIp(String str) {
            this.f52000b = str;
            return self();
        }

        public Builder setUserProject(String str) {
            this.f52003e = str;
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
        return this.f51994a;
    }

    public final String getRequestReason() {
        return this.f51997d;
    }

    public final String getUserAgent() {
        return this.f51996c;
    }

    public final String getUserIp() {
        return this.f51995b;
    }

    public final String getUserProject() {
        return this.f51998e;
    }

    @Override // com.google.api.client.googleapis.services.GoogleClientRequestInitializer
    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        String str = this.f51994a;
        if (str != null) {
            abstractGoogleClientRequest.put(Action.KEY_ATTRIBUTE, (Object) str);
        }
        String str2 = this.f51995b;
        if (str2 != null) {
            abstractGoogleClientRequest.put("userIp", (Object) str2);
        }
        if (this.f51996c != null) {
            abstractGoogleClientRequest.getRequestHeaders().setUserAgent(this.f51996c);
        }
        if (this.f51997d != null) {
            abstractGoogleClientRequest.getRequestHeaders().set("X-Goog-Request-Reason", (Object) this.f51997d);
        }
        if (this.f51998e != null) {
            abstractGoogleClientRequest.getRequestHeaders().set("X-Goog-User-Project", (Object) this.f51998e);
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
        this.f51994a = builder.getKey();
        this.f51995b = builder.getUserIp();
        this.f51996c = builder.getUserAgent();
        this.f51997d = builder.getRequestReason();
        this.f51998e = builder.getUserProject();
    }
}
