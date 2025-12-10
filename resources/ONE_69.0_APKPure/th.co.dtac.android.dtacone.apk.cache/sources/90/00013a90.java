package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.SummaryItems;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "summaryList", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/view/appOne/pre2post/model/SummaryItems;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSummaryFragment$setupObserve$2$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostSummaryFragment$setupObserve$2$1 extends Lambda implements Function1<ArrayList<SummaryItems>, Unit> {
    final /* synthetic */ OnePre2PostSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSummaryFragment$setupObserve$2$1(OnePre2PostSummaryFragment onePre2PostSummaryFragment) {
        super(1);
        this.this$0 = onePre2PostSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<SummaryItems> arrayList) {
        invoke2(arrayList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ArrayList<SummaryItems> summaryList) {
        OnePre2PostSummaryFragment onePre2PostSummaryFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(summaryList, "summaryList");
        onePre2PostSummaryFragment.m11197w(summaryList);
    }
}