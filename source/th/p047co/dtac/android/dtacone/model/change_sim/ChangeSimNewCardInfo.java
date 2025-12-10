package th.p047co.dtac.android.dtacone.model.change_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimNewCardInfo;", "", "()V", "response", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimAdmKeyCollection;", "getResponse", "()Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimAdmKeyCollection;", NotificationCompat.CATEGORY_STATUS, "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_sim.ChangeSimNewCardInfo */
/* loaded from: classes8.dex */
public final class ChangeSimNewCardInfo {
    public static final int $stable = 8;
    @SerializedName("response")
    @Nullable
    private final ChangeSimAdmKeyCollection response;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private String status = "waiting";

    @Nullable
    public final ChangeSimAdmKeyCollection getResponse() {
        return this.response;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }
}
