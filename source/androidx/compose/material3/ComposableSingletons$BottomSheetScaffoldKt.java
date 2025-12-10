package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    @NotNull
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f109277lambda1 = ComposableLambdaKt.composableLambdaInstance(481988104, false, ComposableSingletons$BottomSheetScaffoldKt$lambda1$1.INSTANCE);
    @NotNull

    /* renamed from: lambda-2  reason: not valid java name */
    public static Function3<SnackbarHostState, Composer, Integer, Unit> f109278lambda2 = ComposableLambdaKt.composableLambdaInstance(-928941170, false, ComposableSingletons$BottomSheetScaffoldKt$lambda2$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$material3_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m70314getLambda1$material3_release() {
        return f109277lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$material3_release  reason: not valid java name */
    public final Function3<SnackbarHostState, Composer, Integer, Unit> m70315getLambda2$material3_release() {
        return f109278lambda2;
    }
}
