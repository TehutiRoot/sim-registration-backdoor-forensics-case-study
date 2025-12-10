package th.p047co.dtac.android.dtacone.model.device_sale;

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
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0091\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014¨\u0006A"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/CheckBlockingRequest;", "", "userLan", "", "userCode", "userFormatType", "customerNumber", "newPackageGroupCode", "packageGroupCode", "saveFlag", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, ConstsKt.TELEPHONE_TYPE, "transactionType", "expireFlag", "expireDateTime", "expireOption", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerNumber", "()Ljava/lang/String;", "setCustomerNumber", "(Ljava/lang/String;)V", "getExpireDateTime", "setExpireDateTime", "getExpireFlag", "setExpireFlag", "getExpireOption", "setExpireOption", "getNewPackageGroupCode", "setNewPackageGroupCode", "getPackageGroupCode", "setPackageGroupCode", "getSaveFlag", "setSaveFlag", "getSubscriberNumber", "setSubscriberNumber", "getTelephoneType", "setTelephoneType", "getTransactionType", "setTransactionType", "getUserCode", "setUserCode", "getUserFormatType", "setUserFormatType", "getUserLan", "setUserLan", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.CheckBlockingRequest */
/* loaded from: classes8.dex */
public final class CheckBlockingRequest {
    public static final int $stable = 8;
    @SerializedName("customerNumber")
    @NotNull
    private String customerNumber;
    @SerializedName("expireDateTime")
    @Nullable
    private String expireDateTime;
    @SerializedName("expireFlag")
    @Nullable
    private String expireFlag;
    @SerializedName("expireOption")
    @Nullable
    private String expireOption;
    @SerializedName("newPackageGroupCode")
    @NotNull
    private String newPackageGroupCode;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;
    @SerializedName("saveFlag")
    @NotNull
    private String saveFlag;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private String subscriberNumber;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private String telephoneType;
    @SerializedName("transactionType")
    @NotNull
    private String transactionType;
    @SerializedName("userCode")
    @NotNull
    private String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private String userFormatType;
    @SerializedName("userLan")
    @NotNull
    private String userLan;

