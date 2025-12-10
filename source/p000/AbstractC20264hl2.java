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

/* renamed from: hl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20264hl2 extends AbstractMap {

    /* renamed from: a */
    public final int f62585a;

    /* renamed from: b */
    public List f62586b;

    /* renamed from: c */
    public Map f62587c;

    /* renamed from: d */
    public boolean f62588d;

    /* renamed from: e */
    public volatile C19235bm2 f62589e;

    /* renamed from: f */
    public Map f62590f;

    /* renamed from: g */
    public volatile C22500ul2 f62591g;

    public AbstractC20264hl2(int i) {
        this.f62585a = i;
        this.f62586b = Collections.emptyList();
        this.f62587c = Collections.emptyMap();
        this.f62590f = Collections.emptyMap();
    }

    /* renamed from: g */
    public static AbstractC20264hl2 m30761g(int i) {
        return new C20952ll2(i);
    }

    /* renamed from: a */
    public final boolean m30766a() {
        return this.f62588d;
    }

    /* renamed from: b */
    public final int m30765b(Comparable comparable) {
        int i;
        int size = this.f62586b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((C18384Rl2) this.f62586b.get(i2)).getKey());
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
            int compareTo2 = comparable.compareTo((Comparable) ((C18384Rl2) this.f62586b.get(i4)).getKey());
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
        m30752p();
        int m30765b = m30765b(comparable);
        if (m30765b >= 0) {
            return ((C18384Rl2) this.f62586b.get(m30765b)).setValue(obj);
        }
        m30752p();
        if (this.f62586b.isEmpty() && !(this.f62586b instanceof ArrayList)) {
            this.f62586b = new ArrayList(this.f62585a);
        }
        int i = -(m30765b + 1);
        if (i >= this.f62585a) {
            return m30751q().put(comparable, obj);
        }
        int size = this.f62586b.size();
        int i2 = this.f62585a;
        if (size == i2) {
            C18384Rl2 c18384Rl2 = (C18384Rl2) this.f62586b.remove(i2 - 1);
            m30751q().put((Comparable) c18384Rl2.getKey(), c18384Rl2.getValue());
        }
        this.f62586b.add(i, new C18384Rl2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m30752p();
        if (!this.f62586b.isEmpty()) {
            this.f62586b.clear();
        }
        if (!this.f62587c.isEmpty()) {
            this.f62587c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m30765b(comparable) < 0 && !this.f62587c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f62589e == null) {
            this.f62589e = new C19235bm2(this, null);
        }
        return this.f62589e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC20264hl2)) {
            return super.equals(obj);
        }
        AbstractC20264hl2 abstractC20264hl2 = (AbstractC20264hl2) obj;
        int size = size();
        if (size != abstractC20264hl2.size()) {
            return false;
        }
        int m30755m = m30755m();
        if (m30755m != abstractC20264hl2.m30755m()) {
            return entrySet().equals(abstractC20264hl2.entrySet());
        }
        for (int i = 0; i < m30755m; i++) {
            if (!m30760h(i).equals(abstractC20264hl2.m30760h(i))) {
                return false;
            }
        }
        if (m30755m == size) {
            return true;
        }
        return this.f62587c.equals(abstractC20264hl2.f62587c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m30765b = m30765b(comparable);
        if (m30765b >= 0) {
            return ((C18384Rl2) this.f62586b.get(m30765b)).getValue();
        }
        return this.f62587c.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry m30760h(int i) {
        return (Map.Entry) this.f62586b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m30755m = m30755m();
        int i = 0;
        for (int i2 = 0; i2 < m30755m; i2++) {
            i += ((C18384Rl2) this.f62586b.get(i2)).hashCode();
        }
        if (this.f62587c.size() > 0) {
            return i + this.f62587c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final Object m30759i(int i) {
        m30752p();
        Object value = ((C18384Rl2) this.f62586b.remove(i)).getValue();
        if (!this.f62587c.isEmpty()) {
            Iterator it = m30751q().entrySet().iterator();
            this.f62586b.add(new C18384Rl2(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    public final int m30755m() {
        return this.f62586b.size();
    }

    /* renamed from: n */
    public final Iterable m30754n() {
        if (this.f62587c.isEmpty()) {
            return AbstractC23188yl2.m186a();
        }
        return this.f62587c.entrySet();
    }

    /* renamed from: o */
    public final Set m30753o() {
        if (this.f62591g == null) {
            this.f62591g = new C22500ul2(this, null);
        }
        return this.f62591g;
    }

    /* renamed from: p */
    public final void m30752p() {
        if (!this.f62588d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public final SortedMap m30751q() {
        m30752p();
        if (this.f62587c.isEmpty() && !(this.f62587c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f62587c = treeMap;
            this.f62590f = treeMap.descendingMap();
        }
        return (SortedMap) this.f62587c;
    }

    /* renamed from: r */
    public void mo26417r() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f62588d) {
            if (this.f62587c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f62587c);
            }
            this.f62587c = unmodifiableMap;
            if (this.f62590f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f62590f);
            }
            this.f62590f = unmodifiableMap2;
            this.f62588d = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m30752p();
        Comparable comparable = (Comparable) obj;
        int m30765b = m30765b(comparable);
        if (m30765b >= 0) {
            return m30759i(m30765b);
        }
        if (this.f62587c.isEmpty()) {
            return null;
        }
        return this.f62587c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f62586b.size() + this.f62587c.size();
    }

    public /* synthetic */ AbstractC20264hl2(int i, C20952ll2 c20952ll2) {
        this(i);
    }
}
