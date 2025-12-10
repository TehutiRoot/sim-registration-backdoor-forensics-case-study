package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostGetFormsResponse;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.activity.OnePre2PostActivity;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSignatureFragment;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGetFormsResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentNonTelcoFragment$setupObserve$1$6 */
/* loaded from: classes10.dex */
public final class OnePre2PostConsentNonTelcoFragment$setupObserve$1$6 extends Lambda implements Function1<Resource<? extends OnePre2PostGetFormsResponse>, Unit> {
    final /* synthetic */ OnePre2PostViewModel $this_apply;
    final /* synthetic */ OnePre2PostConsentNonTelcoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.consent.OnePre2PostConsentNonTelcoFragment$setupObserve$1$6$WhenMappings */
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
    public OnePre2PostConsentNonTelcoFragment$setupObserve$1$6(OnePre2PostConsentNonTelcoFragment onePre2PostConsentNonTelcoFragment, OnePre2PostViewModel onePre2PostViewModel) {
        super(1);
        this.this$0 = onePre2PostConsentNonTelcoFragment;
        this.$this_apply = onePre2PostViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OnePre2PostGetFormsResponse> resource) {
        invoke2((Resource<OnePre2PostGetFormsResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OnePre2PostGetFormsResponse> resource) {
        Resource<OnePre2PostGetFormsResponse> resourceContentIfNotHandled;
        OnePre2PostActivity m11143o;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OnePre2PostConsentNonTelcoFragment onePre2PostConsentNonTelcoFragment = this.this$0;
        OnePre2PostViewModel onePre2PostViewModel = this.$this_apply;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            onePre2PostConsentNonTelcoFragment.dismissLoading();
            return;
        }
        onePre2PostConsentNonTelcoFragment.dismissLoading();
        onePre2PostViewModel.clearSignature();
        m11143o = onePre2PostConsentNonTelcoFragment.m11143o();
        m11143o.replaceFragment(OnePre2PostSignatureFragment.Companion.newInstance(), OnePre2PostSignatureFragment.class.getSimpleName());
    }
}