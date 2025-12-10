package com.google.firebase.components;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.components.ComponentRegistrar;
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
    public static final Provider f54718i = new Provider() { // from class: bv
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    public final Map f54719a;

    /* renamed from: b */
    public final Map f54720b;

    /* renamed from: c */
    public final Map f54721c;

    /* renamed from: d */
    public final List f54722d;

    /* renamed from: e */
    public Set f54723e;

    /* renamed from: f */
    public final C1292SS f54724f;

    /* renamed from: g */
    public final AtomicReference f54725g;

    /* renamed from: h */
    public final ComponentRegistrarProcessor f54726h;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final Executor f54727a;

        /* renamed from: b */
        public final List f54728b = new ArrayList();

        /* renamed from: c */
        public final List f54729c = new ArrayList();

        /* renamed from: d */
        public ComponentRegistrarProcessor f54730d = ComponentRegistrarProcessor.NOOP;

        public Builder(Executor executor) {
            this.f54727a = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ ComponentRegistrar m39187a(ComponentRegistrar componentRegistrar) {
            return m39186b(componentRegistrar);
        }

        /* renamed from: b */
        public static /* synthetic */ ComponentRegistrar m39186b(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @CanIgnoreReturnValue
        public Builder addComponent(Component<?> component) {
            this.f54729c.add(component);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addComponentRegistrar(final ComponentRegistrar componentRegistrar) {
            this.f54728b.add(new Provider() { // from class: fv
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.Builder.m39187a(ComponentRegistrar.this);
                }
            });
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
            this.f54728b.addAll(collection);
            return this;
        }

        public ComponentRuntime build() {
            return new ComponentRuntime(this.f54727a, this.f54728b, this.f54729c, this.f54730d);
        }

        @CanIgnoreReturnValue
        public Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.f54730d = componentRegistrarProcessor;
            return this;
        }
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    /* renamed from: c */
    public static /* synthetic */ ComponentRegistrar m39201c(ComponentRegistrar componentRegistrar) {
        return m39193k(componentRegistrar);
    }

    /* renamed from: d */
    public static /* synthetic */ void m39200d(C17698Gi0 c17698Gi0, Provider provider) {
        c17698Gi0.m68252a(provider);
    }

    /* renamed from: g */
    public static List m39197g(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: k */
    public static /* synthetic */ ComponentRegistrar m39193k(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    /* renamed from: p */
    public static Iterable m39188p(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            final ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next();
            arrayList.add(new Provider() { // from class: av
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentRuntime.m39201c(ComponentRegistrar.this);
                }
            });
        }
        return arrayList;
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            try {
                if (this.f54722d.isEmpty()) {
                    return;
                }
                m39199e(new ArrayList());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m39199e(List list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f54722d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f54726h.processRegistrar(componentRegistrar));
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
                            if (this.f54723e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f54723e.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f54719a.isEmpty()) {
                AbstractC17033xB.m600a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f54719a.keySet());
                arrayList2.addAll(list);
                AbstractC17033xB.m600a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final Component component = (Component) it3.next();
                this.f54719a.put(component, new Lazy(new Provider() { // from class: cv
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        Object m39196h;
                        m39196h = ComponentRuntime.this.m39196h(component);
                        return m39196h;
                    }
                }));
            }
            arrayList.addAll(m39190n(list));
            arrayList.addAll(m39189o());
            m39191m();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        m39192l();
    }

    /* renamed from: f */
    public final void m39198f(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            if (component.isAlwaysEager() || (component.isEagerInDefaultApp() && z)) {
                provider.get();
            }
        }
        this.f54724f.m66498b();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Qualified qualified) {
        return AbstractC1473Uu.m66086a(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Deferred getDeferred(Class cls) {
        return AbstractC1473Uu.m66084c(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Provider getProvider(Class cls) {
        return AbstractC1473Uu.m66083d(this, cls);
    }

    /* renamed from: h */
    public final /* synthetic */ Object m39196h(Component component) {
        return component.getFactory().create(new C17996Ky1(component, this));
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public void initializeAllComponentsForTests() {
        for (Provider provider : this.f54719a.values()) {
            provider.get();
        }
    }

    public void initializeEagerComponents(boolean z) {
        HashMap hashMap;
        if (!AbstractC23094xo1.m479a(this.f54725g, null, Boolean.valueOf(z))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f54719a);
        }
        m39198f(hashMap, z);
    }

    /* renamed from: l */
    public final void m39192l() {
        Boolean bool = (Boolean) this.f54725g.get();
        if (bool != null) {
            m39198f(this.f54719a, bool.booleanValue());
        }
    }

    /* renamed from: m */
    public final void m39191m() {
        for (Component component : this.f54719a.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.f54721c.containsKey(dependency.getInterface())) {
                    this.f54721c.put(dependency.getInterface(), C17698Gi0.m68251b(Collections.emptySet()));
                } else if (this.f54720b.containsKey(dependency.getInterface())) {
                    continue;
                } else if (!dependency.isRequired()) {
                    if (!dependency.isSet()) {
                        this.f54720b.put(dependency.getInterface(), C19267bh1.m51893d());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                }
            }
        }
    }

    /* renamed from: n */
    public final List m39190n(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.isValue()) {
                final Provider provider = (Provider) this.f54719a.get(component);
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (!this.f54720b.containsKey(qualified)) {
                        this.f54720b.put(qualified, provider);
                    } else {
                        final C19267bh1 c19267bh1 = (C19267bh1) ((Provider) this.f54720b.get(qualified));
                        arrayList.add(new Runnable() { // from class: dv
                            @Override // java.lang.Runnable
                            public final void run() {
                                C19267bh1.this.m51888i(provider);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final List m39189o() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f54719a.entrySet()) {
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
            if (!this.f54721c.containsKey(entry2.getKey())) {
                this.f54721c.put((Qualified) entry2.getKey(), C17698Gi0.m68251b((Collection) entry2.getValue()));
            } else {
                final C17698Gi0 c17698Gi0 = (C17698Gi0) this.f54721c.get(entry2.getKey());
                for (final Provider provider2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: ev
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentRuntime.m39200d(C17698Gi0.this, provider2);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Qualified qualified) {
        return AbstractC1473Uu.m66082e(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Provider setOfProvider(Class cls) {
        return AbstractC1473Uu.m66080g(this, cls);
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this(executor, m39188p(iterable), Arrays.asList(componentArr), ComponentRegistrarProcessor.NOOP);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Class cls) {
        return AbstractC1473Uu.m66085b(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        Provider<T> provider = getProvider(qualified);
        if (provider == null) {
            return C19267bh1.m51893d();
        }
        if (provider instanceof C19267bh1) {
            return (C19267bh1) provider;
        }
        return C19267bh1.m51889h(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<T> getProvider(Qualified<T> qualified) {
        Preconditions.checkNotNull(qualified, "Null interface requested.");
        return (Provider) this.f54720b.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Class cls) {
        return AbstractC1473Uu.m66081f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        C17698Gi0 c17698Gi0 = (C17698Gi0) this.f54721c.get(qualified);
        if (c17698Gi0 != null) {
            return c17698Gi0;
        }
        return f54718i;
    }

    public ComponentRuntime(Executor executor, Iterable iterable, Collection collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.f54719a = new HashMap();
        this.f54720b = new HashMap();
        this.f54721c = new HashMap();
        this.f54723e = new HashSet();
        this.f54725g = new AtomicReference();
        C1292SS c1292ss = new C1292SS(executor);
        this.f54724f = c1292ss;
        this.f54726h = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.m39214of(c1292ss, C1292SS.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.m39214of(this, ComponentLoader.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.f54722d = m39197g(iterable);
        m39199e(arrayList);
    }
}