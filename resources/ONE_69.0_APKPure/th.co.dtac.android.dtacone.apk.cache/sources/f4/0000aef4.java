package com.google.firebase.components;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public final class Qualified<T> {

    /* renamed from: a */
    public final Class f54737a;

    /* renamed from: b */
    public final Class f54738b;

    /* renamed from: com.google.firebase.components.Qualified$a */
    /* loaded from: classes4.dex */
    public @interface InterfaceC8335a {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f54737a = cls;
        this.f54738b = cls2;
    }

    @NonNull
    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    @NonNull
    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(InterfaceC8335a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (!this.f54738b.equals(qualified.f54738b)) {
            return false;
        }
        return this.f54737a.equals(qualified.f54737a);
    }

    public int hashCode() {
        return (this.f54738b.hashCode() * 31) + this.f54737a.hashCode();
    }

    public String toString() {
        if (this.f54737a == InterfaceC8335a.class) {
            return this.f54738b.getName();
        }
        return "@" + this.f54737a.getName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f54738b.getName();
    }
}