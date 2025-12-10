package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.activity.OneRetailerProfileUpdateActivity;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.OneRetailerProfileUpdateThemeColorModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileContactInfoFragment$setupObserve$2 */
/* loaded from: classes10.dex */
public final class OneRetailerProfileContactInfoFragment$setupObserve$2 extends Lambda implements Function1<Resource<? extends Boolean>, Unit> {
    final /* synthetic */ OneRetailerProfileContactInfoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileContactInfoFragment$setupObserve$2$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRetailerProfileContactInfoFragment$setupObserve$2(OneRetailerProfileContactInfoFragment oneRetailerProfileContactInfoFragment) {
        super(1);
        this.this$0 = oneRetailerProfileContactInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Boolean> resource) {
        invoke2((Resource<Boolean>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Boolean> resource) {
        Resource<Boolean> resourceContentIfNotHandled;
        OneRetailerProfileUpdateActivity m10143n;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        final OneRetailerProfileContactInfoFragment oneRetailerProfileContactInfoFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                oneRetailerProfileContactInfoFragment.showLoading();
                return;
            } else if (i != 3) {
                return;
            } else {
                oneRetailerProfileContactInfoFragment.dismissLoading();
                return;
            }
        }
        oneRetailerProfileContactInfoFragment.dismissLoading();
        m10143n = oneRetailerProfileContactInfoFragment.m10143n();
        OneRetailerProfileUpdateThemeColorModel oneRetailerProfileUpdateThemeColorModel = m10143n.getOneRetailerProfileUpdateThemeColorModel();
        Context requireContext = oneRetailerProfileContactInfoFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        new OneDialogSuccess(requireContext, new OneDialogSuccess.Callback() { // from class: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.fragment.OneRetailerProfileContactInfoFragment$setupObserve$2$1$1$dialogSuccess$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess.Callback
            public void onButtonClick() {
                OneRetailerProfileUpdateActivity m10143n2;
                m10143n2 = OneRetailerProfileContactInfoFragment.this.m10143n();
                Intent intent = new Intent();
                intent.putExtra(OneRetailerProfileContactInfoFragment.UPDATE_CONTACT_INFO_EXTRA, OneRetailerProfileContactInfoFragment.UPDATE_CONTACT_INFO_EXTRA);
                m10143n2.setResult(-1, intent);
                m10143n2.finish();
            }
        }, R.string.one_retailer_profile_update_contract_success_title, oneRetailerProfileUpdateThemeColorModel.getDialogSuccessIcon(), oneRetailerProfileUpdateThemeColorModel.getButtonBackground()).show();
    }
}