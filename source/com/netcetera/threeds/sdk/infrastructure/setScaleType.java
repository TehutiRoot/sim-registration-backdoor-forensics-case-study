package com.netcetera.threeds.sdk.infrastructure;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public class setScaleType implements setImageTintBlendMode {
    private static int ThreeDS2ServiceInstance = 0;
    private static int values = 1;

    @Override // com.netcetera.threeds.sdk.infrastructure.setImageTintBlendMode
    public TrustManager[] valueOf() throws setId {
        int i = ThreeDS2ServiceInstance;
        values = (((i & 120) + (i | 120)) - 1) % 128;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                int i2 = values;
                int i3 = ((i2 ^ 119) | (i2 & 119)) << 1;
                int i4 = -((i2 & (-120)) | ((~i2) & 119));
                ThreeDS2ServiceInstance = ((i3 & i4) + (i3 | i4)) % 128;
                if (trustManagers[0] instanceof X509TrustManager) {
                    int i5 = i2 & 97;
                    ThreeDS2ServiceInstance = (i5 + ((i2 ^ 97) | i5)) % 128;
                    return trustManagers;
                }
            }
            throw setForegroundGravity.setAcsRefNumber.valueOf(Arrays.toString(trustManagers));
        } catch (KeyStoreException | NoSuchAlgorithmException e) {
            throw setForegroundGravity.setThreeDSRequestorAppURL.valueOf(e);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setImageTintBlendMode
    public KeyManager[] values() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 29;
        int i3 = (~i2) & (i | 29);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = i ^ 53;
            values = (((((i & 53) | i6) << 1) - (~(-i6))) - 1) % 128;
            return null;
        }
        throw null;
    }
}
