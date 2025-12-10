package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.AbstractC9696qh;
import com.netcetera.threeds.sdk.infrastructure.AbstractC9700ql;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qu */
/* loaded from: classes5.dex */
public class C9709qu {
    private String ThreeDS2Service;
    protected C9673oq ThreeDS2ServiceInstance = new C9673oq();
    private Map<String, Object> get = new LinkedHashMap();
    private String values;

    public void ThreeDS2Service(String str, Object obj) {
        this.get.put(str, obj);
        this.values = null;
        this.ThreeDS2Service = null;
    }

    public String ThreeDS2ServiceInstance() {
        if (this.values == null) {
            this.values = C9675os.ThreeDS2ServiceInstance(this.get);
        }
        return this.values;
    }

    public String get(String str) {
        return C9729rn.values(this.get, str);
    }

    public void valueOf(String str, String str2) {
        ThreeDS2Service(str, str2);
    }

    public String values() {
        if (this.ThreeDS2Service == null) {
            this.ThreeDS2Service = this.ThreeDS2ServiceInstance.values(ThreeDS2ServiceInstance());
        }
        return this.ThreeDS2Service;
    }

    public AbstractC9700ql get(String str, String str2) throws C9727rl {
        return AbstractC9700ql.valueOf.valueOf((Map) valueOf(str), str2);
    }

    public Object valueOf(String str) {
        return this.get.get(str);
    }

    public void ThreeDS2Service(String str, AbstractC9696qh abstractC9696qh) {
        ThreeDS2Service(str, abstractC9696qh.ThreeDS2ServiceInstance(AbstractC9696qh.get.PUBLIC_ONLY));
    }

    public void ThreeDS2ServiceInstance(String str) throws C9727rl {
        this.ThreeDS2Service = str;
        String ThreeDS2Service = this.ThreeDS2ServiceInstance.ThreeDS2Service(str);
        this.values = ThreeDS2Service;
        this.get = C9675os.values(ThreeDS2Service);
    }

    public Long values(String str) {
        return C9729rn.get(this.get, str);
    }
}
