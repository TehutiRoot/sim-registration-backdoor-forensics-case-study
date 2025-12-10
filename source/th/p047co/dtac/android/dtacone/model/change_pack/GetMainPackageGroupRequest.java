package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/GetMainPackageGroupRequest;", "", "cmpFlag", "", "startDateOption", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "userCode", "userLan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCmpFlag", "()Ljava/lang/String;", "getStartDateOption", "getSubscriberNumber", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.GetMainPackageGroupRequest */
/* loaded from: classes8.dex */
public final class GetMainPackageGroupRequest {
    public static final int $stable = 0;
    @SerializedName("cmpFlag")
    @NotNull
    private final String cmpFlag;
    @SerializedName("startDateOption")
    @NotNull
    private final String startDateOption;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetMainPackageGroupRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ GetMainPackageGroupRequest copy$default(GetMainPackageGroupRequest getMainPackageGroupRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMainPackageGroupRequest.cmpFlag;
        }
        if ((i & 2) != 0) {
            str2 = getMainPackageGroupRequest.startDateOption;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = getMainPackageGroupRequest.subscriberNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = getMainPackageGroupRequest.userCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = getMainPackageGroupRequest.userLan;
        }
        return getMainPackageGroupRequest.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.cmpFlag;
    }

    @NotNull
    public final String component2() {
        return this.startDateOption;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.userCode;
    }

    @NotNull
    public final String component5() {
        return this.userLan;
    }

    @NotNull
    public final GetMainPackageGroupRequest copy(@NotNull String cmpFlag, @NotNull String startDateOption, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String userLan) {
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        return new GetMainPackageGroupRequest(cmpFlag, startDateOption, subscriberNumber, userCode, userLan);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMainPackageGroupRequest) {
            GetMainPackageGroupRequest getMainPackageGroupRequest = (GetMainPackageGroupRequest) obj;
            return Intrinsics.areEqual(this.cmpFlag, getMainPackageGroupRequest.cmpFlag) && Intrinsics.areEqual(this.startDateOption, getMainPackageGroupRequest.startDateOption) && Intrinsics.areEqual(this.subscriberNumber, getMainPackageGroupRequest.subscriberNumber) && Intrinsics.areEqual(this.userCode, getMainPackageGroupRequest.userCode) && Intrinsics.areEqual(this.userLan, getMainPackageGroupRequest.userLan);
        }
        return false;
    }

    @NotNull
    public final String getCmpFlag() {
        return this.cmpFlag;
    }

    @NotNull
    public final String getStartDateOption() {
        return this.startDateOption;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((this.cmpFlag.hashCode() * 31) + this.startDateOption.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.cmpFlag;
        String str2 = this.startDateOption;
        String str3 = this.subscriberNumber;
        String str4 = this.userCode;
        String str5 = this.userLan;
        return "GetMainPackageGroupRequest(cmpFlag=" + str + ", startDateOption=" + str2 + ", subscriberNumber=" + str3 + ", userCode=" + str4 + ", userLan=" + str5 + ")";
    }

    public GetMainPackageGroupRequest(@NotNull String cmpFlag, @NotNull String startDateOption, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String userLan) {
        Intrinsics.checkNotNullParameter(cmpFlag, "cmpFlag");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        this.cmpFlag = cmpFlag;
        this.startDateOption = startDateOption;
        this.subscriberNumber = subscriberNumber;
        this.userCode = userCode;
        this.userLan = userLan;
    }

    public /* synthetic */ GetMainPackageGroupRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "N" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
