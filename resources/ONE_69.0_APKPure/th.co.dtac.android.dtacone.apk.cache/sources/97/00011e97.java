package th.p047co.dtac.android.dtacone.model.login;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/login/Cli;", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "", "(Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.login.Cli */
/* loaded from: classes8.dex */
public final class Cli {
    public static final int $stable = 0;
    @SerializedName("number")
    @NotNull
    private final String phoneNumber;

    public Cli(@NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }
}