package th.p047co.dtac.android.dtacone.model.force_change_password;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/force_change_password/ForceChangeOtpPassword;", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "rtrCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "getRtrCode", "setRtrCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.force_change_password.ForceChangeOtpPassword */
/* loaded from: classes8.dex */
public final class ForceChangeOtpPassword {
    public static final int $stable = 8;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String rtrCode;

    public ForceChangeOtpPassword(@NotNull String phoneNumber, @NotNull String rtrCode) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        this.phoneNumber = phoneNumber;
        this.rtrCode = rtrCode;
    }

    public static /* synthetic */ ForceChangeOtpPassword copy$default(ForceChangeOtpPassword forceChangeOtpPassword, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forceChangeOtpPassword.phoneNumber;
        }
        if ((i & 2) != 0) {
            str2 = forceChangeOtpPassword.rtrCode;
        }
        return forceChangeOtpPassword.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.phoneNumber;
    }

    @NotNull
    public final String component2() {
        return this.rtrCode;
    }

    @NotNull
    public final ForceChangeOtpPassword copy(@NotNull String phoneNumber, @NotNull String rtrCode) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        return new ForceChangeOtpPassword(phoneNumber, rtrCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForceChangeOtpPassword) {
            ForceChangeOtpPassword forceChangeOtpPassword = (ForceChangeOtpPassword) obj;
            return Intrinsics.areEqual(this.phoneNumber, forceChangeOtpPassword.phoneNumber) && Intrinsics.areEqual(this.rtrCode, forceChangeOtpPassword.rtrCode);
        }
        return false;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    public int hashCode() {
        return (this.phoneNumber.hashCode() * 31) + this.rtrCode.hashCode();
    }

    public final void setPhoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final void setRtrCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtrCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.phoneNumber;
        String str2 = this.rtrCode;
        return "ForceChangeOtpPassword(phoneNumber=" + str + ", rtrCode=" + str2 + ")";
    }
}