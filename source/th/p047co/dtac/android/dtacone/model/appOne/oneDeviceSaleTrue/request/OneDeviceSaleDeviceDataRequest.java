package th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleDeviceDataRequest;", "", "advanceAmount", "", "blSharingResult", "brand", "campaignType", "deviceType", "discountAmount", "imei", "model", "rrp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvanceAmount", "()Ljava/lang/String;", "getBlSharingResult", "getBrand", "getCampaignType", "getDeviceType", "getDiscountAmount", "getImei", "getModel", "getRrp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleDeviceDataRequest */
/* loaded from: classes8.dex */
public final class OneDeviceSaleDeviceDataRequest {
    public static final int $stable = 0;
    @SerializedName("advanceAmount")
    @Nullable
    private final String advanceAmount;
    @SerializedName("blSharingResult")
    @Nullable
    private final String blSharingResult;
    @SerializedName("brand")
    @Nullable
    private final String brand;
    @SerializedName("campaignType")
    @Nullable
    private final String campaignType;
    @SerializedName("deviceType")
    @Nullable
    private final String deviceType;
    @SerializedName("discountAmount")
    @Nullable
    private final String discountAmount;
    @SerializedName("imei")
    @Nullable
    private final String imei;
    @SerializedName("model")
    @Nullable
    private final String model;
    @SerializedName("rrp")
    @Nullable
    private final String rrp;

    public OneDeviceSaleDeviceDataRequest() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final String component1() {
        return this.advanceAmount;
    }

    @Nullable
    public final String component2() {
        return this.blSharingResult;
    }

    @Nullable
    public final String component3() {
        return this.brand;
    }

    @Nullable
    public final String component4() {
        return this.campaignType;
    }

    @Nullable
    public final String component5() {
        return this.deviceType;
    }

    @Nullable
    public final String component6() {
        return this.discountAmount;
    }

    @Nullable
    public final String component7() {
        return this.imei;
    }

    @Nullable
    public final String component8() {
        return this.model;
    }

    @Nullable
    public final String component9() {
        return this.rrp;
    }

    @NotNull
    public final OneDeviceSaleDeviceDataRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new OneDeviceSaleDeviceDataRequest(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDeviceSaleDeviceDataRequest) {
            OneDeviceSaleDeviceDataRequest oneDeviceSaleDeviceDataRequest = (OneDeviceSaleDeviceDataRequest) obj;
            return Intrinsics.areEqual(this.advanceAmount, oneDeviceSaleDeviceDataRequest.advanceAmount) && Intrinsics.areEqual(this.blSharingResult, oneDeviceSaleDeviceDataRequest.blSharingResult) && Intrinsics.areEqual(this.brand, oneDeviceSaleDeviceDataRequest.brand) && Intrinsics.areEqual(this.campaignType, oneDeviceSaleDeviceDataRequest.campaignType) && Intrinsics.areEqual(this.deviceType, oneDeviceSaleDeviceDataRequest.deviceType) && Intrinsics.areEqual(this.discountAmount, oneDeviceSaleDeviceDataRequest.discountAmount) && Intrinsics.areEqual(this.imei, oneDeviceSaleDeviceDataRequest.imei) && Intrinsics.areEqual(this.model, oneDeviceSaleDeviceDataRequest.model) && Intrinsics.areEqual(this.rrp, oneDeviceSaleDeviceDataRequest.rrp);
        }
        return false;
    }

    @Nullable
    public final String getAdvanceAmount() {
        return this.advanceAmount;
    }

    @Nullable
    public final String getBlSharingResult() {
        return this.blSharingResult;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getCampaignType() {
        return this.campaignType;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final String getImei() {
        return this.imei;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getRrp() {
        return this.rrp;
    }

    public int hashCode() {
        String str = this.advanceAmount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blSharingResult;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brand;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.campaignType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.discountAmount;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.imei;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.model;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rrp;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.advanceAmount;
        String str2 = this.blSharingResult;
        String str3 = this.brand;
        String str4 = this.campaignType;
        String str5 = this.deviceType;
        String str6 = this.discountAmount;
        String str7 = this.imei;
        String str8 = this.model;
        String str9 = this.rrp;
        return "OneDeviceSaleDeviceDataRequest(advanceAmount=" + str + ", blSharingResult=" + str2 + ", brand=" + str3 + ", campaignType=" + str4 + ", deviceType=" + str5 + ", discountAmount=" + str6 + ", imei=" + str7 + ", model=" + str8 + ", rrp=" + str9 + ")";
    }

    public OneDeviceSaleDeviceDataRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.advanceAmount = str;
        this.blSharingResult = str2;
        this.brand = str3;
        this.campaignType = str4;
        this.deviceType = str5;
        this.discountAmount = str6;
        this.imei = str7;
        this.model = str8;
        this.rrp = str9;
    }

    public /* synthetic */ OneDeviceSaleDeviceDataRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}
