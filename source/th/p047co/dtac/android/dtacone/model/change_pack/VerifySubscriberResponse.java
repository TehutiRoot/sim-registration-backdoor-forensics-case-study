package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/VerifySubscriberResponse;", "", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "customerNumber", ConstsKt.TELEPHONE_TYPE, "companyCode", "subscriberType", "groupCode", "", "currentPromotion", "Lth/co/dtac/android/dtacone/model/change_pack/CurrentPromotion;", "nextCycl", "nextDay", "toDay", "subscriberStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILth/co/dtac/android/dtacone/model/change_pack/CurrentPromotion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompanyCode", "()Ljava/lang/String;", "getCurrentPromotion", "()Lth/co/dtac/android/dtacone/model/change_pack/CurrentPromotion;", "getCustomerNumber", "getGroupCode", "()I", "getNextCycl", "getNextDay", "getSubscriberNumber", "getSubscriberStatus", "getSubscriberType", "getTelephoneType", "getToDay", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.VerifySubscriberResponse */
/* loaded from: classes8.dex */
public final class VerifySubscriberResponse {
    public static final int $stable = 8;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("currentPromotion")
    @NotNull
    private final CurrentPromotion currentPromotion;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("groupCode")
    private final int groupCode;
    @SerializedName("nextCycl")
    @NotNull
    private final String nextCycl;
    @SerializedName("nextDay")
    @NotNull
    private final String nextDay;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("subscriberStatus")
    @NotNull
    private final String subscriberStatus;
    @SerializedName("subscriberType")
    @NotNull
    private final String subscriberType;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;
    @SerializedName("toDay")
    @NotNull
    private final String toDay;

    public VerifySubscriberResponse(@NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String telephoneType, @NotNull String companyCode, @NotNull String subscriberType, int i, @NotNull CurrentPromotion currentPromotion, @NotNull String nextCycl, @NotNull String nextDay, @NotNull String toDay, @NotNull String subscriberStatus) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(currentPromotion, "currentPromotion");
        Intrinsics.checkNotNullParameter(nextCycl, "nextCycl");
        Intrinsics.checkNotNullParameter(nextDay, "nextDay");
        Intrinsics.checkNotNullParameter(toDay, "toDay");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
        this.telephoneType = telephoneType;
        this.companyCode = companyCode;
        this.subscriberType = subscriberType;
        this.groupCode = i;
        this.currentPromotion = currentPromotion;
        this.nextCycl = nextCycl;
        this.nextDay = nextDay;
        this.toDay = toDay;
        this.subscriberStatus = subscriberStatus;
    }

    @NotNull
    public final String component1() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component10() {
        return this.toDay;
    }

    @NotNull
    public final String component11() {
        return this.subscriberStatus;
    }

    @NotNull
    public final String component2() {
        return this.customerNumber;
    }

    @NotNull
    public final String component3() {
        return this.telephoneType;
    }

    @NotNull
    public final String component4() {
        return this.companyCode;
    }

    @NotNull
    public final String component5() {
        return this.subscriberType;
    }

    public final int component6() {
        return this.groupCode;
    }

    @NotNull
    public final CurrentPromotion component7() {
        return this.currentPromotion;
    }

    @NotNull
    public final String component8() {
        return this.nextCycl;
    }

    @NotNull
    public final String component9() {
        return this.nextDay;
    }

    @NotNull
    public final VerifySubscriberResponse copy(@NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String telephoneType, @NotNull String companyCode, @NotNull String subscriberType, int i, @NotNull CurrentPromotion currentPromotion, @NotNull String nextCycl, @NotNull String nextDay, @NotNull String toDay, @NotNull String subscriberStatus) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(currentPromotion, "currentPromotion");
        Intrinsics.checkNotNullParameter(nextCycl, "nextCycl");
        Intrinsics.checkNotNullParameter(nextDay, "nextDay");
        Intrinsics.checkNotNullParameter(toDay, "toDay");
        Intrinsics.checkNotNullParameter(subscriberStatus, "subscriberStatus");
        return new VerifySubscriberResponse(subscriberNumber, customerNumber, telephoneType, companyCode, subscriberType, i, currentPromotion, nextCycl, nextDay, toDay, subscriberStatus);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerifySubscriberResponse) {
            VerifySubscriberResponse verifySubscriberResponse = (VerifySubscriberResponse) obj;
            return Intrinsics.areEqual(this.subscriberNumber, verifySubscriberResponse.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, verifySubscriberResponse.customerNumber) && Intrinsics.areEqual(this.telephoneType, verifySubscriberResponse.telephoneType) && Intrinsics.areEqual(this.companyCode, verifySubscriberResponse.companyCode) && Intrinsics.areEqual(this.subscriberType, verifySubscriberResponse.subscriberType) && this.groupCode == verifySubscriberResponse.groupCode && Intrinsics.areEqual(this.currentPromotion, verifySubscriberResponse.currentPromotion) && Intrinsics.areEqual(this.nextCycl, verifySubscriberResponse.nextCycl) && Intrinsics.areEqual(this.nextDay, verifySubscriberResponse.nextDay) && Intrinsics.areEqual(this.toDay, verifySubscriberResponse.toDay) && Intrinsics.areEqual(this.subscriberStatus, verifySubscriberResponse.subscriberStatus);
        }
        return false;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final CurrentPromotion getCurrentPromotion() {
        return this.currentPromotion;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    public final int getGroupCode() {
        return this.groupCode;
    }

    @NotNull
    public final String getNextCycl() {
        return this.nextCycl;
    }

    @NotNull
    public final String getNextDay() {
        return this.nextDay;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSubscriberStatus() {
        return this.subscriberStatus;
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
    public final String getToDay() {
        return this.toDay;
    }

    public int hashCode() {
        return (((((((((((((((((((this.subscriberNumber.hashCode() * 31) + this.customerNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.groupCode) * 31) + this.currentPromotion.hashCode()) * 31) + this.nextCycl.hashCode()) * 31) + this.nextDay.hashCode()) * 31) + this.toDay.hashCode()) * 31) + this.subscriberStatus.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.subscriberNumber;
        String str2 = this.customerNumber;
        String str3 = this.telephoneType;
        String str4 = this.companyCode;
        String str5 = this.subscriberType;
        int i = this.groupCode;
        CurrentPromotion currentPromotion = this.currentPromotion;
        String str6 = this.nextCycl;
        String str7 = this.nextDay;
        String str8 = this.toDay;
        String str9 = this.subscriberStatus;
        return "VerifySubscriberResponse(subscriberNumber=" + str + ", customerNumber=" + str2 + ", telephoneType=" + str3 + ", companyCode=" + str4 + ", subscriberType=" + str5 + ", groupCode=" + i + ", currentPromotion=" + currentPromotion + ", nextCycl=" + str6 + ", nextDay=" + str7 + ", toDay=" + str8 + ", subscriberStatus=" + str9 + ")";
    }

    public /* synthetic */ VerifySubscriberResponse(String str, String str2, String str3, String str4, String str5, int i, CurrentPromotion currentPromotion, String str6, String str7, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? 0 : i, currentPromotion, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9);
    }
}
