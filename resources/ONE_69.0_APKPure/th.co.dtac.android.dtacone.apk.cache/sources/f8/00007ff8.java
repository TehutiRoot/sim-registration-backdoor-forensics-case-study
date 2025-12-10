package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class GlideExperiments {

    /* renamed from: a */
    public final Map f41706a;

    /* renamed from: com.bumptech.glide.GlideExperiments$a */
    /* loaded from: classes3.dex */
    public static final class C5720a {

        /* renamed from: a */
        public final Map f41707a = new HashMap();

        /* renamed from: b */
        public C5720a m50610b(InterfaceC5721b interfaceC5721b) {
            this.f41707a.put(interfaceC5721b.getClass(), interfaceC5721b);
            return this;
        }

        /* renamed from: c */
        public GlideExperiments m50609c() {
            return new GlideExperiments(this);
        }

        /* renamed from: d */
        public C5720a m50608d(InterfaceC5721b interfaceC5721b, boolean z) {
            if (z) {
                m50610b(interfaceC5721b);
            } else {
                this.f41707a.remove(interfaceC5721b.getClass());
            }
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.GlideExperiments$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC5721b {
    }

    public GlideExperiments(C5720a c5720a) {
        this.f41706a = Collections.unmodifiableMap(new HashMap(c5720a.f41707a));
    }

    public boolean isEnabled(Class<? extends InterfaceC5721b> cls) {
        return this.f41706a.containsKey(cls);
    }
}