package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentRequest;", "", "campaignCode", "", "dtrCode", "matCode", "statusColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignCode", "()Ljava/lang/String;", "getDtrCode", "getMatCode", "getStatusColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExtraAdvancePaymentRequest */
/* loaded from: classes8.dex */
public final class OneValidateExtraAdvancePaymentRequest {
    public static final int $stable = 0;
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName("dtrCode")
    @Nullable
    private final String dtrCode;
    @SerializedName("matCode")
    @Nullable
    private final String matCode;
    @SerializedName("statusColor")
    @Nullable
    private final String statusColor;

    public OneValidateExtraAdvancePaymentRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OneValidateExtraAdvancePaymentRequest copy$default(OneValidateExtraAdvancePaymentRequest oneValidateExtraAdvancePaymentRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneValidateExtraAdvancePaymentRequest.campaignCode;
        }
        if ((i & 2) != 0) {
            str2 = oneValidateExtraAdvancePaymentRequest.dtrCode;
        }
        if ((i & 4) != 0) {
            str3 = oneValidateExtraAdvancePaymentRequest.matCode;
        }
        if ((i & 8) != 0) {
            str4 = oneValidateExtraAdvancePaymentRequest.statusColor;
        }
        return oneValidateExtraAdvancePaymentRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.campaignCode;
    }

    @Nullable
    public final String component2() {
        return this.dtrCode;
    }

    @Nullable
    public final String component3() {
        return this.matCode;
    }

    @Nullable
    public final String component4() {
        return this.statusColor;
    }

    @NotNull
    public final OneValidateExtraAdvancePaymentRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new OneValidateExtraAdvancePaymentRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneValidateExtraAdvancePaymentRequest) {
            OneValidateExtraAdvancePaymentRequest oneValidateExtraAdvancePaymentRequest = (OneValidateExtraAdvancePaymentRequest) obj;
            return Intrinsics.areEqual(this.campaignCode, oneValidateExtraAdvancePaymentRequest.campaignCode) && Intrinsics.areEqual(this.dtrCode, oneValidateExtraAdvancePaymentRequest.dtrCode) && Intrinsics.areEqual(this.matCode, oneValidateExtraAdvancePaymentRequest.matCode) && Intrinsics.areEqual(this.statusColor, oneValidateExtraAdvancePaymentRequest.statusColor);
        }
        return false;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getDtrCode() {
        return this.dtrCode;
    }

    @Nullable
    public final String getMatCode() {
        return this.matCode;
    }

    @Nullable
    public final String getStatusColor() {
        return this.statusColor;
    }

    public int hashCode() {
        String str = this.campaignCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dtrCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.statusColor;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.campaignCode;
        String str2 = this.dtrCode;
        String str3 = this.matCode;
        String str4 = this.statusColor;
        return "OneValidateExtraAdvancePaymentRequest(campaignCode=" + str + ", dtrCode=" + str2 + ", matCode=" + str3 + ", statusColor=" + str4 + ")";
    }

    public OneValidateExtraAdvancePaymentRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.campaignCode = str;
        this.dtrCode = str2;
        this.matCode = str3;
        this.statusColor = str4;
    }

    public /* synthetic */ OneValidateExtraAdvancePaymentRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
