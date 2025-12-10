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

/* renamed from: ps2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21661ps2 extends AbstractMap {

    /* renamed from: a */
    public final int f76788a;

    /* renamed from: d */
    public boolean f76791d;

    /* renamed from: e */
    public volatile C19597ds2 f76792e;

    /* renamed from: b */
    public List f76789b = Collections.emptyList();

    /* renamed from: c */
    public Map f76790c = Collections.emptyMap();

    /* renamed from: f */
    public Map f76793f = Collections.emptyMap();

    /* renamed from: a */
    public void mo23582a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f76791d) {
            if (this.f76790c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f76790c);
            }
            this.f76790c = unmodifiableMap;
            if (this.f76793f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f76793f);
            }
            this.f76793f = unmodifiableMap2;
            this.f76791d = true;
        }
    }

    /* renamed from: b */
    public final int m23581b() {
        return this.f76789b.size();
    }

    /* renamed from: c */
    public final Iterable m23580c() {
        if (this.f76790c.isEmpty()) {
            return Cr2.m68733a();
        }
        return this.f76790c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m23569o();
        if (!this.f76789b.isEmpty()) {
            this.f76789b.clear();
        }
        if (!this.f76790c.isEmpty()) {
            this.f76790c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m23572l(comparable) < 0 && !this.f76790c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f76792e == null) {
            this.f76792e = new C19597ds2(this, null);
        }
        return this.f76792e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC21661ps2)) {
            return super.equals(obj);
        }
        AbstractC21661ps2 abstractC21661ps2 = (AbstractC21661ps2) obj;
        int size = size();
        if (size != abstractC21661ps2.size()) {
            return false;
        }
        int m23581b = m23581b();
        if (m23581b == abstractC21661ps2.m23581b()) {
            for (int i = 0; i < m23581b; i++) {
                if (!m23576h(i).equals(abstractC21661ps2.m23576h(i))) {
                    return false;
                }
            }
            if (m23581b == size) {
                return true;
            }
            return this.f76790c.equals(abstractC21661ps2.f76790c);
        }
        return entrySet().equals(abstractC21661ps2.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m23569o();
        int m23572l = m23572l(comparable);
        if (m23572l >= 0) {
            return ((Ir2) this.f76789b.get(m23572l)).setValue(obj);
        }
        m23569o();
        if (this.f76789b.isEmpty() && !(this.f76789b instanceof ArrayList)) {
            this.f76789b = new ArrayList(this.f76788a);
        }
        int i = -(m23572l + 1);
        if (i >= this.f76788a) {
            return m23570n().put(comparable, obj);
        }
        int size = this.f76789b.size();
        int i2 = this.f76788a;
        if (size == i2) {
            Ir2 ir2 = (Ir2) this.f76789b.remove(i2 - 1);
            m23570n().put(ir2.m67864a(), ir2.getValue());
        }
        this.f76789b.add(i, new Ir2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m23572l = m23572l(comparable);
        if (m23572l >= 0) {
            return ((Ir2) this.f76789b.get(m23572l)).getValue();
        }
        return this.f76790c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry m23576h(int i) {
        return (Map.Entry) this.f76789b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m23581b = m23581b();
        int i = 0;
        for (int i2 = 0; i2 < m23581b; i2++) {
            i += ((Ir2) this.f76789b.get(i2)).hashCode();
        }
        if (this.f76790c.size() > 0) {
            return i + this.f76790c.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final boolean m23573k() {
        return this.f76791d;
    }

    /* renamed from: l */
    public final int m23572l(Comparable comparable) {
        int size = this.f76789b.size();
        int i = size - 1;
        int i2 = 0;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((Ir2) this.f76789b.get(i)).m67864a());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i;
            }
        }
        while (i2 <= i) {
            int i3 = (i2 + i) / 2;
            int compareTo2 = comparable.compareTo(((Ir2) this.f76789b.get(i3)).m67864a());
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
    public final Object m23571m(int i) {
        m23569o();
        Object value = ((Ir2) this.f76789b.remove(i)).getValue();
        if (!this.f76790c.isEmpty()) {
            Iterator it = m23570n().entrySet().iterator();
            List list = this.f76789b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Ir2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    public final SortedMap m23570n() {
        m23569o();
        if (this.f76790c.isEmpty() && !(this.f76790c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f76790c = treeMap;
            this.f76793f = treeMap.descendingMap();
        }
        return (SortedMap) this.f76790c;
    }

    /* renamed from: o */
    public final void m23569o() {
        if (!this.f76791d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m23569o();
        Comparable comparable = (Comparable) obj;
        int m23572l = m23572l(comparable);
        if (m23572l >= 0) {
            return m23571m(m23572l);
        }
        if (this.f76790c.isEmpty()) {
            return null;
        }
        return this.f76790c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f76789b.size() + this.f76790c.size();
    }
}
