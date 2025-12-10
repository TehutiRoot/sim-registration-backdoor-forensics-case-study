package th.p047co.dtac.android.dtacone.util.validation.staff;

import th.p047co.dtac.android.dtacone.model.staff.AddNewStaffCollection;
import th.p047co.dtac.android.dtacone.util.validation.Validator;
import th.p047co.dtac.android.dtacone.util.validation.password.PasswordValidator;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.staff.StaffValidator */
/* loaded from: classes8.dex */
public class StaffValidator extends Validator<AddNewStaffCollection> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.Validator
    public boolean validate(AddNewStaffCollection addNewStaffCollection) {
        new PasswordValidator().validate(addNewStaffCollection);
        new PhoneNumberValidator().validate(addNewStaffCollection.getPhoneNumber());
        return super.validate((StaffValidator) addNewStaffCollection);
    }
}