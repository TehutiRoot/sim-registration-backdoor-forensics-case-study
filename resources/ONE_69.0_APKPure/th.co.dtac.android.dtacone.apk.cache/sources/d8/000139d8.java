package th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePre2PostPropositionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePre2PostPropositionAdapter.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/adapter/OnePre2PostPropositionAdapter$onBindViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostPropositionAdapter$onBindViewHolder$2 */
/* loaded from: classes10.dex */
public final class OnePre2PostPropositionAdapter$onBindViewHolder$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ int $position;
    final /* synthetic */ OnePre2PostPropositionAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostPropositionAdapter$onBindViewHolder$2(OnePre2PostPropositionAdapter onePre2PostPropositionAdapter, int i) {
        super(0);
        this.this$0 = onePre2PostPropositionAdapter;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List list;
        List list2;
        list = this.this$0.f94821f;
        if (((PropositionListItem) list.get(this.$position)).getPropositionInfo() != null) {
            OnePre2PostPropositionAdapter onePre2PostPropositionAdapter = this.this$0;
            int i = this.$position;
            Function1<PropositionListItem, Unit> onItemSelected = onePre2PostPropositionAdapter.getOnItemSelected();
            if (onItemSelected != null) {
                list2 = onePre2PostPropositionAdapter.f94821f;
                onItemSelected.invoke(list2.get(i));
            }
        }
    }
}