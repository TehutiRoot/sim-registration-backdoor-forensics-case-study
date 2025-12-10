package th.p047co.dtac.android.dtacone.util.appOne;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneAddressNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneBirthDateRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneDistrictLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneEmailLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneFirstNameValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneHomeNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneHouseNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneLastNameValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OnePhoneNumberValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OnePostcodeLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneProvinceLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneSubDistrictLengthRule;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/appOne/OneAddressMailingValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", "()V", "validate", "", "value", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.appOne.OneAddressMailingValidate */
/* loaded from: classes8.dex */
public final class OneAddressMailingValidate implements ValidationRule<OneAddressMailingData> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable OneAddressMailingData oneAddressMailingData) {
        String phoneNumberContact;
        String email;
        String birthDate;
        new OneFirstNameValidate().validate(oneAddressMailingData != null ? oneAddressMailingData.getFirstName() : null);
        new OneLastNameValidate().validate(oneAddressMailingData != null ? oneAddressMailingData.getLastName() : null);
        new OneBirthDateRule().validate((oneAddressMailingData == null || (birthDate = oneAddressMailingData.getBirthDate()) == null) ? null : DateFormatExtKt.toNumberBirthDateCollectionFormat(birthDate));
        if (oneAddressMailingData != null && oneAddressMailingData.isTrue()) {
            new OneHouseNoLengthRule().validate(oneAddressMailingData.getHouseNo());
            new OneAddressNoLengthRule().validate(oneAddressMailingData.getAddressNo());
        } else {
            new OneHomeNoLengthRule().validate(oneAddressMailingData != null ? oneAddressMailingData.getHouseNo() : null);
        }
        new OneProvinceLengthRule().validate(oneAddressMailingData != null ? oneAddressMailingData.getProvince() : null);
        new OneDistrictLengthRule().validate(oneAddressMailingData != null ? oneAddressMailingData.getDistrict() : null);
        new OneSubDistrictLengthRule().validate(oneAddressMailingData != null ? oneAddressMailingData.getSubDistrict() : null);
        new OnePostcodeLengthRule().validate(oneAddressMailingData != null ? oneAddressMailingData.getPostcode() : null);
        if (oneAddressMailingData != null && oneAddressMailingData.isTrue()) {
            new OnePhoneNumberValidate().validate(oneAddressMailingData.getPhoneNumberContact());
        } else if (oneAddressMailingData != null && (phoneNumberContact = oneAddressMailingData.getPhoneNumberContact()) != null && phoneNumberContact.length() > 0 && (!AbstractC19741eO1.isBlank(oneAddressMailingData.getPhoneNumberContact()))) {
            new OnePhoneNumberValidate().validate(oneAddressMailingData.getPhoneNumberContact());
        }
        if (oneAddressMailingData == null || (email = oneAddressMailingData.getEmail()) == null || email.length() <= 0 || !(true ^ AbstractC19741eO1.isBlank(oneAddressMailingData.getEmail()))) {
            if (!Intrinsics.areEqual(oneAddressMailingData != null ? oneAddressMailingData.getEInvoiceType() : null, Constant.EInvoice.SMS_WITH_EMAIL)) {
                return;
            }
        }
        new OneEmailLengthRule().validate(oneAddressMailingData.getEmail());
    }
}