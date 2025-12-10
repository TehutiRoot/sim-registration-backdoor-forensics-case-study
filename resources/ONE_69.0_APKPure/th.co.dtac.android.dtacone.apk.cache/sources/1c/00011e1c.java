package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0018HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010<J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jè\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00182\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\fHÖ\u0001J\t\u0010W\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010\"R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010\"R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010\"R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010\"R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010\"R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u001eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001e¨\u0006X"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "", "amount", "", "blockPackage", "", "blockPackageLevel", "code", "eForm", "ifrs", "name", "validityPeriod", "", "validityPeriodUnit", "campaignType", "campaignTypeDisplay", "campaignNameCode", "extraAdvanceAmount", "extraAdvanceAmountText", "extraAdvancePackageCode", "extraDiscountPackageCode", "extraAdvancePackageDescription", "extraDiscountPackageDescription", "hasExtraPackage", "", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBlockPackage", "()Ljava/lang/String;", "getBlockPackageLevel", "getCampaignNameCode", "setCampaignNameCode", "(Ljava/lang/String;)V", "getCampaignType", "setCampaignType", "getCampaignTypeDisplay", "setCampaignTypeDisplay", "getCode", "getEForm", "getExtraAdvanceAmount", "setExtraAdvanceAmount", "getExtraAdvanceAmountText", "setExtraAdvanceAmountText", "getExtraAdvancePackageCode", "setExtraAdvancePackageCode", "getExtraAdvancePackageDescription", "setExtraAdvancePackageDescription", "getExtraDiscountPackageCode", "setExtraDiscountPackageCode", "getExtraDiscountPackageDescription", "setExtraDiscountPackageDescription", "getHasExtraPackage", "()Z", "setHasExtraPackage", "(Z)V", "getIfrs", "getName", "getValidityPeriod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValidityPeriodUnit", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lth/co/dtac/android/dtacone/model/device_sale/Discount;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.Discount */
/* loaded from: classes8.dex */
public final class Discount {
    public static final int $stable = 8;
    @SerializedName("amount")
    @Nullable
    private final Double amount;
    @SerializedName("blockPackage")
    @Nullable
    private final String blockPackage;
    @SerializedName("blockPackageLevel")
    @Nullable
    private final String blockPackageLevel;
    @NotNull
    private transient String campaignNameCode;
    @NotNull
    private transient String campaignType;
    @NotNull
    private transient String campaignTypeDisplay;
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("eForm")
    @Nullable
    private final String eForm;
    @Nullable
    private transient String extraAdvanceAmount;
    @Nullable
    private transient String extraAdvanceAmountText;
    @Nullable
    private transient String extraAdvancePackageCode;
    @Nullable
    private transient String extraAdvancePackageDescription;
    @Nullable
    private transient String extraDiscountPackageCode;
    @Nullable
    private transient String extraDiscountPackageDescription;
    private transient boolean hasExtraPackage;
    @SerializedName("ifrs")
    @Nullable
    private final String ifrs;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName("validityPeriod")
    @Nullable
    private final Integer validityPeriod;
    @SerializedName("validityPeriodUnit")
    @Nullable
    private final String validityPeriodUnit;

    public Discount(@Nullable Double d, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String name, @Nullable Integer num, @Nullable String str6, @NotNull String campaignType, @NotNull String campaignTypeDisplay, @NotNull String campaignNameCode, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        Intrinsics.checkNotNullParameter(campaignTypeDisplay, "campaignTypeDisplay");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        this.amount = d;
        this.blockPackage = str;
        this.blockPackageLevel = str2;
        this.code = str3;
        this.eForm = str4;
        this.ifrs = str5;
        this.name = name;
        this.validityPeriod = num;
        this.validityPeriodUnit = str6;
        this.campaignType = campaignType;
        this.campaignTypeDisplay = campaignTypeDisplay;
        this.campaignNameCode = campaignNameCode;
        this.extraAdvanceAmount = str7;
        this.extraAdvanceAmountText = str8;
        this.extraAdvancePackageCode = str9;
        this.extraDiscountPackageCode = str10;
        this.extraAdvancePackageDescription = str11;
        this.extraDiscountPackageDescription = str12;
        this.hasExtraPackage = z;
    }

    @Nullable
    public final Double component1() {
        return this.amount;
    }

