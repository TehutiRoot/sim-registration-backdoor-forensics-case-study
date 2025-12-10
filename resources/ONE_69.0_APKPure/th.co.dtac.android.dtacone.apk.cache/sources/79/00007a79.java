package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.util.LocationUtil;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* loaded from: classes.dex */
public class KeyStoreFactoryBean {

    /* renamed from: a */
    public String f39939a;

    /* renamed from: b */
    public String f39940b;

    /* renamed from: c */
    public String f39941c;

    /* renamed from: d */
    public String f39942d;

    /* renamed from: a */
    public final KeyStore m51437a() {
        return getProvider() != null ? KeyStore.getInstance(getType(), getProvider()) : KeyStore.getInstance(getType());
    }

    public KeyStore createKeyStore() throws NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException {
        if (getLocation() != null) {
            InputStream inputStream = null;
            try {
                try {
                    try {
                        inputStream = LocationUtil.urlForResource(getLocation()).openStream();
                        KeyStore m51437a = m51437a();
                        m51437a.load(inputStream, getPassword().toCharArray());
                        return m51437a;
                    } catch (NoSuchAlgorithmException unused) {
                        throw new NoSuchAlgorithmException("no such keystore type: " + getType());
                    } catch (Exception e) {
                        throw new KeyStoreException(getLocation() + ": " + e.getMessage(), e);
                    }
                } catch (FileNotFoundException unused2) {
                    throw new KeyStoreException(getLocation() + ": file not found");
                } catch (NoSuchProviderException unused3) {
                    throw new NoSuchProviderException("no such keystore provider: " + getProvider());
                }
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace(System.err);
                    }
                }
            }
        }
        throw new IllegalArgumentException("location is required");
    }

    public String getLocation() {
        return this.f39939a;
    }

    public String getPassword() {
        String str = this.f39942d;
        return str == null ? SSL.DEFAULT_KEYSTORE_PASSWORD : str;
    }

    public String getProvider() {
        return this.f39940b;
    }

    public String getType() {
        String str = this.f39941c;
        return str == null ? SSL.DEFAULT_KEYSTORE_TYPE : str;
    }

    public void setLocation(String str) {
        this.f39939a = str;
    }

    public void setPassword(String str) {
        this.f39942d = str;
    }

    public void setProvider(String str) {
        this.f39940b = str;
    }

    public void setType(String str) {
        this.f39941c = str;
    }
}