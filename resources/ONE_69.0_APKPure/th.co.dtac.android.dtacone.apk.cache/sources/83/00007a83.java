package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class SecureRandomFactoryBean {

    /* renamed from: a */
    public String f39961a;

    /* renamed from: b */
    public String f39962b;

    public SecureRandom createSecureRandom() throws NoSuchProviderException, NoSuchAlgorithmException {
        try {
            return getProvider() != null ? SecureRandom.getInstance(getAlgorithm(), getProvider()) : SecureRandom.getInstance(getAlgorithm());
        } catch (NoSuchAlgorithmException unused) {
            throw new NoSuchAlgorithmException("no such secure random algorithm: " + getAlgorithm());
        } catch (NoSuchProviderException unused2) {
            throw new NoSuchProviderException("no such secure random provider: " + getProvider());
        }
    }

    public String getAlgorithm() {
        String str = this.f39961a;
        return str == null ? SSL.DEFAULT_SECURE_RANDOM_ALGORITHM : str;
    }

    public String getProvider() {
        return this.f39962b;
    }

    public void setAlgorithm(String str) {
        this.f39961a = str;
    }

    public void setProvider(String str) {
        this.f39962b = str;
    }
}