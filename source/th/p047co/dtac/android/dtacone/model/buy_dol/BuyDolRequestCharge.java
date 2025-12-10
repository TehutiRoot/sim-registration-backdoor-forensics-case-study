package th.p047co.dtac.android.dtacone.model.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.buy_dol.charge.CardCharge;
import th.p047co.dtac.android.dtacone.model.buy_dol.dol_price.BuyDolPrice;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolRequestCharge;", "", "chargeToken", "", "feeToken", "saveCardToken", "dolPrice", "Lth/co/dtac/android/dtacone/model/buy_dol/dol_price/BuyDolPrice;", "simR", "card", "Lth/co/dtac/android/dtacone/model/buy_dol/charge/CardCharge;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/buy_dol/dol_price/BuyDolPrice;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/buy_dol/charge/CardCharge;)V", "getCard", "()Lth/co/dtac/android/dtacone/model/buy_dol/charge/CardCharge;", "getChargeToken", "()Ljava/lang/String;", "getDolPrice", "()Lth/co/dtac/android/dtacone/model/buy_dol/dol_price/BuyDolPrice;", "getFeeToken", "getSaveCardToken", "getSimR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.BuyDolRequestCharge */
/* loaded from: classes8.dex */
public final class BuyDolRequestCharge {
    public static final int $stable = 0;
    @SerializedName("card")
    @NotNull
    private final CardCharge card;
    @SerializedName("chargeToken")
    @NotNull
    private final String chargeToken;
    @SerializedName("dolPrice")
    @NotNull
    private final BuyDolPrice dolPrice;
    @SerializedName("feeToken")
    @Nullable
    private final String feeToken;
    @SerializedName("saveCardToken")
    @Nullable
    private final String saveCardToken;
    @SerializedName("simR")
    @NotNull
    private final String simR;

    public BuyDolRequestCharge(@NotNull String chargeToken, @Nullable String str, @Nullable String str2, @NotNull BuyDolPrice dolPrice, @NotNull String simR, @NotNull CardCharge card) {
        Intrinsics.checkNotNullParameter(chargeToken, "chargeToken");
        Intrinsics.checkNotNullParameter(dolPrice, "dolPrice");
        Intrinsics.checkNotNullParameter(simR, "simR");
        Intrinsics.checkNotNullParameter(card, "card");
        this.chargeToken = chargeToken;
        this.feeToken = str;
        this.saveCardToken = str2;
        this.dolPrice = dolPrice;
        this.simR = simR;
        this.card = card;
    }

    @NotNull
    public final CardCharge getCard() {
        return this.card;
    }

    @NotNull
    public final String getChargeToken() {
        return this.chargeToken;
    }

    @NotNull
    public final BuyDolPrice getDolPrice() {
        return this.dolPrice;
    }

    @Nullable
    public final String getFeeToken() {
        return this.feeToken;
    }

    @Nullable
    public final String getSaveCardToken() {
        return this.saveCardToken;
    }

    @NotNull
    public final String getSimR() {
        return this.simR;
    }
}
