package com.google.firebase.components;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public final class Qualified<T> {

    /* renamed from: a */
    public final Class f54725a;

    /* renamed from: b */
    public final Class f54726b;

    /* renamed from: com.google.firebase.components.Qualified$a */
    /* loaded from: classes4.dex */
    public @interface InterfaceC8346a {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f54725a = cls;
        this.f54726b = cls2;
    }

    @NonNull
    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    @NonNull
    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(InterfaceC8346a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (!this.f54726b.equals(qualified.f54726b)) {
            return false;
        }
        return this.f54725a.equals(qualified.f54725a);
    }

    public int hashCode() {
        return (this.f54726b.hashCode() * 31) + this.f54725a.hashCode();
    }

    public String toString() {
        if (this.f54725a == InterfaceC8346a.class) {
            return this.f54726b.getName();
        }
        return "@" + this.f54725a.getName() + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f54726b.getName();
    }
}
