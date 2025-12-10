package com.netcetera.threeds.sdk.infrastructure;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qq */
/* loaded from: classes5.dex */
public abstract class AbstractC9705qq extends AbstractC9694pm implements InterfaceC9706qr {
    private final Logger ThreeDS2ServiceInstance = LoggerFactory.getLogger(getClass());
    private AlgorithmParameterSpec values;

    public AbstractC9705qq(String str, String str2, String str3) {
        valueOf(str);
        values(str2);
        ThreeDS2Service(EnumC9717rb.ASYMMETRIC);
        get(str3);
    }

    private void ThreeDS2ServiceInstance(Key key) throws C9728rm {
        if (key == null) {
            throw new C9728rm("Key cannot be null");
        }
    }

    private String values(Key key) {
        String str;
        if (key == null) {
            str = "key is null";
        } else {
            str = "algorithm=" + key.getAlgorithm();
        }
        return "The given key (" + str + ") is not valid ";
    }

    public boolean ThreeDS2Service(byte[] bArr, Key key, byte[] bArr2, C9674or c9674or) throws C9727rl {
        Signature ThreeDS2Service = ThreeDS2Service(c9674or);
        get(ThreeDS2Service, key);
        try {
            ThreeDS2Service.update(bArr2);
            return ThreeDS2Service.verify(bArr);
        } catch (SignatureException unused) {
            this.ThreeDS2ServiceInstance.isDebugEnabled();
            return false;
        }
    }

    public abstract void ThreeDS2ServiceInstance(PublicKey publicKey) throws C9728rm;

    public void get(AlgorithmParameterSpec algorithmParameterSpec) {
        this.values = algorithmParameterSpec;
    }

    private void get(Signature signature, Key key) throws C9728rm {
        try {
            signature.initVerify((PublicKey) key);
        } catch (InvalidKeyException e) {
            throw new C9728rm(values(key) + "for " + ThreeDS2Service(), e);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9688pd
    public boolean ThreeDS2ServiceInstance() {
        try {
            return ThreeDS2Service(new C9674or()) != null;
        } catch (Exception e) {
            valueOf();
            ThreeDS2Service();
            C9723rh.ThreeDS2ServiceInstance(e);
            return false;
        }
    }

    private Signature ThreeDS2Service(C9674or c9674or) throws C9727rl {
        Signature signature;
        String ThreeDS2Service = c9674or.get().ThreeDS2Service();
        String ThreeDS2Service2 = ThreeDS2Service();
        try {
            if (ThreeDS2Service == null) {
                signature = Signature.getInstance(ThreeDS2Service2);
            } else {
                signature = Signature.getInstance(ThreeDS2Service2, ThreeDS2Service);
            }
            AlgorithmParameterSpec algorithmParameterSpec = this.values;
            if (algorithmParameterSpec != null) {
                try {
                    signature.setParameter(algorithmParameterSpec);
                } catch (UnsupportedOperationException unused) {
                    this.ThreeDS2ServiceInstance.isDebugEnabled();
                }
            }
            return signature;
        } catch (InvalidAlgorithmParameterException e) {
            throw new C9727rl("Invalid algorithm parameter (" + this.values + ") for: " + ThreeDS2Service2, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new C9727rl("Unable to get an implementation of algorithm name: " + ThreeDS2Service2, e2);
        } catch (NoSuchProviderException e3) {
            throw new C9727rl("Unable to get an implementation of " + ThreeDS2Service2 + " for provider " + ThreeDS2Service, e3);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9706qr
    public void ThreeDS2Service(Key key) throws C9728rm {
        ThreeDS2ServiceInstance(key);
        try {
            ThreeDS2ServiceInstance((PublicKey) key);
        } catch (ClassCastException e) {
            throw new C9728rm(values(key) + "(not a public key or is the wrong type of key) for " + ThreeDS2Service() + RemoteSettings.FORWARD_SLASH_STRING + valueOf() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + e);
        }
    }
}
