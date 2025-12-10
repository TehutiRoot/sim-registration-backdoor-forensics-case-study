package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "consentResponse", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrPre2PostSummaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPre2PostSummaryFragment.kt\nth/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostSummaryFragment$onViewCreated$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n1#2:656\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostSummaryFragment$onViewCreated$2 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostSummaryFragment$onViewCreated$2 extends Lambda implements Function1<ConsentNonTelcoResponse, Unit> {
    final /* synthetic */ MrtrPre2PostSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostSummaryFragment$onViewCreated$2(MrtrPre2PostSummaryFragment mrtrPre2PostSummaryFragment) {
        super(1);
        this.this$0 = mrtrPre2PostSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelcoResponse consentNonTelcoResponse) {
        invoke2(consentNonTelcoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ConsentNonTelcoResponse consentResponse) {
        Intrinsics.checkNotNullParameter(consentResponse, "consentResponse");
        this.this$0.showSecondaryLoading();
        this.this$0.m5037B(consentResponse);
    }
}