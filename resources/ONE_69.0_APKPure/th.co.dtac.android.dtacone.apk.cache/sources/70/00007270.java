package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$DialogNavigatorKt {
    @NotNull
    public static final ComposableSingletons$DialogNavigatorKt INSTANCE = new ComposableSingletons$DialogNavigatorKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function3<NavBackStackEntry, Composer, Integer, Unit> f109613lambda1 = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, ComposableSingletons$DialogNavigatorKt$lambda1$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$navigation_compose_release  reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m74096getLambda1$navigation_compose_release() {
        return f109613lambda1;
    }
}