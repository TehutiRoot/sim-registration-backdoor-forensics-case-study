package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class JvmClassName {

    /* renamed from: a */
    public final String f69925a;

    /* renamed from: b */
    public FqName f69926b;

    public JvmClassName(String str) {
        if (str == null) {
            m27741a(5);
        }
        this.f69925a = str;
    }

    /* renamed from: a */
    public static /* synthetic */ void m27741a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public static JvmClassName byClassId(@NotNull ClassId classId) {
        if (classId == null) {
            m27741a(1);
        }
        FqName packageFqName = classId.getPackageFqName();
        String replace = classId.getRelativeClassName().asString().replace('.', '$');
        if (packageFqName.isRoot()) {
            return new JvmClassName(replace);
        }
        return new JvmClassName(packageFqName.asString().replace('.', '/') + RemoteSettings.FORWARD_SLASH_STRING + replace);
    }

    @NotNull
    public static JvmClassName byFqNameWithoutInnerClasses(@NotNull FqName fqName) {
        if (fqName == null) {
            m27741a(2);
        }
        JvmClassName jvmClassName = new JvmClassName(fqName.asString().replace('.', '/'));
        jvmClassName.f69926b = fqName;
        return jvmClassName;
    }

    @NotNull
    public static JvmClassName byInternalName(@NotNull String str) {
        if (str == null) {
            m27741a(0);
        }
        return new JvmClassName(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f69925a.equals(((JvmClassName) obj).f69925a);
        }
        return false;
    }

    @NotNull
    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.f69925a.replace('/', '.'));
    }

    @NotNull
    public String getInternalName() {
        String str = this.f69925a;
        if (str == null) {
            m27741a(8);
        }
        return str;
    }

    @NotNull
    public FqName getPackageFqName() {
        int lastIndexOf = this.f69925a.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (lastIndexOf == -1) {
            FqName fqName = FqName.ROOT;
            if (fqName == null) {
                m27741a(7);
            }
            return fqName;
        }
        return new FqName(this.f69925a.substring(0, lastIndexOf).replace('/', '.'));
    }

    public int hashCode() {
        return this.f69925a.hashCode();
    }

    public String toString() {
        return this.f69925a;
    }
}
