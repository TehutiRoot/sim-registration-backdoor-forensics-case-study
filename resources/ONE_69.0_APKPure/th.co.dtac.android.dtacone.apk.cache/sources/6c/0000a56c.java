package com.google.api.client.googleapis.apache.p012v2;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.mtls.MtlsProvider;
import com.google.api.client.googleapis.mtls.MtlsUtils;
import com.google.api.client.http.apache.p013v2.ApacheHttpTransport;
import com.google.api.client.util.Beta;
import com.google.api.client.util.SslUtils;
import com.zxy.tiny.common.UriUtil;
import java.io.IOException;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

/* renamed from: com.google.api.client.googleapis.apache.v2.GoogleApacheHttpTransport */
/* loaded from: classes4.dex */
public final class GoogleApacheHttpTransport {

    /* renamed from: com.google.api.client.googleapis.apache.v2.GoogleApacheHttpTransport$a */
    /* loaded from: classes4.dex */
    public static class C7256a {

        /* renamed from: a */
        public final Registry f51807a;

        /* renamed from: b */
        public final boolean f51808b;

        public C7256a(MtlsProvider mtlsProvider) {
            KeyStore keyStore;
            String str;
            if (mtlsProvider.useMtlsClientCertificate()) {
                KeyStore keyStore2 = mtlsProvider.getKeyStore();
                str = mtlsProvider.getKeyStorePassword();
                keyStore = keyStore2;
            } else {
                keyStore = null;
                str = null;
            }
            KeyStore certificateTrustStore = GoogleUtils.getCertificateTrustStore();
            SSLContext tlsSslContext = SslUtils.getTlsSslContext();
            if (keyStore != null && str != null) {
                this.f51808b = true;
                SslUtils.initSslContext(tlsSslContext, certificateTrustStore, SslUtils.getPkixTrustManagerFactory(), keyStore, str, SslUtils.getDefaultKeyManagerFactory());
            } else {
                this.f51808b = false;
                SslUtils.initSslContext(tlsSslContext, certificateTrustStore, SslUtils.getPkixTrustManagerFactory());
            }
            this.f51807a = RegistryBuilder.create().register("http", PlainConnectionSocketFactory.getSocketFactory()).register(UriUtil.HTTPS_SCHEME, new SSLConnectionSocketFactory(tlsSslContext)).build();
        }

        /* renamed from: a */
        public Registry m41825a() {
            return this.f51807a;
        }

        /* renamed from: b */
        public boolean m41824b() {
            return this.f51808b;
        }
    }

    public static ApacheHttpTransport newTrustedTransport() throws GeneralSecurityException, IOException {
        return newTrustedTransport(MtlsUtils.getDefaultMtlsProvider());
    }

    @Beta
    public static ApacheHttpTransport newTrustedTransport(MtlsProvider mtlsProvider) throws GeneralSecurityException, IOException {
        C7256a c7256a = new C7256a(mtlsProvider);
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(c7256a.m41825a(), null, null, null, -1L, TimeUnit.MILLISECONDS);
        poolingHttpClientConnectionManager.setValidateAfterInactivity(-1);
        return new ApacheHttpTransport(HttpClientBuilder.create().useSystemProperties().setMaxConnTotal(200).setMaxConnPerRoute(20).setRoutePlanner(new SystemDefaultRoutePlanner(ProxySelector.getDefault())).setConnectionManager(poolingHttpClientConnectionManager).disableRedirectHandling().disableAutomaticRetries().build(), c7256a.m41824b());
    }
}