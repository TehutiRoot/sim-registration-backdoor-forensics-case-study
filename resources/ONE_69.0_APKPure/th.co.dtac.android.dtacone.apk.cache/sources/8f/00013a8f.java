package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consent", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSummaryFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostSummaryFragment$setupObserve$1 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ OnePre2PostSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSummaryFragment$setupObserve$1(OnePre2PostSummaryFragment onePre2PostSummaryFragment) {
        super(1);
        this.this$0 = onePre2PostSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        this.this$0.m11201s(consent);
    }
}