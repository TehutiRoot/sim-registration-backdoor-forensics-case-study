package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class ModelToResourceClassCache {

    /* renamed from: a */
    public final AtomicReference f42539a = new AtomicReference();

    /* renamed from: b */
    public final ArrayMap f42540b = new ArrayMap();

    public void clear() {
        synchronized (this.f42540b) {
            this.f42540b.clear();
        }
    }

    @Nullable
    public List<Class<?>> get(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        MultiClassKey multiClassKey = (MultiClassKey) this.f42539a.getAndSet(null);
        if (multiClassKey == null) {
            multiClassKey = new MultiClassKey(cls, cls2, cls3);
        } else {
            multiClassKey.set(cls, cls2, cls3);
        }
        synchronized (this.f42540b) {
            list = (List) this.f42540b.get(multiClassKey);
        }
        this.f42539a.set(multiClassKey);
        return list;
    }

    public void put(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f42540b) {
            this.f42540b.put(new MultiClassKey(cls, cls2, cls3), list);
        }
    }
}