package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetExtraAdvanceDetailRequest;", "", "userCode", "", "userFormatType", "productPrice", "", "packagePrice", "blacklistSharingResult", "campaignNameCode", "(Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Ljava/lang/String;)V", "getBlacklistSharingResult", "()Ljava/lang/String;", "getCampaignNameCode", "getPackagePrice", "()F", "getProductPrice", "getUserCode", "getUserFormatType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetExtraAdvanceDetailRequest */
/* loaded from: classes8.dex */
public final class GetExtraAdvanceDetailRequest {
    public static final int $stable = 0;
    @SerializedName("blacklistSharingResult")
    @NotNull
    private final String blacklistSharingResult;
    @SerializedName("campaignNameCode")
    @NotNull
    private final String campaignNameCode;
    @SerializedName("packagePrice")
    private final float packagePrice;
    @SerializedName("productPrice")
    private final float productPrice;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;
    @SerializedName("userFormatType")
    @NotNull
    private final String userFormatType;

    public GetExtraAdvanceDetailRequest(@NotNull String userCode, @NotNull String userFormatType, float f, float f2, @NotNull String blacklistSharingResult, @NotNull String campaignNameCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(blacklistSharingResult, "blacklistSharingResult");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        this.userCode = userCode;
        this.userFormatType = userFormatType;
        this.productPrice = f;
        this.packagePrice = f2;
        this.blacklistSharingResult = blacklistSharingResult;
        this.campaignNameCode = campaignNameCode;
    }

    public static /* synthetic */ GetExtraAdvanceDetailRequest copy$default(GetExtraAdvanceDetailRequest getExtraAdvanceDetailRequest, String str, String str2, float f, float f2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getExtraAdvanceDetailRequest.userCode;
        }
        if ((i & 2) != 0) {
            str2 = getExtraAdvanceDetailRequest.userFormatType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            f = getExtraAdvanceDetailRequest.productPrice;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = getExtraAdvanceDetailRequest.packagePrice;
        }
        float f4 = f2;
        if ((i & 16) != 0) {
            str3 = getExtraAdvanceDetailRequest.blacklistSharingResult;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = getExtraAdvanceDetailRequest.campaignNameCode;
        }
        return getExtraAdvanceDetailRequest.copy(str, str5, f3, f4, str6, str4);
    }

    @NotNull
    public final String component1() {
        return this.userCode;
    }

    @NotNull
    public final String component2() {
        return this.userFormatType;
    }

    public final float component3() {
        return this.productPrice;
    }

    public final float component4() {
        return this.packagePrice;
    }

    @NotNull
    public final String component5() {
        return this.blacklistSharingResult;
    }

    @NotNull
    public final String component6() {
        return this.campaignNameCode;
    }

    @NotNull
    public final GetExtraAdvanceDetailRequest copy(@NotNull String userCode, @NotNull String userFormatType, float f, float f2, @NotNull String blacklistSharingResult, @NotNull String campaignNameCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(userFormatType, "userFormatType");
        Intrinsics.checkNotNullParameter(blacklistSharingResult, "blacklistSharingResult");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        return new GetExtraAdvanceDetailRequest(userCode, userFormatType, f, f2, blacklistSharingResult, campaignNameCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetExtraAdvanceDetailRequest) {
            GetExtraAdvanceDetailRequest getExtraAdvanceDetailRequest = (GetExtraAdvanceDetailRequest) obj;
            return Intrinsics.areEqual(this.userCode, getExtraAdvanceDetailRequest.userCode) && Intrinsics.areEqual(this.userFormatType, getExtraAdvanceDetailRequest.userFormatType) && Float.compare(this.productPrice, getExtraAdvanceDetailRequest.productPrice) == 0 && Float.compare(this.packagePrice, getExtraAdvanceDetailRequest.packagePrice) == 0 && Intrinsics.areEqual(this.blacklistSharingResult, getExtraAdvanceDetailRequest.blacklistSharingResult) && Intrinsics.areEqual(this.campaignNameCode, getExtraAdvanceDetailRequest.campaignNameCode);
        }
        return false;
    }

    @NotNull
    public final String getBlacklistSharingResult() {
        return this.blacklistSharingResult;
    }

    @NotNull
    public final String getCampaignNameCode() {
        return this.campaignNameCode;
    }

    public final float getPackagePrice() {
        return this.packagePrice;
    }

    public final float getProductPrice() {
        return this.productPrice;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    @NotNull
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    public int hashCode() {
        return (((((((((this.userCode.hashCode() * 31) + this.userFormatType.hashCode()) * 31) + Float.floatToIntBits(this.productPrice)) * 31) + Float.floatToIntBits(this.packagePrice)) * 31) + this.blacklistSharingResult.hashCode()) * 31) + this.campaignNameCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.userFormatType;
        float f = this.productPrice;
        float f2 = this.packagePrice;
        String str3 = this.blacklistSharingResult;
        String str4 = this.campaignNameCode;
        return "GetExtraAdvanceDetailRequest(userCode=" + str + ", userFormatType=" + str2 + ", productPrice=" + f + ", packagePrice=" + f2 + ", blacklistSharingResult=" + str3 + ", campaignNameCode=" + str4 + ")";
    }
}