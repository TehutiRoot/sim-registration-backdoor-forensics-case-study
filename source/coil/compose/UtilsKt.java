package coil.compose;

import android.content.Context;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Scale;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001f\u001a\u00020\u001b*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\"\u001a\u00020\u001b*\u00020\u001a2\u0006\u0010 \u001a\u00020\u001bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001e\u001a\"\u0010%\u001a\u00020\u001b*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0#H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010+\u001a\u00020(*\u00020'H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\"\u001d\u00100\u001a\u00020\u001a8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m28850d2 = {"", "model", "Lcoil/request/ImageRequest;", "requestOf", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "transformOf", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;)Lkotlin/jvm/functions/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "onStateOf", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/layout/ContentScale;", "Lcoil/size/Scale;", "toScale", "(Landroidx/compose/ui/layout/ContentScale;)Lcoil/size/Scale;", "Landroidx/compose/ui/unit/Constraints;", "", "width", "constrainWidth-K40F9xA", "(JF)F", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "Lkotlin/Function0;", "block", "takeOrElse", "(FLkotlin/jvm/functions/Function0;)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/IntSize;", "toIntSize-uvyYCjk", "(J)J", "toIntSize", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getZeroConstraints", "()J", "ZeroConstraints", "coil-compose-base_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/compose/UtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,92:1\n76#2:93\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/compose/UtilsKt\n*L\n26#1:93\n*E\n"})
/* loaded from: classes3.dex */
public final class UtilsKt {

    /* renamed from: a */
    public static final long f40472a = Constraints.Companion.m73634fixedJhjzzOo(0, 0);

    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final float m73977constrainHeightK40F9xA(long j, float f) {
        return AbstractC11719c.coerceIn(f, Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j));
    }

    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final float m73978constrainWidthK40F9xA(long j, float f) {
        return AbstractC11719c.coerceIn(f, Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j));
    }

    public static final long getZeroConstraints() {
        return f40472a;
    }

    @Stable
    @Nullable
    public static final Function1<AsyncImagePainter.State, Unit> onStateOf(@Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function12, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new UtilsKt$onStateOf$1(function1, function12, function13);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final ImageRequest requestOf(@Nullable Object obj, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, i, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        if (obj instanceof ImageRequest) {
            return (ImageRequest) obj;
        }
        return new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj).build();
    }

    public static final float takeOrElse(float f, @NotNull Function0<Float> function0) {
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            return function0.invoke().floatValue();
        }
        return f;
    }

    /* renamed from: toIntSize-uvyYCjk  reason: not valid java name */
    public static final long m73979toIntSizeuvyYCjk(long j) {
        return IntSizeKt.IntSize(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(j)), AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(j)));
    }

    @Stable
    @NotNull
    public static final Scale toScale(@NotNull ContentScale contentScale) {
        boolean areEqual;
        ContentScale.Companion companion = ContentScale.Companion;
        if (Intrinsics.areEqual(contentScale, companion.getFit())) {
            areEqual = true;
        } else {
            areEqual = Intrinsics.areEqual(contentScale, companion.getInside());
        }
        if (areEqual) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    @Stable
    @NotNull
    public static final Function1<AsyncImagePainter.State, AsyncImagePainter.State> transformOf(@Nullable Painter painter, @Nullable Painter painter2, @Nullable Painter painter3) {
        if (painter == null && painter2 == null && painter3 == null) {
            return AsyncImagePainter.Companion.getDefaultTransform();
        }
        return new UtilsKt$transformOf$1(painter, painter3, painter2);
    }
}
