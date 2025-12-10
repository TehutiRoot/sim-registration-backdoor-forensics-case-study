package th.p047co.dtac.android.dtacone.util.validation.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/buy_dol/SelectPriceValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/buy_dol/BuyDolPriceList$PriceListData;", "()V", "validate", "", "value", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.buy_dol.SelectPriceValidate */
/* loaded from: classes8.dex */
public final class SelectPriceValidate implements ValidationRule<BuyDolPriceList.PriceListData> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable BuyDolPriceList.PriceListData priceListData) {
        if (priceListData == null || priceListData.getAmount() <= 0) {
            throw new ValidatedRuleException(R.string.please_enter_buy_dol_price_completely_form);
        }
    }
}