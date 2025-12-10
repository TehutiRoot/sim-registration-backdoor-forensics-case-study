package com.google.firebase.components;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {

    /* renamed from: i */
    public static final Provider f54706i = new Provider() { // from class: bv
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    public final Map f54707a;

    /* renamed from: b */
    public final Map f54708b;

    /* renamed from: c */
    public final Map f54709c;

    /* renamed from: d */
    public final List f54710d;

    /* renamed from: e */
    public Set f54711e;

    /* renamed from: f */
    public final C1014OS f54712f;

    /* renamed from: g */
    public final AtomicReference f54713g;

    /* renamed from: h */
    public final ComponentRegistrarProcessor f54714h;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Executor f54715a;

        /* renamed from: b */
        public final List f54716b = new ArrayList();

        /* renamed from: c */
        public final List f54717c = new ArrayList();

        /* renamed from: d */
        public ComponentRegistrarProcessor f54718d = ComponentRegistrarProcessor.NOOP;

        public Builder(Executor executor) {
            this.f54715a = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ ComponentRegistrar m39195a(ComponentRegistrar componentRegistrar) {
            return m39194b(componentRegistrar);
        }

        /* renamed from: b */
        public static /* synthetic */ ComponentRegistrar m39194b(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @CanIgnoreReturnValue
        public Builder addComponent(Component<?> component) {
            this.f54717c.add(component);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addComponentRegistrar(final ComponentRegistrar componentRegistrar) {
            this.f54716b.add(new Provider() { // from class: fv
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.Builder.m39195a(componentRegistrar);
                }
            });
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
            this.f54716b.addAll(collection);
            return this;
        }

        public ComponentRuntime build() {
            return new ComponentRuntime(this.f54715a, this.f54716b, this.f54717c, this.f54718d);
        }

        @CanIgnoreReturnValue
        public Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.f54718d = componentRegistrarProcessor;
            return this;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m39210b(C19732eg1 c19732eg1, Provider provider) {
        c19732eg1.m31504i(provider);
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    /* renamed from: c */
    public static /* synthetic */ ComponentRegistrar m39209c(ComponentRegistrar componentRegistrar) {
        return m39201k(componentRegistrar);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39208d(C17285Ai0 c17285Ai0, Provider provider) {
        c17285Ai0.m69059a(provider);
    }

    /* renamed from: g */
    public static List m39205g(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: k */
    public static /* synthetic */ ComponentRegistrar m39201k(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    /* renamed from: p */
    public static Iterable m39196p(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            final ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next();
            arrayList.add(new Provider() { // from class: av
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.m39209c(componentRegistrar);
                }
            });
        }
        return arrayList;
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            try {
                if (this.f54710d.isEmpty()) {
                    return;
                }
                m39207e(new ArrayList());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m39207e(List list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f54710d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f54714h.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((Component) it2.next()).getProvidedInterfaces().toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f54711e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f54711e.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f54707a.isEmpty()) {
                AbstractC17028xB.m605a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f54707a.keySet());
                arrayList2.addAll(list);
                AbstractC17028xB.m605a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final Component component = (Component) it3.next();
                this.f54707a.put(component, new Lazy(new Provider() { // from class: cv
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        Object m39204h;
                        m39204h = ComponentRuntime.this.m39204h(component);
                        return m39204h;
                    }
                }));
            }
            arrayList.addAll(m39198n(list));
            arrayList.addAll(m39197o());
            m39199m();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m39200l();
    }

    /* renamed from: f */
    public final void m39206f(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            if (component.isAlwaysEager() || (component.isEagerInDefaultApp() && z)) {
                provider.get();
            }
        }
        this.f54712f.m67042b();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Qualified qualified) {
        return AbstractC1494Uu.m65966a(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Deferred getDeferred(Class cls) {
        return AbstractC1494Uu.m65964c(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Provider getProvider(Class cls) {
        return AbstractC1494Uu.m65963d(this, cls);
    }

    /* renamed from: h */
    public final /* synthetic */ Object m39204h(Component component) {
        return component.getFactory().create(new C18152Nx1(component, this));
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public void initializeAllComponentsForTests() {
        for (Provider provider : this.f54707a.values()) {
            provider.get();
        }
    }

    public void initializeEagerComponents(boolean z) {
        HashMap hashMap;
        if (!AbstractC17300An1.m69050a(this.f54713g, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f54707a);
        }
        m39206f(hashMap, z);
    }

    /* renamed from: l */
    public final void m39200l() {
        Boolean bool = (Boolean) this.f54713g.get();
        if (bool != null) {
            m39206f(this.f54707a, bool.booleanValue());
        }
    }

    /* renamed from: m */
    public final void m39199m() {
        for (Component component : this.f54707a.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.f54709c.containsKey(dependency.getInterface())) {
                    this.f54709c.put(dependency.getInterface(), C17285Ai0.m69058b(Collections.emptySet()));
                } else if (this.f54708b.containsKey(dependency.getInterface())) {
                    continue;
                } else if (!dependency.isRequired()) {
                    if (!dependency.isSet()) {
                        this.f54708b.put(dependency.getInterface(), C19732eg1.m31509d());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                }
            }
        }
    }

    /* renamed from: n */
    public final List m39198n(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.isValue()) {
                final Provider provider = (Provider) this.f54707a.get(component);
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (!this.f54708b.containsKey(qualified)) {
                        this.f54708b.put(qualified, provider);
                    } else {
                        final C19732eg1 c19732eg1 = (C19732eg1) ((Provider) this.f54708b.get(qualified));
                        arrayList.add(new Runnable() { // from class: dv
                            @Override // java.lang.Runnable
                            public final void run() {
                                ComponentRuntime.m39210b(C19732eg1.this, provider);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final List m39197o() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f54707a.entrySet()) {
            Component component = (Component) entry.getKey();
            if (!component.isValue()) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (!hashMap.containsKey(qualified)) {
                        hashMap.put(qualified, new HashSet());
                    }
                    ((Set) hashMap.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f54709c.containsKey(entry2.getKey())) {
                this.f54709c.put((Qualified) entry2.getKey(), C17285Ai0.m69058b((Collection) entry2.getValue()));
            } else {
                final C17285Ai0 c17285Ai0 = (C17285Ai0) this.f54709c.get(entry2.getKey());
                for (final Provider provider2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: ev
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentRuntime.m39208d(c17285Ai0, provider2);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Qualified qualified) {
        return AbstractC1494Uu.m65962e(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Provider setOfProvider(Class cls) {
        return AbstractC1494Uu.m65960g(this, cls);
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, m39196p(iterable), Arrays.asList(componentArr), ComponentRegistrarProcessor.NOOP);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Class cls) {
        return AbstractC1494Uu.m65965b(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        Provider<T> provider = getProvider(qualified);
        if (provider == null) {
            return C19732eg1.m31509d();
        }
        if (provider instanceof C19732eg1) {
            return (C19732eg1) provider;
        }
        return C19732eg1.m31505h(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<T> getProvider(Qualified<T> qualified) {
        Preconditions.checkNotNull(qualified, "Null interface requested.");
        return (Provider) this.f54708b.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Class cls) {
        return AbstractC1494Uu.m65961f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        C17285Ai0 c17285Ai0 = (C17285Ai0) this.f54709c.get(qualified);
        if (c17285Ai0 != null) {
            return c17285Ai0;
        }
        return f54706i;
    }

    public ComponentRuntime(Executor executor, Iterable iterable, Collection collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.f54707a = new HashMap();
        this.f54708b = new HashMap();
        this.f54709c = new HashMap();
        this.f54711e = new HashSet();
        this.f54713g = new AtomicReference();
        C1014OS c1014os = new C1014OS(executor);
        this.f54712f = c1014os;
        this.f54714h = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.m39222of(c1014os, C1014OS.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.m39222of(this, ComponentLoader.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.f54710d = m39205g(iterable);
        m39207e(arrayList);
    }
}
