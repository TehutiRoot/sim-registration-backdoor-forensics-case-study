package com.google.firebase.sessions.settings;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015¨\u0006."}, m28850d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "", "sessionEnabled", "", "sessionSamplingRate", "", "sessionRestartTimeout", "cacheDuration", "", "cacheUpdatedTime", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Boolean;", "getSessionEnabled", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Double;", "getSessionSamplingRate", OperatorName.CURVE_TO, "Ljava/lang/Integer;", "getSessionRestartTimeout", "d", "getCacheDuration", "e", "Ljava/lang/Long;", "getCacheUpdatedTime", "com.google.firebase-firebase-sessions"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SessionConfigs {

    /* renamed from: a */
    public final Boolean f56618a;

    /* renamed from: b */
    public final Double f56619b;

    /* renamed from: c */
    public final Integer f56620c;

    /* renamed from: d */
    public final Integer f56621d;

    /* renamed from: e */
    public final Long f56622e;

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l) {
        this.f56618a = bool;
        this.f56619b = d;
        this.f56620c = num;
        this.f56621d = num2;
        this.f56622e = l;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sessionConfigs.f56618a;
        }
        if ((i & 2) != 0) {
            d = sessionConfigs.f56619b;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            num = sessionConfigs.f56620c;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = sessionConfigs.f56621d;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            l = sessionConfigs.f56622e;
        }
        return sessionConfigs.copy(bool, d2, num3, num4, l);
    }

    @Nullable
    public final Boolean component1() {
        return this.f56618a;
    }

    @Nullable
    public final Double component2() {
        return this.f56619b;
    }

    @Nullable
    public final Integer component3() {
        return this.f56620c;
    }

    @Nullable
    public final Integer component4() {
        return this.f56621d;
    }

    @Nullable
    public final Long component5() {
        return this.f56622e;
    }

    @NotNull
    public final SessionConfigs copy(@Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l) {
        return new SessionConfigs(bool, d, num, num2, l);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionConfigs) {
            SessionConfigs sessionConfigs = (SessionConfigs) obj;
            return Intrinsics.areEqual(this.f56618a, sessionConfigs.f56618a) && Intrinsics.areEqual((Object) this.f56619b, (Object) sessionConfigs.f56619b) && Intrinsics.areEqual(this.f56620c, sessionConfigs.f56620c) && Intrinsics.areEqual(this.f56621d, sessionConfigs.f56621d) && Intrinsics.areEqual(this.f56622e, sessionConfigs.f56622e);
        }
        return false;
    }

    @Nullable
    public final Integer getCacheDuration() {
        return this.f56621d;
    }

    @Nullable
    public final Long getCacheUpdatedTime() {
        return this.f56622e;
    }

    @Nullable
    public final Boolean getSessionEnabled() {
        return this.f56618a;
    }

    @Nullable
    public final Integer getSessionRestartTimeout() {
        return this.f56620c;
    }

    @Nullable
    public final Double getSessionSamplingRate() {
        return this.f56619b;
    }

    public int hashCode() {
        Boolean bool = this.f56618a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f56619b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f56620c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f56621d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f56622e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f56618a + ", sessionSamplingRate=" + this.f56619b + ", sessionRestartTimeout=" + this.f56620c + ", cacheDuration=" + this.f56621d + ", cacheUpdatedTime=" + this.f56622e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
