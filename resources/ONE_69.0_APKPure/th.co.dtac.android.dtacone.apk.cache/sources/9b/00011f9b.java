package th.p047co.dtac.android.dtacone.model.otp.verify;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/otp/verify/VerifyWithDeviceBody;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "otp", "(Ljava/lang/String;Ljava/lang/String;)V", "getOtp", "()Ljava/lang/String;", "setOtp", "(Ljava/lang/String;)V", "getSubscriberNumber", "setSubscriberNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.otp.verify.VerifyWithDeviceBody */
/* loaded from: classes8.dex */
public final class VerifyWithDeviceBody {
    public static final int $stable = 8;
    @SerializedName("otp")
    @Nullable
    private String otp;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private String subscriberNumber;

    public VerifyWithDeviceBody() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ VerifyWithDeviceBody copy$default(VerifyWithDeviceBody verifyWithDeviceBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyWithDeviceBody.subscriberNumber;
        }
        if ((i & 2) != 0) {
            str2 = verifyWithDeviceBody.otp;
        }
        return verifyWithDeviceBody.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component2() {
        return this.otp;
    }

    @NotNull
    public final VerifyWithDeviceBody copy(@Nullable String str, @Nullable String str2) {
        return new VerifyWithDeviceBody(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifyWithDeviceBody) {
            VerifyWithDeviceBody verifyWithDeviceBody = (VerifyWithDeviceBody) obj;
            return Intrinsics.areEqual(this.subscriberNumber, verifyWithDeviceBody.subscriberNumber) && Intrinsics.areEqual(this.otp, verifyWithDeviceBody.otp);
        }
        return false;
    }

    @Nullable
    public final String getOtp() {
        return this.otp;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        String str = this.subscriberNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.otp;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOtp(@Nullable String str) {
        this.otp = str;
    }

    public final void setSubscriberNumber(@Nullable String str) {
        this.subscriberNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        String str2 = this.otp;
        return "VerifyWithDeviceBody(subscriberNumber=" + str + ", otp=" + str2 + ")";
    }

    public VerifyWithDeviceBody(@Nullable String str, @Nullable String str2) {
        this.subscriberNumber = str;
        this.otp = str2;
    }

    public /* synthetic */ VerifyWithDeviceBody(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}