package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class JvmAnnotationNamesKt {

    /* renamed from: a */
    public static final FqName f68980a;

    /* renamed from: b */
    public static final FqName f68981b;

    /* renamed from: c */
    public static final FqName f68982c;

    /* renamed from: d */
    public static final FqName f68983d;

    /* renamed from: e */
    public static final FqName f68984e;

    /* renamed from: f */
    public static final FqName f68985f;

    /* renamed from: g */
    public static final List f68986g;

    /* renamed from: h */
    public static final FqName f68987h;

    /* renamed from: i */
    public static final FqName f68988i;

    /* renamed from: j */
    public static final List f68989j;

    /* renamed from: k */
    public static final FqName f68990k;

    /* renamed from: l */
    public static final FqName f68991l;

    /* renamed from: m */
    public static final FqName f68992m;

    /* renamed from: n */
    public static final FqName f68993n;

    /* renamed from: o */
    public static final Set f68994o;

    /* renamed from: p */
    public static final Set f68995p;

    /* renamed from: q */
    public static final Set f68996q;

    /* renamed from: r */
    public static final Map f68997r;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f68980a = fqName;
        f68981b = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f68982c = fqName2;
        FqName fqName3 = new FqName("org.jspecify.annotations.Nullable");
        f68983d = fqName3;
        f68984e = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName4 = new FqName("org.jspecify.annotations.NullMarked");
        f68985f = fqName4;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("android.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("javax.annotation.Nullable"), new FqName("javax.annotation.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable")});
        f68986g = listOf;
        FqName fqName5 = new FqName("javax.annotation.Nonnull");
        f68987h = fqName5;
        f68988i = new FqName("javax.annotation.CheckForNull");
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("android.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("lombok.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull")});
        f68989j = listOf2;
        FqName fqName6 = new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        f68990k = fqName6;
        FqName fqName7 = new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        f68991l = fqName7;
        FqName fqName8 = new FqName("androidx.annotation.RecentlyNullable");
        f68992m = fqName8;
        FqName fqName9 = new FqName("androidx.annotation.RecentlyNonNull");
        f68993n = fqName9;
        f68994o = EG1.plus(EG1.plus(EG1.plus(EG1.plus(EG1.plus(EG1.plus(EG1.plus(EG1.plus(EG1.plus(EG1.plus(EG1.plus((Set) new LinkedHashSet(), (Iterable) listOf), fqName5), (Iterable) listOf2), fqName6), fqName7), fqName8), fqName9), fqName), fqName2), fqName3), fqName4);
        f68995p = DG1.setOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION});
        f68996q = DG1.setOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION});
        f68997r = AbstractC11687a.mapOf(TuplesKt.m28844to(JvmAnnotationNames.TARGET_ANNOTATION, StandardNames.FqNames.target), TuplesKt.m28844to(JvmAnnotationNames.RETENTION_ANNOTATION, StandardNames.FqNames.retention), TuplesKt.m28844to(JvmAnnotationNames.DEPRECATED_ANNOTATION, StandardNames.FqNames.deprecated), TuplesKt.m28844to(JvmAnnotationNames.DOCUMENTED_ANNOTATION, StandardNames.FqNames.mustBeDocumented));
    }

    @NotNull
    public static final FqName getANDROIDX_RECENTLY_NON_NULL_ANNOTATION() {
        return f68993n;
    }

    @NotNull
    public static final FqName getANDROIDX_RECENTLY_NULLABLE_ANNOTATION() {
        return f68992m;
    }

    @NotNull
    public static final FqName getCOMPATQUAL_NONNULL_ANNOTATION() {
        return f68991l;
    }

    @NotNull
    public static final FqName getCOMPATQUAL_NULLABLE_ANNOTATION() {
        return f68990k;
    }

    @NotNull
    public static final FqName getJAVAX_CHECKFORNULL_ANNOTATION() {
        return f68988i;
    }

    @NotNull
    public static final FqName getJAVAX_NONNULL_ANNOTATION() {
        return f68987h;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULLABLE() {
        return f68983d;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULLNESS_UNKNOWN() {
        return f68984e;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULL_MARKED() {
        return f68985f;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULLABLE() {
        return f68980a;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULLNESS_UNKNOWN() {
        return f68981b;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULL_MARKED() {
        return f68982c;
    }

    @NotNull
    public static final Set<FqName> getMUTABLE_ANNOTATIONS() {
        return f68996q;
    }

    @NotNull
    public static final List<FqName> getNOT_NULL_ANNOTATIONS() {
        return f68989j;
    }

    @NotNull
    public static final List<FqName> getNULLABLE_ANNOTATIONS() {
        return f68986g;
    }

    @NotNull
    public static final Set<FqName> getREAD_ONLY_ANNOTATIONS() {
        return f68995p;
    }
}
