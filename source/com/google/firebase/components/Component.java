package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Component<T> {

    /* renamed from: a */
    public final String f54689a;

    /* renamed from: b */
    public final Set f54690b;

    /* renamed from: c */
    public final Set f54691c;

    /* renamed from: d */
    public final int f54692d;

    /* renamed from: e */
    public final int f54693e;

    /* renamed from: f */
    public final ComponentFactory f54694f;

    /* renamed from: g */
    public final Set f54695g;

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m39229f(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m39228g(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m39227h(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m39226i(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static <T> Component<T> intoSet(final T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(new ComponentFactory() { // from class: Mu
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m39229f;
                m39229f = Component.m39229f(t, componentContainer);
                return m39229f;
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).m39220b();
    }

    /* renamed from: j */
    public static /* synthetic */ Object m39225j(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    @Deprecated
    /* renamed from: of */
    public static <T> Component<T> m39224of(Class<T> cls, final T t) {
        return builder(cls).factory(new ComponentFactory() { // from class: Nu
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m39227h;
                m39227h = Component.m39227h(t, componentContainer);
                return m39227h;
            }
        }).build();
    }

    public Set<Dependency> getDependencies() {
        return this.f54691c;
    }

    public ComponentFactory<T> getFactory() {
        return this.f54694f;
    }

    @Nullable
    public String getName() {
        return this.f54689a;
    }

    public Set<Qualified<? super T>> getProvidedInterfaces() {
        return this.f54690b;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f54695g;
    }

    public boolean isAlwaysEager() {
        if (this.f54692d == 1) {
            return true;
        }
        return false;
    }

    public boolean isEagerInDefaultApp() {
        if (this.f54692d == 2) {
            return true;
        }
        return false;
    }

    public boolean isLazy() {
        if (this.f54692d == 0) {
            return true;
        }
        return false;
    }

    public boolean isValue() {
        if (this.f54693e == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f54690b.toArray()) + ">{" + this.f54692d + ", type=" + this.f54693e + ", deps=" + Arrays.toString(this.f54691c.toArray()) + "}";
    }

    public Component<T> withFactory(ComponentFactory<T> componentFactory) {
        return new Component<>(this.f54689a, this.f54690b, this.f54691c, this.f54692d, this.f54693e, componentFactory, this.f54695g);
    }

    /* loaded from: classes4.dex */
    public static class Builder<T> {

        /* renamed from: a */
        public String f54696a;

        /* renamed from: b */
        public final Set f54697b;

        /* renamed from: c */
        public final Set f54698c;

        /* renamed from: d */
        public int f54699d;

        /* renamed from: e */
        public int f54700e;

        /* renamed from: f */
        public ComponentFactory f54701f;

        /* renamed from: g */
        public final Set f54702g;

        @CanIgnoreReturnValue
        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            m39218d(dependency.getInterface());
            this.f54698c.add(dependency);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> alwaysEager() {
            return m39219c(1);
        }

        /* renamed from: b */
        public final Builder m39220b() {
            this.f54700e = 1;
            return this;
        }

        public Component<T> build() {
            boolean z;
            if (this.f54701f != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Missing required property: factory.");
            return new Component<>(this.f54696a, new HashSet(this.f54697b), new HashSet(this.f54698c), this.f54699d, this.f54700e, this.f54701f, this.f54702g);
        }

        /* renamed from: c */
        public final Builder m39219c(int i) {
            boolean z;
            if (this.f54699d == 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Instantiation type has already been set.");
            this.f54699d = i;
            return this;
        }

        /* renamed from: d */
        public final void m39218d(Qualified qualified) {
            Preconditions.checkArgument(!this.f54697b.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @CanIgnoreReturnValue
        public Builder<T> eagerInDefaultApp() {
            return m39219c(2);
        }

        @CanIgnoreReturnValue
        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.f54701f = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> name(@NonNull String str) {
            this.f54696a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> publishes(Class<?> cls) {
            this.f54702g.add(cls);
            return this;
        }

        public Builder(Class cls, Class... clsArr) {
            this.f54696a = null;
            HashSet hashSet = new HashSet();
            this.f54697b = hashSet;
            this.f54698c = new HashSet();
            this.f54699d = 0;
            this.f54700e = 0;
            this.f54702g = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(Qualified.unqualified(cls));
            for (Class cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
                this.f54697b.add(Qualified.unqualified(cls2));
            }
        }

        public Builder(Qualified qualified, Qualified... qualifiedArr) {
            this.f54696a = null;
            HashSet hashSet = new HashSet();
            this.f54697b = hashSet;
            this.f54698c = new HashSet();
            this.f54699d = 0;
            this.f54700e = 0;
            this.f54702g = new HashSet();
            Preconditions.checkNotNull(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified qualified2 : qualifiedArr) {
                Preconditions.checkNotNull(qualified2, "Null interface");
            }
            Collections.addAll(this.f54697b, qualifiedArr);
        }
    }

    public Component(String str, Set set, Set set2, int i, int i2, ComponentFactory componentFactory, Set set3) {
        this.f54689a = str;
        this.f54690b = Collections.unmodifiableSet(set);
        this.f54691c = Collections.unmodifiableSet(set2);
        this.f54692d = i;
        this.f54693e = i2;
        this.f54694f = componentFactory;
        this.f54695g = Collections.unmodifiableSet(set3);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    public static <T> Component<T> intoSet(final T t, Qualified<T> qualified) {
        return intoSetBuilder(qualified).factory(new ComponentFactory() { // from class: Lu
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m39228g;
                m39228g = Component.m39228g(t, componentContainer);
                return m39228g;
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Qualified<T> qualified) {
        return builder(qualified).m39220b();
    }

    @SafeVarargs
    /* renamed from: of */
    public static <T> Component<T> m39222of(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new ComponentFactory() { // from class: Ou
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m39226i;
                m39226i = Component.m39226i(t, componentContainer);
                return m39226i;
            }
        }).build();
    }

    public static <T> Builder<T> builder(Qualified<T> qualified) {
        return new Builder<>(qualified, new Qualified[0]);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <T> Component<T> m39223of(final T t, Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return builder(qualified, qualifiedArr).factory(new ComponentFactory() { // from class: Ku
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Object m39225j;
                m39225j = Component.m39225j(t, componentContainer);
                return m39225j;
            }
        }).build();
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return new Builder<>(qualified, qualifiedArr);
    }
}
