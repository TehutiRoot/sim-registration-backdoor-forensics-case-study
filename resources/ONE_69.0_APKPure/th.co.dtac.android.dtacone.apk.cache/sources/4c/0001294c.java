package th.p047co.dtac.android.dtacone.view.activity.upPass.compose;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.WindowCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.upPass.compose.UpPassDemoTopBarKt$UpPassDemoTopBar$2 */
/* loaded from: classes10.dex */
public final class UpPassDemoTopBarKt$UpPassDemoTopBar$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $lightMode;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassDemoTopBarKt$UpPassDemoTopBar$2(View view, boolean z) {
        super(0);
        this.$view = view;
        this.$lightMode = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Context context = this.$view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        WindowCompat.getInsetsController(((Activity) context).getWindow(), this.$view).setAppearanceLightStatusBars(this.$lightMode);
    }
}