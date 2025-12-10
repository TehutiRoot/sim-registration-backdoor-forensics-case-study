package th.p047co.dtac.android.dtacone.model.campaign.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.campaign.detail.history.MyCampaignDetailHistoryResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0018J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÚ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\r2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0007HÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001a¨\u0006L"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/MyCampaignDetailResponse;", "", "reward", "Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;", "displayActualPoint", "", "campaignId", "", "acheiveSim", "pointHistory", "Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;", TypedValues.AttributesType.S_TARGET, "showActualPoint", "", "displayDoMoreItem", "displayMoreItemLabel", "displayP2PeriodLabel", "displayP2PeriodValue", "displayTargetLabel", "displayTargetValue", "campaignName", "displayAcheiveSim", "displayP2ActualPoint", "campaignImage", "(Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcheiveSim", "()Ljava/lang/String;", "getCampaignId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCampaignImage", "getCampaignName", "getDisplayAcheiveSim", "getDisplayActualPoint", "getDisplayDoMoreItem", "getDisplayMoreItemLabel", "getDisplayP2ActualPoint", "getDisplayP2PeriodLabel", "getDisplayP2PeriodValue", "getDisplayTargetLabel", "getDisplayTargetValue", "getPointHistory", "()Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;", "setPointHistory", "(Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;)V", "getReward", "()Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;", "setReward", "(Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;)V", "getShowActualPoint", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTarget", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/campaign/detail/MyCampaignDetailResponse;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.MyCampaignDetailResponse */
/* loaded from: classes8.dex */
public final class MyCampaignDetailResponse {
    public static final int $stable = 8;
    @SerializedName("acheiveSim")
    @Nullable
    private final String acheiveSim;
    @SerializedName("campaignId")
    @Nullable
    private final Integer campaignId;
    @SerializedName("campaignImage")
    @Nullable
    private final String campaignImage;
    @SerializedName("campaignName")
    @Nullable
    private final String campaignName;
    @SerializedName("displayAcheiveSim")
    @Nullable
    private final String displayAcheiveSim;
    @SerializedName("displayActualPoint")
    @Nullable
    private final String displayActualPoint;
    @SerializedName("displayDoMoreItem")
    @Nullable
    private final String displayDoMoreItem;
    @SerializedName("displayMoreItemLabel")
    @Nullable
    private final String displayMoreItemLabel;
    @SerializedName("displayP2ActualPoint")
    @Nullable
    private final String displayP2ActualPoint;
    @SerializedName("displayP2PeriodLabel")
    @Nullable
    private final String displayP2PeriodLabel;
    @SerializedName("displayP2PeriodValue")
    @Nullable
    private final String displayP2PeriodValue;
    @SerializedName("displayTargetLabel")
    @Nullable
    private final String displayTargetLabel;
    @SerializedName("displayTargetValue")
    @Nullable
    private final String displayTargetValue;
    @Nullable
    private transient MyCampaignDetailHistoryResponse pointHistory;
    @SerializedName("reward")
    @Nullable
    private Reward reward;
    @SerializedName("showActualPoint")
    @Nullable
    private final Boolean showActualPoint;
    @SerializedName(TypedValues.AttributesType.S_TARGET)
    @Nullable
    private final String target;

    public MyCampaignDetailResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Nullable
    public final Reward component1() {
        return this.reward;
    }

    @Nullable
    public final String component10() {
        return this.displayP2PeriodLabel;
    }

    @Nullable
    public final String component11() {
        return this.displayP2PeriodValue;
    }

    @Nullable
    public final String component12() {
        return this.displayTargetLabel;
    }

    @Nullable
    public final String component13() {
        return this.displayTargetValue;
    }

    @Nullable
    public final String component14() {
        return this.campaignName;
    }

    @Nullable
    public final String component15() {
        return this.displayAcheiveSim;
    }

    @Nullable
    public final String component16() {
        return this.displayP2ActualPoint;
    }

    @Nullable
    public final String component17() {
        return this.campaignImage;
    }

