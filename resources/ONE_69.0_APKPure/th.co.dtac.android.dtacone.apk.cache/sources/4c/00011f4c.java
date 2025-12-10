package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/ValidatePackageGroupCodeResponse;", "", "packageGroupCode", "", "packageGroupDescription", "switchOnReasonCode", "switchOnReasonDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageGroupCode", "()Ljava/lang/String;", "setPackageGroupCode", "(Ljava/lang/String;)V", "getPackageGroupDescription", "setPackageGroupDescription", "getSwitchOnReasonCode", "setSwitchOnReasonCode", "getSwitchOnReasonDescription", "setSwitchOnReasonDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.ValidatePackageGroupCodeResponse */
/* loaded from: classes8.dex */
public final class ValidatePackageGroupCodeResponse {
    public static final int $stable = 8;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;
    @SerializedName("packageGroupDescription")
    @NotNull
    private String packageGroupDescription;
    @SerializedName("switchOnReasonCode")
    @NotNull
    private String switchOnReasonCode;
    @SerializedName("switchOnReasonDescription")
    @NotNull
    private String switchOnReasonDescription;

    public ValidatePackageGroupCodeResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ValidatePackageGroupCodeResponse copy$default(ValidatePackageGroupCodeResponse validatePackageGroupCodeResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validatePackageGroupCodeResponse.packageGroupCode;
        }
        if ((i & 2) != 0) {
            str2 = validatePackageGroupCodeResponse.packageGroupDescription;
        }
        if ((i & 4) != 0) {
            str3 = validatePackageGroupCodeResponse.switchOnReasonCode;
        }
        if ((i & 8) != 0) {
            str4 = validatePackageGroupCodeResponse.switchOnReasonDescription;
        }
        return validatePackageGroupCodeResponse.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component2() {
        return this.packageGroupDescription;
    }

    @NotNull
    public final String component3() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String component4() {
        return this.switchOnReasonDescription;
    }

    @NotNull
    public final ValidatePackageGroupCodeResponse copy(@NotNull String packageGroupCode, @NotNull String packageGroupDescription, @NotNull String switchOnReasonCode, @NotNull String switchOnReasonDescription) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescription, "packageGroupDescription");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(switchOnReasonDescription, "switchOnReasonDescription");
        return new ValidatePackageGroupCodeResponse(packageGroupCode, packageGroupDescription, switchOnReasonCode, switchOnReasonDescription);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidatePackageGroupCodeResponse) {
            ValidatePackageGroupCodeResponse validatePackageGroupCodeResponse = (ValidatePackageGroupCodeResponse) obj;
            return Intrinsics.areEqual(this.packageGroupCode, validatePackageGroupCodeResponse.packageGroupCode) && Intrinsics.areEqual(this.packageGroupDescription, validatePackageGroupCodeResponse.packageGroupDescription) && Intrinsics.areEqual(this.switchOnReasonCode, validatePackageGroupCodeResponse.switchOnReasonCode) && Intrinsics.areEqual(this.switchOnReasonDescription, validatePackageGroupCodeResponse.switchOnReasonDescription);
        }
        return false;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getPackageGroupDescription() {
        return this.packageGroupDescription;
    }

    @NotNull
    public final String getSwitchOnReasonCode() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String getSwitchOnReasonDescription() {
        return this.switchOnReasonDescription;
    }

    public int hashCode() {
        return (((((this.packageGroupCode.hashCode() * 31) + this.packageGroupDescription.hashCode()) * 31) + this.switchOnReasonCode.hashCode()) * 31) + this.switchOnReasonDescription.hashCode();
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    public final void setPackageGroupDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupDescription = str;
    }

    public final void setSwitchOnReasonCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnReasonCode = str;
    }

    public final void setSwitchOnReasonDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnReasonDescription = str;
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupCode;
        String str2 = this.packageGroupDescription;
        String str3 = this.switchOnReasonCode;
        String str4 = this.switchOnReasonDescription;
        return "ValidatePackageGroupCodeResponse(packageGroupCode=" + str + ", packageGroupDescription=" + str2 + ", switchOnReasonCode=" + str3 + ", switchOnReasonDescription=" + str4 + ")";
    }

    public ValidatePackageGroupCodeResponse(@NotNull String packageGroupCode, @NotNull String packageGroupDescription, @NotNull String switchOnReasonCode, @NotNull String switchOnReasonDescription) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescription, "packageGroupDescription");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(switchOnReasonDescription, "switchOnReasonDescription");
        this.packageGroupCode = packageGroupCode;
        this.packageGroupDescription = packageGroupDescription;
        this.switchOnReasonCode = switchOnReasonCode;
        this.switchOnReasonDescription = switchOnReasonDescription;
    }

    public /* synthetic */ ValidatePackageGroupCodeResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}