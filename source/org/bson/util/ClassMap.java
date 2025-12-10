package org.bson.util;

import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes5.dex */
public class ClassMap<T> {

    /* renamed from: a */
    public final Map f76081a = CopyOnWriteMap.m24063i();

    /* renamed from: b */
    public final Map f76082b = C1133Pv.m66707a(new C12952b());

    /* renamed from: org.bson.util.ClassMap$b */
    /* loaded from: classes5.dex */
    public final class C12952b implements InterfaceC19806f50 {
        public C12952b() {
        }

        @Override // p000.InterfaceC19806f50
        /* renamed from: a */
        public Object apply(Class cls) {
            for (Class<?> cls2 : ClassMap.getAncestry(cls)) {
                Object obj = ClassMap.this.f76081a.get(cls2);
                if (obj != null) {
                    return obj;
                }
            }
            return null;
        }
    }

    public static <T> List<Class<?>> getAncestry(Class<T> cls) {
        return AbstractC0209Cp.m68738c(cls);
    }

    public void clear() {
        this.f76081a.clear();
        this.f76082b.clear();
    }

    public T get(Object obj) {
        return (T) this.f76082b.get(obj);
    }

    public boolean isEmpty() {
        return this.f76081a.isEmpty();
    }

    public T put(Class<?> cls, T t) {
        try {
            return (T) this.f76081a.put(cls, t);
        } finally {
            this.f76082b.clear();
        }
    }

    public T remove(Object obj) {
        try {
            return (T) this.f76081a.remove(obj);
        } finally {
            this.f76082b.clear();
        }
    }

    public int size() {
        return this.f76081a.size();
    }
}
