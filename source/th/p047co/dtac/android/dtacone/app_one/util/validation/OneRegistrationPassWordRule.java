package th.p047co.dtac.android.dtacone.app_one.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneRegistrationPassWord;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/OneRegistrationPassWordRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "()V", "validate", "", "value", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.OneRegistrationPassWordRule */
/* loaded from: classes7.dex */
public final class OneRegistrationPassWordRule implements ValidationRule<OneRegistrationPassWord> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@NotNull OneRegistrationPassWord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String password = value.getPassword();
        if (password != null && password.length() != 0) {
            String password2 = value.getPassword();
            if ((password2 != null ? password2.length() : 0) == 6) {
                String passwordConfirm = value.getPasswordConfirm();
                if (!(passwordConfirm == null || passwordConfirm.length() == 0)) {
                    String passwordConfirm2 = value.getPasswordConfirm();
                    if ((passwordConfirm2 != null ? passwordConfirm2.length() : 0) == 6) {
                        if (!Intrinsics.areEqual(value.getPassword(), value.getPasswordConfirm())) {
                            throw new ValidatedRuleException(R.string.one_regis_verify_pass_word_confirm);
                        }
                        return;
                    }
                    throw new ValidatedRuleException(R.string.one_please_set_password_6_length_confirm);
                }
                throw new ValidatedRuleException(R.string.please_enter_password_confirm);
            }
            throw new ValidatedRuleException(R.string.please_set_password_6_length_confirm);
        }
        throw new ValidatedRuleException(R.string.register_enter_password);
    }
}
