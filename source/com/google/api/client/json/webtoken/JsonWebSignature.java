package com.google.api.client.json.webtoken;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes4.dex */
public class JsonWebSignature extends JsonWebToken {

    /* renamed from: c */
    public final byte[] f52201c;

    /* renamed from: d */
    public final byte[] f52202d;

    /* loaded from: classes4.dex */
    public static class Header extends JsonWebToken.Header {

        /* renamed from: f */
        public String f52203f;

        /* renamed from: g */
        public String f52204g;

        /* renamed from: h */
        public String f52205h;

        /* renamed from: i */
        public String f52206i;

        /* renamed from: j */
        public String f52207j;

        /* renamed from: k */
        public String f52208k;

        /* renamed from: l */
        public ArrayList f52209l;

        /* renamed from: m */
        public List f52210m;

        public final String getAlgorithm() {
            return this.f52203f;
        }

        public final List<String> getCritical() {
            List list = this.f52210m;
            if (list != null && !list.isEmpty()) {
                return new ArrayList(this.f52210m);
            }
            return null;
        }

        public final String getJwk() {
            return this.f52205h;
        }

        public final String getJwkUrl() {
            return this.f52204g;
        }

        public final String getKeyId() {
            return this.f52206i;
        }

        public final List<String> getX509Certificates() {
            return new ArrayList(this.f52209l);
        }

        public final String getX509Thumbprint() {
            return this.f52208k;
        }

        public final String getX509Url() {
            return this.f52207j;
        }

        public Header setAlgorithm(String str) {
            this.f52203f = str;
            return this;
        }

        public Header setCritical(List<String> list) {
            this.f52210m = new ArrayList(list);
            return this;
        }

        public Header setJwk(String str) {
            this.f52205h = str;
            return this;
        }

        public Header setJwkUrl(String str) {
            this.f52204g = str;
            return this;
        }

        public Header setKeyId(String str) {
            this.f52206i = str;
            return this;
        }

        public Header setX509Certificates(List<String> list) {
            this.f52209l = new ArrayList(list);
            return this;
        }

        public Header setX509Thumbprint(String str) {
            this.f52208k = str;
            return this;
        }

