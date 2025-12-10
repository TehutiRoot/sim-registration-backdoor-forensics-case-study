package th.p047co.dtac.android.dtacone.view.appOne.mnp.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.activity.OneMnpActivity$navigateToFaceCompareAndLiveness$upPassFormFragment$1 */
/* loaded from: classes10.dex */
public final class C14733x98a08727 extends Lambda implements Function1<UpPassFormFragment, Unit> {
    final /* synthetic */ OneMnpActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14733x98a08727(OneMnpActivity oneMnpActivity) {
        super(1);
        this.this$0 = oneMnpActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormFragment upPassFormFragment) {
        invoke2(upPassFormFragment);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.this$0.setComponentUpPassFrom(fragment);
    }
}