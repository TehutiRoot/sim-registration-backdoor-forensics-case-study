package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/BSubsInfo;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "subscriberStatus", "companyName", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyName", "()Ljava/lang/String;", "getName", "getSubscriberNumber", "getSubscriberStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.BSubsInfo */
/* loaded from: classes8.dex */
public final class BSubsInfo {
    public static final int $stable = 0;
    @SerializedName("companyName")
    @NotNull
    private final String companyName;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("subscriberStatus")
    @NotNull
    private final String subscriberStatus;

    public BSubsInfo(@NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String companyName, @NotNull String name) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(name, "name");
        this.subscriberNumber = subscriberNumber;
        this.subscriberStatus = subscriberStatus;
        this.companyName = companyName;
        this.name = name;
    }

    public static /* synthetic */ BSubsInfo copy$default(BSubsInfo bSubsInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bSubsInfo.subscriberNumber;
        }
        if ((i & 2) != 0) {
            str2 = bSubsInfo.subscriberStatus;
        }
        if ((i & 4) != 0) {
            str3 = bSubsInfo.companyName;
        }
        if ((i & 8) != 0) {
            str4 = bSubsInfo.name;
        }
        return bSubsInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component2() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String component3() {
        return this.companyName;
    }

    @NotNull
    public final String component4() {
        return this.name;
    }

    @NotNull
    public final BSubsInfo copy(@NotNull String subscriberNumber, @NotNull String subscriberStatus, @NotNull String companyName, @NotNull String name) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(name, "name");
        return new BSubsInfo(subscriberNumber, subscriberStatus, companyName, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BSubsInfo) {
            BSubsInfo bSubsInfo = (BSubsInfo) obj;
            return Intrinsics.areEqual(this.subscriberNumber, bSubsInfo.subscriberNumber) && Intrinsics.areEqual(this.subscriberStatus, bSubsInfo.subscriberStatus) && Intrinsics.areEqual(this.companyName, bSubsInfo.companyName) && Intrinsics.areEqual(this.name, bSubsInfo.name);
        }
        return false;
    }

    @NotNull
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
    }

    public int hashCode() {
        return (((((this.subscriberNumber.hashCode() * 31) + this.subscriberStatus.hashCode()) * 31) + this.companyName.hashCode()) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        String str2 = this.subscriberStatus;
        String str3 = this.companyName;
        String str4 = this.name;
        return "BSubsInfo(subscriberNumber=" + str + ", subscriberStatus=" + str2 + ", companyName=" + str3 + ", name=" + str4 + ")";
    }
}
