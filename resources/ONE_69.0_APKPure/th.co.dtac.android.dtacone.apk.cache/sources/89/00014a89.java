package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "screenCode", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.ServiceListFragment$onCreate$1 */
/* loaded from: classes9.dex */
public final class ServiceListFragment$onCreate$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ ServiceListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceListFragment$onCreate$1(ServiceListFragment serviceListFragment) {
        super(1);
        this.this$0 = serviceListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String screenCode) {
        Intrinsics.checkNotNullParameter(screenCode, "screenCode");
        this.this$0.m8323m(screenCode);
    }
}