package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Data;", "", "campaignWaiveAble", "", "campaignWaiveReasons", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReason;", "(ZLjava/util/List;)V", "getCampaignWaiveAble", "()Z", "getCampaignWaiveReasons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 8;
    @SerializedName("campaignWaiveAble")
    private final boolean campaignWaiveAble;
    @SerializedName("campaignWaiveReasons")
    @NotNull
    private final List<CampaignWaiveReason> campaignWaiveReasons;

    public Data(boolean z, @NotNull List<CampaignWaiveReason> campaignWaiveReasons) {
        Intrinsics.checkNotNullParameter(campaignWaiveReasons, "campaignWaiveReasons");
        this.campaignWaiveAble = z;
        this.campaignWaiveReasons = campaignWaiveReasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = data.campaignWaiveAble;
        }
        if ((i & 2) != 0) {
            list = data.campaignWaiveReasons;
        }
        return data.copy(z, list);
    }

    public final boolean component1() {
        return this.campaignWaiveAble;
    }

    @NotNull
    public final List<CampaignWaiveReason> component2() {
        return this.campaignWaiveReasons;
    }

    @NotNull
    public final Data copy(boolean z, @NotNull List<CampaignWaiveReason> campaignWaiveReasons) {
        Intrinsics.checkNotNullParameter(campaignWaiveReasons, "campaignWaiveReasons");
        return new Data(z, campaignWaiveReasons);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return this.campaignWaiveAble == data.campaignWaiveAble && Intrinsics.areEqual(this.campaignWaiveReasons, data.campaignWaiveReasons);
        }
        return false;
    }

    public final boolean getCampaignWaiveAble() {
        return this.campaignWaiveAble;
    }

    @NotNull
    public final List<CampaignWaiveReason> getCampaignWaiveReasons() {
        return this.campaignWaiveReasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.campaignWaiveAble;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.campaignWaiveReasons.hashCode();
    }

    @NotNull
    public String toString() {
        boolean z = this.campaignWaiveAble;
        List<CampaignWaiveReason> list = this.campaignWaiveReasons;
        return "Data(campaignWaiveAble=" + z + ", campaignWaiveReasons=" + list + ")";
    }
}
