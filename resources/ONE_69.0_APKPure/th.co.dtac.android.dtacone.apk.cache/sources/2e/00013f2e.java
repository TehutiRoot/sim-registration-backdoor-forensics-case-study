package th.p047co.dtac.android.dtacone.view.appOne.staff.dialog;

import android.view.inputmethod.InputMethodManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffCreditLimitDialog_MembersInjector */
/* loaded from: classes10.dex */
public final class OneStaffCreditLimitDialog_MembersInjector implements MembersInjector<OneStaffCreditLimitDialog> {

    /* renamed from: a */
    public final Provider f97260a;

    public OneStaffCreditLimitDialog_MembersInjector(Provider<InputMethodManager> provider) {
        this.f97260a = provider;
    }

    public static MembersInjector<OneStaffCreditLimitDialog> create(Provider<InputMethodManager> provider) {
        return new OneStaffCreditLimitDialog_MembersInjector(provider);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffCreditLimitDialog.inputMethodManager")
    public static void injectInputMethodManager(OneStaffCreditLimitDialog oneStaffCreditLimitDialog, InputMethodManager inputMethodManager) {
        oneStaffCreditLimitDialog.inputMethodManager = inputMethodManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OneStaffCreditLimitDialog oneStaffCreditLimitDialog) {
        injectInputMethodManager(oneStaffCreditLimitDialog, (InputMethodManager) this.f97260a.get());
    }
}