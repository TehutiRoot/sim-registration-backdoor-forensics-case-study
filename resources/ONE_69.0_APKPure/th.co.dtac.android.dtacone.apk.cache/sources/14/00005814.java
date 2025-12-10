package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$TimePickerKt {
    @NotNull
    public static final ComposableSingletons$TimePickerKt INSTANCE = new ComposableSingletons$TimePickerKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f109598lambda1 = ComposableLambdaKt.composableLambdaInstance(1425358052, false, ComposableSingletons$TimePickerKt$lambda1$1.INSTANCE);
    @NotNull

    /* renamed from: lambda-2  reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f109599lambda2 = ComposableLambdaKt.composableLambdaInstance(-1179219109, false, ComposableSingletons$TimePickerKt$lambda2$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$material3_release  reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m70515getLambda1$material3_release() {
        return f109598lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$material3_release  reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m70516getLambda2$material3_release() {
        return f109599lambda2;
    }
}