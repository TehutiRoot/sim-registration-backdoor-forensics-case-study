package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class JavaTypeEnhancementState {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final JavaTypeEnhancementState f68968d = new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings$default(null, 1, null), JavaTypeEnhancementState$Companion$DEFAULT$1.INSTANCE);

    /* renamed from: a */
    public final Jsr305Settings f68969a;

    /* renamed from: b */
    public final Function1 f68970b;

    /* renamed from: c */
    public final boolean f68971c;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaTypeEnhancementState getDEFAULT() {
            return JavaTypeEnhancementState.f68968d;
        }

        public Companion() {
        }
    }

    public JavaTypeEnhancementState(@NotNull Jsr305Settings jsr305, @NotNull Function1<? super FqName, ? extends ReportLevel> getReportLevelForAnnotation) {
        boolean z;
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f68969a = jsr305;
        this.f68970b = getReportLevelForAnnotation;
        if (!jsr305.isDisabled() && getReportLevelForAnnotation.invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) != ReportLevel.IGNORE) {
            z = false;
        } else {
            z = true;
        }
        this.f68971c = z;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.f68971c;
    }

    @NotNull
    public final Function1<FqName, ReportLevel> getGetReportLevelForAnnotation() {
        return this.f68970b;
    }

    @NotNull
    public final Jsr305Settings getJsr305() {
        return this.f68969a;
    }

    @NotNull
    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f68969a + ", getReportLevelForAnnotation=" + this.f68970b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
