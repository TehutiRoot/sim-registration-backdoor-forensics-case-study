package th.p047co.dtac.android.dtacone.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/PhoneNumberValidateDup;", "", "()V", "validate", "", "value1", "", "value2", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.PhoneNumberValidateDup */
/* loaded from: classes8.dex */
public final class PhoneNumberValidateDup {
    public static final int $stable = 0;

    public final void validate(@Nullable String str, @Nullable String str2) {
        if (!Intrinsics.areEqual(str, str2)) {
            return;
        }
        throw new ValidatedRuleException(R.string.error_photo_number_dup);
    }
}