package th.p047co.dtac.android.dtacone.app_one.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/OneRegistrationInputInfoRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "()V", "validate", "", "value", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.OneRegistrationInputInfoRule */
/* loaded from: classes7.dex */
public final class OneRegistrationInputInfoRule implements ValidationRule<OneInputInfoData> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable OneInputInfoData oneInputInfoData) {
        String rtrCode;
        String phoneNumber;
        String rtrCode2;
        String phoneNumber2;
        if (oneInputInfoData != null && (rtrCode2 = oneInputInfoData.getRtrCode()) != null && rtrCode2.length() == 0 && oneInputInfoData != null && (phoneNumber2 = oneInputInfoData.getPhoneNumber()) != null && phoneNumber2.length() == 0) {
            throw new ValidatedRuleException(R.string.enter_data);
        }
        if (oneInputInfoData != null && (rtrCode = oneInputInfoData.getRtrCode()) != null && rtrCode.length() == 8) {
            String removeSpecialChar = (oneInputInfoData == null || (phoneNumber = oneInputInfoData.getPhoneNumber()) == null) ? null : PhoneNumberExtKt.toRemoveSpecialChar(phoneNumber);
            if ((removeSpecialChar != null ? removeSpecialChar.length() : 0) > 0) {
                if ((removeSpecialChar != null ? removeSpecialChar.length() : 0) <= 9) {
                    throw new ValidatedRuleException(R.string.rtr_profile_update_please_enter_phone_number_length);
                }
                return;
            }
            throw new ValidatedRuleException(R.string.rtr_profile_update_please_enter_phone_number);
        }
        throw new ValidatedRuleException(R.string.register_rtr_code_8_digit);
    }
}
