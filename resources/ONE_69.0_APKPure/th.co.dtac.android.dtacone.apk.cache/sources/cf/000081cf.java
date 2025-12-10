package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class EncoderRegistry {

    /* renamed from: a */
    public final List f42532a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.EncoderRegistry$a */
    /* loaded from: classes3.dex */
    public static final class C5905a {

        /* renamed from: a */
        public final Class f42533a;

        /* renamed from: b */
        public final Encoder f42534b;

        public C5905a(Class cls, Encoder encoder) {
            this.f42533a = cls;
            this.f42534b = encoder;
        }

        /* renamed from: a */
        public boolean m50079a(Class cls) {
            return this.f42533a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void append(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.f42532a.add(new C5905a(cls, encoder));
    }

    @Nullable
    public synchronized <T> Encoder<T> getEncoder(@NonNull Class<T> cls) {
        for (C5905a c5905a : this.f42532a) {
            if (c5905a.m50079a(cls)) {
                return c5905a.f42534b;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.f42532a.add(0, new C5905a(cls, encoder));
    }
}