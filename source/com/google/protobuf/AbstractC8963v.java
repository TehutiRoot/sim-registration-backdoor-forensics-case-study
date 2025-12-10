package com.google.protobuf;

import com.google.protobuf.FieldSet;
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

/* renamed from: com.google.protobuf.v */
/* loaded from: classes4.dex */
public abstract class AbstractC8963v extends AbstractMap {

    /* renamed from: a */
    public final int f57514a;

    /* renamed from: b */
    public List f57515b;

    /* renamed from: c */
    public Map f57516c;

    /* renamed from: d */
    public boolean f57517d;

    /* renamed from: e */
    public volatile C8972g f57518e;

    /* renamed from: f */
    public Map f57519f;

    /* renamed from: g */
    public volatile C8966c f57520g;

    /* renamed from: com.google.protobuf.v$a */
    /* loaded from: classes4.dex */
    public class C8964a extends AbstractC8963v {
        public C8964a(int i) {
            super(i, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m35039s((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.AbstractC8963v
        /* renamed from: q */
        public void mo35037q() {
            if (!m35041p()) {
                for (int i = 0; i < m35045l(); i++) {
                    Map.Entry m35046k = m35046k(i);
                    if (((FieldSet.FieldDescriptorLite) m35046k.getKey()).isRepeated()) {
                        m35046k.setValue(Collections.unmodifiableList((List) m35046k.getValue()));
                    }
                }
                for (Map.Entry entry : m35043n()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo35037q();
        }
    }

    /* renamed from: com.google.protobuf.v$c */
    /* loaded from: classes4.dex */
    public class C8966c extends C8972g {
        public C8966c() {
            super(AbstractC8963v.this, null);
        }

        @Override // com.google.protobuf.AbstractC8963v.C8972g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C8965b(AbstractC8963v.this, null);
        }

        public /* synthetic */ C8966c(AbstractC8963v abstractC8963v, C8964a c8964a) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.v$d */
    /* loaded from: classes4.dex */
    public static class C8967d {

        /* renamed from: a */
        public static final Iterator f57525a = new C8968a();

        /* renamed from: b */
        public static final Iterable f57526b = new C8969b();

        /* renamed from: com.google.protobuf.v$d$a */
        /* loaded from: classes4.dex */
        public class C8968a implements Iterator {
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

        /* renamed from: com.google.protobuf.v$d$b */
        /* loaded from: classes4.dex */
        public class C8969b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return C8967d.f57525a;
            }
        }

        /* renamed from: b */
        public static Iterable m35033b() {
            return f57526b;
        }
    }

    /* renamed from: com.google.protobuf.v$e */
    /* loaded from: classes4.dex */
    public class C8970e implements Map.Entry, Comparable {

        /* renamed from: a */
        public final Comparable f57527a;

        /* renamed from: b */
        public Object f57528b;

        public C8970e(AbstractC8963v abstractC8963v, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C8970e c8970e) {
            return getKey().compareTo(c8970e.getKey());
        }

        /* renamed from: b */
        public final boolean m35031b(Object obj, Object obj2) {
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
            return this.f57527a;
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
            if (m35031b(this.f57527a, entry.getKey()) && m35031b(this.f57528b, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f57528b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Comparable comparable = this.f57527a;
            int i = 0;
            if (comparable == null) {
                hashCode = 0;
            } else {
                hashCode = comparable.hashCode();
            }
            Object obj = this.f57528b;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC8963v.this.m35049h();
            Object obj2 = this.f57528b;
            this.f57528b = obj;
            return obj2;
        }

        public String toString() {
            return this.f57527a + "=" + this.f57528b;
        }

        public C8970e(Comparable comparable, Object obj) {
            this.f57527a = comparable;
            this.f57528b = obj;
        }
    }

    /* renamed from: com.google.protobuf.v$g */
    /* loaded from: classes4.dex */
    public class C8972g extends AbstractSet {
        public C8972g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            if (!contains(entry)) {
                AbstractC8963v.this.m35039s((Comparable) entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC8963v.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC8963v.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C8971f(AbstractC8963v.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                AbstractC8963v.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC8963v.this.size();
        }

        public /* synthetic */ C8972g(AbstractC8963v abstractC8963v, C8964a c8964a) {
            this();
        }
    }

    public /* synthetic */ AbstractC8963v(int i, C8964a c8964a) {
        this(i);
    }

    /* renamed from: r */
    public static AbstractC8963v m35040r(int i) {
        return new C8964a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m35049h();
        if (!this.f57515b.isEmpty()) {
            this.f57515b.clear();
        }
        if (!this.f57516c.isEmpty()) {
            this.f57516c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m35050g(comparable) < 0 && !this.f57516c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f57518e == null) {
            this.f57518e = new C8972g(this, null);
        }
        return this.f57518e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC8963v)) {
            return super.equals(obj);
        }
        AbstractC8963v abstractC8963v = (AbstractC8963v) obj;
        int size = size();
        if (size != abstractC8963v.size()) {
            return false;
        }
        int m35045l = m35045l();
        if (m35045l != abstractC8963v.m35045l()) {
            return entrySet().equals(abstractC8963v.entrySet());
        }
        for (int i = 0; i < m35045l; i++) {
            if (!m35046k(i).equals(abstractC8963v.m35046k(i))) {
                return false;
            }
        }
        if (m35045l == size) {
            return true;
        }
        return this.f57516c.equals(abstractC8963v.f57516c);
    }

    /* renamed from: g */
    public final int m35050g(Comparable comparable) {
        int i;
        int size = this.f57515b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C8970e) this.f57515b.get(i2)).getKey());
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
            int compareTo2 = comparable.compareTo(((C8970e) this.f57515b.get(i4)).getKey());
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
        int m35050g = m35050g(comparable);
        if (m35050g >= 0) {
            return ((C8970e) this.f57515b.get(m35050g)).getValue();
        }
        return this.f57516c.get(comparable);
    }

    /* renamed from: h */
    public final void m35049h() {
        if (!this.f57517d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m35045l = m35045l();
        int i = 0;
        for (int i2 = 0; i2 < m35045l; i2++) {
            i += ((C8970e) this.f57515b.get(i2)).hashCode();
        }
        if (m35044m() > 0) {
            return i + this.f57516c.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Set m35048i() {
        if (this.f57520g == null) {
            this.f57520g = new C8966c(this, null);
        }
        return this.f57520g;
    }

    /* renamed from: j */
    public final void m35047j() {
        m35049h();
        if (this.f57515b.isEmpty() && !(this.f57515b instanceof ArrayList)) {
            this.f57515b = new ArrayList(this.f57514a);
        }
    }

    /* renamed from: k */
    public Map.Entry m35046k(int i) {
        return (Map.Entry) this.f57515b.get(i);
    }

    /* renamed from: l */
    public int m35045l() {
        return this.f57515b.size();
    }

    /* renamed from: m */
    public int m35044m() {
        return this.f57516c.size();
    }

    /* renamed from: n */
    public Iterable m35043n() {
        if (this.f57516c.isEmpty()) {
            return C8967d.m35033b();
        }
        return this.f57516c.entrySet();
    }

    /* renamed from: o */
    public final SortedMap m35042o() {
        m35049h();
        if (this.f57516c.isEmpty() && !(this.f57516c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f57516c = treeMap;
            this.f57519f = treeMap.descendingMap();
        }
        return (SortedMap) this.f57516c;
    }

    /* renamed from: p */
    public boolean m35041p() {
        return this.f57517d;
    }

    /* renamed from: q */
    public void mo35037q() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f57517d) {
            if (this.f57516c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f57516c);
            }
            this.f57516c = unmodifiableMap;
            if (this.f57519f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f57519f);
            }
            this.f57519f = unmodifiableMap2;
            this.f57517d = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m35049h();
        Comparable comparable = (Comparable) obj;
        int m35050g = m35050g(comparable);
        if (m35050g >= 0) {
            return m35038t(m35050g);
        }
        if (this.f57516c.isEmpty()) {
            return null;
        }
        return this.f57516c.remove(comparable);
    }

    /* renamed from: s */
    public Object m35039s(Comparable comparable, Object obj) {
        m35049h();
        int m35050g = m35050g(comparable);
        if (m35050g >= 0) {
            return ((C8970e) this.f57515b.get(m35050g)).setValue(obj);
        }
        m35047j();
        int i = -(m35050g + 1);
        if (i >= this.f57514a) {
            return m35042o().put(comparable, obj);
        }
        int size = this.f57515b.size();
        int i2 = this.f57514a;
        if (size == i2) {
            C8970e c8970e = (C8970e) this.f57515b.remove(i2 - 1);
            m35042o().put(c8970e.getKey(), c8970e.getValue());
        }
        this.f57515b.add(i, new C8970e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f57515b.size() + this.f57516c.size();
    }

    /* renamed from: t */
    public final Object m35038t(int i) {
        m35049h();
        Object value = ((C8970e) this.f57515b.remove(i)).getValue();
        if (!this.f57516c.isEmpty()) {
            Iterator it = m35042o().entrySet().iterator();
            this.f57515b.add(new C8970e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: com.google.protobuf.v$b */
    /* loaded from: classes4.dex */
    public class C8965b implements Iterator {

        /* renamed from: a */
        public int f57521a;

        /* renamed from: b */
        public Iterator f57522b;

        public C8965b() {
            this.f57521a = AbstractC8963v.this.f57515b.size();
        }

        /* renamed from: a */
        public final Iterator m35036a() {
            if (this.f57522b == null) {
                this.f57522b = AbstractC8963v.this.f57519f.entrySet().iterator();
            }
            return this.f57522b;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            if (!m35036a().hasNext()) {
                List list = AbstractC8963v.this.f57515b;
                int i = this.f57521a - 1;
                this.f57521a = i;
                return (Map.Entry) list.get(i);
            }
            return (Map.Entry) m35036a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f57521a;
            if ((i > 0 && i <= AbstractC8963v.this.f57515b.size()) || m35036a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ C8965b(AbstractC8963v abstractC8963v, C8964a c8964a) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.v$f */
    /* loaded from: classes4.dex */
    public class C8971f implements Iterator {

        /* renamed from: a */
        public int f57530a;

        /* renamed from: b */
        public boolean f57531b;

        /* renamed from: c */
        public Iterator f57532c;

        public C8971f() {
            this.f57530a = -1;
        }

        /* renamed from: a */
        public final Iterator m35029a() {
            if (this.f57532c == null) {
                this.f57532c = AbstractC8963v.this.f57516c.entrySet().iterator();
            }
            return this.f57532c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            this.f57531b = true;
            int i = this.f57530a + 1;
            this.f57530a = i;
            if (i < AbstractC8963v.this.f57515b.size()) {
                return (Map.Entry) AbstractC8963v.this.f57515b.get(this.f57530a);
            }
            return (Map.Entry) m35029a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f57530a + 1 < AbstractC8963v.this.f57515b.size()) {
                return true;
            }
            if (!AbstractC8963v.this.f57516c.isEmpty() && m35029a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f57531b) {
                this.f57531b = false;
                AbstractC8963v.this.m35049h();
                if (this.f57530a < AbstractC8963v.this.f57515b.size()) {
                    AbstractC8963v abstractC8963v = AbstractC8963v.this;
                    int i = this.f57530a;
                    this.f57530a = i - 1;
                    abstractC8963v.m35038t(i);
                    return;
                }
                m35029a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C8971f(AbstractC8963v abstractC8963v, C8964a c8964a) {
            this();
        }
    }

    public AbstractC8963v(int i) {
        this.f57514a = i;
        this.f57515b = Collections.emptyList();
        this.f57516c = Collections.emptyMap();
        this.f57519f = Collections.emptyMap();
    }
}
