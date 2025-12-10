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
    public C2276c f10080a;

    /* renamed from: b */
    public C2276c f10081b;

    /* renamed from: c */
    public final WeakHashMap f10082c = new WeakHashMap();

    /* renamed from: d */
    public int f10083d = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public C2276c f10084a;

        /* renamed from: b */
        public boolean f10085b = true;

        public IteratorWithAdditions() {
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* renamed from: a */
        public void mo64079a(C2276c c2276c) {
            boolean z;
            C2276c c2276c2 = this.f10084a;
            if (c2276c == c2276c2) {
                C2276c c2276c3 = c2276c2.f10090d;
                this.f10084a = c2276c3;
                if (c2276c3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f10085b = z;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10085b) {
                if (SafeIterableMap.this.f10080a == null) {
                    return false;
                }
                return true;
            }
            C2276c c2276c = this.f10084a;
            if (c2276c == null || c2276c.f10089c == null) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f10085b) {
                this.f10085b = false;
                this.f10084a = SafeIterableMap.this.f10080a;
            } else {
                C2276c c2276c = this.f10084a;
                this.f10084a = c2276c != null ? c2276c.f10089c : null;
            }
            return this.f10084a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static abstract class SupportRemove<K, V> {
        /* renamed from: a */
        public abstract void mo64079a(C2276c c2276c);
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$a */
    /* loaded from: classes.dex */
    public static class C2274a extends AbstractC2277d {
        public C2274a(C2276c c2276c, C2276c c2276c2) {
            super(c2276c, c2276c2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2277d
        /* renamed from: b */
        public C2276c mo64078b(C2276c c2276c) {
            return c2276c.f10090d;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2277d
        /* renamed from: c */
        public C2276c mo64077c(C2276c c2276c) {
            return c2276c.f10089c;
        }
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$b */
    /* loaded from: classes.dex */
    public static class C2275b extends AbstractC2277d {
        public C2275b(C2276c c2276c, C2276c c2276c2) {
            super(c2276c, c2276c2);
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2277d
        /* renamed from: b */
        public C2276c mo64078b(C2276c c2276c) {
            return c2276c.f10089c;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.AbstractC2277d
        /* renamed from: c */
        public C2276c mo64077c(C2276c c2276c) {
            return c2276c.f10090d;
        }
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$c */
    /* loaded from: classes.dex */
    public static class C2276c implements Map.Entry {

        /* renamed from: a */
        public final Object f10087a;

        /* renamed from: b */
        public final Object f10088b;

        /* renamed from: c */
        public C2276c f10089c;

        /* renamed from: d */
        public C2276c f10090d;

        public C2276c(Object obj, Object obj2) {
            this.f10087a = obj;
            this.f10088b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2276c)) {
                return false;
            }
            C2276c c2276c = (C2276c) obj;
            if (this.f10087a.equals(c2276c.f10087a) && this.f10088b.equals(c2276c.f10088b)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f10087a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f10088b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10087a.hashCode() ^ this.f10088b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10087a + "=" + this.f10088b;
        }
    }

    /* renamed from: androidx.arch.core.internal.SafeIterableMap$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2277d extends SupportRemove implements Iterator {

        /* renamed from: a */
        public C2276c f10091a;

        /* renamed from: b */
        public C2276c f10092b;

        public AbstractC2277d(C2276c c2276c, C2276c c2276c2) {
            this.f10091a = c2276c2;
            this.f10092b = c2276c;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        /* renamed from: a */
        public void mo64079a(C2276c c2276c) {
            if (this.f10091a == c2276c && c2276c == this.f10092b) {
                this.f10092b = null;
                this.f10091a = null;
            }
            C2276c c2276c2 = this.f10091a;
            if (c2276c2 == c2276c) {
                this.f10091a = mo64078b(c2276c2);
            }
            if (this.f10092b == c2276c) {
                this.f10092b = m64076d();
            }
        }

        /* renamed from: b */
        public abstract C2276c mo64078b(C2276c c2276c);

        /* renamed from: c */
        public abstract C2276c mo64077c(C2276c c2276c);

        /* renamed from: d */
        public final C2276c m64076d() {
            C2276c c2276c = this.f10092b;
            C2276c c2276c2 = this.f10091a;
            if (c2276c != c2276c2 && c2276c2 != null) {
                return mo64077c(c2276c);
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10092b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Map.Entry next() {
            C2276c c2276c = this.f10092b;
            this.f10092b = m64076d();
            return c2276c;
        }
    }

    /* renamed from: a */
    public C2276c m64080a(Object obj, Object obj2) {
        C2276c c2276c = new C2276c(obj, obj2);
        this.f10083d++;
        C2276c c2276c2 = this.f10081b;
        if (c2276c2 == null) {
            this.f10080a = c2276c;
            this.f10081b = c2276c;
            return c2276c;
        }
        c2276c2.f10089c = c2276c;
        c2276c.f10090d = c2276c2;
        this.f10081b = c2276c;
        return c2276c;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C2275b c2275b = new C2275b(this.f10081b, this.f10080a);
        this.f10082c.put(c2275b, Boolean.FALSE);
        return c2275b;
    }

    @Nullable
    public Map.Entry<K, V> eldest() {
        return this.f10080a;
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
    public C2276c get(K k) {
        C2276c c2276c = this.f10080a;
        while (c2276c != null && !c2276c.f10087a.equals(k)) {
            c2276c = c2276c.f10089c;
        }
        return c2276c;
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
        C2274a c2274a = new C2274a(this.f10080a, this.f10081b);
        this.f10082c.put(c2274a, Boolean.FALSE);
        return c2274a;
    }

    @NonNull
    public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
        SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.f10082c.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    @Nullable
    public Map.Entry<K, V> newest() {
        return this.f10081b;
    }

    public V putIfAbsent(@NonNull K k, @NonNull V v) {
        C2276c c2276c = get(k);
        if (c2276c != null) {
            return (V) c2276c.f10088b;
        }
        m64080a(k, v);
        return null;
    }

    public V remove(@NonNull K k) {
        C2276c c2276c = get(k);
        if (c2276c == null) {
            return null;
        }
        this.f10083d--;
        if (!this.f10082c.isEmpty()) {
            for (K k2 : this.f10082c.keySet()) {
                k2.mo64079a(c2276c);
            }
        }
        C2276c c2276c2 = c2276c.f10090d;
        if (c2276c2 != null) {
            c2276c2.f10089c = c2276c.f10089c;
        } else {
            this.f10080a = c2276c.f10089c;
        }
        C2276c c2276c3 = c2276c.f10089c;
        if (c2276c3 != null) {
            c2276c3.f10090d = c2276c2;
        } else {
            this.f10081b = c2276c2;
        }
        c2276c.f10089c = null;
        c2276c.f10090d = null;
        return (V) c2276c.f10088b;
    }

    public int size() {
        return this.f10083d;
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
