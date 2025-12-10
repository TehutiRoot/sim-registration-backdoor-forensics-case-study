package th.p047co.dtac.android.dtacone.util.validation.card;

import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.card.IdCardLengthValidator */
/* loaded from: classes8.dex */
public class IdCardLengthValidator extends Validator<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.Validator
    public boolean validate(String str) {
        String removeSpecialChar = PhoneNumberExtKt.toRemoveSpecialChar(str);
        return StringUtil.hasText(removeSpecialChar) && removeSpecialChar.length() == 13;
    }
}