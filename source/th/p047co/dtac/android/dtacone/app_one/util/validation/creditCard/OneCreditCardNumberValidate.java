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
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/creditCard/OneCreditCardNumberValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "", "<init>", "()V", "value", "", "validate", "(Ljava/lang/String;)V", "", "validateCreditCard", "(Ljava/lang/String;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.creditCard.OneCreditCardNumberValidate */
/* loaded from: classes7.dex */
public final class OneCreditCardNumberValidate implements ValidationRule<String> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final boolean m20083a(String str) {
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
    public final boolean m20082b(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public final boolean validateCreditCard(@Nullable String str) {
        if (!m20083a(str) && !m20082b(str)) {
            return true;
        }
        return false;
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable String str) {
        if (!m20082b(str)) {
            if (m20083a(str)) {
                throw new ValidatedRuleException(R.string.one_postpaid_enter_credit_card_number_invalid);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.one_postpaid_please_enter_credit_card_number);
    }
}
