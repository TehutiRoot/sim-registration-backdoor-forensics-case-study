package com.netcetera.threeds.sdk.infrastructure;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Set;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.rf */
/* loaded from: classes5.dex */
abstract class AbstractC9710rf {
    protected SecureRandom get;
    protected String valueOf;

    public AbstractC9710rf(String str, SecureRandom secureRandom) {
        this.valueOf = str;
        this.get = secureRandom;
    }

    public abstract String ThreeDS2Service();

    public boolean ThreeDS2ServiceInstance() {
        Set<String> algorithms = Security.getAlgorithms("KeyFactory");
        Set<String> algorithms2 = Security.getAlgorithms("KeyPairGenerator");
        String ThreeDS2Service = ThreeDS2Service();
        if (algorithms2.contains(ThreeDS2Service) && algorithms.contains(ThreeDS2Service)) {
            return true;
        }
        return false;
    }

    public KeyPairGenerator valueOf() throws C9716rl {
        String ThreeDS2Service = ThreeDS2Service();
        try {
            String str = this.valueOf;
            if (str == null) {
                return KeyPairGenerator.getInstance(ThreeDS2Service);
            }
            return KeyPairGenerator.getInstance(ThreeDS2Service, str);
        } catch (NoSuchAlgorithmException e) {
            throw new C9716rl("Couldn't find " + ThreeDS2Service + " KeyPairGenerator! " + e, e);
        } catch (NoSuchProviderException e2) {
            throw new C9716rl("Cannot get KeyPairGenerator instance with provider " + this.valueOf, e2);
        }
    }

    public KeyFactory values() throws C9716rl {
        String ThreeDS2Service = ThreeDS2Service();
        try {
            String str = this.valueOf;
            if (str == null) {
                return KeyFactory.getInstance(ThreeDS2Service);
            }
            return KeyFactory.getInstance(ThreeDS2Service, str);
        } catch (NoSuchAlgorithmException e) {
            throw new C9716rl("Couldn't find " + ThreeDS2Service + " KeyFactory! " + e, e);
        } catch (NoSuchProviderException e2) {
            throw new C9716rl("Cannot get KeyFactory instance with provider " + this.valueOf, e2);
        }
    }
}