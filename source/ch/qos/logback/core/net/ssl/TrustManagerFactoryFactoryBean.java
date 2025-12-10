package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.TrustManagerFactory;

/* loaded from: classes.dex */
public class TrustManagerFactoryFactoryBean {

    /* renamed from: a */
    public String f39965a;

    /* renamed from: b */
    public String f39966b;

    public TrustManagerFactory createTrustManagerFactory() throws NoSuchProviderException, NoSuchAlgorithmException {
        return getProvider() != null ? TrustManagerFactory.getInstance(getAlgorithm(), getProvider()) : TrustManagerFactory.getInstance(getAlgorithm());
    }

    public String getAlgorithm() {
        String str = this.f39965a;
        return str == null ? TrustManagerFactory.getDefaultAlgorithm() : str;
    }

    public String getProvider() {
        return this.f39966b;
    }

    public void setAlgorithm(String str) {
        this.f39965a = str;
    }

    public void setProvider(String str) {
        this.f39966b = str;
    }
}
