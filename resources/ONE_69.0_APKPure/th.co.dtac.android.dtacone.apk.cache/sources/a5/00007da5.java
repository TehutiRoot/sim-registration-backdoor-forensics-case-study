package coil.compose;

import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m29142d2 = {"rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "rememberAsyncImagePainter-19ie5dc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "rememberAsyncImagePainter-MqR-F_0", "(Ljava/lang/Object;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "coil-compose-singleton_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class SingletonAsyncImagePainterKt {
    @Composable
    @NotNull
    /* renamed from: rememberAsyncImagePainter-19ie5dc  reason: not valid java name */
    public static final AsyncImagePainter m74155rememberAsyncImagePainter19ie5dc(@Nullable Object obj, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function12, @Nullable ContentScale contentScale, int i, @Nullable Composer composer, int i2, int i3) {
        Function1<AsyncImagePainter.State, AsyncImagePainter.State> function13;
        Function1<? super AsyncImagePainter.State, Unit> function14;
        ContentScale contentScale2;
        int i4;
        composer.startReplaceableGroup(-1494234083);
        if ((i3 & 2) != 0) {
            function13 = AsyncImagePainter.Companion.getDefaultTransform();
        } else {
            function13 = function1;
        }
        if ((i3 & 4) != 0) {
            function14 = null;
        } else {
            function14 = function12;
        }
        if ((i3 & 8) != 0) {
            contentScale2 = ContentScale.Companion.getFit();
        } else {
            contentScale2 = contentScale;
        }
        if ((i3 & 16) != 0) {
            i4 = DrawScope.Companion.m72359getDefaultFilterQualityfv9h1I();
        } else {
            i4 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1494234083, i2, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:91)");
        }
        int i5 = i2 << 3;
        AsyncImagePainter m74141rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m74141rememberAsyncImagePainter5jETZwI(obj, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer, 6), function13, function14, contentScale2, i4, composer, (i5 & 896) | 72 | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m74141rememberAsyncImagePainter5jETZwI;
    }

    @Composable
    @NotNull
    /* renamed from: rememberAsyncImagePainter-MqR-F_0  reason: not valid java name */
    public static final AsyncImagePainter m74156rememberAsyncImagePainterMqRF_0(@Nullable Object obj, @Nullable Painter painter, @Nullable Painter painter2, @Nullable Painter painter3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function12, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function13, @Nullable ContentScale contentScale, int i, @Nullable Composer composer, int i2, int i3) {
        Painter painter4;
        Painter painter5;
        Painter painter6;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16;
        ContentScale contentScale2;
        int i4;
        composer.startReplaceableGroup(533921043);
        if ((i3 & 2) != 0) {
            painter4 = null;
        } else {
            painter4 = painter;
        }
        if ((i3 & 4) != 0) {
            painter5 = null;
        } else {
            painter5 = painter2;
        }
        if ((i3 & 8) != 0) {
            painter6 = painter5;
        } else {
            painter6 = painter3;
        }
        if ((i3 & 16) != 0) {
            function14 = null;
        } else {
            function14 = function1;
        }
        if ((i3 & 32) != 0) {
            function15 = null;
        } else {
            function15 = function12;
        }
        if ((i3 & 64) != 0) {
            function16 = null;
        } else {
            function16 = function13;
        }
        if ((i3 & 128) != 0) {
            contentScale2 = ContentScale.Companion.getFit();
        } else {
            contentScale2 = contentScale;
        }
        if ((i3 & 256) != 0) {
            i4 = DrawScope.Companion.m72359getDefaultFilterQualityfv9h1I();
        } else {
            i4 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(533921043, i2, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:44)");
        }
        int i5 = i2 << 3;
        AsyncImagePainter m74140rememberAsyncImagePainter3HmZ8SU = AsyncImagePainterKt.m74140rememberAsyncImagePainter3HmZ8SU(obj, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer, 6), painter4, painter5, painter6, function14, function15, function16, contentScale2, i4, composer, (458752 & i5) | 37448 | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m74140rememberAsyncImagePainter3HmZ8SU;
    }
}