    @Nullable
    public final String component2() {
        return this.displayActualPoint;
    }

    @Nullable
    public final Integer component3() {
        return this.campaignId;
    }

    @Nullable
    public final String component4() {
        return this.acheiveSim;
    }

    @Nullable
    public final MyCampaignDetailHistoryResponse component5() {
        return this.pointHistory;
    }

    @Nullable
    public final String component6() {
        return this.target;
    }

    @Nullable
    public final Boolean component7() {
        return this.showActualPoint;
    }

    @Nullable
    public final String component8() {
        return this.displayDoMoreItem;
    }

    @Nullable
    public final String component9() {
        return this.displayMoreItemLabel;
    }

    @NotNull
    public final MyCampaignDetailResponse copy(@Nullable Reward reward, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        return new MyCampaignDetailResponse(reward, str, num, str2, myCampaignDetailHistoryResponse, str3, bool, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MyCampaignDetailResponse) {
            MyCampaignDetailResponse myCampaignDetailResponse = (MyCampaignDetailResponse) obj;
            return Intrinsics.areEqual(this.reward, myCampaignDetailResponse.reward) && Intrinsics.areEqual(this.displayActualPoint, myCampaignDetailResponse.displayActualPoint) && Intrinsics.areEqual(this.campaignId, myCampaignDetailResponse.campaignId) && Intrinsics.areEqual(this.acheiveSim, myCampaignDetailResponse.acheiveSim) && Intrinsics.areEqual(this.pointHistory, myCampaignDetailResponse.pointHistory) && Intrinsics.areEqual(this.target, myCampaignDetailResponse.target) && Intrinsics.areEqual(this.showActualPoint, myCampaignDetailResponse.showActualPoint) && Intrinsics.areEqual(this.displayDoMoreItem, myCampaignDetailResponse.displayDoMoreItem) && Intrinsics.areEqual(this.displayMoreItemLabel, myCampaignDetailResponse.displayMoreItemLabel) && Intrinsics.areEqual(this.displayP2PeriodLabel, myCampaignDetailResponse.displayP2PeriodLabel) && Intrinsics.areEqual(this.displayP2PeriodValue, myCampaignDetailResponse.displayP2PeriodValue) && Intrinsics.areEqual(this.displayTargetLabel, myCampaignDetailResponse.displayTargetLabel) && Intrinsics.areEqual(this.displayTargetValue, myCampaignDetailResponse.displayTargetValue) && Intrinsics.areEqual(this.campaignName, myCampaignDetailResponse.campaignName) && Intrinsics.areEqual(this.displayAcheiveSim, myCampaignDetailResponse.displayAcheiveSim) && Intrinsics.areEqual(this.displayP2ActualPoint, myCampaignDetailResponse.displayP2ActualPoint) && Intrinsics.areEqual(this.campaignImage, myCampaignDetailResponse.campaignImage);
        }
        return false;
    }

    @Nullable
    public final String getAcheiveSim() {
        return this.acheiveSim;
    }

    @Nullable
    public final Integer getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getCampaignImage() {
        return this.campaignImage;
    }

    @Nullable
    public final String getCampaignName() {
        return this.campaignName;
    }

    @Nullable
    public final String getDisplayAcheiveSim() {
        return this.displayAcheiveSim;
    }

    @Nullable
    public final String getDisplayActualPoint() {
        return this.displayActualPoint;
    }

    @Nullable
    public final String getDisplayDoMoreItem() {
        return this.displayDoMoreItem;
    }

    @Nullable
    public final String getDisplayMoreItemLabel() {
        return this.displayMoreItemLabel;
    }

    @Nullable
    public final String getDisplayP2ActualPoint() {
        return this.displayP2ActualPoint;
    }

    @Nullable
    public final String getDisplayP2PeriodLabel() {
        return this.displayP2PeriodLabel;
    }

    @Nullable
    public final String getDisplayP2PeriodValue() {
        return this.displayP2PeriodValue;
    }

