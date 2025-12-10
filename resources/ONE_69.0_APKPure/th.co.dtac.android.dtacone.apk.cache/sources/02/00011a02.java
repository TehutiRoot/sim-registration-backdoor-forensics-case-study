package th.p047co.dtac.android.dtacone.model.activate_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/activate_dol/ActivateDolCollection;", "", "token", "", "simR", "(Ljava/lang/String;Ljava/lang/String;)V", "getSimR", "()Ljava/lang/String;", "getToken", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.activate_dol.ActivateDolCollection */
/* loaded from: classes8.dex */
public final class ActivateDolCollection {
    public static final int $stable = 0;
    @SerializedName("simR")
    @NotNull
    private final String simR;
    @SerializedName("token")
    @NotNull
    private final String token;

    public ActivateDolCollection(@NotNull String token, @NotNull String simR) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(simR, "simR");
        this.token = token;
        this.simR = simR;
    }

    @NotNull
    public final String getSimR() {
        return this.simR;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }
}