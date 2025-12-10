package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$SnackbarHostKt {
    @NotNull
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function3<SnackbarData, Composer, Integer, Unit> f109594lambda1 = ComposableLambdaKt.composableLambdaInstance(818736383, false, ComposableSingletons$SnackbarHostKt$lambda1$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$material3_release  reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m70511getLambda1$material3_release() {
        return f109594lambda1;
    }
}