package th.p047co.dtac.android.dtacone.app_one.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/OneRegistrationIDRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "", "()V", "validate", "", "value", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.OneRegistrationIDRule */
/* loaded from: classes7.dex */
public final class OneRegistrationIDRule implements ValidationRule<String> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable String str) {
        if (str != null && str.length() != 0) {
            if ((str != null ? str.length() : 0) != 5) {
                throw new ValidatedRuleException(R.string.one_regis_verify_5_id);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.one_regis_verify_5_id);
    }
}
