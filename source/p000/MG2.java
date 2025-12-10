package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: MG2 */
/* loaded from: classes3.dex */
public abstract class MG2 extends AbstractMap {

    /* renamed from: a */
    public final int f3727a;

    /* renamed from: d */
    public boolean f3730d;

    /* renamed from: e */
    public volatile FG2 f3731e;

    /* renamed from: b */
    public List f3728b = Collections.emptyList();

    /* renamed from: c */
    public Map f3729c = Collections.emptyMap();

    /* renamed from: f */
    public Map f3732f = Collections.emptyMap();

    /* renamed from: a */
    public void mo67105a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f3730d) {
            if (this.f3729c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f3729c);
            }
            this.f3729c = unmodifiableMap;
            if (this.f3732f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f3732f);
            }
            this.f3732f = unmodifiableMap2;
            this.f3730d = true;
        }
    }

    /* renamed from: b */
    public final int m67418b() {
        return this.f3728b.size();
    }

    /* renamed from: c */
    public final Iterable m67417c() {
        if (this.f3729c.isEmpty()) {
            return AbstractC21733qG2.m23520a();
        }
        return this.f3729c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m67406o();
        if (!this.f3728b.isEmpty()) {
            this.f3728b.clear();
        }
        if (!this.f3729c.isEmpty()) {
            this.f3729c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m67409l(comparable) < 0 && !this.f3729c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f3731e == null) {
            this.f3731e = new FG2(this, null);
        }
        return this.f3731e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MG2)) {
            return super.equals(obj);
        }
        MG2 mg2 = (MG2) obj;
        int size = size();
        if (size != mg2.size()) {
            return false;
        }
        int m67418b = m67418b();
        if (m67418b == mg2.m67418b()) {
            for (int i = 0; i < m67418b; i++) {
                if (!m67413h(i).equals(mg2.m67413h(i))) {
                    return false;
                }
            }
            if (m67418b == size) {
                return true;
            }
            return this.f3729c.equals(mg2.f3729c);
        }
        return entrySet().equals(mg2.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m67406o();
        int m67409l = m67409l(comparable);
        if (m67409l >= 0) {
            return ((C21905rG2) this.f3728b.get(m67409l)).setValue(obj);
        }
        m67406o();
        if (this.f3728b.isEmpty() && !(this.f3728b instanceof ArrayList)) {
            this.f3728b = new ArrayList(this.f3727a);
        }
        int i = -(m67409l + 1);
        if (i >= this.f3727a) {
            return m67407n().put(comparable, obj);
        }
        int size = this.f3728b.size();
        int i2 = this.f3727a;
        if (size == i2) {
            C21905rG2 c21905rG2 = (C21905rG2) this.f3728b.remove(i2 - 1);
            m67407n().put(c21905rG2.m23350a(), c21905rG2.getValue());
        }
        this.f3728b.add(i, new C21905rG2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m67409l = m67409l(comparable);
        if (m67409l >= 0) {
            return ((C21905rG2) this.f3728b.get(m67409l)).getValue();
        }
        return this.f3729c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry m67413h(int i) {
        return (Map.Entry) this.f3728b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m67418b = m67418b();
        int i = 0;
        for (int i2 = 0; i2 < m67418b; i2++) {
            i += ((C21905rG2) this.f3728b.get(i2)).hashCode();
        }
        if (this.f3729c.size() > 0) {
            return i + this.f3729c.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final boolean m67410k() {
        return this.f3730d;
    }

    /* renamed from: l */
    public final int m67409l(Comparable comparable) {
        int size = this.f3728b.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((C21905rG2) this.f3728b.get(i)).m23350a());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int compareTo2 = comparable.compareTo(((C21905rG2) this.f3728b.get(i3)).m23350a());
            if (compareTo2 < 0) {
                i = i3 - 1;
            } else if (compareTo2 > 0) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: m */
    public final Object m67408m(int i) {
        m67406o();
        Object value = ((C21905rG2) this.f3728b.remove(i)).getValue();
        if (!this.f3729c.isEmpty()) {
            Iterator it = m67407n().entrySet().iterator();
            List list = this.f3728b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C21905rG2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    public final SortedMap m67407n() {
        m67406o();
        if (this.f3729c.isEmpty() && !(this.f3729c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3729c = treeMap;
            this.f3732f = treeMap.descendingMap();
        }
        return (SortedMap) this.f3729c;
    }

    /* renamed from: o */
    public final void m67406o() {
        if (!this.f3730d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m67406o();
        Comparable comparable = (Comparable) obj;
        int m67409l = m67409l(comparable);
        if (m67409l >= 0) {
            return m67408m(m67409l);
        }
        if (this.f3729c.isEmpty()) {
            return null;
        }
        return this.f3729c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3728b.size() + this.f3729c.size();
    }
}
