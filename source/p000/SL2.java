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

/* renamed from: SL2 */
/* loaded from: classes3.dex */
public abstract class SL2 extends AbstractMap {

    /* renamed from: a */
    public final int f5596a;

    /* renamed from: b */
    public List f5597b;

    /* renamed from: c */
    public Map f5598c;

    /* renamed from: d */
    public boolean f5599d;

    /* renamed from: e */
    public volatile ZL2 f5600e;

    /* renamed from: f */
    public Map f5601f;

    /* renamed from: g */
    public volatile TL2 f5602g;

    public SL2(int i) {
        this.f5596a = i;
        this.f5597b = Collections.emptyList();
        this.f5598c = Collections.emptyMap();
        this.f5601f = Collections.emptyMap();
    }

    /* renamed from: j */
    public static SL2 m66343j(int i) {
        return new RL2(i);
    }

    /* renamed from: a */
    public final boolean m66351a() {
        return this.f5599d;
    }

    /* renamed from: b */
    public final int m66350b(Comparable comparable) {
        int i;
        int size = this.f5597b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((XL2) this.f5597b.get(i2)).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((XL2) this.f5597b.get(i4)).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        m66336q();
        int m66350b = m66350b(comparable);
        if (m66350b >= 0) {
            return ((XL2) this.f5597b.get(m66350b)).setValue(obj);
        }
        m66336q();
        if (this.f5597b.isEmpty() && !(this.f5597b instanceof ArrayList)) {
            this.f5597b = new ArrayList(this.f5596a);
        }
        int i = -(m66350b + 1);
        if (i >= this.f5596a) {
            return m66335r().put(comparable, obj);
        }
        int size = this.f5597b.size();
        int i2 = this.f5596a;
        if (size == i2) {
            XL2 xl2 = (XL2) this.f5597b.remove(i2 - 1);
            m66335r().put((Comparable) xl2.getKey(), xl2.getValue());
        }
        this.f5597b.add(i, new XL2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m66336q();
        if (!this.f5597b.isEmpty()) {
            this.f5597b.clear();
        }
        if (!this.f5598c.isEmpty()) {
            this.f5598c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m66350b(comparable) < 0 && !this.f5598c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f5600e == null) {
            this.f5600e = new ZL2(this, null);
        }
        return this.f5600e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SL2)) {
            return super.equals(obj);
        }
        SL2 sl2 = (SL2) obj;
        int size = size();
        if (size != sl2.size()) {
            return false;
        }
        int m66339n = m66339n();
        if (m66339n != sl2.m66339n()) {
            return entrySet().equals(sl2.entrySet());
        }
        for (int i = 0; i < m66339n; i++) {
            if (!m66342k(i).equals(sl2.m66342k(i))) {
                return false;
            }
        }
        if (m66339n == size) {
            return true;
        }
        return this.f5598c.equals(sl2.f5598c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m66350b = m66350b(comparable);
        if (m66350b >= 0) {
            return ((XL2) this.f5597b.get(m66350b)).getValue();
        }
        return this.f5598c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m66339n = m66339n();
        int i = 0;
        for (int i2 = 0; i2 < m66339n; i2++) {
            i += ((XL2) this.f5597b.get(i2)).hashCode();
        }
        if (this.f5598c.size() > 0) {
            return i + this.f5598c.hashCode();
        }
        return i;
    }

    /* renamed from: k */
    public final Map.Entry m66342k(int i) {
        return (Map.Entry) this.f5597b.get(i);
    }

    /* renamed from: l */
    public final Object m66341l(int i) {
        m66336q();
        Object value = ((XL2) this.f5597b.remove(i)).getValue();
        if (!this.f5598c.isEmpty()) {
            Iterator it = m66335r().entrySet().iterator();
            this.f5597b.add(new XL2(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public void mo66340m() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f5599d) {
            if (this.f5598c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f5598c);
            }
            this.f5598c = unmodifiableMap;
            if (this.f5601f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f5601f);
            }
            this.f5601f = unmodifiableMap2;
            this.f5599d = true;
        }
    }

    /* renamed from: n */
    public final int m66339n() {
        return this.f5597b.size();
    }

    /* renamed from: o */
    public final Iterable m66338o() {
        if (this.f5598c.isEmpty()) {
            return WL2.m65635a();
        }
        return this.f5598c.entrySet();
    }

    /* renamed from: p */
    public final Set m66337p() {
        if (this.f5602g == null) {
            this.f5602g = new TL2(this, null);
        }
        return this.f5602g;
    }

    /* renamed from: q */
    public final void m66336q() {
        if (!this.f5599d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public final SortedMap m66335r() {
        m66336q();
        if (this.f5598c.isEmpty() && !(this.f5598c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5598c = treeMap;
            this.f5601f = treeMap.descendingMap();
        }
        return (SortedMap) this.f5598c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m66336q();
        Comparable comparable = (Comparable) obj;
        int m66350b = m66350b(comparable);
        if (m66350b >= 0) {
            return m66341l(m66350b);
        }
        if (this.f5598c.isEmpty()) {
            return null;
        }
        return this.f5598c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f5597b.size() + this.f5598c.size();
    }

    public /* synthetic */ SL2(int i, RL2 rl2) {
        this(i);
    }
}
