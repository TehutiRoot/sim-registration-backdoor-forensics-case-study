package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingDetails;", "", "marketingCode", "", "marketingName", "marketingSpeedUpValue", "marketingSpeedDownValue", "marketingSpeedUpUnit", "marketingSpeedDownUnit", "marketingRecurringChargeAmount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getMarketingCode", "()Ljava/lang/String;", "getMarketingName", "getMarketingRecurringChargeAmount", "()I", "getMarketingSpeedDownUnit", "getMarketingSpeedDownValue", "getMarketingSpeedUpUnit", "getMarketingSpeedUpValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails */
/* loaded from: classes8.dex */
public final class MarketingDetails {
    public static final int $stable = 0;
    @SerializedName("marketingCode")
    @NotNull
    private final String marketingCode;
    @SerializedName("marketingName")
    @NotNull
    private final String marketingName;
    @SerializedName("marketingRecurringChargeAmount")
    private final int marketingRecurringChargeAmount;
    @SerializedName("marketingSpeedDownUnit")
    @NotNull
    private final String marketingSpeedDownUnit;
    @SerializedName("marketingSpeedDownValue")
    @NotNull
    private final String marketingSpeedDownValue;
    @SerializedName("marketingSpeedUpUnit")
    @NotNull
    private final String marketingSpeedUpUnit;
    @SerializedName("marketingSpeedUpValue")
    @NotNull
    private final String marketingSpeedUpValue;

    public MarketingDetails() {
        this(null, null, null, null, null, null, 0, 127, null);
    }

    public static /* synthetic */ MarketingDetails copy$default(MarketingDetails marketingDetails, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marketingDetails.marketingCode;
        }
        if ((i2 & 2) != 0) {
            str2 = marketingDetails.marketingName;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = marketingDetails.marketingSpeedUpValue;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = marketingDetails.marketingSpeedDownValue;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = marketingDetails.marketingSpeedUpUnit;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            str6 = marketingDetails.marketingSpeedDownUnit;
        }
        String str11 = str6;
        if ((i2 & 64) != 0) {
            i = marketingDetails.marketingRecurringChargeAmount;
        }
        return marketingDetails.copy(str, str7, str8, str9, str10, str11, i);
    }

    @NotNull
    public final String component1() {
        return this.marketingCode;
    }

    @NotNull
    public final String component2() {
        return this.marketingName;
    }

    @NotNull
    public final String component3() {
        return this.marketingSpeedUpValue;
    }

    @NotNull
    public final String component4() {
        return this.marketingSpeedDownValue;
    }

    @NotNull
    public final String component5() {
        return this.marketingSpeedUpUnit;
    }

    @NotNull
    public final String component6() {
        return this.marketingSpeedDownUnit;
    }

    public final int component7() {
        return this.marketingRecurringChargeAmount;
    }

    @NotNull
    public final MarketingDetails copy(@NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingSpeedUpValue, @NotNull String marketingSpeedDownValue, @NotNull String marketingSpeedUpUnit, @NotNull String marketingSpeedDownUnit, int i) {
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(marketingSpeedUpValue, "marketingSpeedUpValue");
        Intrinsics.checkNotNullParameter(marketingSpeedDownValue, "marketingSpeedDownValue");
        Intrinsics.checkNotNullParameter(marketingSpeedUpUnit, "marketingSpeedUpUnit");
        Intrinsics.checkNotNullParameter(marketingSpeedDownUnit, "marketingSpeedDownUnit");
        return new MarketingDetails(marketingCode, marketingName, marketingSpeedUpValue, marketingSpeedDownValue, marketingSpeedUpUnit, marketingSpeedDownUnit, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarketingDetails) {
            MarketingDetails marketingDetails = (MarketingDetails) obj;
            return Intrinsics.areEqual(this.marketingCode, marketingDetails.marketingCode) && Intrinsics.areEqual(this.marketingName, marketingDetails.marketingName) && Intrinsics.areEqual(this.marketingSpeedUpValue, marketingDetails.marketingSpeedUpValue) && Intrinsics.areEqual(this.marketingSpeedDownValue, marketingDetails.marketingSpeedDownValue) && Intrinsics.areEqual(this.marketingSpeedUpUnit, marketingDetails.marketingSpeedUpUnit) && Intrinsics.areEqual(this.marketingSpeedDownUnit, marketingDetails.marketingSpeedDownUnit) && this.marketingRecurringChargeAmount == marketingDetails.marketingRecurringChargeAmount;
        }
        return false;
    }

    @NotNull
    public final String getMarketingCode() {
        return this.marketingCode;
    }

    @NotNull
    public final String getMarketingName() {
        return this.marketingName;
    }

    public final int getMarketingRecurringChargeAmount() {
        return this.marketingRecurringChargeAmount;
    }

    @NotNull
    public final String getMarketingSpeedDownUnit() {
        return this.marketingSpeedDownUnit;
    }

    @NotNull
    public final String getMarketingSpeedDownValue() {
        return this.marketingSpeedDownValue;
    }

    @NotNull
    public final String getMarketingSpeedUpUnit() {
        return this.marketingSpeedUpUnit;
    }

    @NotNull
    public final String getMarketingSpeedUpValue() {
        return this.marketingSpeedUpValue;
    }

    public int hashCode() {
        return (((((((((((this.marketingCode.hashCode() * 31) + this.marketingName.hashCode()) * 31) + this.marketingSpeedUpValue.hashCode()) * 31) + this.marketingSpeedDownValue.hashCode()) * 31) + this.marketingSpeedUpUnit.hashCode()) * 31) + this.marketingSpeedDownUnit.hashCode()) * 31) + this.marketingRecurringChargeAmount;
    }

    @NotNull
    public String toString() {
        String str = this.marketingCode;
        String str2 = this.marketingName;
        String str3 = this.marketingSpeedUpValue;
        String str4 = this.marketingSpeedDownValue;
        String str5 = this.marketingSpeedUpUnit;
        String str6 = this.marketingSpeedDownUnit;
        int i = this.marketingRecurringChargeAmount;
        return "MarketingDetails(marketingCode=" + str + ", marketingName=" + str2 + ", marketingSpeedUpValue=" + str3 + ", marketingSpeedDownValue=" + str4 + ", marketingSpeedUpUnit=" + str5 + ", marketingSpeedDownUnit=" + str6 + ", marketingRecurringChargeAmount=" + i + ")";
    }

    public MarketingDetails(@NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingSpeedUpValue, @NotNull String marketingSpeedDownValue, @NotNull String marketingSpeedUpUnit, @NotNull String marketingSpeedDownUnit, int i) {
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(marketingSpeedUpValue, "marketingSpeedUpValue");
        Intrinsics.checkNotNullParameter(marketingSpeedDownValue, "marketingSpeedDownValue");
        Intrinsics.checkNotNullParameter(marketingSpeedUpUnit, "marketingSpeedUpUnit");
        Intrinsics.checkNotNullParameter(marketingSpeedDownUnit, "marketingSpeedDownUnit");
        this.marketingCode = marketingCode;
        this.marketingName = marketingName;
        this.marketingSpeedUpValue = marketingSpeedUpValue;
        this.marketingSpeedDownValue = marketingSpeedDownValue;
        this.marketingSpeedUpUnit = marketingSpeedUpUnit;
        this.marketingSpeedDownUnit = marketingSpeedDownUnit;
        this.marketingRecurringChargeAmount = i;
    }

    public /* synthetic */ MarketingDetails(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) == 0 ? str6 : "", (i2 & 64) != 0 ? 0 : i);
    }
}
