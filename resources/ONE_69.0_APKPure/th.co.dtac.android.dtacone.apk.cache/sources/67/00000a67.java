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

/* renamed from: Ky1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17996Ky1 implements ComponentContainer {

    /* renamed from: a */
    public final Set f3461a;

    /* renamed from: b */
    public final Set f3462b;

    /* renamed from: c */
    public final Set f3463c;

    /* renamed from: d */
    public final Set f3464d;

    /* renamed from: e */
    public final Set f3465e;

    /* renamed from: f */
    public final Set f3466f;

    /* renamed from: g */
    public final ComponentContainer f3467g;

    /* renamed from: Ky1$a */
    /* loaded from: classes4.dex */
    public static class C0765a implements Publisher {

        /* renamed from: a */
        public final Set f3468a;

        /* renamed from: b */
        public final Publisher f3469b;

        public C0765a(Set set, Publisher publisher) {
            this.f3468a = set;
            this.f3469b = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void publish(Event event) {
            if (this.f3468a.contains(event.getType())) {
                this.f3469b.publish(event);
                return;
            }
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
        }
    }

    public C17996Ky1(Component component, ComponentContainer componentContainer) {
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
        this.f3461a = Collections.unmodifiableSet(hashSet);
        this.f3462b = Collections.unmodifiableSet(hashSet2);
        this.f3463c = Collections.unmodifiableSet(hashSet3);
        this.f3464d = Collections.unmodifiableSet(hashSet4);
        this.f3465e = Collections.unmodifiableSet(hashSet5);
        this.f3466f = component.getPublishedEvents();
        this.f3467g = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Class cls) {
        if (this.f3461a.contains(Qualified.unqualified(cls))) {
            Object obj = this.f3467g.get(cls);
            return !cls.equals(Publisher.class) ? obj : new C0765a(this.f3466f, (Publisher) obj);
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
        return AbstractC1473Uu.m66081f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Class cls) {
        return setOfProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Deferred getDeferred(Qualified qualified) {
        if (this.f3463c.contains(qualified)) {
            return this.f3467g.getDeferred(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Qualified qualified) {
        if (this.f3462b.contains(qualified)) {
            return this.f3467g.getProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Set setOf(Qualified qualified) {
        if (this.f3464d.contains(qualified)) {
            return this.f3467g.setOf(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Qualified qualified) {
        if (this.f3465e.contains(qualified)) {
            return this.f3467g.setOfProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Qualified qualified) {
        if (this.f3461a.contains(qualified)) {
            return this.f3467g.get(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }
}