package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundSubmitItem;", "", NotificationCompat.CATEGORY_STATUS, "", "tranId", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getTranId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundSubmitItem */
/* loaded from: classes8.dex */
public final class OneNadOutboundSubmitItem {
    public static final int $stable = 0;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;
    @SerializedName("tranId")
    @Nullable
    private final String tranId;

    public OneNadOutboundSubmitItem(@NotNull String status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.tranId = str;
    }

    public static /* synthetic */ OneNadOutboundSubmitItem copy$default(OneNadOutboundSubmitItem oneNadOutboundSubmitItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNadOutboundSubmitItem.status;
        }
        if ((i & 2) != 0) {
            str2 = oneNadOutboundSubmitItem.tranId;
        }
        return oneNadOutboundSubmitItem.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @Nullable
    public final String component2() {
        return this.tranId;
    }

    @NotNull
    public final OneNadOutboundSubmitItem copy(@NotNull String status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new OneNadOutboundSubmitItem(status, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundSubmitItem) {
            OneNadOutboundSubmitItem oneNadOutboundSubmitItem = (OneNadOutboundSubmitItem) obj;
            return Intrinsics.areEqual(this.status, oneNadOutboundSubmitItem.status) && Intrinsics.areEqual(this.tranId, oneNadOutboundSubmitItem.tranId);
        }
        return false;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTranId() {
        return this.tranId;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.tranId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.status;
        String str2 = this.tranId;
        return "OneNadOutboundSubmitItem(status=" + str + ", tranId=" + str2 + ")";
    }

    public /* synthetic */ OneNadOutboundSubmitItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}