    @NotNull
    public final String component10() {
        return this.campaignType;
    }

    @NotNull
    public final String component11() {
        return this.campaignTypeDisplay;
    }

    @NotNull
    public final String component12() {
        return this.campaignNameCode;
    }

    @Nullable
    public final String component13() {
        return this.extraAdvanceAmount;
    }

    @Nullable
    public final String component14() {
        return this.extraAdvanceAmountText;
    }

    @Nullable
    public final String component15() {
        return this.extraAdvancePackageCode;
    }

    @Nullable
    public final String component16() {
        return this.extraDiscountPackageCode;
    }

    @Nullable
    public final String component17() {
        return this.extraAdvancePackageDescription;
    }

    @Nullable
    public final String component18() {
        return this.extraDiscountPackageDescription;
    }

    public final boolean component19() {
        return this.hasExtraPackage;
    }

    @Nullable
    public final String component2() {
        return this.blockPackage;
    }

    @Nullable
    public final String component3() {
        return this.blockPackageLevel;
    }

    @Nullable
    public final String component4() {
        return this.code;
    }

    @Nullable
    public final String component5() {
        return this.eForm;
    }

    @Nullable
    public final String component6() {
        return this.ifrs;
    }

    @NotNull
    public final String component7() {
        return this.name;
    }

    @Nullable
    public final Integer component8() {
        return this.validityPeriod;
    }

    @Nullable
    public final String component9() {
        return this.validityPeriodUnit;
    }

    @NotNull
    public final Discount copy(@Nullable Double d, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String name, @Nullable Integer num, @Nullable String str6, @NotNull String campaignType, @NotNull String campaignTypeDisplay, @NotNull String campaignNameCode, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        Intrinsics.checkNotNullParameter(campaignTypeDisplay, "campaignTypeDisplay");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        return new Discount(d, str, str2, str3, str4, str5, name, num, str6, campaignType, campaignTypeDisplay, campaignNameCode, str7, str8, str9, str10, str11, str12, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Discount) {
            Discount discount = (Discount) obj;
            return Intrinsics.areEqual((Object) this.amount, (Object) discount.amount) && Intrinsics.areEqual(this.blockPackage, discount.blockPackage) && Intrinsics.areEqual(this.blockPackageLevel, discount.blockPackageLevel) && Intrinsics.areEqual(this.code, discount.code) && Intrinsics.areEqual(this.eForm, discount.eForm) && Intrinsics.areEqual(this.ifrs, discount.ifrs) && Intrinsics.areEqual(this.name, discount.name) && Intrinsics.areEqual(this.validityPeriod, discount.validityPeriod) && Intrinsics.areEqual(this.validityPeriodUnit, discount.validityPeriodUnit) && Intrinsics.areEqual(this.campaignType, discount.campaignType) && Intrinsics.areEqual(this.campaignTypeDisplay, discount.campaignTypeDisplay) && Intrinsics.areEqual(this.campaignNameCode, discount.campaignNameCode) && Intrinsics.areEqual(this.extraAdvanceAmount, discount.extraAdvanceAmount) && Intrinsics.areEqual(this.extraAdvanceAmountText, discount.extraAdvanceAmountText) && Intrinsics.areEqual(this.extraAdvancePackageCode, discount.extraAdvancePackageCode) && Intrinsics.areEqual(this.extraDiscountPackageCode, discount.extraDiscountPackageCode) && Intrinsics.areEqual(this.extraAdvancePackageDescription, discount.extraAdvancePackageDescription) && Intrinsics.areEqual(this.extraDiscountPackageDescription, discount.extraDiscountPackageDescription) && this.hasExtraPackage == discount.hasExtraPackage;
        }
        return false;
    }

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBlockPackage() {
        return this.blockPackage;
    }

