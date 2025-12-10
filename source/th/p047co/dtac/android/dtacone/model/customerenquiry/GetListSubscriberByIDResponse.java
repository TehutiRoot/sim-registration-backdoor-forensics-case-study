package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/GetListSubscriberByIDResponse;", "", "listSubscriberByID", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberByID;", "total", "", "(Ljava/util/List;I)V", "getListSubscriberByID", "()Ljava/util/List;", "setListSubscriberByID", "(Ljava/util/List;)V", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.GetListSubscriberByIDResponse */
/* loaded from: classes8.dex */
public final class GetListSubscriberByIDResponse {
    public static final int $stable = 8;
    @SerializedName("listSubscriberByID")
    @NotNull
    private List<SubscriberByID> listSubscriberByID;
    @SerializedName("total")
    private final int total;

    public GetListSubscriberByIDResponse(@NotNull List<SubscriberByID> listSubscriberByID, int i) {
        Intrinsics.checkNotNullParameter(listSubscriberByID, "listSubscriberByID");
        this.listSubscriberByID = listSubscriberByID;
        this.total = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetListSubscriberByIDResponse copy$default(GetListSubscriberByIDResponse getListSubscriberByIDResponse, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = getListSubscriberByIDResponse.listSubscriberByID;
        }
        if ((i2 & 2) != 0) {
            i = getListSubscriberByIDResponse.total;
        }
        return getListSubscriberByIDResponse.copy(list, i);
    }

    @NotNull
    public final List<SubscriberByID> component1() {
        return this.listSubscriberByID;
    }

    public final int component2() {
        return this.total;
    }

    @NotNull
    public final GetListSubscriberByIDResponse copy(@NotNull List<SubscriberByID> listSubscriberByID, int i) {
        Intrinsics.checkNotNullParameter(listSubscriberByID, "listSubscriberByID");
        return new GetListSubscriberByIDResponse(listSubscriberByID, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetListSubscriberByIDResponse) {
            GetListSubscriberByIDResponse getListSubscriberByIDResponse = (GetListSubscriberByIDResponse) obj;
            return Intrinsics.areEqual(this.listSubscriberByID, getListSubscriberByIDResponse.listSubscriberByID) && this.total == getListSubscriberByIDResponse.total;
        }
        return false;
    }

    @NotNull
    public final List<SubscriberByID> getListSubscriberByID() {
        return this.listSubscriberByID;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (this.listSubscriberByID.hashCode() * 31) + this.total;
    }

    public final void setListSubscriberByID(@NotNull List<SubscriberByID> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listSubscriberByID = list;
    }

    @NotNull
    public String toString() {
        List<SubscriberByID> list = this.listSubscriberByID;
        int i = this.total;
        return "GetListSubscriberByIDResponse(listSubscriberByID=" + list + ", total=" + i + ")";
    }
}
