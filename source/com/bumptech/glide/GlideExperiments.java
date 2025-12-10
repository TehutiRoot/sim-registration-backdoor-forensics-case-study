package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class GlideExperiments {

    /* renamed from: a */
    public final Map f41694a;

    /* renamed from: com.bumptech.glide.GlideExperiments$a */
    /* loaded from: classes3.dex */
    public static final class C5731a {

        /* renamed from: a */
        public final Map f41695a = new HashMap();

        /* renamed from: b */
        public C5731a m50613b(InterfaceC5732b interfaceC5732b) {
            this.f41695a.put(interfaceC5732b.getClass(), interfaceC5732b);
            return this;
        }

        /* renamed from: c */
        public GlideExperiments m50612c() {
            return new GlideExperiments(this);
        }

        /* renamed from: d */
        public C5731a m50611d(InterfaceC5732b interfaceC5732b, boolean z) {
            if (z) {
                m50613b(interfaceC5732b);
            } else {
                this.f41695a.remove(interfaceC5732b.getClass());
            }
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.GlideExperiments$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5732b {
    }

    public GlideExperiments(C5731a c5731a) {
        this.f41694a = Collections.unmodifiableMap(new HashMap(c5731a.f41695a));
    }

    public boolean isEnabled(Class<? extends InterfaceC5732b> cls) {
        return this.f41694a.containsKey(cls);
    }
}
