package th.p047co.dtac.android.dtacone.view.appOne.home.fragment;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpAuthorizationTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "resource", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpAuthorizationTrueCompanyResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.fragment.OneHomeFragment$onStart$6$2 */
/* loaded from: classes10.dex */
public final class OneHomeFragment$onStart$6$2 extends Lambda implements Function1<Resource<? extends OneMnpAuthorizationTrueCompanyResponse>, Unit> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    final /* synthetic */ OneHomeFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.home.fragment.OneHomeFragment$onStart$6$2$WhenMappings */
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
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeFragment$onStart$6$2(OneHomeFragment oneHomeFragment, OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneHomeFragment;
        this.$this_apply = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneMnpAuthorizationTrueCompanyResponse> resource) {
        invoke2((Resource<OneMnpAuthorizationTrueCompanyResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneMnpAuthorizationTrueCompanyResponse> resource) {
        if (resource.getResourceContentIfNotHandled() != null) {
            OneHomeFragment oneHomeFragment = this.this$0;
            OneMnpViewModel oneMnpViewModel = this.$this_apply;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                oneHomeFragment.showSecondaryLoading();
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                oneHomeFragment.dismissSecondaryLoading();
            } else {
                oneHomeFragment.dismissSecondaryLoading();
                oneMnpViewModel.clearImage();
                Intent intent = new Intent(oneHomeFragment.getContext(), OneMnpActivity.class);
                OneMnpAuthorizationTrueCompanyResponse data = resource.getData();
                intent.putExtra(OneMnpActivity.AUTHORIZATION_TRUE_EXTRA, data != null ? data.getData() : null);
                oneHomeFragment.startActivity(intent);
            }
        }
    }
}