        public Header setX509Url(String str) {
            this.f52207j = str;
            return this;
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Header
        public Header setType(String str) {
            super.setType(str);
            return this;
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Header, com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public Header set(String str, Object obj) {
            return (Header) super.set(str, obj);
        }

        @Override // com.google.api.client.json.webtoken.JsonWebToken.Header, com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public Header clone() {
            return (Header) super.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class Parser {

        /* renamed from: a */
        public final JsonFactory f52211a;

        /* renamed from: b */
        public Class f52212b = Header.class;

        /* renamed from: c */
        public Class f52213c = JsonWebToken.Payload.class;

        public Parser(JsonFactory jsonFactory) {
            this.f52211a = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        }

        public Class<? extends Header> getHeaderClass() {
            return this.f52212b;
        }

        public JsonFactory getJsonFactory() {
            return this.f52211a;
        }

        public Class<? extends JsonWebToken.Payload> getPayloadClass() {
            return this.f52213c;
        }

        public JsonWebSignature parse(String str) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            int indexOf = str.indexOf(46);
            boolean z4 = false;
            if (indexOf != -1) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            byte[] decodeBase64 = Base64.decodeBase64(str.substring(0, indexOf));
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(46, i);
            if (indexOf2 != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2);
            int i2 = indexOf2 + 1;
            if (str.indexOf(46, i2) == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            Preconditions.checkArgument(z3);
            byte[] decodeBase642 = Base64.decodeBase64(str.substring(i, indexOf2));
            byte[] decodeBase643 = Base64.decodeBase64(str.substring(i2));
            byte[] bytesUtf8 = StringUtils.getBytesUtf8(str.substring(0, indexOf2));
            Header header = (Header) this.f52211a.fromInputStream(new ByteArrayInputStream(decodeBase64), this.f52212b);
            if (header.getAlgorithm() != null) {
                z4 = true;
            }
            Preconditions.checkArgument(z4);
            return new JsonWebSignature(header, (JsonWebToken.Payload) this.f52211a.fromInputStream(new ByteArrayInputStream(decodeBase642), this.f52213c), decodeBase643, bytesUtf8);
        }

        public Parser setHeaderClass(Class<? extends Header> cls) {
            this.f52212b = cls;
            return this;
        }

        public Parser setPayloadClass(Class<? extends JsonWebToken.Payload> cls) {
            this.f52213c = cls;
            return this;
        }
    }

    public JsonWebSignature(Header header, JsonWebToken.Payload payload, byte[] bArr, byte[] bArr2) {
        super(header, payload);
        this.f52201c = (byte[]) Preconditions.checkNotNull(bArr);
        this.f52202d = (byte[]) Preconditions.checkNotNull(bArr2);
    }

    /* renamed from: a */
    public static X509TrustManager m41719a() {
        TrustManager[] trustManagers;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
        } catch (KeyStoreException | NoSuchAlgorithmException unused) {
        }
        return null;
    }

    public static JsonWebSignature parse(JsonFactory jsonFactory, String str) throws IOException {
        return parser(jsonFactory).parse(str);
    }

    public static Parser parser(JsonFactory jsonFactory) {
        return new Parser(jsonFactory);
    }

    public static String signUsingRsaSha256(PrivateKey privateKey, JsonFactory jsonFactory, Header header, JsonWebToken.Payload payload) throws GeneralSecurityException, IOException {
        String str = Base64.encodeBase64URLSafeString(jsonFactory.toByteArray(header)) + "." + Base64.encodeBase64URLSafeString(jsonFactory.toByteArray(payload));
        byte[] sign = SecurityUtils.sign(SecurityUtils.getSha256WithRsaSignatureAlgorithm(), privateKey, StringUtils.getBytesUtf8(str));
        return str + "." + Base64.encodeBase64URLSafeString(sign);
    }

    public final byte[] getSignatureBytes() {
        byte[] bArr = this.f52201c;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final byte[] getSignedContentBytes() {
        byte[] bArr = this.f52202d;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean verifySignature(PublicKey publicKey) throws GeneralSecurityException {
        String algorithm = getHeader().getAlgorithm();
        if ("RS256".equals(algorithm)) {
            return SecurityUtils.verify(SecurityUtils.getSha256WithRsaSignatureAlgorithm(), publicKey, this.f52201c, this.f52202d);
        }
        if ("ES256".equals(algorithm)) {
            return SecurityUtils.verify(SecurityUtils.getEs256SignatureAlgorithm(), publicKey, DerEncoder.m41720a(this.f52201c), this.f52202d);
        }
        return false;
    }

    @Override // com.google.api.client.json.webtoken.JsonWebToken
    public Header getHeader() {
        return (Header) super.getHeader();
    }

    @Beta
    public final X509Certificate verifySignature(X509TrustManager x509TrustManager) throws GeneralSecurityException {
        List<String> x509Certificates = getHeader().getX509Certificates();
        if (x509Certificates != null && !x509Certificates.isEmpty()) {
            String algorithm = getHeader().getAlgorithm();
            if ("RS256".equals(algorithm)) {
                return SecurityUtils.verify(SecurityUtils.getSha256WithRsaSignatureAlgorithm(), x509TrustManager, x509Certificates, this.f52201c, this.f52202d);
            }
            if ("ES256".equals(algorithm)) {
                return SecurityUtils.verify(SecurityUtils.getEs256SignatureAlgorithm(), x509TrustManager, x509Certificates, DerEncoder.m41720a(this.f52201c), this.f52202d);
            }
        }
        return null;
    }

    @Beta
    public final X509Certificate verifySignature() throws GeneralSecurityException {
        X509TrustManager m41719a = m41719a();
        if (m41719a == null) {
            return null;
        }
        return verifySignature(m41719a);
    }
}
