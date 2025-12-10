package th.p047co.dtac.android.dtacone.util.validation;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.ValidatorTextWatcher */
/* loaded from: classes8.dex */
public class ValidatorTextWatcher implements TextWatcher {

    /* renamed from: a */
    public TextView f87217a;

    public ValidatorTextWatcher(TextView textView) {
        this.f87217a = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            new PhoneNumberValidator().validate(charSequence.toString());
            this.f87217a.setVisibility(8);
        } catch (ValidatedRuleException e) {
            this.f87217a.setText(e.getResId());
            this.f87217a.setVisibility(0);
        }
    }
}