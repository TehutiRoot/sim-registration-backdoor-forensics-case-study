package com.google.api.client.auth.oauth;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Data;
import com.google.api.client.util.escape.PercentEscaper;
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;
import com.zxy.tiny.common.UriUtil;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map;
import kotlin.text.Typography;
import org.apache.http.message.TokenParser;

@Beta
/* loaded from: classes4.dex */
public final class OAuthParameters implements HttpExecuteInterceptor, HttpRequestInitializer {

    /* renamed from: a */
    public static final SecureRandom f51661a = new SecureRandom();

    /* renamed from: b */
    public static final PercentEscaper f51662b = new PercentEscaper("-_.~");
    public String callback;
    public String consumerKey;
    public String nonce;
    public String realm;
    public String signature;
    public String signatureMethod;
    public OAuthSigner signer;
    public String timestamp;
    public String token;
    public String verifier;
    public String version;

    /* renamed from: com.google.api.client.auth.oauth.OAuthParameters$a */
    /* loaded from: classes4.dex */
    public static class C7258a implements Comparable {

        /* renamed from: a */
        public final String f51663a;

        /* renamed from: b */
        public final String f51664b;

        public C7258a(String str, String str2) {
            this.f51663a = str;
            this.f51664b = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C7258a c7258a) {
            int compareTo = this.f51663a.compareTo(c7258a.f51663a);
            if (compareTo == 0) {
                return this.f51664b.compareTo(c7258a.f51664b);
            }
            return compareTo;
        }

        /* renamed from: b */
        public String m41859b() {
            return this.f51663a;
        }

        /* renamed from: c */
        public String m41858c() {
            return this.f51664b;
        }
    }

    public static String escape(String str) {
        return f51662b.escape(str);
    }

    /* renamed from: a */
    public final void m41863a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(TokenParser.f74560SP);
            sb.append(escape(str));
            sb.append("=\"");
            sb.append(escape(str2));
            sb.append("\",");
        }
    }

    /* renamed from: b */
    public final void m41862b(Multiset multiset, String str, Object obj) {
        String escape;
        String escape2 = escape(str);
        if (obj == null) {
            escape = null;
        } else {
            escape = escape(obj.toString());
        }
        multiset.add(new C7258a(escape2, escape));
    }

    /* renamed from: c */
    public final void m41861c(Multiset multiset, String str, String str2) {
        if (str2 != null) {
            m41862b(multiset, str, str2);
        }
    }

    public void computeNonce() {
        this.nonce = Long.toHexString(Math.abs(f51661a.nextLong()));
    }

    public void computeSignature(String str, GenericUrl genericUrl) throws GeneralSecurityException {
        OAuthSigner oAuthSigner = this.signer;
        String signatureMethod = oAuthSigner.getSignatureMethod();
        this.signatureMethod = signatureMethod;
        TreeMultiset create = TreeMultiset.create();
        m41861c(create, "oauth_callback", this.callback);
        m41861c(create, "oauth_consumer_key", this.consumerKey);
        m41861c(create, "oauth_nonce", this.nonce);
        m41861c(create, "oauth_signature_method", signatureMethod);
        m41861c(create, "oauth_timestamp", this.timestamp);
        m41861c(create, "oauth_token", this.token);
        m41861c(create, "oauth_verifier", this.verifier);
        m41861c(create, "oauth_version", this.version);
        for (Map.Entry<String, Object> entry : genericUrl.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (value instanceof Collection) {
                    for (Object obj : (Collection) value) {
                        m41862b(create, key, obj);
                    }
                } else {
                    m41862b(create, key, value);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C7258a c7258a : create.elementSet()) {
            if (z) {
                z = false;
            } else {
                sb.append(Typography.amp);
            }
            sb.append(c7258a.m41859b());
            String m41858c = c7258a.m41858c();
            if (m41858c != null) {
                sb.append('=');
                sb.append(m41858c);
            }
        }
        String sb2 = sb.toString();
        GenericUrl genericUrl2 = new GenericUrl();
        String scheme = genericUrl.getScheme();
        genericUrl2.setScheme(scheme);
        genericUrl2.setHost(genericUrl.getHost());
        genericUrl2.setPathParts(genericUrl.getPathParts());
        int port = genericUrl.getPort();
        if (("http".equals(scheme) && port == 80) || (UriUtil.HTTPS_SCHEME.equals(scheme) && port == 443)) {
            port = -1;
        }
        genericUrl2.setPort(port);
        String build = genericUrl2.build();
        this.signature = oAuthSigner.computeSignature(escape(str) + Typography.amp + escape(build) + Typography.amp + escape(sb2));
    }

    public void computeTimestamp() {
        this.timestamp = Long.toString(System.currentTimeMillis() / 1000);
    }

    public String getAuthorizationHeader() {
        StringBuilder sb = new StringBuilder("OAuth");
        m41863a(sb, "realm", this.realm);
        m41863a(sb, "oauth_callback", this.callback);
        m41863a(sb, "oauth_consumer_key", this.consumerKey);
        m41863a(sb, "oauth_nonce", this.nonce);
        m41863a(sb, "oauth_signature", this.signature);
        m41863a(sb, "oauth_signature_method", this.signatureMethod);
        m41863a(sb, "oauth_timestamp", this.timestamp);
        m41863a(sb, "oauth_token", this.token);
        m41863a(sb, "oauth_verifier", this.verifier);
        m41863a(sb, "oauth_version", this.version);
        return sb.substring(0, sb.length() - 1);
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) throws IOException {
        httpRequest.setInterceptor(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        Map<String, Object> map;
        computeNonce();
        computeTimestamp();
        try {
            GenericUrl url = httpRequest.getUrl();
            HttpContent content = httpRequest.getContent();
            if (content instanceof UrlEncodedContent) {
                map = Data.mapOf(((UrlEncodedContent) content).getData());
                url.putAll(map);
            } else {
                map = null;
            }
            computeSignature(httpRequest.getRequestMethod(), url);
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    url.remove(entry.getKey());
                }
            }
            httpRequest.getHeaders().setAuthorization(getAuthorizationHeader());
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }
}
