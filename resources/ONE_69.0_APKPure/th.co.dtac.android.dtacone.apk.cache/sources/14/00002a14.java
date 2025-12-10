package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$rememberAnchoredDraggableState$1 extends Lambda implements Function1<T, Boolean> {
    public static final AnchoredDraggableKt$rememberAnchoredDraggableState$1 INSTANCE = new AnchoredDraggableKt$rememberAnchoredDraggableState$1();

    public AnchoredDraggableKt$rememberAnchoredDraggableState$1() {
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
        return invoke((AnchoredDraggableKt$rememberAnchoredDraggableState$1) obj);
    }
}