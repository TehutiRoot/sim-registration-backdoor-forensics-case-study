package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.p052enum.SellingType;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003Jm\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u00020\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012¨\u0006;"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/PackageGroupModel;", "", "packageGroupCode", "", "packageGroupDescription", "switchOnReasonCode", "switchOnReasonDescription", "marketingDescription", "promotionCode", "specialType", "amount", "locationName", "sellingType", "Lth/co/dtac/android/dtacone/util/enum/SellingType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/util/enum/SellingType;)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getLocationName", "setLocationName", "getMarketingDescription", "setMarketingDescription", "marketingDescriptionThai", "getMarketingDescriptionThai", "setMarketingDescriptionThai", "getPackageGroupCode", "setPackageGroupCode", "getPackageGroupDescription", "setPackageGroupDescription", "getPromotionCode", "setPromotionCode", "getSellingType", "()Lth/co/dtac/android/dtacone/util/enum/SellingType;", "setSellingType", "(Lth/co/dtac/android/dtacone/util/enum/SellingType;)V", "getSpecialType", "setSpecialType", "getSwitchOnReasonCode", "setSwitchOnReasonCode", "getSwitchOnReasonDescription", "setSwitchOnReasonDescription", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.PackageGroupModel */
/* loaded from: classes8.dex */
public final class PackageGroupModel {
    public static final int $stable = 8;
    @SerializedName("amount")
    @NotNull
    private String amount;
    @NotNull
    private transient String locationName;
    @SerializedName("marketingDescription")
    @NotNull
    private String marketingDescription;
    @NotNull
    private String marketingDescriptionThai;
    @SerializedName("packageGroupCode")
    @NotNull
    private String packageGroupCode;
    @SerializedName("packageGroupDescription")
    @NotNull
    private String packageGroupDescription;
    @SerializedName("promotionCode")
    @NotNull
    private String promotionCode;
    @NotNull
    private transient SellingType sellingType;
    @SerializedName("specialType")
    @NotNull
    private String specialType;
    @SerializedName("switchOnReasonCode")
    @NotNull
    private String switchOnReasonCode;
    @SerializedName("switchOnReasonDescription")
    @NotNull
    private String switchOnReasonDescription;

    public PackageGroupModel() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    public final String component1() {
        return this.packageGroupCode;
    }

    @NotNull
    public final SellingType component10() {
        return this.sellingType;
    }

    @NotNull
    public final String component2() {
        return this.packageGroupDescription;
    }

    @NotNull
    public final String component3() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String component4() {
        return this.switchOnReasonDescription;
    }

    @NotNull
    public final String component5() {
        return this.marketingDescription;
    }

    @NotNull
    public final String component6() {
        return this.promotionCode;
    }

    @NotNull
    public final String component7() {
        return this.specialType;
    }

    @NotNull
    public final String component8() {
        return this.amount;
    }

    @NotNull
    public final String component9() {
        return this.locationName;
    }

