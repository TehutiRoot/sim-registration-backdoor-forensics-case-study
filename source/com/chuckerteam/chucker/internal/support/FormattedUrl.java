package com.chuckerteam.chucker.internal.support;

import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010¨\u0006 "}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/FormattedUrl;", "", "", "scheme", "host", "", ClientCookie.PORT_ATTR, ClientCookie.PATH_ATTR, SearchIntents.EXTRA_QUERY, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Z", "Ljava/lang/String;", "getScheme", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getHost", OperatorName.CURVE_TO, "I", "getPort", "()I", "d", "getPath", "e", "getQuery", "getPathWithQuery", "pathWithQuery", "getUrl", ImagesContract.URL, "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FormattedUrl {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f42933a;

    /* renamed from: b */
    public final String f42934b;

    /* renamed from: c */
    public final int f42935c;

    /* renamed from: d */
    public final String f42936d;

    /* renamed from: e */
    public final String f42937e;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/FormattedUrl$Companion;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "httpUrl", "", "encoded", "Lcom/chuckerteam/chucker/internal/support/FormattedUrl;", "fromHttpUrl", "(Lokhttp3/HttpUrl;Z)Lcom/chuckerteam/chucker/internal/support/FormattedUrl;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lokhttp3/HttpUrl;)Lcom/chuckerteam/chucker/internal/support/FormattedUrl;", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "HTTPS_PORT", "I", "HTTP_PORT", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FormattedUrl m49927a(HttpUrl httpUrl) {
            String str;
            String str2;
            String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(httpUrl.pathSegments(), RemoteSettings.FORWARD_SLASH_STRING, null, null, 0, null, null, 62, null);
            String scheme = httpUrl.scheme();
            String host = httpUrl.host();
            int port = httpUrl.port();
            if (!(!AbstractC20204hN1.isBlank(joinToString$default))) {
                str = "";
            } else {
                str = RemoteSettings.FORWARD_SLASH_STRING + joinToString$default;
            }
            String query = httpUrl.query();
            if (query == null) {
                str2 = "";
            } else {
                str2 = query;
            }
            return new FormattedUrl(scheme, host, port, str, str2, null);
        }

        /* renamed from: b */
        public final FormattedUrl m49926b(HttpUrl httpUrl) {
            String str;
            String str2;
            String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(httpUrl.encodedPathSegments(), RemoteSettings.FORWARD_SLASH_STRING, null, null, 0, null, null, 62, null);
            String scheme = httpUrl.scheme();
            String host = httpUrl.host();
            int port = httpUrl.port();
            if (!(!AbstractC20204hN1.isBlank(joinToString$default))) {
                str = "";
            } else {
                str = RemoteSettings.FORWARD_SLASH_STRING + joinToString$default;
            }
            String encodedQuery = httpUrl.encodedQuery();
            if (encodedQuery == null) {
                str2 = "";
            } else {
                str2 = encodedQuery;
            }
            return new FormattedUrl(scheme, host, port, str, str2, null);
        }

        @NotNull
        public final FormattedUrl fromHttpUrl(@NotNull HttpUrl httpUrl, boolean z) {
            Intrinsics.checkNotNullParameter(httpUrl, "httpUrl");
            if (z) {
                return m49926b(httpUrl);
            }
            return m49927a(httpUrl);
        }

        public Companion() {
        }
    }

    public /* synthetic */ FormattedUrl(String str, String str2, int i, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4);
    }

    /* renamed from: a */
    public final boolean m49928a() {
        if (Intrinsics.areEqual(this.f42933a, UriUtil.HTTPS_SCHEME) && this.f42935c == 443) {
            return false;
        }
        if (Intrinsics.areEqual(this.f42933a, "http") && this.f42935c == 80) {
            return false;
        }
        return true;
    }

    @NotNull
    public final String getHost() {
        return this.f42934b;
    }

    @NotNull
    public final String getPath() {
        return this.f42936d;
    }

    @NotNull
    public final String getPathWithQuery() {
        if (AbstractC20204hN1.isBlank(this.f42937e)) {
            return this.f42936d;
        }
        String str = this.f42936d;
        String str2 = this.f42937e;
        return str + CallerData.f39639NA + str2;
    }

    public final int getPort() {
        return this.f42935c;
    }

    @NotNull
    public final String getQuery() {
        return this.f42937e;
    }

    @NotNull
    public final String getScheme() {
        return this.f42933a;
    }

    @NotNull
    public final String getUrl() {
        if (m49928a()) {
            String str = this.f42933a;
            String str2 = this.f42934b;
            int i = this.f42935c;
            String pathWithQuery = getPathWithQuery();
            return str + "://" + str2 + ":" + i + pathWithQuery;
        }
        String str3 = this.f42933a;
        String str4 = this.f42934b;
        String pathWithQuery2 = getPathWithQuery();
        return str3 + "://" + str4 + pathWithQuery2;
    }

    public FormattedUrl(String str, String str2, int i, String str3, String str4) {
        this.f42933a = str;
        this.f42934b = str2;
        this.f42935c = i;
        this.f42936d = str3;
        this.f42937e = str4;
    }
}
