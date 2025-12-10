package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class ModalBottomSheet_androidKt$rememberModalBottomSheetState$1 extends Lambda implements Function1<SheetValue, Boolean> {
    public static final ModalBottomSheet_androidKt$rememberModalBottomSheetState$1 INSTANCE = new ModalBottomSheet_androidKt$rememberModalBottomSheetState$1();

    public ModalBottomSheet_androidKt$rememberModalBottomSheetState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
