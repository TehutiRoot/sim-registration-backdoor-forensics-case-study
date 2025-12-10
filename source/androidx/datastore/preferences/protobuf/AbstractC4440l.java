package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes2.dex */
public abstract class AbstractC4440l {

    /* renamed from: a */
    public static final AbstractC4440l f34943a = new C4442b();

    /* renamed from: b */
    public static final AbstractC4440l f34944b = new C4443c();

    /* renamed from: androidx.datastore.preferences.protobuf.l$b */
    /* loaded from: classes2.dex */
    public static final class C4442b extends AbstractC4440l {

        /* renamed from: c */
        public static final Class f34945c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C4442b() {
            super();
        }

        /* renamed from: f */
        public static List m55168f(Object obj, long j) {
            return (List) AbstractC22978xY1.m493F(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static List m55167g(Object obj, long j, int i) {
            LazyStringArrayList lazyStringArrayList;
            List arrayList;
            List m55168f = m55168f(obj, j);
            if (m55168f.isEmpty()) {
                if (m55168f instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i);
                } else if ((m55168f instanceof InterfaceC17812In1) && (m55168f instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) m55168f).mutableCopyWithCapacity(i);
                } else {
                    arrayList = new ArrayList(i);
                }
                AbstractC22978xY1.m477V(obj, j, arrayList);
                return arrayList;
            }
            if (f34945c.isAssignableFrom(m55168f.getClass())) {
                ArrayList arrayList2 = new ArrayList(m55168f.size() + i);
                arrayList2.addAll(m55168f);
                AbstractC22978xY1.m477V(obj, j, arrayList2);
                lazyStringArrayList = arrayList2;
            } else if (m55168f instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(m55168f.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) m55168f);
                AbstractC22978xY1.m477V(obj, j, lazyStringArrayList2);
                lazyStringArrayList = lazyStringArrayList2;
            } else if ((m55168f instanceof InterfaceC17812In1) && (m55168f instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) m55168f;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(m55168f.size() + i);
                    AbstractC22978xY1.m477V(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return m55168f;
            } else {
                return m55168f;
            }
            return lazyStringArrayList;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4440l
        /* renamed from: c */
        public void mo55166c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) AbstractC22978xY1.m493F(obj, j);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else if (f34945c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof InterfaceC17812In1) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            AbstractC22978xY1.m477V(obj, j, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4440l
        /* renamed from: d */
        public void mo55165d(Object obj, Object obj2, long j) {
            List m55168f = m55168f(obj2, j);
            List m55167g = m55167g(obj, j, m55168f.size());
            int size = m55167g.size();
            int size2 = m55168f.size();
            if (size > 0 && size2 > 0) {
                m55167g.addAll(m55168f);
            }
            if (size > 0) {
                m55168f = m55167g;
            }
            AbstractC22978xY1.m477V(obj, j, m55168f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4440l
        /* renamed from: e */
        public List mo55164e(Object obj, long j) {
            return m55167g(obj, j, 10);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.l$c */
    /* loaded from: classes2.dex */
    public static final class C4443c extends AbstractC4440l {
        public C4443c() {
            super();
        }

        /* renamed from: f */
        public static Internal.ProtobufList m55163f(Object obj, long j) {
            return (Internal.ProtobufList) AbstractC22978xY1.m493F(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4440l
        /* renamed from: c */
        public void mo55166c(Object obj, long j) {
            m55163f(obj, j).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4440l
        /* renamed from: d */
        public void mo55165d(Object obj, Object obj2, long j) {
            Internal.ProtobufList m55163f = m55163f(obj, j);
            Internal.ProtobufList m55163f2 = m55163f(obj2, j);
            int size = m55163f.size();
            int size2 = m55163f2.size();
            if (size > 0 && size2 > 0) {
                if (!m55163f.isModifiable()) {
                    m55163f = m55163f.mutableCopyWithCapacity(size2 + size);
                }
                m55163f.addAll(m55163f2);
            }
            if (size > 0) {
                m55163f2 = m55163f;
            }
            AbstractC22978xY1.m477V(obj, j, m55163f2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4440l
        /* renamed from: e */
        public List mo55164e(Object obj, long j) {
            int i;
            Internal.ProtobufList m55163f = m55163f(obj, j);
            if (!m55163f.isModifiable()) {
                int size = m55163f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                Internal.ProtobufList mutableCopyWithCapacity = m55163f.mutableCopyWithCapacity(i);
                AbstractC22978xY1.m477V(obj, j, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
            return m55163f;
        }
    }

    /* renamed from: a */
    public static AbstractC4440l m55170a() {
        return f34943a;
    }

    /* renamed from: b */
    public static AbstractC4440l m55169b() {
        return f34944b;
    }

    /* renamed from: c */
    public abstract void mo55166c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo55165d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract List mo55164e(Object obj, long j);

    public AbstractC4440l() {
    }
}
