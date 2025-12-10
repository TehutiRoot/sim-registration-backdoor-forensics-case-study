package th.p047co.dtac.android.dtacone.util.appOne;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.VerifyKeyListItem;
import th.p047co.dtac.android.dtacone.model.error.OneValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/appOne/OneCampaignVerify;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/VerifyKeyListItem;", "()V", "validate", "", "item", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.appOne.OneCampaignVerify */
/* loaded from: classes8.dex */
public final class OneCampaignVerify implements ValidationRule<VerifyKeyListItem> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable VerifyKeyListItem verifyKeyListItem) {
        String value;
        String value2;
        String str = (verifyKeyListItem == null || (str = verifyKeyListItem.getVerifyKey()) == null) ? "" : "";
        if (Intrinsics.areEqual(str, Constant.OnePostpaidVerifyKey.MSISDN)) {
            String value3 = verifyKeyListItem != null ? verifyKeyListItem.getValue() : null;
            if (value3 != null && value3.length() != 0) {
                if (verifyKeyListItem != null && (value2 = verifyKeyListItem.getValue()) != null) {
                    r3 = PhoneNumberExtKt.toRemoveSpecialChar(value2);
                }
                if ((r3 != null ? r3.length() : 0) <= 9) {
                    throw new OneValidatedRuleException(R.string.one_enter_phone_number_length);
                }
                return;
            }
            throw new OneValidatedRuleException(R.string.one_please_enter_phone_number);
        } else if (Intrinsics.areEqual(str, Constant.OnePostpaidVerifyKey.BirthDate)) {
            String value4 = verifyKeyListItem != null ? verifyKeyListItem.getValue() : null;
            if (((value4 == null || value4.length() == 0) ? 1 : 1) == 0) {
                BirthDayCollection birthDateCollectionFormat = (verifyKeyListItem == null || (value = verifyKeyListItem.getValue()) == null) ? null : DateFormatExtKt.toBirthDateCollectionFormat(value);
                if (birthDateCollectionFormat == null || birthDateCollectionFormat.getDay() <= 0 || birthDateCollectionFormat.getMonth() <= 0 || birthDateCollectionFormat.getYear() <= 0) {
                    throw new OneValidatedRuleException(R.string.one_campaign_please_enter_birth_date, verifyKeyListItem != null ? verifyKeyListItem.getVerifyDesc() : null);
                }
                return;
            }
            throw new OneValidatedRuleException(R.string.one_campaign_please_enter_birth_date, verifyKeyListItem != null ? verifyKeyListItem.getVerifyDesc() : null);
        } else {
            String value5 = verifyKeyListItem != null ? verifyKeyListItem.getValue() : null;
            if (((value5 == null || value5.length() == 0) ? 1 : 1) != 0) {
                throw new OneValidatedRuleException(R.string.one_campaign_please_enter_value, verifyKeyListItem != null ? verifyKeyListItem.getVerifyDesc() : null);
            }
        }
    }
}