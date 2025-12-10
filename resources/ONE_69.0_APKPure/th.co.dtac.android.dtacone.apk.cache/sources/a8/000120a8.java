package th.p047co.dtac.android.dtacone.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/stv/StvRecommendPackageReq;", "", "subscriber", "", "togglePrepaidEnable", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubscriber", "()Ljava/lang/String;", "getTogglePrepaidEnable", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.stv.StvRecommendPackageReq */
/* loaded from: classes8.dex */
public final class StvRecommendPackageReq {
    public static final int $stable = 0;
    @SerializedName("subscriber")
    @NotNull
    private final String subscriber;
    @SerializedName("togglePrepaidEnable")
    @Nullable
    private final String togglePrepaidEnable;

    public StvRecommendPackageReq() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ StvRecommendPackageReq copy$default(StvRecommendPackageReq stvRecommendPackageReq, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stvRecommendPackageReq.subscriber;
        }
        if ((i & 2) != 0) {
            str2 = stvRecommendPackageReq.togglePrepaidEnable;
        }
        return stvRecommendPackageReq.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.subscriber;
    }

    @Nullable
    public final String component2() {
        return this.togglePrepaidEnable;
    }

    @NotNull
    public final StvRecommendPackageReq copy(@NotNull String subscriber, @Nullable String str) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        return new StvRecommendPackageReq(subscriber, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StvRecommendPackageReq) {
            StvRecommendPackageReq stvRecommendPackageReq = (StvRecommendPackageReq) obj;
            return Intrinsics.areEqual(this.subscriber, stvRecommendPackageReq.subscriber) && Intrinsics.areEqual(this.togglePrepaidEnable, stvRecommendPackageReq.togglePrepaidEnable);
        }
        return false;
    }

    @NotNull
    public final String getSubscriber() {
        return this.subscriber;
    }

    @Nullable
    public final String getTogglePrepaidEnable() {
        return this.togglePrepaidEnable;
    }

    public int hashCode() {
        int hashCode = this.subscriber.hashCode() * 31;
        String str = this.togglePrepaidEnable;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.subscriber;
        String str2 = this.togglePrepaidEnable;
        return "StvRecommendPackageReq(subscriber=" + str + ", togglePrepaidEnable=" + str2 + ")";
    }

    public StvRecommendPackageReq(@NotNull String subscriber, @Nullable String str) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.subscriber = subscriber;
        this.togglePrepaidEnable = str;
    }

    public /* synthetic */ StvRecommendPackageReq(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}