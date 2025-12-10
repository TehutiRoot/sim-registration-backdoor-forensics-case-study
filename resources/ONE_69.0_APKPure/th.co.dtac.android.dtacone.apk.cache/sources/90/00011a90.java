package th.p047co.dtac.android.dtacone.model.appOne.mnp.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/mnp/response/DataSubmitPortIn;", "", "orderId", "", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.mnp.response.DataSubmitPortIn */
/* loaded from: classes8.dex */
public final class DataSubmitPortIn {
    public static final int $stable = 0;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;

    public DataSubmitPortIn() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DataSubmitPortIn copy$default(DataSubmitPortIn dataSubmitPortIn, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataSubmitPortIn.orderId;
        }
        if ((i & 2) != 0) {
            str2 = dataSubmitPortIn.status;
        }
        return dataSubmitPortIn.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.orderId;
    }

    @Nullable
    public final String component2() {
        return this.status;
    }

    @NotNull
    public final DataSubmitPortIn copy(@Nullable String str, @Nullable String str2) {
        return new DataSubmitPortIn(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataSubmitPortIn) {
            DataSubmitPortIn dataSubmitPortIn = (DataSubmitPortIn) obj;
            return Intrinsics.areEqual(this.orderId, dataSubmitPortIn.orderId) && Intrinsics.areEqual(this.status, dataSubmitPortIn.status);
        }
        return false;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.orderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.status;
        return "DataSubmitPortIn(orderId=" + str + ", status=" + str2 + ")";
    }

    public DataSubmitPortIn(@Nullable String str, @Nullable String str2) {
        this.orderId = str;
        this.status = str2;
    }

    public /* synthetic */ DataSubmitPortIn(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}