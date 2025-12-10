package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment$showMrtrErrorDialogConfirm$dialog$1$1$onClickRightButton$1 */
/* loaded from: classes9.dex */
public final class C16030x2c21ad50 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ESimInProgressFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16030x2c21ad50(ESimInProgressFragment eSimInProgressFragment) {
        super(0);
        this.this$0 = eSimInProgressFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ESimInProgressFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.navigateNext();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Handler handler = new Handler();
        final ESimInProgressFragment eSimInProgressFragment = this.this$0;
        handler.postDelayed(new Runnable() { // from class: th.co.dtac.android.dtacone.view.fragment.eSIM.e
            @Override // java.lang.Runnable
            public final void run() {
                C16030x2c21ad50.invoke$lambda$0(ESimInProgressFragment.this);
            }
        }, 300L);
    }
}