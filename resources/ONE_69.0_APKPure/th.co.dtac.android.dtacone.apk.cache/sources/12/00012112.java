package th.p047co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u00ad\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J±\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u00103\u001a\u000204H\u0016J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000204HÖ\u0001J\t\u0010:\u001a\u00020\u0006HÖ\u0001J\u0018\u0010;\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010=\u001a\u000204H\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u0006?"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CustomerInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "packageNameTitle", "", "packageNameValue", "validityTitle", "validityValue", "discountTitle", "deviceNameValue", "advancePaymentValue", "subsciberValue", "advancePaymentTitle", "imeiValue", "imeiTitle", "deviceNameTitle", "subsciberTitle", "discountValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvancePaymentTitle", "()Ljava/lang/String;", "getAdvancePaymentValue", "getDeviceNameTitle", "getDeviceNameValue", "getDiscountTitle", "getDiscountValue", "getImeiTitle", "getImeiValue", "getPackageNameTitle", "getPackageNameValue", "getSubsciberTitle", "getSubsciberValue", "getValidityTitle", "getValidityValue", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.CustomerInfo */
/* loaded from: classes8.dex */
public final class CustomerInfo implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("advancePaymentTitle")
    @Nullable
    private final String advancePaymentTitle;
    @SerializedName("advancePaymentValue")
    @Nullable
    private final String advancePaymentValue;
    @SerializedName("deviceNameTitle")
    @Nullable
    private final String deviceNameTitle;
    @SerializedName("deviceNameValue")
    @Nullable
    private final String deviceNameValue;
    @SerializedName("discountTitle")
    @Nullable
    private final String discountTitle;
    @SerializedName("discountValue")
    @Nullable
    private final String discountValue;
    @SerializedName("imeiTitle")
    @Nullable
    private final String imeiTitle;
    @SerializedName("imeiValue")
    @Nullable
    private final String imeiValue;
    @SerializedName("packageNameTitle")
    @Nullable
    private final String packageNameTitle;
    @SerializedName("packageNameValue")
    @Nullable
    private final String packageNameValue;
    @SerializedName("subsciberTitle")
    @Nullable
    private final String subsciberTitle;
    @SerializedName("subsciberValue")
    @Nullable
    private final String subsciberValue;
    @SerializedName("validityTitle")
    @Nullable
    private final String validityTitle;
    @SerializedName("validityValue")
    @Nullable
    private final String validityValue;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CustomerInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CustomerInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/CustomerInfo;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.CustomerInfo$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<CustomerInfo> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CustomerInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CustomerInfo[] newArray(int i) {
            return new CustomerInfo[i];
        }
    }

    public CustomerInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Nullable
    public final String component1() {
        return this.packageNameTitle;
    }

    @Nullable
    public final String component10() {
        return this.imeiValue;
    }

    @Nullable
    public final String component11() {
        return this.imeiTitle;
    }

    @Nullable
    public final String component12() {
        return this.deviceNameTitle;
    }

    @Nullable
    public final String component13() {
        return this.subsciberTitle;
    }

    @Nullable
    public final String component14() {
        return this.discountValue;
    }

    @Nullable
    public final String component2() {
        return this.packageNameValue;
    }

    @Nullable
    public final String component3() {
        return this.validityTitle;
    }

    @Nullable
    public final String component4() {
        return this.validityValue;
    }

    @Nullable
    public final String component5() {
        return this.discountTitle;
    }

    @Nullable
    public final String component6() {
        return this.deviceNameValue;
    }

    @Nullable
    public final String component7() {
        return this.advancePaymentValue;
    }

    @Nullable
    public final String component8() {
        return this.subsciberValue;
    }

    @Nullable
    public final String component9() {
        return this.advancePaymentTitle;
    }

    @NotNull
    public final CustomerInfo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        return new CustomerInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerInfo) {
            CustomerInfo customerInfo = (CustomerInfo) obj;
            return Intrinsics.areEqual(this.packageNameTitle, customerInfo.packageNameTitle) && Intrinsics.areEqual(this.packageNameValue, customerInfo.packageNameValue) && Intrinsics.areEqual(this.validityTitle, customerInfo.validityTitle) && Intrinsics.areEqual(this.validityValue, customerInfo.validityValue) && Intrinsics.areEqual(this.discountTitle, customerInfo.discountTitle) && Intrinsics.areEqual(this.deviceNameValue, customerInfo.deviceNameValue) && Intrinsics.areEqual(this.advancePaymentValue, customerInfo.advancePaymentValue) && Intrinsics.areEqual(this.subsciberValue, customerInfo.subsciberValue) && Intrinsics.areEqual(this.advancePaymentTitle, customerInfo.advancePaymentTitle) && Intrinsics.areEqual(this.imeiValue, customerInfo.imeiValue) && Intrinsics.areEqual(this.imeiTitle, customerInfo.imeiTitle) && Intrinsics.areEqual(this.deviceNameTitle, customerInfo.deviceNameTitle) && Intrinsics.areEqual(this.subsciberTitle, customerInfo.subsciberTitle) && Intrinsics.areEqual(this.discountValue, customerInfo.discountValue);
        }
        return false;
    }

    @Nullable
    public final String getAdvancePaymentTitle() {
        return this.advancePaymentTitle;
    }

    @Nullable
    public final String getAdvancePaymentValue() {
        return this.advancePaymentValue;
    }

    @Nullable
    public final String getDeviceNameTitle() {
        return this.deviceNameTitle;
    }

    @Nullable
    public final String getDeviceNameValue() {
        return this.deviceNameValue;
    }

    @Nullable
    public final String getDiscountTitle() {
        return this.discountTitle;
    }

    @Nullable
    public final String getDiscountValue() {
        return this.discountValue;
    }

    @Nullable
    public final String getImeiTitle() {
        return this.imeiTitle;
    }

    @Nullable
    public final String getImeiValue() {
        return this.imeiValue;
    }

    @Nullable
    public final String getPackageNameTitle() {
        return this.packageNameTitle;
    }

    @Nullable
    public final String getPackageNameValue() {
        return this.packageNameValue;
    }

    @Nullable
    public final String getSubsciberTitle() {
        return this.subsciberTitle;
    }

    @Nullable
    public final String getSubsciberValue() {
        return this.subsciberValue;
    }

    @Nullable
    public final String getValidityTitle() {
        return this.validityTitle;
    }

    @Nullable
    public final String getValidityValue() {
        return this.validityValue;
    }

    public int hashCode() {
        String str = this.packageNameTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageNameValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validityTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.validityValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discountTitle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceNameValue;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.advancePaymentValue;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subsciberValue;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.advancePaymentTitle;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.imeiValue;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.imeiTitle;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.deviceNameTitle;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.subsciberTitle;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.discountValue;
        return hashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.packageNameTitle;
        String str2 = this.packageNameValue;
        String str3 = this.validityTitle;
        String str4 = this.validityValue;
        String str5 = this.discountTitle;
        String str6 = this.deviceNameValue;
        String str7 = this.advancePaymentValue;
        String str8 = this.subsciberValue;
        String str9 = this.advancePaymentTitle;
        String str10 = this.imeiValue;
        String str11 = this.imeiTitle;
        String str12 = this.deviceNameTitle;
        String str13 = this.subsciberTitle;
        String str14 = this.discountValue;
        return "CustomerInfo(packageNameTitle=" + str + ", packageNameValue=" + str2 + ", validityTitle=" + str3 + ", validityValue=" + str4 + ", discountTitle=" + str5 + ", deviceNameValue=" + str6 + ", advancePaymentValue=" + str7 + ", subsciberValue=" + str8 + ", advancePaymentTitle=" + str9 + ", imeiValue=" + str10 + ", imeiTitle=" + str11 + ", deviceNameTitle=" + str12 + ", subsciberTitle=" + str13 + ", discountValue=" + str14 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.packageNameTitle);
        parcel.writeString(this.packageNameValue);
        parcel.writeString(this.validityTitle);
        parcel.writeString(this.validityValue);
        parcel.writeString(this.discountTitle);
        parcel.writeString(this.deviceNameValue);
        parcel.writeString(this.advancePaymentValue);
        parcel.writeString(this.subsciberValue);
        parcel.writeString(this.advancePaymentTitle);
        parcel.writeString(this.imeiValue);
        parcel.writeString(this.imeiTitle);
        parcel.writeString(this.deviceNameTitle);
        parcel.writeString(this.subsciberTitle);
        parcel.writeString(this.discountValue);
    }

    public CustomerInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.packageNameTitle = str;
        this.packageNameValue = str2;
        this.validityTitle = str3;
        this.validityValue = str4;
        this.discountTitle = str5;
        this.deviceNameValue = str6;
        this.advancePaymentValue = str7;
        this.subsciberValue = str8;
        this.advancePaymentTitle = str9;
        this.imeiValue = str10;
        this.imeiTitle = str11;
        this.deviceNameTitle = str12;
        this.subsciberTitle = str13;
        this.discountValue = str14;
    }

    public /* synthetic */ CustomerInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? str14 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerInfo(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}