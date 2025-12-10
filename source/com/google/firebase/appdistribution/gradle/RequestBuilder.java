package com.google.firebase.appdistribution.gradle;

import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/RequestBuilder;", "", "Lcom/google/api/client/http/HttpRequest;", "request", "<init>", "(Lcom/google/api/client/http/HttpRequest;)V", "Lcom/google/api/client/http/HttpContent;", "content", "setContent", "(Lcom/google/api/client/http/HttpContent;)Lcom/google/firebase/appdistribution/gradle/RequestBuilder;", "", "headerName", "value", "setHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/RequestBuilder;", "Lcom/google/api/client/http/HttpResponse;", "execute", "()Lcom/google/api/client/http/HttpResponse;", "Lcom/google/api/client/http/HttpHeaders;", "headers", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcom/google/api/client/http/HttpHeaders;)V", "Lcom/google/api/client/http/HttpRequest;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RequestBuilder {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String X_CLIENT_VERSION = "X-Client-Version";

    /* renamed from: a */
    public final HttpRequest f54585a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/RequestBuilder$Companion;", "", "()V", "CLIENT_VERSION_UNKNOWN", "", "X_CLIENT_VERSION", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RequestBuilder(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f54585a = request;
    }

    /* renamed from: a */
    public final void m39258a(HttpHeaders httpHeaders) {
        String implementationVersion = AppDistributionPlugin.class.getPackage().getImplementationVersion();
        if (implementationVersion == null) {
            implementationVersion = "unknown_version";
        }
        httpHeaders.setUserAgent("Firebase App Distro Client/" + implementationVersion);
        httpHeaders.set(X_CLIENT_VERSION, (Object) ("gradle/" + implementationVersion));
    }

    @NotNull
    public final HttpResponse execute() {
        HttpHeaders headers = this.f54585a.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "request.headers");
        m39258a(headers);
        this.f54585a.setSuppressUserAgentSuffix(true);
        HttpResponse execute = this.f54585a.execute();
        Intrinsics.checkNotNullExpressionValue(execute, "request.execute()");
        return execute;
    }

    @NotNull
    public final RequestBuilder setContent(@Nullable HttpContent httpContent) {
        this.f54585a.setContent(httpContent);
        return this;
    }

    @NotNull
    public final RequestBuilder setHeader(@Nullable String str, @Nullable String str2) {
        this.f54585a.getHeaders().set(str, (Object) str2);
        return this;
    }
}
