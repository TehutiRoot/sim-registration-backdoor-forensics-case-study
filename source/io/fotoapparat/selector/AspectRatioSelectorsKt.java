package io.fotoapparat.selector;

import androidx.annotation.FloatRange;
import io.fotoapparat.parameter.Resolution;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a[\u0010\b\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00042#\u0010\u0005\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a[\u0010\n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00042#\u0010\u0005\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\t\u001ac\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00042\u0006\u0010\f\u001a\u00020\u000b2#\u0010\u0005\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28850d2 = {"Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/Resolution;", "Lio/fotoapparat/selector/ResolutionSelector;", "Lkotlin/ExtensionFunctionType;", "selector", "", "tolerance", "standardRatio", "(Lkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;", "wideRatio", "", "aspectRatio", "(FLkotlin/jvm/functions/Function1;D)Lkotlin/jvm/functions/Function1;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class AspectRatioSelectorsKt {
    @JvmOverloads
    @NotNull
    public static final Function1<Iterable<Resolution>, Resolution> aspectRatio(float f, @NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return aspectRatio$default(f, selector, 0.0d, 4, null);
    }

    public static /* synthetic */ Function1 aspectRatio$default(float f, Function1 function1, double d, int i, Object obj) {
        if ((i & 4) != 0) {
            d = 0.0d;
        }
        return aspectRatio(f, function1, d);
    }

    @JvmOverloads
    @NotNull
    public static final Function1<Iterable<Resolution>, Resolution> standardRatio(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return standardRatio$default(selector, 0.0d, 2, null);
    }

    public static /* synthetic */ Function1 standardRatio$default(Function1 function1, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return standardRatio(function1, d);
    }

    @JvmOverloads
    @NotNull
    public static final Function1<Iterable<Resolution>, Resolution> wideRatio(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return wideRatio$default(selector, 0.0d, 2, null);
    }

    public static /* synthetic */ Function1 wideRatio$default(Function1 function1, double d, int i, Object obj) {
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        return wideRatio(function1, d);
    }

    @JvmOverloads
    @NotNull
    public static final Function1<Iterable<Resolution>, Resolution> aspectRatio(float f, @NotNull Function1<? super Iterable<Resolution>, Resolution> selector, @FloatRange(from = 0.0d, m64743to = 1.0d) double d) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (0.0d <= d && d <= 1.0d) {
            return SelectorsKt.filtered(selector, new AspectRatioSelectorsKt$aspectRatio$1(f, (f * d) + 1.0E-4d));
        }
        throw new IllegalArgumentException("Tolerance must be between 0.0 and 1.0.");
    }

    @JvmOverloads
    @NotNull
    public static final Function1<Iterable<Resolution>, Resolution> standardRatio(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector, @FloatRange(from = 0.0d, m64743to = 1.0d) double d) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return aspectRatio(1.3333334f, selector, d);
    }

    @JvmOverloads
    @NotNull
    public static final Function1<Iterable<Resolution>, Resolution> wideRatio(@NotNull Function1<? super Iterable<Resolution>, Resolution> selector, @FloatRange(from = 0.0d, m64743to = 1.0d) double d) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return aspectRatio(1.7777778f, selector, d);
    }
}
