package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class LruArrayPool implements ArrayPool {

    /* renamed from: a */
    public final C20555j70 f41996a;

    /* renamed from: b */
    public final C5783b f41997b;

    /* renamed from: c */
    public final Map f41998c;

    /* renamed from: d */
    public final Map f41999d;

    /* renamed from: e */
    public final int f42000e;

    /* renamed from: f */
    public int f42001f;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$a */
    /* loaded from: classes3.dex */
    public static final class C5782a implements InterfaceC18293Pl1 {

        /* renamed from: a */
        public final C5783b f42002a;

        /* renamed from: b */
        public int f42003b;

        /* renamed from: c */
        public Class f42004c;

        public C5782a(C5783b c5783b) {
            this.f42002a = c5783b;
        }

        @Override // p000.InterfaceC18293Pl1
        /* renamed from: a */
        public void mo50390a() {
            this.f42002a.m67704c(this);
        }

        /* renamed from: b */
        public void m50411b(int i, Class cls) {
            this.f42003b = i;
            this.f42004c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5782a)) {
                return false;
            }
            C5782a c5782a = (C5782a) obj;
            if (this.f42003b != c5782a.f42003b || this.f42004c != c5782a.f42004c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f42003b * 31;
            Class cls = this.f42004c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f42003b + "array=" + this.f42004c + '}';
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$b */
    /* loaded from: classes3.dex */
    public static final class C5783b extends AbstractC0739Ka {
        @Override // p000.AbstractC0739Ka
        /* renamed from: d */
        public C5782a mo50388a() {
            return new C5782a(this);
        }

        /* renamed from: e */
        public C5782a m50409e(int i, Class cls) {
            C5782a c5782a = (C5782a) m67705b();
            c5782a.m50411b(i, cls);
            return c5782a;
        }
    }

    @VisibleForTesting
    public LruArrayPool() {
        this.f41996a = new C20555j70();
        this.f41997b = new C5783b();
        this.f41998c = new HashMap();
        this.f41999d = new HashMap();
        this.f42000e = 4194304;
    }

    /* renamed from: a */
    public final void m50422a(int i, Class cls) {
        NavigableMap m50415h = m50415h(cls);
        Integer num = (Integer) m50415h.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                m50415h.remove(Integer.valueOf(i));
                return;
            } else {
                m50415h.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: b */
    public final void m50421b() {
        m50420c(this.f42000e);
    }

    /* renamed from: c */
    public final void m50420c(int i) {
        while (this.f42001f > i) {
            Object m29615f = this.f41996a.m29615f();
            Preconditions.checkNotNull(m29615f);
            InterfaceC0910N6 m50419d = m50419d(m29615f);
            this.f42001f -= m50419d.getArrayLength(m29615f) * m50419d.getElementSizeInBytes();
            m50422a(m50419d.getArrayLength(m29615f), m29615f.getClass());
            if (Log.isLoggable(m50419d.getTag(), 2)) {
                m50419d.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(m50419d.getArrayLength(m29615f));
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void clearMemory() {
        m50420c(0);
    }

    /* renamed from: d */
    public final InterfaceC0910N6 m50419d(Object obj) {
        return m50418e(obj.getClass());
    }

    /* renamed from: e */
    public final InterfaceC0910N6 m50418e(Class cls) {
        InterfaceC0910N6 interfaceC0910N6 = (InterfaceC0910N6) this.f41999d.get(cls);
        if (interfaceC0910N6 == null) {
            if (cls.equals(int[].class)) {
                interfaceC0910N6 = new IntegerArrayAdapter();
            } else if (cls.equals(byte[].class)) {
                interfaceC0910N6 = new ByteArrayAdapter();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f41999d.put(cls, interfaceC0910N6);
        }
        return interfaceC0910N6;
    }

    /* renamed from: f */
    public final Object m50417f(C5782a c5782a) {
        return this.f41996a.m29620a(c5782a);
    }

    /* renamed from: g */
    public final Object m50416g(C5782a c5782a, Class cls) {
        InterfaceC0910N6 m50418e = m50418e(cls);
        Object m50417f = m50417f(c5782a);
        if (m50417f != null) {
            this.f42001f -= m50418e.getArrayLength(m50417f) * m50418e.getElementSizeInBytes();
            m50422a(m50418e.getArrayLength(m50417f), cls);
        }
        if (m50417f == null) {
            if (Log.isLoggable(m50418e.getTag(), 2)) {
                m50418e.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("Allocated ");
                sb.append(c5782a.f42003b);
                sb.append(" bytes");
            }
            return m50418e.newArray(c5782a.f42003b);
        }
        return m50417f;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T get(int i, Class<T> cls) {
        C5782a m50409e;
        try {
            Integer num = (Integer) m50415h(cls).ceilingKey(Integer.valueOf(i));
            if (m50412k(i, num)) {
                m50409e = this.f41997b.m50409e(num.intValue(), cls);
            } else {
                m50409e = this.f41997b.m50409e(i, cls);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) m50416g(m50409e, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T getExact(int i, Class<T> cls) {
        return (T) m50416g(this.f41997b.m50409e(i, cls), cls);
    }

    /* renamed from: h */
    public final NavigableMap m50415h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f41998c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f41998c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    /* renamed from: i */
    public final boolean m50414i() {
        int i = this.f42001f;
        if (i != 0 && this.f42000e / i < 2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m50413j(int i) {
        if (i <= this.f42000e / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m50412k(int i, Integer num) {
        if (num != null && (m50414i() || num.intValue() <= i * 8)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    @Deprecated
    public <T> void put(T t, Class<T> cls) {
        put(t);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void trimMemory(int i) {
        try {
            if (i >= 40) {
                clearMemory();
            } else if (i >= 20 || i == 15) {
                m50420c(this.f42000e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        InterfaceC0910N6 m50418e = m50418e(cls);
        int arrayLength = m50418e.getArrayLength(t);
        int elementSizeInBytes = m50418e.getElementSizeInBytes() * arrayLength;
        if (m50413j(elementSizeInBytes)) {
            C5782a m50409e = this.f41997b.m50409e(arrayLength, cls);
            this.f41996a.m29617d(m50409e, t);
            NavigableMap m50415h = m50415h(cls);
            Integer num = (Integer) m50415h.get(Integer.valueOf(m50409e.f42003b));
            Integer valueOf = Integer.valueOf(m50409e.f42003b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m50415h.put(valueOf, Integer.valueOf(i));
            this.f42001f += elementSizeInBytes;
            m50421b();
        }
    }

    public LruArrayPool(int i) {
        this.f41996a = new C20555j70();
        this.f41997b = new C5783b();
        this.f41998c = new HashMap();
        this.f41999d = new HashMap();
        this.f42000e = i;
    }
}