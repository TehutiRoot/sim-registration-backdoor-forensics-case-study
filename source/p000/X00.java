package p000;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractC7947a;
import com.google.common.collect.Collections2;
import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.ForwardingList;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X00 */
/* loaded from: classes4.dex */
public class X00 extends AbstractC7947a implements Z00 {

    /* renamed from: a */
    public final Multimap f7362a;

    /* renamed from: b */
    public final Predicate f7363b;

    /* renamed from: X00$a */
    /* loaded from: classes4.dex */
    public static class C1648a extends ForwardingList {

        /* renamed from: a */
        public final Object f7364a;

        public C1648a(Object obj) {
            this.f7364a = obj;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            add(0, obj);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            addAll(0, collection);
            return true;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int i, Object obj) {
            Preconditions.checkPositionIndex(i, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f7364a);
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public boolean addAll(int i, Collection collection) {
            Preconditions.checkNotNull(collection);
            Preconditions.checkPositionIndex(i, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f7364a);
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public List delegate() {
            return Collections.emptyList();
        }
    }

    /* renamed from: X00$c */
    /* loaded from: classes4.dex */
    public class C1650c extends ForwardingCollection {
        public C1650c() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (X00.this.f7362a.containsKey(entry.getKey()) && X00.this.f7363b.apply(entry.getKey())) {
                    return X00.this.f7362a.remove(entry.getKey(), entry.getValue());
                }
                return false;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection delegate() {
            return Collections2.filter(X00.this.f7362a.entries(), X00.this.mo40278c());
        }
    }

    public X00(Multimap multimap, Predicate predicate) {
        this.f7362a = (Multimap) Preconditions.checkNotNull(multimap);
        this.f7363b = (Predicate) Preconditions.checkNotNull(predicate);
    }

    /* renamed from: a */
    public Multimap mo40280a() {
        return this.f7362a;
    }

    /* renamed from: b */
    public Collection m65544b() {
        if (this.f7362a instanceof SetMultimap) {
            return Collections.emptySet();
        }
        return Collections.emptyList();
    }

    @Override // p000.Z00
    /* renamed from: c */
    public Predicate mo40278c() {
        return Maps.m40683y(this.f7363b);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        if (this.f7362a.containsKey(obj)) {
            return this.f7363b.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Map createAsMap() {
        return Maps.filterKeys(this.f7362a.asMap(), this.f7363b);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Collection createEntries() {
        return new C1650c();
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Set createKeySet() {
        return Sets.filter(this.f7362a.keySet(), this.f7363b);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Multiset createKeys() {
        return Multisets.filter(this.f7362a.keys(), this.f7363b);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Collection createValues() {
        return new C18928a10(this);
    }

    @Override // com.google.common.collect.AbstractC7947a
    public Iterator entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection get(Object obj) {
        if (this.f7363b.apply(obj)) {
            return this.f7362a.get(obj);
        }
        if (this.f7362a instanceof SetMultimap) {
            return new C1649b(obj);
        }
        return new C1648a(obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.SetMultimap
    public Collection removeAll(Object obj) {
        if (containsKey(obj)) {
            return this.f7362a.removeAll(obj);
        }
        return m65544b();
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        int i = 0;
        for (Collection<Object> collection : asMap().values()) {
            i += collection.size();
        }
        return i;
    }

    /* renamed from: X00$b */
    /* loaded from: classes4.dex */
    public static class C1649b extends ForwardingSet {

        /* renamed from: a */
        public final Object f7365a;

        public C1649b(Object obj) {
            this.f7365a = obj;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f7365a);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f7365a);
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set delegate() {
            return Collections.emptySet();
        }
    }
}
