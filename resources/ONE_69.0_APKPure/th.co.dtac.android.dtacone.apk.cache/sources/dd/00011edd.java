package th.p047co.dtac.android.dtacone.model.mrtr_mnp.otp;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/otp/MnpRequestOtpRequest;", "", "userFormatType", "", "userNameLogin", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubscriberNumber", "()Ljava/lang/String;", "setSubscriberNumber", "(Ljava/lang/String;)V", "getUserFormatType", "setUserFormatType", "getUserNameLogin", "setUserNameLogin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.otp.MnpRequestOtpRequest */
/* loaded from: classes8.dex */
public final class MnpRequestOtpRequest {
    public static final int $stable = 8;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private String subscriberNumber;
    @SerializedName("userFormatType")
    @Nullable
    private String userFormatType;
    @SerializedName("userNameLogin")
    @Nullable
    private String userNameLogin;

    public MnpRequestOtpRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MnpRequestOtpRequest copy$default(MnpRequestOtpRequest mnpRequestOtpRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mnpRequestOtpRequest.userFormatType;
        }
        if ((i & 2) != 0) {
            str2 = mnpRequestOtpRequest.userNameLogin;
        }
        if ((i & 4) != 0) {
            str3 = mnpRequestOtpRequest.subscriberNumber;
        }
        return mnpRequestOtpRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.userFormatType;
    }

    @Nullable
    public final String component2() {
        return this.userNameLogin;
    }

    @Nullable
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final MnpRequestOtpRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new MnpRequestOtpRequest(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MnpRequestOtpRequest) {
            MnpRequestOtpRequest mnpRequestOtpRequest = (MnpRequestOtpRequest) obj;
            return Intrinsics.areEqual(this.userFormatType, mnpRequestOtpRequest.userFormatType) && Intrinsics.areEqual(this.userNameLogin, mnpRequestOtpRequest.userNameLogin) && Intrinsics.areEqual(this.subscriberNumber, mnpRequestOtpRequest.subscriberNumber);
        }
        return false;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserNameLogin() {
        return this.userNameLogin;
    }

    public int hashCode() {
        String str = this.userFormatType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userNameLogin;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subscriberNumber;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.subscriberNumber = str;
    }

    public final void setUserFormatType(@Nullable String str) {
        this.userFormatType = str;
    }

    public final void setUserNameLogin(@Nullable String str) {
        this.userNameLogin = str;
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.userNameLogin;
        String str3 = this.subscriberNumber;
        return "MnpRequestOtpRequest(userFormatType=" + str + ", userNameLogin=" + str2 + ", subscriberNumber=" + str3 + ")";
    }

    public MnpRequestOtpRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.userFormatType = str;
        this.userNameLogin = str2;
        this.subscriberNumber = str3;
    }

    public /* synthetic */ MnpRequestOtpRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}