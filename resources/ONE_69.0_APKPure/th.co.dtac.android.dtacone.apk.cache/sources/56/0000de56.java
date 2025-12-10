package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11663a;
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
    public static final FqName f68990a;

    /* renamed from: b */
    public static final FqName f68991b;

    /* renamed from: c */
    public static final FqName f68992c;

    /* renamed from: d */
    public static final FqName f68993d;

    /* renamed from: e */
    public static final String f68994e;

    /* renamed from: f */
    public static final FqName[] f68995f;

    /* renamed from: g */
    public static final NullabilityAnnotationStates f68996g;

    /* renamed from: h */
    public static final JavaNullabilityAnnotationsStatus f68997h;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        f68990a = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f68991b = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        f68992c = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        f68993d = fqName4;
        String asString = fqName3.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "RXJAVA3_ANNOTATIONS_PACKAGE.asString()");
        f68994e = asString;
        FqName fqName5 = new FqName(asString + ".Nullable");
        f68995f = new FqName[]{fqName5, new FqName(asString + ".NonNull")};
        FqName fqName6 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair m29136to = TuplesKt.m29136to(fqName6, companion.getDEFAULT());
        Pair m29136to2 = TuplesKt.m29136to(new FqName("androidx.annotation"), companion.getDEFAULT());
        Pair m29136to3 = TuplesKt.m29136to(new FqName("android.support.annotation"), companion.getDEFAULT());
        Pair m29136to4 = TuplesKt.m29136to(new FqName("android.annotation"), companion.getDEFAULT());
        Pair m29136to5 = TuplesKt.m29136to(new FqName("com.android.annotations"), companion.getDEFAULT());
        Pair m29136to6 = TuplesKt.m29136to(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        Pair m29136to7 = TuplesKt.m29136to(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        Pair m29136to8 = TuplesKt.m29136to(fqName4, companion.getDEFAULT());
        Pair m29136to9 = TuplesKt.m29136to(new FqName("javax.annotation"), companion.getDEFAULT());
        Pair m29136to10 = TuplesKt.m29136to(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        Pair m29136to11 = TuplesKt.m29136to(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName7 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair m29136to12 = TuplesKt.m29136to(fqName7, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair m29136to13 = TuplesKt.m29136to(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair m29136to14 = TuplesKt.m29136to(new FqName("lombok"), companion.getDEFAULT());
        KotlinVersion kotlinVersion = new KotlinVersion(1, 9);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f68996g = new NullabilityAnnotationStatesImpl(AbstractC11663a.mapOf(m29136to, m29136to2, m29136to3, m29136to4, m29136to5, m29136to6, m29136to7, m29136to8, m29136to9, m29136to10, m29136to11, m29136to12, m29136to13, m29136to14, TuplesKt.m29136to(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.m29136to(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 9), reportLevel2)), TuplesKt.m29136to(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2))));
        f68997h = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    @NotNull
    public static final Jsr305Settings getDefaultJsr305Settings(@NotNull KotlinVersion configuredKotlinVersion) {
        ReportLevel reportLevelBefore;
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f68997h;
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
        return f68991b;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return f68995f;
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
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) f68996g.get(annotation);
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