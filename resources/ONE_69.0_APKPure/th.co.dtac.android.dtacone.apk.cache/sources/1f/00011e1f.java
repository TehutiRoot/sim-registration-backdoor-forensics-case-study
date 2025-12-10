package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/Discounts2;", "", "blockPackage", "", "campaignNameCode", "campaignType", "code", "ifrs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBlockPackage", "()Ljava/lang/String;", "getCampaignNameCode", "getCampaignType", "getCode", "getIfrs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.Discounts2 */
/* loaded from: classes8.dex */
public final class Discounts2 {
    public static final int $stable = 0;
    @SerializedName("blockPackage")
    @NotNull
    private final String blockPackage;
    @SerializedName("campaignNameCode")
    @NotNull
    private final String campaignNameCode;
    @SerializedName("campaignType")
    @NotNull
    private final String campaignType;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("ifrs")
    @NotNull
    private final String ifrs;

    public Discounts2(@NotNull String blockPackage, @NotNull String campaignNameCode, @NotNull String campaignType, @NotNull String code, @NotNull String ifrs) {
        Intrinsics.checkNotNullParameter(blockPackage, "blockPackage");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(ifrs, "ifrs");
        this.blockPackage = blockPackage;
        this.campaignNameCode = campaignNameCode;
        this.campaignType = campaignType;
        this.code = code;
        this.ifrs = ifrs;
    }

    public static /* synthetic */ Discounts2 copy$default(Discounts2 discounts2, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discounts2.blockPackage;
        }
        if ((i & 2) != 0) {
            str2 = discounts2.campaignNameCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = discounts2.campaignType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = discounts2.code;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = discounts2.ifrs;
        }
        return discounts2.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.blockPackage;
    }

    @NotNull
    public final String component2() {
        return this.campaignNameCode;
    }

    @NotNull
    public final String component3() {
        return this.campaignType;
    }

    @NotNull
    public final String component4() {
        return this.code;
    }

    @NotNull
    public final String component5() {
        return this.ifrs;
    }

    @NotNull
    public final Discounts2 copy(@NotNull String blockPackage, @NotNull String campaignNameCode, @NotNull String campaignType, @NotNull String code, @NotNull String ifrs) {
        Intrinsics.checkNotNullParameter(blockPackage, "blockPackage");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(ifrs, "ifrs");
        return new Discounts2(blockPackage, campaignNameCode, campaignType, code, ifrs);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Discounts2) {
            Discounts2 discounts2 = (Discounts2) obj;
            return Intrinsics.areEqual(this.blockPackage, discounts2.blockPackage) && Intrinsics.areEqual(this.campaignNameCode, discounts2.campaignNameCode) && Intrinsics.areEqual(this.campaignType, discounts2.campaignType) && Intrinsics.areEqual(this.code, discounts2.code) && Intrinsics.areEqual(this.ifrs, discounts2.ifrs);
        }
        return false;
    }

    @NotNull
    public final String getBlockPackage() {
        return this.blockPackage;
    }

    @NotNull
    public final String getCampaignNameCode() {
        return this.campaignNameCode;
    }

    @NotNull
    public final String getCampaignType() {
        return this.campaignType;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getIfrs() {
        return this.ifrs;
    }

    public int hashCode() {
        return (((((((this.blockPackage.hashCode() * 31) + this.campaignNameCode.hashCode()) * 31) + this.campaignType.hashCode()) * 31) + this.code.hashCode()) * 31) + this.ifrs.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.blockPackage;
        String str2 = this.campaignNameCode;
        String str3 = this.campaignType;
        String str4 = this.code;
        String str5 = this.ifrs;
        return "Discounts2(blockPackage=" + str + ", campaignNameCode=" + str2 + ", campaignType=" + str3 + ", code=" + str4 + ", ifrs=" + str5 + ")";
    }
}