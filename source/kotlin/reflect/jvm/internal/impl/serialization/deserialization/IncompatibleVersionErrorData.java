package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class IncompatibleVersionErrorData<T> {

    /* renamed from: a */
    public final Object f70054a;

    /* renamed from: b */
    public final Object f70055b;

    /* renamed from: c */
    public final Object f70056c;

    /* renamed from: d */
    public final Object f70057d;

    /* renamed from: e */
    public final String f70058e;

    /* renamed from: f */
    public final ClassId f70059f;

    public IncompatibleVersionErrorData(T t, T t2, T t3, T t4, @NotNull String filePath, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f70054a = t;
        this.f70055b = t2;
        this.f70056c = t3;
        this.f70057d = t4;
        this.f70058e = filePath;
        this.f70059f = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IncompatibleVersionErrorData) {
            IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
            return Intrinsics.areEqual(this.f70054a, incompatibleVersionErrorData.f70054a) && Intrinsics.areEqual(this.f70055b, incompatibleVersionErrorData.f70055b) && Intrinsics.areEqual(this.f70056c, incompatibleVersionErrorData.f70056c) && Intrinsics.areEqual(this.f70057d, incompatibleVersionErrorData.f70057d) && Intrinsics.areEqual(this.f70058e, incompatibleVersionErrorData.f70058e) && Intrinsics.areEqual(this.f70059f, incompatibleVersionErrorData.f70059f);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f70054a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f70055b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f70056c;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f70057d;
        return ((((hashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f70058e.hashCode()) * 31) + this.f70059f.hashCode();
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f70054a + ", compilerVersion=" + this.f70055b + ", languageVersion=" + this.f70056c + ", expectedVersion=" + this.f70057d + ", filePath=" + this.f70058e + ", classId=" + this.f70059f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
