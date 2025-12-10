package com.netcetera.threeds.sdk.infrastructure;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.Serializable;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qh */
/* loaded from: classes5.dex */
public abstract class AbstractC9685qh implements Serializable {
    private String ThreeDS2Service;
    protected Key ThreeDS2ServiceInstance;
    protected Map<String, Object> get;
    private List<String> getSDKVersion;
    private String valueOf;
    private String values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qh$get */
    /* loaded from: classes5.dex */
    public enum get {
        INCLUDE_PRIVATE,
        INCLUDE_SYMMETRIC,
        PUBLIC_ONLY
    }

    public AbstractC9685qh(Key key) {
        this.get = new LinkedHashMap();
        this.ThreeDS2ServiceInstance = key;
    }

    public void ThreeDS2Service(String str) {
        this.ThreeDS2Service = str;
    }

    public abstract String ThreeDS2ServiceInstance();

    public void ThreeDS2ServiceInstance(String str) {
        this.values = str;
    }

    public String cleanup() {
        return this.valueOf;
    }

    public PublicKey get() {
        try {
            return (PublicKey) this.ThreeDS2ServiceInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract void get(Map<String, Object> map, get getVar);

    public String getSDKInfo() {
        return this.values;
    }

    public Key getSDKVersion() {
        return this.ThreeDS2ServiceInstance;
    }

    public String getWarnings() {
        return ThreeDS2Service(get.INCLUDE_SYMMETRIC);
    }

    public String initialize() {
        return this.ThreeDS2Service;
    }

    public String toString() {
        return getClass().getName() + ThreeDS2ServiceInstance(get.PUBLIC_ONLY);
    }

    public void valueOf(String str) {
        this.valueOf = str;
    }

    public static String get(Map<String, Object> map, String str) throws C9716rl {
        return C9718rn.ThreeDS2ServiceInstance(map, str);
    }

    public String ThreeDS2Service(get getVar) {
        return C9664os.ThreeDS2ServiceInstance(ThreeDS2ServiceInstance(getVar));
    }

    public Map<String, Object> ThreeDS2ServiceInstance(get getVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("kty", ThreeDS2ServiceInstance());
        ThreeDS2Service("kid", cleanup(), linkedHashMap);
        ThreeDS2Service("use", getSDKInfo(), linkedHashMap);
        ThreeDS2Service("key_ops", this.getSDKVersion, linkedHashMap);
        ThreeDS2Service("alg", initialize(), linkedHashMap);
        get(linkedHashMap, getVar);
        linkedHashMap.putAll(this.get);
        return linkedHashMap;
    }

    public void valueOf(String... strArr) {
        for (String str : strArr) {
            this.get.remove(str);
        }
    }

    public AbstractC9685qh(Map<String, Object> map) throws C9716rl {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.get = linkedHashMap;
        linkedHashMap.putAll(map);
        valueOf("kty", "use", "kid", "alg", "key_ops");
        ThreeDS2ServiceInstance(get(map, "use"));
        valueOf(get(map, "kid"));
        ThreeDS2Service(get(map, "alg"));
        if (map.containsKey("key_ops")) {
            this.getSDKVersion = C9718rn.valueOf(map, "key_ops");
        }
    }

    public void ThreeDS2Service(String str, Object obj, Map<String, Object> map) {
        if (obj != null) {
            map.put(str, obj);
        }
    }

    public static String ThreeDS2Service(Map<String, Object> map, String str, boolean z) throws C9716rl {
        String str2 = get(map, str);
        if (str2 == null && z) {
            throw new C9716rl("Missing required '" + str + "' parameter.");
        }
        return str2;
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qh$values */
    /* loaded from: classes5.dex */
    public static class values {
        public static AbstractC9685qh ThreeDS2Service(Key key) throws C9716rl {
            if (RSAPublicKey.class.isInstance(key)) {
                return new C9690qm((RSAPublicKey) key);
            }
            if (ECPublicKey.class.isInstance(key)) {
                return new C9688qk((ECPublicKey) key);
            }
            if (!PublicKey.class.isInstance(key)) {
                return new C9686qi(key);
            }
            throw new C9716rl("Unsupported or unknown public key " + key);
        }

        public static AbstractC9685qh ThreeDS2ServiceInstance(Map<String, Object> map) throws C9716rl {
            String ThreeDS2ServiceInstance = AbstractC9685qh.ThreeDS2ServiceInstance(map, "kty");
            ThreeDS2ServiceInstance.hashCode();
            char c = 65535;
            switch (ThreeDS2ServiceInstance.hashCode()) {
                case 2206:
                    if (ThreeDS2ServiceInstance.equals("EC")) {
                        c = 0;
                        break;
                    }
                    break;
                case 81440:
                    if (ThreeDS2ServiceInstance.equals("RSA")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109856:
                    if (ThreeDS2ServiceInstance.equals("oct")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C9688qk(map);
                case 1:
                    return new C9690qm(map);
                case 2:
                    return new C9686qi(map);
                default:
                    throw new C9716rl("Unknown key type algorithm: '" + ThreeDS2ServiceInstance + OperatorName.SHOW_TEXT_LINE);
            }
        }

        public static AbstractC9685qh ThreeDS2ServiceInstance(String str) throws C9716rl {
            return ThreeDS2ServiceInstance(C9664os.values(str));
        }
    }

    public static String ThreeDS2ServiceInstance(Map<String, Object> map, String str) throws C9716rl {
        return ThreeDS2Service(map, str, true);
    }
}