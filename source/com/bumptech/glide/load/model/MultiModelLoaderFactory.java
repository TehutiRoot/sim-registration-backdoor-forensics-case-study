package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class MultiModelLoaderFactory {

    /* renamed from: e */
    public static final C5852c f42224e = new C5852c();

    /* renamed from: f */
    public static final ModelLoader f42225f = new C5850a();

    /* renamed from: a */
    public final List f42226a;

    /* renamed from: b */
    public final C5852c f42227b;

    /* renamed from: c */
    public final Set f42228c;

    /* renamed from: d */
    public final Pools.Pool f42229d;

    /* renamed from: com.bumptech.glide.load.model.MultiModelLoaderFactory$a */
    /* loaded from: classes3.dex */
    public static class C5850a implements ModelLoader {
        @Override // com.bumptech.glide.load.model.ModelLoader
        public ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
            return null;
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        public boolean handles(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.model.MultiModelLoaderFactory$b */
    /* loaded from: classes3.dex */
    public static class C5851b {

        /* renamed from: a */
        public final Class f42230a;

        /* renamed from: b */
        public final Class f42231b;

        /* renamed from: c */
        public final ModelLoaderFactory f42232c;

        public C5851b(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
            this.f42230a = cls;
            this.f42231b = cls2;
            this.f42232c = modelLoaderFactory;
        }

        /* renamed from: a */
        public boolean m50266a(Class cls) {
            return this.f42230a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean m50265b(Class cls, Class cls2) {
            if (m50266a(cls) && this.f42231b.isAssignableFrom(cls2)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.model.MultiModelLoaderFactory$c */
    /* loaded from: classes3.dex */
    public static class C5852c {
        /* renamed from: a */
        public C5856a m50264a(List list, Pools.Pool pool) {
            return new C5856a(list, pool);
        }
    }

    public MultiModelLoaderFactory(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, f42224e);
    }

    /* renamed from: e */
    public static ModelLoader m50272e() {
        return f42225f;
    }

    /* renamed from: a */
    public final void m50276a(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory, boolean z) {
        int i;
        C5851b c5851b = new C5851b(cls, cls2, modelLoaderFactory);
        List list = this.f42226a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, c5851b);
    }

    /* renamed from: b */
    public synchronized void m50275b(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        m50276a(cls, cls2, modelLoaderFactory, true);
    }

    @NonNull
    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C5851b c5851b : this.f42226a) {
                if (this.f42228c.contains(c5851b)) {
                    z = true;
                } else if (c5851b.m50265b(cls, cls2)) {
                    this.f42228c.add(c5851b);
                    arrayList.add(m50274c(c5851b));
                    this.f42228c.remove(c5851b);
                }
            }
            if (arrayList.size() > 1) {
                return this.f42227b.m50264a(arrayList, this.f42229d);
            } else if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            } else if (z) {
                return m50272e();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f42228c.clear();
            throw th2;
        }
    }

    /* renamed from: c */
    public final ModelLoader m50274c(C5851b c5851b) {
        return (ModelLoader) Preconditions.checkNotNull(c5851b.f42232c.build(this));
    }

    /* renamed from: d */
    public synchronized List m50273d(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C5851b c5851b : this.f42226a) {
                if (!this.f42228c.contains(c5851b) && c5851b.m50266a(cls)) {
                    this.f42228c.add(c5851b);
                    arrayList.add(m50274c(c5851b));
                    this.f42228c.remove(c5851b);
                }
            }
        } catch (Throwable th2) {
            this.f42228c.clear();
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: f */
    public synchronized List m50271f(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C5851b c5851b : this.f42226a) {
            if (!arrayList.contains(c5851b.f42231b) && c5851b.m50266a(cls)) {
                arrayList.add(c5851b.f42231b);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ModelLoaderFactory m50270g(C5851b c5851b) {
        return c5851b.f42232c;
    }

    /* renamed from: h */
    public synchronized void m50269h(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        m50276a(cls, cls2, modelLoaderFactory, false);
    }

    /* renamed from: i */
    public synchronized List m50268i(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f42226a.iterator();
        while (it.hasNext()) {
            C5851b c5851b = (C5851b) it.next();
            if (c5851b.m50265b(cls, cls2)) {
                it.remove();
                arrayList.add(m50270g(c5851b));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public synchronized List m50267j(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        List m50268i;
        m50268i = m50268i(cls, cls2);
        m50275b(cls, cls2, modelLoaderFactory);
        return m50268i;
    }

    public MultiModelLoaderFactory(Pools.Pool pool, C5852c c5852c) {
        this.f42226a = new ArrayList();
        this.f42228c = new HashSet();
        this.f42229d = pool;
        this.f42227b = c5852c;
    }
}
