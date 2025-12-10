package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAware;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* loaded from: classes.dex */
public class SSLContextFactoryBean {

    /* renamed from: a */
    public KeyStoreFactoryBean f39948a;

    /* renamed from: b */
    public KeyStoreFactoryBean f39949b;

    /* renamed from: c */
    public SecureRandomFactoryBean f39950c;

    /* renamed from: d */
    public KeyManagerFactoryFactoryBean f39951d;

    /* renamed from: e */
    public TrustManagerFactoryFactoryBean f39952e;

    /* renamed from: f */
    public String f39953f;

    /* renamed from: g */
    public String f39954g;

    /* renamed from: a */
    public final KeyManager[] m51441a(ContextAware contextAware) {
        if (getKeyStore() == null) {
            return null;
        }
        KeyStore createKeyStore = getKeyStore().createKeyStore();
        contextAware.addInfo("key store of type '" + createKeyStore.getType() + "' provider '" + createKeyStore.getProvider() + "': " + getKeyStore().getLocation());
        KeyManagerFactory createKeyManagerFactory = getKeyManagerFactory().createKeyManagerFactory();
        contextAware.addInfo("key manager algorithm '" + createKeyManagerFactory.getAlgorithm() + "' provider '" + createKeyManagerFactory.getProvider() + OperatorName.SHOW_TEXT_LINE);
        createKeyManagerFactory.init(createKeyStore, getKeyStore().getPassword().toCharArray());
        return createKeyManagerFactory.getKeyManagers();
    }

    /* renamed from: b */
    public final SecureRandom m51440b(ContextAware contextAware) {
        SecureRandom createSecureRandom = getSecureRandom().createSecureRandom();
        contextAware.addInfo("secure random algorithm '" + createSecureRandom.getAlgorithm() + "' provider '" + createSecureRandom.getProvider() + OperatorName.SHOW_TEXT_LINE);
        return createSecureRandom;
    }

    /* renamed from: c */
    public final TrustManager[] m51439c(ContextAware contextAware) {
        if (getTrustStore() == null) {
            return null;
        }
        KeyStore createKeyStore = getTrustStore().createKeyStore();
        contextAware.addInfo("trust store of type '" + createKeyStore.getType() + "' provider '" + createKeyStore.getProvider() + "': " + getTrustStore().getLocation());
        TrustManagerFactory createTrustManagerFactory = getTrustManagerFactory().createTrustManagerFactory();
        contextAware.addInfo("trust manager algorithm '" + createTrustManagerFactory.getAlgorithm() + "' provider '" + createTrustManagerFactory.getProvider() + OperatorName.SHOW_TEXT_LINE);
        createTrustManagerFactory.init(createKeyStore);
        return createTrustManagerFactory.getTrustManagers();
    }

    public SSLContext createContext(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, CertificateException {
        SSLContext sSLContext = getProvider() != null ? SSLContext.getInstance(getProtocol(), getProvider()) : SSLContext.getInstance(getProtocol());
        contextAware.addInfo("SSL protocol '" + sSLContext.getProtocol() + "' provider '" + sSLContext.getProvider() + OperatorName.SHOW_TEXT_LINE);
        sSLContext.init(m51441a(contextAware), m51439c(contextAware), m51440b(contextAware));
        return sSLContext;
    }

    /* renamed from: d */
    public final KeyStoreFactoryBean m51438d(String str) {
        if (System.getProperty(str) == null) {
            return null;
        }
        KeyStoreFactoryBean keyStoreFactoryBean = new KeyStoreFactoryBean();
        keyStoreFactoryBean.setLocation(m51437e(str));
        keyStoreFactoryBean.setProvider(System.getProperty(str + "Provider"));
        keyStoreFactoryBean.setPassword(System.getProperty(str + "Password"));
        keyStoreFactoryBean.setType(System.getProperty(str + "Type"));
        return keyStoreFactoryBean;
    }

    /* renamed from: e */
    public final String m51437e(String str) {
        String property = System.getProperty(str);
        if (property == null || property.startsWith("file:")) {
            return property;
        }
        return "file:" + property;
    }

    public KeyManagerFactoryFactoryBean getKeyManagerFactory() {
        KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean = this.f39951d;
        return keyManagerFactoryFactoryBean == null ? new KeyManagerFactoryFactoryBean() : keyManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getKeyStore() {
        if (this.f39948a == null) {
            this.f39948a = m51438d("javax.net.ssl.keyStore");
        }
        return this.f39948a;
    }

    public String getProtocol() {
        String str = this.f39953f;
        return str == null ? "SSL" : str;
    }

    public String getProvider() {
        return this.f39954g;
    }

    public SecureRandomFactoryBean getSecureRandom() {
        SecureRandomFactoryBean secureRandomFactoryBean = this.f39950c;
        return secureRandomFactoryBean == null ? new SecureRandomFactoryBean() : secureRandomFactoryBean;
    }

    public TrustManagerFactoryFactoryBean getTrustManagerFactory() {
        TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean = this.f39952e;
        return trustManagerFactoryFactoryBean == null ? new TrustManagerFactoryFactoryBean() : trustManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getTrustStore() {
        if (this.f39949b == null) {
            this.f39949b = m51438d("javax.net.ssl.trustStore");
        }
        return this.f39949b;
    }

    public void setKeyManagerFactory(KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean) {
        this.f39951d = keyManagerFactoryFactoryBean;
    }

    public void setKeyStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.f39948a = keyStoreFactoryBean;
    }

    public void setProtocol(String str) {
        this.f39953f = str;
    }

    public void setProvider(String str) {
        this.f39954g = str;
    }

    public void setSecureRandom(SecureRandomFactoryBean secureRandomFactoryBean) {
        this.f39950c = secureRandomFactoryBean;
    }

    public void setTrustManagerFactory(TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean) {
        this.f39952e = trustManagerFactoryFactoryBean;
    }

    public void setTrustStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.f39949b = keyStoreFactoryBean;
    }
}
