package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.viewHolder.FilterHeaderViewHolder$bind$1$1 */
/* loaded from: classes10.dex */
public final class FilterHeaderViewHolder$bind$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function5<Integer, String, Boolean, String, String, Unit> $onSelectFilterItem;
    final /* synthetic */ FilterHeaderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterHeaderViewHolder$bind$1$1(Function5<? super Integer, ? super String, ? super Boolean, ? super String, ? super String, Unit> function5, FilterHeaderViewHolder filterHeaderViewHolder) {
        super(0);
        this.$onSelectFilterItem = function5;
        this.this$0 = filterHeaderViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelectFilterItem.invoke(Integer.valueOf(this.this$0.getAbsoluteAdapterPosition()), "", Boolean.FALSE, "", "");
    }
}