    @Nullable
    public final String getDisplayTargetLabel() {
        return this.displayTargetLabel;
    }

    @Nullable
    public final String getDisplayTargetValue() {
        return this.displayTargetValue;
    }

    @Nullable
    public final MyCampaignDetailHistoryResponse getPointHistory() {
        return this.pointHistory;
    }

    @Nullable
    public final Reward getReward() {
        return this.reward;
    }

    @Nullable
    public final Boolean getShowActualPoint() {
        return this.showActualPoint;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        Reward reward = this.reward;
        int hashCode = (reward == null ? 0 : reward.hashCode()) * 31;
        String str = this.displayActualPoint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.campaignId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.acheiveSim;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse = this.pointHistory;
        int hashCode5 = (hashCode4 + (myCampaignDetailHistoryResponse == null ? 0 : myCampaignDetailHistoryResponse.hashCode())) * 31;
        String str3 = this.target;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.showActualPoint;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.displayDoMoreItem;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayMoreItemLabel;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayP2PeriodLabel;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.displayP2PeriodValue;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.displayTargetLabel;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.displayTargetValue;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.campaignName;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.displayAcheiveSim;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.displayP2ActualPoint;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.campaignImage;
        return hashCode16 + (str13 != null ? str13.hashCode() : 0);
    }

    public final void setPointHistory(@Nullable MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse) {
        this.pointHistory = myCampaignDetailHistoryResponse;
    }

    public final void setReward(@Nullable Reward reward) {
        this.reward = reward;
    }

    @NotNull
    public String toString() {
        Reward reward = this.reward;
        String str = this.displayActualPoint;
        Integer num = this.campaignId;
        String str2 = this.acheiveSim;
        MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse = this.pointHistory;
        String str3 = this.target;
        Boolean bool = this.showActualPoint;
        String str4 = this.displayDoMoreItem;
        String str5 = this.displayMoreItemLabel;
        String str6 = this.displayP2PeriodLabel;
        String str7 = this.displayP2PeriodValue;
        String str8 = this.displayTargetLabel;
        String str9 = this.displayTargetValue;
        String str10 = this.campaignName;
        String str11 = this.displayAcheiveSim;
        String str12 = this.displayP2ActualPoint;
        String str13 = this.campaignImage;
        return "MyCampaignDetailResponse(reward=" + reward + ", displayActualPoint=" + str + ", campaignId=" + num + ", acheiveSim=" + str2 + ", pointHistory=" + myCampaignDetailHistoryResponse + ", target=" + str3 + ", showActualPoint=" + bool + ", displayDoMoreItem=" + str4 + ", displayMoreItemLabel=" + str5 + ", displayP2PeriodLabel=" + str6 + ", displayP2PeriodValue=" + str7 + ", displayTargetLabel=" + str8 + ", displayTargetValue=" + str9 + ", campaignName=" + str10 + ", displayAcheiveSim=" + str11 + ", displayP2ActualPoint=" + str12 + ", campaignImage=" + str13 + ")";
    }

    public MyCampaignDetailResponse(@Nullable Reward reward, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13) {
        this.reward = reward;
        this.displayActualPoint = str;
        this.campaignId = num;
        this.acheiveSim = str2;
        this.pointHistory = myCampaignDetailHistoryResponse;
        this.target = str3;
        this.showActualPoint = bool;
        this.displayDoMoreItem = str4;
        this.displayMoreItemLabel = str5;
        this.displayP2PeriodLabel = str6;
        this.displayP2PeriodValue = str7;
        this.displayTargetLabel = str8;
        this.displayTargetValue = str9;
        this.campaignName = str10;
        this.displayAcheiveSim = str11;
        this.displayP2ActualPoint = str12;
        this.campaignImage = str13;
    }

    public /* synthetic */ MyCampaignDetailResponse(Reward reward, String str, Integer num, String str2, MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : reward, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : myCampaignDetailHistoryResponse, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : str13);
    }
}