package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.TrustManagerFactory;

/* loaded from: classes.dex */
public class TrustManagerFactoryFactoryBean {

    /* renamed from: a */
    public String f39963a;

    /* renamed from: b */
    public String f39964b;

    public TrustManagerFactory createTrustManagerFactory() throws NoSuchProviderException, NoSuchAlgorithmException {
        return getProvider() != null ? TrustManagerFactory.getInstance(getAlgorithm(), getProvider()) : TrustManagerFactory.getInstance(getAlgorithm());
    }

    public String getAlgorithm() {
        String str = this.f39963a;
        return str == null ? TrustManagerFactory.getDefaultAlgorithm() : str;
    }

    public String getProvider() {
        return this.f39964b;
    }

    public void setAlgorithm(String str) {
        this.f39963a = str;
    }

    public void setProvider(String str) {
        this.f39964b = str;
    }
}