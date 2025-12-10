package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ResourceEncoderRegistry {

    /* renamed from: a */
    public final List f42534a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.ResourceEncoderRegistry$a */
    /* loaded from: classes3.dex */
    public static final class C5918a {

        /* renamed from: a */
        public final Class f42535a;

        /* renamed from: b */
        public final ResourceEncoder f42536b;

        public C5918a(Class cls, ResourceEncoder resourceEncoder) {
            this.f42535a = cls;
            this.f42536b = resourceEncoder;
        }

        /* renamed from: a */
        public boolean m50078a(Class cls) {
            return this.f42535a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void append(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.f42534a.add(new C5918a(cls, resourceEncoder));
    }

    @Nullable
    public synchronized <Z> ResourceEncoder<Z> get(@NonNull Class<Z> cls) {
        int size = this.f42534a.size();
        for (int i = 0; i < size; i++) {
            C5918a c5918a = (C5918a) this.f42534a.get(i);
            if (c5918a.m50078a(cls)) {
                return c5918a.f42536b;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.f42534a.add(0, new C5918a(cls, resourceEncoder));
    }
}
