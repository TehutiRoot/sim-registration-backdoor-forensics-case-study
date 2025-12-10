package th.p047co.dtac.android.dtacone.view.appOne.topup.fragment;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.topup.activity.OneTopupActivity;
import th.p047co.dtac.android.dtacone.view.appOne.topup.model.TopupThemeColorModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupConfirmFragment$setUpViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneTopupConfirmFragment$setUpViewModel$1$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneTopupConfirmFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopupConfirmFragment$setUpViewModel$1$1(OneTopupConfirmFragment oneTopupConfirmFragment) {
        super(1);
        this.this$0 = oneTopupConfirmFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        OneTopupActivity m9330D;
        if (resource != null) {
            final OneTopupConfirmFragment oneTopupConfirmFragment = this.this$0;
            if (resource.getStatus() == StatusResource.SUCCESS) {
                if (resource.getData() != null) {
                    m9330D = oneTopupConfirmFragment.m9330D();
                    TopupThemeColorModel topupThemeColorModel = m9330D.getTopupThemeColorModel();
                    Context requireContext = oneTopupConfirmFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                    new OneDialogSuccess(requireContext, new OneDialogSuccess.Callback() { // from class: th.co.dtac.android.dtacone.view.appOne.topup.fragment.OneTopupConfirmFragment$setUpViewModel$1$1$1$1$1$dialogSuccess$1
                        @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess.Callback
                        public void onButtonClick() {
                            OneTopupConfirmFragment.this.requireActivity().finish();
                        }
                    }, R.string.completed, topupThemeColorModel.getDialogSuccessIcon(), topupThemeColorModel.getButtonBackground()).show();
                }
            } else if (resource.getStatus() == StatusResource.ERROR) {
                String message = resource.getMessage();
                if (message != null && message.length() != 0) {
                    Context requireContext2 = oneTopupConfirmFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                    OneErrorDialogBox oneErrorDialogBox = new OneErrorDialogBox(requireContext2, (OneErrorDialogBox.Callback) null, 2, (DefaultConstructorMarker) null);
                    oneErrorDialogBox.setMessage(resource.getMessage());
                    oneErrorDialogBox.show();
                }
                oneTopupConfirmFragment.getVPinCode().setText("");
            }
        }
    }
}