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
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J©\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006<"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/SaveExtraPackage;", "", "userFormatType", "", "userCode", "userLan", "userName", "channel", "locationCode", "rtrName", "rtrCode", "subChannel", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "companyCode", "subscriberType", ConstsKt.TELEPHONE_TYPE, "packageCode", "packageDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getCompanyCode", "getCustomerNumber", "getLocationCode", "getPackageCode", "getPackageDescription", "getRtrCode", "getRtrName", "getSubChannel", "getSubscriberNumber", "getSubscriberType", "getTelephoneType", "getUserCode", "getUserFormatType", "getUserLan", "getUserName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.SaveExtraPackage */
/* loaded from: classes8.dex */
public final class SaveExtraPackage {
    public static final int $stable = 0;
    @SerializedName("channel")
    @NotNull
    private final String channel;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("locationCode")
    @NotNull
    private final String locationCode;
    @SerializedName("packageCode")
    @NotNull
    private final String packageCode;
    @SerializedName("packageDescription")
    @NotNull
    private final String packageDescription;
    @SerializedName("rtrCode")
    @NotNull
    private final String rtrCode;
    @SerializedName("rtrName")
    @NotNull
    private final String rtrName;
    @SerializedName("subChannel")
    @NotNull
    private final String subChannel;
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
    @SerializedName("userName")
    @NotNull
    private final String userName;

    public SaveExtraPackage(@NotNull String userFormatType, @NotNull String userCode, @NotNull String userLan, @NotNull String userName, @NotNull String channel, @NotNull String locationCode, @NotNull String rtrName, @NotNull String rtrCode, @NotNull String subChannel, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String companyCode, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String packageCode, @NotNull String packageDescription) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        this.userFormatType = userFormatType;
        this.userCode = userCode;
        this.userLan = userLan;
        this.userName = userName;
        this.channel = channel;
        this.locationCode = locationCode;
        this.rtrName = rtrName;
        this.rtrCode = rtrCode;
        this.subChannel = subChannel;
        this.subscriberNumber = subscriberNumber;
        this.customerNumber = customerNumber;
        this.companyCode = companyCode;
        this.subscriberType = subscriberType;
        this.telephoneType = telephoneType;
        this.packageCode = packageCode;
        this.packageDescription = packageDescription;
    }

    @NotNull
    public final String component1() {
        return this.userFormatType;
    }

    @NotNull
    public final String component10() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component11() {
        return this.customerNumber;
    }

    @NotNull
    public final String component12() {
        return this.companyCode;
    }

    @NotNull
    public final String component13() {
        return this.subscriberType;
    }

    @NotNull
    public final String component14() {
        return this.telephoneType;
    }

    @NotNull
    public final String component15() {
        return this.packageCode;
    }

    @NotNull
    public final String component16() {
        return this.packageDescription;
    }

    @NotNull
    public final String component2() {
        return this.userCode;
    }

    @NotNull
    public final String component3() {
        return this.userLan;
    }

    @NotNull
    public final String component4() {
        return this.userName;
    }

    @NotNull
    public final String component5() {
        return this.channel;
    }

    @NotNull
    public final String component6() {
        return this.locationCode;
    }

    @NotNull
    public final String component7() {
        return this.rtrName;
    }

    @NotNull
    public final String component8() {
        return this.rtrCode;
    }

    @NotNull
    public final String component9() {
        return this.subChannel;
    }

    @NotNull
    public final SaveExtraPackage copy(@NotNull String userFormatType, @NotNull String userCode, @NotNull String userLan, @NotNull String userName, @NotNull String channel, @NotNull String locationCode, @NotNull String rtrName, @NotNull String rtrCode, @NotNull String subChannel, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String companyCode, @NotNull String subscriberType, @NotNull String telephoneType, @NotNull String packageCode, @NotNull String packageDescription) {
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(rtrName, "rtrName");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        Intrinsics.checkNotNullParameter(subChannel, "subChannel");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(subscriberType, "subscriberType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageDescription, "packageDescription");
        return new SaveExtraPackage(userFormatType, userCode, userLan, userName, channel, locationCode, rtrName, rtrCode, subChannel, subscriberNumber, customerNumber, companyCode, subscriberType, telephoneType, packageCode, packageDescription);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveExtraPackage) {
            SaveExtraPackage saveExtraPackage = (SaveExtraPackage) obj;
            return Intrinsics.areEqual(this.userFormatType, saveExtraPackage.userFormatType) && Intrinsics.areEqual(this.userCode, saveExtraPackage.userCode) && Intrinsics.areEqual(this.userLan, saveExtraPackage.userLan) && Intrinsics.areEqual(this.userName, saveExtraPackage.userName) && Intrinsics.areEqual(this.channel, saveExtraPackage.channel) && Intrinsics.areEqual(this.locationCode, saveExtraPackage.locationCode) && Intrinsics.areEqual(this.rtrName, saveExtraPackage.rtrName) && Intrinsics.areEqual(this.rtrCode, saveExtraPackage.rtrCode) && Intrinsics.areEqual(this.subChannel, saveExtraPackage.subChannel) && Intrinsics.areEqual(this.subscriberNumber, saveExtraPackage.subscriberNumber) && Intrinsics.areEqual(this.customerNumber, saveExtraPackage.customerNumber) && Intrinsics.areEqual(this.companyCode, saveExtraPackage.companyCode) && Intrinsics.areEqual(this.subscriberType, saveExtraPackage.subscriberType) && Intrinsics.areEqual(this.telephoneType, saveExtraPackage.telephoneType) && Intrinsics.areEqual(this.packageCode, saveExtraPackage.packageCode) && Intrinsics.areEqual(this.packageDescription, saveExtraPackage.packageDescription);
        }
        return false;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getLocationCode() {
        return this.locationCode;
    }

    @NotNull
    public final String getPackageCode() {
        return this.packageCode;
    }

    @NotNull
    public final String getPackageDescription() {
        return this.packageDescription;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    @NotNull
    public final String getRtrName() {
        return this.rtrName;
    }

    @NotNull
    public final String getSubChannel() {
        return this.subChannel;
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

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.userFormatType.hashCode() * 31) + this.userCode.hashCode()) * 31) + this.userLan.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.locationCode.hashCode()) * 31) + this.rtrName.hashCode()) * 31) + this.rtrCode.hashCode()) * 31) + this.subChannel.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.subscriberType.hashCode()) * 31) + this.telephoneType.hashCode()) * 31) + this.packageCode.hashCode()) * 31) + this.packageDescription.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userFormatType;
        String str2 = this.userCode;
        String str3 = this.userLan;
        String str4 = this.userName;
        String str5 = this.channel;
        String str6 = this.locationCode;
        String str7 = this.rtrName;
        String str8 = this.rtrCode;
        String str9 = this.subChannel;
        String str10 = this.subscriberNumber;
        String str11 = this.customerNumber;
        String str12 = this.companyCode;
        String str13 = this.subscriberType;
        String str14 = this.telephoneType;
        String str15 = this.packageCode;
        String str16 = this.packageDescription;
        return "SaveExtraPackage(userFormatType=" + str + ", userCode=" + str2 + ", userLan=" + str3 + ", userName=" + str4 + ", channel=" + str5 + ", locationCode=" + str6 + ", rtrName=" + str7 + ", rtrCode=" + str8 + ", subChannel=" + str9 + ", subscriberNumber=" + str10 + ", customerNumber=" + str11 + ", companyCode=" + str12 + ", subscriberType=" + str13 + ", telephoneType=" + str14 + ", packageCode=" + str15 + ", packageDescription=" + str16 + ")";
    }
}