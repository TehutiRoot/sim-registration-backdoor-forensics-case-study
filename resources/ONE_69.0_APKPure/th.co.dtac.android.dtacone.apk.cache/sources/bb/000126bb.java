package th.p047co.dtac.android.dtacone.util;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\n¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/ToastMessage;", "", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/app/Activity;)V", "Lth/co/dtac/android/dtacone/util/ToastAlertState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "setState", "(Lth/co/dtac/android/dtacone/util/ToastAlertState;)V", "show", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", "getContext", "()Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/util/ToastAlertState;", "getCurrentState", "()Lth/co/dtac/android/dtacone/util/ToastAlertState;", "setCurrentState", "currentState", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.ToastMessage */
/* loaded from: classes8.dex */
public final class ToastMessage {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f87087a;

    /* renamed from: b */
    public ToastAlertState f87088b;

    public ToastMessage(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87087a = context;
        this.f87088b = new UpdateIMEIAlert();
    }

    @NotNull
    public final Activity getContext() {
        return this.f87087a;
    }

    @Nullable
    public final ToastAlertState getCurrentState() {
        return this.f87088b;
    }

    public final void setCurrentState(@Nullable ToastAlertState toastAlertState) {
        this.f87088b = toastAlertState;
    }

    public final void setState(@NotNull ToastAlertState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f87088b = state;
    }

    public final void show() {
        ToastAlertState toastAlertState = this.f87088b;
        if (toastAlertState != null) {
            toastAlertState.show(this.f87087a);
        }
    }
}