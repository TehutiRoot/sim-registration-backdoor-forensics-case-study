package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.content.Context;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.ComposeSignatureCustomKt$captureBitmap$1 */
/* loaded from: classes9.dex */
public final class ComposeSignatureCustomKt$captureBitmap$1 extends Lambda implements Function1<Context, ComposeView> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ComposeView $composeView;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposeSignatureCustomKt$captureBitmap$1(ComposeView composeView, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(1);
        this.$composeView = composeView;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ComposeView invoke(@NotNull Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposeView composeView = this.$composeView;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1896970394, true, new ComposeSignatureCustomKt$captureBitmap$1$1$1(this.$content, this.$$changed)));
        return composeView;
    }
}