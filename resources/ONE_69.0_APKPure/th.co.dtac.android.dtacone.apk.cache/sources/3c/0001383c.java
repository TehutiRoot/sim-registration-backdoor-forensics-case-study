package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.model.OnePostpaidStatusFlow;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidReserveNumberListFragment$setUpAdapter$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidReserveNumberListFragment$setUpAdapter$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OnePostpaidReserveNumberListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidReserveNumberListFragment$setUpAdapter$1(OnePostpaidReserveNumberListFragment onePostpaidReserveNumberListFragment) {
        super(1);
        this.this$0 = onePostpaidReserveNumberListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, "ต้องการลงทะเบียนเบอร์อื่น")) {
            this.this$0.getViewModel().setHasReserveNumber(false);
            this.this$0.getViewModel().setReserveNumber(null);
        } else {
            this.this$0.getViewModel().setHasReserveNumber(true);
            this.this$0.getViewModel().setReserveNumber(it);
        }
        function1 = this.this$0.f94352l;
        if (function1 != null) {
            function1.invoke(OnePostpaidStatusFlow.OnSuccess);
        }
    }
}