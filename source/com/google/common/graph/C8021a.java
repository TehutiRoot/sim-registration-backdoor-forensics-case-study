package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.C8021a;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.common.graph.a */
/* loaded from: classes4.dex */
public final class C8021a implements U60 {

    /* renamed from: e */
    public static final Object f53805e = new Object();

    /* renamed from: a */
    public final Map f53806a;

    /* renamed from: b */
    public final List f53807b;

    /* renamed from: c */
    public int f53808c;

    /* renamed from: d */
    public int f53809d;

    /* renamed from: com.google.common.graph.a$a */
    /* loaded from: classes4.dex */
    public class C8022a extends AbstractSet {

        /* renamed from: com.google.common.graph.a$a$a */
        /* loaded from: classes4.dex */
        public class C8023a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53811c;

            /* renamed from: d */
            public final /* synthetic */ Set f53812d;

            /* renamed from: e */
            public final /* synthetic */ C8022a f53813e;

            public C8023a(C8022a c8022a, Iterator it, Set set) {
                this.f53811c = it;
                this.f53812d = set;
                this.f53813e = c8022a;
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53811c.hasNext()) {
                    AbstractC8032f abstractC8032f = (AbstractC8032f) this.f53811c.next();
                    if (this.f53812d.add(abstractC8032f.f53828a)) {
                        return abstractC8032f.f53828a;
                    }
                }
                return endOfData();
            }
        }

        public C8022a() {
            C8021a.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            return new C8023a(this, C8021a.this.f53807b.iterator(), new HashSet());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C8021a.this.f53806a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C8021a.this.f53806a.size();
        }
    }

    /* renamed from: com.google.common.graph.a$b */
    /* loaded from: classes4.dex */
    public class C8024b extends AbstractSet {

        /* renamed from: com.google.common.graph.a$b$a */
        /* loaded from: classes4.dex */
        public class C8025a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53815c;

            /* renamed from: d */
            public final /* synthetic */ C8024b f53816d;

            public C8025a(C8024b c8024b, Iterator it) {
                this.f53815c = it;
                this.f53816d = c8024b;
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53815c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f53815c.next();
                    if (C8021a.m40088s(entry.getValue())) {
                        return entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.a$b$b */
        /* loaded from: classes4.dex */
        public class C8026b extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53817c;

            /* renamed from: d */
            public final /* synthetic */ C8024b f53818d;

            public C8026b(C8024b c8024b, Iterator it) {
                this.f53817c = it;
                this.f53818d = c8024b;
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53817c.hasNext()) {
                    AbstractC8032f abstractC8032f = (AbstractC8032f) this.f53817c.next();
                    if (abstractC8032f instanceof AbstractC8032f.C8033a) {
                        return abstractC8032f.f53828a;
                    }
                }
                return endOfData();
            }
        }

        public C8024b() {
            C8021a.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            if (C8021a.this.f53807b == null) {
                return new C8025a(this, C8021a.this.f53806a.entrySet().iterator());
            }
            return new C8026b(this, C8021a.this.f53807b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C8021a.m40088s(C8021a.this.f53806a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C8021a.this.f53808c;
        }
    }

    /* renamed from: com.google.common.graph.a$c */
    /* loaded from: classes4.dex */
    public class C8027c extends AbstractSet {

        /* renamed from: com.google.common.graph.a$c$a */
        /* loaded from: classes4.dex */
        public class C8028a extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53820c;

            /* renamed from: d */
            public final /* synthetic */ C8027c f53821d;

            public C8028a(C8027c c8027c, Iterator it) {
                this.f53820c = it;
                this.f53821d = c8027c;
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53820c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f53820c.next();
                    if (C8021a.m40087t(entry.getValue())) {
                        return entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* renamed from: com.google.common.graph.a$c$b */
        /* loaded from: classes4.dex */
        public class C8029b extends AbstractIterator {

            /* renamed from: c */
            public final /* synthetic */ Iterator f53822c;

            /* renamed from: d */
            public final /* synthetic */ C8027c f53823d;

            public C8029b(C8027c c8027c, Iterator it) {
                this.f53822c = it;
                this.f53823d = c8027c;
            }

            @Override // com.google.common.collect.AbstractIterator
            public Object computeNext() {
                while (this.f53822c.hasNext()) {
                    AbstractC8032f abstractC8032f = (AbstractC8032f) this.f53822c.next();
                    if (abstractC8032f instanceof AbstractC8032f.C8034b) {
                        return abstractC8032f.f53828a;
                    }
                }
                return endOfData();
            }
        }

        public C8027c() {
            C8021a.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public UnmodifiableIterator iterator() {
            if (C8021a.this.f53807b == null) {
                return new C8028a(this, C8021a.this.f53806a.entrySet().iterator());
            }
            return new C8029b(this, C8021a.this.f53807b.iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C8021a.m40087t(C8021a.this.f53806a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C8021a.this.f53809d;
        }
    }

    /* renamed from: com.google.common.graph.a$d */
    /* loaded from: classes4.dex */
    public class C8030d extends AbstractIterator {

        /* renamed from: c */
        public final /* synthetic */ Iterator f53824c;

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f53825d;

        /* renamed from: e */
        public final /* synthetic */ C8021a f53826e;

        public C8030d(C8021a c8021a, Iterator it, AtomicBoolean atomicBoolean) {
            this.f53824c = it;
            this.f53825d = atomicBoolean;
            this.f53826e = c8021a;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0008  */
        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.common.graph.EndpointPair computeNext() {
            /*
                r3 = this;
            L0:
                java.util.Iterator r0 = r3.f53824c
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L28
                java.util.Iterator r0 = r3.f53824c
                java.lang.Object r0 = r0.next()
                com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                java.lang.Object r1 = r0.nodeU()
                java.lang.Object r2 = r0.nodeV()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L27
                java.util.concurrent.atomic.AtomicBoolean r1 = r3.f53825d
                r2 = 1
                boolean r1 = r1.getAndSet(r2)
                if (r1 != 0) goto L0
            L27:
                return r0
            L28:
                java.lang.Object r0 = r3.endOfData()
                com.google.common.graph.EndpointPair r0 = (com.google.common.graph.EndpointPair) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.C8021a.C8030d.computeNext():com.google.common.graph.EndpointPair");
        }
    }

    /* renamed from: com.google.common.graph.a$e */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8031e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53827a;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            f53827a = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53827a[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.common.graph.a$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8032f {

        /* renamed from: a */
        public final Object f53828a;

        /* renamed from: com.google.common.graph.a$f$a */
        /* loaded from: classes4.dex */
        public static final class C8033a extends AbstractC8032f {
            public C8033a(Object obj) {
                super(obj);
            }

            public boolean equals(Object obj) {
                if (obj instanceof C8033a) {
                    return this.f53828a.equals(((C8033a) obj).f53828a);
                }
                return false;
            }

            public int hashCode() {
                return C8033a.class.hashCode() + this.f53828a.hashCode();
            }
        }

        /* renamed from: com.google.common.graph.a$f$b */
        /* loaded from: classes4.dex */
        public static final class C8034b extends AbstractC8032f {
            public C8034b(Object obj) {
                super(obj);
            }

            public boolean equals(Object obj) {
                if (obj instanceof C8034b) {
                    return this.f53828a.equals(((C8034b) obj).f53828a);
                }
                return false;
            }

            public int hashCode() {
                return C8034b.class.hashCode() + this.f53828a.hashCode();
            }
        }

        public AbstractC8032f(Object obj) {
            this.f53828a = Preconditions.checkNotNull(obj);
        }
    }

    /* renamed from: com.google.common.graph.a$g */
    /* loaded from: classes4.dex */
    public static final class C8035g {

        /* renamed from: a */
        public final Object f53829a;

        public C8035g(Object obj) {
            this.f53829a = obj;
        }
    }

    public C8021a(Map map, List list, int i, int i2) {
        boolean z;
        this.f53806a = (Map) Preconditions.checkNotNull(map);
        this.f53807b = list;
        this.f53808c = Graphs.m40141b(i);
        this.f53809d = Graphs.m40141b(i2);
        if (i <= map.size() && i2 <= map.size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    /* renamed from: j */
    public static /* synthetic */ EndpointPair m40097j(Object obj, Object obj2) {
        return EndpointPair.ordered(obj2, obj);
    }

    /* renamed from: k */
    public static /* synthetic */ EndpointPair m40096k(Object obj, AbstractC8032f abstractC8032f) {
        return m40084w(obj, abstractC8032f);
    }

    /* renamed from: l */
    public static /* synthetic */ EndpointPair m40095l(Object obj, Object obj2) {
        return EndpointPair.ordered(obj, obj2);
    }

    /* renamed from: s */
    public static boolean m40088s(Object obj) {
        if (obj != f53805e && !(obj instanceof C8035g)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m40087t(Object obj) {
        if (obj != f53805e && obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static /* synthetic */ EndpointPair m40084w(Object obj, AbstractC8032f abstractC8032f) {
        if (abstractC8032f instanceof AbstractC8032f.C8034b) {
            return EndpointPair.ordered(obj, abstractC8032f.f53828a);
        }
        return EndpointPair.ordered(abstractC8032f.f53828a, obj);
    }

    /* renamed from: x */
    public static C8021a m40083x(ElementOrder elementOrder) {
        ArrayList arrayList;
        int i = C8031e.f53827a[elementOrder.type().ordinal()];
        if (i != 1) {
            if (i == 2) {
                arrayList = new ArrayList();
            } else {
                throw new AssertionError(elementOrder.type());
            }
        } else {
            arrayList = null;
        }
        return new C8021a(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* renamed from: y */
    public static C8021a m40082y(Object obj, Iterable iterable, Function function) {
        boolean z;
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(function);
        HashMap hashMap = new HashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = iterable.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            EndpointPair endpointPair = (EndpointPair) it.next();
            if (endpointPair.nodeU().equals(obj) && endpointPair.nodeV().equals(obj)) {
                hashMap.put(obj, new C8035g(function.apply(obj)));
                builder.add((ImmutableList.Builder) new AbstractC8032f.C8033a(obj));
                builder.add((ImmutableList.Builder) new AbstractC8032f.C8034b(obj));
                i++;
            } else if (endpointPair.nodeV().equals(obj)) {
                Object nodeU = endpointPair.nodeU();
                Object put = hashMap.put(nodeU, f53805e);
                if (put != null) {
                    hashMap.put(nodeU, new C8035g(put));
                }
                builder.add((ImmutableList.Builder) new AbstractC8032f.C8033a(nodeU));
                i++;
            } else {
                Preconditions.checkArgument(endpointPair.nodeU().equals(obj));
                Object nodeV = endpointPair.nodeV();
                Object apply = function.apply(nodeV);
                Object put2 = hashMap.put(nodeV, apply);
                if (put2 != null) {
                    if (put2 == f53805e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkArgument(z);
                    hashMap.put(nodeV, new C8035g(apply));
                }
                builder.add((ImmutableList.Builder) new AbstractC8032f.C8034b(nodeV));
            }
            i2++;
        }
        return new C8021a(hashMap, builder.build(), i, i2);
    }

    @Override // p000.U60
    /* renamed from: a */
    public Set mo40075a() {
        if (this.f53807b == null) {
            return Collections.unmodifiableSet(this.f53806a.keySet());
        }
        return new C8022a();
    }

    @Override // p000.U60
    /* renamed from: b */
    public Set mo40074b() {
        return new C8027c();
    }

    @Override // p000.U60
    /* renamed from: c */
    public Set mo40073c() {
        return new C8024b();
    }

    @Override // p000.U60
    /* renamed from: d */
    public void mo40072d(Object obj, Object obj2) {
        Map map = this.f53806a;
        Object obj3 = f53805e;
        Object put = map.put(obj, obj3);
        if (put != null) {
            if (put instanceof C8035g) {
                this.f53806a.put(obj, put);
                return;
            } else if (put != obj3) {
                this.f53806a.put(obj, new C8035g(put));
            } else {
                return;
            }
        }
        int i = this.f53808c + 1;
        this.f53808c = i;
        Graphs.m40139d(i);
        List list = this.f53807b;
        if (list != null) {
            list.add(new AbstractC8032f.C8033a(obj));
        }
    }

    @Override // p000.U60
    /* renamed from: e */
    public Object mo40071e(Object obj) {
        Preconditions.checkNotNull(obj);
        Object obj2 = this.f53806a.get(obj);
        if (obj2 == f53805e) {
            return null;
        }
        if (obj2 instanceof C8035g) {
            return ((C8035g) obj2).f53829a;
        }
        return obj2;
    }

    @Override // p000.U60
    /* renamed from: f */
    public Object mo40070f(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = this.f53806a.get(obj);
        if (obj3 != null && obj3 != (obj2 = f53805e)) {
            if (obj3 instanceof C8035g) {
                this.f53806a.put(obj, obj2);
                obj3 = ((C8035g) obj3).f53829a;
            } else {
                this.f53806a.remove(obj);
            }
        } else {
            obj3 = null;
        }
        if (obj3 != null) {
            int i = this.f53809d - 1;
            this.f53809d = i;
            Graphs.m40141b(i);
            List list = this.f53807b;
            if (list != null) {
                list.remove(new AbstractC8032f.C8034b(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return obj3;
    }

    @Override // p000.U60
    /* renamed from: g */
    public void mo40069g(Object obj) {
        Preconditions.checkNotNull(obj);
        Object obj2 = this.f53806a.get(obj);
        if (obj2 == f53805e) {
            this.f53806a.remove(obj);
        } else if (obj2 instanceof C8035g) {
            this.f53806a.put(obj, ((C8035g) obj2).f53829a);
        } else {
            return;
        }
        int i = this.f53808c - 1;
        this.f53808c = i;
        Graphs.m40141b(i);
        List list = this.f53807b;
        if (list != null) {
            list.remove(new AbstractC8032f.C8033a(obj));
        }
    }

    @Override // p000.U60
    /* renamed from: h */
    public Iterator mo40068h(final Object obj) {
        Iterator transform;
        Preconditions.checkNotNull(obj);
        List list = this.f53807b;
        if (list == null) {
            transform = Iterators.concat(Iterators.transform(mo40073c().iterator(), new Function() { // from class: VI
                @Override // com.google.common.base.Function
                public final Object apply(Object obj2) {
                    return C8021a.m40097j(obj, obj2);
                }
            }), Iterators.transform(mo40074b().iterator(), new Function() { // from class: WI
                @Override // com.google.common.base.Function
                public final Object apply(Object obj2) {
                    return C8021a.m40095l(obj, obj2);
                }
            }));
        } else {
            transform = Iterators.transform(list.iterator(), new Function() { // from class: XI
                @Override // com.google.common.base.Function
                public final Object apply(Object obj2) {
                    return C8021a.m40096k(obj, (C8021a.AbstractC8032f) obj2);
                }
            });
        }
        return new C8030d(this, transform, new AtomicBoolean(false));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p000.U60
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo40067i(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f53806a
            java.lang.Object r0 = r0.put(r5, r6)
            r1 = 0
            if (r0 != 0) goto Lb
        L9:
            r0 = r1
            goto L2f
        Lb:
            boolean r2 = r0 instanceof com.google.common.graph.C8021a.C8035g
            if (r2 == 0) goto L20
            java.util.Map r2 = r4.f53806a
            com.google.common.graph.a$g r3 = new com.google.common.graph.a$g
            r3.<init>(r6)
            r2.put(r5, r3)
            com.google.common.graph.a$g r0 = (com.google.common.graph.C8021a.C8035g) r0
            java.lang.Object r0 = com.google.common.graph.C8021a.C8035g.m40077a(r0)
            goto L2f
        L20:
            java.lang.Object r2 = com.google.common.graph.C8021a.f53805e
            if (r0 != r2) goto L2f
            java.util.Map r0 = r4.f53806a
            com.google.common.graph.a$g r2 = new com.google.common.graph.a$g
            r2.<init>(r6)
            r0.put(r5, r2)
            goto L9
        L2f:
            if (r0 != 0) goto L46
            int r6 = r4.f53809d
            int r6 = r6 + 1
            r4.f53809d = r6
            com.google.common.graph.Graphs.m40139d(r6)
            java.util.List r6 = r4.f53807b
            if (r6 == 0) goto L46
            com.google.common.graph.a$f$b r2 = new com.google.common.graph.a$f$b
            r2.<init>(r5)
            r6.add(r2)
        L46:
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r1 = r0
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.C8021a.mo40067i(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
