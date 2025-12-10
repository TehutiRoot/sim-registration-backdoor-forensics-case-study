package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.activity.customerenquiry.CustomerEnquiryActivity;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.ServiceListFragment$navigateServiceList$1 */
/* loaded from: classes9.dex */
public final class ServiceListFragment$navigateServiceList$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $errMsg;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ String $screenCode;
    final /* synthetic */ ServiceListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceListFragment$navigateServiceList$1(ServiceListFragment serviceListFragment, String str, Intent intent, String str2) {
        super(0);
        this.this$0 = serviceListFragment;
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
        SubscriberInfoViewModel subscriberInfoViewModel;
        IdentityInfoViewModel identityInfoViewModel = this.this$0.f99545o;
        SubscriberInfoViewModel subscriberInfoViewModel2 = null;
        if (identityInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("identityInfoViewModel");
            identityInfoViewModel = null;
        }
        if (identityInfoViewModel.hasAuthorizationScreen(this.$screenCode)) {
            subscriberInfoViewModel = this.this$0.f99546p;
            if (subscriberInfoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
            } else {
                subscriberInfoViewModel2 = subscriberInfoViewModel;
            }
            subscriberInfoViewModel2.clearRepository();
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
        CustomDialogBox customDialogBox = new CustomDialogBox(this.this$0.getContext());
        customDialogBox.setMessage(this.$errMsg);
        customDialogBox.show();
    }
}