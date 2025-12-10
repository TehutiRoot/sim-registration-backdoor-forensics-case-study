package com.google.firebase.components;

/* loaded from: classes4.dex */
public final class Dependency {

    /* renamed from: a */
    public final Qualified f54731a;

    /* renamed from: b */
    public final int f54732b;

    /* renamed from: c */
    public final int f54733c;

    public Dependency(Class cls, int i, int i2) {
        this(Qualified.unqualified(cls), i, i2);
    }

    /* renamed from: a */
    public static String m39185a(int i) {
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
        if (!this.f54731a.equals(dependency.f54731a) || this.f54732b != dependency.f54732b || this.f54733c != dependency.f54733c) {
            return false;
        }
        return true;
    }

    public Qualified<?> getInterface() {
        return this.f54731a;
    }

    public int hashCode() {
        return ((((this.f54731a.hashCode() ^ 1000003) * 1000003) ^ this.f54732b) * 1000003) ^ this.f54733c;
    }

    public boolean isDeferred() {
        if (this.f54733c == 2) {
            return true;
        }
        return false;
    }

    public boolean isDirectInjection() {
        if (this.f54733c == 0) {
            return true;
        }
        return false;
    }

    public boolean isRequired() {
        if (this.f54732b == 1) {
            return true;
        }
        return false;
    }

    public boolean isSet() {
        if (this.f54732b == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f54731a);
        sb.append(", type=");
        int i = this.f54732b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(m39185a(this.f54733c));
        sb.append("}");
        return sb.toString();
    }

    public Dependency(Qualified qualified, int i, int i2) {
        this.f54731a = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.f54732b = i;
        this.f54733c = i2;
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