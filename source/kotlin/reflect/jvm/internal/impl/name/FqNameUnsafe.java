package kotlin.reflect.jvm.internal.impl.name;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class FqNameUnsafe {

    /* renamed from: e */
    public static final Name f69597e = Name.special("<root>");

    /* renamed from: f */
    public static final Pattern f69598f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final Function1 f69599g = new C11900a();

    /* renamed from: a */
    public final String f69600a;

    /* renamed from: b */
    public transient FqName f69601b;

    /* renamed from: c */
    public transient FqNameUnsafe f69602c;

    /* renamed from: d */
    public transient Name f69603d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe$a */
    /* loaded from: classes6.dex */
    public static class C11900a implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public Name invoke(String str) {
            return Name.guessByFirstCharacter(str);
        }
    }

    public FqNameUnsafe(String str, FqName fqName) {
        if (str == null) {
            m28019a(0);
        }
        if (fqName == null) {
            m28019a(1);
        }
        this.f69600a = str;
        this.f69601b = fqName;
    }

    /* renamed from: a */
    public static /* synthetic */ void m28019a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @NotNull
    public static FqNameUnsafe topLevel(@NotNull Name name) {
        if (name == null) {
            m28019a(16);
        }
        return new FqNameUnsafe(name.asString(), FqName.ROOT.toUnsafe(), name);
    }

    @NotNull
    public String asString() {
        String str = this.f69600a;
        if (str == null) {
            m28019a(4);
        }
        return str;
    }

    /* renamed from: b */
    public final void m28018b() {
        int lastIndexOf = this.f69600a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f69603d = Name.guessByFirstCharacter(this.f69600a.substring(lastIndexOf + 1));
            this.f69602c = new FqNameUnsafe(this.f69600a.substring(0, lastIndexOf));
            return;
        }
        this.f69603d = Name.guessByFirstCharacter(this.f69600a);
        this.f69602c = FqName.ROOT.toUnsafe();
    }

    @NotNull
    public FqNameUnsafe child(@NotNull Name name) {
        String str;
        if (name == null) {
            m28019a(9);
        }
        if (isRoot()) {
            str = name.asString();
        } else {
            str = this.f69600a + "." + name.asString();
        }
        return new FqNameUnsafe(str, this, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FqNameUnsafe) && this.f69600a.equals(((FqNameUnsafe) obj).f69600a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f69600a.hashCode();
    }

    public boolean isRoot() {
        return this.f69600a.isEmpty();
    }

    public boolean isSafe() {
        if (this.f69601b == null && asString().indexOf(60) >= 0) {
            return false;
        }
        return true;
    }

    @NotNull
    public FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.f69602c;
        if (fqNameUnsafe != null) {
            if (fqNameUnsafe == null) {
                m28019a(7);
            }
            return fqNameUnsafe;
        } else if (!isRoot()) {
            m28018b();
            FqNameUnsafe fqNameUnsafe2 = this.f69602c;
            if (fqNameUnsafe2 == null) {
                m28019a(8);
            }
            return fqNameUnsafe2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    @NotNull
    public List<Name> pathSegments() {
        List<Name> map;
        if (isRoot()) {
            map = Collections.emptyList();
        } else {
            map = ArraysKt___ArraysKt.map(f69598f.split(this.f69600a), f69599g);
        }
        if (map == null) {
            m28019a(14);
        }
        return map;
    }

    @NotNull
    public Name shortName() {
        Name name = this.f69603d;
        if (name != null) {
            if (name == null) {
                m28019a(10);
            }
            return name;
        } else if (!isRoot()) {
            m28018b();
            Name name2 = this.f69603d;
            if (name2 == null) {
                m28019a(11);
            }
            return name2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    @NotNull
    public Name shortNameOrSpecial() {
        if (isRoot()) {
            Name name = f69597e;
            if (name == null) {
                m28019a(12);
            }
            return name;
        }
        Name shortName = shortName();
        if (shortName == null) {
            m28019a(13);
        }
        return shortName;
    }

    public boolean startsWith(@NotNull Name name) {
        if (name == null) {
            m28019a(15);
        }
        if (isRoot()) {
            return false;
        }
        int indexOf = this.f69600a.indexOf(46);
        String asString = name.asString();
        String str = this.f69600a;
        if (indexOf == -1) {
            indexOf = Math.max(str.length(), asString.length());
        }
        return str.regionMatches(0, asString, 0, indexOf);
    }

    @NotNull
    public FqName toSafe() {
        FqName fqName = this.f69601b;
        if (fqName != null) {
            if (fqName == null) {
                m28019a(5);
            }
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f69601b = fqName2;
        return fqName2;
    }

    @NotNull
    public String toString() {
        String str;
        if (isRoot()) {
            str = f69597e.asString();
        } else {
            str = this.f69600a;
        }
        if (str == null) {
            m28019a(17);
        }
        return str;
    }

    public FqNameUnsafe(@NotNull String str) {
        if (str == null) {
            m28019a(2);
        }
        this.f69600a = str;
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        if (str == null) {
            m28019a(3);
        }
        this.f69600a = str;
        this.f69602c = fqNameUnsafe;
        this.f69603d = name;
    }
}
