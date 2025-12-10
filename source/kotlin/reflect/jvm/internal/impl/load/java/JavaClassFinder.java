package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public interface JavaClassFinder {
    @Nullable
    JavaClass findClass(@NotNull Request request);

    @Nullable
    JavaPackage findPackage(@NotNull FqName fqName, boolean z);

    @Nullable
    Set<String> knownClassNamesInPackage(@NotNull FqName fqName);

    /* loaded from: classes6.dex */
    public static final class Request {

        /* renamed from: a */
        public final ClassId f68949a;

        /* renamed from: b */
        public final byte[] f68950b;

        /* renamed from: c */
        public final JavaClass f68951c;

        public Request(@NotNull ClassId classId, @Nullable byte[] bArr, @Nullable JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f68949a = classId;
            this.f68950b = bArr;
            this.f68951c = javaClass;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Request) {
                Request request = (Request) obj;
                return Intrinsics.areEqual(this.f68949a, request.f68949a) && Intrinsics.areEqual(this.f68950b, request.f68950b) && Intrinsics.areEqual(this.f68951c, request.f68951c);
            }
            return false;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f68949a;
        }

        public int hashCode() {
            int hashCode = this.f68949a.hashCode() * 31;
            byte[] bArr = this.f68950b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f68951c;
            return hashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(classId=" + this.f68949a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f68950b) + ", outerClass=" + this.f68951c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : javaClass);
        }
    }
}
