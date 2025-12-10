package th.p047co.dtac.android.dtacone.view.fragment.stv;

import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.databinding.FragmentStvPhoenixBinding;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.stv.StvPhoenixFragment$setUpViews$8 */
/* loaded from: classes9.dex */
public final class StvPhoenixFragment$setUpViews$8 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ StvPhoenixFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvPhoenixFragment$setUpViews$8(StvPhoenixFragment stvPhoenixFragment) {
        super(1);
        this.this$0 = stvPhoenixFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it) {
        FragmentStvPhoenixBinding m3578y;
        StvPhoenixFragment stvPhoenixFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        stvPhoenixFragment.m3610B(it);
        InputMethodManager inputMethodManager = this.this$0.getInputMethodManager();
        m3578y = this.this$0.m3578y();
        inputMethodManager.hideSoftInputFromWindow(m3578y.serviceZTeledittext.getWindowToken(), 0);
    }
}