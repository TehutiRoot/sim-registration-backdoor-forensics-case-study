package io.fotoapparat.selector;

import io.fotoapparat.parameter.FpsRange;
import io.fotoapparat.util.CompareFpsRangeByBounds;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/parameter/FpsRange;", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class PreviewFpsRangeSelectorsKt$highestRangeFps$1 extends Lambda implements Function1<Iterable<? extends FpsRange>, FpsRange> {
    public static final PreviewFpsRangeSelectorsKt$highestRangeFps$1 INSTANCE = new PreviewFpsRangeSelectorsKt$highestRangeFps$1();

    public PreviewFpsRangeSelectorsKt$highestRangeFps$1() {
        super(1);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final FpsRange invoke2(@NotNull Iterable<FpsRange> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "$this$null");
        return (FpsRange) CollectionsKt___CollectionsKt.maxWithOrNull(iterable, CompareFpsRangeByBounds.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ FpsRange invoke(Iterable<? extends FpsRange> iterable) {
        return invoke2((Iterable<FpsRange>) iterable);
    }
}
