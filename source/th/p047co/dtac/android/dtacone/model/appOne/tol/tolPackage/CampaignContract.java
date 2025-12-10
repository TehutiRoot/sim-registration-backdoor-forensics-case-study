package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignContract;", "", "campaignContractCode", "", "campaignContractName", "campaignContractValue", "", "campaignContractCategoryCode", "campaignContractType", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCampaignContractCategoryCode", "()Ljava/lang/String;", "getCampaignContractCode", "getCampaignContractName", "getCampaignContractType", "getCampaignContractValue", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignContract */
/* loaded from: classes8.dex */
public final class CampaignContract {
    public static final int $stable = 0;
    @SerializedName("campaignContractCategoryCode")
    @NotNull
    private final String campaignContractCategoryCode;
    @SerializedName("campaignContractCode")
    @NotNull
    private final String campaignContractCode;
    @SerializedName("campaignContractName")
    @NotNull
    private final String campaignContractName;
    @SerializedName("campaignContractType")
    @NotNull
    private final String campaignContractType;
    @SerializedName("campaignContractValue")
    private final int campaignContractValue;

    public CampaignContract() {
        this(null, null, 0, null, null, 31, null);
    }

    public static /* synthetic */ CampaignContract copy$default(CampaignContract campaignContract, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = campaignContract.campaignContractCode;
        }
        if ((i2 & 2) != 0) {
            str2 = campaignContract.campaignContractName;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = campaignContract.campaignContractValue;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = campaignContract.campaignContractCategoryCode;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = campaignContract.campaignContractType;
        }
        return campaignContract.copy(str, str5, i3, str6, str4);
    }

    @NotNull
    public final String component1() {
        return this.campaignContractCode;
    }

    @NotNull
    public final String component2() {
        return this.campaignContractName;
    }

    public final int component3() {
        return this.campaignContractValue;
    }

    @NotNull
    public final String component4() {
        return this.campaignContractCategoryCode;
    }

    @NotNull
    public final String component5() {
        return this.campaignContractType;
    }

    @NotNull
    public final CampaignContract copy(@NotNull String campaignContractCode, @NotNull String campaignContractName, int i, @NotNull String campaignContractCategoryCode, @NotNull String campaignContractType) {
        Intrinsics.checkNotNullParameter(campaignContractCode, "campaignContractCode");
        Intrinsics.checkNotNullParameter(campaignContractName, "campaignContractName");
        Intrinsics.checkNotNullParameter(campaignContractCategoryCode, "campaignContractCategoryCode");
        Intrinsics.checkNotNullParameter(campaignContractType, "campaignContractType");
        return new CampaignContract(campaignContractCode, campaignContractName, i, campaignContractCategoryCode, campaignContractType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignContract) {
            CampaignContract campaignContract = (CampaignContract) obj;
            return Intrinsics.areEqual(this.campaignContractCode, campaignContract.campaignContractCode) && Intrinsics.areEqual(this.campaignContractName, campaignContract.campaignContractName) && this.campaignContractValue == campaignContract.campaignContractValue && Intrinsics.areEqual(this.campaignContractCategoryCode, campaignContract.campaignContractCategoryCode) && Intrinsics.areEqual(this.campaignContractType, campaignContract.campaignContractType);
        }
        return false;
    }

    @NotNull
    public final String getCampaignContractCategoryCode() {
        return this.campaignContractCategoryCode;
    }

    @NotNull
    public final String getCampaignContractCode() {
        return this.campaignContractCode;
    }

    @NotNull
    public final String getCampaignContractName() {
        return this.campaignContractName;
    }

    @NotNull
    public final String getCampaignContractType() {
        return this.campaignContractType;
    }

    public final int getCampaignContractValue() {
        return this.campaignContractValue;
    }

    public int hashCode() {
        return (((((((this.campaignContractCode.hashCode() * 31) + this.campaignContractName.hashCode()) * 31) + this.campaignContractValue) * 31) + this.campaignContractCategoryCode.hashCode()) * 31) + this.campaignContractType.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.campaignContractCode;
        String str2 = this.campaignContractName;
        int i = this.campaignContractValue;
        String str3 = this.campaignContractCategoryCode;
        String str4 = this.campaignContractType;
        return "CampaignContract(campaignContractCode=" + str + ", campaignContractName=" + str2 + ", campaignContractValue=" + i + ", campaignContractCategoryCode=" + str3 + ", campaignContractType=" + str4 + ")";
    }

    public CampaignContract(@NotNull String campaignContractCode, @NotNull String campaignContractName, int i, @NotNull String campaignContractCategoryCode, @NotNull String campaignContractType) {
        Intrinsics.checkNotNullParameter(campaignContractCode, "campaignContractCode");
        Intrinsics.checkNotNullParameter(campaignContractName, "campaignContractName");
        Intrinsics.checkNotNullParameter(campaignContractCategoryCode, "campaignContractCategoryCode");
        Intrinsics.checkNotNullParameter(campaignContractType, "campaignContractType");
        this.campaignContractCode = campaignContractCode;
        this.campaignContractName = campaignContractName;
        this.campaignContractValue = i;
        this.campaignContractCategoryCode = campaignContractCategoryCode;
        this.campaignContractType = campaignContractType;
    }

    public /* synthetic */ CampaignContract(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4);
    }
}
