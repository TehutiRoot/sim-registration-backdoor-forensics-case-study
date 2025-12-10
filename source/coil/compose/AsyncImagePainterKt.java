package coil.compose;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.platform.InspectionModeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.transition.TransitionTarget;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000}\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001+\u001a§\u0001\u0010\u0017\u001a\u00020\u00142\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ai\u0010\u0017\u001a\u00020\u00142\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\b2\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u0004\u0018\u00010(*\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\"\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u001b\u00101\u001a\u00020/*\u00020'8BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00062"}, m28850d2 = {"", "model", "Lcoil/ImageLoader;", "imageLoader", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter-3HmZ8SU", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter$State;", "transform", "onState", "rememberAsyncImagePainter-5jETZwI", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "Lcoil/request/ImageRequest;", "request", "e", "(Lcoil/request/ImageRequest;)V", "", "name", "description", "", OperatorName.CURVE_TO, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/ui/geometry/Size;", "Lcoil/size/Size;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(J)Lcoil/size/Size;", "coil/compose/AsyncImagePainterKt$FakeTransitionTarget$1", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/compose/AsyncImagePainterKt$FakeTransitionTarget$1;", "FakeTransitionTarget", "", "(J)Z", "isPositive", "coil-compose-base_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,410:1\n25#2:411\n1114#3,6:412\n76#4:418\n1#5:419\n159#6:420\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n*L\n140#1:411\n140#1:412,6\n145#1:418\n398#1:420\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImagePainterKt {

    /* renamed from: a */
    public static final AsyncImagePainterKt$FakeTransitionTarget$1 f40450a = new TransitionTarget() { // from class: coil.compose.AsyncImagePainterKt$FakeTransitionTarget$1
        @Override // coil.transition.TransitionTarget
        @Nullable
        public Drawable getDrawable() {
            return null;
        }

        @Override // coil.transition.TransitionTarget
        public /* bridge */ /* synthetic */ View getView() {
            return (View) getView();
        }

        @Override // coil.target.Target
        public /* synthetic */ void onError(Drawable drawable) {
            XQ1.m65505a(this, drawable);
        }

        @Override // coil.target.Target
        public /* synthetic */ void onStart(Drawable drawable) {
            XQ1.m65504b(this, drawable);
        }

        @Override // coil.target.Target
        public /* synthetic */ void onSuccess(Drawable drawable) {
            XQ1.m65503c(this, drawable);
        }

        @Override // coil.transition.TransitionTarget
        @NotNull
        public Void getView() {
            throw new UnsupportedOperationException();
        }
    };

    /* renamed from: a */
    public static final boolean m51126a(long j) {
        if (Size.m71571getWidthimpl(j) >= 0.5d && Size.m71568getHeightimpl(j) >= 0.5d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final coil.size.Size m51125b(long j) {
        Dimension dimension;
        Dimension dimension2;
        if (j == Size.Companion.m71579getUnspecifiedNHjbRc()) {
            return coil.size.Size.ORIGINAL;
        }
        if (m51126a(j)) {
            float m71571getWidthimpl = Size.m71571getWidthimpl(j);
            if (!Float.isInfinite(m71571getWidthimpl) && !Float.isNaN(m71571getWidthimpl)) {
                dimension = Dimensions.Dimension(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(j)));
            } else {
                dimension = Dimension.Undefined.INSTANCE;
            }
            float m71568getHeightimpl = Size.m71568getHeightimpl(j);
            if (!Float.isInfinite(m71568getHeightimpl) && !Float.isNaN(m71568getHeightimpl)) {
                dimension2 = Dimensions.Dimension(AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(j)));
            } else {
                dimension2 = Dimension.Undefined.INSTANCE;
            }
            return new coil.size.Size(dimension, dimension2);
        }
        return null;
    }

    /* renamed from: c */
    public static final Void m51124c(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* renamed from: d */
    public static /* synthetic */ Void m51123d(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return m51124c(str, str2);
    }

    /* renamed from: e */
    public static final void m51122e(ImageRequest imageRequest) {
        Object data = imageRequest.getData();
        if (!(data instanceof ImageRequest.Builder)) {
            if (!(data instanceof ImageBitmap)) {
                if (!(data instanceof ImageVector)) {
                    if (!(data instanceof Painter)) {
                        if (imageRequest.getTarget() == null) {
                            return;
                        }
                        throw new IllegalArgumentException("request.target must be null.".toString());
                    }
                    m51123d("Painter", null, 2, null);
                    throw new KotlinNothingValueException();
                }
                m51123d("ImageVector", null, 2, null);
                throw new KotlinNothingValueException();
            }
            m51123d("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        m51124c("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
        throw new KotlinNothingValueException();
    }

    @Composable
    @NotNull
    /* renamed from: rememberAsyncImagePainter-3HmZ8SU  reason: not valid java name */
    public static final AsyncImagePainter m73956rememberAsyncImagePainter3HmZ8SU(@Nullable Object obj, @NotNull ImageLoader imageLoader, @Nullable Painter painter, @Nullable Painter painter2, @Nullable Painter painter3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function12, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function13, @Nullable ContentScale contentScale, int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2140758544);
        Painter painter4 = (i3 & 4) != 0 ? null : painter;
        Painter painter5 = (i3 & 8) != 0 ? null : painter2;
        Painter painter6 = (i3 & 16) != 0 ? painter5 : painter3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i3 & 32) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i3 & 64) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i3 & 128) == 0 ? function13 : null;
        ContentScale fit = (i3 & 256) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m72175getDefaultFilterQualityfv9h1I = (i3 & 512) != 0 ? DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2140758544, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:83)");
        }
        int i4 = i2 >> 12;
        AsyncImagePainter m73957rememberAsyncImagePainter5jETZwI = m73957rememberAsyncImagePainter5jETZwI(obj, imageLoader, UtilsKt.transformOf(painter4, painter5, painter6), UtilsKt.onStateOf(function14, function15, function16), fit, m72175getDefaultFilterQualityfv9h1I, composer, (57344 & i4) | 72 | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m73957rememberAsyncImagePainter5jETZwI;
    }

    @Composable
    @NotNull
    /* renamed from: rememberAsyncImagePainter-5jETZwI  reason: not valid java name */
    public static final AsyncImagePainter m73957rememberAsyncImagePainter5jETZwI(@Nullable Object obj, @NotNull ImageLoader imageLoader, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function12, @Nullable ContentScale contentScale, int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2020614074);
        if ((i3 & 4) != 0) {
            function1 = AsyncImagePainter.Companion.getDefaultTransform();
        }
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        if ((i3 & 16) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((i3 & 32) != 0) {
            i = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        ImageRequest requestOf = UtilsKt.requestOf(obj, composer, 8);
        m51122e(requestOf);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AsyncImagePainter(requestOf, imageLoader);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) rememberedValue;
        asyncImagePainter.setTransform$coil_compose_base_release(function1);
        asyncImagePainter.setOnState$coil_compose_base_release(function12);
        asyncImagePainter.setContentScale$coil_compose_base_release(contentScale);
        asyncImagePainter.m73954setFilterQualityvDHp3xo$coil_compose_base_release(i);
        asyncImagePainter.setPreview$coil_compose_base_release(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
        asyncImagePainter.setImageLoader$coil_compose_base_release(imageLoader);
        asyncImagePainter.setRequest$coil_compose_base_release(requestOf);
        asyncImagePainter.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asyncImagePainter;
    }
}