    public CheckBlockingRequest(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String customerNumber, @NotNull String newPackageGroupCode, @NotNull String packageGroupCode, @NotNull String saveFlag, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String transactionType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(newPackageGroupCode, "newPackageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(saveFlag, "saveFlag");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.userLan = userLan;
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.customerNumber = customerNumber;
        this.newPackageGroupCode = newPackageGroupCode;
        this.packageGroupCode = packageGroupCode;
        this.saveFlag = saveFlag;
        this.subscriberNumber = subscriberNumber;
        this.telephoneType = telephoneType;
        this.transactionType = transactionType;
        this.expireFlag = str;
        this.expireDateTime = str2;
        this.expireOption = str3;
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component10() {
        return this.transactionType;
    }

    @Nullable
    public final String component11() {
        return this.expireFlag;
    }

    @Nullable
    public final String component12() {
        return this.expireDateTime;
    }

    @Nullable
    public final String component13() {
        return this.expireOption;
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
        return this.customerNumber;
    }

    @NotNull
    public final String component5() {
        return this.newPackageGroupCode;
    }

    @NotNull
    public final String component6() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component7() {
        return this.saveFlag;
    }

    @NotNull
    public final String component8() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component9() {
        return this.telephoneType;
    }

    @NotNull
    public final CheckBlockingRequest copy(@NotNull String userLan, @NotNull String userCode, @NotNull String userFormatType, @NotNull String customerNumber, @NotNull String newPackageGroupCode, @NotNull String packageGroupCode, @NotNull String saveFlag, @NotNull String subscriberNumber, @NotNull String telephoneType, @NotNull String transactionType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(newPackageGroupCode, "newPackageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(saveFlag, "saveFlag");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        return new CheckBlockingRequest(userLan, userCode, userFormatType, customerNumber, newPackageGroupCode, packageGroupCode, saveFlag, subscriberNumber, telephoneType, transactionType, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckBlockingRequest) {
            CheckBlockingRequest checkBlockingRequest = (CheckBlockingRequest) obj;
            return Intrinsics.areEqual(this.userLan, checkBlockingRequest.userLan) && Intrinsics.areEqual(this.userCode, checkBlockingRequest.userCode) && Intrinsics.areEqual(this.userFormatType, checkBlockingRequest.userFormatType) && Intrinsics.areEqual(this.customerNumber, checkBlockingRequest.customerNumber) && Intrinsics.areEqual(this.newPackageGroupCode, checkBlockingRequest.newPackageGroupCode) && Intrinsics.areEqual(this.packageGroupCode, checkBlockingRequest.packageGroupCode) && Intrinsics.areEqual(this.saveFlag, checkBlockingRequest.saveFlag) && Intrinsics.areEqual(this.subscriberNumber, checkBlockingRequest.subscriberNumber) && Intrinsics.areEqual(this.telephoneType, checkBlockingRequest.telephoneType) && Intrinsics.areEqual(this.transactionType, checkBlockingRequest.transactionType) && Intrinsics.areEqual(this.expireFlag, checkBlockingRequest.expireFlag) && Intrinsics.areEqual(this.expireDateTime, checkBlockingRequest.expireDateTime) && Intrinsics.areEqual(this.expireOption, checkBlockingRequest.expireOption);
        }
        return false;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getExpireDateTime() {
        return this.expireDateTime;
    }

    @Nullable
    public final String getExpireFlag() {
        return this.expireFlag;
    }

    @Nullable
    public final String getExpireOption() {
        return this.expireOption;
    }

    @NotNull
    public final String getNewPackageGroupCode() {
        return this.newPackageGroupCode;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getSaveFlag() {
        return this.saveFlag;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    @NotNull
    public final String getTransactionType() {
        return this.transactionType;
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
        int hashCode = ((((((((((((((((((this.userLan.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userFormatType.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.newPackageGroupCode.hashCode()) * 31) + this.packageGroupCode.hashCode()) * 31) + this.saveFlag.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.transactionType.hashCode()) * 31;
        String str = this.expireFlag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expireDateTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expireOption;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCustomerNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.customerNumber = str;
    }

    public final void setExpireDateTime(@Nullable String str) {
        this.expireDateTime = str;
    }

    public final void setExpireFlag(@Nullable String str) {
        this.expireFlag = str;
    }

    public final void setExpireOption(@Nullable String str) {
        this.expireOption = str;
    }

    public final void setNewPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newPackageGroupCode = str;
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    public final void setSaveFlag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.saveFlag = str;
    }

    public final void setSubscriberNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscriberNumber = str;
    }

    public final void setTelephoneType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.telephoneType = str;
    }

    public final void setTransactionType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionType = str;
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
        String str3 = this.userFormatType;
        String str4 = this.customerNumber;
        String str5 = this.newPackageGroupCode;
        String str6 = this.packageGroupCode;
        String str7 = this.saveFlag;
        String str8 = this.subscriberNumber;
        String str9 = this.telephoneType;
        String str10 = this.transactionType;
        String str11 = this.expireFlag;
        String str12 = this.expireDateTime;
        String str13 = this.expireOption;
        return "CheckBlockingRequest(userLan=" + str + ", userCode=" + str2 + ", userFormatType=" + str3 + ", customerNumber=" + str4 + ", newPackageGroupCode=" + str5 + ", packageGroupCode=" + str6 + ", saveFlag=" + str7 + ", subscriberNumber=" + str8 + ", telephoneType=" + str9 + ", transactionType=" + str10 + ", expireFlag=" + str11 + ", expireDateTime=" + str12 + ", expireOption=" + str13 + ")";
    }

    public /* synthetic */ CheckBlockingRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, str4, str5, str6, str7, str8, str9, str10, (i & 1024) != 0 ? "N" : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13);
    }
}