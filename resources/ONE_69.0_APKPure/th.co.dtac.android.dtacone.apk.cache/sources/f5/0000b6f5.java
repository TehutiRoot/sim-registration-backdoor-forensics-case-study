package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.k */
/* loaded from: classes4.dex */
public abstract class AbstractC8937k {

    /* renamed from: a */
    public static final AbstractC8937k f57488a = new C8939b();

    /* renamed from: b */
    public static final AbstractC8937k f57489b = new C8940c();

    /* renamed from: com.google.protobuf.k$b */
    /* loaded from: classes4.dex */
    public static final class C8939b extends AbstractC8937k {

        /* renamed from: c */
        public static final Class f57490c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C8939b() {
            super();
        }

        /* renamed from: f */
        public static List m35266f(Object obj, long j) {
            return (List) AbstractC22358tZ1.m22660H(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public static List m35265g(Object obj, long j, int i) {
            LazyStringArrayList lazyStringArrayList;
            List arrayList;
            List m35266f = m35266f(obj, j);
            if (m35266f.isEmpty()) {
                if (m35266f instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i);
                } else if ((m35266f instanceof InterfaceC17586Eo1) && (m35266f instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) m35266f).mutableCopyWithCapacity(i);
                } else {
                    arrayList = new ArrayList(i);
                }
                AbstractC22358tZ1.m22643Y(obj, j, arrayList);
                return arrayList;
            }
            if (f57490c.isAssignableFrom(m35266f.getClass())) {
                ArrayList arrayList2 = new ArrayList(m35266f.size() + i);
                arrayList2.addAll(m35266f);
                AbstractC22358tZ1.m22643Y(obj, j, arrayList2);
                lazyStringArrayList = arrayList2;
            } else if (m35266f instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(m35266f.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) m35266f);
                AbstractC22358tZ1.m22643Y(obj, j, lazyStringArrayList2);
                lazyStringArrayList = lazyStringArrayList2;
            } else if ((m35266f instanceof InterfaceC17586Eo1) && (m35266f instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) m35266f;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(m35266f.size() + i);
                    AbstractC22358tZ1.m22643Y(obj, j, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return m35266f;
            } else {
                return m35266f;
            }
            return lazyStringArrayList;
        }

        @Override // com.google.protobuf.AbstractC8937k
        /* renamed from: c */
        public void mo35264c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) AbstractC22358tZ1.m22660H(obj, j);
            if (list instanceof LazyStringList) {
                unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else if (f57490c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof InterfaceC17586Eo1) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            AbstractC22358tZ1.m22643Y(obj, j, unmodifiableList);
        }

        @Override // com.google.protobuf.AbstractC8937k
        /* renamed from: d */
        public void mo35263d(Object obj, Object obj2, long j) {
            List m35266f = m35266f(obj2, j);
            List m35265g = m35265g(obj, j, m35266f.size());
            int size = m35265g.size();
            int size2 = m35266f.size();
            if (size > 0 && size2 > 0) {
                m35265g.addAll(m35266f);
            }
            if (size > 0) {
                m35266f = m35265g;
            }
            AbstractC22358tZ1.m22643Y(obj, j, m35266f);
        }

        @Override // com.google.protobuf.AbstractC8937k
        /* renamed from: e */
        public List mo35262e(Object obj, long j) {
            return m35265g(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.k$c */
    /* loaded from: classes4.dex */
    public static final class C8940c extends AbstractC8937k {
        public C8940c() {
            super();
        }

        /* renamed from: f */
        public static Internal.ProtobufList m35261f(Object obj, long j) {
            return (Internal.ProtobufList) AbstractC22358tZ1.m22660H(obj, j);
        }

        @Override // com.google.protobuf.AbstractC8937k
        /* renamed from: c */
        public void mo35264c(Object obj, long j) {
            m35261f(obj, j).makeImmutable();
        }

        @Override // com.google.protobuf.AbstractC8937k
        /* renamed from: d */
        public void mo35263d(Object obj, Object obj2, long j) {
            Internal.ProtobufList m35261f = m35261f(obj, j);
            Internal.ProtobufList m35261f2 = m35261f(obj2, j);
            int size = m35261f.size();
            int size2 = m35261f2.size();
            if (size > 0 && size2 > 0) {
                if (!m35261f.isModifiable()) {
                    m35261f = m35261f.mutableCopyWithCapacity(size2 + size);
                }
                m35261f.addAll(m35261f2);
            }
            if (size > 0) {
                m35261f2 = m35261f;
            }
            AbstractC22358tZ1.m22643Y(obj, j, m35261f2);
        }

        @Override // com.google.protobuf.AbstractC8937k
        /* renamed from: e */
        public List mo35262e(Object obj, long j) {
            int i;
            Internal.ProtobufList m35261f = m35261f(obj, j);
            if (!m35261f.isModifiable()) {
                int size = m35261f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                Internal.ProtobufList mutableCopyWithCapacity = m35261f.mutableCopyWithCapacity(i);
                AbstractC22358tZ1.m22643Y(obj, j, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
            return m35261f;
        }
    }

    /* renamed from: a */
    public static AbstractC8937k m35268a() {
        return f57488a;
    }

    /* renamed from: b */
    public static AbstractC8937k m35267b() {
        return f57489b;
    }

    /* renamed from: c */
    public abstract void mo35264c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo35263d(Object obj, Object obj2, long j);

    /* renamed from: e */
    public abstract List mo35262e(Object obj, long j);

    public AbstractC8937k() {
    }
}