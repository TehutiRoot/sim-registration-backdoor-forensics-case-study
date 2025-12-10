package th.p047co.dtac.android.dtacone.util.validation.mailing;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;
import th.p047co.dtac.android.dtacone.util.validation.common.EmptyValidate;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/mailing/OneAddressMailingValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/mailing/AddressMailingData;", "()V", "validate", "", "value", "validateForPrepaid", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.mailing.OneAddressMailingValidate */
/* loaded from: classes8.dex */
public final class OneAddressMailingValidate implements ValidationRule<AddressMailingData> {
    public static final int $stable = 0;

    public final void validateForPrepaid(@Nullable AddressMailingData addressMailingData) {
        String str;
        String str2;
        EmptyValidate.Companion companion = EmptyValidate.Companion;
        String str3 = null;
        if (addressMailingData != null) {
            str = addressMailingData.getFirstName();
        } else {
            str = null;
        }
        companion.validate(str, R.string.one_online_register_validate_form_message);
        if (addressMailingData != null) {
            str2 = addressMailingData.getLastName();
        } else {
            str2 = null;
        }
        companion.validate(str2, R.string.one_online_register_validate_form_message);
        if (addressMailingData != null) {
            str3 = addressMailingData.getBirthDate();
        }
        companion.validate(str3, R.string.one_online_register_validate_form_message);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4 != null ? r4.getEInvoiceType() : null, th.p047co.dtac.android.dtacone.util.Constant.EInvoice.SMS_WITH_EMAIL) != false) goto L35;
     */
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void validate(@org.jetbrains.annotations.Nullable th.p047co.dtac.android.dtacone.model.mailing.AddressMailingData r4) {
        /*
            r3 = this;
            th.co.dtac.android.dtacone.util.validation.self_update.FirstNameValidate r0 = new th.co.dtac.android.dtacone.util.validation.self_update.FirstNameValidate
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto Ld
            java.lang.String r2 = r4.getFirstName()
            goto Le
        Ld:
            r2 = r1
        Le:
            r0.validate(r2)
            th.co.dtac.android.dtacone.util.validation.self_update.LastNameValidate r0 = new th.co.dtac.android.dtacone.util.validation.self_update.LastNameValidate
            r0.<init>()
            if (r4 == 0) goto L1d
            java.lang.String r2 = r4.getLastName()
            goto L1e
        L1d:
            r2 = r1
        L1e:
            r0.validate(r2)
            th.co.dtac.android.dtacone.util.validation.person.BirthDayRule r0 = new th.co.dtac.android.dtacone.util.validation.person.BirthDayRule
            r0.<init>()
            if (r4 == 0) goto L33
            java.lang.String r2 = r4.getBirthDate()
            if (r2 == 0) goto L33
            th.co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection r2 = th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt.toNumberBirthDateCollectionFormat(r2)
            goto L34
        L33:
            r2 = r1
        L34:
            r0.validate(r2)
            th.co.dtac.android.dtacone.util.validation.mailing.HomeNoLengthRule r0 = new th.co.dtac.android.dtacone.util.validation.mailing.HomeNoLengthRule
            r0.<init>()
            if (r4 == 0) goto L43
            java.lang.String r2 = r4.getAddressNo()
            goto L44
        L43:
            r2 = r1
        L44:
            r0.validate(r2)
            th.co.dtac.android.dtacone.util.validation.mailing.ProvinceLengthRule r0 = new th.co.dtac.android.dtacone.util.validation.mailing.ProvinceLengthRule
            r0.<init>()
            if (r4 == 0) goto L53
            java.lang.String r2 = r4.getProvince()
            goto L54
        L53:
            r2 = r1
        L54:
            r0.validate(r2)
            th.co.dtac.android.dtacone.util.validation.mailing.DistrictLengthRule r0 = new th.co.dtac.android.dtacone.util.validation.mailing.DistrictLengthRule
            r0.<init>()
            if (r4 == 0) goto L63
            java.lang.String r2 = r4.getDistrict()
            goto L64
        L63:
            r2 = r1
        L64:
            r0.validate(r2)
            th.co.dtac.android.dtacone.util.validation.mailing.SubDistrictLengthRule r0 = new th.co.dtac.android.dtacone.util.validation.mailing.SubDistrictLengthRule
            r0.<init>()
            if (r4 == 0) goto L73
            java.lang.String r2 = r4.getSubDistrict()
            goto L74
        L73:
            r2 = r1
        L74:
            r0.validate(r2)
            th.co.dtac.android.dtacone.util.validation.mailing.PostcodeLengthRule r0 = new th.co.dtac.android.dtacone.util.validation.mailing.PostcodeLengthRule
            r0.<init>()
            if (r4 == 0) goto L83
            java.lang.String r2 = r4.getPostcode()
            goto L84
        L83:
            r2 = r1
        L84:
            r0.validate(r2)
            if (r4 == 0) goto La1
            java.lang.String r0 = r4.getEmail()
            if (r0 == 0) goto La1
            int r0 = r0.length()
            if (r0 <= 0) goto La1
            java.lang.String r0 = r4.getEmail()
            boolean r0 = p000.AbstractC19741eO1.isBlank(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto Laf
        La1:
            if (r4 == 0) goto La7
            java.lang.String r1 = r4.getEInvoiceType()
        La7:
            java.lang.String r0 = "SMS_WITH_EMAIL"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto Lbb
        Laf:
            th.co.dtac.android.dtacone.util.validation.mailing.EmailLengthRule r0 = new th.co.dtac.android.dtacone.util.validation.mailing.EmailLengthRule
            r0.<init>()
            java.lang.String r1 = r4.getEmail()
            r0.validate(r1)
        Lbb:
            if (r4 == 0) goto Le1
            java.lang.String r0 = r4.getPhoneNumberContact()
            if (r0 == 0) goto Le1
            int r0 = r0.length()
            if (r0 <= 0) goto Le1
            java.lang.String r0 = r4.getPhoneNumberContact()
            boolean r0 = p000.AbstractC19741eO1.isBlank(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto Le1
            th.co.dtac.android.dtacone.util.validation.self_update.PhoneNumberValidate r0 = new th.co.dtac.android.dtacone.util.validation.self_update.PhoneNumberValidate
            r0.<init>()
            java.lang.String r4 = r4.getPhoneNumberContact()
            r0.validate(r4)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.util.validation.mailing.OneAddressMailingValidate.validate(th.co.dtac.android.dtacone.model.mailing.AddressMailingData):void");
    }
}