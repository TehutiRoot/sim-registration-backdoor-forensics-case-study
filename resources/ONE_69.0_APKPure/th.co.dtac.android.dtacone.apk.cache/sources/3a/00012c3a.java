package th.p047co.dtac.android.dtacone.view.appOne.change_password.fragment;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordResponse;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OnePasswordDialogSuccess;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.change_password.activity.OneChangePasswordActivity;
import th.p047co.dtac.android.dtacone.view.appOne.change_password.model.ChangePasswordThemeColorModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment$initViewModel$1$1 */
/* loaded from: classes10.dex */
public final class OneInputChangePasswordFragment$initViewModel$1$1 extends Lambda implements Function1<Resource<? extends ChangePasswordResponse>, Unit> {
    final /* synthetic */ OneInputChangePasswordFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment$initViewModel$1$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputChangePasswordFragment$initViewModel$1$1(OneInputChangePasswordFragment oneInputChangePasswordFragment) {
        super(1);
        this.this$0 = oneInputChangePasswordFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ChangePasswordResponse> resource) {
        invoke2((Resource<ChangePasswordResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ChangePasswordResponse> resource) {
        OneChangePasswordActivity m15281q;
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            this.this$0.showSecondaryLoading();
        } else if (i != 2) {
            this.this$0.dismissSecondaryLoading();
        } else {
            this.this$0.dismissSecondaryLoading();
            m15281q = this.this$0.m15281q();
            ChangePasswordThemeColorModel changePasswordThemeColorModel = m15281q.getChangePasswordThemeColorModel();
            final OneInputChangePasswordFragment oneInputChangePasswordFragment = this.this$0;
            Context requireContext = oneInputChangePasswordFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OnePasswordDialogSuccess onePasswordDialogSuccess = new OnePasswordDialogSuccess(requireContext, new OnePasswordDialogSuccess.Callback() { // from class: th.co.dtac.android.dtacone.view.appOne.change_password.fragment.OneInputChangePasswordFragment$initViewModel$1$1$1$dialogSuccess$1
                @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OnePasswordDialogSuccess.Callback
                public void onButtonClick() {
                    OneInputChangePasswordFragment.this.requireActivity().finish();
                }
            }, changePasswordThemeColorModel.getDialogSuccessIcon(), changePasswordThemeColorModel.getButtonBackground());
            String string = oneInputChangePasswordFragment.getString(R.string.password_title_success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.password_title_success)");
            onePasswordDialogSuccess.setTextTitle(string);
            String string2 = oneInputChangePasswordFragment.getString(R.string.change_password_sub_title_success);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.chang…ssword_sub_title_success)");
            onePasswordDialogSuccess.setTextSubTitle(string2);
            onePasswordDialogSuccess.show();
        }
    }
}