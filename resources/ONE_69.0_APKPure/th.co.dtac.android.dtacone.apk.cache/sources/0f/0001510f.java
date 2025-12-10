package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSummaryFragment$onViewCreated$3$1 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostSummaryFragment$onViewCreated$3$1 extends Lambda implements Function1<Resource<? extends Pair<? extends Boolean, ? extends Integer>>, Unit> {
    final /* synthetic */ MrtrPre2PostSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostSummaryFragment$onViewCreated$3$1(MrtrPre2PostSummaryFragment mrtrPre2PostSummaryFragment) {
        super(1);
        this.this$0 = mrtrPre2PostSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends Pair<? extends Boolean, ? extends Integer>> resource) {
        invoke2((Resource<Pair<Boolean, Integer>>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<Pair<Boolean, Integer>> resource) {
        Resource<Pair<Boolean, Integer>> resourceContentIfNotHandled;
        ConsentNonTelcoViewModel consentNonTelcoViewModel;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        MrtrPre2PostSummaryFragment mrtrPre2PostSummaryFragment = this.this$0;
        Pair<Boolean, Integer> data = resourceContentIfNotHandled.getData();
        if (mrtrPre2PostSummaryFragment.getPre2postViewModel().getReferenceDoc().size() >= (data != null ? data.getSecond().intValue() : 2)) {
            consentNonTelcoViewModel = mrtrPre2PostSummaryFragment.f103367q0;
            if (consentNonTelcoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelConsent");
                consentNonTelcoViewModel = null;
            }
            consentNonTelcoViewModel.getConsentNonTelco("PRE2POST");
            return;
        }
        mrtrPre2PostSummaryFragment.m5027L();
    }
}