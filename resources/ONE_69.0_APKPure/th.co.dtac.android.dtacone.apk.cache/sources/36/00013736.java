package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePostpaidValidationSpecialPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidValidationSpecialPackageFragment.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/OnePostpaidValidationSpecialPackageFragment$navigateServiceList$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidValidationSpecialPackageFragment$navigateServiceList$1 */
/* loaded from: classes10.dex */
public final class C14911xcc59f1b3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $errMsg;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ String $screenCode;
    final /* synthetic */ OnePostpaidValidationSpecialPackageFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14911xcc59f1b3(OnePostpaidValidationSpecialPackageFragment onePostpaidValidationSpecialPackageFragment, String str, Intent intent, String str2) {
        super(0);
        this.this$0 = onePostpaidValidationSpecialPackageFragment;
        this.$screenCode = str;
        this.$intent = intent;
        this.$errMsg = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.this$0.getViewModelPostpaidValidation().hasAuthorizationScreen(this.$screenCode)) {
            this.this$0.getViewModelPostpaidValidation().clearRepository();
            Bundle bundle = new Bundle();
            bundle.putString(CustomerEnquiryActivity.RESULT, CustomerEnquiryActivity.MENU_HOME);
            this.$intent.putExtras(bundle);
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                Intent intent = this.$intent;
                activity.setResult(-1, intent);
                activity.finish();
                activity.startActivity(intent);
                return;
            }
            return;
        }
        Context context = this.this$0.getContext();
        OneCustomDialogBox oneCustomDialogBox = context != null ? new OneCustomDialogBox(context) : null;
        if (oneCustomDialogBox != null) {
            oneCustomDialogBox.setMessage(this.$errMsg);
            oneCustomDialogBox.show();
        }
    }
}