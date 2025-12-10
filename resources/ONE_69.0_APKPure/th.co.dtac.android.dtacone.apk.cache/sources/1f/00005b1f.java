package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SwipeableV2Kt$rememberSwipeableV2State$1 extends Lambda implements Function1<T, Boolean> {
    public static final SwipeableV2Kt$rememberSwipeableV2State$1 INSTANCE = new SwipeableV2Kt$rememberSwipeableV2State$1();

    public SwipeableV2Kt$rememberSwipeableV2State$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull T it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((SwipeableV2Kt$rememberSwipeableV2State$1) obj);
    }
}