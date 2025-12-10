package org.apache.http.conn.ssl;

import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

@Deprecated
/* loaded from: classes6.dex */
public class SSLContextBuilder {

    /* renamed from: a */
    public String f73922a;

    /* renamed from: b */
    public final Set f73923b = new LinkedHashSet();

    /* renamed from: c */
    public final Set f73924c = new LinkedHashSet();

    /* renamed from: d */
    public SecureRandom f73925d;

    /* renamed from: org.apache.http.conn.ssl.SSLContextBuilder$a */
    /* loaded from: classes6.dex */
    public static class C12569a implements X509KeyManager {

        /* renamed from: a */
        public final X509KeyManager f73926a;

        /* renamed from: b */
        public final PrivateKeyStrategy f73927b;

        public C12569a(X509KeyManager x509KeyManager, PrivateKeyStrategy privateKeyStrategy) {
            this.f73926a = x509KeyManager;
            this.f73927b = privateKeyStrategy;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            HashMap hashMap = new HashMap();
            for (String str : strArr) {
                String[] clientAliases = this.f73926a.getClientAliases(str, principalArr);
                if (clientAliases != null) {
                    for (String str2 : clientAliases) {
                        hashMap.put(str2, new PrivateKeyDetails(str, this.f73926a.getCertificateChain(str2)));
                    }
                }
            }
            return this.f73927b.chooseAlias(hashMap, socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            HashMap hashMap = new HashMap();
            String[] serverAliases = this.f73926a.getServerAliases(str, principalArr);
            if (serverAliases != null) {
                for (String str2 : serverAliases) {
                    hashMap.put(str2, new PrivateKeyDetails(str, this.f73926a.getCertificateChain(str2)));
                }
            }
            return this.f73927b.chooseAlias(hashMap, socket);
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return this.f73926a.getCertificateChain(str);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return this.f73926a.getClientAliases(str, principalArr);
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return this.f73926a.getPrivateKey(str);
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return this.f73926a.getServerAliases(str, principalArr);
        }
    }

    /* renamed from: org.apache.http.conn.ssl.SSLContextBuilder$b */
    /* loaded from: classes6.dex */
    public static class C12570b implements X509TrustManager {

        /* renamed from: a */
        public final X509TrustManager f73928a;

        /* renamed from: b */
        public final TrustStrategy f73929b;

        public C12570b(X509TrustManager x509TrustManager, TrustStrategy trustStrategy) {
            this.f73928a = x509TrustManager;
            this.f73929b = trustStrategy;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            this.f73928a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            if (!this.f73929b.isTrusted(x509CertificateArr, str)) {
                this.f73928a.checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f73928a.getAcceptedIssuers();
        }
    }

    public SSLContext build() throws NoSuchAlgorithmException, KeyManagementException {
        KeyManager[] keyManagerArr;
        String str = this.f73922a;
        if (str == null) {
            str = "TLS";
        }
        SSLContext sSLContext = SSLContext.getInstance(str);
        TrustManager[] trustManagerArr = null;
        if (!this.f73923b.isEmpty()) {
            Set set = this.f73923b;
            keyManagerArr = (KeyManager[]) set.toArray(new KeyManager[set.size()]);
        } else {
            keyManagerArr = null;
        }
        if (!this.f73924c.isEmpty()) {
            Set set2 = this.f73924c;
            trustManagerArr = (TrustManager[]) set2.toArray(new TrustManager[set2.size()]);
        }
        sSLContext.init(keyManagerArr, trustManagerArr, this.f73925d);
        return sSLContext;
    }

    public SSLContextBuilder loadKeyMaterial(KeyStore keyStore, char[] cArr) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException {
        loadKeyMaterial(keyStore, cArr, null);
        return this;
    }

    public SSLContextBuilder loadTrustMaterial(KeyStore keyStore, TrustStrategy trustStrategy) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers != null) {
            if (trustStrategy != null) {
                for (int i = 0; i < trustManagers.length; i++) {
                    TrustManager trustManager = trustManagers[i];
                    if (trustManager instanceof X509TrustManager) {
                        trustManagers[i] = new C12570b((X509TrustManager) trustManager, trustStrategy);
                    }
                }
            }
            Collections.addAll(this.f73924c, trustManagers);
        }
        return this;
    }

    public SSLContextBuilder setSecureRandom(SecureRandom secureRandom) {
        this.f73925d = secureRandom;
        return this;
    }

    public SSLContextBuilder useProtocol(String str) {
        this.f73922a = str;
        return this;
    }

    public SSLContextBuilder useSSL() {
        this.f73922a = "SSL";
        return this;
    }

    public SSLContextBuilder useTLS() {
        this.f73922a = "TLS";
        return this;
    }

    public SSLContextBuilder loadKeyMaterial(KeyStore keyStore, char[] cArr, PrivateKeyStrategy privateKeyStrategy) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, cArr);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (keyManagers != null) {
            if (privateKeyStrategy != null) {
                for (int i = 0; i < keyManagers.length; i++) {
                    KeyManager keyManager = keyManagers[i];
                    if (keyManager instanceof X509KeyManager) {
                        keyManagers[i] = new C12569a((X509KeyManager) keyManager, privateKeyStrategy);
                    }
                }
            }
            Collections.addAll(this.f73923b, keyManagers);
        }
        return this;
    }

    public SSLContextBuilder loadTrustMaterial(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        return loadTrustMaterial(keyStore, null);
    }
}