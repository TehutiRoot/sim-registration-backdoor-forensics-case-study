package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ModelLoaderRegistry {

    /* renamed from: a */
    public final MultiModelLoaderFactory f42232a;

    /* renamed from: b */
    public final C5837a f42233b;

    /* renamed from: com.bumptech.glide.load.model.ModelLoaderRegistry$a */
    /* loaded from: classes3.dex */
    public static class C5837a {

        /* renamed from: a */
        public final Map f42234a = new HashMap();

        /* renamed from: com.bumptech.glide.load.model.ModelLoaderRegistry$a$a */
        /* loaded from: classes3.dex */
        public static class C5838a {

            /* renamed from: a */
            public final List f42235a;

            public C5838a(List list) {
                this.f42235a = list;
            }
        }

        /* renamed from: a */
        public void m50276a() {
            this.f42234a.clear();
        }

        /* renamed from: b */
        public List m50275b(Class cls) {
            C5838a c5838a = (C5838a) this.f42234a.get(cls);
            if (c5838a == null) {
                return null;
            }
            return c5838a.f42235a;
        }

        /* renamed from: c */
        public void m50274c(Class cls, List list) {
            if (((C5838a) this.f42234a.put(cls, new C5838a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public ModelLoaderRegistry(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new MultiModelLoaderFactory(pool));
    }

    /* renamed from: a */
    public static Class m50279a(Object obj) {
        return obj.getClass();
    }

    public synchronized <Model, Data> void append(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f42232a.m50272b(cls, cls2, modelLoaderFactory);
        this.f42233b.m50276a();
    }

    /* renamed from: b */
    public final synchronized List m50278b(Class cls) {
        List m50275b;
        m50275b = this.f42233b.m50275b(cls);
        if (m50275b == null) {
            m50275b = Collections.unmodifiableList(this.f42232a.m50270d(cls));
            this.f42233b.m50274c(cls, m50275b);
        }
        return m50275b;
    }

    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.f42232a.build(cls, cls2);
    }

    /* renamed from: c */
    public final void m50277c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ModelLoaderFactory) it.next()).teardown();
        }
    }

    @NonNull
    public synchronized List<Class<?>> getDataClasses(@NonNull Class<?> cls) {
        return this.f42232a.m50268f(cls);
    }

    @NonNull
    public <A> List<ModelLoader<A, ?>> getModelLoaders(@NonNull A a) {
        List m50278b = m50278b(m50279a(a));
        if (!m50278b.isEmpty()) {
            int size = m50278b.size();
            List<ModelLoader<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                ModelLoader<A, ?> modelLoader = (ModelLoader) m50278b.get(i);
                if (modelLoader.handles(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(modelLoader);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a, m50278b);
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    public synchronized <Model, Data> void prepend(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f42232a.m50266h(cls, cls2, modelLoaderFactory);
        this.f42233b.m50276a();
    }

    public synchronized <Model, Data> void remove(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        m50277c(this.f42232a.m50265i(cls, cls2));
        this.f42233b.m50276a();
    }

    public synchronized <Model, Data> void replace(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        m50277c(this.f42232a.m50264j(cls, cls2, modelLoaderFactory));
        this.f42233b.m50276a();
    }

    public ModelLoaderRegistry(MultiModelLoaderFactory multiModelLoaderFactory) {
        this.f42233b = new C5837a();
        this.f42232a = multiModelLoaderFactory;
    }
}