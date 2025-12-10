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
    public static final LoadPath f42524c = new LoadPath(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.emptyList(), new UnitTranscoder(), null)), null);

    /* renamed from: a */
    public final ArrayMap f42525a = new ArrayMap();

    /* renamed from: b */
    public final AtomicReference f42526b = new AtomicReference();

    /* renamed from: a */
    public final MultiClassKey m50081a(Class cls, Class cls2, Class cls3) {
        MultiClassKey multiClassKey = (MultiClassKey) this.f42526b.getAndSet(null);
        if (multiClassKey == null) {
            multiClassKey = new MultiClassKey();
        }
        multiClassKey.set(cls, cls2, cls3);
        return multiClassKey;
    }

    @Nullable
    public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> get(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        LoadPath<Data, TResource, Transcode> loadPath;
        MultiClassKey m50081a = m50081a(cls, cls2, cls3);
        synchronized (this.f42525a) {
            loadPath = (LoadPath) this.f42525a.get(m50081a);
        }
        this.f42526b.set(m50081a);
        return loadPath;
    }

    public boolean isEmptyLoadPath(@Nullable LoadPath<?, ?, ?> loadPath) {
        return f42524c.equals(loadPath);
    }

    public void put(Class<?> cls, Class<?> cls2, Class<?> cls3, @Nullable LoadPath<?, ?, ?> loadPath) {
        synchronized (this.f42525a) {
            ArrayMap arrayMap = this.f42525a;
            MultiClassKey multiClassKey = new MultiClassKey(cls, cls2, cls3);
            if (loadPath == null) {
                loadPath = f42524c;
            }
            arrayMap.put(multiClassKey, loadPath);
        }
    }
}
