package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/SIMInfoResponse;", "", "value", "", "isSuggest", "", "(Ljava/lang/String;Z)V", "()Z", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.SIMInfoResponse */
/* loaded from: classes8.dex */
public final class SIMInfoResponse {
    public static final int $stable = 0;
    @SerializedName("isSuggest")
    private final boolean isSuggest;
    @SerializedName("value")
    @NotNull
    private final String value;

    public SIMInfoResponse(@NotNull String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.isSuggest = z;
    }

    public static /* synthetic */ SIMInfoResponse copy$default(SIMInfoResponse sIMInfoResponse, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sIMInfoResponse.value;
        }
        if ((i & 2) != 0) {
            z = sIMInfoResponse.isSuggest;
        }
        return sIMInfoResponse.copy(str, z);
    }

    @NotNull
    public final String component1() {
        return this.value;
    }

    public final boolean component2() {
        return this.isSuggest;
    }

    @NotNull
    public final SIMInfoResponse copy(@NotNull String value, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new SIMInfoResponse(value, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SIMInfoResponse) {
            SIMInfoResponse sIMInfoResponse = (SIMInfoResponse) obj;
            return Intrinsics.areEqual(this.value, sIMInfoResponse.value) && this.isSuggest == sIMInfoResponse.isSuggest;
        }
        return false;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        boolean z = this.isSuggest;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isSuggest() {
        return this.isSuggest;
    }

    @NotNull
    public String toString() {
        String str = this.value;
        boolean z = this.isSuggest;
        return "SIMInfoResponse(value=" + str + ", isSuggest=" + z + ")";
    }
}