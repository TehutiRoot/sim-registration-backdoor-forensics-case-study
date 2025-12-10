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
    public String f60317a;

    /* renamed from: b */
    public KeyStore f60318b;

    /* renamed from: c */
    public String f60319c;

    public PublicKeyDecryptionMaterial(KeyStore keyStore, String str, String str2) {
        this.f60318b = keyStore;
        this.f60319c = str;
        this.f60317a = str2;
    }

    public X509Certificate getCertificate() throws KeyStoreException {
        if (this.f60318b.size() == 1) {
            return (X509Certificate) this.f60318b.getCertificate(this.f60318b.aliases().nextElement());
        } else if (this.f60318b.containsAlias(this.f60319c)) {
            return (X509Certificate) this.f60318b.getCertificate(this.f60319c);
        } else {
            throw new KeyStoreException("the keystore does not contain the given alias");
        }
    }

    public String getPassword() {
        return this.f60317a;
    }

    public Key getPrivateKey() throws KeyStoreException {
        try {
            if (this.f60318b.size() == 1) {
                return this.f60318b.getKey(this.f60318b.aliases().nextElement(), this.f60317a.toCharArray());
            } else if (this.f60318b.containsAlias(this.f60319c)) {
                return this.f60318b.getKey(this.f60319c, this.f60317a.toCharArray());
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