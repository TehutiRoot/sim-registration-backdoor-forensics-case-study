package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class FqName {
    public static final FqName ROOT = new FqName("");

    /* renamed from: a */
    public final FqNameUnsafe f69629a;

    /* renamed from: b */
    public transient FqName f69630b;

    public FqName(@NotNull String str) {
        if (str == null) {
            m28312a(1);
        }
        this.f69629a = new FqNameUnsafe(str, this);
    }

    /* renamed from: a */
    public static /* synthetic */ void m28312a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @NotNull
    public static FqName topLevel(@NotNull Name name) {
        if (name == null) {
            m28312a(13);
        }
        return new FqName(FqNameUnsafe.topLevel(name));
    }

    @NotNull
    public String asString() {
        String asString = this.f69629a.asString();
        if (asString == null) {
            m28312a(4);
        }
        return asString;
    }

    @NotNull
    public FqName child(@NotNull Name name) {
        if (name == null) {
            m28312a(8);
        }
        return new FqName(this.f69629a.child(name), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FqName) && this.f69629a.equals(((FqName) obj).f69629a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f69629a.hashCode();
    }

    public boolean isRoot() {
        return this.f69629a.isRoot();
    }

    @NotNull
    public FqName parent() {
        FqName fqName = this.f69630b;
        if (fqName != null) {
            if (fqName == null) {
                m28312a(6);
            }
            return fqName;
        } else if (!isRoot()) {
            FqName fqName2 = new FqName(this.f69629a.parent());
            this.f69630b = fqName2;
            return fqName2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    @NotNull
    public List<Name> pathSegments() {
        List<Name> pathSegments = this.f69629a.pathSegments();
        if (pathSegments == null) {
            m28312a(11);
        }
        return pathSegments;
    }

    @NotNull
    public Name shortName() {
        Name shortName = this.f69629a.shortName();
        if (shortName == null) {
            m28312a(9);
        }
        return shortName;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        Name shortNameOrSpecial = this.f69629a.shortNameOrSpecial();
        if (shortNameOrSpecial == null) {
            m28312a(10);
        }
        return shortNameOrSpecial;
    }

    public boolean startsWith(@NotNull Name name) {
        if (name == null) {
            m28312a(12);
        }
        return this.f69629a.startsWith(name);
    }

    public String toString() {
        return this.f69629a.toString();
    }

    @NotNull
    public FqNameUnsafe toUnsafe() {
        FqNameUnsafe fqNameUnsafe = this.f69629a;
        if (fqNameUnsafe == null) {
            m28312a(5);
        }
        return fqNameUnsafe;
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            m28312a(2);
        }
        this.f69629a = fqNameUnsafe;
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        if (fqNameUnsafe == null) {
            m28312a(3);
        }
        this.f69629a = fqNameUnsafe;
        this.f69630b = fqName;
    }
}