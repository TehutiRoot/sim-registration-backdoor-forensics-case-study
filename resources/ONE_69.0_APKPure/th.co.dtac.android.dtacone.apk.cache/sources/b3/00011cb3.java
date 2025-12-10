package th.p047co.dtac.android.dtacone.model.blacklist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/GetExtraAdvanceMasterResponse;", "", "listExtraAdvanceMasterInformation", "", "Lth/co/dtac/android/dtacone/model/blacklist/ExtraAdvanceMasterInformation;", "(Ljava/util/List;)V", "getListExtraAdvanceMasterInformation", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterResponse */
/* loaded from: classes8.dex */
public final class GetExtraAdvanceMasterResponse {
    public static final int $stable = 8;
    @SerializedName("listExtraAdvanceMasterInformation")
    @NotNull
    private final List<ExtraAdvanceMasterInformation> listExtraAdvanceMasterInformation;

    public GetExtraAdvanceMasterResponse(@NotNull List<ExtraAdvanceMasterInformation> listExtraAdvanceMasterInformation) {
        Intrinsics.checkNotNullParameter(listExtraAdvanceMasterInformation, "listExtraAdvanceMasterInformation");
        this.listExtraAdvanceMasterInformation = listExtraAdvanceMasterInformation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetExtraAdvanceMasterResponse copy$default(GetExtraAdvanceMasterResponse getExtraAdvanceMasterResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getExtraAdvanceMasterResponse.listExtraAdvanceMasterInformation;
        }
        return getExtraAdvanceMasterResponse.copy(list);
    }

    @NotNull
    public final List<ExtraAdvanceMasterInformation> component1() {
        return this.listExtraAdvanceMasterInformation;
    }

    @NotNull
    public final GetExtraAdvanceMasterResponse copy(@NotNull List<ExtraAdvanceMasterInformation> listExtraAdvanceMasterInformation) {
        Intrinsics.checkNotNullParameter(listExtraAdvanceMasterInformation, "listExtraAdvanceMasterInformation");
        return new GetExtraAdvanceMasterResponse(listExtraAdvanceMasterInformation);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetExtraAdvanceMasterResponse) && Intrinsics.areEqual(this.listExtraAdvanceMasterInformation, ((GetExtraAdvanceMasterResponse) obj).listExtraAdvanceMasterInformation);
    }

    @NotNull
    public final List<ExtraAdvanceMasterInformation> getListExtraAdvanceMasterInformation() {
        return this.listExtraAdvanceMasterInformation;
    }

    public int hashCode() {
        return this.listExtraAdvanceMasterInformation.hashCode();
    }

    @NotNull
    public String toString() {
        List<ExtraAdvanceMasterInformation> list = this.listExtraAdvanceMasterInformation;
        return "GetExtraAdvanceMasterResponse(listExtraAdvanceMasterInformation=" + list + ")";
    }
}