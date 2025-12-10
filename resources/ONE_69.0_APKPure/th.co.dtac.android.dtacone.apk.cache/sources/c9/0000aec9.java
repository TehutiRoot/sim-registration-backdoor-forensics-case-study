package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011¨\u0006%"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/RoboStats;", "", "", "actionsPerformed", "", "crawlDuration", "distinctVisitedScreens", "", "mainActivityCrawlTimedOut", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/google/firebase/appdistribution/gradle/models/RoboStats;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getActionsPerformed", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getCrawlDuration", OperatorName.CURVE_TO, "getDistinctVisitedScreens", "d", "Ljava/lang/Boolean;", "getMainActivityCrawlTimedOut", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RoboStats {
    @SerializedName("actionsPerformed")
    @Nullable

    /* renamed from: a */
    private final Integer f54651a;
    @SerializedName("crawlDuration")
    @Nullable

    /* renamed from: b */
    private final String f54652b;
    @SerializedName("distinctVisitedScreens")
    @Nullable

    /* renamed from: c */
    private final Integer f54653c;
    @SerializedName("mainActivityCrawlTimedOut")
    @Nullable

    /* renamed from: d */
    private final Boolean f54654d;

    public RoboStats() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RoboStats copy$default(RoboStats roboStats, Integer num, String str, Integer num2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = roboStats.f54651a;
        }
        if ((i & 2) != 0) {
            str = roboStats.f54652b;
        }
        if ((i & 4) != 0) {
            num2 = roboStats.f54653c;
        }
        if ((i & 8) != 0) {
            bool = roboStats.f54654d;
        }
        return roboStats.copy(num, str, num2, bool);
    }

    @Nullable
    public final Integer component1() {
        return this.f54651a;
    }

    @Nullable
    public final String component2() {
        return this.f54652b;
    }

    @Nullable
    public final Integer component3() {
        return this.f54653c;
    }

    @Nullable
    public final Boolean component4() {
        return this.f54654d;
    }

    @NotNull
    public final RoboStats copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Boolean bool) {
        return new RoboStats(num, str, num2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoboStats) {
            RoboStats roboStats = (RoboStats) obj;
            return Intrinsics.areEqual(this.f54651a, roboStats.f54651a) && Intrinsics.areEqual(this.f54652b, roboStats.f54652b) && Intrinsics.areEqual(this.f54653c, roboStats.f54653c) && Intrinsics.areEqual(this.f54654d, roboStats.f54654d);
        }
        return false;
    }

    @Nullable
    public final Integer getActionsPerformed() {
        return this.f54651a;
    }

    @Nullable
    public final String getCrawlDuration() {
        return this.f54652b;
    }

    @Nullable
    public final Integer getDistinctVisitedScreens() {
        return this.f54653c;
    }

    @Nullable
    public final Boolean getMainActivityCrawlTimedOut() {
        return this.f54654d;
    }

    public int hashCode() {
        Integer num = this.f54651a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f54652b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f54653c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f54654d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RoboStats(actionsPerformed=" + this.f54651a + ", crawlDuration=" + this.f54652b + ", distinctVisitedScreens=" + this.f54653c + ", mainActivityCrawlTimedOut=" + this.f54654d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public RoboStats(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Boolean bool) {
        this.f54651a = num;
        this.f54652b = str;
        this.f54653c = num2;
        this.f54654d = bool;
    }

    public /* synthetic */ RoboStats(Integer num, String str, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool);
    }
}