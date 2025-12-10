package androidx.compose.p003ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapterKt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ComposeViewAdapterKt {
    @NotNull
    public static final ComposableSingletons$ComposeViewAdapterKt INSTANCE = new ComposableSingletons$ComposeViewAdapterKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f109606lambda1 = ComposableLambdaKt.composableLambdaInstance(1432133447, false, ComposableSingletons$ComposeViewAdapterKt$lambda1$1.INSTANCE);
    @NotNull

    /* renamed from: lambda-2  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f109607lambda2 = ComposableLambdaKt.composableLambdaInstance(5797419, false, ComposableSingletons$ComposeViewAdapterKt$lambda2$1.INSTANCE);
    @NotNull

    /* renamed from: lambda-3  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f109608lambda3 = ComposableLambdaKt.composableLambdaInstance(-804738851, false, ComposableSingletons$ComposeViewAdapterKt$lambda3$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$ui_tooling_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m73781getLambda1$ui_tooling_release() {
        return f109606lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$ui_tooling_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m73782getLambda2$ui_tooling_release() {
        return f109607lambda2;
    }

    @NotNull
    /* renamed from: getLambda-3$ui_tooling_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m73783getLambda3$ui_tooling_release() {
        return f109608lambda3;
    }
}