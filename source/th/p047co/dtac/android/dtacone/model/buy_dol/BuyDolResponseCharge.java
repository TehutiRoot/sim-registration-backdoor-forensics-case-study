package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.buy_dol.dol_price.BuyDolPrice;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BA\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0017H\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "authorizeUrl", "", "referenceCode", "paymentDateTime", "simR", "dolPrice", "Lth/co/dtac/android/dtacone/model/buy_dol/dol_price/BuyDolPrice;", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/buy_dol/dol_price/BuyDolPrice;Ljava/lang/String;)V", "getAuthorizeUrl", "()Ljava/lang/String;", "getDolPrice", "()Lth/co/dtac/android/dtacone/model/buy_dol/dol_price/BuyDolPrice;", "getPaymentDateTime", "getReferenceCode", "getSimR", "getStatus", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolResponseCharge */
/* loaded from: classes8.dex */
public final class BuyDolResponseCharge implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("authorizeUrl")
    @Nullable
    private final String authorizeUrl;
    @SerializedName("dolPrice")
    @Nullable
    private final BuyDolPrice dolPrice;
    @SerializedName("displayPaymentDateTime")
    @Nullable
    private final String paymentDateTime;
    @SerializedName("referenceCode")
    @Nullable
    private final String referenceCode;
    @SerializedName("simR")
    @Nullable
    private final String simR;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolResponseCharge;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolResponseCharge$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<BuyDolResponseCharge> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolResponseCharge createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyDolResponseCharge(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolResponseCharge[] newArray(int i) {
            return new BuyDolResponseCharge[i];
        }
    }

    public BuyDolResponseCharge(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BuyDolPrice buyDolPrice, @Nullable String str5) {
        this.authorizeUrl = str;
        this.referenceCode = str2;
        this.paymentDateTime = str3;
        this.simR = str4;
        this.dolPrice = buyDolPrice;
        this.status = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAuthorizeUrl() {
        return this.authorizeUrl;
    }

    @Nullable
    public final BuyDolPrice getDolPrice() {
        return this.dolPrice;
    }

    @Nullable
    public final String getPaymentDateTime() {
        return this.paymentDateTime;
    }

    @Nullable
    public final String getReferenceCode() {
        return this.referenceCode;
    }

    @Nullable
    public final String getSimR() {
        return this.simR;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.authorizeUrl);
        parcel.writeString(this.referenceCode);
        parcel.writeString(this.paymentDateTime);
        parcel.writeString(this.simR);
        parcel.writeParcelable(this.dolPrice, i);
        parcel.writeString(this.status);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyDolResponseCharge(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BuyDolPrice) parcel.readParcelable(BuyDolPrice.class.getClassLoader()), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
