package th.p047co.dtac.android.dtacone.model.esim;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/ESIMNumberRequest;", "", "featureCode", "", "subFeature", "userLAN", "userFormatType", "airportShop", "", "sku", "userCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAirportShop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFeatureCode", "()Ljava/lang/String;", "getSku", "getSubFeature", "getUserCode", "getUserFormatType", "getUserLAN", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/esim/ESIMNumberRequest;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.ESIMNumberRequest */
/* loaded from: classes8.dex */
public final class ESIMNumberRequest {
    public static final int $stable = 0;
    @SerializedName("airportShop")
    @Nullable
    private final Boolean airportShop;
    @SerializedName("featureCode")
    @Nullable
    private final String featureCode;
    @SerializedName("sku")
    @Nullable
    private final String sku;
    @SerializedName("subFeature")
    @Nullable
    private final String subFeature;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLAN")
    @Nullable
    private final String userLAN;

    public ESIMNumberRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ ESIMNumberRequest copy$default(ESIMNumberRequest eSIMNumberRequest, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eSIMNumberRequest.featureCode;
        }
        if ((i & 2) != 0) {
            str2 = eSIMNumberRequest.subFeature;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = eSIMNumberRequest.userLAN;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = eSIMNumberRequest.userFormatType;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            bool = eSIMNumberRequest.airportShop;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            str5 = eSIMNumberRequest.sku;
        }
        String str10 = str5;
        if ((i & 64) != 0) {
            str6 = eSIMNumberRequest.userCode;
        }
        return eSIMNumberRequest.copy(str, str7, str8, str9, bool2, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.featureCode;
    }

    @Nullable
    public final String component2() {
        return this.subFeature;
    }

    @Nullable
    public final String component3() {
        return this.userLAN;
    }

    @Nullable
    public final String component4() {
        return this.userFormatType;
    }

    @Nullable
    public final Boolean component5() {
        return this.airportShop;
    }

    @Nullable
    public final String component6() {
        return this.sku;
    }

    @Nullable
    public final String component7() {
        return this.userCode;
    }

    @NotNull
    public final ESIMNumberRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6) {
        return new ESIMNumberRequest(str, str2, str3, str4, bool, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ESIMNumberRequest) {
            ESIMNumberRequest eSIMNumberRequest = (ESIMNumberRequest) obj;
            return Intrinsics.areEqual(this.featureCode, eSIMNumberRequest.featureCode) && Intrinsics.areEqual(this.subFeature, eSIMNumberRequest.subFeature) && Intrinsics.areEqual(this.userLAN, eSIMNumberRequest.userLAN) && Intrinsics.areEqual(this.userFormatType, eSIMNumberRequest.userFormatType) && Intrinsics.areEqual(this.airportShop, eSIMNumberRequest.airportShop) && Intrinsics.areEqual(this.sku, eSIMNumberRequest.sku) && Intrinsics.areEqual(this.userCode, eSIMNumberRequest.userCode);
        }
        return false;
    }

    @Nullable
    public final Boolean getAirportShop() {
        return this.airportShop;
    }

    @Nullable
    public final String getFeatureCode() {
        return this.featureCode;
    }

    @Nullable
    public final String getSku() {
        return this.sku;
    }

    @Nullable
    public final String getSubFeature() {
        return this.subFeature;
    }

    @Nullable
    public final String getUserCode() {
        return this.userCode;
    }

    @Nullable
    public final String getUserFormatType() {
        return this.userFormatType;
    }

    @Nullable
    public final String getUserLAN() {
        return this.userLAN;
    }

    public int hashCode() {
        String str = this.featureCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subFeature;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userLAN;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userFormatType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.airportShop;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.sku;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.userCode;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.featureCode;
        String str2 = this.subFeature;
        String str3 = this.userLAN;
        String str4 = this.userFormatType;
        Boolean bool = this.airportShop;
        String str5 = this.sku;
        String str6 = this.userCode;
        return "ESIMNumberRequest(featureCode=" + str + ", subFeature=" + str2 + ", userLAN=" + str3 + ", userFormatType=" + str4 + ", airportShop=" + bool + ", sku=" + str5 + ", userCode=" + str6 + ")";
    }

    public ESIMNumberRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6) {
        this.featureCode = str;
        this.subFeature = str2;
        this.userLAN = str3;
        this.userFormatType = str4;
        this.airportShop = bool;
        this.sku = str5;
        this.userCode = str6;
    }

    public /* synthetic */ ESIMNumberRequest(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}