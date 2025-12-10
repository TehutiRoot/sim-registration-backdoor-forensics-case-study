package com.bumptech.glide.provider;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.MultiClassKey;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class LoadPathCache {

    /* renamed from: c */
    public static final LoadPath f42536c = new LoadPath(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.emptyList(), new UnitTranscoder(), null)), null);

    /* renamed from: a */
    public final ArrayMap f42537a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f42538b = new AtomicReference();

    /* renamed from: a */
    public final MultiClassKey m50078a(Class cls, Class cls2, Class cls3) {
        MultiClassKey multiClassKey = (MultiClassKey) this.f42538b.getAndSet(null);
        if (multiClassKey == null) {
            multiClassKey = new MultiClassKey();
        }
        multiClassKey.set(cls, cls2, cls3);
        return multiClassKey;
    }

    @Nullable
    public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> get(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        LoadPath<Data, TResource, Transcode> loadPath;
        MultiClassKey m50078a = m50078a(cls, cls2, cls3);
        synchronized (this.f42537a) {
            loadPath = (LoadPath) this.f42537a.get(m50078a);
        }
        this.f42538b.set(m50078a);
        return loadPath;
    }

    public boolean isEmptyLoadPath(@Nullable LoadPath<?, ?, ?> loadPath) {
        return f42536c.equals(loadPath);
    }

    public void put(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable LoadPath<?, ?, ?> loadPath) {
        synchronized (this.f42537a) {
            ArrayMap arrayMap = this.f42537a;
            MultiClassKey multiClassKey = new MultiClassKey(cls, cls2, cls3);
            if (loadPath == null) {
                loadPath = f42536c;
            }
            arrayMap.put(multiClassKey, loadPath);
        }
    }
}