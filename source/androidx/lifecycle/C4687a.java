package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes2.dex */
public final class C4687a {

    /* renamed from: c */
    public static C4687a f35892c = new C4687a();

    /* renamed from: a */
    public final Map f35893a = new HashMap();

    /* renamed from: b */
    public final Map f35894b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes2.dex */
    public static class C4688a {

        /* renamed from: a */
        public final Map f35895a = new HashMap();

        /* renamed from: b */
        public final Map f35896b;

        public C4688a(Map map) {
            this.f35896b = map;
            for (Map.Entry entry : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.f35895a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f35895a.put(event, list);
                }
                list.add((C4689b) entry.getKey());
            }
        }

        /* renamed from: b */
        public static void m54084b(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C4689b) list.get(size)).m54083a(lifecycleOwner, event, obj);
                }
            }
        }

        /* renamed from: a */
        public void m54085a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            m54084b((List) this.f35895a.get(event), lifecycleOwner, event, obj);
            m54084b((List) this.f35895a.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes2.dex */
    public static final class C4689b {

        /* renamed from: a */
        public final int f35897a;

        /* renamed from: b */
        public final Method f35898b;

        public C4689b(int i, Method method) {
            this.f35897a = i;
            this.f35898b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void m54083a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            try {
                int i = this.f35897a;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            this.f35898b.invoke(obj, lifecycleOwner, event);
                            return;
                        }
                        return;
                    }
                    this.f35898b.invoke(obj, lifecycleOwner);
                    return;
                }
                this.f35898b.invoke(obj, null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4689b)) {
                return false;
            }
            C4689b c4689b = (C4689b) obj;
            if (this.f35897a == c4689b.f35897a && this.f35898b.getName().equals(c4689b.f35898b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f35897a * 31) + this.f35898b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final C4688a m54090a(Class cls, Method[] methodArr) {
        int i;
        C4688a m54088c;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m54088c = m54088c(superclass)) != null) {
            hashMap.putAll(m54088c.f35896b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m54088c(cls2).f35896b.entrySet()) {
                m54086e(hashMap, (C4689b) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m54089b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == Lifecycle.Event.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m54086e(hashMap, new C4689b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C4688a c4688a = new C4688a(hashMap);
        this.f35893a.put(cls, c4688a);
        this.f35894b.put(cls, Boolean.valueOf(z));
        return c4688a;
    }

    /* renamed from: b */
    public final Method[] m54089b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public C4688a m54088c(Class cls) {
        C4688a c4688a = (C4688a) this.f35893a.get(cls);
        if (c4688a != null) {
            return c4688a;
        }
        return m54090a(cls, null);
    }

    /* renamed from: d */
    public boolean m54087d(Class cls) {
        Boolean bool = (Boolean) this.f35894b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m54089b = m54089b(cls);
        for (Method method : m54089b) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                m54090a(cls, m54089b);
                return true;
            }
        }
        this.f35894b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void m54086e(Map map, C4689b c4689b, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) map.get(c4689b);
        if (event2 != null && event != event2) {
            Method method = c4689b.f35898b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(c4689b, event);
        }
    }
}
