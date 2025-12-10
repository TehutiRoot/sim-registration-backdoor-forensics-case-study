package th.p047co.dtac.android.dtacone.util.validation.mailing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.mailing.OneAddressMailingData;
import th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneAddressNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneBirthDateRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneDistrictLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneFirstNameValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneHomeNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneHouseNoLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneLastNameValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OnePhoneNumberValidate;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OnePostcodeLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneProvinceLengthRule;
import th.p047co.dtac.android.dtacone.util.appOne.validate_mailing.OneSubDistrictLengthRule;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;
import th.p047co.dtac.android.dtacone.util.validation.common.EmptyValidate;
import th.p047co.dtac.android.dtacone.util.validation.person.BirthDayRule;
import th.p047co.dtac.android.dtacone.util.validation.self_update.FirstNameValidate;
import th.p047co.dtac.android.dtacone.util.validation.self_update.LastNameValidate;
import th.p047co.dtac.android.dtacone.util.validation.self_update.PhoneNumberValidate;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ+\u0010\u0017\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/mailing/OneNewAddressMailingValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "", "<init>", "()V", "value", "", "validate", "(Ljava/lang/Object;)V", "Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "validateAddressMailingDataForDtac", "(Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;)V", "", "isOne", "validateForPrepaid", "(Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;Z)V", "Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;", OperatorName.CURVE_TO, "(Lth/co/dtac/android/dtacone/model/appOne/mailing/OneAddressMailingData;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "email", "eInvoiceType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Ljava/lang/String;Z)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.validation.mailing.OneNewAddressMailingValidate */
/* loaded from: classes8.dex */
public final class OneNewAddressMailingValidate implements ValidationRule<Object> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final void m16726a(AddressMailingData addressMailingData) {
        String str;
        String str2;
        BirthDayCollection birthDayCollection;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String birthDate;
        FirstNameValidate firstNameValidate = new FirstNameValidate();
        String str10 = null;
        if (addressMailingData != null) {
            str = addressMailingData.getFirstName();
        } else {
            str = null;
        }
        firstNameValidate.validate(str);
        LastNameValidate lastNameValidate = new LastNameValidate();
        if (addressMailingData != null) {
            str2 = addressMailingData.getLastName();
        } else {
            str2 = null;
        }
        lastNameValidate.validate(str2);
        BirthDayRule birthDayRule = new BirthDayRule();
        if (addressMailingData != null && (birthDate = addressMailingData.getBirthDate()) != null) {
            birthDayCollection = DateFormatExtKt.toNumberBirthDateCollectionFormat(birthDate);
        } else {
            birthDayCollection = null;
        }
        birthDayRule.validate(birthDayCollection);
        HomeNoLengthRule homeNoLengthRule = new HomeNoLengthRule();
        if (addressMailingData != null) {
            str3 = addressMailingData.getAddressNo();
        } else {
            str3 = null;
        }
        homeNoLengthRule.validate(str3);
        ProvinceLengthRule provinceLengthRule = new ProvinceLengthRule();
        if (addressMailingData != null) {
            str4 = addressMailingData.getProvince();
        } else {
            str4 = null;
        }
        provinceLengthRule.validate(str4);
        DistrictLengthRule districtLengthRule = new DistrictLengthRule();
        if (addressMailingData != null) {
            str5 = addressMailingData.getDistrict();
        } else {
            str5 = null;
        }
        districtLengthRule.validate(str5);
        SubDistrictLengthRule subDistrictLengthRule = new SubDistrictLengthRule();
        if (addressMailingData != null) {
            str6 = addressMailingData.getSubDistrict();
        } else {
            str6 = null;
        }
        subDistrictLengthRule.validate(str6);
        PostcodeLengthRule postcodeLengthRule = new PostcodeLengthRule();
        if (addressMailingData != null) {
            str7 = addressMailingData.getPostcode();
        } else {
            str7 = null;
        }
        postcodeLengthRule.validate(str7);
        if (addressMailingData != null) {
            str8 = addressMailingData.getEmail();
        } else {
            str8 = null;
        }
        if (addressMailingData != null) {
            str9 = addressMailingData.getEInvoiceType();
        } else {
            str9 = null;
        }
        m16725b(str8, str9, false);
        PhoneNumberValidate phoneNumberValidate = new PhoneNumberValidate();
        if (addressMailingData != null) {
            str10 = addressMailingData.getPhoneNumberContact();
        }
        phoneNumberValidate.validate(str10);
    }

    /* renamed from: b */
    public final void m16725b(String str, String str2, boolean z) {
        if ((str != null && str.length() > 0 && (!AbstractC19741eO1.isBlank(str))) || Intrinsics.areEqual(str2, Constant.EInvoice.SMS_WITH_EMAIL)) {
            if (z) {
                new EmailLengthRule().validate(str);
            } else {
                new EmailLengthRule().validate(str);
            }
        }
    }

    /* renamed from: c */
    public final void m16724c(OneAddressMailingData oneAddressMailingData) {
        String str;
        String str2;
        BirthDayCollection birthDayCollection;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String phoneNumberContact;
        String str8;
        String birthDate;
        OneFirstNameValidate oneFirstNameValidate = new OneFirstNameValidate();
        String str9 = null;
        if (oneAddressMailingData != null) {
            str = oneAddressMailingData.getFirstName();
        } else {
            str = null;
        }
        oneFirstNameValidate.validate(str);
        OneLastNameValidate oneLastNameValidate = new OneLastNameValidate();
        if (oneAddressMailingData != null) {
            str2 = oneAddressMailingData.getLastName();
        } else {
            str2 = null;
        }
        oneLastNameValidate.validate(str2);
        OneBirthDateRule oneBirthDateRule = new OneBirthDateRule();
        if (oneAddressMailingData != null && (birthDate = oneAddressMailingData.getBirthDate()) != null) {
            birthDayCollection = DateFormatExtKt.toNumberBirthDateCollectionFormat(birthDate);
        } else {
            birthDayCollection = null;
        }
        oneBirthDateRule.validate(birthDayCollection);
        if (oneAddressMailingData != null && oneAddressMailingData.isTrue()) {
            new OneHouseNoLengthRule().validate(oneAddressMailingData.getHouseNo());
            new OneAddressNoLengthRule().validate(oneAddressMailingData.getAddressNo());
        } else {
            OneHomeNoLengthRule oneHomeNoLengthRule = new OneHomeNoLengthRule();
            if (oneAddressMailingData != null) {
                str3 = oneAddressMailingData.getHouseNo();
            } else {
                str3 = null;
            }
            oneHomeNoLengthRule.validate(str3);
        }
        OneProvinceLengthRule oneProvinceLengthRule = new OneProvinceLengthRule();
        if (oneAddressMailingData != null) {
            str4 = oneAddressMailingData.getProvince();
        } else {
            str4 = null;
        }
        oneProvinceLengthRule.validate(str4);
        OneDistrictLengthRule oneDistrictLengthRule = new OneDistrictLengthRule();
        if (oneAddressMailingData != null) {
            str5 = oneAddressMailingData.getDistrict();
        } else {
            str5 = null;
        }
        oneDistrictLengthRule.validate(str5);
        OneSubDistrictLengthRule oneSubDistrictLengthRule = new OneSubDistrictLengthRule();
        if (oneAddressMailingData != null) {
            str6 = oneAddressMailingData.getSubDistrict();
        } else {
            str6 = null;
        }
        oneSubDistrictLengthRule.validate(str6);
        OnePostcodeLengthRule onePostcodeLengthRule = new OnePostcodeLengthRule();
        if (oneAddressMailingData != null) {
            str7 = oneAddressMailingData.getPostcode();
        } else {
            str7 = null;
        }
        onePostcodeLengthRule.validate(str7);
        if (oneAddressMailingData != null && oneAddressMailingData.isTrue()) {
            new OnePhoneNumberValidate().validate(oneAddressMailingData.getPhoneNumberContact());
        } else if (oneAddressMailingData != null && (phoneNumberContact = oneAddressMailingData.getPhoneNumberContact()) != null && phoneNumberContact.length() > 0 && (!AbstractC19741eO1.isBlank(oneAddressMailingData.getPhoneNumberContact()))) {
            new OnePhoneNumberValidate().validate(oneAddressMailingData.getPhoneNumberContact());
        }
        if (oneAddressMailingData != null) {
            str8 = oneAddressMailingData.getEmail();
        } else {
            str8 = null;
        }
        if (oneAddressMailingData != null) {
            str9 = oneAddressMailingData.getEInvoiceType();
        }
        m16725b(str8, str9, true);
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable Object obj) {
        if (obj instanceof OneAddressMailingData) {
            m16724c((OneAddressMailingData) obj);
        } else if (obj instanceof AddressMailingData) {
            m16726a((AddressMailingData) obj);
        } else {
            throw new IllegalArgumentException("Unsupported data type for validation");
        }
    }

    public final void validateAddressMailingDataForDtac(@Nullable AddressMailingData addressMailingData) {
        String str;
        String str2;
        BirthDayCollection birthDayCollection;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String birthDate;
        FirstNameValidate firstNameValidate = new FirstNameValidate();
        String str9 = null;
        if (addressMailingData != null) {
            str = addressMailingData.getFirstName();
        } else {
            str = null;
        }
        firstNameValidate.validate(str);
        LastNameValidate lastNameValidate = new LastNameValidate();
        if (addressMailingData != null) {
            str2 = addressMailingData.getLastName();
        } else {
            str2 = null;
        }
        lastNameValidate.validate(str2);
        BirthDayRule birthDayRule = new BirthDayRule();
        if (addressMailingData != null && (birthDate = addressMailingData.getBirthDate()) != null) {
            birthDayCollection = DateFormatExtKt.toNumberBirthDateCollectionFormat(birthDate);
        } else {
            birthDayCollection = null;
        }
        birthDayRule.validate(birthDayCollection);
        HomeNoLengthRule homeNoLengthRule = new HomeNoLengthRule();
        if (addressMailingData != null) {
            str3 = addressMailingData.getAddressNo();
        } else {
            str3 = null;
        }
        homeNoLengthRule.validate(str3);
        ProvinceLengthRule provinceLengthRule = new ProvinceLengthRule();
        if (addressMailingData != null) {
            str4 = addressMailingData.getProvince();
        } else {
            str4 = null;
        }
        provinceLengthRule.validate(str4);
        DistrictLengthRule districtLengthRule = new DistrictLengthRule();
        if (addressMailingData != null) {
            str5 = addressMailingData.getDistrict();
        } else {
            str5 = null;
        }
        districtLengthRule.validate(str5);
        SubDistrictLengthRule subDistrictLengthRule = new SubDistrictLengthRule();
        if (addressMailingData != null) {
            str6 = addressMailingData.getSubDistrict();
        } else {
            str6 = null;
        }
        subDistrictLengthRule.validate(str6);
        PostcodeLengthRule postcodeLengthRule = new PostcodeLengthRule();
        if (addressMailingData != null) {
            str7 = addressMailingData.getPostcode();
        } else {
            str7 = null;
        }
        postcodeLengthRule.validate(str7);
        if (addressMailingData != null) {
            str8 = addressMailingData.getEmail();
        } else {
            str8 = null;
        }
        if (addressMailingData != null) {
            str9 = addressMailingData.getEInvoiceType();
        }
        m16725b(str8, str9, false);
    }

    public final void validateForPrepaid(@Nullable AddressMailingData addressMailingData, boolean z) {
        String str;
        String str2;
        String birthDate;
        String str3;
        String str4;
        BirthDayCollection birthDayCollection = null;
        String str5 = null;
        birthDayCollection = null;
        if (z) {
            EmptyValidate.Companion companion = EmptyValidate.Companion;
            if (addressMailingData != null) {
                str3 = addressMailingData.getFirstName();
            } else {
                str3 = null;
            }
            companion.validate(str3, R.string.one_online_register_validate_form_message);
            if (addressMailingData != null) {
                str4 = addressMailingData.getLastName();
            } else {
                str4 = null;
            }
            companion.validate(str4, R.string.one_online_register_validate_form_message);
            if (addressMailingData != null) {
                str5 = addressMailingData.getBirthDate();
            }
            companion.validate(str5, R.string.one_online_register_validate_form_message);
            return;
        }
        FirstNameValidate firstNameValidate = new FirstNameValidate();
        if (addressMailingData != null) {
            str = addressMailingData.getFirstName();
        } else {
            str = null;
        }
        firstNameValidate.validate(str);
        LastNameValidate lastNameValidate = new LastNameValidate();
        if (addressMailingData != null) {
            str2 = addressMailingData.getLastName();
        } else {
            str2 = null;
        }
        lastNameValidate.validate(str2);
        BirthDayRule birthDayRule = new BirthDayRule();
        if (addressMailingData != null && (birthDate = addressMailingData.getBirthDate()) != null) {
            birthDayCollection = DateFormatExtKt.toNumberBirthDateCollectionFormat(birthDate);
        }
        birthDayRule.validate(birthDayCollection);
    }
}