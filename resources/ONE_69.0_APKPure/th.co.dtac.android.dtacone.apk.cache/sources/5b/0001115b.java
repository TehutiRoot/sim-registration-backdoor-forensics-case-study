package th.p047co.dtac.android.dtacone.app_one.util.validation.creditCard;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\b¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/creditCard/OneCreditCardValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "", "<init>", "()V", "value", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "validate", "(Ljava/lang/String;)V", "validateCreditCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.creditCard.OneCreditCardValidate */
/* loaded from: classes7.dex */
public final class OneCreditCardValidate implements ValidationRule<String> {
    public static final int $stable = 0;

    /* renamed from: a */
    private final boolean m20256a(String str) {
        int i;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        if (i >= 16) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m20255b(String str) {
        return str == null;
    }

    public final boolean validateCreditCard(@Nullable String str) {
        if (!m20256a(str) && !m20255b(str)) {
            return true;
        }
        return false;
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable String str) {
        if (!m20255b(str)) {
            if (m20256a(str)) {
                throw new ValidatedRuleException(R.string.one_buy_dol_enter_expired_date_invalid);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.one_buy_dol_please_enter_credit_card_number);
    }
}