package th.p047co.dtac.android.dtacone.util.validation.pin;

import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.pin.PinValidator */
/* loaded from: classes8.dex */
public class PinValidator extends Validator<String> {
    public PinValidator() {
        this.validationRules.add(new PinLengthRule());
    }
}