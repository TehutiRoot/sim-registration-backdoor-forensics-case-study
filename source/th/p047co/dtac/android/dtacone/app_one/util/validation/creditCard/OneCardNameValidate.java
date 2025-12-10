package th.p047co.dtac.android.dtacone.app_one.util.validation.creditCard;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/creditCard/OneCardNameValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "", "()V", "isNameInvalid", "", "value", "validate", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.creditCard.OneCardNameValidate */
/* loaded from: classes7.dex */
public final class OneCardNameValidate implements ValidationRule<String> {
    public static final int $stable = 0;

    public final boolean isNameInvalid(@Nullable String str) {
        if (str != null && !AbstractC20204hN1.isBlank(str)) {
            return false;
        }
        return true;
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable String str) {
        if (isNameInvalid(str)) {
            throw new ValidatedRuleException(R.string.buy_dol_please_enter_name_in_card);
        }
    }
}
