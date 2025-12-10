package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJavaNullabilityAnnotationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaNullabilityAnnotationSettings.kt\norg/jetbrains/kotlin/load/java/JavaNullabilityAnnotationSettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
/* loaded from: classes6.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    /* renamed from: a */
    public static final FqName f68956a;

    /* renamed from: b */
    public static final FqName f68957b;

    /* renamed from: c */
    public static final FqName f68958c;

    /* renamed from: d */
    public static final FqName f68959d;

    /* renamed from: e */
    public static final String f68960e;

    /* renamed from: f */
    public static final FqName[] f68961f;

    /* renamed from: g */
    public static final NullabilityAnnotationStates f68962g;

    /* renamed from: h */
    public static final JavaNullabilityAnnotationsStatus f68963h;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        f68956a = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f68957b = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        f68958c = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        f68959d = fqName4;
        String asString = fqName3.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "RXJAVA3_ANNOTATIONS_PACKAGE.asString()");
        f68960e = asString;
        FqName fqName5 = new FqName(asString + ".Nullable");
        f68961f = new FqName[]{fqName5, new FqName(asString + ".NonNull")};
        FqName fqName6 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair m28844to = TuplesKt.m28844to(fqName6, companion.getDEFAULT());
        Pair m28844to2 = TuplesKt.m28844to(new FqName("androidx.annotation"), companion.getDEFAULT());
        Pair m28844to3 = TuplesKt.m28844to(new FqName("android.support.annotation"), companion.getDEFAULT());
        Pair m28844to4 = TuplesKt.m28844to(new FqName("android.annotation"), companion.getDEFAULT());
        Pair m28844to5 = TuplesKt.m28844to(new FqName("com.android.annotations"), companion.getDEFAULT());
        Pair m28844to6 = TuplesKt.m28844to(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        Pair m28844to7 = TuplesKt.m28844to(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        Pair m28844to8 = TuplesKt.m28844to(fqName4, companion.getDEFAULT());
        Pair m28844to9 = TuplesKt.m28844to(new FqName("javax.annotation"), companion.getDEFAULT());
        Pair m28844to10 = TuplesKt.m28844to(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        Pair m28844to11 = TuplesKt.m28844to(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName7 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair m28844to12 = TuplesKt.m28844to(fqName7, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair m28844to13 = TuplesKt.m28844to(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair m28844to14 = TuplesKt.m28844to(new FqName("lombok"), companion.getDEFAULT());
        KotlinVersion kotlinVersion = new KotlinVersion(1, 9);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f68962g = new NullabilityAnnotationStatesImpl(AbstractC11687a.mapOf(m28844to, m28844to2, m28844to3, m28844to4, m28844to5, m28844to6, m28844to7, m28844to8, m28844to9, m28844to10, m28844to11, m28844to12, m28844to13, m28844to14, TuplesKt.m28844to(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.m28844to(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 9), reportLevel2)), TuplesKt.m28844to(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2))));
        f68963h = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    @NotNull
    public static final Jsr305Settings getDefaultJsr305Settings(@NotNull KotlinVersion configuredKotlinVersion) {
        ReportLevel reportLevelBefore;
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f68963h;
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null && javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) <= 0) {
            reportLevelBefore = javaNullabilityAnnotationsStatus.getReportLevelAfter();
        } else {
            reportLevelBefore = javaNullabilityAnnotationsStatus.getReportLevelBefore();
        }
        ReportLevel reportLevel = reportLevelBefore;
        return new Jsr305Settings(reportLevel, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevel), null, 4, null);
    }

    public static /* synthetic */ Jsr305Settings getDefaultJsr305Settings$default(KotlinVersion kotlinVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            kotlinVersion = KotlinVersion.CURRENT;
        }
        return getDefaultJsr305Settings(kotlinVersion);
    }

    @Nullable
    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel globalReportLevel) {
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName annotationFqName) {
        Intrinsics.checkNotNullParameter(annotationFqName, "annotationFqName");
        return getReportLevelForAnnotation$default(annotationFqName, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return f68957b;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return f68961f;
    }

    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName annotation, @NotNull NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, @NotNull KotlinVersion configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevel = configuredReportLevels.get(annotation);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) f68962g.get(annotation);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null && javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) <= 0) {
            return javaNullabilityAnnotationsStatus.getReportLevelAfter();
        }
        return javaNullabilityAnnotationsStatus.getReportLevelBefore();
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, KotlinVersion kotlinVersion, int i, Object obj) {
        if ((i & 4) != 0) {
            kotlinVersion = new KotlinVersion(1, 7, 20);
        }
        return getReportLevelForAnnotation(fqName, nullabilityAnnotationStates, kotlinVersion);
    }
}
