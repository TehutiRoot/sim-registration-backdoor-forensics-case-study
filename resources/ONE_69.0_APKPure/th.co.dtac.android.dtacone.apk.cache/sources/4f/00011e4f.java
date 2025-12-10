package th.p047co.dtac.android.dtacone.model.epin;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.security.SecurePin;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/epin/EpinConfirmCollection;", "", "msisdn", "", "pin", "amount", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAmount", "()I", "getMsisdn", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/manager/security/SecurePin;", "getPin", "()Lth/co/dtac/android/dtacone/manager/security/SecurePin;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.epin.EpinConfirmCollection */
/* loaded from: classes8.dex */
public final class EpinConfirmCollection {
    public static final int $stable = 8;
    @SerializedName("amount")
    private final int amount;
    @SerializedName("msisdn")
    @NotNull
    private final String msisdn;
    @SerializedName("pin")
    @NotNull
    private final SecurePin pin;

    public EpinConfirmCollection(@NotNull String msisdn, @NotNull String pin, int i) {
        Intrinsics.checkNotNullParameter(msisdn, "msisdn");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.msisdn = msisdn;
        this.amount = i;
        this.pin = new SecurePin(pin);
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getMsisdn() {
        return this.msisdn;
    }

    @NotNull
    public final SecurePin getPin() {
        return this.pin;
    }
}