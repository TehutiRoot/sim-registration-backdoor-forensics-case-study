package th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/HistoryResponse;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "historyList", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem;", "(Ljava/lang/Boolean;Ljava/util/List;)V", "getError", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHistoryList", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/HistoryResponse;", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.HistoryResponse */
/* loaded from: classes8.dex */
public final class HistoryResponse {
    public static final int $stable = 8;
    @Nullable
    private final Boolean error;
    @Nullable
    private final List<CampaignDetailHistoryItem> historyList;

    public HistoryResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryResponse copy$default(HistoryResponse historyResponse, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = historyResponse.error;
        }
        if ((i & 2) != 0) {
            list = historyResponse.historyList;
        }
        return historyResponse.copy(bool, list);
    }

    @Nullable
    public final Boolean component1() {
        return this.error;
    }

    @Nullable
    public final List<CampaignDetailHistoryItem> component2() {
        return this.historyList;
    }

    @NotNull
    public final HistoryResponse copy(@Nullable Boolean bool, @Nullable List<CampaignDetailHistoryItem> list) {
        return new HistoryResponse(bool, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HistoryResponse) {
            HistoryResponse historyResponse = (HistoryResponse) obj;
            return Intrinsics.areEqual(this.error, historyResponse.error) && Intrinsics.areEqual(this.historyList, historyResponse.historyList);
        }
        return false;
    }

    @Nullable
    public final Boolean getError() {
        return this.error;
    }

    @Nullable
    public final List<CampaignDetailHistoryItem> getHistoryList() {
        return this.historyList;
    }

    public int hashCode() {
        Boolean bool = this.error;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<CampaignDetailHistoryItem> list = this.historyList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.error;
        List<CampaignDetailHistoryItem> list = this.historyList;
        return "HistoryResponse(error=" + bool + ", historyList=" + list + ")";
    }

    public HistoryResponse(@Nullable Boolean bool, @Nullable List<CampaignDetailHistoryItem> list) {
        this.error = bool;
        this.historyList = list;
    }

    public /* synthetic */ HistoryResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? new ArrayList() : list);
    }
}