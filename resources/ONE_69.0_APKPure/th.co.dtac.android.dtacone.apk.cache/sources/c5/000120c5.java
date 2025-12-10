package th.p047co.dtac.android.dtacone.model.topup.offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0091\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0012HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u009a\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u000eH\u0016J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u000eHÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001J\u0018\u00107\u001a\u0002082\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u000eH\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u0006;"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/topup/offer/OfferPackage;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "marketName", "", "unit", TypedValues.CycleType.S_WAVE_PERIOD, "code", FirebaseAnalytics.Param.PRICE, "name", "ussdCode", "uomOrder", "", "value", "periodUnit", "descriptions", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getDescriptions", "()Ljava/util/List;", "getMarketName", "getName", "getPeriod", "getPeriodUnit", "getPrice", "getUnit", "getUomOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUssdCode", "getValue", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/model/topup/offer/OfferPackage;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.topup.offer.OfferPackage */
/* loaded from: classes8.dex */
public final class OfferPackage implements Parcelable {
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("descriptions")
    @Nullable
    private final List<String> descriptions;
    @SerializedName("marketName")
    @Nullable
    private final String marketName;
    @SerializedName("name")
    @Nullable
    private final String name;
    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    @Nullable
    private final String period;
    @SerializedName("periodUnit")
    @Nullable
    private final String periodUnit;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private final String price;
    @SerializedName("unit")
    @Nullable
    private final String unit;
    @SerializedName("uom_order")
    @Nullable
    private final Integer uomOrder;
    @SerializedName("ussdCode")
    @Nullable
    private final String ussdCode;
    @SerializedName("value")
    @Nullable
    private final String value;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/topup/offer/OfferPackage$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/topup/offer/OfferPackage;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/topup/offer/OfferPackage;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.topup.offer.OfferPackage$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OfferPackage> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OfferPackage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfferPackage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OfferPackage[] newArray(int i) {
            return new OfferPackage[i];
        }
    }

    public OfferPackage() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Nullable
    public final String component1() {
        return this.marketName;
    }

    @Nullable
    public final String component10() {
        return this.periodUnit;
    }

    @Nullable
    public final List<String> component11() {
        return this.descriptions;
    }

    @Nullable
    public final String component2() {
        return this.unit;
    }

    @Nullable
    public final String component3() {
        return this.period;
    }

    @Nullable
    public final String component4() {
        return this.code;
    }

    @Nullable
    public final String component5() {
        return this.price;
    }

    @Nullable
    public final String component6() {
        return this.name;
    }

    @Nullable
    public final String component7() {
        return this.ussdCode;
    }

    @Nullable
    public final Integer component8() {
        return this.uomOrder;
    }

    @Nullable
    public final String component9() {
        return this.value;
    }

    @NotNull
    public final OfferPackage copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable String str8, @Nullable String str9, @Nullable List<String> list) {
        return new OfferPackage(str, str2, str3, str4, str5, str6, str7, num, str8, str9, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfferPackage) {
            OfferPackage offerPackage = (OfferPackage) obj;
            return Intrinsics.areEqual(this.marketName, offerPackage.marketName) && Intrinsics.areEqual(this.unit, offerPackage.unit) && Intrinsics.areEqual(this.period, offerPackage.period) && Intrinsics.areEqual(this.code, offerPackage.code) && Intrinsics.areEqual(this.price, offerPackage.price) && Intrinsics.areEqual(this.name, offerPackage.name) && Intrinsics.areEqual(this.ussdCode, offerPackage.ussdCode) && Intrinsics.areEqual(this.uomOrder, offerPackage.uomOrder) && Intrinsics.areEqual(this.value, offerPackage.value) && Intrinsics.areEqual(this.periodUnit, offerPackage.periodUnit) && Intrinsics.areEqual(this.descriptions, offerPackage.descriptions);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final List<String> getDescriptions() {
        return this.descriptions;
    }

    @Nullable
    public final String getMarketName() {
        return this.marketName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPeriod() {
        return this.period;
    }

    @Nullable
    public final String getPeriodUnit() {
        return this.periodUnit;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    public final Integer getUomOrder() {
        return this.uomOrder;
    }

    @Nullable
    public final String getUssdCode() {
        return this.ussdCode;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.marketName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.unit;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.code;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.price;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ussdCode;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.uomOrder;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.value;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.periodUnit;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.descriptions;
        return hashCode10 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.marketName;
        String str2 = this.unit;
        String str3 = this.period;
        String str4 = this.code;
        String str5 = this.price;
        String str6 = this.name;
        String str7 = this.ussdCode;
        Integer num = this.uomOrder;
        String str8 = this.value;
        String str9 = this.periodUnit;
        List<String> list = this.descriptions;
        return "OfferPackage(marketName=" + str + ", unit=" + str2 + ", period=" + str3 + ", code=" + str4 + ", price=" + str5 + ", name=" + str6 + ", ussdCode=" + str7 + ", uomOrder=" + num + ", value=" + str8 + ", periodUnit=" + str9 + ", descriptions=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.marketName);
        parcel.writeString(this.unit);
        parcel.writeString(this.period);
        parcel.writeString(this.code);
        parcel.writeString(this.price);
        parcel.writeString(this.name);
        parcel.writeString(this.ussdCode);
        parcel.writeValue(this.uomOrder);
        parcel.writeString(this.value);
        parcel.writeString(this.periodUnit);
        parcel.writeStringList(this.descriptions);
    }

    public OfferPackage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable String str8, @Nullable String str9, @Nullable List<String> list) {
        this.marketName = str;
        this.unit = str2;
        this.period = str3;
        this.code = str4;
        this.price = str5;
        this.name = str6;
        this.ussdCode = str7;
        this.uomOrder = num;
        this.value = str8;
        this.periodUnit = str9;
        this.descriptions = list;
    }

    public /* synthetic */ OfferPackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) == 0 ? list : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OfferPackage(@org.jetbrains.annotations.NotNull android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r2 = r14.readString()
            java.lang.String r3 = r14.readString()
            java.lang.String r4 = r14.readString()
            java.lang.String r5 = r14.readString()
            java.lang.String r6 = r14.readString()
            java.lang.String r7 = r14.readString()
            java.lang.String r8 = r14.readString()
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r14.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L33
            java.lang.Integer r0 = (java.lang.Integer) r0
        L31:
            r9 = r0
            goto L35
        L33:
            r0 = 0
            goto L31
        L35:
            java.lang.String r10 = r14.readString()
            java.lang.String r11 = r14.readString()
            java.util.ArrayList r12 = r14.createStringArrayList()
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.topup.offer.OfferPackage.<init>(android.os.Parcel):void");
    }
}