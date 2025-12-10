package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* loaded from: classes6.dex */
public abstract class AbstractC11928d extends AbstractMap {

    /* renamed from: a */
    public final int f69795a;

    /* renamed from: b */
    public List f69796b;

    /* renamed from: c */
    public Map f69797c;

    /* renamed from: d */
    public boolean f69798d;

    /* renamed from: e */
    public volatile C11935e f69799e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    /* loaded from: classes6.dex */
    public static class C11929a extends AbstractC11928d {
        public C11929a(int i) {
            super(i, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC11928d
        /* renamed from: n */
        public void mo27902n() {
            if (!m27906m()) {
                for (int i = 0; i < m27909j(); i++) {
                    Map.Entry m27910i = m27910i(i);
                    if (((FieldSet.FieldDescriptorLite) m27910i.getKey()).isRepeated()) {
                        m27910i.setValue(Collections.unmodifiableList((List) m27910i.getValue()));
                    }
                }
                for (Map.Entry entry : m27908k()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo27902n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m27904p((FieldSet.FieldDescriptorLite) obj, obj2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b */
    /* loaded from: classes6.dex */
    public static class C11930b {

        /* renamed from: a */
        public static final Iterator f69800a = new C11931a();

        /* renamed from: b */
        public static final Iterable f69801b = new C11932b();

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b$a */
        /* loaded from: classes6.dex */
        public static class C11931a implements Iterator {
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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b$b */
        /* loaded from: classes6.dex */
        public static class C11932b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return C11930b.f69800a;
            }
        }

        /* renamed from: b */
        public static Iterable m27900b() {
            return f69801b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$c */
    /* loaded from: classes6.dex */
    public class C11933c implements Comparable, Map.Entry {

        /* renamed from: a */
        public final Comparable f69802a;

        /* renamed from: b */
        public Object f69803b;

        public C11933c(AbstractC11928d abstractC11928d, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C11933c c11933c) {
            return getKey().compareTo(c11933c.getKey());
        }

        /* renamed from: b */
        public final boolean m27898b(Object obj, Object obj2) {
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
            return this.f69802a;
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
            if (m27898b(this.f69802a, entry.getKey()) && m27898b(this.f69803b, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f69803b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Comparable comparable = this.f69802a;
            int i = 0;
            if (comparable == null) {
                hashCode = 0;
            } else {
                hashCode = comparable.hashCode();
            }
            Object obj = this.f69803b;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC11928d.this.m27912g();
            Object obj2 = this.f69803b;
            this.f69803b = obj;
            return obj2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f69802a);
            String valueOf2 = String.valueOf(this.f69803b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        public C11933c(Comparable comparable, Object obj) {
            this.f69802a = comparable;
            this.f69803b = obj;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$e */
    /* loaded from: classes6.dex */
    public class C11935e extends AbstractSet {
        public C11935e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            if (!contains(entry)) {
                AbstractC11928d.this.m27904p((Comparable) entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC11928d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC11928d.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new C11934d(AbstractC11928d.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                AbstractC11928d.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC11928d.this.size();
        }

        public /* synthetic */ C11935e(AbstractC11928d abstractC11928d, C11929a c11929a) {
            this();
        }
    }

    public /* synthetic */ AbstractC11928d(int i, C11929a c11929a) {
        this(i);
    }

    /* renamed from: o */
    public static AbstractC11928d m27905o(int i) {
        return new C11929a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m27912g();
        if (!this.f69796b.isEmpty()) {
            this.f69796b.clear();
        }
        if (!this.f69797c.isEmpty()) {
            this.f69797c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m27913f(comparable) < 0 && !this.f69797c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f69799e == null) {
            this.f69799e = new C11935e(this, null);
        }
        return this.f69799e;
    }

    /* renamed from: f */
    public final int m27913f(Comparable comparable) {
        int i;
        int size = this.f69796b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((C11933c) this.f69796b.get(i2)).getKey());
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
            int compareTo2 = comparable.compareTo(((C11933c) this.f69796b.get(i4)).getKey());
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

    /* renamed from: g */
    public final void m27912g() {
        if (!this.f69798d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m27913f = m27913f(comparable);
        if (m27913f >= 0) {
            return ((C11933c) this.f69796b.get(m27913f)).getValue();
        }
        return this.f69797c.get(comparable);
    }

    /* renamed from: h */
    public final void m27911h() {
        m27912g();
        if (this.f69796b.isEmpty() && !(this.f69796b instanceof ArrayList)) {
            this.f69796b = new ArrayList(this.f69795a);
        }
    }

    /* renamed from: i */
    public Map.Entry m27910i(int i) {
        return (Map.Entry) this.f69796b.get(i);
    }

    /* renamed from: j */
    public int m27909j() {
        return this.f69796b.size();
    }

    /* renamed from: k */
    public Iterable m27908k() {
        if (this.f69797c.isEmpty()) {
            return C11930b.m27900b();
        }
        return this.f69797c.entrySet();
    }

    /* renamed from: l */
    public final SortedMap m27907l() {
        m27912g();
        if (this.f69797c.isEmpty() && !(this.f69797c instanceof TreeMap)) {
            this.f69797c = new TreeMap();
        }
        return (SortedMap) this.f69797c;
    }

    /* renamed from: m */
    public boolean m27906m() {
        return this.f69798d;
    }

    /* renamed from: n */
    public void mo27902n() {
        Map unmodifiableMap;
        if (!this.f69798d) {
            if (this.f69797c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f69797c);
            }
            this.f69797c = unmodifiableMap;
            this.f69798d = true;
        }
    }

    /* renamed from: p */
    public Object m27904p(Comparable comparable, Object obj) {
        m27912g();
        int m27913f = m27913f(comparable);
        if (m27913f >= 0) {
            return ((C11933c) this.f69796b.get(m27913f)).setValue(obj);
        }
        m27911h();
        int i = -(m27913f + 1);
        if (i >= this.f69795a) {
            return m27907l().put(comparable, obj);
        }
        int size = this.f69796b.size();
        int i2 = this.f69795a;
        if (size == i2) {
            C11933c c11933c = (C11933c) this.f69796b.remove(i2 - 1);
            m27907l().put(c11933c.getKey(), c11933c.getValue());
        }
        this.f69796b.add(i, new C11933c(comparable, obj));
        return null;
    }

    /* renamed from: q */
    public final Object m27903q(int i) {
        m27912g();
        Object value = ((C11933c) this.f69796b.remove(i)).getValue();
        if (!this.f69797c.isEmpty()) {
            Iterator it = m27907l().entrySet().iterator();
            this.f69796b.add(new C11933c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m27912g();
        Comparable comparable = (Comparable) obj;
        int m27913f = m27913f(comparable);
        if (m27913f >= 0) {
            return m27903q(m27913f);
        }
        if (this.f69797c.isEmpty()) {
            return null;
        }
        return this.f69797c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f69796b.size() + this.f69797c.size();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$d */
    /* loaded from: classes6.dex */
    public class C11934d implements Iterator {

        /* renamed from: a */
        public int f69805a;

        /* renamed from: b */
        public boolean f69806b;

        /* renamed from: c */
        public Iterator f69807c;

        public C11934d() {
            this.f69805a = -1;
        }

        /* renamed from: a */
        public final Iterator m27896a() {
            if (this.f69807c == null) {
                this.f69807c = AbstractC11928d.this.f69797c.entrySet().iterator();
            }
            return this.f69807c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            this.f69806b = true;
            int i = this.f69805a + 1;
            this.f69805a = i;
            if (i < AbstractC11928d.this.f69796b.size()) {
                return (Map.Entry) AbstractC11928d.this.f69796b.get(this.f69805a);
            }
            return (Map.Entry) m27896a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f69805a + 1 < AbstractC11928d.this.f69796b.size() || m27896a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f69806b) {
                this.f69806b = false;
                AbstractC11928d.this.m27912g();
                if (this.f69805a < AbstractC11928d.this.f69796b.size()) {
                    AbstractC11928d abstractC11928d = AbstractC11928d.this;
                    int i = this.f69805a;
                    this.f69805a = i - 1;
                    abstractC11928d.m27903q(i);
                    return;
                }
                m27896a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ C11934d(AbstractC11928d abstractC11928d, C11929a c11929a) {
            this();
        }
    }

    public AbstractC11928d(int i) {
        this.f69795a = i;
        this.f69796b = Collections.emptyList();
        this.f69797c = Collections.emptyMap();
    }
}
