package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes5.dex */
public abstract class ServiceProviders {

    /* loaded from: classes5.dex */
    public interface PriorityAccessor<T> {
        int getPriority(T t);

        boolean isAvailable(T t);
    }

    /* renamed from: io.grpc.ServiceProviders$a */
    /* loaded from: classes5.dex */
    public class C10558a implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ PriorityAccessor f63400a;

        public C10558a(PriorityAccessor priorityAccessor) {
            this.f63400a = priorityAccessor;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int priority = this.f63400a.getPriority(obj) - this.f63400a.getPriority(obj2);
            if (priority != 0) {
                return priority;
            }
            return obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    /* renamed from: a */
    public static Object m30324a(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(null).newInstance(null);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
        }
    }

    /* renamed from: b */
    public static Iterable m30323b(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object m30324a = m30324a(cls, (Class) it.next());
            if (m30324a != null) {
                arrayList.add(m30324a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Iterable m30322c(Class cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        if (!load.iterator().hasNext()) {
            return ServiceLoader.load(cls);
        }
        return load;
    }

    /* renamed from: d */
    public static boolean m30321d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static Object m30320e(Class cls, Iterable iterable, ClassLoader classLoader, PriorityAccessor priorityAccessor) {
        List m30319f = m30319f(cls, iterable, classLoader, priorityAccessor);
        if (m30319f.isEmpty()) {
            return null;
        }
        return m30319f.get(0);
    }

    /* renamed from: f */
    public static List m30319f(Class cls, Iterable iterable, ClassLoader classLoader, PriorityAccessor priorityAccessor) {
        Iterable m30322c;
        if (m30321d(classLoader)) {
            m30322c = m30323b(cls, iterable);
        } else {
            m30322c = m30322c(cls, classLoader);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m30322c) {
            if (priorityAccessor.isAvailable(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new C10558a(priorityAccessor)));
        return Collections.unmodifiableList(arrayList);
    }
}
