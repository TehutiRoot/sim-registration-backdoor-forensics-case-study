package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/GetInputFieldRequest;", "", "userLan", "", "locationCode", "orderID", "", "campaignType", "campaignNameCode", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCampaignNameCode", "()Ljava/lang/String;", "getCampaignType", "getLocationCode", "getOrderID", "()I", "getUserLan", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.GetInputFieldRequest */
/* loaded from: classes8.dex */
public final class GetInputFieldRequest {
    public static final int $stable = 0;
    @SerializedName("campaignNameCode")
    @NotNull
    private final String campaignNameCode;
    @SerializedName("campaignType")
    @NotNull
    private final String campaignType;
    @SerializedName("locationCode")
    @NotNull
    private final String locationCode;
    @SerializedName("orderID")
    private final int orderID;
    @SerializedName("userLan")
    @NotNull
    private final String userLan;

    public GetInputFieldRequest(@NotNull String userLan, @NotNull String locationCode, int i, @NotNull String campaignType, @NotNull String campaignNameCode) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        this.userLan = userLan;
        this.locationCode = locationCode;
        this.orderID = i;
        this.campaignType = campaignType;
        this.campaignNameCode = campaignNameCode;
    }

    public static /* synthetic */ GetInputFieldRequest copy$default(GetInputFieldRequest getInputFieldRequest, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getInputFieldRequest.userLan;
        }
        if ((i2 & 2) != 0) {
            str2 = getInputFieldRequest.locationCode;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = getInputFieldRequest.orderID;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = getInputFieldRequest.campaignType;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = getInputFieldRequest.campaignNameCode;
        }
        return getInputFieldRequest.copy(str, str5, i3, str6, str4);
    }

    @NotNull
    public final String component1() {
        return this.userLan;
    }

    @NotNull
    public final String component2() {
        return this.locationCode;
    }

    public final int component3() {
        return this.orderID;
    }

    @NotNull
    public final String component4() {
        return this.campaignType;
    }

    @NotNull
    public final String component5() {
        return this.campaignNameCode;
    }

    @NotNull
    public final GetInputFieldRequest copy(@NotNull String userLan, @NotNull String locationCode, int i, @NotNull String campaignType, @NotNull String campaignNameCode) {
        Intrinsics.checkNotNullParameter(userLan, "userLan");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        Intrinsics.checkNotNullParameter(campaignNameCode, "campaignNameCode");
        return new GetInputFieldRequest(userLan, locationCode, i, campaignType, campaignNameCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetInputFieldRequest) {
            GetInputFieldRequest getInputFieldRequest = (GetInputFieldRequest) obj;
            return Intrinsics.areEqual(this.userLan, getInputFieldRequest.userLan) && Intrinsics.areEqual(this.locationCode, getInputFieldRequest.locationCode) && this.orderID == getInputFieldRequest.orderID && Intrinsics.areEqual(this.campaignType, getInputFieldRequest.campaignType) && Intrinsics.areEqual(this.campaignNameCode, getInputFieldRequest.campaignNameCode);
        }
        return false;
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
    public final String getLocationCode() {
        return this.locationCode;
    }

    public final int getOrderID() {
        return this.orderID;
    }

    @NotNull
    public final String getUserLan() {
        return this.userLan;
    }

    public int hashCode() {
        return (((((((this.userLan.hashCode() * 31) + this.locationCode.hashCode()) * 31) + this.orderID) * 31) + this.campaignType.hashCode()) * 31) + this.campaignNameCode.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userLan;
        String str2 = this.locationCode;
        int i = this.orderID;
        String str3 = this.campaignType;
        String str4 = this.campaignNameCode;
        return "GetInputFieldRequest(userLan=" + str + ", locationCode=" + str2 + ", orderID=" + i + ", campaignType=" + str3 + ", campaignNameCode=" + str4 + ")";
    }
}