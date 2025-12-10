package th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011JV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0011¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/Campaign;", "", "", "campaignCode", "campaignName", "", "campaignContractValue", "campaignEntryFeeValue", "campaignSpeedValue", "campaignSpeedUnit", "campaignSpeedMbps", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;I)Lth/co/dtac/android/dtacone/view/appOne/tol/model/campaign/Campaign;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCampaignCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCampaignName", OperatorName.CURVE_TO, "I", "getCampaignContractValue", "d", "getCampaignEntryFeeValue", "e", "getCampaignSpeedValue", OperatorName.FILL_NON_ZERO, "getCampaignSpeedUnit", OperatorName.NON_STROKING_GRAY, "getCampaignSpeedMbps", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.campaign.Campaign */
/* loaded from: classes10.dex */
public final class Campaign {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f97917a;

    /* renamed from: b */
    public final String f97918b;

    /* renamed from: c */
    public final int f97919c;

    /* renamed from: d */
    public final int f97920d;

    /* renamed from: e */
    public final String f97921e;

    /* renamed from: f */
    public final String f97922f;

    /* renamed from: g */
    public final int f97923g;

    public Campaign() {
        this(null, null, 0, 0, null, null, 0, 127, null);
    }

    public static /* synthetic */ Campaign copy$default(Campaign campaign, String str, String str2, int i, int i2, String str3, String str4, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = campaign.f97917a;
        }
        if ((i4 & 2) != 0) {
            str2 = campaign.f97918b;
        }
        String str5 = str2;
        if ((i4 & 4) != 0) {
            i = campaign.f97919c;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = campaign.f97920d;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            str3 = campaign.f97921e;
        }
        String str6 = str3;
        if ((i4 & 32) != 0) {
            str4 = campaign.f97922f;
        }
        String str7 = str4;
        if ((i4 & 64) != 0) {
            i3 = campaign.f97923g;
        }
        return campaign.copy(str, str5, i5, i6, str6, str7, i3);
    }

    @NotNull
    public final String component1() {
        return this.f97917a;
    }

    @NotNull
    public final String component2() {
        return this.f97918b;
    }

    public final int component3() {
        return this.f97919c;
    }

    public final int component4() {
        return this.f97920d;
    }

    @NotNull
    public final String component5() {
        return this.f97921e;
    }

    @NotNull
    public final String component6() {
        return this.f97922f;
    }

    public final int component7() {
        return this.f97923g;
    }

    @NotNull
    public final Campaign copy(@NotNull String campaignCode, @NotNull String campaignName, int i, int i2, @NotNull String campaignSpeedValue, @NotNull String campaignSpeedUnit, int i3) {
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(campaignSpeedValue, "campaignSpeedValue");
        Intrinsics.checkNotNullParameter(campaignSpeedUnit, "campaignSpeedUnit");
        return new Campaign(campaignCode, campaignName, i, i2, campaignSpeedValue, campaignSpeedUnit, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            return Intrinsics.areEqual(this.f97917a, campaign.f97917a) && Intrinsics.areEqual(this.f97918b, campaign.f97918b) && this.f97919c == campaign.f97919c && this.f97920d == campaign.f97920d && Intrinsics.areEqual(this.f97921e, campaign.f97921e) && Intrinsics.areEqual(this.f97922f, campaign.f97922f) && this.f97923g == campaign.f97923g;
        }
        return false;
    }

    @NotNull
    public final String getCampaignCode() {
        return this.f97917a;
    }

    public final int getCampaignContractValue() {
        return this.f97919c;
    }

    public final int getCampaignEntryFeeValue() {
        return this.f97920d;
    }

    @NotNull
    public final String getCampaignName() {
        return this.f97918b;
    }

    public final int getCampaignSpeedMbps() {
        return this.f97923g;
    }

    @NotNull
    public final String getCampaignSpeedUnit() {
        return this.f97922f;
    }

    @NotNull
    public final String getCampaignSpeedValue() {
        return this.f97921e;
    }

    public int hashCode() {
        return (((((((((((this.f97917a.hashCode() * 31) + this.f97918b.hashCode()) * 31) + this.f97919c) * 31) + this.f97920d) * 31) + this.f97921e.hashCode()) * 31) + this.f97922f.hashCode()) * 31) + this.f97923g;
    }

    @NotNull
    public String toString() {
        String str = this.f97917a;
        String str2 = this.f97918b;
        int i = this.f97919c;
        int i2 = this.f97920d;
        String str3 = this.f97921e;
        String str4 = this.f97922f;
        int i3 = this.f97923g;
        return "Campaign(campaignCode=" + str + ", campaignName=" + str2 + ", campaignContractValue=" + i + ", campaignEntryFeeValue=" + i2 + ", campaignSpeedValue=" + str3 + ", campaignSpeedUnit=" + str4 + ", campaignSpeedMbps=" + i3 + ")";
    }

    public Campaign(@NotNull String campaignCode, @NotNull String campaignName, int i, int i2, @NotNull String campaignSpeedValue, @NotNull String campaignSpeedUnit, int i3) {
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(campaignSpeedValue, "campaignSpeedValue");
        Intrinsics.checkNotNullParameter(campaignSpeedUnit, "campaignSpeedUnit");
        this.f97917a = campaignCode;
        this.f97918b = campaignName;
        this.f97919c = i;
        this.f97920d = i2;
        this.f97921e = campaignSpeedValue;
        this.f97922f = campaignSpeedUnit;
        this.f97923g = i3;
    }

    public /* synthetic */ Campaign(String str, String str2, int i, int i2, String str3, String str4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) == 0 ? str4 : "", (i4 & 64) != 0 ? 0 : i3);
    }
}