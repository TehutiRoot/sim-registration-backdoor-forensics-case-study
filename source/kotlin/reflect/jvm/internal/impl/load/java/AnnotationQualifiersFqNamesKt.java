package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class AnnotationQualifiersFqNamesKt {

    /* renamed from: a */
    public static final FqName f68934a = new FqName("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    public static final FqName f68935b = new FqName("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    public static final FqName f68936c = new FqName("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    public static final FqName f68937d = new FqName("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    public static final List f68938e;

    /* renamed from: f */
    public static final Map f68939f;

    /* renamed from: g */
    public static final Map f68940g;

    /* renamed from: h */
    public static final Set f68941h;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AnnotationQualifierApplicabilityType[]{AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE});
        f68938e = listOf;
        FqName jspecify_old_null_marked = JvmAnnotationNamesKt.getJSPECIFY_OLD_NULL_MARKED();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map mapOf = AbstractC11687a.mapOf(TuplesKt.m28844to(jspecify_old_null_marked, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listOf, false)), TuplesKt.m28844to(JvmAnnotationNamesKt.getJSPECIFY_NULL_MARKED(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listOf, false)));
        f68939f = mapOf;
        f68940g = AbstractC11687a.plus(AbstractC11687a.mapOf(TuplesKt.m28844to(new FqName("javax.annotation.ParametersAreNullableByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), AbstractC10108ds.listOf(annotationQualifierApplicabilityType), false, 4, null)), TuplesKt.m28844to(new FqName("javax.annotation.ParametersAreNonnullByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), AbstractC10108ds.listOf(annotationQualifierApplicabilityType), false, 4, null))), mapOf);
        f68941h = DG1.setOf((Object[]) new FqName[]{JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION(), JvmAnnotationNamesKt.getJAVAX_CHECKFORNULL_ANNOTATION()});
    }

    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return f68940g;
    }

    @NotNull
    public static final Set<FqName> getBUILT_IN_TYPE_QUALIFIER_FQ_NAMES() {
        return f68941h;
    }

    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return f68939f;
    }

    @NotNull
    public static final FqName getMIGRATION_ANNOTATION_FQNAME() {
        return f68937d;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_DEFAULT_FQNAME() {
        return f68936c;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_FQNAME() {
        return f68935b;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_NICKNAME_FQNAME() {
        return f68934a;
    }
}
