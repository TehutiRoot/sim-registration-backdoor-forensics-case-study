package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/CheckExternalBlacklistFlagRequest;", "", "userCode", "", "functionID", "idNumber", "idType", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "getFunctionID", "getIdNumber", "getIdType", "getSubscriberNumber", "getUserCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.CheckExternalBlacklistFlagRequest */
/* loaded from: classes8.dex */
public final class CheckExternalBlacklistFlagRequest {
    public static final int $stable = 0;
    @SerializedName("customerNumber")
    @Nullable
    private final String customerNumber;
    @SerializedName("functionID")
    @NotNull
    private final String functionID;
    @SerializedName("idNumber")
    @NotNull
    private final String idNumber;
    @SerializedName("idType")
    @NotNull
    private final String idType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;

    public CheckExternalBlacklistFlagRequest(@NotNull String userCode, @NotNull String functionID, @NotNull String idNumber, @NotNull String idType, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(functionID, "functionID");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idType, "idType");
        this.userCode = userCode;
        this.functionID = functionID;
        this.idNumber = idNumber;
        this.idType = idType;
        this.subscriberNumber = str;
        this.customerNumber = str2;
    }

    public static /* synthetic */ CheckExternalBlacklistFlagRequest copy$default(CheckExternalBlacklistFlagRequest checkExternalBlacklistFlagRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkExternalBlacklistFlagRequest.userCode;
        }
        if ((i & 2) != 0) {
            str2 = checkExternalBlacklistFlagRequest.functionID;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = checkExternalBlacklistFlagRequest.idNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = checkExternalBlacklistFlagRequest.idType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = checkExternalBlacklistFlagRequest.subscriberNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = checkExternalBlacklistFlagRequest.customerNumber;
        }
        return checkExternalBlacklistFlagRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.userCode;
    }

    @NotNull
    public final String component2() {
        return this.functionID;
    }

    @NotNull
    public final String component3() {
        return this.idNumber;
    }

    @NotNull
    public final String component4() {
        return this.idType;
    }

    @Nullable
    public final String component5() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component6() {
        return this.customerNumber;
    }

    @NotNull
    public final CheckExternalBlacklistFlagRequest copy(@NotNull String userCode, @NotNull String functionID, @NotNull String idNumber, @NotNull String idType, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(functionID, "functionID");
        Intrinsics.checkNotNullParameter(idNumber, "idNumber");
        Intrinsics.checkNotNullParameter(idType, "idType");
        return new CheckExternalBlacklistFlagRequest(userCode, functionID, idNumber, idType, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckExternalBlacklistFlagRequest) {
            CheckExternalBlacklistFlagRequest checkExternalBlacklistFlagRequest = (CheckExternalBlacklistFlagRequest) obj;
            return Intrinsics.areEqual(this.userCode, checkExternalBlacklistFlagRequest.userCode) && Intrinsics.areEqual(this.functionID, checkExternalBlacklistFlagRequest.functionID) && Intrinsics.areEqual(this.idNumber, checkExternalBlacklistFlagRequest.idNumber) && Intrinsics.areEqual(this.idType, checkExternalBlacklistFlagRequest.idType) && Intrinsics.areEqual(this.subscriberNumber, checkExternalBlacklistFlagRequest.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, checkExternalBlacklistFlagRequest.customerNumber);
        }
        return false;
    }

    @Nullable
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getFunctionID() {
        return this.functionID;
    }

    @NotNull
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getIdType() {
        return this.idType;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        int hashCode = ((((((this.userCode.hashCode() * 31) + this.functionID.hashCode()) * 31) + this.idNumber.hashCode()) * 31) + this.idType.hashCode()) * 31;
        String str = this.subscriberNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerNumber;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.functionID;
        String str3 = this.idNumber;
        String str4 = this.idType;
        String str5 = this.subscriberNumber;
        String str6 = this.customerNumber;
        return "CheckExternalBlacklistFlagRequest(userCode=" + str + ", functionID=" + str2 + ", idNumber=" + str3 + ", idType=" + str4 + ", subscriberNumber=" + str5 + ", customerNumber=" + str6 + ")";
    }

    public /* synthetic */ CheckExternalBlacklistFlagRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}