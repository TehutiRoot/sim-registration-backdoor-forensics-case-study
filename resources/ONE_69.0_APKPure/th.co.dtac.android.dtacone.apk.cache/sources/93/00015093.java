package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/StatusResource;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentTelcoFragment$onStart$1$3 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostConsentTelcoFragment$onStart$1$3 extends Lambda implements Function1<Resource<? extends StatusResource>, Unit> {
    final /* synthetic */ MrtrPre2PostConsentTelcoFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostConsentTelcoFragment$onStart$1$3$WhenMappings */
    /* loaded from: classes9.dex */
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
            try {
                iArr[StatusResource.DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostConsentTelcoFragment$onStart$1$3(MrtrPre2PostConsentTelcoFragment mrtrPre2PostConsentTelcoFragment) {
        super(1);
        this.this$0 = mrtrPre2PostConsentTelcoFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends StatusResource> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends StatusResource> resource) {
        Resource<? extends StatusResource> resourceContentIfNotHandled;
        ConsentNonTelcoViewModel consentNonTelcoViewModel;
        MrtrPre2PostViewModel pre2postViewModel;
        MrtrPre2PostViewModel mrtrPre2PostViewModel;
        MrtrPre2PostActivity m5234p;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        MrtrPre2PostConsentTelcoFragment mrtrPre2PostConsentTelcoFragment = this.this$0;
        StatusResource data = resourceContentIfNotHandled.getData();
        int i = data == null ? -1 : WhenMappings.$EnumSwitchMapping$0[data.ordinal()];
        if (i == 1) {
            mrtrPre2PostConsentTelcoFragment.showSecondaryLoading();
        } else if (i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            mrtrPre2PostConsentTelcoFragment.dismissSecondaryLoading();
        } else {
            mrtrPre2PostConsentTelcoFragment.dismissSecondaryLoading();
            consentNonTelcoViewModel = mrtrPre2PostConsentTelcoFragment.f103086i;
            MrtrPre2PostViewModel mrtrPre2PostViewModel2 = null;
            if (consentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                consentNonTelcoViewModel = null;
            }
            ConsentNonTelco value = consentNonTelcoViewModel.getConsentNonTelco().getValue();
            String str = (value == null || (str = value.getMrtrConsentId()) == null) ? "" : "";
            pre2postViewModel = mrtrPre2PostConsentTelcoFragment.getPre2postViewModel();
            if (pre2postViewModel.isShowConsent()) {
                m5234p = mrtrPre2PostConsentTelcoFragment.m5234p();
                m5234p.replaceFragment(MrtrPre2PostConsentNonTelcoFragment.Companion.newInstant(str), Reflection.getOrCreateKotlinClass(MrtrPre2PostConsentNonTelcoFragment.class).getSimpleName());
                return;
            }
            mrtrPre2PostViewModel = mrtrPre2PostConsentTelcoFragment.f103087j;
            if (mrtrPre2PostViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mrtrPre2PostViewModel");
            } else {
                mrtrPre2PostViewModel2 = mrtrPre2PostViewModel;
            }
            mrtrPre2PostViewModel2.uploadImage("", "", "");
        }
    }
}