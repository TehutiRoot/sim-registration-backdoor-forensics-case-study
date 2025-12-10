package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRowKt$SegmentedButton$2 */
/* loaded from: classes7.dex */
public final class OneSegmentedButtonRowKt$SegmentedButton$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public static final OneSegmentedButtonRowKt$SegmentedButton$2 INSTANCE = new OneSegmentedButtonRowKt$SegmentedButton$2();

    public OneSegmentedButtonRowKt$SegmentedButton$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m73082setRolekuIjeqM(semantics, Role.Companion.m73073getRadioButtono7Vup1c());
    }
}
