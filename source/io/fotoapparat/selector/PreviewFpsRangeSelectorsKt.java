package io.fotoapparat.selector;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.FpsRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\t\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a*\u0010\n\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\f\u0010\u000b\u001a*\u0010\r\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000b\u001a*\u0010\u000e\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000e\u0010\u000b\u001a*\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000f\u0010\u000b\u001a*\u0010\u0010\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0010\u0010\u000b\u001a,\u0010\u0011\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000b\u001a,\u0010\u0012\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0002\b\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000b\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015*<\u0010\u0016\"\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u00062\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u0006¨\u0006\u0017"}, m28850d2 = {"", "fps", "Lkotlin/Function1;", "", "Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/selector/FpsRangeSelector;", "Lkotlin/ExtensionFunctionType;", "containsFps", "(F)Lkotlin/jvm/functions/Function1;", "exactFixedFps", "highestFps", "()Lkotlin/jvm/functions/Function1;", "highestNonFixedFps", "highestFixedFps", "lowestFps", "lowestNonFixedFps", "lowestFixedFps", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "", OperatorName.CURVE_TO, "(F)I", "FpsRangeSelector", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PreviewFpsRangeSelectorsKt {
    /* renamed from: a */
    public static final Function1 m30477a() {
        return PreviewFpsRangeSelectorsKt$highestRangeFps$1.INSTANCE;
    }

    /* renamed from: b */
    public static final Function1 m30476b() {
        return PreviewFpsRangeSelectorsKt$lowestRangeFps$1.INSTANCE;
    }

    /* renamed from: c */
    public static final int m30475c(float f) {
        return (int) (f * 1000);
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> containsFps(float f) {
        return SelectorsKt.firstAvailable(exactFixedFps(f), SelectorsKt.filtered(highestNonFixedFps(), new PreviewFpsRangeSelectorsKt$containsFps$1(f)));
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> exactFixedFps(float f) {
        return SelectorsKt.filtered(highestFixedFps(), new PreviewFpsRangeSelectorsKt$exactFixedFps$1(f));
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> highestFixedFps() {
        return SelectorsKt.filtered(m30477a(), PreviewFpsRangeSelectorsKt$highestFixedFps$1.INSTANCE);
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> highestFps() {
        return SelectorsKt.firstAvailable(highestNonFixedFps(), highestFixedFps());
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> highestNonFixedFps() {
        return SelectorsKt.filtered(m30477a(), PreviewFpsRangeSelectorsKt$highestNonFixedFps$1.INSTANCE);
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> lowestFixedFps() {
        return SelectorsKt.filtered(m30476b(), PreviewFpsRangeSelectorsKt$lowestFixedFps$1.INSTANCE);
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> lowestFps() {
        return SelectorsKt.firstAvailable(lowestNonFixedFps(), lowestFixedFps());
    }

    @NotNull
    public static final Function1<Iterable<FpsRange>, FpsRange> lowestNonFixedFps() {
        return SelectorsKt.filtered(m30476b(), PreviewFpsRangeSelectorsKt$lowestNonFixedFps$1.INSTANCE);
    }
}
