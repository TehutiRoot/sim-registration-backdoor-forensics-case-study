package p000;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyException;
import com.google.firebase.components.Qualified;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Nx1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18152Nx1 implements ComponentContainer {

    /* renamed from: a */
    public final Set f4245a;

    /* renamed from: b */
    public final Set f4246b;

    /* renamed from: c */
    public final Set f4247c;

    /* renamed from: d */
    public final Set f4248d;

    /* renamed from: e */
    public final Set f4249e;

    /* renamed from: f */
    public final Set f4250f;

    /* renamed from: g */
    public final ComponentContainer f4251g;

    /* renamed from: Nx1$a */
    /* loaded from: classes4.dex */
    public static class C0980a implements Publisher {

        /* renamed from: a */
        public final Set f4252a;

        /* renamed from: b */
        public final Publisher f4253b;

        public C0980a(Set set, Publisher publisher) {
            this.f4252a = set;
            this.f4253b = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void publish(Event event) {
            if (this.f4252a.contains(event.getType())) {
                this.f4253b.publish(event);
                return;
            }
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
        }
    }

    public C18152Nx1(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet4.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else if (dependency.isSet()) {
                hashSet5.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Qualified.unqualified(Publisher.class));
        }
        this.f4245a = Collections.unmodifiableSet(hashSet);
        this.f4246b = Collections.unmodifiableSet(hashSet2);
        this.f4247c = Collections.unmodifiableSet(hashSet3);
        this.f4248d = Collections.unmodifiableSet(hashSet4);
        this.f4249e = Collections.unmodifiableSet(hashSet5);
        this.f4250f = component.getPublishedEvents();
        this.f4251g = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Class cls) {
        if (this.f4245a.contains(Qualified.unqualified(cls))) {
            Object obj = this.f4251g.get(cls);
            return !cls.equals(Publisher.class) ? obj : new C0980a(this.f4250f, (Publisher) obj);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Deferred getDeferred(Class cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Class cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Class cls) {
        return AbstractC1494Uu.m65961f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Class cls) {
        return setOfProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Deferred getDeferred(Qualified qualified) {
        if (this.f4247c.contains(qualified)) {
            return this.f4251g.getDeferred(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Qualified qualified) {
        if (this.f4246b.contains(qualified)) {
            return this.f4251g.getProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Set setOf(Qualified qualified) {
        if (this.f4248d.contains(qualified)) {
            return this.f4251g.setOf(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Qualified qualified) {
        if (this.f4249e.contains(qualified)) {
            return this.f4251g.setOfProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Qualified qualified) {
        if (this.f4245a.contains(qualified)) {
            return this.f4251g.get(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }
}
