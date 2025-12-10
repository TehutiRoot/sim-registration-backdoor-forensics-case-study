package th.p047co.dtac.android.dtacone.view.fragment.multi_sim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "position", "", "sub", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimPrepaidScanBarcodeFragment$initView$1 */
/* loaded from: classes9.dex */
public final class MrtrMultiSimPrepaidScanBarcodeFragment$initView$1 extends Lambda implements Function2<Integer, String, Unit> {
    final /* synthetic */ MrtrMultiSimPrepaidScanBarcodeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMultiSimPrepaidScanBarcodeFragment$initView$1(MrtrMultiSimPrepaidScanBarcodeFragment mrtrMultiSimPrepaidScanBarcodeFragment) {
        super(2);
        this.this$0 = mrtrMultiSimPrepaidScanBarcodeFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, @NotNull String sub) {
        Intrinsics.checkNotNullParameter(sub, "sub");
        this.this$0.m4392q(i, sub);
    }
}