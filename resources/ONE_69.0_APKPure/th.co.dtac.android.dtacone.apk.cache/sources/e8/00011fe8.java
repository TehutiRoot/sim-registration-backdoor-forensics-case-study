package th.p047co.dtac.android.dtacone.model.postpaid.nice_number;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BY\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0016R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/nice_number/NiceNumber;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "contractPeriod", "", "penaltyRate", "advancedPayment", "contractPeriodUnit", "", "advancedPaymentUnit", "minPriceText1", "minPriceText2", "minPriceText3", "penaltyRateUnit", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvancedPayment", "()I", "getAdvancedPaymentUnit", "()Ljava/lang/String;", "getContractPeriod", "getContractPeriodUnit", "getMinPriceText1", "getMinPriceText2", "getMinPriceText3", "getPenaltyRate", "getPenaltyRateUnit", "describeContents", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.nice_number.NiceNumber */
/* loaded from: classes8.dex */
public final class NiceNumber implements Parcelable {
    public static final int $stable = 0;
    @SerializedName("advancedPayment")
    private final int advancedPayment;
    @SerializedName("advancedPaymentUnit")
    @Nullable
    private final String advancedPaymentUnit;
    @SerializedName("contractPeriod")
    private final int contractPeriod;
    @SerializedName("contractPeriodUnit")
    @Nullable
    private final String contractPeriodUnit;
    @SerializedName("minPriceText1")
    @Nullable
    private final String minPriceText1;
    @SerializedName("minPriceText2")
    @Nullable
    private final String minPriceText2;
    @SerializedName("minPriceText3")
    @Nullable
    private final String minPriceText3;
    @SerializedName("penaltyRate")
    private final int penaltyRate;
    @SerializedName("penaltyRateUnit")
    @Nullable
    private final String penaltyRateUnit;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Parcelable.Creator<NiceNumber> CREATOR = new Parcelable.Creator<NiceNumber>() { // from class: th.co.dtac.android.dtacone.model.postpaid.nice_number.NiceNumber$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public NiceNumber createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new NiceNumber(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public NiceNumber[] newArray(int i) {
            return new NiceNumber[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/nice_number/NiceNumber$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/postpaid/nice_number/NiceNumber;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.nice_number.NiceNumber$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NiceNumber(int i, int i2, int i3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.contractPeriod = i;
        this.penaltyRate = i2;
        this.advancedPayment = i3;
        this.contractPeriodUnit = str;
        this.advancedPaymentUnit = str2;
        this.minPriceText1 = str3;
        this.minPriceText2 = str4;
        this.minPriceText3 = str5;
        this.penaltyRateUnit = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getAdvancedPayment() {
        return this.advancedPayment;
    }

    @Nullable
    public final String getAdvancedPaymentUnit() {
        return this.advancedPaymentUnit;
    }

    public final int getContractPeriod() {
        return this.contractPeriod;
    }

    @Nullable
    public final String getContractPeriodUnit() {
        return this.contractPeriodUnit;
    }

    @Nullable
    public final String getMinPriceText1() {
        return this.minPriceText1;
    }

    @Nullable
    public final String getMinPriceText2() {
        return this.minPriceText2;
    }

    @Nullable
    public final String getMinPriceText3() {
        return this.minPriceText3;
    }

    public final int getPenaltyRate() {
        return this.penaltyRate;
    }

    @Nullable
    public final String getPenaltyRateUnit() {
        return this.penaltyRateUnit;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.contractPeriod);
        dest.writeInt(this.penaltyRate);
        dest.writeInt(this.advancedPayment);
        dest.writeString(this.contractPeriodUnit);
        dest.writeString(this.advancedPaymentUnit);
        dest.writeString(this.minPriceText1);
        dest.writeString(this.minPriceText2);
        dest.writeString(this.minPriceText3);
        dest.writeString(this.penaltyRateUnit);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NiceNumber(@NotNull Parcel source) {
        this(source.readInt(), source.readInt(), source.readInt(), source.readString(), source.readString(), source.readString(), source.readString(), source.readString(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}