package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/CheckOwnerLastDigitRequest;", "", "userLan", "", "userCode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "idNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "getSubscriberNumber", "getUserCode", "getUserLan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.CheckOwnerLastDigitRequest */
/* loaded from: classes8.dex */
public final class CheckOwnerLastDigitRequest {
    public static final int $stable = 0;
    @SerializedName("idNumber")
    @NotNull
    private final String idNumber;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public CheckOwnerLastDigitRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String subscriberNumber, @NotNull String idNumber) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        this.userLan = userLan;
        this.userCode = userCode;
        this.subscriberNumber = subscriberNumber;
        this.idNumber = idNumber;
    }

    public static /* synthetic */ CheckOwnerLastDigitRequest copy$default(CheckOwnerLastDigitRequest checkOwnerLastDigitRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkOwnerLastDigitRequest.userLan;
        }
        if ((i & 2) != 0) {
            str2 = checkOwnerLastDigitRequest.userCode;
        }
        if ((i & 4) != 0) {
            str3 = checkOwnerLastDigitRequest.subscriberNumber;
        }
        if ((i & 8) != 0) {
            str4 = checkOwnerLastDigitRequest.idNumber;
        }
        return checkOwnerLastDigitRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.idNumber;
    }

    @NotNull
    public final CheckOwnerLastDigitRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String subscriberNumber, @NotNull String idNumber) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        return new CheckOwnerLastDigitRequest(userLan, userCode, subscriberNumber, idNumber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckOwnerLastDigitRequest) {
            CheckOwnerLastDigitRequest checkOwnerLastDigitRequest = (CheckOwnerLastDigitRequest) obj;
            return Intrinsics.areEqual(this.userLan, checkOwnerLastDigitRequest.userLan) && Intrinsics.areEqual(this.userCode, checkOwnerLastDigitRequest.userCode) && Intrinsics.areEqual(this.subscriberNumber, checkOwnerLastDigitRequest.subscriberNumber) && Intrinsics.areEqual(this.idNumber, checkOwnerLastDigitRequest.idNumber);
        }
        return false;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
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
        return (((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.idNumber.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.subscriberNumber;
        String str4 = this.idNumber;
        return "CheckOwnerLastDigitRequest(userLan=" + str + ", userCode=" + str2 + ", subscriberNumber=" + str3 + ", idNumber=" + str4 + ")";
    }
}