package com.google.firebase.components;

/* loaded from: classes4.dex */
public final class Dependency {

    /* renamed from: a */
    public final Qualified f54719a;

    /* renamed from: b */
    public final int f54720b;

    /* renamed from: c */
    public final int f54721c;

    public Dependency(Class cls, int i, int i2) {
        this(Qualified.unqualified(cls), i, i2);
    }

    /* renamed from: a */
    public static String m39193a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    public static Dependency deferred(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        if (!this.f54719a.equals(dependency.f54719a) || this.f54720b != dependency.f54720b || this.f54721c != dependency.f54721c) {
            return false;
        }
        return true;
    }

    public Qualified<?> getInterface() {
        return this.f54719a;
    }

    public int hashCode() {
        return ((((this.f54719a.hashCode() ^ 1000003) * 1000003) ^ this.f54720b) * 1000003) ^ this.f54721c;
    }

    public boolean isDeferred() {
        if (this.f54721c == 2) {
            return true;
        }
        return false;
    }

    public boolean isDirectInjection() {
        if (this.f54721c == 0) {
            return true;
        }
        return false;
    }

    public boolean isRequired() {
        if (this.f54720b == 1) {
            return true;
        }
        return false;
    }

    public boolean isSet() {
        if (this.f54720b == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f54719a);
        sb.append(", type=");
        int i = this.f54720b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m39193a(this.f54721c));
        sb.append("}");
        return sb.toString();
    }

    public Dependency(Qualified qualified, int i, int i2) {
        this.f54719a = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.f54720b = i;
        this.f54721c = i2;
    }

    public static Dependency deferred(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 2);
    }

    public static Dependency optionalProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 1);
    }

    public static Dependency required(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency requiredProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency setOf(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 0);
    }

    public static Dependency setOfProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 1);
    }
}
