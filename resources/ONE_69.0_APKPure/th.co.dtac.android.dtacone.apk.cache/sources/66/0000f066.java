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
    public final List f73675a = new ArrayList();

    /* renamed from: b */
    public final List f73676b = new ArrayList();

    /* renamed from: a */
    public static /* synthetic */ C20203h50 m25064a(Class cls) {
        return m25061d(cls);
    }

    /* renamed from: b */
    public static /* synthetic */ C20203h50 m25063b(Class cls) {
        return m25062c(cls);
    }

    /* renamed from: c */
    public static /* synthetic */ C20203h50 m25062c(Class cls) {
        return new C20203h50(cls.getName());
    }

    /* renamed from: d */
    public static /* synthetic */ C20203h50 m25061d(Class cls) {
        return new C20203h50(cls.getName());
    }

    public ObjectStreamClassPredicate accept(Class<?>... clsArr) {
        Stream of;
        Stream map;
        of = Stream.of((Object[]) clsArr);
        map = of.map(new Function() { // from class: YJ0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ObjectStreamClassPredicate.m25063b((Class) obj);
            }
        });
        List list = this.f73675a;
        Objects.requireNonNull(list);
        map.forEach(new ZJ0(list));
        return this;
    }

    public ObjectStreamClassPredicate reject(Class<?>... clsArr) {
        Stream of;
        Stream map;
        of = Stream.of((Object[]) clsArr);
        map = of.map(new Function() { // from class: aK0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ObjectStreamClassPredicate.m25064a((Class) obj);
            }
        });
        List list = this.f73676b;
        Objects.requireNonNull(list);
        map.forEach(new ZJ0(list));
        return this;
    }

    public ObjectStreamClassPredicate accept(ClassNameMatcher classNameMatcher) {
        this.f73675a.add(classNameMatcher);
        return this;
    }

    public ObjectStreamClassPredicate reject(ClassNameMatcher classNameMatcher) {
        this.f73676b.add(classNameMatcher);
        return this;
    }

    @Override // java.util.function.Predicate
    public boolean test(ObjectStreamClass objectStreamClass) {
        return test(objectStreamClass.getName());
    }

    public ObjectStreamClassPredicate accept(Pattern pattern) {
        this.f73675a.add(new C17988Ku1(pattern));
        return this;
    }

    public ObjectStreamClassPredicate reject(Pattern pattern) {
        this.f73676b.add(new C17988Ku1(pattern));
        return this;
    }

    public boolean test(String str) {
        for (ClassNameMatcher classNameMatcher : this.f73676b) {
            if (classNameMatcher.matches(str)) {
                return false;
            }
        }
        for (ClassNameMatcher classNameMatcher2 : this.f73675a) {
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
        map = of.map(new C19210bK0());
        List list = this.f73675a;
        Objects.requireNonNull(list);
        map.forEach(new C19383cK0(list));
        return this;
    }

    public ObjectStreamClassPredicate reject(String... strArr) {
        Stream of;
        Stream map;
        of = Stream.of((Object[]) strArr);
        map = of.map(new C19210bK0());
        List list = this.f73676b;
        Objects.requireNonNull(list);
        map.forEach(new C19383cK0(list));
        return this;
    }
}