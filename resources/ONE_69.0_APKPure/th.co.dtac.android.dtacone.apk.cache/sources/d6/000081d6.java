package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ResourceEncoderRegistry {

    /* renamed from: a */
    public final List f42546a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.ResourceEncoderRegistry$a */
    /* loaded from: classes3.dex */
    public static final class C5907a {

        /* renamed from: a */
        public final Class f42547a;

        /* renamed from: b */
        public final ResourceEncoder f42548b;

        public C5907a(Class cls, ResourceEncoder resourceEncoder) {
            this.f42547a = cls;
            this.f42548b = resourceEncoder;
        }

        /* renamed from: a */
        public boolean m50075a(Class cls) {
            return this.f42547a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void append(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.f42546a.add(new C5907a(cls, resourceEncoder));
    }

    @Nullable
    public synchronized <Z> ResourceEncoder<Z> get(@NonNull Class<Z> cls) {
        int size = this.f42546a.size();
        for (int i = 0; i < size; i++) {
            C5907a c5907a = (C5907a) this.f42546a.get(i);
            if (c5907a.m50075a(cls)) {
                return c5907a.f42548b;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(@NonNull Class<Z> cls, @NonNull ResourceEncoder<Z> resourceEncoder) {
        this.f42546a.add(0, new C5907a(cls, resourceEncoder));
    }
}