package com.netcetera.threeds.sdk.infrastructure;

import java.security.Key;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ra */
/* loaded from: classes5.dex */
public abstract class AbstractC9716ra {
    private static final C9674or initialize = new C9674or();
    private byte[] ThreeDS2ServiceInstance;
    private Key get;
    protected String getSDKVersion;
    protected C9673oq values = new C9673oq();
    protected C9709qu cleanup = new C9709qu();
    protected boolean getWarnings = true;
    private C9690pf valueOf = C9690pf.valueOf;
    private Set<String> ThreeDS2Service = Collections.emptySet();
    private C9674or getSDKInfo = initialize;

    public List<X509Certificate> ConfigParameters() throws C9727rl {
        Object valueOf = this.cleanup.valueOf("x5c");
        if (valueOf instanceof List) {
            List<String> list = (List) valueOf;
            ArrayList arrayList = new ArrayList(list.size());
            C9722rg c9722rg = new C9722rg();
            for (String str : list) {
                arrayList.add(c9722rg.valueOf(str));
            }
            return arrayList;
        }
        return null;
    }

    public boolean ConfigurationBuilder() {
        return this.getWarnings;
    }

    public String ThreeDS2Service$InitializationCallback() {
        return getWarnings("alg");
    }

    public boolean ThreeDS2ServiceInstance(String str) {
        return false;
    }

    /* renamed from: a_ */
    public void mo33352a_() {
    }

    public C9690pf addParam() {
        return this.valueOf;
    }

    public void apiKey() throws C9727rl {
        Object valueOf = this.cleanup.valueOf("crit");
        if (valueOf != null) {
            try {
                for (String str : (List) valueOf) {
                    if (!this.ThreeDS2Service.contains(str) && !ThreeDS2ServiceInstance(str)) {
                        throw new C9727rl("Unrecognized header '" + str + "' marked as critical.");
                    }
                }
            } catch (ClassCastException unused) {
                throw new C9727rl("crit header value not an array.");
            }
        }
    }

    public void cleanup(String str) {
        get("alg", str);
    }

    public String createTransaction() {
        return this.cleanup.values();
    }

    public void get(String str, String str2) {
        this.cleanup.valueOf(str, str2);
    }

    public abstract void get(String[] strArr) throws C9727rl;

    public byte[] getParamValue() {
        return this.ThreeDS2ServiceInstance;
    }

    public void getSDKInfo(String str) throws C9727rl {
        values(str, "Encoded Header");
        this.cleanup.ThreeDS2ServiceInstance(str);
    }

    public void getSDKVersion(String str) throws C9727rl {
        get(C9710qv.values(str));
        this.getSDKVersion = str;
    }

    public String getWarnings(String str) {
        return this.cleanup.get(str);
    }

    public void initialize(String str) {
        get("kid", str);
    }

    public C9709qu onCompleted() {
        return this.cleanup;
    }

    public Key onError() {
        return this.get;
    }

    public C9674or removeParam() {
        return this.getSDKInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(onCompleted().ThreeDS2ServiceInstance());
        if (this.getSDKVersion != null) {
            sb.append("->");
            sb.append(this.getSDKVersion);
        }
        return sb.toString();
    }

    public void values(String str, String str2) throws C9727rl {
        if (str == null || str.length() == 0) {
            throw new C9727rl("The " + str2 + " cannot be empty.");
        }
    }

    public void ThreeDS2ServiceInstance(C9674or c9674or) {
        this.getSDKInfo = c9674or;
    }

    public void values(Key key) {
        Key key2;
        if (key != null ? (key2 = this.get) == null || !key.equals(key2) : this.get != null) {
            mo33352a_();
        }
        this.get = key;
    }

    public void values(byte[] bArr) {
        this.ThreeDS2ServiceInstance = bArr;
    }

    public void values(C9690pf c9690pf) {
        this.valueOf = c9690pf;
    }
}
