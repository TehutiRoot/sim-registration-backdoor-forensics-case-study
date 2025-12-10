package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.k */
/* loaded from: classes4.dex */
public abstract class AbstractC8948k {

    /* renamed from: a */
    public static final AbstractC8948k f57476a = new C8950b();

    /* renamed from: b */
    public static final AbstractC8948k f57477b = new C8951c();

    /* renamed from: com.google.protobuf.k$b */
    /* loaded from: classes4.dex */
    public static final class C8950b extends AbstractC8948k {

        /* renamed from: c */
        public static final Class f57478c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C8950b() {
            super();
        }

        /* renamed from: f */
        public static List m35274f(Object obj, long j) {
            return (List) AbstractC22806wY1.m820H(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static List m35273g(Object obj, long j, int i) {
            LazyStringArrayList lazyStringArrayList;
            List arrayList;
            List m35274f = m35274f(obj, j);
            if (m35274f.isEmpty()) {
                if (m35274f instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i);
                } else if ((m35274f instanceof InterfaceC17748Hn1) && (m35274f instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) m35274f).mutableCopyWithCapacity(i);
                } else {
                    arrayList = new ArrayList(i);
                }
                AbstractC22806wY1.m803Y(obj, j, arrayList);
                return arrayList;
            }
            if (f57478c.isAssignableFrom(m35274f.getClass())) {
                ArrayList arrayList2 = new ArrayList(m35274f.size() + i);
                arrayList2.addAll(m35274f);
                AbstractC22806wY1.m803Y(obj, j, arrayList2);
                lazyStringArrayList = arrayList2;
            } else if (m35274f instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(m35274f.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) m35274f);
                AbstractC22806wY1.m803Y(obj, j, lazyStringArrayList2);
                lazyStringArrayList = lazyStringArrayList2;
            } else if ((m35274f instanceof InterfaceC17748Hn1) && (m35274f instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) m35274f;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(m35274f.size() + i);
                    AbstractC22806wY1.m803Y(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return m35274f;
            } else {
                return m35274f;
            }
            return lazyStringArrayList;
        }

        @Override // com.google.protobuf.AbstractC8948k
        /* renamed from: c */
        public void mo35272c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) AbstractC22806wY1.m820H(obj, j);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else if (f57478c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof InterfaceC17748Hn1) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            AbstractC22806wY1.m803Y(obj, j, unmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC8948k
        /* renamed from: d */
        public void mo35271d(Object obj, Object obj2, long j) {
            List m35274f = m35274f(obj2, j);
            List m35273g = m35273g(obj, j, m35274f.size());
            int size = m35273g.size();
            int size2 = m35274f.size();
            if (size > 0 && size2 > 0) {
                m35273g.addAll(m35274f);
            }
            if (size > 0) {
                m35274f = m35273g;
            }
            AbstractC22806wY1.m803Y(obj, j, m35274f);
        }

        @Override // com.google.protobuf.AbstractC8948k
        /* renamed from: e */
        public List mo35270e(Object obj, long j) {
            return m35273g(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.k$c */
    /* loaded from: classes4.dex */
    public static final class C8951c extends AbstractC8948k {
        public C8951c() {
            super();
        }

        /* renamed from: f */
        public static Internal.ProtobufList m35269f(Object obj, long j) {
            return (Internal.ProtobufList) AbstractC22806wY1.m820H(obj, j);
        }

        @Override // com.google.protobuf.AbstractC8948k
        /* renamed from: c */
        public void mo35272c(Object obj, long j) {
            m35269f(obj, j).makeImmutable();
        }

        @Override // com.google.protobuf.AbstractC8948k
        /* renamed from: d */
        public void mo35271d(Object obj, Object obj2, long j) {
            Internal.ProtobufList m35269f = m35269f(obj, j);
            Internal.ProtobufList m35269f2 = m35269f(obj2, j);
            int size = m35269f.size();
            int size2 = m35269f2.size();
            if (size > 0 && size2 > 0) {
                if (!m35269f.isModifiable()) {
                    m35269f = m35269f.mutableCopyWithCapacity(size2 + size);
                }
                m35269f.addAll(m35269f2);
            }
            if (size > 0) {
                m35269f2 = m35269f;
            }
            AbstractC22806wY1.m803Y(obj, j, m35269f2);
        }

        @Override // com.google.protobuf.AbstractC8948k
        /* renamed from: e */
        public List mo35270e(Object obj, long j) {
            int i;
            Internal.ProtobufList m35269f = m35269f(obj, j);
            if (!m35269f.isModifiable()) {
                int size = m35269f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                Internal.ProtobufList mutableCopyWithCapacity = m35269f.mutableCopyWithCapacity(i);
                AbstractC22806wY1.m803Y(obj, j, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
            return m35269f;
        }
    }

    /* renamed from: a */
    public static AbstractC8948k m35276a() {
        return f57476a;
    }

    /* renamed from: b */
    public static AbstractC8948k m35275b() {
        return f57477b;
    }

    /* renamed from: c */
    public abstract void mo35272c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo35271d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract List mo35270e(Object obj, long j);

    public AbstractC8948k() {
    }
}
