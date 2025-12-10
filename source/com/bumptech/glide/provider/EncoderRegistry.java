package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class EncoderRegistry {

    /* renamed from: a */
    public final List f42520a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.EncoderRegistry$a */
    /* loaded from: classes3.dex */
    public static final class C5916a {

        /* renamed from: a */
        public final Class f42521a;

        /* renamed from: b */
        public final Encoder f42522b;

        public C5916a(Class cls, Encoder encoder) {
            this.f42521a = cls;
            this.f42522b = encoder;
        }

        /* renamed from: a */
        public boolean m50082a(Class cls) {
            return this.f42521a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void append(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.f42520a.add(new C5916a(cls, encoder));
    }

    @Nullable
    public synchronized <T> Encoder<T> getEncoder(@NonNull Class<T> cls) {
        for (C5916a c5916a : this.f42520a) {
            if (c5916a.m50082a(cls)) {
                return c5916a.f42522b;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.f42520a.add(0, new C5916a(cls, encoder));
    }
}
