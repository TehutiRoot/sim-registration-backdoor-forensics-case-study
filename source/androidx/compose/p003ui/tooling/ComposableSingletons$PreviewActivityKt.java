package androidx.compose.p003ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivityKt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$PreviewActivityKt {
    @NotNull
    public static final ComposableSingletons$PreviewActivityKt INSTANCE = new ComposableSingletons$PreviewActivityKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f109305lambda1 = ComposableLambdaKt.composableLambdaInstance(38142554, false, ComposableSingletons$PreviewActivityKt$lambda1$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$ui_tooling_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m73600getLambda1$ui_tooling_release() {
        return f109305lambda1;
    }
}