    @NotNull
    public final PackageGroupModel copy(@NotNull String packageGroupCode, @NotNull String packageGroupDescription, @NotNull String switchOnReasonCode, @NotNull String switchOnReasonDescription, @NotNull String marketingDescription, @NotNull String promotionCode, @NotNull String specialType, @NotNull String amount, @NotNull String locationName, @NotNull SellingType sellingType) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescription, "packageGroupDescription");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(switchOnReasonDescription, "switchOnReasonDescription");
        Intrinsics.checkNotNullParameter(marketingDescription, "marketingDescription");
        Intrinsics.checkNotNullParameter(promotionCode, "promotionCode");
        Intrinsics.checkNotNullParameter(specialType, "specialType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(sellingType, "sellingType");
        return new PackageGroupModel(packageGroupCode, packageGroupDescription, switchOnReasonCode, switchOnReasonDescription, marketingDescription, promotionCode, specialType, amount, locationName, sellingType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackageGroupModel) {
            PackageGroupModel packageGroupModel = (PackageGroupModel) obj;
            return Intrinsics.areEqual(this.packageGroupCode, packageGroupModel.packageGroupCode) && Intrinsics.areEqual(this.packageGroupDescription, packageGroupModel.packageGroupDescription) && Intrinsics.areEqual(this.switchOnReasonCode, packageGroupModel.switchOnReasonCode) && Intrinsics.areEqual(this.switchOnReasonDescription, packageGroupModel.switchOnReasonDescription) && Intrinsics.areEqual(this.marketingDescription, packageGroupModel.marketingDescription) && Intrinsics.areEqual(this.promotionCode, packageGroupModel.promotionCode) && Intrinsics.areEqual(this.specialType, packageGroupModel.specialType) && Intrinsics.areEqual(this.amount, packageGroupModel.amount) && Intrinsics.areEqual(this.locationName, packageGroupModel.locationName) && this.sellingType == packageGroupModel.sellingType;
        }
        return false;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getLocationName() {
        return this.locationName;
    }

    @NotNull
    public final String getMarketingDescription() {
        return this.marketingDescription;
    }

    @NotNull
    public final String getMarketingDescriptionThai() {
        String str = this.packageGroupCode;
        String str2 = this.marketingDescriptionThai;
        return "[" + str + "] " + str2;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getPackageGroupDescription() {
        return this.packageGroupDescription;
    }

    @NotNull
    public final String getPromotionCode() {
        return this.promotionCode;
    }

    @NotNull
    public final SellingType getSellingType() {
        return this.sellingType;
    }

    @NotNull
    public final String getSpecialType() {
        return this.specialType;
    }

    @NotNull
    public final String getSwitchOnReasonCode() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String getSwitchOnReasonDescription() {
        return this.switchOnReasonDescription;
    }

    public int hashCode() {
        return (((((((((((((((((this.packageGroupCode.hashCode() * 31) + this.packageGroupDescription.hashCode()) * 31) + this.switchOnReasonCode.hashCode()) * 31) + this.switchOnReasonDescription.hashCode()) * 31) + this.marketingDescription.hashCode()) * 31) + this.promotionCode.hashCode()) * 31) + this.specialType.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.locationName.hashCode()) * 31) + this.sellingType.hashCode();
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amount = str;
    }

    public final void setLocationName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locationName = str;
    }

    public final void setMarketingDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.marketingDescription = str;
    }

    public final void setMarketingDescriptionThai(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.marketingDescriptionThai = str;
    }

    public final void setPackageGroupCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupCode = str;
    }

    public final void setPackageGroupDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageGroupDescription = str;
    }

    public final void setPromotionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.promotionCode = str;
    }

    public final void setSellingType(@NotNull SellingType sellingType) {
        Intrinsics.checkNotNullParameter(sellingType, "<set-?>");
        this.sellingType = sellingType;
    }

    public final void setSpecialType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.specialType = str;
    }

    public final void setSwitchOnReasonCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnReasonCode = str;
    }

    public final void setSwitchOnReasonDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.switchOnReasonDescription = str;
    }

    @NotNull
    public String toString() {
        String str = this.packageGroupCode;
        String str2 = this.packageGroupDescription;
        String str3 = this.switchOnReasonCode;
        String str4 = this.switchOnReasonDescription;
        String str5 = this.marketingDescription;
        String str6 = this.promotionCode;
        String str7 = this.specialType;
        String str8 = this.amount;
        String str9 = this.locationName;
        SellingType sellingType = this.sellingType;
        return "PackageGroupModel(packageGroupCode=" + str + ", packageGroupDescription=" + str2 + ", switchOnReasonCode=" + str3 + ", switchOnReasonDescription=" + str4 + ", marketingDescription=" + str5 + ", promotionCode=" + str6 + ", specialType=" + str7 + ", amount=" + str8 + ", locationName=" + str9 + ", sellingType=" + sellingType + ")";
    }

    public PackageGroupModel(@NotNull String packageGroupCode, @NotNull String packageGroupDescription, @NotNull String switchOnReasonCode, @NotNull String switchOnReasonDescription, @NotNull String marketingDescription, @NotNull String promotionCode, @NotNull String specialType, @NotNull String amount, @NotNull String locationName, @NotNull SellingType sellingType) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescription, "packageGroupDescription");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(switchOnReasonDescription, "switchOnReasonDescription");
        Intrinsics.checkNotNullParameter(marketingDescription, "marketingDescription");
        Intrinsics.checkNotNullParameter(promotionCode, "promotionCode");
        Intrinsics.checkNotNullParameter(specialType, "specialType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(locationName, "locationName");
        Intrinsics.checkNotNullParameter(sellingType, "sellingType");
        this.packageGroupCode = packageGroupCode;
        this.packageGroupDescription = packageGroupDescription;
        this.switchOnReasonCode = switchOnReasonCode;
        this.switchOnReasonDescription = switchOnReasonDescription;
        this.marketingDescription = marketingDescription;
        this.promotionCode = promotionCode;
        this.specialType = specialType;
        this.amount = amount;
        this.locationName = locationName;
        this.sellingType = sellingType;
        this.marketingDescriptionThai = "";
    }

    public /* synthetic */ PackageGroupModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SellingType sellingType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "", (i & 512) != 0 ? SellingType.NONE : sellingType);
    }
}