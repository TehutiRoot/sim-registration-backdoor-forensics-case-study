package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Jsr305Settings {

    /* renamed from: a */
    public final ReportLevel f68973a;

    /* renamed from: b */
    public final ReportLevel f68974b;

    /* renamed from: c */
    public final Map f68975c;

    /* renamed from: d */
    public final Lazy f68976d;

    /* renamed from: e */
    public final boolean f68977e;

    public Jsr305Settings(@NotNull ReportLevel globalLevel, @Nullable ReportLevel reportLevel, @NotNull Map<FqName, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f68973a = globalLevel;
        this.f68974b = reportLevel;
        this.f68975c = userDefinedLevelForSpecificAnnotation;
        this.f68976d = LazyKt__LazyJVMKt.lazy(new Jsr305Settings$description$2(this));
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.f68977e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Jsr305Settings) {
            Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
            return this.f68973a == jsr305Settings.f68973a && this.f68974b == jsr305Settings.f68974b && Intrinsics.areEqual(this.f68975c, jsr305Settings.f68975c);
        }
        return false;
    }

    @NotNull
    public final ReportLevel getGlobalLevel() {
        return this.f68973a;
    }

    @Nullable
    public final ReportLevel getMigrationLevel() {
        return this.f68974b;
    }

    @NotNull
    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.f68975c;
    }

    public int hashCode() {
        int hashCode = this.f68973a.hashCode() * 31;
        ReportLevel reportLevel = this.f68974b;
        return ((hashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f68975c.hashCode();
    }

    public final boolean isDisabled() {
        return this.f68977e;
    }

    @NotNull
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f68973a + ", migrationLevel=" + this.f68974b + ", userDefinedLevelForSpecificAnnotation=" + this.f68975c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? AbstractC11687a.emptyMap() : map);
    }
}
