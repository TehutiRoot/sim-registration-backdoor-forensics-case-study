package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldKt$OneOutlineTextFieldPreview$1$2$1 */
/* loaded from: classes7.dex */
public final class OneOutlineTextFieldKt$OneOutlineTextFieldPreview$1$2$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ MutableState<String> $value$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOutlineTextFieldKt$OneOutlineTextFieldPreview$1$2$1(MutableState<String> mutableState) {
        super(1);
        this.$value$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneOutlineTextFieldKt.m19819e(this.$value$delegate, it);
    }
}
