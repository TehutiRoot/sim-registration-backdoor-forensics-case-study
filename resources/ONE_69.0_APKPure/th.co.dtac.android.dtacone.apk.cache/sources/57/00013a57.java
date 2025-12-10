package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.ValidatePackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/ValidatePackageGroupCodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSearchPackageFragment$setupObserve$1$3 */
/* loaded from: classes10.dex */
public final class OnePre2PostSearchPackageFragment$setupObserve$1$3 extends Lambda implements Function1<Resource<? extends ValidatePackageGroupCodeResponse>, Unit> {
    final /* synthetic */ OnePre2PostViewModel $this_apply;
    final /* synthetic */ OnePre2PostSearchPackageFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSearchPackageFragment$setupObserve$1$3$WhenMappings */
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
    public OnePre2PostSearchPackageFragment$setupObserve$1$3(OnePre2PostSearchPackageFragment onePre2PostSearchPackageFragment, OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostSearchPackageFragment;
        this.$this_apply = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends ValidatePackageGroupCodeResponse> resource) {
        invoke2((Resource<ValidatePackageGroupCodeResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<ValidatePackageGroupCodeResponse> resource) {
        Resource<ValidatePackageGroupCodeResponse> resourceContentIfNotHandled;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostSearchPackageFragment onePre2PostSearchPackageFragment = this.this$0;
        OnePre2PostViewModel onePre2PostViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i == 1) {
            ValidatePackageGroupCodeResponse data = resourceContentIfNotHandled.getData();
            if (data != null) {
                onePre2PostViewModel.getPackageDetailRetailer(data.getPackageGroupCode());
            }
        } else if (i == 2) {
            onePre2PostSearchPackageFragment.showLoading();
        } else if (i != 3) {
        } else {
            onePre2PostSearchPackageFragment.dismissLoading();
        }
    }
}