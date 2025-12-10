package th.p047co.dtac.android.dtacone.model.appOne.pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlansStatus;", "", FirebaseAnalytics.Param.SUCCESS, "", "pending", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPending", "getSuccess", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/appOne/pre2post/PricePlansStatus;", "equals", "", "other", "hashCode", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.PricePlansStatus */
/* loaded from: classes8.dex */
public final class PricePlansStatus {
    public static final int $stable = 0;
    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    @Nullable
    private final Integer error;
    @SerializedName("pending")
    @Nullable
    private final Integer pending;
    @SerializedName(FirebaseAnalytics.Param.SUCCESS)
    @Nullable
    private final Integer success;

    public PricePlansStatus() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PricePlansStatus copy$default(PricePlansStatus pricePlansStatus, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pricePlansStatus.success;
        }
        if ((i & 2) != 0) {
            num2 = pricePlansStatus.pending;
        }
        if ((i & 4) != 0) {
            num3 = pricePlansStatus.error;
        }
        return pricePlansStatus.copy(num, num2, num3);
    }

    @Nullable
    public final Integer component1() {
        return this.success;
    }

    @Nullable
    public final Integer component2() {
        return this.pending;
    }

    @Nullable
    public final Integer component3() {
        return this.error;
    }

    @NotNull
    public final PricePlansStatus copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new PricePlansStatus(num, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PricePlansStatus) {
            PricePlansStatus pricePlansStatus = (PricePlansStatus) obj;
            return Intrinsics.areEqual(this.success, pricePlansStatus.success) && Intrinsics.areEqual(this.pending, pricePlansStatus.pending) && Intrinsics.areEqual(this.error, pricePlansStatus.error);
        }
        return false;
    }

    @Nullable
    public final Integer getError() {
        return this.error;
    }

    @Nullable
    public final Integer getPending() {
        return this.pending;
    }

    @Nullable
    public final Integer getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Integer num = this.success;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pending;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.error;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.success;
        Integer num2 = this.pending;
        Integer num3 = this.error;
        return "PricePlansStatus(success=" + num + ", pending=" + num2 + ", error=" + num3 + ")";
    }

    public PricePlansStatus(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.success = num;
        this.pending = num2;
        this.error = num3;
    }

    public /* synthetic */ PricePlansStatus(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}