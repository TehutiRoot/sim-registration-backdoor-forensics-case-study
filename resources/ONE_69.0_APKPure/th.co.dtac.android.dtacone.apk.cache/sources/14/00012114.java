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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Be\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003Ji\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010!\u001a\u00020\"H\u0016J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\"H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006-"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/Discount;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "discountTitle", "", "summaryTitle", "deviceNameTitle", "deviceNameValue", "deviceAmountTitle", "deviceAmountValue", "summaryValue", "discountValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceAmountTitle", "()Ljava/lang/String;", "getDeviceAmountValue", "getDeviceNameTitle", "getDeviceNameValue", "getDiscountTitle", "getDiscountValue", "getSummaryTitle", "getSummaryValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.Discount */
/* loaded from: classes8.dex */
public final class Discount implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("deviceAmountTitle")
    @Nullable
    private final String deviceAmountTitle;
    @SerializedName("deviceAmountValue")
    @Nullable
    private final String deviceAmountValue;
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
    @SerializedName("summaryTitle")
    @Nullable
    private final String summaryTitle;
    @SerializedName("summaryValue")
    @Nullable
    private final String summaryValue;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/Discount$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/Discount;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/withDevice/CheckInputUssd/response/Discount;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.withDevice.CheckInputUssd.response.Discount$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<Discount> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Discount createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Discount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Discount[] newArray(int i) {
            return new Discount[i];
        }
    }

    public Discount() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.discountTitle;
    }

    @Nullable
    public final String component2() {
        return this.summaryTitle;
    }

    @Nullable
    public final String component3() {
        return this.deviceNameTitle;
    }

    @Nullable
    public final String component4() {
        return this.deviceNameValue;
    }

    @Nullable
    public final String component5() {
        return this.deviceAmountTitle;
    }

    @Nullable
    public final String component6() {
        return this.deviceAmountValue;
    }

    @Nullable
    public final String component7() {
        return this.summaryValue;
    }

    @Nullable
    public final String component8() {
        return this.discountValue;
    }

    @NotNull
    public final Discount copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        return new Discount(str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Discount) {
            Discount discount = (Discount) obj;
            return Intrinsics.areEqual(this.discountTitle, discount.discountTitle) && Intrinsics.areEqual(this.summaryTitle, discount.summaryTitle) && Intrinsics.areEqual(this.deviceNameTitle, discount.deviceNameTitle) && Intrinsics.areEqual(this.deviceNameValue, discount.deviceNameValue) && Intrinsics.areEqual(this.deviceAmountTitle, discount.deviceAmountTitle) && Intrinsics.areEqual(this.deviceAmountValue, discount.deviceAmountValue) && Intrinsics.areEqual(this.summaryValue, discount.summaryValue) && Intrinsics.areEqual(this.discountValue, discount.discountValue);
        }
        return false;
    }

    @Nullable
    public final String getDeviceAmountTitle() {
        return this.deviceAmountTitle;
    }

    @Nullable
    public final String getDeviceAmountValue() {
        return this.deviceAmountValue;
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
    public final String getSummaryTitle() {
        return this.summaryTitle;
    }

    @Nullable
    public final String getSummaryValue() {
        return this.summaryValue;
    }

    public int hashCode() {
        String str = this.discountTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.summaryTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceNameTitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceNameValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceAmountTitle;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceAmountValue;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.summaryValue;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.discountValue;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.discountTitle;
        String str2 = this.summaryTitle;
        String str3 = this.deviceNameTitle;
        String str4 = this.deviceNameValue;
        String str5 = this.deviceAmountTitle;
        String str6 = this.deviceAmountValue;
        String str7 = this.summaryValue;
        String str8 = this.discountValue;
        return "Discount(discountTitle=" + str + ", summaryTitle=" + str2 + ", deviceNameTitle=" + str3 + ", deviceNameValue=" + str4 + ", deviceAmountTitle=" + str5 + ", deviceAmountValue=" + str6 + ", summaryValue=" + str7 + ", discountValue=" + str8 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.discountTitle);
        parcel.writeString(this.summaryTitle);
        parcel.writeString(this.deviceNameTitle);
        parcel.writeString(this.deviceNameValue);
        parcel.writeString(this.deviceAmountTitle);
        parcel.writeString(this.deviceAmountValue);
        parcel.writeString(this.summaryValue);
        parcel.writeString(this.discountValue);
    }

    public Discount(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.discountTitle = str;
        this.summaryTitle = str2;
        this.deviceNameTitle = str3;
        this.deviceNameValue = str4;
        this.deviceAmountTitle = str5;
        this.deviceAmountValue = str6;
        this.summaryValue = str7;
        this.discountValue = str8;
    }

    public /* synthetic */ Discount(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Discount(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}