package th.p047co.dtac.android.dtacone.model.activate_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/activate_dol/DolStatusCollection;", "", NotificationCompat.CATEGORY_STATUS, "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.activate_dol.DolStatusCollection */
/* loaded from: classes8.dex */
public final class DolStatusCollection {
    public static final int $stable = 0;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private final String status;

    public DolStatusCollection(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }
}
