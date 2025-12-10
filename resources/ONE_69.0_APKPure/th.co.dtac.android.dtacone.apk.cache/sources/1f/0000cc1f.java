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
    public class C10545a implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ PriorityAccessor f63463a;

        public C10545a(PriorityAccessor priorityAccessor) {
            this.f63463a = priorityAccessor;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int priority = this.f63463a.getPriority(obj) - this.f63463a.getPriority(obj2);
            if (priority != 0) {
                return priority;
            }
            return obj.getClass().getName().compareTo(obj2.getClass().getName());
        }
    }

    /* renamed from: a */
    public static Object m30664a(Class cls, Class cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(null).newInstance(null);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
        }
    }

    /* renamed from: b */
    public static Iterable m30663b(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object m30664a = m30664a(cls, (Class) it.next());
            if (m30664a != null) {
                arrayList.add(m30664a);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static Iterable m30662c(Class cls, ClassLoader classLoader) {
        ServiceLoader load = ServiceLoader.load(cls, classLoader);
        if (!load.iterator().hasNext()) {
            return ServiceLoader.load(cls);
        }
        return load;
    }

    /* renamed from: d */
    public static boolean m30661d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static Object m30660e(Class cls, Iterable iterable, ClassLoader classLoader, PriorityAccessor priorityAccessor) {
        List m30659f = m30659f(cls, iterable, classLoader, priorityAccessor);
        if (m30659f.isEmpty()) {
            return null;
        }
        return m30659f.get(0);
    }

    /* renamed from: f */
    public static List m30659f(Class cls, Iterable iterable, ClassLoader classLoader, PriorityAccessor priorityAccessor) {
        Iterable m30662c;
        if (m30661d(classLoader)) {
            m30662c = m30663b(cls, iterable);
        } else {
            m30662c = m30662c(cls, classLoader);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m30662c) {
            if (priorityAccessor.isAvailable(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new C10545a(priorityAccessor)));
        return Collections.unmodifiableList(arrayList);
    }
}