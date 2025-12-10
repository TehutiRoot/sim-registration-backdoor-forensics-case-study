package th.p047co.dtac.android.dtacone.app_one.util.validation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolPriceListResponse;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/util/validation/OneSelectPriceValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolPriceListResponse$PriceListData;", "()V", "validate", "", "value", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.validation.OneSelectPriceValidate */
/* loaded from: classes7.dex */
public final class OneSelectPriceValidate implements ValidationRule<OneBuyDolPriceListResponse.PriceListData> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable OneBuyDolPriceListResponse.PriceListData priceListData) {
        if (priceListData == null || priceListData.getAmount() <= 0) {
            throw new ValidatedRuleException(R.string.one_buy_dol_alert_select_amount);
        }
    }
}
