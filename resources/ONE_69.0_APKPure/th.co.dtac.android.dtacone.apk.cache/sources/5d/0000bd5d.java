package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.os */
/* loaded from: classes5.dex */
public class C9664os {
    private static final InterfaceC9676pc get = new InterfaceC9676pc() { // from class: com.netcetera.threeds.sdk.infrastructure.os.4
        @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9676pc
        public List get() {
            return new ArrayList();
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9676pc
        public Map valueOf() {
            return new ThreeDS2ServiceInstance();
        }
    };

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.os$ThreeDS2ServiceInstance */
    /* loaded from: classes5.dex */
    public static class ThreeDS2ServiceInstance extends LinkedHashMap<String, Object> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: ThreeDS2ServiceInstance */
        public Object put(String str, Object obj) {
            if (!containsKey(str)) {
                return super.put(str, obj);
            }
            throw new IllegalArgumentException("An entry for '" + str + "' already exists. Names must be unique.");
        }
    }

    public static String ThreeDS2ServiceInstance(Map<String, ?> map) {
        return C9670ox.ThreeDS2Service(map);
    }

    public static Map<String, Object> values(String str) throws C9716rl {
        try {
            return (ThreeDS2ServiceInstance) new C9671oy().values(str, get);
        } catch (C9672oz | IllegalArgumentException e) {
            throw new C9716rl("Parsing error: " + e, e);
        }
    }
}