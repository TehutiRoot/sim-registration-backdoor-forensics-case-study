package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.KeyManagerFactory;

/* loaded from: classes.dex */
public class KeyManagerFactoryFactoryBean {

    /* renamed from: a */
    public String f39939a;

    /* renamed from: b */
    public String f39940b;

    public KeyManagerFactory createKeyManagerFactory() throws NoSuchProviderException, NoSuchAlgorithmException {
        return getProvider() != null ? KeyManagerFactory.getInstance(getAlgorithm(), getProvider()) : KeyManagerFactory.getInstance(getAlgorithm());
    }

    public String getAlgorithm() {
        String str = this.f39939a;
        return str == null ? KeyManagerFactory.getDefaultAlgorithm() : str;
    }

    public String getProvider() {
        return this.f39940b;
    }

    public void setAlgorithm(String str) {
        this.f39939a = str;
    }

    public void setProvider(String str) {
        this.f39940b = str;
    }
}
