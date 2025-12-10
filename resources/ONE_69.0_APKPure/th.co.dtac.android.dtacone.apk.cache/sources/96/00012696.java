package th.p047co.dtac.android.dtacone.util;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Err;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/ErrorHelper;", "", "()V", "errorWithDefaultTitle", "Lth/co/dtac/android/dtacone/model/Err;", "stringId", "", "errorWithErrorTitle", "errorWithInvalidDataTitle", "errorWithTitleAndMessage", "stringTitleInt", "stringMessageId", "errorWithWarningTitle", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.ErrorHelper */
/* loaded from: classes8.dex */
public final class ErrorHelper {
    public static final int $stable = 0;
    @NotNull
    public static final ErrorHelper INSTANCE = new ErrorHelper();

    @NotNull
    public final Err errorWithDefaultTitle(@StringRes int i) {
        return new Err(null, null, null, null, null, null, null, 0, i, 255, null);
    }

    @NotNull
    public final Err errorWithErrorTitle(@StringRes int i) {
        return new Err(null, null, null, null, null, null, null, R.string.dialog_title_error, i, 127, null);
    }

    @NotNull
    public final Err errorWithInvalidDataTitle(@StringRes int i) {
        return new Err(null, null, null, null, null, null, null, R.string.dialog_title_invalid_data, i, 127, null);
    }

    @NotNull
    public final Err errorWithTitleAndMessage(@StringRes int i, @StringRes int i2) {
        return new Err(null, null, null, null, null, null, null, i, i2, 127, null);
    }

    @NotNull
    public final Err errorWithWarningTitle(@StringRes int i) {
        return new Err(null, null, null, null, null, null, null, R.string.dialog_title_warning, i, 127, null);
    }
}