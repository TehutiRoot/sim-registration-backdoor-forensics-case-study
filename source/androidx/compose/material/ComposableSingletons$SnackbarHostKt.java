package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {
    @NotNull
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function3<SnackbarData, Composer, Integer, Unit> f109261lambda1 = ComposableLambdaKt.composableLambdaInstance(996639038, false, ComposableSingletons$SnackbarHostKt$lambda1$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$material_release  reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m70000getLambda1$material_release() {
        return f109261lambda1;
    }
}
