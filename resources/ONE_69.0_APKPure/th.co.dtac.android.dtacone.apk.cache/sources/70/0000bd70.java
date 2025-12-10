package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.InterfaceC9677pd;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pg */
/* loaded from: classes5.dex */
public class C9681pg<A extends InterfaceC9677pd> {
    private String ThreeDS2Service;
    private final Logger ThreeDS2ServiceInstance;
    private final Map<String, A> get = new LinkedHashMap();

    public C9681pg(String str, Class<A> cls) {
        this.ThreeDS2Service = str;
        this.ThreeDS2ServiceInstance = LoggerFactory.getLogger(getClass().getName() + "->" + cls.getSimpleName());
    }

    private boolean get(A a) {
        try {
            return a.ThreeDS2ServiceInstance();
        } catch (Throwable th2) {
            a.valueOf();
            C9712rh.ThreeDS2ServiceInstance(th2);
            return false;
        }
    }

    public Set<String> ThreeDS2Service() {
        return Collections.unmodifiableSet(this.get.keySet());
    }

    public A ThreeDS2ServiceInstance(String str) throws C9720rp {
        A a = this.get.get(str);
        if (a != null) {
            return a;
        }
        throw new C9720rp(str + " is an unknown, unsupported or unavailable " + this.ThreeDS2Service + " algorithm (not one of " + ThreeDS2Service() + ").");
    }

    public void ThreeDS2Service(A a) {
        String valueOf = a.valueOf();
        if (get(a)) {
            this.get.put(valueOf, a);
        }
    }
}