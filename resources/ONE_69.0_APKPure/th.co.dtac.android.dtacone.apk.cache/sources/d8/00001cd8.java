package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    public C2258c f10168a;

    /* renamed from: b */
    public C2258c f10169b;

    /* renamed from: c */
    public final WeakHashMap f10170c = new WeakHashMap();

    /* renamed from: d */
    public int f10171d = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public C2258c f10172a;

        /* renamed from: b */
        public boolean f10173b = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* renamed from: a */
        public void mo64030a(C2258c c2258c) {
            boolean z;
            C2258c c2258c2 = this.f10172a;
            if (c2258c == c2258c2) {
                C2258c c2258c3 = c2258c2.f10178d;
                this.f10172a = c2258c3;
                if (c2258c3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f10173b = z;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10173b) {
                if (SafeIterableMap.this.f10168a == null) {
                    return false;
                }
                return true;
            }
            C2258c c2258c = this.f10172a;
            if (c2258c == null || c2258c.f10177c == null) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f10173b) {
                this.f10173b = false;
                this.f10172a = SafeIterableMap.this.f10168a;
            } else {
                C2258c c2258c = this.f10172a;
                this.f10172a = c2258c != null ? c2258c.f10177c : null;
            }
            return this.f10172a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static abstract class SupportRemove<K, V> {
        /* renamed from: a */
        public abstract void mo64030a(C2258c c2258c);
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$a */
    /* loaded from: classes.dex */
    public static class C2256a extends AbstractC2259d {
        public C2256a(C2258c c2258c, C2258c c2258c2) {
            super(c2258c, c2258c2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2259d
        /* renamed from: b */
        public C2258c mo64029b(C2258c c2258c) {
            return c2258c.f10178d;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2259d
        /* renamed from: c */
        public C2258c mo64028c(C2258c c2258c) {
            return c2258c.f10177c;
        }
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$b */
    /* loaded from: classes.dex */
    public static class C2257b extends AbstractC2259d {
        public C2257b(C2258c c2258c, C2258c c2258c2) {
            super(c2258c, c2258c2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2259d
        /* renamed from: b */
        public C2258c mo64029b(C2258c c2258c) {
            return c2258c.f10177c;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2259d
        /* renamed from: c */
        public C2258c mo64028c(C2258c c2258c) {
            return c2258c.f10178d;
        }
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$c */
    /* loaded from: classes.dex */
    public static class C2258c implements Map.Entry {

        /* renamed from: a */
        public final Object f10175a;

        /* renamed from: b */
        public final Object f10176b;

        /* renamed from: c */
        public C2258c f10177c;

        /* renamed from: d */
        public C2258c f10178d;

        public C2258c(Object obj, Object obj2) {
            this.f10175a = obj;
            this.f10176b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2258c)) {
                return false;
            }
            C2258c c2258c = (C2258c) obj;
            if (this.f10175a.equals(c2258c.f10175a) && this.f10176b.equals(c2258c.f10176b)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f10175a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f10176b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10175a.hashCode() ^ this.f10176b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10175a + "=" + this.f10176b;
        }
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2259d extends SupportRemove implements Iterator {

        /* renamed from: a */
        public C2258c f10179a;

        /* renamed from: b */
        public C2258c f10180b;

        public AbstractC2259d(C2258c c2258c, C2258c c2258c2) {
            this.f10179a = c2258c2;
            this.f10180b = c2258c;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* renamed from: a */
        public void mo64030a(C2258c c2258c) {
            if (this.f10179a == c2258c && c2258c == this.f10180b) {
                this.f10180b = null;
                this.f10179a = null;
            }
            C2258c c2258c2 = this.f10179a;
            if (c2258c2 == c2258c) {
                this.f10179a = mo64029b(c2258c2);
            }
            if (this.f10180b == c2258c) {
                this.f10180b = m64027d();
            }
        }

        /* renamed from: b */
        public abstract C2258c mo64029b(C2258c c2258c);

        /* renamed from: c */
        public abstract C2258c mo64028c(C2258c c2258c);

        /* renamed from: d */
        public final C2258c m64027d() {
            C2258c c2258c = this.f10180b;
            C2258c c2258c2 = this.f10179a;
            if (c2258c != c2258c2 && c2258c2 != null) {
                return mo64028c(c2258c);
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10180b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Map.Entry next() {
            C2258c c2258c = this.f10180b;
            this.f10180b = m64027d();
            return c2258c;
        }
    }

    /* renamed from: a */
    public C2258c m64031a(Object obj, Object obj2) {
        C2258c c2258c = new C2258c(obj, obj2);
        this.f10171d++;
        C2258c c2258c2 = this.f10169b;
        if (c2258c2 == null) {
            this.f10168a = c2258c;
            this.f10169b = c2258c;
            return c2258c;
        }
        c2258c2.f10177c = c2258c;
        c2258c.f10178d = c2258c2;
        this.f10169b = c2258c;
        return c2258c;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C2257b c2257b = new C2257b(this.f10169b, this.f10168a);
        this.f10170c.put(c2257b, Boolean.FALSE);
        return c2257b;
    }

    @Nullable
    public Map.Entry<K, V> eldest() {
        return this.f10168a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    @Nullable
    public C2258c get(K k) {
        C2258c c2258c = this.f10168a;
        while (c2258c != null && !c2258c.f10175a.equals(k)) {
            c2258c = c2258c.f10177c;
        }
        return c2258c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        C2256a c2256a = new C2256a(this.f10168a, this.f10169b);
        this.f10170c.put(c2256a, Boolean.FALSE);
        return c2256a;
    }

    @NonNull
    public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
        SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.f10170c.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    @Nullable
    public Map.Entry<K, V> newest() {
        return this.f10169b;
    }

    public V putIfAbsent(@NonNull K k, @NonNull V v) {
        C2258c c2258c = get(k);
        if (c2258c != null) {
            return (V) c2258c.f10176b;
        }
        m64031a(k, v);
        return null;
    }

    public V remove(@NonNull K k) {
        C2258c c2258c = get(k);
        if (c2258c == null) {
            return null;
        }
        this.f10171d--;
        if (!this.f10170c.isEmpty()) {
            for (K k2 : this.f10170c.keySet()) {
                k2.mo64030a(c2258c);
            }
        }
        C2258c c2258c2 = c2258c.f10178d;
        if (c2258c2 != null) {
            c2258c2.f10177c = c2258c.f10177c;
        } else {
            this.f10168a = c2258c.f10177c;
        }
        C2258c c2258c3 = c2258c.f10177c;
        if (c2258c3 != null) {
            c2258c3.f10178d = c2258c2;
        } else {
            this.f10169b = c2258c2;
        }
        c2258c.f10177c = null;
        c2258c.f10178d = null;
        return (V) c2258c.f10176b;
    }

    public int size() {
        return this.f10171d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}