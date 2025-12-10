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

/* renamed from: zE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23275zE2 extends AbstractMap {

    /* renamed from: a */
    public final int f109008a;

    /* renamed from: b */
    public List f109009b;

    /* renamed from: c */
    public Map f109010c;

    /* renamed from: d */
    public boolean f109011d;

    /* renamed from: e */
    public volatile WE2 f109012e;

    /* renamed from: f */
    public Map f109013f;

    /* renamed from: g */
    public volatile DE2 f109014g;

    public AbstractC23275zE2(int i) {
        this.f109008a = i;
        this.f109009b = Collections.emptyList();
        this.f109010c = Collections.emptyMap();
        this.f109013f = Collections.emptyMap();
    }

    /* renamed from: e */
    public static AbstractC23275zE2 m114e(int i) {
        return new C22415uE2(i);
    }

    /* renamed from: a */
    public final int m117a(Comparable comparable) {
        int i;
        int size = this.f109009b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((QE2) this.f109009b.get(i2)).getKey());
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
            int compareTo2 = comparable.compareTo((Comparable) ((QE2) this.f109009b.get(i4)).getKey());
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
    /* renamed from: b */
    public final Object put(Comparable comparable, Object obj) {
        m102q();
        int m117a = m117a(comparable);
        if (m117a >= 0) {
            return ((QE2) this.f109009b.get(m117a)).setValue(obj);
        }
        m102q();
        if (this.f109009b.isEmpty() && !(this.f109009b instanceof ArrayList)) {
            this.f109009b = new ArrayList(this.f109008a);
        }
        int i = -(m117a + 1);
        if (i >= this.f109008a) {
            return m101r().put(comparable, obj);
        }
        int size = this.f109009b.size();
        int i2 = this.f109008a;
        if (size == i2) {
            QE2 qe2 = (QE2) this.f109009b.remove(i2 - 1);
            m101r().put((Comparable) qe2.getKey(), qe2.getValue());
        }
        this.f109009b.add(i, new QE2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m102q();
        if (!this.f109009b.isEmpty()) {
            this.f109009b.clear();
        }
        if (!this.f109010c.isEmpty()) {
            this.f109010c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m117a(comparable) < 0 && !this.f109010c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f109012e == null) {
            this.f109012e = new WE2(this, null);
        }
        return this.f109012e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC23275zE2)) {
            return super.equals(obj);
        }
        AbstractC23275zE2 abstractC23275zE2 = (AbstractC23275zE2) obj;
        int size = size();
        if (size != abstractC23275zE2.size()) {
            return false;
        }
        int m108k = m108k();
        if (m108k != abstractC23275zE2.m108k()) {
            return entrySet().equals(abstractC23275zE2.entrySet());
        }
        for (int i = 0; i < m108k; i++) {
            if (!m110i(i).equals(abstractC23275zE2.m110i(i))) {
                return false;
            }
        }
        if (m108k == size) {
            return true;
        }
        return this.f109010c.equals(abstractC23275zE2.f109010c);
    }

    /* renamed from: f */
    public void mo113f() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f109011d) {
            if (this.f109010c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f109010c);
            }
            this.f109010c = unmodifiableMap;
            if (this.f109013f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f109013f);
            }
            this.f109013f = unmodifiableMap2;
            this.f109011d = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m117a = m117a(comparable);
        if (m117a >= 0) {
            return ((QE2) this.f109009b.get(m117a)).getValue();
        }
        return this.f109010c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m108k = m108k();
        int i = 0;
        for (int i2 = 0; i2 < m108k; i2++) {
            i += ((QE2) this.f109009b.get(i2)).hashCode();
        }
        if (this.f109010c.size() > 0) {
            return i + this.f109010c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final Map.Entry m110i(int i) {
        return (Map.Entry) this.f109009b.get(i);
    }

    /* renamed from: j */
    public final boolean m109j() {
        return this.f109011d;
    }

    /* renamed from: k */
    public final int m108k() {
        return this.f109009b.size();
    }

    /* renamed from: l */
    public final Object m107l(int i) {
        m102q();
        Object value = ((QE2) this.f109009b.remove(i)).getValue();
        if (!this.f109010c.isEmpty()) {
            Iterator it = m101r().entrySet().iterator();
            this.f109009b.add(new QE2(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    public final Iterable m105n() {
        if (this.f109010c.isEmpty()) {
            return NE2.m67237a();
        }
        return this.f109010c.entrySet();
    }

    /* renamed from: p */
    public final Set m103p() {
        if (this.f109014g == null) {
            this.f109014g = new DE2(this, null);
        }
        return this.f109014g;
    }

    /* renamed from: q */
    public final void m102q() {
        if (!this.f109011d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public final SortedMap m101r() {
        m102q();
        if (this.f109010c.isEmpty() && !(this.f109010c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f109010c = treeMap;
            this.f109013f = treeMap.descendingMap();
        }
        return (SortedMap) this.f109010c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m102q();
        Comparable comparable = (Comparable) obj;
        int m117a = m117a(comparable);
        if (m117a >= 0) {
            return m107l(m117a);
        }
        if (this.f109010c.isEmpty()) {
            return null;
        }
        return this.f109010c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f109009b.size() + this.f109010c.size();
    }

    public /* synthetic */ AbstractC23275zE2(int i, C22415uE2 c22415uE2) {
        this(i);
    }
}
