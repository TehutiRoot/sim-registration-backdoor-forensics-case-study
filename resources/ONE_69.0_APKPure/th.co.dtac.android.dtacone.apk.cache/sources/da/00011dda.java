package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/PermitCheckProfileRequest;", "", "userLan", "", "userCode", "omrLocation", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "idNumber", "userFormatType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "setIdNumber", "(Ljava/lang/String;)V", "getOmrLocation", "setOmrLocation", "getSubscriberNumber", "setSubscriberNumber", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.PermitCheckProfileRequest */
/* loaded from: classes8.dex */
public final class PermitCheckProfileRequest {
    public static final int $stable = 8;
    @SerializedName("idNumber")
    @NotNull
    private String idNumber;
    @SerializedName("omrLocation")
    @NotNull
    private String omrLocation;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public PermitCheckProfileRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String omrLocation, @NotNull String subscriberNumber, @NotNull String idNumber, @NotNull String userFormatType) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(omrLocation, "omrLocation");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        this.userLan = userLan;
        this.userCode = userCode;
        this.omrLocation = omrLocation;
        this.subscriberNumber = subscriberNumber;
        this.idNumber = idNumber;
        this.userFormatType = userFormatType;
    }

    public static /* synthetic */ PermitCheckProfileRequest copy$default(PermitCheckProfileRequest permitCheckProfileRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permitCheckProfileRequest.userLan;
        }
        if ((i & 2) != 0) {
            str2 = permitCheckProfileRequest.userCode;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = permitCheckProfileRequest.omrLocation;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = permitCheckProfileRequest.subscriberNumber;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = permitCheckProfileRequest.idNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = permitCheckProfileRequest.userFormatType;
        }
        return permitCheckProfileRequest.copy(str, str7, str8, str9, str10, str6);
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
        return this.omrLocation;
    }

    @NotNull
    public final String component4() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component5() {
        return this.idNumber;
    }

    @NotNull
    public final String component6() {
        return this.userFormatType;
    }

    @NotNull
    public final PermitCheckProfileRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String omrLocation, @NotNull String subscriberNumber, @NotNull String idNumber, @NotNull String userFormatType) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(omrLocation, "omrLocation");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        return new PermitCheckProfileRequest(userLan, userCode, omrLocation, subscriberNumber, idNumber, userFormatType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PermitCheckProfileRequest) {
            PermitCheckProfileRequest permitCheckProfileRequest = (PermitCheckProfileRequest) obj;
            return Intrinsics.areEqual(this.userLan, permitCheckProfileRequest.userLan) && Intrinsics.areEqual(this.userCode, permitCheckProfileRequest.userCode) && Intrinsics.areEqual(this.omrLocation, permitCheckProfileRequest.omrLocation) && Intrinsics.areEqual(this.subscriberNumber, permitCheckProfileRequest.subscriberNumber) && Intrinsics.areEqual(this.idNumber, permitCheckProfileRequest.idNumber) && Intrinsics.areEqual(this.userFormatType, permitCheckProfileRequest.userFormatType);
        }
        return false;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getOmrLocation() {
        return this.omrLocation;
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
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.omrLocation.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.idNumber.hashCode()) * 31) + this.userFormatType.hashCode();
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNumber = str;
    }

    public final void setOmrLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.omrLocation = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setUserCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userCode = str;
    }

    public final void setUserFormatType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userFormatType = str;
    }

    public final void setUserLan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userLan = str;
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.omrLocation;
        String str4 = this.subscriberNumber;
        String str5 = this.idNumber;
        String str6 = this.userFormatType;
        return "PermitCheckProfileRequest(userLan=" + str + ", userCode=" + str2 + ", omrLocation=" + str3 + ", subscriberNumber=" + str4 + ", idNumber=" + str5 + ", userFormatType=" + str6 + ")";
    }

    public /* synthetic */ PermitCheckProfileRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, str6);
    }
}