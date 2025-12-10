package th.p047co.dtac.android.dtacone.app_one.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b<\b\u0007\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010 \u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010 \u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010 \u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010 \u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010 \u001a\u0004\bM\u0010\"\"\u0004\bN\u0010$R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u00105\u001a\u0004\bV\u00107\"\u0004\bW\u00109¨\u0006X"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "Landroid/os/Parcelable;", "", "code", "ussdCode", "name", "marketName", "value", "unit", "", "uomOrder", TypedValues.CycleType.S_WAVE_PERIOD, "periodUnit", FirebaseAnalytics.Param.PRICE, "", "descriptions", "commissionText", "commissionColor", "", "commissionValue", "seq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUssdCode", "setUssdCode", OperatorName.CURVE_TO, "getName", "setName", "d", "getMarketName", "setMarketName", "e", "getValue", "setValue", OperatorName.FILL_NON_ZERO, "getUnit", "setUnit", OperatorName.NON_STROKING_GRAY, "Ljava/lang/Integer;", "getUomOrder", "()Ljava/lang/Integer;", "setUomOrder", "(Ljava/lang/Integer;)V", OperatorName.CLOSE_PATH, "getPeriod", "setPeriod", "i", "getPeriodUnit", "setPeriodUnit", OperatorName.SET_LINE_JOINSTYLE, "getPrice", "setPrice", OperatorName.NON_STROKING_CMYK, "[Ljava/lang/String;", "getDescriptions", "()[Ljava/lang/String;", "setDescriptions", "([Ljava/lang/String;)V", OperatorName.LINE_TO, "getCommissionText", "setCommissionText", OperatorName.MOVE_TO, "getCommissionColor", "setCommissionColor", OperatorName.ENDPATH, "Ljava/lang/Float;", "getCommissionValue", "()Ljava/lang/Float;", "setCommissionValue", "(Ljava/lang/Float;)V", "o", "getSeq", "setSeq", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection */
/* loaded from: classes7.dex */
public final class OneStvPackageCollection implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OneStvPackageCollection> CREATOR = new Creator();
    @SerializedName("code")
    @Nullable

    /* renamed from: a */
    private String f82152a;
    @SerializedName("ussdCode")
    @Nullable

    /* renamed from: b */
    private String f82153b;
    @SerializedName("name")
    @Nullable

    /* renamed from: c */
    private String f82154c;
    @SerializedName("marketName")
    @Nullable

    /* renamed from: d */
    private String f82155d;
    @SerializedName("value")
    @Nullable

    /* renamed from: e */
    private String f82156e;
    @SerializedName("unit")
    @Nullable

    /* renamed from: f */
    private String f82157f;
    @SerializedName("uom_order")
    @Nullable

    /* renamed from: g */
    private Integer f82158g;
    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    @Nullable

    /* renamed from: h */
    private String f82159h;
    @SerializedName("periodUnit")
    @Nullable

    /* renamed from: i */
    private String f82160i;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable

    /* renamed from: j */
    private String f82161j;
    @SerializedName("descriptions")
    @NotNull

    /* renamed from: k */
    private String[] f82162k;
    @SerializedName("commissionText")
    @Nullable

    /* renamed from: l */
    private String f82163l;
    @SerializedName("commissionColor")
    @Nullable

    /* renamed from: m */
    private String f82164m;
    @SerializedName("commissionValue")
    @Nullable

    /* renamed from: n */
    private Float f82165n;
    @SerializedName("seq")
    @Nullable

    /* renamed from: o */
    private Integer f82166o;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OneStvPackageCollection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneStvPackageCollection createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneStvPackageCollection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneStvPackageCollection[] newArray(int i) {
            return new OneStvPackageCollection[i];
        }
    }

    public OneStvPackageCollection(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String[] descriptions, @Nullable String str10, @Nullable String str11, @Nullable Float f, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        this.f82152a = str;
        this.f82153b = str2;
        this.f82154c = str3;
        this.f82155d = str4;
        this.f82156e = str5;
        this.f82157f = str6;
        this.f82158g = num;
        this.f82159h = str7;
        this.f82160i = str8;
        this.f82161j = str9;
        this.f82162k = descriptions;
        this.f82163l = str10;
        this.f82164m = str11;
        this.f82165n = f;
        this.f82166o = num2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getCode() {
        return this.f82152a;
    }

    @Nullable
    public final String getCommissionColor() {
        return this.f82164m;
    }

    @Nullable
    public final String getCommissionText() {
        return this.f82163l;
    }

    @Nullable
    public final Float getCommissionValue() {
        return this.f82165n;
    }

    @NotNull
    public final String[] getDescriptions() {
        return this.f82162k;
    }

    @Nullable
    public final String getMarketName() {
        return this.f82155d;
    }

    @Nullable
    public final String getName() {
        return this.f82154c;
    }

    @Nullable
    public final String getPeriod() {
        return this.f82159h;
    }

    @Nullable
    public final String getPeriodUnit() {
        return this.f82160i;
    }

    @Nullable
    public final String getPrice() {
        return this.f82161j;
    }

    @Nullable
    public final Integer getSeq() {
        return this.f82166o;
    }

    @Nullable
    public final String getUnit() {
        return this.f82157f;
    }

    @Nullable
    public final Integer getUomOrder() {
        return this.f82158g;
    }

    @Nullable
    public final String getUssdCode() {
        return this.f82153b;
    }

    @Nullable
    public final String getValue() {
        return this.f82156e;
    }

    public final void setCode(@Nullable String str) {
        this.f82152a = str;
    }

    public final void setCommissionColor(@Nullable String str) {
        this.f82164m = str;
    }

    public final void setCommissionText(@Nullable String str) {
        this.f82163l = str;
    }

    public final void setCommissionValue(@Nullable Float f) {
        this.f82165n = f;
    }

    public final void setDescriptions(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.f82162k = strArr;
    }

    public final void setMarketName(@Nullable String str) {
        this.f82155d = str;
    }

    public final void setName(@Nullable String str) {
        this.f82154c = str;
    }

    public final void setPeriod(@Nullable String str) {
        this.f82159h = str;
    }

    public final void setPeriodUnit(@Nullable String str) {
        this.f82160i = str;
    }

    public final void setPrice(@Nullable String str) {
        this.f82161j = str;
    }

    public final void setSeq(@Nullable Integer num) {
        this.f82166o = num;
    }

    public final void setUnit(@Nullable String str) {
        this.f82157f = str;
    }

    public final void setUomOrder(@Nullable Integer num) {
        this.f82158g = num;
    }

    public final void setUssdCode(@Nullable String str) {
        this.f82153b = str;
    }

    public final void setValue(@Nullable String str) {
        this.f82156e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82152a);
        out.writeString(this.f82153b);
        out.writeString(this.f82154c);
        out.writeString(this.f82155d);
        out.writeString(this.f82156e);
        out.writeString(this.f82157f);
        Integer num = this.f82158g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f82159h);
        out.writeString(this.f82160i);
        out.writeString(this.f82161j);
        out.writeStringArray(this.f82162k);
        out.writeString(this.f82163l);
        out.writeString(this.f82164m);
        Float f = this.f82165n;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        Integer num2 = this.f82166o;
        if (num2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num2.intValue());
    }

    public /* synthetic */ OneStvPackageCollection(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String[] strArr, String str10, String str11, Float f, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0 : num, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? new String[0] : strArr, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, f, num2);
    }
}
