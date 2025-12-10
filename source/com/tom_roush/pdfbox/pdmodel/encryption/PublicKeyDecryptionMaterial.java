package com.tom_roush.pdfbox.pdmodel.encryption;

import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;

/* loaded from: classes5.dex */
public class PublicKeyDecryptionMaterial extends DecryptionMaterial {

    /* renamed from: a */
    public String f60305a;

    /* renamed from: b */
    public KeyStore f60306b;

    /* renamed from: c */
    public String f60307c;

    public PublicKeyDecryptionMaterial(KeyStore keyStore, String str, String str2) {
        this.f60306b = keyStore;
        this.f60307c = str;
        this.f60305a = str2;
    }

    public X509Certificate getCertificate() throws KeyStoreException {
        if (this.f60306b.size() == 1) {
            return (X509Certificate) this.f60306b.getCertificate(this.f60306b.aliases().nextElement());
        } else if (this.f60306b.containsAlias(this.f60307c)) {
            return (X509Certificate) this.f60306b.getCertificate(this.f60307c);
        } else {
            throw new KeyStoreException("the keystore does not contain the given alias");
        }
    }

    public String getPassword() {
        return this.f60305a;
    }

    public Key getPrivateKey() throws KeyStoreException {
        try {
            if (this.f60306b.size() == 1) {
                return this.f60306b.getKey(this.f60306b.aliases().nextElement(), this.f60305a.toCharArray());
            } else if (this.f60306b.containsAlias(this.f60307c)) {
                return this.f60306b.getKey(this.f60307c, this.f60305a.toCharArray());
            } else {
                throw new KeyStoreException("the keystore does not contain the given alias");
            }
        } catch (NoSuchAlgorithmException e) {
            throw new KeyStoreException("the algorithm necessary to recover the key is not available", e);
        } catch (UnrecoverableKeyException e2) {
            throw new KeyStoreException("the private key is not recoverable", e2);
        }
    }
}
