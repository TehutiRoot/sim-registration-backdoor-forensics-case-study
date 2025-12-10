package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.fragment;

import android.content.Context;
import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.fragment.OneOnlineRegistrationInputNumberFragment$setupView$1 */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationInputNumberFragment$setupView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneOnlineRegistrationInputNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegistrationInputNumberFragment$setupView$1(OneOnlineRegistrationInputNumberFragment oneOnlineRegistrationInputNumberFragment) {
        super(0);
        this.this$0 = oneOnlineRegistrationInputNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneEditText oneEditText;
        String str;
        String str2;
        OneOnlineRegisterViewModel viewModel;
        String str3;
        OneOnlineRegisterViewModel viewModel2;
        OneOnlineRegisterViewModel viewModel3;
        String str4;
        OneOnlineRegisterViewModel viewModel4;
        String str5;
        String obj;
        oneEditText = this.this$0.f92694m;
        String str6 = null;
        if (oneEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saleCodeEditText");
            oneEditText = null;
        }
        Editable text = oneEditText.getText();
        if (text != null && (obj = text.toString()) != null) {
            str6 = StringsKt__StringsKt.trim(obj).toString();
        }
        Context context = this.this$0.getContext();
        if (context != null) {
            OneOnlineRegistrationInputNumberFragment oneOnlineRegistrationInputNumberFragment = this.this$0;
            str = oneOnlineRegistrationInputNumberFragment.f92699r;
            if (Intrinsics.areEqual(str, Constant.OnlineRegistration.PARTNER)) {
                viewModel4 = oneOnlineRegistrationInputNumberFragment.getViewModel();
                str5 = oneOnlineRegistrationInputNumberFragment.f92700s;
                str2 = viewModel4.validateInputPhoneNumber(str5, context);
            } else if (Intrinsics.areEqual(str, Constant.OnlineRegistration.SALE)) {
                viewModel = oneOnlineRegistrationInputNumberFragment.getViewModel();
                str2 = viewModel.validateInputSaleCode(context, str6 == null ? "" : str6);
            } else {
                str2 = "";
            }
            if (str2.length() == 0) {
                oneOnlineRegistrationInputNumberFragment.hideKeyboard();
                str3 = oneOnlineRegistrationInputNumberFragment.f92699r;
                if (Intrinsics.areEqual(str3, Constant.OnlineRegistration.PARTNER)) {
                    viewModel3 = oneOnlineRegistrationInputNumberFragment.getViewModel();
                    str4 = oneOnlineRegistrationInputNumberFragment.f92700s;
                    viewModel3.validateMobileRegister(str4);
                    return;
                } else if (Intrinsics.areEqual(str3, Constant.OnlineRegistration.SALE)) {
                    viewModel2 = oneOnlineRegistrationInputNumberFragment.getViewModel();
                    if (str6 == null) {
                        str6 = "";
                    }
                    viewModel2.checkRSE(str6);
                    return;
                } else {
                    return;
                }
            }
            OneCustomDialogBox oneCustomDialogBox = new OneCustomDialogBox(context);
            oneCustomDialogBox.setMessage(str2);
            oneCustomDialogBox.setError();
            oneCustomDialogBox.show();
        }
    }
}