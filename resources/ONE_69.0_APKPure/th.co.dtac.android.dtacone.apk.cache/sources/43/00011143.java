package th.p047co.dtac.android.dtacone.app_one.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneChangePassword;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/OneChangePasswordRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "()V", "validate", "", "value", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.OneChangePasswordRule */
/* loaded from: classes7.dex */
public final class OneChangePasswordRule implements ValidationRule<OneChangePassword> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@NotNull OneChangePassword value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String oldPassword = value.getOldPassword();
        if (oldPassword != null && oldPassword.length() != 0) {
            String password = value.getPassword();
            boolean z = false;
            if ((password != null ? password.length() : 0) >= 6) {
                String password2 = value.getPassword();
                if (password2 == null) {
                    password2 = "";
                }
                if (new Regex("[0-9]").containsMatchIn(password2)) {
                    String password3 = value.getPassword();
                    if (new Regex("[A-Za-z]").containsMatchIn(password3 != null ? password3 : "")) {
                        String passwordConfirm = value.getPasswordConfirm();
                        if (!((passwordConfirm == null || passwordConfirm.length() == 0) ? true : true)) {
                            if (!Intrinsics.areEqual(value.getOldPassword(), value.getPassword()) && !Intrinsics.areEqual(value.getOldPassword(), value.getPasswordConfirm())) {
                                if (!Intrinsics.areEqual(value.getPassword(), value.getPasswordConfirm())) {
                                    throw new ValidatedRuleException(R.string.one_forgot_verify_pass_word_confirm);
                                }
                                return;
                            }
                            throw new ValidatedRuleException(R.string.one_change_password_new);
                        }
                        throw new ValidatedRuleException(R.string.please_enter_password_confirm);
                    }
                }
            }
            throw new ValidatedRuleException(R.string.please_set_password_more_equal_6_and_format_incorrect);
        }
        throw new ValidatedRuleException(R.string.change_pass_old_pass_empty_validate);
    }
}