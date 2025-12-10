package th.p047co.dtac.android.dtacone.model.force_change_password;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/force_change_password/ForceChangePassword;", "", "userId", "", HintConstants.AUTOFILL_HINT_PASSWORD, "event", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "getPassword", "getUserId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.force_change_password.ForceChangePassword */
/* loaded from: classes8.dex */
public final class ForceChangePassword {
    public static final int $stable = 8;
    @SerializedName("event")
    @NotNull
    private String event;
    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    @NotNull
    private final String password;
    @SerializedName("userId")
    @NotNull
    private final String userId;

    public ForceChangePassword(@NotNull String userId, @NotNull String password, @NotNull String event) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(event, "event");
        this.userId = userId;
        this.password = password;
        this.event = event;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event = str;
    }

    public /* synthetic */ ForceChangePassword(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? Constant.EVENT_FORCE_CHANGE_PASSWORD : str3);
    }
}