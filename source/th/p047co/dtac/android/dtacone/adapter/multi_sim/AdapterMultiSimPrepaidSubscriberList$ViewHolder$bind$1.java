package th.p047co.dtac.android.dtacone.adapter.multi_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.multi_sim.AdapterMultiSimPrepaidSubscriberList$ViewHolder$bind$1 */
/* loaded from: classes7.dex */
public final class AdapterMultiSimPrepaidSubscriberList$ViewHolder$bind$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function2<Integer, String, Unit> $onRemove;
    final /* synthetic */ int $position;
    final /* synthetic */ String $subscriber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdapterMultiSimPrepaidSubscriberList$ViewHolder$bind$1(Function2<? super Integer, ? super String, Unit> function2, int i, String str) {
        super(0);
        this.$onRemove = function2;
        this.$position = i;
        this.$subscriber = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRemove.invoke(Integer.valueOf(this.$position), this.$subscriber);
    }
}
