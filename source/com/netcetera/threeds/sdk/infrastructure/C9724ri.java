package com.netcetera.threeds.sdk.infrastructure;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ri */
/* loaded from: classes5.dex */
public class C9724ri {
    public static MessageDigest get(String str, String str2) {
        try {
            if (str2 == null) {
                return MessageDigest.getInstance(str);
            }
            return MessageDigest.getInstance(str, str2);
        } catch (NoSuchAlgorithmException unused) {
            throw new C9734rt("Unable to get MessageDigest instance with " + str);
        } catch (NoSuchProviderException e) {
            throw new C9734rt("Unable to get a MessageDigest implementation of algorithm name: " + str + " using provider " + str2, e);
        }
    }

    public static MessageDigest valueOf(String str) {
        return get(str, null);
    }
}
