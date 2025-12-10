package io.fotoapparat.selector;

import io.fotoapparat.parameter.FpsRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/parameter/FpsRange;", "invoke", "(Lio/fotoapparat/parameter/FpsRange;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class PreviewFpsRangeSelectorsKt$lowestFixedFps$1 extends Lambda implements Function1<FpsRange, Boolean> {
    public static final PreviewFpsRangeSelectorsKt$lowestFixedFps$1 INSTANCE = new PreviewFpsRangeSelectorsKt$lowestFixedFps$1();

    public PreviewFpsRangeSelectorsKt$lowestFixedFps$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull FpsRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.isFixed());
    }
}
