package p000;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: JP1 */
/* loaded from: classes4.dex */
public final class JP1 {

    /* renamed from: c */
    public static final LoadingCache f3001c = CacheBuilder.newBuilder().weakKeys().build(new C0655a());

    /* renamed from: d */
    public static final LoadingCache f3002d = CacheBuilder.newBuilder().weakKeys().build(new C0656b());

    /* renamed from: a */
    public final ConcurrentMap f3003a = Maps.newConcurrentMap();

    /* renamed from: b */
    public final EventBus f3004b;

    /* renamed from: JP1$a */
    /* loaded from: classes4.dex */
    public class C0655a extends CacheLoader {
        @Override // com.google.common.cache.CacheLoader
        /* renamed from: a */
        public ImmutableList load(Class cls) {
            return JP1.m67880e(cls);
        }
    }

    /* renamed from: JP1$b */
    /* loaded from: classes4.dex */
    public class C0656b extends CacheLoader {
        @Override // com.google.common.cache.CacheLoader
        /* renamed from: a */
        public ImmutableSet load(Class cls) {
            return ImmutableSet.copyOf((Collection) TypeToken.m39732of(cls).getTypes().rawTypes());
        }
    }

    /* renamed from: JP1$c */
    /* loaded from: classes4.dex */
    public static final class C0657c {

        /* renamed from: a */
        public final String f3005a;

        /* renamed from: b */
        public final List f3006b;

        public C0657c(Method method) {
            this.f3005a = method.getName();
            this.f3006b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0657c)) {
                return false;
            }
            C0657c c0657c = (C0657c) obj;
            if (!this.f3005a.equals(c0657c.f3005a) || !this.f3006b.equals(c0657c.f3006b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.f3005a, this.f3006b);
        }
    }

    public JP1(EventBus eventBus) {
        this.f3004b = (EventBus) Preconditions.checkNotNull(eventBus);
    }

    /* renamed from: c */
    public static ImmutableSet m67882c(Class cls) {
        try {
            return (ImmutableSet) f3002d.getUnchecked(cls);
        } catch (UncheckedExecutionException e) {
            throw Throwables.propagate(e.getCause());
        }
    }

    /* renamed from: d */
    public static ImmutableList m67881d(Class cls) {
        try {
            return (ImmutableList) f3001c.getUnchecked(cls);
        } catch (UncheckedExecutionException e) {
            Throwables.throwIfUnchecked(e.getCause());
            throw e;
        }
    }

    /* renamed from: e */
    public static ImmutableList m67880e(Class cls) {
        Method[] declaredMethods;
        boolean z;
        Set<Class> rawTypes = TypeToken.m39732of(cls).getTypes().rawTypes();
        HashMap newHashMap = Maps.newHashMap();
        for (Class cls2 : rawTypes) {
            for (Method method : cls2.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkArgument(z, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", (Object) method, parameterTypes.length);
                    Preconditions.checkArgument(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), Primitives.wrap(parameterTypes[0]).getSimpleName());
                    C0657c c0657c = new C0657c(method);
                    if (!newHashMap.containsKey(c0657c)) {
                        newHashMap.put(c0657c, method);
                    }
                }
            }
        }
        return ImmutableList.copyOf(newHashMap.values());
    }

    /* renamed from: b */
    public final Multimap m67883b(Object obj) {
        HashMultimap create = HashMultimap.create();
        UnmodifiableIterator it = m67881d(obj.getClass()).iterator();
        while (it.hasNext()) {
            Method method = (Method) it.next();
            create.put(method.getParameterTypes()[0], C21646pP1.m23859c(this.f3004b, obj, method));
        }
        return create;
    }

    /* renamed from: f */
    public Iterator m67879f(Object obj) {
        ImmutableSet m67882c = m67882c(obj.getClass());
        ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(m67882c.size());
        UnmodifiableIterator it = m67882c.iterator();
        while (it.hasNext()) {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f3003a.get((Class) it.next());
            if (copyOnWriteArraySet != null) {
                newArrayListWithCapacity.add(copyOnWriteArraySet.iterator());
            }
        }
        return Iterators.concat(newArrayListWithCapacity.iterator());
    }

    /* renamed from: g */
    public void m67878g(Object obj) {
        for (Map.Entry entry : m67883b(obj).asMap().entrySet()) {
            Class cls = (Class) entry.getKey();
            Collection collection = (Collection) entry.getValue();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f3003a.get(cls);
            if (copyOnWriteArraySet == null) {
                CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
                copyOnWriteArraySet = (CopyOnWriteArraySet) MoreObjects.firstNonNull((CopyOnWriteArraySet) this.f3003a.putIfAbsent(cls, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(collection);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0016  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m67877h(java.lang.Object r5) {
        /*
            r4 = this;
            com.google.common.collect.Multimap r0 = r4.m67883b(r5)
            java.util.Map r0 = r0.asMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.concurrent.ConcurrentMap r3 = r4.f3003a
            java.lang.Object r2 = r3.get(r2)
            java.util.concurrent.CopyOnWriteArraySet r2 = (java.util.concurrent.CopyOnWriteArraySet) r2
            if (r2 == 0) goto L39
            boolean r1 = r2.removeAll(r1)
            if (r1 == 0) goto L39
            goto L10
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "missing event subscriber for an annotated method. Is "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " registered?"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.JP1.m67877h(java.lang.Object):void");
    }
}