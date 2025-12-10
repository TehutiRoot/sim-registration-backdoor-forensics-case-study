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

/* renamed from: JH2 */
/* loaded from: classes3.dex */
public abstract class JH2 extends AbstractMap {

    /* renamed from: a */
    public final int f2966a;

    /* renamed from: d */
    public boolean f2969d;

    /* renamed from: e */
    public volatile CH2 f2970e;

    /* renamed from: b */
    public List f2967b = Collections.emptyList();

    /* renamed from: c */
    public Map f2968c = Collections.emptyMap();

    /* renamed from: f */
    public Map f2971f = Collections.emptyMap();

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Object m67910e(JH2 jh2, int i) {
        return jh2.m67902m(i);
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ List m67908g(JH2 jh2) {
        return jh2.f2967b;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ Map m67906i(JH2 jh2) {
        return jh2.f2968c;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ void m67905j(JH2 jh2) {
        jh2.m67900o();
    }

    /* renamed from: a */
    public void mo67610a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f2969d) {
            if (this.f2968c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f2968c);
            }
            this.f2968c = unmodifiableMap;
            if (this.f2971f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f2971f);
            }
            this.f2971f = unmodifiableMap2;
            this.f2969d = true;
        }
    }

    /* renamed from: b */
    public final int m67912b() {
        return this.f2967b.size();
    }

    /* renamed from: c */
    public final Iterable m67911c() {
        if (this.f2968c.isEmpty()) {
            return AbstractC21279nH2.m26437a();
        }
        return this.f2968c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m67900o();
        if (!this.f2967b.isEmpty()) {
            this.f2967b.clear();
        }
        if (!this.f2968c.isEmpty()) {
            this.f2968c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m67903l(comparable) < 0 && !this.f2968c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2970e == null) {
            this.f2970e = new CH2(this, null);
        }
        return this.f2970e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JH2)) {
            return super.equals(obj);
        }
        JH2 jh2 = (JH2) obj;
        int size = size();
        if (size != jh2.size()) {
            return false;
        }
        int m67912b = m67912b();
        if (m67912b == jh2.m67912b()) {
            for (int i = 0; i < m67912b; i++) {
                if (!m67907h(i).equals(jh2.m67907h(i))) {
                    return false;
                }
            }
            if (m67912b == size) {
                return true;
            }
            return this.f2968c.equals(jh2.f2968c);
        }
        return entrySet().equals(jh2.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m67900o();
        int m67903l = m67903l(comparable);
        if (m67903l >= 0) {
            return ((C21452oH2) this.f2967b.get(m67903l)).setValue(obj);
        }
        m67900o();
        if (this.f2967b.isEmpty() && !(this.f2967b instanceof ArrayList)) {
            this.f2967b = new ArrayList(this.f2966a);
        }
        int i = -(m67903l + 1);
        if (i >= this.f2966a) {
            return m67901n().put(comparable, obj);
        }
        int size = this.f2967b.size();
        int i2 = this.f2966a;
        if (size == i2) {
            C21452oH2 c21452oH2 = (C21452oH2) this.f2967b.remove(i2 - 1);
            m67901n().put(c21452oH2.m26138a(), c21452oH2.getValue());
        }
        this.f2967b.add(i, new C21452oH2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m67903l = m67903l(comparable);
        if (m67903l >= 0) {
            return ((C21452oH2) this.f2967b.get(m67903l)).getValue();
        }
        return this.f2968c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry m67907h(int i) {
        return (Map.Entry) this.f2967b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m67912b = m67912b();
        int i = 0;
        for (int i2 = 0; i2 < m67912b; i2++) {
            i += ((C21452oH2) this.f2967b.get(i2)).hashCode();
        }
        if (this.f2968c.size() > 0) {
            return i + this.f2968c.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final boolean m67904k() {
        return this.f2969d;
    }

    /* renamed from: l */
    public final int m67903l(Comparable comparable) {
        int size = this.f2967b.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((C21452oH2) this.f2967b.get(i)).m26138a());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int compareTo2 = comparable.compareTo(((C21452oH2) this.f2967b.get(i3)).m26138a());
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
    public final Object m67902m(int i) {
        m67900o();
        Object value = ((C21452oH2) this.f2967b.remove(i)).getValue();
        if (!this.f2968c.isEmpty()) {
            Iterator it = m67901n().entrySet().iterator();
            List list = this.f2967b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C21452oH2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    public final SortedMap m67901n() {
        m67900o();
        if (this.f2968c.isEmpty() && !(this.f2968c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2968c = treeMap;
            this.f2971f = treeMap.descendingMap();
        }
        return (SortedMap) this.f2968c;
    }

    /* renamed from: o */
    public final void m67900o() {
        if (!this.f2969d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m67900o();
        Comparable comparable = (Comparable) obj;
        int m67903l = m67903l(comparable);
        if (m67903l >= 0) {
            return m67902m(m67903l);
        }
        if (this.f2968c.isEmpty()) {
            return null;
        }
        return this.f2968c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2967b.size() + this.f2968c.size();
    }
}