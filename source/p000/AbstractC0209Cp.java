package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import org.bson.util.CopyOnWriteMap;

/* renamed from: Cp */
/* loaded from: classes5.dex */
public abstract class AbstractC0209Cp {

    /* renamed from: a */
    public static final ConcurrentMap f837a = CopyOnWriteMap.m24063i();

    /* renamed from: a */
    public static List m68740a(Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Object.class);
        m68739b(cls, arrayList);
        Collections.reverse(arrayList);
        return Collections.unmodifiableList(new ArrayList(arrayList));
    }

    /* renamed from: b */
    public static void m68739b(Class cls, List list) {
        if (cls != null && cls != Object.class) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int length = interfaces.length - 1; length >= 0; length--) {
                m68739b(interfaces[length], list);
            }
            m68739b(cls.getSuperclass(), list);
            if (!list.contains(cls)) {
                list.add(cls);
            }
        }
    }

    /* renamed from: c */
    public static List m68738c(Class cls) {
        ConcurrentMap m68737d = m68737d();
        while (true) {
            List list = (List) m68737d.get(cls);
            if (list != null) {
                return list;
            }
            m68737d.putIfAbsent(cls, m68740a(cls));
        }
    }

    /* renamed from: d */
    public static ConcurrentMap m68737d() {
        return f837a;
    }
}
