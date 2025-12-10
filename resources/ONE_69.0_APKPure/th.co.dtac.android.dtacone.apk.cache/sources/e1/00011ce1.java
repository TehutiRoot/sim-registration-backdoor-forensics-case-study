package th.p047co.dtac.android.dtacone.model.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/OmiseRequestToken;", "", "creditNumber", "", "cardName", "cardExpired", "cardCvv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardCvv", "()Ljava/lang/String;", "getCardExpired", "getCardName", "getCreditNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.OmiseRequestToken */
/* loaded from: classes8.dex */
public final class OmiseRequestToken {
    public static final int $stable = 0;
    @NotNull
    private final String cardCvv;
    @NotNull
    private final String cardExpired;
    @NotNull
    private final String cardName;
    @NotNull
    private final String creditNumber;

    public OmiseRequestToken(@NotNull String creditNumber, @NotNull String cardName, @NotNull String cardExpired, @NotNull String cardCvv) {
        Intrinsics.checkNotNullParameter(creditNumber, "creditNumber");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(cardExpired, "cardExpired");
        Intrinsics.checkNotNullParameter(cardCvv, "cardCvv");
        this.creditNumber = creditNumber;
        this.cardName = cardName;
        this.cardExpired = cardExpired;
        this.cardCvv = cardCvv;
    }

    public static /* synthetic */ OmiseRequestToken copy$default(OmiseRequestToken omiseRequestToken, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = omiseRequestToken.creditNumber;
        }
        if ((i & 2) != 0) {
            str2 = omiseRequestToken.cardName;
        }
        if ((i & 4) != 0) {
            str3 = omiseRequestToken.cardExpired;
        }
        if ((i & 8) != 0) {
            str4 = omiseRequestToken.cardCvv;
        }
        return omiseRequestToken.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.creditNumber;
    }

    @NotNull
    public final String component2() {
        return this.cardName;
    }

    @NotNull
    public final String component3() {
        return this.cardExpired;
    }

    @NotNull
    public final String component4() {
        return this.cardCvv;
    }

    @NotNull
    public final OmiseRequestToken copy(@NotNull String creditNumber, @NotNull String cardName, @NotNull String cardExpired, @NotNull String cardCvv) {
        Intrinsics.checkNotNullParameter(creditNumber, "creditNumber");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(cardExpired, "cardExpired");
        Intrinsics.checkNotNullParameter(cardCvv, "cardCvv");
        return new OmiseRequestToken(creditNumber, cardName, cardExpired, cardCvv);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OmiseRequestToken) {
            OmiseRequestToken omiseRequestToken = (OmiseRequestToken) obj;
            return Intrinsics.areEqual(this.creditNumber, omiseRequestToken.creditNumber) && Intrinsics.areEqual(this.cardName, omiseRequestToken.cardName) && Intrinsics.areEqual(this.cardExpired, omiseRequestToken.cardExpired) && Intrinsics.areEqual(this.cardCvv, omiseRequestToken.cardCvv);
        }
        return false;
    }

    @NotNull
    public final String getCardCvv() {
        return this.cardCvv;
    }

    @NotNull
    public final String getCardExpired() {
        return this.cardExpired;
    }

    @NotNull
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final String getCreditNumber() {
        return this.creditNumber;
    }

    public int hashCode() {
        return (((((this.creditNumber.hashCode() * 31) + this.cardName.hashCode()) * 31) + this.cardExpired.hashCode()) * 31) + this.cardCvv.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.creditNumber;
        String str2 = this.cardName;
        String str3 = this.cardExpired;
        String str4 = this.cardCvv;
        return "OmiseRequestToken(creditNumber=" + str + ", cardName=" + str2 + ", cardExpired=" + str3 + ", cardCvv=" + str4 + ")";
    }
}