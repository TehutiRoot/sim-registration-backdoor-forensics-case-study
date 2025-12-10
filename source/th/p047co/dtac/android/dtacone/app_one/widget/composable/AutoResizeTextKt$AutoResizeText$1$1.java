package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.AutoResizeTextKt$AutoResizeText$1$1 */
/* loaded from: classes7.dex */
public final class AutoResizeTextKt$AutoResizeText$1$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ MutableState<Boolean> $readyToDraw$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoResizeTextKt$AutoResizeText$1$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$readyToDraw$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
        boolean m19847c;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        m19847c = AutoResizeTextKt.m19847c(this.$readyToDraw$delegate);
        if (m19847c) {
            drawWithContent.drawContent();
        }
    }
}
