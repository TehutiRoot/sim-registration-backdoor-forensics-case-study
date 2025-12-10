package th.p047co.dtac.android.dtacone.model.mrtr_change_sim.esim.transferFOFO.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_change_sim/esim/transferFOFO/request/MrtrChangeSimAutoTransferEDMSRequest;", "", "simCardNumber", "", "userLAN", "userFormatType", "retailerCode", "userCode", "subFeature", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRetailerCode", "()Ljava/lang/String;", "getSimCardNumber", "getSubFeature", "getUserCode", "getUserFormatType", "getUserLAN", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_change_sim.esim.transferFOFO.request.MrtrChangeSimAutoTransferEDMSRequest */
/* loaded from: classes8.dex */
public final class MrtrChangeSimAutoTransferEDMSRequest {
    public static final int $stable = 0;
    @SerializedName("retailerCode")
    @Nullable
    private final String retailerCode;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName("subFeature")
    @Nullable
    private final String subFeature;
    @SerializedName("userCode")
    @Nullable
    private final String userCode;
    @SerializedName("userFormatType")
    @Nullable
    private final String userFormatType;
    @SerializedName("userLan")
    @Nullable
    private final String userLAN;

    public MrtrChangeSimAutoTransferEDMSRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ MrtrChangeSimAutoTransferEDMSRequest copy$default(MrtrChangeSimAutoTransferEDMSRequest mrtrChangeSimAutoTransferEDMSRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrtrChangeSimAutoTransferEDMSRequest.simCardNumber;
        }
        if ((i & 2) != 0) {
            str2 = mrtrChangeSimAutoTransferEDMSRequest.userLAN;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = mrtrChangeSimAutoTransferEDMSRequest.userFormatType;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = mrtrChangeSimAutoTransferEDMSRequest.retailerCode;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = mrtrChangeSimAutoTransferEDMSRequest.userCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = mrtrChangeSimAutoTransferEDMSRequest.subFeature;
        }
        return mrtrChangeSimAutoTransferEDMSRequest.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component2() {
        return this.userLAN;
    }

    @Nullable
    public final String component3() {
        return this.userFormatType;
    }

    @Nullable
    public final String component4() {
        return this.retailerCode;
    }

    @Nullable
    public final String component5() {
        return this.userCode;
    }

    @Nullable
    public final String component6() {
        return this.subFeature;
    }

    @NotNull
    public final MrtrChangeSimAutoTransferEDMSRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new MrtrChangeSimAutoTransferEDMSRequest(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrChangeSimAutoTransferEDMSRequest) {
            MrtrChangeSimAutoTransferEDMSRequest mrtrChangeSimAutoTransferEDMSRequest = (MrtrChangeSimAutoTransferEDMSRequest) obj;
            return Intrinsics.areEqual(this.simCardNumber, mrtrChangeSimAutoTransferEDMSRequest.simCardNumber) && Intrinsics.areEqual(this.userLAN, mrtrChangeSimAutoTransferEDMSRequest.userLAN) && Intrinsics.areEqual(this.userFormatType, mrtrChangeSimAutoTransferEDMSRequest.userFormatType) && Intrinsics.areEqual(this.retailerCode, mrtrChangeSimAutoTransferEDMSRequest.retailerCode) && Intrinsics.areEqual(this.userCode, mrtrChangeSimAutoTransferEDMSRequest.userCode) && Intrinsics.areEqual(this.subFeature, mrtrChangeSimAutoTransferEDMSRequest.subFeature);
        }
        return false;
    }

    @Nullable
    public final String getRetailerCode() {
        return this.retailerCode;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
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
        String str = this.simCardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userLAN;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userFormatType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.retailerCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subFeature;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.simCardNumber;
        String str2 = this.userLAN;
        String str3 = this.userFormatType;
        String str4 = this.retailerCode;
        String str5 = this.userCode;
        String str6 = this.subFeature;
        return "MrtrChangeSimAutoTransferEDMSRequest(simCardNumber=" + str + ", userLAN=" + str2 + ", userFormatType=" + str3 + ", retailerCode=" + str4 + ", userCode=" + str5 + ", subFeature=" + str6 + ")";
    }

    public MrtrChangeSimAutoTransferEDMSRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.simCardNumber = str;
        this.userLAN = str2;
        this.userFormatType = str3;
        this.retailerCode = str4;
        this.userCode = str5;
        this.subFeature = str6;
    }

    public /* synthetic */ MrtrChangeSimAutoTransferEDMSRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}