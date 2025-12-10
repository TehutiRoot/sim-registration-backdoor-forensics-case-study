package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.adapter.OnePhoenixAdapter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneStvPackageListFragment$setupObserve$1 */
/* loaded from: classes10.dex */
public final class OneStvPackageListFragment$setupObserve$1 extends Lambda implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
    final /* synthetic */ OneStvPackageListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvPackageListFragment$setupObserve$1(OneStvPackageListFragment oneStvPackageListFragment) {
        super(1);
        this.this$0 = oneStvPackageListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
        invoke2((Pair<Integer, Integer>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<Integer, Integer> pair) {
        OnePhoenixAdapter onePhoenixAdapter;
        OnePhoenixAdapter onePhoenixAdapter2;
        onePhoenixAdapter = this.this$0.f97630h;
        OnePhoenixAdapter onePhoenixAdapter3 = null;
        if (onePhoenixAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onePhoenixAdapter");
            onePhoenixAdapter = null;
        }
        onePhoenixAdapter.updateSTVPackageItem(pair.getFirst().intValue());
        onePhoenixAdapter2 = this.this$0.f97630h;
        if (onePhoenixAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onePhoenixAdapter");
        } else {
            onePhoenixAdapter3 = onePhoenixAdapter2;
        }
        onePhoenixAdapter3.notifyItemChanged(pair.getSecond().intValue());
    }
}