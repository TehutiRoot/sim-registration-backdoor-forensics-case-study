package th.p047co.dtac.android.dtacone.util.validation.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/payment/CashRemainValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lkotlin/Pair;", "", "()V", "validate", "", "value", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.payment.CashRemainValidate */
/* loaded from: classes8.dex */
public final class CashRemainValidate implements ValidationRule<Pair<? extends String, ? extends String>> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public /* bridge */ /* synthetic */ void validate(Pair<? extends String, ? extends String> pair) {
        validate2((Pair<String, String>) pair);
    }

    /* renamed from: validate  reason: avoid collision after fix types in other method */
    public void validate2(@NotNull Pair<String, String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getSecond().length() != 0) {
            if (new BigDecimal(value.getSecond()).compareTo(new BigDecimal(value.getFirst())) == 1) {
                throw new ValidatedRuleException(R.string.invalid_pay_amount);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.invalid_pay_amount);
    }
}