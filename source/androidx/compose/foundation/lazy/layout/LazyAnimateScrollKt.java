package androidx.compose.foundation.lazy.layout;

import androidx.compose.p003ui.unit.C3641Dp;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0017\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0017\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "", "animateScrollToItem", "(Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "TargetDistance", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "BoundDistance", OperatorName.CURVE_TO, "MinimumDistance", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n154#2:269\n154#2:270\n154#2:271\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n34#1:269\n35#1:270\n36#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt {

    /* renamed from: a */
    public static final float f13608a = C3641Dp.m73658constructorimpl(2500);

    /* renamed from: b */
    public static final float f13609b = C3641Dp.m73658constructorimpl((float) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);

    /* renamed from: c */
    public static final float f13610c = C3641Dp.m73658constructorimpl(50);

    @Nullable
    public static final Object animateScrollToItem(@NotNull LazyAnimateScrollScope lazyAnimateScrollScope, int i, int i2, @NotNull Continuation<? super Unit> continuation) {
        Object scroll = lazyAnimateScrollScope.scroll(new LazyAnimateScrollKt$animateScrollToItem$2(i, lazyAnimateScrollScope, i2, null), continuation);
        if (scroll == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return scroll;
        }
        return Unit.INSTANCE;
    }
}
