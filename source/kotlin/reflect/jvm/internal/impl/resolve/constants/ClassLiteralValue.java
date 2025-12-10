package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* loaded from: classes6.dex */
public final class ClassLiteralValue {

    /* renamed from: a */
    public final ClassId f69901a;

    /* renamed from: b */
    public final int f69902b;

    public ClassLiteralValue(@NotNull ClassId classId, int i) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f69901a = classId;
        this.f69902b = i;
    }

    @NotNull
    public final ClassId component1() {
        return this.f69901a;
    }

    public final int component2() {
        return this.f69902b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClassLiteralValue) {
            ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
            return Intrinsics.areEqual(this.f69901a, classLiteralValue.f69901a) && this.f69902b == classLiteralValue.f69902b;
        }
        return false;
    }

    public final int getArrayNestedness() {
        return this.f69902b;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.f69901a;
    }

    public int hashCode() {
        return (this.f69901a.hashCode() * 31) + this.f69902b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f69902b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f69901a);
        int i3 = this.f69902b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
