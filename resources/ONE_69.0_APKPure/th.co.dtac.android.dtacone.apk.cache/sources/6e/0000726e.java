package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$ComposeNavigatorKt {
    @NotNull
    public static final ComposableSingletons$ComposeNavigatorKt INSTANCE = new ComposableSingletons$ComposeNavigatorKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> f109612lambda1 = ComposableLambdaKt.composableLambdaInstance(127448943, false, ComposableSingletons$ComposeNavigatorKt$lambda1$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$navigation_compose_release  reason: not valid java name */
    public final Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> m74095getLambda1$navigation_compose_release() {
        return f109612lambda1;
    }
}