package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.adapter.OnePre2PostSummaryListAdapter;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewHolder.SummaryReferenceDocItemViewHolder$bind$1$2 */
/* loaded from: classes10.dex */
public final class SummaryReferenceDocItemViewHolder$bind$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePre2PostSummaryListAdapter.OnClickListener $onClickListener;
    final /* synthetic */ SummaryReferenceDocItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryReferenceDocItemViewHolder$bind$1$2(OnePre2PostSummaryListAdapter.OnClickListener onClickListener, SummaryReferenceDocItemViewHolder summaryReferenceDocItemViewHolder) {
        super(0);
        this.$onClickListener = onClickListener;
        this.this$0 = summaryReferenceDocItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePre2PostSummaryListAdapter.OnClickListener onClickListener = this.$onClickListener;
        if (onClickListener != null) {
            onClickListener.onReferenceDocItemClick(this.this$0.getAbsoluteAdapterPosition());
        }
    }
}