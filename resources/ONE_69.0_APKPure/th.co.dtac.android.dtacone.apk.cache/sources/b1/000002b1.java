package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import org.bson.util.CopyOnWriteMap;

/* renamed from: Cp */
/* loaded from: classes5.dex */
public abstract class AbstractC0203Cp {

    /* renamed from: a */
    public static final ConcurrentMap f846a = CopyOnWriteMap.m24252i();

    /* renamed from: a */
    public static List m68916a(Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Object.class);
        m68915b(cls, arrayList);
        Collections.reverse(arrayList);
        return Collections.unmodifiableList(new ArrayList(arrayList));
    }

    /* renamed from: b */
    public static void m68915b(Class cls, List list) {
        if (cls != null && cls != Object.class) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int length = interfaces.length - 1; length >= 0; length--) {
                m68915b(interfaces[length], list);
            }
            m68915b(cls.getSuperclass(), list);
            if (!list.contains(cls)) {
                list.add(cls);
            }
        }
    }

    /* renamed from: c */
    public static List m68914c(Class cls) {
        ConcurrentMap m68913d = m68913d();
        while (true) {
            List list = (List) m68913d.get(cls);
            if (list != null) {
                return list;
            }
            m68913d.putIfAbsent(cls, m68916a(cls));
        }
    }

    /* renamed from: d */
    public static ConcurrentMap m68913d() {
        return f846a;
    }
}