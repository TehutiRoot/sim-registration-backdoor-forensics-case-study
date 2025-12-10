package th.p047co.dtac.android.dtacone.app_one.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/OneOnlineRegisterPasswordRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/app_one/util/model/OneAddNewStaff;", "()V", "validate", "", "value", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.OneOnlineRegisterPasswordRule */
/* loaded from: classes7.dex */
public final class OneOnlineRegisterPasswordRule implements ValidationRule<OneAddNewStaff> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@NotNull OneAddNewStaff value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String phoneNumber = value.getPhoneNumber();
        String removeSpecialChar = phoneNumber != null ? PhoneNumberExtKt.toRemoveSpecialChar(phoneNumber) : null;
        if ((removeSpecialChar != null ? removeSpecialChar.length() : 0) > 0) {
            if ((removeSpecialChar != null ? removeSpecialChar.length() : 0) > 9) {
                String password = value.getPassword();
                boolean z = true;
                if (!(password == null || password.length() == 0)) {
                    String password2 = value.getPassword();
                    if (password2 == null) {
                        password2 = "";
                    }
                    String password3 = value.getPassword();
                    if ((password3 != null ? password3.length() : 0) >= 6 && new Regex("[0-9]").containsMatchIn(password2) && new Regex("[A-Za-z]").containsMatchIn(password2)) {
                        String passwordConfirm = value.getPasswordConfirm();
                        if (passwordConfirm != null && passwordConfirm.length() != 0) {
                            z = false;
                        }
                        if (!z) {
                            String passwordConfirm2 = value.getPasswordConfirm();
                            String str = passwordConfirm2 != null ? passwordConfirm2 : "";
                            String passwordConfirm3 = value.getPasswordConfirm();
                            if ((passwordConfirm3 != null ? passwordConfirm3.length() : 0) >= 6 && new Regex("[0-9]").containsMatchIn(str) && new Regex("[A-Za-z]").containsMatchIn(str)) {
                                if (!Intrinsics.areEqual(value.getPassword(), value.getPasswordConfirm())) {
                                    throw new ValidatedRuleException(R.string.online_register_verify_pass_word_confirm);
                                }
                                return;
                            }
                            throw new ValidatedRuleException(R.string.one_online_register_retailer_set_password_verify_pass_word_confirm);
                        }
                        throw new ValidatedRuleException(R.string.one_online_register_please_enter_password_confirm);
                    }
                    throw new ValidatedRuleException(R.string.one_online_register_retailer_set_password_verify_pass_word_confirm);
                }
                throw new ValidatedRuleException(R.string.one_online_register_retailer_set_password_verify_pass_word_confirm);
            }
        }
        throw new ValidatedRuleException(R.string.one_please_enter_phone_number);
    }
}
