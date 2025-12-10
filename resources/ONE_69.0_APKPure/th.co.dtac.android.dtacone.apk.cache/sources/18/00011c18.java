package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/CampaignDetail;", "", "privilegeCode", "", "campaignName", "matCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignName", "()Ljava/lang/String;", "getMatCode", "getPrivilegeCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.CampaignDetail */
/* loaded from: classes8.dex */
public final class CampaignDetail {
    public static final int $stable = 0;
    @SerializedName("campaignName")
    @Nullable
    private final String campaignName;
    @SerializedName("matCode")
    @Nullable
    private final String matCode;
    @SerializedName("privilegeCode")
    @Nullable
    private final String privilegeCode;

    public CampaignDetail() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CampaignDetail copy$default(CampaignDetail campaignDetail, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignDetail.privilegeCode;
        }
        if ((i & 2) != 0) {
            str2 = campaignDetail.campaignName;
        }
        if ((i & 4) != 0) {
            str3 = campaignDetail.matCode;
        }
        return campaignDetail.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.privilegeCode;
    }

    @Nullable
    public final String component2() {
        return this.campaignName;
    }

    @Nullable
    public final String component3() {
        return this.matCode;
    }

    @NotNull
    public final CampaignDetail copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new CampaignDetail(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignDetail) {
            CampaignDetail campaignDetail = (CampaignDetail) obj;
            return Intrinsics.areEqual(this.privilegeCode, campaignDetail.privilegeCode) && Intrinsics.areEqual(this.campaignName, campaignDetail.campaignName) && Intrinsics.areEqual(this.matCode, campaignDetail.matCode);
        }
        return false;
    }

    @Nullable
    public final String getCampaignName() {
        return this.campaignName;
    }

    @Nullable
    public final String getMatCode() {
        return this.matCode;
    }

    @Nullable
    public final String getPrivilegeCode() {
        return this.privilegeCode;
    }

    public int hashCode() {
        String str = this.privilegeCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matCode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.privilegeCode;
        String str2 = this.campaignName;
        String str3 = this.matCode;
        return "CampaignDetail(privilegeCode=" + str + ", campaignName=" + str2 + ", matCode=" + str3 + ")";
    }

    public CampaignDetail(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.privilegeCode = str;
        this.campaignName = str2;
        this.matCode = str3;
    }

    public /* synthetic */ CampaignDetail(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}