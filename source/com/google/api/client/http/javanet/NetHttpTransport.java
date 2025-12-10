package com.google.api.client.http.javanet;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class NetHttpTransport extends HttpTransport {

    /* renamed from: g */
    public static final String[] f52169g;

    /* renamed from: c */
    public final ConnectionFactory f52170c;

    /* renamed from: d */
    public final SSLSocketFactory f52171d;

    /* renamed from: e */
    public final HostnameVerifier f52172e;

    /* renamed from: f */
    public final boolean f52173f;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        f52169g = strArr;
        Arrays.sort(strArr);
    }

    public NetHttpTransport() {
        this((ConnectionFactory) null, (SSLSocketFactory) null, (HostnameVerifier) null, false);
    }

    /* renamed from: c */
    public static Proxy m41735c() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
    }

    /* renamed from: d */
    public final ConnectionFactory m41734d(ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
                return new DefaultConnectionFactory(m41735c());
            }
            return new DefaultConnectionFactory();
        }
        return connectionFactory;
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean isMtls() {
        return this.f52173f;
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        if (Arrays.binarySearch(f52169g, str) >= 0) {
            return true;
        }
        return false;
    }

    public NetHttpTransport(Proxy proxy, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, boolean z) {
        this(new DefaultConnectionFactory(proxy), sSLSocketFactory, hostnameVerifier, z);
    }

    @Override // com.google.api.client.http.HttpTransport
    public WG0 buildRequest(String str, String str2) throws IOException {
        Preconditions.checkArgument(supportsMethod(str), "HTTP method %s not supported", str);
        HttpURLConnection openConnection = this.f52170c.openConnection(new URL(str2));
        openConnection.setRequestMethod(str);
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            HostnameVerifier hostnameVerifier = this.f52172e;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.f52171d;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return new WG0(openConnection);
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public SSLSocketFactory f52174a;

        /* renamed from: b */
        public HostnameVerifier f52175b;

        /* renamed from: c */
        public Proxy f52176c;

        /* renamed from: d */
        public ConnectionFactory f52177d;

        /* renamed from: e */
        public boolean f52178e;

        public NetHttpTransport build() {
            if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
                setProxy(NetHttpTransport.m41735c());
            }
            if (this.f52176c == null) {
                return new NetHttpTransport(this.f52177d, this.f52174a, this.f52175b, this.f52178e);
            }
            return new NetHttpTransport(this.f52176c, this.f52174a, this.f52175b, this.f52178e);
        }

        @Beta
        public Builder doNotValidateCertificate() throws GeneralSecurityException {
            this.f52175b = SslUtils.trustAllHostnameVerifier();
            this.f52174a = SslUtils.trustAllSSLContext().getSocketFactory();
            return this;
        }

        public HostnameVerifier getHostnameVerifier() {
            return this.f52175b;
        }

        public SSLSocketFactory getSslSocketFactory() {
            return this.f52174a;
        }

        public Builder setConnectionFactory(ConnectionFactory connectionFactory) {
            this.f52177d = connectionFactory;
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.f52175b = hostnameVerifier;
            return this;
        }

        public Builder setProxy(Proxy proxy) {
            this.f52176c = proxy;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f52174a = sSLSocketFactory;
            return this;
        }

        public Builder trustCertificates(KeyStore keyStore) throws GeneralSecurityException {
            SSLContext tlsSslContext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(tlsSslContext, keyStore, SslUtils.getPkixTrustManagerFactory());
            return setSslSocketFactory(tlsSslContext.getSocketFactory());
        }

        public Builder trustCertificatesFromJavaKeyStore(InputStream inputStream, String str) throws GeneralSecurityException, IOException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            SecurityUtils.loadKeyStore(javaKeyStore, inputStream, str);
            return trustCertificates(javaKeyStore);
        }

        public Builder trustCertificatesFromStream(InputStream inputStream) throws GeneralSecurityException, IOException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            javaKeyStore.load(null, null);
            SecurityUtils.loadKeyStoreFromCertificates(javaKeyStore, SecurityUtils.getX509CertificateFactory(), inputStream);
            return trustCertificates(javaKeyStore);
        }

        @Beta
        public Builder trustCertificates(KeyStore keyStore, KeyStore keyStore2, String str) throws GeneralSecurityException {
            if (keyStore2 != null && keyStore2.size() > 0) {
                this.f52178e = true;
            }
            SSLContext tlsSslContext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(tlsSslContext, keyStore, SslUtils.getPkixTrustManagerFactory(), keyStore2, str, SslUtils.getDefaultKeyManagerFactory());
            return setSslSocketFactory(tlsSslContext.getSocketFactory());
        }
    }

    public NetHttpTransport(ConnectionFactory connectionFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, boolean z) {
        this.f52170c = m41734d(connectionFactory);
        this.f52171d = sSLSocketFactory;
        this.f52172e = hostnameVerifier;
        this.f52173f = z;
    }
}
