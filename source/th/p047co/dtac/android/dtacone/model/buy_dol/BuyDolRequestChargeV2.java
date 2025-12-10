package th.p047co.dtac.android.dtacone.model.buy_dol;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.buy_dol.charge.CardCharge;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0003234B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\"¨\u00065"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2;", "Landroid/os/Parcelable;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;", "dolPrice", "", "simR", "simRToken", "otpToken", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;", "channel", "<init>", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "isChargeByCreditCard", "()Z", "isChargeByDirectAccount", "Lth/co/dtac/android/dtacone/model/buy_dol/charge/CardCharge;", "getCardCharge", "()Lth/co/dtac/android/dtacone/model/buy_dol/charge/CardCharge;", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;", "copy", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;)Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;", "Ljava/lang/String;", "getSimR", "getSimRToken", "getOtpToken", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;", "getChannel", "CREATOR", "Channel", "DolPrice", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2 */
/* loaded from: classes8.dex */
public final class BuyDolRequestChargeV2 implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("channel")
    @Nullable
    private final Channel channel;
    @SerializedName("dolPrice")
    @Nullable
    private final DolPrice dolPrice;
    @SerializedName("otpToken")
    @Nullable
    private final String otpToken;
    @SerializedName("simR")
    @NotNull
    private final String simR;
    @SerializedName("simRToken")
    @Nullable
    private final String simRToken;

    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016JV\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J>\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001d\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "createRequestChargeCreditcard", "msisdn", "", "chargeToken", "feeToken", "saveCardToken", "cardType", "brand", "bankCode", "bankName", "amount", "", "fee", "", "createRequestChargeDirectAccount", "otpToken", "accountPayment", "newArray", "", "size", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<BuyDolRequestChargeV2> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BuyDolRequestChargeV2 createRequestChargeCreditcard(@NotNull String msisdn, @NotNull String chargeToken, @NotNull String feeToken, @NotNull String saveCardToken, @NotNull String cardType, @NotNull String brand, @NotNull String bankCode, @NotNull String bankName, int i, float f) {
            Intrinsics.checkNotNullParameter(msisdn, "msisdn");
            Intrinsics.checkNotNullParameter(chargeToken, "chargeToken");
            Intrinsics.checkNotNullParameter(feeToken, "feeToken");
            Intrinsics.checkNotNullParameter(saveCardToken, "saveCardToken");
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(bankCode, "bankCode");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            return new BuyDolRequestChargeV2(new DolPrice(i, f, i + f), msisdn, null, null, new Channel(new Channel.Card(chargeToken, feeToken, saveCardToken, cardType), null, brand, bankName, bankCode));
        }

        @NotNull
        public final BuyDolRequestChargeV2 createRequestChargeDirectAccount(@NotNull String msisdn, @NotNull String otpToken, @NotNull String accountPayment, @NotNull String bankCode, @NotNull String bankName, int i, float f) {
            Intrinsics.checkNotNullParameter(msisdn, "msisdn");
            Intrinsics.checkNotNullParameter(otpToken, "otpToken");
            Intrinsics.checkNotNullParameter(accountPayment, "accountPayment");
            Intrinsics.checkNotNullParameter(bankCode, "bankCode");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            return new BuyDolRequestChargeV2(new DolPrice(i, f, i + f), msisdn, null, otpToken, new Channel(null, new Channel.BankAccount(accountPayment), bankCode, bankName, bankCode));
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolRequestChargeV2 createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyDolRequestChargeV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public BuyDolRequestChargeV2[] newArray(int i) {
            return new BuyDolRequestChargeV2[i];
        }
    }

    public BuyDolRequestChargeV2(@Nullable DolPrice dolPrice, @NotNull String simR, @Nullable String str, @Nullable String str2, @Nullable Channel channel) {
        Intrinsics.checkNotNullParameter(simR, "simR");
        this.dolPrice = dolPrice;
        this.simR = simR;
        this.simRToken = str;
        this.otpToken = str2;
        this.channel = channel;
    }

    public static /* synthetic */ BuyDolRequestChargeV2 copy$default(BuyDolRequestChargeV2 buyDolRequestChargeV2, DolPrice dolPrice, String str, String str2, String str3, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            dolPrice = buyDolRequestChargeV2.dolPrice;
        }
        if ((i & 2) != 0) {
            str = buyDolRequestChargeV2.simR;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = buyDolRequestChargeV2.simRToken;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = buyDolRequestChargeV2.otpToken;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            channel = buyDolRequestChargeV2.channel;
        }
        return buyDolRequestChargeV2.copy(dolPrice, str4, str5, str6, channel);
    }

    @NotNull
    public final String component2() {
        return this.simR;
    }

    @Nullable
    public final String component3() {
        return this.simRToken;
    }

    @Nullable
    public final String component4() {
        return this.otpToken;
    }

    @Nullable
    public final Channel component5() {
        return this.channel;
    }

    @NotNull
    public final BuyDolRequestChargeV2 copy(@Nullable DolPrice dolPrice, @NotNull String simR, @Nullable String str, @Nullable String str2, @Nullable Channel channel) {
        Intrinsics.checkNotNullParameter(simR, "simR");
        return new BuyDolRequestChargeV2(dolPrice, simR, str, str2, channel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyDolRequestChargeV2) {
            BuyDolRequestChargeV2 buyDolRequestChargeV2 = (BuyDolRequestChargeV2) obj;
            return Intrinsics.areEqual(this.dolPrice, buyDolRequestChargeV2.dolPrice) && Intrinsics.areEqual(this.simR, buyDolRequestChargeV2.simR) && Intrinsics.areEqual(this.simRToken, buyDolRequestChargeV2.simRToken) && Intrinsics.areEqual(this.otpToken, buyDolRequestChargeV2.otpToken) && Intrinsics.areEqual(this.channel, buyDolRequestChargeV2.channel);
        }
        return false;
    }

    @NotNull
    public final CardCharge getCardCharge() {
        String str;
        String str2;
        String str3;
        Channel.Card card;
        Channel channel = this.channel;
        String str4 = null;
        if (channel != null && (card = channel.getCard()) != null) {
            str = card.getCardType();
        } else {
            str = null;
        }
        Channel channel2 = this.channel;
        if (channel2 != null) {
            str2 = channel2.getBrand();
        } else {
            str2 = null;
        }
        Channel channel3 = this.channel;
        if (channel3 != null) {
            str3 = channel3.getName();
        } else {
            str3 = null;
        }
        Channel channel4 = this.channel;
        if (channel4 != null) {
            str4 = channel4.getBank();
        }
        return new CardCharge(str, str2, str3, str4);
    }

    @Nullable
    public final Channel getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getOtpToken() {
        return this.otpToken;
    }

    @NotNull
    public final String getSimR() {
        return this.simR;
    }

    @Nullable
    public final String getSimRToken() {
        return this.simRToken;
    }

    public int hashCode() {
        DolPrice dolPrice = this.dolPrice;
        int hashCode = (((dolPrice == null ? 0 : dolPrice.hashCode()) * 31) + this.simR.hashCode()) * 31;
        String str = this.simRToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.otpToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Channel channel = this.channel;
        return hashCode3 + (channel != null ? channel.hashCode() : 0);
    }

    public final boolean isChargeByCreditCard() {
        Channel.Card card;
        Channel channel = this.channel;
        if (channel != null) {
            card = channel.getCard();
        } else {
            card = null;
        }
        if (card != null) {
            return true;
        }
        return false;
    }

    public final boolean isChargeByDirectAccount() {
        Channel.BankAccount bankAccount;
        Channel channel = this.channel;
        if (channel != null) {
            bankAccount = channel.getBankAccount();
        } else {
            bankAccount = null;
        }
        if (bankAccount != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        DolPrice dolPrice = this.dolPrice;
        String str = this.simR;
        String str2 = this.simRToken;
        String str3 = this.otpToken;
        Channel channel = this.channel;
        return "BuyDolRequestChargeV2(dolPrice=" + dolPrice + ", simR=" + str + ", simRToken=" + str2 + ", otpToken=" + str3 + ", channel=" + channel + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.dolPrice, i);
        parcel.writeString(this.simR);
        parcel.writeString(this.simRToken);
        parcel.writeString(this.otpToken);
        parcel.writeParcelable(this.channel, i);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0003'()B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B7\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u001dH\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "card", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card;", "bankAccount", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount;", "brand", "", "name", "bank", "(Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card;Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBank", "()Ljava/lang/String;", "getBankAccount", "()Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount;", "getBrand", "getCard", "()Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "BankAccount", "CREATOR", "Card", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel */
    /* loaded from: classes8.dex */
    public static final class Channel implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final CREATOR CREATOR = new CREATOR(null);
        @SerializedName("bank")
        @Nullable
        private final String bank;
        @SerializedName("bankAccount")
        @Nullable
        private final BankAccount bankAccount;
        @SerializedName("brand")
        @Nullable
        private final String brand;
        @SerializedName("card")
        @Nullable
        private final Card card;
        @SerializedName("name")
        @Nullable
        private final String name;

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount;", "Landroid/os/Parcelable;", "", "accountPayment", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel$BankAccount */
        /* loaded from: classes8.dex */
        public static final class BankAccount implements Parcelable {
            public static final int $stable = 0;
            @NotNull
            public static final CREATOR CREATOR = new CREATOR(null);
            @SerializedName("accountPayment")
            @Nullable
            private final String accountPayment;

            @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$BankAccount;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel$BankAccount$CREATOR */
            /* loaded from: classes8.dex */
            public static final class CREATOR implements Parcelable.Creator<BankAccount> {
                public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private CREATOR() {
                }

                @Override // android.os.Parcelable.Creator
                @NotNull
                public BankAccount createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BankAccount(parcel);
                }

                @Override // android.os.Parcelable.Creator
                @NotNull
                public BankAccount[] newArray(int i) {
                    return new BankAccount[i];
                }
            }

            public BankAccount(@Nullable String str) {
                this.accountPayment = str;
            }

            public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bankAccount.accountPayment;
                }
                return bankAccount.copy(str);
            }

            @NotNull
            public final BankAccount copy(@Nullable String str) {
                return new BankAccount(str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BankAccount) && Intrinsics.areEqual(this.accountPayment, ((BankAccount) obj).accountPayment);
            }

            public int hashCode() {
                String str = this.accountPayment;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                String str = this.accountPayment;
                return "BankAccount(accountPayment=" + str + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.writeString(this.accountPayment);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public BankAccount(@NotNull Parcel parcel) {
                this(parcel.readString());
                Intrinsics.checkNotNullParameter(parcel, "parcel");
            }
        }

        @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel$CREATOR */
        /* loaded from: classes8.dex */
        public static final class CREATOR implements Parcelable.Creator<Channel> {
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public Channel createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Channel(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public Channel[] newArray(int i) {
                return new Channel[i];
            }
        }

        public Channel(@Nullable Card card, @Nullable BankAccount bankAccount, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.card = card;
            this.bankAccount = bankAccount;
            this.brand = str;
            this.name = str2;
            this.bank = str3;
        }

        public static /* synthetic */ Channel copy$default(Channel channel, Card card, BankAccount bankAccount, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                card = channel.card;
            }
            if ((i & 2) != 0) {
                bankAccount = channel.bankAccount;
            }
            BankAccount bankAccount2 = bankAccount;
            if ((i & 4) != 0) {
                str = channel.brand;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = channel.name;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = channel.bank;
            }
            return channel.copy(card, bankAccount2, str4, str5, str3);
        }

        @Nullable
        public final Card component1() {
            return this.card;
        }

        @Nullable
        public final BankAccount component2() {
            return this.bankAccount;
        }

        @Nullable
        public final String component3() {
            return this.brand;
        }

        @Nullable
        public final String component4() {
            return this.name;
        }

        @Nullable
        public final String component5() {
            return this.bank;
        }

        @NotNull
        public final Channel copy(@Nullable Card card, @Nullable BankAccount bankAccount, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new Channel(card, bankAccount, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Channel) {
                Channel channel = (Channel) obj;
                return Intrinsics.areEqual(this.card, channel.card) && Intrinsics.areEqual(this.bankAccount, channel.bankAccount) && Intrinsics.areEqual(this.brand, channel.brand) && Intrinsics.areEqual(this.name, channel.name) && Intrinsics.areEqual(this.bank, channel.bank);
            }
            return false;
        }

        @Nullable
        public final String getBank() {
            return this.bank;
        }

        @Nullable
        public final BankAccount getBankAccount() {
            return this.bankAccount;
        }

        @Nullable
        public final String getBrand() {
            return this.brand;
        }

        @Nullable
        public final Card getCard() {
            return this.card;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            Card card = this.card;
            int hashCode = (card == null ? 0 : card.hashCode()) * 31;
            BankAccount bankAccount = this.bankAccount;
            int hashCode2 = (hashCode + (bankAccount == null ? 0 : bankAccount.hashCode())) * 31;
            String str = this.brand;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bank;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Card card = this.card;
            BankAccount bankAccount = this.bankAccount;
            String str = this.brand;
            String str2 = this.name;
            String str3 = this.bank;
            return "Channel(card=" + card + ", bankAccount=" + bankAccount + ", brand=" + str + ", name=" + str2 + ", bank=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeParcelable(this.card, i);
            parcel.writeParcelable(this.bankAccount, i);
            parcel.writeString(this.brand);
            parcel.writeString(this.name);
            parcel.writeString(this.bank);
        }

        @StabilityInferred(parameters = 0)
        @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card;", "Landroid/os/Parcelable;", "", "chargeToken", "feeToken", "saveCardToken", "cardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardType", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel$Card */
        /* loaded from: classes8.dex */
        public static final class Card implements Parcelable {
            public static final int $stable = 0;
            @NotNull
            public static final CREATOR CREATOR = new CREATOR(null);
            @SerializedName("cardType")
            @Nullable
            private final String cardType;
            @SerializedName("chargeToken")
            @Nullable
            private final String chargeToken;
            @SerializedName("feeToken")
            @Nullable
            private final String feeToken;
            @SerializedName("saveCardToken")
            @Nullable
            private final String saveCardToken;

            @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$Channel$Card;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel$Card$CREATOR */
            /* loaded from: classes8.dex */
            public static final class CREATOR implements Parcelable.Creator<Card> {
                public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private CREATOR() {
                }

                @Override // android.os.Parcelable.Creator
                @NotNull
                public Card createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Card(parcel);
                }

                @Override // android.os.Parcelable.Creator
                @NotNull
                public Card[] newArray(int i) {
                    return new Card[i];
                }
            }

            public Card(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                this.chargeToken = str;
                this.feeToken = str2;
                this.saveCardToken = str3;
                this.cardType = str4;
            }

            public static /* synthetic */ Card copy$default(Card card, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = card.chargeToken;
                }
                if ((i & 2) != 0) {
                    str2 = card.feeToken;
                }
                if ((i & 4) != 0) {
                    str3 = card.saveCardToken;
                }
                if ((i & 8) != 0) {
                    str4 = card.cardType;
                }
                return card.copy(str, str2, str3, str4);
            }

            @Nullable
            public final String component4() {
                return this.cardType;
            }

            @NotNull
            public final Card copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
                return new Card(str, str2, str3, str4);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Card) {
                    Card card = (Card) obj;
                    return Intrinsics.areEqual(this.chargeToken, card.chargeToken) && Intrinsics.areEqual(this.feeToken, card.feeToken) && Intrinsics.areEqual(this.saveCardToken, card.saveCardToken) && Intrinsics.areEqual(this.cardType, card.cardType);
                }
                return false;
            }

            @Nullable
            public final String getCardType() {
                return this.cardType;
            }

            public int hashCode() {
                String str = this.chargeToken;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.feeToken;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.saveCardToken;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cardType;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.chargeToken;
                String str2 = this.feeToken;
                String str3 = this.saveCardToken;
                String str4 = this.cardType;
                return "Card(chargeToken=" + str + ", feeToken=" + str2 + ", saveCardToken=" + str3 + ", cardType=" + str4 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.writeString(this.chargeToken);
                parcel.writeString(this.feeToken);
                parcel.writeString(this.saveCardToken);
                parcel.writeString(this.cardType);
            }

            public /* synthetic */ Card(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, (i & 8) != 0 ? "" : str4);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Card(@NotNull Parcel parcel) {
                this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                Intrinsics.checkNotNullParameter(parcel, "parcel");
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Channel(@NotNull Parcel parcel) {
            this((Card) parcel.readParcelable(Card.class.getClassLoader()), (BankAccount) parcel.readParcelable(BankAccount.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            Intrinsics.checkNotNullParameter(parcel, "parcel");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001e¨\u0006 "}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;", "Landroid/os/Parcelable;", "", "amount", "", "fee", "total", "<init>", "(IFF)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(IFF)Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "F", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$DolPrice */
    /* loaded from: classes8.dex */
    public static final class DolPrice implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final CREATOR CREATOR = new CREATOR(null);
        @SerializedName("amount")
        private final int amount;
        @SerializedName("fee")
        private final float fee;
        @SerializedName("total")
        private final float total;

        @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestChargeV2$DolPrice;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$DolPrice$CREATOR */
        /* loaded from: classes8.dex */
        public static final class CREATOR implements Parcelable.Creator<DolPrice> {
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public DolPrice createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DolPrice(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public DolPrice[] newArray(int i) {
                return new DolPrice[i];
            }
        }

        public DolPrice(int i, float f, float f2) {
            this.amount = i;
            this.fee = f;
            this.total = f2;
        }

        public static /* synthetic */ DolPrice copy$default(DolPrice dolPrice, int i, float f, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dolPrice.amount;
            }
            if ((i2 & 2) != 0) {
                f = dolPrice.fee;
            }
            if ((i2 & 4) != 0) {
                f2 = dolPrice.total;
            }
            return dolPrice.copy(i, f, f2);
        }

        @NotNull
        public final DolPrice copy(int i, float f, float f2) {
            return new DolPrice(i, f, f2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DolPrice) {
                DolPrice dolPrice = (DolPrice) obj;
                return this.amount == dolPrice.amount && Float.compare(this.fee, dolPrice.fee) == 0 && Float.compare(this.total, dolPrice.total) == 0;
            }
            return false;
        }

        public int hashCode() {
            return (((this.amount * 31) + Float.floatToIntBits(this.fee)) * 31) + Float.floatToIntBits(this.total);
        }

        @NotNull
        public String toString() {
            int i = this.amount;
            float f = this.fee;
            float f2 = this.total;
            return "DolPrice(amount=" + i + ", fee=" + f + ", total=" + f2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeInt(this.amount);
            parcel.writeFloat(this.fee);
            parcel.writeFloat(this.total);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DolPrice(@NotNull Parcel parcel) {
            this(parcel.readInt(), parcel.readFloat(), parcel.readFloat());
            Intrinsics.checkNotNullParameter(parcel, "parcel");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BuyDolRequestChargeV2(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.Class<th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$DolPrice> r0 = th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2.DolPrice.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r8.readParcelable(r0)
            r2 = r0
            th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$DolPrice r2 = (th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2.DolPrice) r2
            java.lang.String r0 = r8.readString()
            if (r0 != 0) goto L1a
            java.lang.String r0 = ""
        L1a:
            r3 = r0
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            java.lang.Class<th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel> r0 = th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2.Channel.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r8 = r8.readParcelable(r0)
            r6 = r8
            th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2$Channel r6 = (th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2.Channel) r6
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2.<init>(android.os.Parcel):void");
    }
}
