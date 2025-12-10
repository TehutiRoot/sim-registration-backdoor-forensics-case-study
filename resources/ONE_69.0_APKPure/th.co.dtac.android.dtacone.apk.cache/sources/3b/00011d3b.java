package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/GetMainPackageGroupPrepaidRequest;", "", "fromPackageCategory", "", "fromPackageGroupType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "userCode", "userLan", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromPackageCategory", "()Ljava/lang/String;", "getFromPackageGroupType", "getSubscriberNumber", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.GetMainPackageGroupPrepaidRequest */
/* loaded from: classes8.dex */
public final class GetMainPackageGroupPrepaidRequest {
    public static final int $stable = 0;
    @SerializedName("fromPackageCategory")
    @NotNull
    private final String fromPackageCategory;
    @SerializedName("fromPackageGroupType")
    @NotNull
    private final String fromPackageGroupType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetMainPackageGroupPrepaidRequest(@NotNull String fromPackageCategory, @NotNull String fromPackageGroupType, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String userLan) {
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        this.fromPackageCategory = fromPackageCategory;
        this.fromPackageGroupType = fromPackageGroupType;
        this.subscriberNumber = subscriberNumber;
        this.userCode = userCode;
        this.userLan = userLan;
    }

    public static /* synthetic */ GetMainPackageGroupPrepaidRequest copy$default(GetMainPackageGroupPrepaidRequest getMainPackageGroupPrepaidRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMainPackageGroupPrepaidRequest.fromPackageCategory;
        }
        if ((i & 2) != 0) {
            str2 = getMainPackageGroupPrepaidRequest.fromPackageGroupType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = getMainPackageGroupPrepaidRequest.subscriberNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = getMainPackageGroupPrepaidRequest.userCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = getMainPackageGroupPrepaidRequest.userLan;
        }
        return getMainPackageGroupPrepaidRequest.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.fromPackageCategory;
    }

    @NotNull
    public final String component2() {
        return this.fromPackageGroupType;
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
    public final GetMainPackageGroupPrepaidRequest copy(@NotNull String fromPackageCategory, @NotNull String fromPackageGroupType, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String userLan) {
        Intrinsics.checkNotNullParameter(fromPackageCategory, "fromPackageCategory");
        Intrinsics.checkNotNullParameter(fromPackageGroupType, "fromPackageGroupType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        return new GetMainPackageGroupPrepaidRequest(fromPackageCategory, fromPackageGroupType, subscriberNumber, userCode, userLan);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMainPackageGroupPrepaidRequest) {
            GetMainPackageGroupPrepaidRequest getMainPackageGroupPrepaidRequest = (GetMainPackageGroupPrepaidRequest) obj;
            return Intrinsics.areEqual(this.fromPackageCategory, getMainPackageGroupPrepaidRequest.fromPackageCategory) && Intrinsics.areEqual(this.fromPackageGroupType, getMainPackageGroupPrepaidRequest.fromPackageGroupType) && Intrinsics.areEqual(this.subscriberNumber, getMainPackageGroupPrepaidRequest.subscriberNumber) && Intrinsics.areEqual(this.userCode, getMainPackageGroupPrepaidRequest.userCode) && Intrinsics.areEqual(this.userLan, getMainPackageGroupPrepaidRequest.userLan);
        }
        return false;
    }

    @NotNull
    public final String getFromPackageCategory() {
        return this.fromPackageCategory;
    }

    @NotNull
    public final String getFromPackageGroupType() {
        return this.fromPackageGroupType;
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
        return (((((((this.fromPackageCategory.hashCode() * 31) + this.fromPackageGroupType.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.fromPackageCategory;
        String str2 = this.fromPackageGroupType;
        String str3 = this.subscriberNumber;
        String str4 = this.userCode;
        String str5 = this.userLan;
        return "GetMainPackageGroupPrepaidRequest(fromPackageCategory=" + str + ", fromPackageGroupType=" + str2 + ", subscriberNumber=" + str3 + ", userCode=" + str4 + ", userLan=" + str5 + ")";
    }
}