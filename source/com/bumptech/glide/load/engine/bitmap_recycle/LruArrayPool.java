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
    public final C19468d70 f41984a;

    /* renamed from: b */
    public final C5794b f41985b;

    /* renamed from: c */
    public final Map f41986c;

    /* renamed from: d */
    public final Map f41987d;

    /* renamed from: e */
    public final int f41988e;

    /* renamed from: f */
    public int f41989f;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$a */
    /* loaded from: classes3.dex */
    public static final class C5793a implements InterfaceC18444Sk1 {

        /* renamed from: a */
        public final C5794b f41990a;

        /* renamed from: b */
        public int f41991b;

        /* renamed from: c */
        public Class f41992c;

        public C5793a(C5794b c5794b) {
            this.f41990a = c5794b;
        }

        @Override // p000.InterfaceC18444Sk1
        /* renamed from: a */
        public void mo50393a() {
            this.f41990a.m67607c(this);
        }

        /* renamed from: b */
        public void m50414b(int i, Class cls) {
            this.f41991b = i;
            this.f41992c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5793a)) {
                return false;
            }
            C5793a c5793a = (C5793a) obj;
            if (this.f41991b != c5793a.f41991b || this.f41992c != c5793a.f41992c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = this.f41991b * 31;
            Class cls = this.f41992c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f41991b + "array=" + this.f41992c + '}';
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool$b */
    /* loaded from: classes3.dex */
    public static final class C5794b extends AbstractC0748Ka {
        @Override // p000.AbstractC0748Ka
        /* renamed from: d */
        public C5793a mo50391a() {
            return new C5793a(this);
        }

        /* renamed from: e */
        public C5793a m50412e(int i, Class cls) {
            C5793a c5793a = (C5793a) m67608b();
            c5793a.m50414b(i, cls);
            return c5793a;
        }
    }

    @VisibleForTesting
    public LruArrayPool() {
        this.f41984a = new C19468d70();
        this.f41985b = new C5794b();
        this.f41986c = new HashMap();
        this.f41987d = new HashMap();
        this.f41988e = 4194304;
    }

    /* renamed from: a */
    public final void m50425a(int i, Class cls) {
        NavigableMap m50418h = m50418h(cls);
        Integer num = (Integer) m50418h.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                m50418h.remove(Integer.valueOf(i));
                return;
            } else {
                m50418h.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    /* renamed from: b */
    public final void m50424b() {
        m50423c(this.f41988e);
    }

    /* renamed from: c */
    public final void m50423c(int i) {
        while (this.f41989f > i) {
            Object m31925f = this.f41984a.m31925f();
            Preconditions.checkNotNull(m31925f);
            InterfaceC0920N6 m50422d = m50422d(m31925f);
            this.f41989f -= m50422d.getArrayLength(m31925f) * m50422d.getElementSizeInBytes();
            m50425a(m50422d.getArrayLength(m31925f), m31925f.getClass());
            if (Log.isLoggable(m50422d.getTag(), 2)) {
                m50422d.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(m50422d.getArrayLength(m31925f));
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void clearMemory() {
        m50423c(0);
    }

    /* renamed from: d */
    public final InterfaceC0920N6 m50422d(Object obj) {
        return m50421e(obj.getClass());
    }

    /* renamed from: e */
    public final InterfaceC0920N6 m50421e(Class cls) {
        InterfaceC0920N6 interfaceC0920N6 = (InterfaceC0920N6) this.f41987d.get(cls);
        if (interfaceC0920N6 == null) {
            if (cls.equals(int[].class)) {
                interfaceC0920N6 = new IntegerArrayAdapter();
            } else if (cls.equals(byte[].class)) {
                interfaceC0920N6 = new ByteArrayAdapter();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f41987d.put(cls, interfaceC0920N6);
        }
        return interfaceC0920N6;
    }

    /* renamed from: f */
    public final Object m50420f(C5793a c5793a) {
        return this.f41984a.m31930a(c5793a);
    }

    /* renamed from: g */
    public final Object m50419g(C5793a c5793a, Class cls) {
        InterfaceC0920N6 m50421e = m50421e(cls);
        Object m50420f = m50420f(c5793a);
        if (m50420f != null) {
            this.f41989f -= m50421e.getArrayLength(m50420f) * m50421e.getElementSizeInBytes();
            m50425a(m50421e.getArrayLength(m50420f), cls);
        }
        if (m50420f == null) {
            if (Log.isLoggable(m50421e.getTag(), 2)) {
                m50421e.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("Allocated ");
                sb.append(c5793a.f41991b);
                sb.append(" bytes");
            }
            return m50421e.newArray(c5793a.f41991b);
        }
        return m50420f;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T get(int i, Class<T> cls) {
        C5793a m50412e;
        try {
            Integer num = (Integer) m50418h(cls).ceilingKey(Integer.valueOf(i));
            if (m50415k(i, num)) {
                m50412e = this.f41985b.m50412e(num.intValue(), cls);
            } else {
                m50412e = this.f41985b.m50412e(i, cls);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) m50419g(m50412e, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T getExact(int i, Class<T> cls) {
        return (T) m50419g(this.f41985b.m50412e(i, cls), cls);
    }

    /* renamed from: h */
    public final NavigableMap m50418h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f41986c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f41986c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    /* renamed from: i */
    public final boolean m50417i() {
        int i = this.f41989f;
        if (i != 0 && this.f41988e / i < 2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m50416j(int i) {
        if (i <= this.f41988e / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m50415k(int i, Integer num) {
        if (num != null && (m50417i() || num.intValue() <= i * 8)) {
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
                m50423c(this.f41988e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        InterfaceC0920N6 m50421e = m50421e(cls);
        int arrayLength = m50421e.getArrayLength(t);
        int elementSizeInBytes = m50421e.getElementSizeInBytes() * arrayLength;
        if (m50416j(elementSizeInBytes)) {
            C5793a m50412e = this.f41985b.m50412e(arrayLength, cls);
            this.f41984a.m31927d(m50412e, t);
            NavigableMap m50418h = m50418h(cls);
            Integer num = (Integer) m50418h.get(Integer.valueOf(m50412e.f41991b));
            Integer valueOf = Integer.valueOf(m50412e.f41991b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m50418h.put(valueOf, Integer.valueOf(i));
            this.f41989f += elementSizeInBytes;
            m50424b();
        }
    }

    public LruArrayPool(int i) {
        this.f41984a = new C19468d70();
        this.f41985b = new C5794b();
        this.f41986c = new HashMap();
        this.f41987d = new HashMap();
        this.f41988e = i;
    }
}
