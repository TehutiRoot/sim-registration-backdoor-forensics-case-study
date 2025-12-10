package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostVerifyIDNumberRequest;", "", "idNumber", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "userCode", "withDevice", "withContract", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "getSubscriberNumber", "getUserCode", "getWithContract", "getWithDevice", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostVerifyIDNumberRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostVerifyIDNumberRequest {
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
    @SerializedName("withContract")
    @NotNull
    private final String withContract;
    @SerializedName("withDevice")
    @NotNull
    private final String withDevice;

    public OnePre2PostVerifyIDNumberRequest(@NotNull String idNumber, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String withDevice, @NotNull String withContract) {
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(withDevice, "withDevice");
        Intrinsics.checkNotNullParameter(withContract, "withContract");
        this.idNumber = idNumber;
        this.subscriberNumber = subscriberNumber;
        this.userCode = userCode;
        this.withDevice = withDevice;
        this.withContract = withContract;
    }

    public static /* synthetic */ OnePre2PostVerifyIDNumberRequest copy$default(OnePre2PostVerifyIDNumberRequest onePre2PostVerifyIDNumberRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostVerifyIDNumberRequest.idNumber;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostVerifyIDNumberRequest.subscriberNumber;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePre2PostVerifyIDNumberRequest.userCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePre2PostVerifyIDNumberRequest.withDevice;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = onePre2PostVerifyIDNumberRequest.withContract;
        }
        return onePre2PostVerifyIDNumberRequest.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.idNumber;
    }

    @NotNull
    public final String component2() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component3() {
        return this.userCode;
    }

    @NotNull
    public final String component4() {
        return this.withDevice;
    }

    @NotNull
    public final String component5() {
        return this.withContract;
    }

    @NotNull
    public final OnePre2PostVerifyIDNumberRequest copy(@NotNull String idNumber, @NotNull String subscriberNumber, @NotNull String userCode, @NotNull String withDevice, @NotNull String withContract) {
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(withDevice, "withDevice");
        Intrinsics.checkNotNullParameter(withContract, "withContract");
        return new OnePre2PostVerifyIDNumberRequest(idNumber, subscriberNumber, userCode, withDevice, withContract);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostVerifyIDNumberRequest) {
            OnePre2PostVerifyIDNumberRequest onePre2PostVerifyIDNumberRequest = (OnePre2PostVerifyIDNumberRequest) obj;
            return Intrinsics.areEqual(this.idNumber, onePre2PostVerifyIDNumberRequest.idNumber) && Intrinsics.areEqual(this.subscriberNumber, onePre2PostVerifyIDNumberRequest.subscriberNumber) && Intrinsics.areEqual(this.userCode, onePre2PostVerifyIDNumberRequest.userCode) && Intrinsics.areEqual(this.withDevice, onePre2PostVerifyIDNumberRequest.withDevice) && Intrinsics.areEqual(this.withContract, onePre2PostVerifyIDNumberRequest.withContract);
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
    public final String getWithContract() {
        return this.withContract;
    }

    @NotNull
    public final String getWithDevice() {
        return this.withDevice;
    }

    public int hashCode() {
        return (((((((this.idNumber.hashCode() * 31) + this.subscriberNumber.hashCode()) * 31) + this.userCode.hashCode()) * 31) + this.withDevice.hashCode()) * 31) + this.withContract.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.idNumber;
        String str2 = this.subscriberNumber;
        String str3 = this.userCode;
        String str4 = this.withDevice;
        String str5 = this.withContract;
        return "OnePre2PostVerifyIDNumberRequest(idNumber=" + str + ", subscriberNumber=" + str2 + ", userCode=" + str3 + ", withDevice=" + str4 + ", withContract=" + str5 + ")";
    }
}
