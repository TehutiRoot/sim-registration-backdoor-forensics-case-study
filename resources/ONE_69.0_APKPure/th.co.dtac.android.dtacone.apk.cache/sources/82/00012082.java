package th.p047co.dtac.android.dtacone.model.sellerID.promoterInfo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.sellerID.shopList.RetailerItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/sellerID/promoterInfo/PromoterInfoResponse;", "", "current", "Lth/co/dtac/android/dtacone/model/sellerID/promoterInfo/Current;", "history", "", "Lth/co/dtac/android/dtacone/model/sellerID/shopList/RetailerItem;", "(Lth/co/dtac/android/dtacone/model/sellerID/promoterInfo/Current;Ljava/util/List;)V", "getCurrent", "()Lth/co/dtac/android/dtacone/model/sellerID/promoterInfo/Current;", "getHistory", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.sellerID.promoterInfo.PromoterInfoResponse */
/* loaded from: classes8.dex */
public final class PromoterInfoResponse {
    public static final int $stable = 8;
    @SerializedName("current")
    @Nullable
    private final Current current;
    @SerializedName("history")
    @NotNull
    private final List<RetailerItem> history;

    public PromoterInfoResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoterInfoResponse copy$default(PromoterInfoResponse promoterInfoResponse, Current current, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            current = promoterInfoResponse.current;
        }
        if ((i & 2) != 0) {
            list = promoterInfoResponse.history;
        }
        return promoterInfoResponse.copy(current, list);
    }

    @Nullable
    public final Current component1() {
        return this.current;
    }

    @NotNull
    public final List<RetailerItem> component2() {
        return this.history;
    }

    @NotNull
    public final PromoterInfoResponse copy(@Nullable Current current, @NotNull List<RetailerItem> history) {
        Intrinsics.checkNotNullParameter(history, "history");
        return new PromoterInfoResponse(current, history);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromoterInfoResponse) {
            PromoterInfoResponse promoterInfoResponse = (PromoterInfoResponse) obj;
            return Intrinsics.areEqual(this.current, promoterInfoResponse.current) && Intrinsics.areEqual(this.history, promoterInfoResponse.history);
        }
        return false;
    }

    @Nullable
    public final Current getCurrent() {
        return this.current;
    }

    @NotNull
    public final List<RetailerItem> getHistory() {
        return this.history;
    }

    public int hashCode() {
        Current current = this.current;
        return ((current == null ? 0 : current.hashCode()) * 31) + this.history.hashCode();
    }

    @NotNull
    public String toString() {
        Current current = this.current;
        List<RetailerItem> list = this.history;
        return "PromoterInfoResponse(current=" + current + ", history=" + list + ")";
    }

    public PromoterInfoResponse(@Nullable Current current, @NotNull List<RetailerItem> history) {
        Intrinsics.checkNotNullParameter(history, "history");
        this.current = current;
        this.history = history;
    }

    public /* synthetic */ PromoterInfoResponse(Current current, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : current, (i & 2) != 0 ? new ArrayList() : list);
    }
}