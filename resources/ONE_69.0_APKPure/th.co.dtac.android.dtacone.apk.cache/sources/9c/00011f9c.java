package th.p047co.dtac.android.dtacone.model.otp_v3.request;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/otp_v3/request/OtpV3Model;", "", "mobileNumber", "", "href", "(Ljava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "setHref", "(Ljava/lang/String;)V", "getMobileNumber", "setMobileNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.otp_v3.request.OtpV3Model */
/* loaded from: classes8.dex */
public final class OtpV3Model {
    public static final int $stable = 8;
    @Nullable
    private String href;
    @Nullable
    private String mobileNumber;

    public OtpV3Model() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OtpV3Model copy$default(OtpV3Model otpV3Model, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otpV3Model.mobileNumber;
        }
        if ((i & 2) != 0) {
            str2 = otpV3Model.href;
        }
        return otpV3Model.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.mobileNumber;
    }

    @Nullable
    public final String component2() {
        return this.href;
    }

    @NotNull
    public final OtpV3Model copy(@Nullable String str, @Nullable String str2) {
        return new OtpV3Model(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OtpV3Model) {
            OtpV3Model otpV3Model = (OtpV3Model) obj;
            return Intrinsics.areEqual(this.mobileNumber, otpV3Model.mobileNumber) && Intrinsics.areEqual(this.href, otpV3Model.href);
        }
        return false;
    }

    @Nullable
    public final String getHref() {
        return this.href;
    }

    @Nullable
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public int hashCode() {
        String str = this.mobileNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.href;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setHref(@Nullable String str) {
        this.href = str;
    }

    public final void setMobileNumber(@Nullable String str) {
        this.mobileNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.mobileNumber;
        String str2 = this.href;
        return "OtpV3Model(mobileNumber=" + str + ", href=" + str2 + ")";
    }

    public OtpV3Model(@Nullable String str, @Nullable String str2) {
        this.mobileNumber = str;
        this.href = str2;
    }

    public /* synthetic */ OtpV3Model(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}