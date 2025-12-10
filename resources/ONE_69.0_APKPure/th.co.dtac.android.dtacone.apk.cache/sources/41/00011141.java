package th.p047co.dtac.android.dtacone.app_one.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/OneAddNewStaffRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/app_one/util/model/OneAddNewStaff;", "()V", "validate", "", "value", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.OneAddNewStaffRule */
/* loaded from: classes7.dex */
public final class OneAddNewStaffRule implements ValidationRule<OneAddNewStaff> {
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
                    if ((password2 != null ? password2.length() : 0) == 6) {
                        String passwordConfirm = value.getPasswordConfirm();
                        if (passwordConfirm != null && passwordConfirm.length() != 0) {
                            z = false;
                        }
                        if (!z) {
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
                throw new ValidatedRuleException(R.string.change_enter_password);
            }
        }
        throw new ValidatedRuleException(R.string.one_please_enter_phone_number);
    }
}