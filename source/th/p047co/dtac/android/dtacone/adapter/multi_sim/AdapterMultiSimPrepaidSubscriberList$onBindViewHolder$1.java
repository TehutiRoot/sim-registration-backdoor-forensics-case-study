package th.p047co.dtac.android.dtacone.adapter.multi_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "position", "", "sub", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.multi_sim.AdapterMultiSimPrepaidSubscriberList$onBindViewHolder$1 */
/* loaded from: classes7.dex */
public final class AdapterMultiSimPrepaidSubscriberList$onBindViewHolder$1 extends Lambda implements Function2<Integer, String, Unit> {
    final /* synthetic */ AdapterMultiSimPrepaidSubscriberList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterMultiSimPrepaidSubscriberList$onBindViewHolder$1(AdapterMultiSimPrepaidSubscriberList adapterMultiSimPrepaidSubscriberList) {
        super(2);
        this.this$0 = adapterMultiSimPrepaidSubscriberList;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, @NotNull String sub) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(sub, "sub");
        function2 = this.this$0.f81282b;
        function2.invoke(Integer.valueOf(i), sub);
    }
}