    @Nullable
    public final String getBlockPackageLevel() {
        return this.blockPackageLevel;
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
    public final String getCampaignTypeDisplay() {
        return this.campaignTypeDisplay;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getEForm() {
        return this.eForm;
    }

    @Nullable
    public final String getExtraAdvanceAmount() {
        return this.extraAdvanceAmount;
    }

    @Nullable
    public final String getExtraAdvanceAmountText() {
        return this.extraAdvanceAmountText;
    }

    @Nullable
    public final String getExtraAdvancePackageCode() {
        return this.extraAdvancePackageCode;
    }

    @Nullable
    public final String getExtraAdvancePackageDescription() {
        return this.extraAdvancePackageDescription;
    }

    @Nullable
    public final String getExtraDiscountPackageCode() {
        return this.extraDiscountPackageCode;
    }

    @Nullable
    public final String getExtraDiscountPackageDescription() {
        return this.extraDiscountPackageDescription;
    }

    public final boolean getHasExtraPackage() {
        return this.hasExtraPackage;
    }

    @Nullable
    public final String getIfrs() {
        return this.ifrs;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getValidityPeriod() {
        return this.validityPeriod;
    }

    @Nullable
    public final String getValidityPeriodUnit() {
        return this.validityPeriodUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Double d = this.amount;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.blockPackage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blockPackageLevel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eForm;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ifrs;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.name.hashCode()) * 31;
        Integer num = this.validityPeriod;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.validityPeriodUnit;
        int hashCode8 = (((((((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.campaignType.hashCode()) * 31) + this.campaignTypeDisplay.hashCode()) * 31) + this.campaignNameCode.hashCode()) * 31;
        String str7 = this.extraAdvanceAmount;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.extraAdvanceAmountText;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.extraAdvancePackageCode;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.extraDiscountPackageCode;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.extraAdvancePackageDescription;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.extraDiscountPackageDescription;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        boolean z = this.hasExtraPackage;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode14 + i;
    }

    public final void setCampaignNameCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.campaignNameCode = str;
    }

    public final void setCampaignType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.campaignType = str;
    }

    public final void setCampaignTypeDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.campaignTypeDisplay = str;
    }

    public final void setExtraAdvanceAmount(@Nullable String str) {
        this.extraAdvanceAmount = str;
    }

    public final void setExtraAdvanceAmountText(@Nullable String str) {
        this.extraAdvanceAmountText = str;
    }

    public final void setExtraAdvancePackageCode(@Nullable String str) {
        this.extraAdvancePackageCode = str;
    }

    public final void setExtraAdvancePackageDescription(@Nullable String str) {
        this.extraAdvancePackageDescription = str;
    }

    public final void setExtraDiscountPackageCode(@Nullable String str) {
        this.extraDiscountPackageCode = str;
    }

    public final void setExtraDiscountPackageDescription(@Nullable String str) {
        this.extraDiscountPackageDescription = str;
    }

    public final void setHasExtraPackage(boolean z) {
        this.hasExtraPackage = z;
    }

    @NotNull
    public String toString() {
        Double d = this.amount;
        String str = this.blockPackage;
        String str2 = this.blockPackageLevel;
        String str3 = this.code;
        String str4 = this.eForm;
        String str5 = this.ifrs;
        String str6 = this.name;
        Integer num = this.validityPeriod;
        String str7 = this.validityPeriodUnit;
        String str8 = this.campaignType;
        String str9 = this.campaignTypeDisplay;
        String str10 = this.campaignNameCode;
        String str11 = this.extraAdvanceAmount;
        String str12 = this.extraAdvanceAmountText;
        String str13 = this.extraAdvancePackageCode;
        String str14 = this.extraDiscountPackageCode;
        String str15 = this.extraAdvancePackageDescription;
        String str16 = this.extraDiscountPackageDescription;
        boolean z = this.hasExtraPackage;
        return "Discount(amount=" + d + ", blockPackage=" + str + ", blockPackageLevel=" + str2 + ", code=" + str3 + ", eForm=" + str4 + ", ifrs=" + str5 + ", name=" + str6 + ", validityPeriod=" + num + ", validityPeriodUnit=" + str7 + ", campaignType=" + str8 + ", campaignTypeDisplay=" + str9 + ", campaignNameCode=" + str10 + ", extraAdvanceAmount=" + str11 + ", extraAdvanceAmountText=" + str12 + ", extraAdvancePackageCode=" + str13 + ", extraDiscountPackageCode=" + str14 + ", extraAdvancePackageDescription=" + str15 + ", extraDiscountPackageDescription=" + str16 + ", hasExtraPackage=" + z + ")";
    }

    public /* synthetic */ Discount(Double d, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, str2, str3, str4, str5, str6, num, str7, str8, str9, str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (32768 & i) != 0 ? null : str14, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : str16, (i & 262144) != 0 ? false : z);
    }
}