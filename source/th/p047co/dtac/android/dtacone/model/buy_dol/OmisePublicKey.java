package th.p047co.dtac.android.dtacone.model.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/OmisePublicKey;", "", "publicKey", "", "(Ljava/lang/String;)V", "getPublicKey", "()Ljava/lang/String;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.OmisePublicKey */
/* loaded from: classes8.dex */
public final class OmisePublicKey {
    public static final int $stable = 0;
    @SerializedName("publicKey")
    @NotNull
    private final String publicKey;

    public OmisePublicKey(@NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.publicKey = publicKey;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }
}
