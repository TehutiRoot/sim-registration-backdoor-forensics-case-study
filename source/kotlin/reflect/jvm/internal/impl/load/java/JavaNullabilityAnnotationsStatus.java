package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class JavaNullabilityAnnotationsStatus {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final JavaNullabilityAnnotationsStatus f68964d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    /* renamed from: a */
    public final ReportLevel f68965a;

    /* renamed from: b */
    public final KotlinVersion f68966b;

    /* renamed from: c */
    public final ReportLevel f68967c;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.f68964d;
        }

        public Companion() {
        }
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevelBefore, @Nullable KotlinVersion kotlinVersion, @NotNull ReportLevel reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f68965a = reportLevelBefore;
        this.f68966b = kotlinVersion;
        this.f68967c = reportLevelAfter;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JavaNullabilityAnnotationsStatus) {
            JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
            return this.f68965a == javaNullabilityAnnotationsStatus.f68965a && Intrinsics.areEqual(this.f68966b, javaNullabilityAnnotationsStatus.f68966b) && this.f68967c == javaNullabilityAnnotationsStatus.f68967c;
        }
        return false;
    }

    @NotNull
    public final ReportLevel getReportLevelAfter() {
        return this.f68967c;
    }

    @NotNull
    public final ReportLevel getReportLevelBefore() {
        return this.f68965a;
    }

    @Nullable
    public final KotlinVersion getSinceVersion() {
        return this.f68966b;
    }

    public int hashCode() {
        int hashCode = this.f68965a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f68966b;
        return ((hashCode + (kotlinVersion == null ? 0 : kotlinVersion.hashCode())) * 31) + this.f68967c.hashCode();
    }

    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f68965a + ", sinceVersion=" + this.f68966b + ", reportLevelAfter=" + this.f68967c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i & 4) != 0 ? reportLevel : reportLevel2);
    }
}
