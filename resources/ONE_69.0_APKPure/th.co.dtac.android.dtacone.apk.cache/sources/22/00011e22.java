package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetAdditionalPackageGroupRequest;", "", "userLan", "", "userCode", "userFormatType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "subscriberType", ConstsKt.TELEPHONE_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubscriberNumber", "()Ljava/lang/String;", "getSubscriberType", "getTelephoneType", "getUserCode", "getUserFormatType", "getUserLan", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetAdditionalPackageGroupRequest */
/* loaded from: classes8.dex */
public final class GetAdditionalPackageGroupRequest {
    public static final int $stable = 0;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("subscriberType")
    @NotNull
    private final String subscriberType;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetAdditionalPackageGroupRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String subscriberNumber, @NotNull String subscriberType, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        this.userLan = userLan;
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.subscriberNumber = subscriberNumber;
        this.subscriberType = subscriberType;
        this.telephoneType = telephoneType;
    }

    public static /* synthetic */ GetAdditionalPackageGroupRequest copy$default(GetAdditionalPackageGroupRequest getAdditionalPackageGroupRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAdditionalPackageGroupRequest.userLan;
        }
        if ((i & 2) != 0) {
            str2 = getAdditionalPackageGroupRequest.userCode;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getAdditionalPackageGroupRequest.userFormatType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getAdditionalPackageGroupRequest.subscriberNumber;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getAdditionalPackageGroupRequest.subscriberType;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = getAdditionalPackageGroupRequest.telephoneType;
        }
        return getAdditionalPackageGroupRequest.copy(str, str7, str8, str9, str10, str6);
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
        return this.userFormatType;
    }

    @NotNull
    public final String component4() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component5() {
        return this.subscriberType;
    }

    @NotNull
    public final String component6() {
        return this.telephoneType;
    }

    @NotNull
    public final GetAdditionalPackageGroupRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String subscriberNumber, @NotNull String subscriberType, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        return new GetAdditionalPackageGroupRequest(userLan, userCode, userFormatType, subscriberNumber, subscriberType, telephoneType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAdditionalPackageGroupRequest) {
            GetAdditionalPackageGroupRequest getAdditionalPackageGroupRequest = (GetAdditionalPackageGroupRequest) obj;
            return Intrinsics.areEqual(this.userLan, getAdditionalPackageGroupRequest.userLan) && Intrinsics.areEqual(this.userCode, getAdditionalPackageGroupRequest.userCode) && Intrinsics.areEqual(this.userFormatType, getAdditionalPackageGroupRequest.userFormatType) && Intrinsics.areEqual(this.subscriberNumber, getAdditionalPackageGroupRequest.subscriberNumber) && Intrinsics.areEqual(this.subscriberType, getAdditionalPackageGroupRequest.subscriberType) && Intrinsics.areEqual(this.telephoneType, getAdditionalPackageGroupRequest.telephoneType);
        }
        return false;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberType() {
        return this.subscriberType;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
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
        return (((((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.telephoneType.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.userCode;
        String str3 = this.userFormatType;
        String str4 = this.subscriberNumber;
        String str5 = this.subscriberType;
        String str6 = this.telephoneType;
        return "GetAdditionalPackageGroupRequest(userLan=" + str + ", userCode=" + str2 + ", userFormatType=" + str3 + ", subscriberNumber=" + str4 + ", subscriberType=" + str5 + ", telephoneType=" + str6 + ")";
    }
}