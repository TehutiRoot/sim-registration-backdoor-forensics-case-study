package th.p047co.dtac.android.dtacone.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0015J\t\u0010,\u001a\u00020\nHÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017¨\u00062"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "Landroid/os/Parcelable;", "code", "", "ussdCode", "name", "marketName", "value", "unit", "uomOrder", "", TypedValues.CycleType.S_WAVE_PERIOD, "periodUnit", FirebaseAnalytics.Param.PRICE, "descriptions", "", "commissionText", "commissionColor", "commissionValue", "", "seq", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getCommissionColor", "getCommissionText", "getCommissionValue", "()F", "getDescriptions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getMarketName", "getName", "getPeriod", "getPeriodUnit", "getPrice", "getSeq", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnit", "getUomOrder", "()I", "getUssdCode", "getValue", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.stv.StvPackageCollection */
/* loaded from: classes8.dex */
public final class StvPackageCollection implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<StvPackageCollection> CREATOR = new Creator();
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("commissionColor")
    @NotNull
    private final String commissionColor;
    @SerializedName("commissionText")
    @NotNull
    private final String commissionText;
    @SerializedName("commissionValue")
    private final float commissionValue;
    @SerializedName("descriptions")
    @NotNull
    private final String[] descriptions;
    @SerializedName("marketName")
    @NotNull
    private final String marketName;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    @NotNull
    private final String period;
    @SerializedName("periodUnit")
    @NotNull
    private final String periodUnit;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @NotNull
    private final String price;
    @SerializedName("seq")
    @Nullable
    private final Integer seq;
    @SerializedName("unit")
    @NotNull
    private final String unit;
    @SerializedName("uom_order")
    private final int uomOrder;
    @SerializedName("ussdCode")
    @NotNull
    private final String ussdCode;
    @SerializedName("value")
    @NotNull
    private final String value;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.stv.StvPackageCollection$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<StvPackageCollection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StvPackageCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StvPackageCollection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final StvPackageCollection[] newArray(int i) {
            return new StvPackageCollection[i];
        }
    }

    public StvPackageCollection(@NotNull String code, @NotNull String ussdCode, @NotNull String name, @NotNull String marketName, @NotNull String value, @NotNull String unit, int i, @NotNull String period, @NotNull String periodUnit, @NotNull String price, @NotNull String[] descriptions, @NotNull String commissionText, @NotNull String commissionColor, float f, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(ussdCode, "ussdCode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(marketName, "marketName");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(periodUnit, "periodUnit");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        Intrinsics.checkNotNullParameter(commissionText, "commissionText");
        Intrinsics.checkNotNullParameter(commissionColor, "commissionColor");
        this.code = code;
        this.ussdCode = ussdCode;
        this.name = name;
        this.marketName = marketName;
        this.value = value;
        this.unit = unit;
        this.uomOrder = i;
        this.period = period;
        this.periodUnit = periodUnit;
        this.price = price;
        this.descriptions = descriptions;
        this.commissionText = commissionText;
        this.commissionColor = commissionColor;
        this.commissionValue = f;
        this.seq = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCommissionColor() {
        return this.commissionColor;
    }

    @NotNull
    public final String getCommissionText() {
        return this.commissionText;
    }

    public final float getCommissionValue() {
        return this.commissionValue;
    }

    @NotNull
    public final String[] getDescriptions() {
        return this.descriptions;
    }

    @NotNull
    public final String getMarketName() {
        return this.marketName;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPeriod() {
        return this.period;
    }

    @NotNull
    public final String getPeriodUnit() {
        return this.periodUnit;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getSeq() {
        return this.seq;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public final int getUomOrder() {
        return this.uomOrder;
    }

    @NotNull
    public final String getUssdCode() {
        return this.ussdCode;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.code);
        out.writeString(this.ussdCode);
        out.writeString(this.name);
        out.writeString(this.marketName);
        out.writeString(this.value);
        out.writeString(this.unit);
        out.writeInt(this.uomOrder);
        out.writeString(this.period);
        out.writeString(this.periodUnit);
        out.writeString(this.price);
        out.writeStringArray(this.descriptions);
        out.writeString(this.commissionText);
        out.writeString(this.commissionColor);
        out.writeFloat(this.commissionValue);
        Integer num = this.seq;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public /* synthetic */ StvPackageCollection(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String[] strArr, String str10, String str11, float f, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? new String[0] : strArr, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, f, num);
    }
}