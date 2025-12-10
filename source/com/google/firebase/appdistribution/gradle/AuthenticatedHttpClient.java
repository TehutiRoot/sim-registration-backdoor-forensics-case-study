package com.google.firebase.appdistribution.gradle;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;", "", "Lcom/google/api/client/http/HttpRequestFactory;", "httpRequestFactory", "<init>", "(Lcom/google/api/client/http/HttpRequestFactory;)V", "Lcom/google/api/client/auth/oauth2/Credential;", "credential", "(Lcom/google/api/client/auth/oauth2/Credential;)V", "Lcom/google/api/client/http/HttpTransport;", "httpTransport", "(Lcom/google/api/client/http/HttpTransport;)V", "Lcom/google/api/client/http/GenericUrl;", ImagesContract.URL, "Lcom/google/firebase/appdistribution/gradle/RequestBuilder;", "newGetRequest", "(Lcom/google/api/client/http/GenericUrl;)Lcom/google/firebase/appdistribution/gradle/RequestBuilder;", "Lcom/google/api/client/http/HttpContent;", "content", "newPostRequest", "(Lcom/google/api/client/http/GenericUrl;Lcom/google/api/client/http/HttpContent;)Lcom/google/firebase/appdistribution/gradle/RequestBuilder;", "newPatchRequest", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/api/client/http/HttpRequestFactory;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AuthenticatedHttpClient {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final HttpRequestFactory f54570a;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient$Companion;", "", "()V", "newGoogleHttpTransport", "Lcom/google/api/client/http/HttpTransport;", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HttpTransport newGoogleHttpTransport() throws IOException, GeneralSecurityException {
            Path path;
            InputStream newInputStream;
            NetHttpTransport.Builder builder = new NetHttpTransport.Builder();
            builder.trustCertificates(GoogleUtils.getCertificateTrustStore());
            String property = System.getProperty("javax.net.ssl.trustStore");
            String property2 = System.getProperty("javax.net.ssl.trustStorePassword");
            if (property != null && property2 != null) {
                path = Paths.get(property, new String[0]);
                newInputStream = Files.newInputStream(path, new OpenOption[0]);
                builder.trustCertificatesFromJavaKeyStore(newInputStream, property2);
            }
            NetHttpTransport build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
            return build;
        }

        public Companion() {
        }
    }

    public AuthenticatedHttpClient(HttpRequestFactory httpRequestFactory) {
        this.f54570a = httpRequestFactory;
    }

    public static /* synthetic */ RequestBuilder newPatchRequest$default(AuthenticatedHttpClient authenticatedHttpClient, GenericUrl genericUrl, HttpContent httpContent, int i, Object obj) {
        if ((i & 2) != 0) {
            httpContent = null;
        }
        return authenticatedHttpClient.newPatchRequest(genericUrl, httpContent);
    }

    public static /* synthetic */ RequestBuilder newPostRequest$default(AuthenticatedHttpClient authenticatedHttpClient, GenericUrl genericUrl, HttpContent httpContent, int i, Object obj) {
        if ((i & 2) != 0) {
            httpContent = null;
        }
        return authenticatedHttpClient.newPostRequest(genericUrl, httpContent);
    }

    @NotNull
    public final RequestBuilder newGetRequest(@NotNull GenericUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpRequest buildGetRequest = this.f54570a.buildGetRequest(url);
        Intrinsics.checkNotNullExpressionValue(buildGetRequest, "httpRequestFactory.buildGetRequest(url)");
        return new RequestBuilder(buildGetRequest);
    }

    @NotNull
    public final RequestBuilder newPatchRequest(@NotNull GenericUrl url, @Nullable HttpContent httpContent) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpRequest buildPostRequest = this.f54570a.buildPostRequest(url, httpContent);
        Intrinsics.checkNotNullExpressionValue(buildPostRequest, "httpRequestFactory.buildPostRequest(url, content)");
        return new RequestBuilder(buildPostRequest).setHeader("X-Http-Method-Override", "PATCH");
    }

    @JvmOverloads
    @NotNull
    public final RequestBuilder newPostRequest(@NotNull GenericUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return newPostRequest$default(this, url, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final RequestBuilder newPostRequest(@NotNull GenericUrl url, @Nullable HttpContent httpContent) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpRequest buildPostRequest = this.f54570a.buildPostRequest(url, httpContent);
        Intrinsics.checkNotNullExpressionValue(buildPostRequest, "httpRequestFactory.buildPostRequest(url, content)");
        return new RequestBuilder(buildPostRequest);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AuthenticatedHttpClient(@org.jetbrains.annotations.NotNull com.google.api.client.auth.oauth2.Credential r2) {
        /*
            r1 = this;
            java.lang.String r0 = "credential"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.google.firebase.appdistribution.gradle.AuthenticatedHttpClient$Companion r0 = com.google.firebase.appdistribution.gradle.AuthenticatedHttpClient.Companion
            com.google.api.client.http.HttpTransport r0 = r0.newGoogleHttpTransport()
            com.google.api.client.http.HttpRequestFactory r2 = r0.createRequestFactory(r2)
            java.lang.String r0 = "newGoogleHttpTransport()…equestFactory(credential)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appdistribution.gradle.AuthenticatedHttpClient.<init>(com.google.api.client.auth.oauth2.Credential):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AuthenticatedHttpClient(@org.jetbrains.annotations.NotNull com.google.api.client.http.HttpTransport r2) {
        /*
            r1 = this;
            java.lang.String r0 = "httpTransport"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.google.api.client.http.HttpRequestFactory r2 = r2.createRequestFactory()
            java.lang.String r0 = "httpTransport.createRequestFactory()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appdistribution.gradle.AuthenticatedHttpClient.<init>(com.google.api.client.http.HttpTransport):void");
    }
}
