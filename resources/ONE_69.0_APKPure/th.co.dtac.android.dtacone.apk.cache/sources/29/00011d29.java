package th.p047co.dtac.android.dtacone.model.campaign.reward;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0019\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011HÆ\u0003J\u0089\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014¨\u00065"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/reward/OneTrueCampaignRewardResponse;", "", "systemMessage", "", "code", "codeType", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/campaign/reward/Data;", "replaceMessage", "", "desc", "dataReward", "Lth/co/dtac/android/dtacone/model/campaign/reward/DataReward;", "rewardRoadmapList", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/campaign/reward/RewardRoadmapItem;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/campaign/reward/Data;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/campaign/reward/DataReward;Ljava/util/ArrayList;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/campaign/reward/Data;", "getDataReward", "()Lth/co/dtac/android/dtacone/model/campaign/reward/DataReward;", "setDataReward", "(Lth/co/dtac/android/dtacone/model/campaign/reward/DataReward;)V", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getRewardRoadmapList", "()Ljava/util/ArrayList;", "setRewardRoadmapList", "(Ljava/util/ArrayList;)V", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.reward.OneTrueCampaignRewardResponse */
/* loaded from: classes8.dex */
public final class OneTrueCampaignRewardResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final Data data;
    @Nullable
    private transient DataReward dataReward;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @NotNull
    private transient ArrayList<RewardRoadmapItem> rewardRoadmapList;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;

    public OneTrueCampaignRewardResponse() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final String component1() {
        return this.systemMessage;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.codeType;
    }

    @Nullable
    public final String component4() {
        return this.responseDateTime;
    }

    @Nullable
    public final Data component5() {
        return this.data;
    }

    @Nullable
    public final List<String> component6() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component7() {
        return this.desc;
    }

    @Nullable
    public final DataReward component8() {
        return this.dataReward;
    }

    @NotNull
    public final ArrayList<RewardRoadmapItem> component9() {
        return this.rewardRoadmapList;
    }

    @NotNull
    public final OneTrueCampaignRewardResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5, @Nullable DataReward dataReward, @NotNull ArrayList<RewardRoadmapItem> rewardRoadmapList) {
        Intrinsics.checkNotNullParameter(rewardRoadmapList, "rewardRoadmapList");
        return new OneTrueCampaignRewardResponse(str, str2, str3, str4, data, list, str5, dataReward, rewardRoadmapList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneTrueCampaignRewardResponse) {
            OneTrueCampaignRewardResponse oneTrueCampaignRewardResponse = (OneTrueCampaignRewardResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, oneTrueCampaignRewardResponse.systemMessage) && Intrinsics.areEqual(this.code, oneTrueCampaignRewardResponse.code) && Intrinsics.areEqual(this.codeType, oneTrueCampaignRewardResponse.codeType) && Intrinsics.areEqual(this.responseDateTime, oneTrueCampaignRewardResponse.responseDateTime) && Intrinsics.areEqual(this.data, oneTrueCampaignRewardResponse.data) && Intrinsics.areEqual(this.replaceMessage, oneTrueCampaignRewardResponse.replaceMessage) && Intrinsics.areEqual(this.desc, oneTrueCampaignRewardResponse.desc) && Intrinsics.areEqual(this.dataReward, oneTrueCampaignRewardResponse.dataReward) && Intrinsics.areEqual(this.rewardRoadmapList, oneTrueCampaignRewardResponse.rewardRoadmapList);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final DataReward getDataReward() {
        return this.dataReward;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @NotNull
    public final ArrayList<RewardRoadmapItem> getRewardRoadmapList() {
        return this.rewardRoadmapList;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.systemMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.codeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.responseDateTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.data;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DataReward dataReward = this.dataReward;
        return ((hashCode7 + (dataReward != null ? dataReward.hashCode() : 0)) * 31) + this.rewardRoadmapList.hashCode();
    }

    public final void setDataReward(@Nullable DataReward dataReward) {
        this.dataReward = dataReward;
    }

    public final void setRewardRoadmapList(@NotNull ArrayList<RewardRoadmapItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.rewardRoadmapList = arrayList;
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.codeType;
        String str4 = this.responseDateTime;
        Data data = this.data;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        DataReward dataReward = this.dataReward;
        ArrayList<RewardRoadmapItem> arrayList = this.rewardRoadmapList;
        return "OneTrueCampaignRewardResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ", dataReward=" + dataReward + ", rewardRoadmapList=" + arrayList + ")";
    }

    public OneTrueCampaignRewardResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5, @Nullable DataReward dataReward, @NotNull ArrayList<RewardRoadmapItem> rewardRoadmapList) {
        Intrinsics.checkNotNullParameter(rewardRoadmapList, "rewardRoadmapList");
        this.systemMessage = str;
        this.code = str2;
        this.codeType = str3;
        this.responseDateTime = str4;
        this.data = data;
        this.replaceMessage = list;
        this.desc = str5;
        this.dataReward = dataReward;
        this.rewardRoadmapList = rewardRoadmapList;
    }

    public /* synthetic */ OneTrueCampaignRewardResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, DataReward dataReward, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? dataReward : null, (i & 256) != 0 ? new ArrayList() : arrayList);
    }
}