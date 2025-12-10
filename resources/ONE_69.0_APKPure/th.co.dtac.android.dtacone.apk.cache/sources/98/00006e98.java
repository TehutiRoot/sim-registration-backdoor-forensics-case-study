package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes2.dex */
public abstract class AbstractC4422l {

    /* renamed from: a */
    public static final AbstractC4422l f35031a = new C4424b();

    /* renamed from: b */
    public static final AbstractC4422l f35032b = new C4425c();

    /* renamed from: androidx.datastore.preferences.protobuf.l$b */
    /* loaded from: classes2.dex */
    public static final class C4424b extends AbstractC4422l {

        /* renamed from: c */
        public static final Class f35033c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C4424b() {
            super();
        }

        /* renamed from: f */
        public static List m55118f(Object obj, long j) {
            return (List) AbstractC22531uZ1.m1154F(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static List m55117g(Object obj, long j, int i) {
            LazyStringArrayList lazyStringArrayList;
            List arrayList;
            List m55118f = m55118f(obj, j);
            if (m55118f.isEmpty()) {
                if (m55118f instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i);
                } else if ((m55118f instanceof InterfaceC17651Fo1) && (m55118f instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) m55118f).mutableCopyWithCapacity(i);
                } else {
                    arrayList = new ArrayList(i);
                }
                AbstractC22531uZ1.m1138V(obj, j, arrayList);
                return arrayList;
            }
            if (f35033c.isAssignableFrom(m55118f.getClass())) {
                ArrayList arrayList2 = new ArrayList(m55118f.size() + i);
                arrayList2.addAll(m55118f);
                AbstractC22531uZ1.m1138V(obj, j, arrayList2);
                lazyStringArrayList = arrayList2;
            } else if (m55118f instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(m55118f.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) m55118f);
                AbstractC22531uZ1.m1138V(obj, j, lazyStringArrayList2);
                lazyStringArrayList = lazyStringArrayList2;
            } else if ((m55118f instanceof InterfaceC17651Fo1) && (m55118f instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) m55118f;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(m55118f.size() + i);
                    AbstractC22531uZ1.m1138V(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return m55118f;
            } else {
                return m55118f;
            }
            return lazyStringArrayList;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4422l
        /* renamed from: c */
        public void mo55116c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) AbstractC22531uZ1.m1154F(obj, j);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else if (f35033c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof InterfaceC17651Fo1) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            AbstractC22531uZ1.m1138V(obj, j, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4422l
        /* renamed from: d */
        public void mo55115d(Object obj, Object obj2, long j) {
            List m55118f = m55118f(obj2, j);
            List m55117g = m55117g(obj, j, m55118f.size());
            int size = m55117g.size();
            int size2 = m55118f.size();
            if (size > 0 && size2 > 0) {
                m55117g.addAll(m55118f);
            }
            if (size > 0) {
                m55118f = m55117g;
            }
            AbstractC22531uZ1.m1138V(obj, j, m55118f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4422l
        /* renamed from: e */
        public List mo55114e(Object obj, long j) {
            return m55117g(obj, j, 10);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.l$c */
    /* loaded from: classes2.dex */
    public static final class C4425c extends AbstractC4422l {
        public C4425c() {
            super();
        }

        /* renamed from: f */
        public static Internal.ProtobufList m55113f(Object obj, long j) {
            return (Internal.ProtobufList) AbstractC22531uZ1.m1154F(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4422l
        /* renamed from: c */
        public void mo55116c(Object obj, long j) {
            m55113f(obj, j).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4422l
        /* renamed from: d */
        public void mo55115d(Object obj, Object obj2, long j) {
            Internal.ProtobufList m55113f = m55113f(obj, j);
            Internal.ProtobufList m55113f2 = m55113f(obj2, j);
            int size = m55113f.size();
            int size2 = m55113f2.size();
            if (size > 0 && size2 > 0) {
                if (!m55113f.isModifiable()) {
                    m55113f = m55113f.mutableCopyWithCapacity(size2 + size);
                }
                m55113f.addAll(m55113f2);
            }
            if (size > 0) {
                m55113f2 = m55113f;
            }
            AbstractC22531uZ1.m1138V(obj, j, m55113f2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC4422l
        /* renamed from: e */
        public List mo55114e(Object obj, long j) {
            int i;
            Internal.ProtobufList m55113f = m55113f(obj, j);
            if (!m55113f.isModifiable()) {
                int size = m55113f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                Internal.ProtobufList mutableCopyWithCapacity = m55113f.mutableCopyWithCapacity(i);
                AbstractC22531uZ1.m1138V(obj, j, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
            return m55113f;
        }
    }

    /* renamed from: a */
    public static AbstractC4422l m55120a() {
        return f35031a;
    }

    /* renamed from: b */
    public static AbstractC4422l m55119b() {
        return f35032b;
    }

    /* renamed from: c */
    public abstract void mo55116c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo55115d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract List mo55114e(Object obj, long j);

    public AbstractC4422l() {
    }
}