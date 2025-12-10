package th.p047co.dtac.android.dtacone.util.validation.price;

import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.price.PriceValidator */
/* loaded from: classes8.dex */
public class PriceValidator extends Validator<Integer> {
    public PriceValidator() {
        this.validationRules.add(new PriceEmptyRule());
        this.validationRules.add(new PriceShouldBePositiveRule());
    }
}