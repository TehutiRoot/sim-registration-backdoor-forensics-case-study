package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003Ji\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpMarketingPackageRequest;", "", "media", "", "voiceOverMedia", "customerType", "accountSubType", "orderAction", "shopCode", "saleCode", "salesGroup", "salesRole", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccountSubType", "()Ljava/lang/String;", "getCustomerType", "getMedia", "getOrderAction", "getSaleCode", "getSalesGroup", "getSalesRole", "()Ljava/util/List;", "getShopCode", "getVoiceOverMedia", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpMarketingPackageRequest */
/* loaded from: classes8.dex */
public final class FlpMarketingPackageRequest {
    public static final int $stable = 8;
    @SerializedName("accountSubType")
    @NotNull
    private final String accountSubType;
    @SerializedName("customerType")
    @NotNull
    private final String customerType;
    @SerializedName("media")
    @NotNull
    private final String media;
    @SerializedName("orderAction")
    @NotNull
    private final String orderAction;
    @SerializedName("saleCode")
    @NotNull
    private final String saleCode;
    @SerializedName("salesGroup")
    @NotNull
    private final String salesGroup;
    @SerializedName("salesRole")
    @NotNull
    private final List<String> salesRole;
    @SerializedName("shopCode")
    @NotNull
    private final String shopCode;
    @SerializedName("voiceOverMedia")
    @NotNull
    private final String voiceOverMedia;

    public FlpMarketingPackageRequest(@NotNull String media, @NotNull String voiceOverMedia, @NotNull String customerType, @NotNull String accountSubType, @NotNull String orderAction, @NotNull String shopCode, @NotNull String saleCode, @NotNull String salesGroup, @NotNull List<String> salesRole) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(voiceOverMedia, "voiceOverMedia");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        Intrinsics.checkNotNullParameter(accountSubType, "accountSubType");
        Intrinsics.checkNotNullParameter(orderAction, "orderAction");
        Intrinsics.checkNotNullParameter(shopCode, "shopCode");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        Intrinsics.checkNotNullParameter(salesGroup, "salesGroup");
        Intrinsics.checkNotNullParameter(salesRole, "salesRole");
        this.media = media;
        this.voiceOverMedia = voiceOverMedia;
        this.customerType = customerType;
        this.accountSubType = accountSubType;
        this.orderAction = orderAction;
        this.shopCode = shopCode;
        this.saleCode = saleCode;
        this.salesGroup = salesGroup;
        this.salesRole = salesRole;
    }

    @NotNull
    public final String component1() {
        return this.media;
    }

    @NotNull
    public final String component2() {
        return this.voiceOverMedia;
    }

    @NotNull
    public final String component3() {
        return this.customerType;
    }

    @NotNull
    public final String component4() {
        return this.accountSubType;
    }

    @NotNull
    public final String component5() {
        return this.orderAction;
    }

    @NotNull
    public final String component6() {
        return this.shopCode;
    }

    @NotNull
    public final String component7() {
        return this.saleCode;
    }

    @NotNull
    public final String component8() {
        return this.salesGroup;
    }

    @NotNull
    public final List<String> component9() {
        return this.salesRole;
    }

    @NotNull
    public final FlpMarketingPackageRequest copy(@NotNull String media, @NotNull String voiceOverMedia, @NotNull String customerType, @NotNull String accountSubType, @NotNull String orderAction, @NotNull String shopCode, @NotNull String saleCode, @NotNull String salesGroup, @NotNull List<String> salesRole) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(voiceOverMedia, "voiceOverMedia");
        Intrinsics.checkNotNullParameter(customerType, "customerType");
        Intrinsics.checkNotNullParameter(accountSubType, "accountSubType");
        Intrinsics.checkNotNullParameter(orderAction, "orderAction");
        Intrinsics.checkNotNullParameter(shopCode, "shopCode");
        Intrinsics.checkNotNullParameter(saleCode, "saleCode");
        Intrinsics.checkNotNullParameter(salesGroup, "salesGroup");
        Intrinsics.checkNotNullParameter(salesRole, "salesRole");
        return new FlpMarketingPackageRequest(media, voiceOverMedia, customerType, accountSubType, orderAction, shopCode, saleCode, salesGroup, salesRole);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlpMarketingPackageRequest) {
            FlpMarketingPackageRequest flpMarketingPackageRequest = (FlpMarketingPackageRequest) obj;
            return Intrinsics.areEqual(this.media, flpMarketingPackageRequest.media) && Intrinsics.areEqual(this.voiceOverMedia, flpMarketingPackageRequest.voiceOverMedia) && Intrinsics.areEqual(this.customerType, flpMarketingPackageRequest.customerType) && Intrinsics.areEqual(this.accountSubType, flpMarketingPackageRequest.accountSubType) && Intrinsics.areEqual(this.orderAction, flpMarketingPackageRequest.orderAction) && Intrinsics.areEqual(this.shopCode, flpMarketingPackageRequest.shopCode) && Intrinsics.areEqual(this.saleCode, flpMarketingPackageRequest.saleCode) && Intrinsics.areEqual(this.salesGroup, flpMarketingPackageRequest.salesGroup) && Intrinsics.areEqual(this.salesRole, flpMarketingPackageRequest.salesRole);
        }
        return false;
    }

    @NotNull
    public final String getAccountSubType() {
        return this.accountSubType;
    }

    @NotNull
    public final String getCustomerType() {
        return this.customerType;
    }

    @NotNull
    public final String getMedia() {
        return this.media;
    }

    @NotNull
    public final String getOrderAction() {
        return this.orderAction;
    }

    @NotNull
    public final String getSaleCode() {
        return this.saleCode;
    }

    @NotNull
    public final String getSalesGroup() {
        return this.salesGroup;
    }

    @NotNull
    public final List<String> getSalesRole() {
        return this.salesRole;
    }

    @NotNull
    public final String getShopCode() {
        return this.shopCode;
    }

    @NotNull
    public final String getVoiceOverMedia() {
        return this.voiceOverMedia;
    }

    public int hashCode() {
        return (((((((((((((((this.media.hashCode() * 31) + this.voiceOverMedia.hashCode()) * 31) + this.customerType.hashCode()) * 31) + this.accountSubType.hashCode()) * 31) + this.orderAction.hashCode()) * 31) + this.shopCode.hashCode()) * 31) + this.saleCode.hashCode()) * 31) + this.salesGroup.hashCode()) * 31) + this.salesRole.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.media;
        String str2 = this.voiceOverMedia;
        String str3 = this.customerType;
        String str4 = this.accountSubType;
        String str5 = this.orderAction;
        String str6 = this.shopCode;
        String str7 = this.saleCode;
        String str8 = this.salesGroup;
        List<String> list = this.salesRole;
        return "FlpMarketingPackageRequest(media=" + str + ", voiceOverMedia=" + str2 + ", customerType=" + str3 + ", accountSubType=" + str4 + ", orderAction=" + str5 + ", shopCode=" + str6 + ", saleCode=" + str7 + ", salesGroup=" + str8 + ", salesRole=" + list + ")";
    }
}
