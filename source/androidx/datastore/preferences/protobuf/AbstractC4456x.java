package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: androidx.datastore.preferences.protobuf.x */
/* loaded from: classes2.dex */
public abstract class AbstractC4456x extends AbstractMap {

    /* renamed from: a */
    public final int f34980a;

    /* renamed from: b */
    public List f34981b;

    /* renamed from: c */
    public Map f34982c;

    /* renamed from: d */
    public boolean f34983d;

    /* renamed from: e */
    public volatile C4465g f34984e;

    /* renamed from: f */
    public Map f34985f;

    /* renamed from: g */
    public volatile C4459c f34986g;

    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    /* loaded from: classes2.dex */
    public static class C4457a extends AbstractC4456x {
        public C4457a(int i) {
            super(i, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m54940s((FieldSet.FieldDescriptorLite) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4456x
        /* renamed from: q */
        public void mo54938q() {
            if (!m54942p()) {
                for (int i = 0; i < m54946l(); i++) {
                    Map.Entry m54947k = m54947k(i);
                    if (((FieldSet.FieldDescriptorLite) m54947k.getKey()).isRepeated()) {
                        m54947k.setValue(Collections.unmodifiableList((List) m54947k.getValue()));
                    }
                }
                for (Map.Entry entry : m54944n()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo54938q();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$c */
    /* loaded from: classes2.dex */
    public class C4459c extends C4465g {
        public C4459c() {
            super(AbstractC4456x.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4456x.C4465g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C4458b(AbstractC4456x.this, null);
        }

        public /* synthetic */ C4459c(AbstractC4456x abstractC4456x, C4457a c4457a) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$d */
    /* loaded from: classes2.dex */
    public static class C4460d {

        /* renamed from: a */
        public static final Iterator f34991a = new C4461a();

        /* renamed from: b */
        public static final Iterable f34992b = new C4462b();

        /* renamed from: androidx.datastore.preferences.protobuf.x$d$a */
        /* loaded from: classes2.dex */
        public static class C4461a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.x$d$b */
        /* loaded from: classes2.dex */
        public static class C4462b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return C4460d.f34991a;
            }
        }

        /* renamed from: b */
        public static Iterable m54934b() {
            return f34992b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$e */
    /* loaded from: classes2.dex */
    public class C4463e implements Map.Entry, Comparable {

        /* renamed from: a */
        public final Comparable f34993a;

        /* renamed from: b */
        public Object f34994b;

        public C4463e(AbstractC4456x abstractC4456x, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C4463e c4463e) {
            return getKey().compareTo(c4463e.getKey());
        }

        /* renamed from: b */
        public final boolean m54932b(Object obj, Object obj2) {
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
                return false;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: c */
        public Comparable getKey() {
            return this.f34993a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (m54932b(this.f34993a, entry.getKey()) && m54932b(this.f34994b, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f34994b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Comparable comparable = this.f34993a;
            int i = 0;
            if (comparable == null) {
                hashCode = 0;
            } else {
                hashCode = comparable.hashCode();
            }
            Object obj = this.f34994b;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC4456x.this.m54950h();
            Object obj2 = this.f34994b;
            this.f34994b = obj;
            return obj2;
        }

        public String toString() {
            return this.f34993a + "=" + this.f34994b;
        }

        public C4463e(Comparable comparable, Object obj) {
            this.f34993a = comparable;
            this.f34994b = obj;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$g */
    /* loaded from: classes2.dex */
    public class C4465g extends AbstractSet {
        public C4465g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            if (!contains(entry)) {
                AbstractC4456x.this.m54940s((Comparable) entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC4456x.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC4456x.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C4464f(AbstractC4456x.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                AbstractC4456x.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC4456x.this.size();
        }

        public /* synthetic */ C4465g(AbstractC4456x abstractC4456x, C4457a c4457a) {
            this();
        }
    }

    public /* synthetic */ AbstractC4456x(int i, C4457a c4457a) {
        this(i);
    }

    /* renamed from: r */
    public static AbstractC4456x m54941r(int i) {
        return new C4457a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m54950h();
        if (!this.f34981b.isEmpty()) {
            this.f34981b.clear();
        }
        if (!this.f34982c.isEmpty()) {
            this.f34982c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m54951g(comparable) < 0 && !this.f34982c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f34984e == null) {
            this.f34984e = new C4465g(this, null);
        }
        return this.f34984e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4456x)) {
            return super.equals(obj);
        }
        AbstractC4456x abstractC4456x = (AbstractC4456x) obj;
        int size = size();
        if (size != abstractC4456x.size()) {
            return false;
        }
        int m54946l = m54946l();
        if (m54946l != abstractC4456x.m54946l()) {
            return entrySet().equals(abstractC4456x.entrySet());
        }
        for (int i = 0; i < m54946l; i++) {
            if (!m54947k(i).equals(abstractC4456x.m54947k(i))) {
                return false;
            }
        }
        if (m54946l == size) {
            return true;
        }
        return this.f34982c.equals(abstractC4456x.f34982c);
    }

    /* renamed from: g */
    public final int m54951g(Comparable comparable) {
        int i;
        int size = this.f34981b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C4463e) this.f34981b.get(i2)).getKey());
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
            int compareTo2 = comparable.compareTo(((C4463e) this.f34981b.get(i4)).getKey());
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
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m54951g = m54951g(comparable);
        if (m54951g >= 0) {
            return ((C4463e) this.f34981b.get(m54951g)).getValue();
        }
        return this.f34982c.get(comparable);
    }

    /* renamed from: h */
    public final void m54950h() {
        if (!this.f34983d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m54946l = m54946l();
        int i = 0;
        for (int i2 = 0; i2 < m54946l; i2++) {
            i += ((C4463e) this.f34981b.get(i2)).hashCode();
        }
        if (m54945m() > 0) {
            return i + this.f34982c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Set m54949i() {
        if (this.f34986g == null) {
            this.f34986g = new C4459c(this, null);
        }
        return this.f34986g;
    }

    /* renamed from: j */
    public final void m54948j() {
        m54950h();
        if (this.f34981b.isEmpty() && !(this.f34981b instanceof ArrayList)) {
            this.f34981b = new ArrayList(this.f34980a);
        }
    }

    /* renamed from: k */
    public Map.Entry m54947k(int i) {
        return (Map.Entry) this.f34981b.get(i);
    }

    /* renamed from: l */
    public int m54946l() {
        return this.f34981b.size();
    }

    /* renamed from: m */
    public int m54945m() {
        return this.f34982c.size();
    }

    /* renamed from: n */
    public Iterable m54944n() {
        if (this.f34982c.isEmpty()) {
            return C4460d.m54934b();
        }
        return this.f34982c.entrySet();
    }

    /* renamed from: o */
    public final SortedMap m54943o() {
        m54950h();
        if (this.f34982c.isEmpty() && !(this.f34982c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f34982c = treeMap;
            this.f34985f = treeMap.descendingMap();
        }
        return (SortedMap) this.f34982c;
    }

    /* renamed from: p */
    public boolean m54942p() {
        return this.f34983d;
    }

    /* renamed from: q */
    public void mo54938q() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f34983d) {
            if (this.f34982c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f34982c);
            }
            this.f34982c = unmodifiableMap;
            if (this.f34985f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f34985f);
            }
            this.f34985f = unmodifiableMap2;
            this.f34983d = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m54950h();
        Comparable comparable = (Comparable) obj;
        int m54951g = m54951g(comparable);
        if (m54951g >= 0) {
            return m54939t(m54951g);
        }
        if (this.f34982c.isEmpty()) {
            return null;
        }
        return this.f34982c.remove(comparable);
    }

    /* renamed from: s */
    public Object m54940s(Comparable comparable, Object obj) {
        m54950h();
        int m54951g = m54951g(comparable);
        if (m54951g >= 0) {
            return ((C4463e) this.f34981b.get(m54951g)).setValue(obj);
        }
        m54948j();
        int i = -(m54951g + 1);
        if (i >= this.f34980a) {
            return m54943o().put(comparable, obj);
        }
        int size = this.f34981b.size();
        int i2 = this.f34980a;
        if (size == i2) {
            C4463e c4463e = (C4463e) this.f34981b.remove(i2 - 1);
            m54943o().put(c4463e.getKey(), c4463e.getValue());
        }
        this.f34981b.add(i, new C4463e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f34981b.size() + this.f34982c.size();
    }

    /* renamed from: t */
    public final Object m54939t(int i) {
        m54950h();
        Object value = ((C4463e) this.f34981b.remove(i)).getValue();
        if (!this.f34982c.isEmpty()) {
            Iterator it = m54943o().entrySet().iterator();
            this.f34981b.add(new C4463e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$b */
    /* loaded from: classes2.dex */
    public class C4458b implements Iterator {

        /* renamed from: a */
        public int f34987a;

        /* renamed from: b */
        public Iterator f34988b;

        public C4458b() {
            this.f34987a = AbstractC4456x.this.f34981b.size();
        }

        /* renamed from: a */
        public final Iterator m54937a() {
            if (this.f34988b == null) {
                this.f34988b = AbstractC4456x.this.f34985f.entrySet().iterator();
            }
            return this.f34988b;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            if (!m54937a().hasNext()) {
                List list = AbstractC4456x.this.f34981b;
                int i = this.f34987a - 1;
                this.f34987a = i;
                return (Map.Entry) list.get(i);
            }
            return (Map.Entry) m54937a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f34987a;
            if ((i > 0 && i <= AbstractC4456x.this.f34981b.size()) || m54937a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C4458b(AbstractC4456x abstractC4456x, C4457a c4457a) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$f */
    /* loaded from: classes2.dex */
    public class C4464f implements Iterator {

        /* renamed from: a */
        public int f34996a;

        /* renamed from: b */
        public boolean f34997b;

        /* renamed from: c */
        public Iterator f34998c;

        public C4464f() {
            this.f34996a = -1;
        }

        /* renamed from: a */
        public final Iterator m54930a() {
            if (this.f34998c == null) {
                this.f34998c = AbstractC4456x.this.f34982c.entrySet().iterator();
            }
            return this.f34998c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            this.f34997b = true;
            int i = this.f34996a + 1;
            this.f34996a = i;
            if (i < AbstractC4456x.this.f34981b.size()) {
                return (Map.Entry) AbstractC4456x.this.f34981b.get(this.f34996a);
            }
            return (Map.Entry) m54930a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34996a + 1 < AbstractC4456x.this.f34981b.size()) {
                return true;
            }
            if (!AbstractC4456x.this.f34982c.isEmpty() && m54930a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f34997b) {
                this.f34997b = false;
                AbstractC4456x.this.m54950h();
                if (this.f34996a < AbstractC4456x.this.f34981b.size()) {
                    AbstractC4456x abstractC4456x = AbstractC4456x.this;
                    int i = this.f34996a;
                    this.f34996a = i - 1;
                    abstractC4456x.m54939t(i);
                    return;
                }
                m54930a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C4464f(AbstractC4456x abstractC4456x, C4457a c4457a) {
            this();
        }
    }

    public AbstractC4456x(int i) {
        this.f34980a = i;
        this.f34981b = Collections.emptyList();
        this.f34982c = Collections.emptyMap();
        this.f34985f = Collections.emptyMap();
    }
}
