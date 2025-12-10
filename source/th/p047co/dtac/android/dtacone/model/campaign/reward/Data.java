package th.p047co.dtac.android.dtacone.model.campaign.reward;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/reward/Data;", "", "cpCode", "", "cpRegisterLabel", "cpName", "commissionPeriod", ErrorBundle.DETAIL_ENTRY, "", "Lth/co/dtac/android/dtacone/model/campaign/reward/DetailsItem;", "comItemCode", NotificationCompat.CATEGORY_STATUS, "calculationDateLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCalculationDateLabel", "()Ljava/lang/String;", "getComItemCode", "getCommissionPeriod", "getCpCode", "getCpName", "getCpRegisterLabel", "getDetails", "()Ljava/util/List;", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.reward.Data */
/* loaded from: classes8.dex */
public final class Data {
    public static final int $stable = 8;
    @SerializedName("calculationDateLabel")
    @Nullable
    private final String calculationDateLabel;
    @SerializedName("comItemCode")
    @Nullable
    private final String comItemCode;
    @SerializedName("commissionPeriod")
    @Nullable
    private final String commissionPeriod;
    @SerializedName("cpCode")
    @Nullable
    private final String cpCode;
    @SerializedName("cpName")
    @Nullable
    private final String cpName;
    @SerializedName("cpRegisterLabel")
    @Nullable
    private final String cpRegisterLabel;
    @SerializedName(ErrorBundle.DETAIL_ENTRY)
    @Nullable
    private final List<DetailsItem> details;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public Data() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String component1() {
        return this.cpCode;
    }

    @Nullable
    public final String component2() {
        return this.cpRegisterLabel;
    }

    @Nullable
    public final String component3() {
        return this.cpName;
    }

    @Nullable
    public final String component4() {
        return this.commissionPeriod;
    }

    @Nullable
    public final List<DetailsItem> component5() {
        return this.details;
    }

    @Nullable
    public final String component6() {
        return this.comItemCode;
    }

    @Nullable
    public final String component7() {
        return this.status;
    }

    @Nullable
    public final String component8() {
        return this.calculationDateLabel;
    }

    @NotNull
    public final Data copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<DetailsItem> list, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new Data(str, str2, str3, str4, list, str5, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.cpCode, data.cpCode) && Intrinsics.areEqual(this.cpRegisterLabel, data.cpRegisterLabel) && Intrinsics.areEqual(this.cpName, data.cpName) && Intrinsics.areEqual(this.commissionPeriod, data.commissionPeriod) && Intrinsics.areEqual(this.details, data.details) && Intrinsics.areEqual(this.comItemCode, data.comItemCode) && Intrinsics.areEqual(this.status, data.status) && Intrinsics.areEqual(this.calculationDateLabel, data.calculationDateLabel);
        }
        return false;
    }

    @Nullable
    public final String getCalculationDateLabel() {
        return this.calculationDateLabel;
    }

    @Nullable
    public final String getComItemCode() {
        return this.comItemCode;
    }

    @Nullable
    public final String getCommissionPeriod() {
        return this.commissionPeriod;
    }

    @Nullable
    public final String getCpCode() {
        return this.cpCode;
    }

    @Nullable
    public final String getCpName() {
        return this.cpName;
    }

    @Nullable
    public final String getCpRegisterLabel() {
        return this.cpRegisterLabel;
    }

    @Nullable
    public final List<DetailsItem> getDetails() {
        return this.details;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.cpCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cpRegisterLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cpName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.commissionPeriod;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DetailsItem> list = this.details;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.comItemCode;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.calculationDateLabel;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cpCode;
        String str2 = this.cpRegisterLabel;
        String str3 = this.cpName;
        String str4 = this.commissionPeriod;
        List<DetailsItem> list = this.details;
        String str5 = this.comItemCode;
        String str6 = this.status;
        String str7 = this.calculationDateLabel;
        return "Data(cpCode=" + str + ", cpRegisterLabel=" + str2 + ", cpName=" + str3 + ", commissionPeriod=" + str4 + ", details=" + list + ", comItemCode=" + str5 + ", status=" + str6 + ", calculationDateLabel=" + str7 + ")";
    }

    public Data(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<DetailsItem> list, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.cpCode = str;
        this.cpRegisterLabel = str2;
        this.cpName = str3;
        this.commissionPeriod = str4;
        this.details = list;
        this.comItemCode = str5;
        this.status = str6;
        this.calculationDateLabel = str7;
    }

    public /* synthetic */ Data(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}
