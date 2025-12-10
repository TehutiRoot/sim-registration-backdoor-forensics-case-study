package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/ReserveServiceNumbRequest;", "", "media", "", "flpNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getFlpNumber", "()Ljava/lang/String;", "getMedia", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.ReserveServiceNumbRequest */
/* loaded from: classes8.dex */
public final class ReserveServiceNumbRequest {
    public static final int $stable = 0;
    @SerializedName("flpNumber")
    @Nullable
    private final String flpNumber;
    @SerializedName("media")
    @NotNull
    private final String media;

    public ReserveServiceNumbRequest(@NotNull String media, @Nullable String str) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.media = media;
        this.flpNumber = str;
    }

    public static /* synthetic */ ReserveServiceNumbRequest copy$default(ReserveServiceNumbRequest reserveServiceNumbRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reserveServiceNumbRequest.media;
        }
        if ((i & 2) != 0) {
            str2 = reserveServiceNumbRequest.flpNumber;
        }
        return reserveServiceNumbRequest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.media;
    }

    @Nullable
    public final String component2() {
        return this.flpNumber;
    }

    @NotNull
    public final ReserveServiceNumbRequest copy(@NotNull String media, @Nullable String str) {
        Intrinsics.checkNotNullParameter(media, "media");
        return new ReserveServiceNumbRequest(media, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReserveServiceNumbRequest) {
            ReserveServiceNumbRequest reserveServiceNumbRequest = (ReserveServiceNumbRequest) obj;
            return Intrinsics.areEqual(this.media, reserveServiceNumbRequest.media) && Intrinsics.areEqual(this.flpNumber, reserveServiceNumbRequest.flpNumber);
        }
        return false;
    }

    @Nullable
    public final String getFlpNumber() {
        return this.flpNumber;
    }

    @NotNull
    public final String getMedia() {
        return this.media;
    }

    public int hashCode() {
        int hashCode = this.media.hashCode() * 31;
        String str = this.flpNumber;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.media;
        String str2 = this.flpNumber;
        return "ReserveServiceNumbRequest(media=" + str + ", flpNumber=" + str2 + ")";
    }

    public /* synthetic */ ReserveServiceNumbRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
