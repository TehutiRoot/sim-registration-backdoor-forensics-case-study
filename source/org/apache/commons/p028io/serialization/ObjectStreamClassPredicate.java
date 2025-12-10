package org.apache.commons.p028io.serialization;

import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.apache.commons.p028io.serialization.ObjectStreamClassPredicate;

/* renamed from: org.apache.commons.io.serialization.ObjectStreamClassPredicate */
/* loaded from: classes6.dex */
public class ObjectStreamClassPredicate implements Predicate<ObjectStreamClass> {

    /* renamed from: a */
    public final List f73591a = new ArrayList();

    /* renamed from: b */
    public final List f73592b = new ArrayList();

    /* renamed from: a */
    public static /* synthetic */ C19462d50 m24874a(Class cls) {
        return m24871d(cls);
    }

    /* renamed from: b */
    public static /* synthetic */ C19462d50 m24873b(Class cls) {
        return m24872c(cls);
    }

    /* renamed from: c */
    public static /* synthetic */ C19462d50 m24872c(Class cls) {
        return new C19462d50(cls.getName());
    }

    /* renamed from: d */
    public static /* synthetic */ C19462d50 m24871d(Class cls) {
        return new C19462d50(cls.getName());
    }

    public ObjectStreamClassPredicate accept(Class<?>... clsArr) {
        Stream of;
        Stream map;
        of = Stream.of((Object[]) clsArr);
        map = of.map(new Function() { // from class: SJ0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ObjectStreamClassPredicate.m24873b((Class) obj);
            }
        });
        List list = this.f73591a;
        Objects.requireNonNull(list);
        map.forEach(new TJ0(list));
        return this;
    }

    public ObjectStreamClassPredicate reject(Class<?>... clsArr) {
        Stream of;
        Stream map;
        of = Stream.of((Object[]) clsArr);
        map = of.map(new Function() { // from class: UJ0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ObjectStreamClassPredicate.m24874a((Class) obj);
            }
        });
        List list = this.f73592b;
        Objects.requireNonNull(list);
        map.forEach(new TJ0(list));
        return this;
    }

    public ObjectStreamClassPredicate accept(ClassNameMatcher classNameMatcher) {
        this.f73591a.add(classNameMatcher);
        return this;
    }

    public ObjectStreamClassPredicate reject(ClassNameMatcher classNameMatcher) {
        this.f73592b.add(classNameMatcher);
        return this;
    }

    @Override // java.util.function.Predicate
    public boolean test(ObjectStreamClass objectStreamClass) {
        return test(objectStreamClass.getName());
    }

    public ObjectStreamClassPredicate accept(Pattern pattern) {
        this.f73591a.add(new C18144Nt1(pattern));
        return this;
    }

    public ObjectStreamClassPredicate reject(Pattern pattern) {
        this.f73592b.add(new C18144Nt1(pattern));
        return this;
    }

    public boolean test(String str) {
        for (ClassNameMatcher classNameMatcher : this.f73592b) {
            if (classNameMatcher.matches(str)) {
                return false;
            }
        }
        for (ClassNameMatcher classNameMatcher2 : this.f73591a) {
            if (classNameMatcher2.matches(str)) {
                return true;
            }
        }
        return false;
    }

    public ObjectStreamClassPredicate accept(String... strArr) {
        Stream of;
        Stream map;
        of = Stream.of((Object[]) strArr);
        map = of.map(new VJ0());
        List list = this.f73591a;
        Objects.requireNonNull(list);
        map.forEach(new WJ0(list));
        return this;
    }

    public ObjectStreamClassPredicate reject(String... strArr) {
        Stream of;
        Stream map;
        of = Stream.of((Object[]) strArr);
        map = of.map(new VJ0());
        List list = this.f73592b;
        Objects.requireNonNull(list);
        map.forEach(new WJ0(list));
        return this;
    }
}
