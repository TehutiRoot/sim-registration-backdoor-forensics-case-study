package io.fotoapparat.parameter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlin/ranges/IntRange;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class SupportedParameters$jpegQualityRange$2 extends Lambda implements Function0<IntRange> {
    public static final SupportedParameters$jpegQualityRange$2 INSTANCE = new SupportedParameters$jpegQualityRange$2();

    public SupportedParameters$jpegQualityRange$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final IntRange invoke() {
        return new IntRange(0, 100);
    }
}
