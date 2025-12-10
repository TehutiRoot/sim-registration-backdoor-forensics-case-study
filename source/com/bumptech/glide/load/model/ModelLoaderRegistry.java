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
    public final MultiModelLoaderFactory f42220a;

    /* renamed from: b */
    public final C5848a f42221b;

    /* renamed from: com.bumptech.glide.load.model.ModelLoaderRegistry$a */
    /* loaded from: classes3.dex */
    public static class C5848a {

        /* renamed from: a */
        public final Map f42222a = new HashMap();

        /* renamed from: com.bumptech.glide.load.model.ModelLoaderRegistry$a$a */
        /* loaded from: classes3.dex */
        public static class C5849a {

            /* renamed from: a */
            public final List f42223a;

            public C5849a(List list) {
                this.f42223a = list;
            }
        }

        /* renamed from: a */
        public void m50279a() {
            this.f42222a.clear();
        }

        /* renamed from: b */
        public List m50278b(Class cls) {
            C5849a c5849a = (C5849a) this.f42222a.get(cls);
            if (c5849a == null) {
                return null;
            }
            return c5849a.f42223a;
        }

        /* renamed from: c */
        public void m50277c(Class cls, List list) {
            if (((C5849a) this.f42222a.put(cls, new C5849a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public ModelLoaderRegistry(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new MultiModelLoaderFactory(pool));
    }

    /* renamed from: a */
    public static Class m50282a(Object obj) {
        return obj.getClass();
    }

    public synchronized <Model, Data> void append(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f42220a.m50275b(cls, cls2, modelLoaderFactory);
        this.f42221b.m50279a();
    }

    /* renamed from: b */
    public final synchronized List m50281b(Class cls) {
        List m50278b;
        m50278b = this.f42221b.m50278b(cls);
        if (m50278b == null) {
            m50278b = Collections.unmodifiableList(this.f42220a.m50273d(cls));
            this.f42221b.m50277c(cls, m50278b);
        }
        return m50278b;
    }

    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.f42220a.build(cls, cls2);
    }

    /* renamed from: c */
    public final void m50280c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ModelLoaderFactory) it.next()).teardown();
        }
    }

    @NonNull
    public synchronized List<Class<?>> getDataClasses(@NonNull Class<?> cls) {
        return this.f42220a.m50271f(cls);
    }

    @NonNull
    public <A> List<ModelLoader<A, ?>> getModelLoaders(@NonNull A a) {
        List m50281b = m50281b(m50282a(a));
        if (!m50281b.isEmpty()) {
            int size = m50281b.size();
            List<ModelLoader<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                ModelLoader<A, ?> modelLoader = (ModelLoader) m50281b.get(i);
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
            throw new Registry.NoModelLoaderAvailableException(a, m50281b);
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    public synchronized <Model, Data> void prepend(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f42220a.m50269h(cls, cls2, modelLoaderFactory);
        this.f42221b.m50279a();
    }

    public synchronized <Model, Data> void remove(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        m50280c(this.f42220a.m50268i(cls, cls2));
        this.f42221b.m50279a();
    }

    public synchronized <Model, Data> void replace(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        m50280c(this.f42220a.m50267j(cls, cls2, modelLoaderFactory));
        this.f42221b.m50279a();
    }

    public ModelLoaderRegistry(MultiModelLoaderFactory multiModelLoaderFactory) {
        this.f42221b = new C5848a();
        this.f42220a = multiModelLoaderFactory;
    }
}
