package com.netcetera.threeds.sdk.infrastructure;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Mac;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.rs */
/* loaded from: classes5.dex */
public class C9722rs {
    public static Mac ThreeDS2Service(String str, Key key, String str2) throws C9716rl {
        Mac ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(str, str2);
        values(ThreeDS2ServiceInstance, key);
        return ThreeDS2ServiceInstance;
    }

    public static Mac ThreeDS2ServiceInstance(String str, String str2) throws C9716rl {
        try {
            if (str2 == null) {
                return Mac.getInstance(str);
            }
            return Mac.getInstance(str, str2);
        } catch (NoSuchAlgorithmException e) {
            throw new C9716rl("Unable to get a MAC implementation of algorithm name: " + str, e);
        } catch (NoSuchProviderException e2) {
            throw new C9716rl("Unable to get a MAC implementation of algorithm name: " + str + " using provider " + str2, e2);
        }
    }

    public static void values(Mac mac, Key key) throws C9717rm {
        try {
            mac.init(key);
        } catch (InvalidKeyException e) {
            throw new C9717rm("Key is not valid for " + mac.getAlgorithm(), e);
        }
    }
}