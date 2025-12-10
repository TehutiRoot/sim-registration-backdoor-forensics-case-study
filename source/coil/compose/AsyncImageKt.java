package coil.compose;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000v\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÛ\u0001\u0010 \u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u009d\u0001\u0010 \u001a\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0\f2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001aK\u0010'\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b+\u0010,\u001a\u001d\u0010-\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b-\u0010.\u001a\u001b\u00101\u001a\u0004\u0018\u000100*\u00020/H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, m28850d2 = {"", "model", "", "contentDescription", "Lcoil/ImageLoader;", "imageLoader", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/painter/Painter;", "placeholder", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "fallback", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Success;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Error;", "onError", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "AsyncImage-Q4Kwu38", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "AsyncImage", "Lcoil/compose/AsyncImagePainter$State;", "transform", "onState", "AsyncImage-MvsnxeU", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "painter", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;I)V", "Lcoil/request/ImageRequest;", "request", "updateRequest", "(Lcoil/request/ImageRequest;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Constraints;", "Lcoil/size/Size;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(J)Lcoil/size/Size;", "coil-compose-base_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,243:1\n120#2:244\n121#2,5:246\n127#2,6:259\n134#2:267\n76#3:245\n286#4,8:251\n294#4,2:265\n25#4:268\n1114#5,6:269\n*S KotlinDebug\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n*L\n165#1:244\n165#1:246,5\n165#1:259,6\n165#1:267\n165#1:245\n165#1:251,8\n165#1:265,2\n189#1:268\n189#1:269,6\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImageKt {
    @Composable
    /* renamed from: AsyncImage-MvsnxeU  reason: not valid java name */
    public static final void m73950AsyncImageMvsnxeU(@Nullable Object obj, @Nullable String str, @NotNull ImageLoader imageLoader, @Nullable Modifier modifier, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function12, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3, int i4) {
        Modifier.Companion companion;
        Function1<AsyncImagePainter.State, AsyncImagePainter.State> function13;
        Function1<? super AsyncImagePainter.State, Unit> function14;
        Alignment alignment2;
        ContentScale contentScale2;
        float f2;
        ColorFilter colorFilter2;
        int i5;
        int i6;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-2030202961);
        if ((i4 & 8) != 0) {
            companion = Modifier.Companion;
        } else {
            companion = modifier;
        }
        if ((i4 & 16) != 0) {
            function13 = AsyncImagePainter.Companion.getDefaultTransform();
        } else {
            function13 = function1;
        }
        if ((i4 & 32) != 0) {
            function14 = null;
        } else {
            function14 = function12;
        }
        if ((i4 & 64) != 0) {
            alignment2 = Alignment.Companion.getCenter();
        } else {
            alignment2 = alignment;
        }
        if ((i4 & 128) != 0) {
            contentScale2 = ContentScale.Companion.getFit();
        } else {
            contentScale2 = contentScale;
        }
        if ((i4 & 256) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i4 & 512) != 0) {
            colorFilter2 = null;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((i4 & 1024) != 0) {
            i6 = i3 & (-15);
            i5 = DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i2, i6, "coil.compose.AsyncImage (AsyncImage.kt:118)");
        }
        ImageRequest updateRequest = updateRequest(UtilsKt.requestOf(obj, startRestartGroup, 8), contentScale2, startRestartGroup, 8 | ((i2 >> 18) & 112));
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        int i9 = i8 & 57344;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function15 = function13;
        Function1<? super AsyncImagePainter.State, Unit> function16 = function14;
        ContentScale contentScale3 = contentScale2;
        int i10 = i5;
        AsyncImagePainter m73957rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m73957rememberAsyncImagePainter5jETZwI(updateRequest, imageLoader, function15, function16, contentScale3, i10, startRestartGroup, ((i6 << 15) & 458752) | (i7 & 7168) | (i7 & 896) | 72 | i9, 0);
        SizeResolver sizeResolver = updateRequest.getSizeResolver();
        if (sizeResolver instanceof ConstraintsSizeResolver) {
            modifier2 = companion.then((Modifier) sizeResolver);
        } else {
            modifier2 = companion;
        }
        Content(modifier2, m73957rememberAsyncImagePainter5jETZwI, str, alignment2, contentScale2, f2, colorFilter2, startRestartGroup, (i8 & 7168) | ((i2 << 3) & 896) | i9 | (i8 & 458752) | (3670016 & i8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AsyncImageKt$AsyncImage$1(obj, str, imageLoader, companion, function13, function14, alignment2, contentScale2, f2, colorFilter2, i5, i2, i3, i4));
        }
    }

    @Composable
    /* renamed from: AsyncImage-Q4Kwu38  reason: not valid java name */
    public static final void m73951AsyncImageQ4Kwu38(@Nullable Object obj, @Nullable String str, @NotNull ImageLoader imageLoader, @Nullable Modifier modifier, @Nullable Painter painter, @Nullable Painter painter2, @Nullable Painter painter3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function12, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function13, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-245964807);
        Modifier.Companion companion = (i4 & 8) != 0 ? Modifier.Companion : modifier;
        Painter painter4 = (i4 & 16) != 0 ? null : painter;
        Painter painter5 = (i4 & 32) != 0 ? null : painter2;
        Painter painter6 = (i4 & 64) != 0 ? painter5 : painter3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 128) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 256) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 512) != 0 ? null : function13;
        Alignment center = (i4 & 1024) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i4 & 2048) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i4 & 4096) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 8192) != 0 ? null : colorFilter;
        int m72175getDefaultFilterQualityfv9h1I = (i4 & 16384) != 0 ? DrawScope.Companion.m72175getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-245964807, i2, i3, "coil.compose.AsyncImage (AsyncImage.kt:64)");
        }
        int i5 = i3 << 18;
        m73950AsyncImageMvsnxeU(obj, str, imageLoader, companion, UtilsKt.transformOf(painter4, painter5, painter6), UtilsKt.onStateOf(function14, function15, function16), center, fit, f2, colorFilter2, m72175getDefaultFilterQualityfv9h1I, composer, (i2 & 7168) | (i2 & 112) | 520 | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i3 >> 12) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Content(@NotNull Modifier modifier, @NotNull Painter painter, @Nullable String str, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, @Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10290533, i, -1, "coil.compose.Content (AsyncImage.kt:156)");
        }
        Modifier then = ClipKt.clipToBounds(m51144a(modifier, str)).then(new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter));
        AsyncImageKt$Content$1 asyncImageKt$Content$1 = AsyncImageKt$Content$1.f40423a;
        startRestartGroup.startReplaceableGroup(544976794);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, then);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new AsyncImageKt$Content$$inlined$Layout$1(constructor));
        } else {
            startRestartGroup.useNode();
        }
        Composer m71393constructorimpl = Updater.m71393constructorimpl(startRestartGroup);
        Updater.m71400setimpl(m71393constructorimpl, asyncImageKt$Content$1, companion.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, density, companion.getSetDensity());
        Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m71400setimpl(m71393constructorimpl, materialize, companion.getSetModifier());
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AsyncImageKt$Content$2(modifier, painter, str, alignment, contentScale, f, colorFilter, i));
        }
    }

    /* renamed from: a */
    public static final Modifier m51144a(Modifier modifier, String str) {
        if (str != null) {
            return SemanticsModifierKt.semantics$default(modifier, false, new AsyncImageKt$contentDescription$1(str), 1, null);
        }
        return modifier;
    }

    /* renamed from: b */
    public static final Size m51143b(long j) {
        Dimension dimension;
        Dimension dimension2;
        if (Constraints.m73630isZeroimpl(j)) {
            return null;
        }
        if (Constraints.m73622getHasBoundedWidthimpl(j)) {
            dimension = Dimensions.Dimension(Constraints.m73626getMaxWidthimpl(j));
        } else {
            dimension = Dimension.Undefined.INSTANCE;
        }
        if (Constraints.m73621getHasBoundedHeightimpl(j)) {
            dimension2 = Dimensions.Dimension(Constraints.m73625getMaxHeightimpl(j));
        } else {
            dimension2 = Dimension.Undefined.INSTANCE;
        }
        return new Size(dimension, dimension2);
    }

    @Composable
    @NotNull
    public static final ImageRequest updateRequest(@NotNull ImageRequest imageRequest, @NotNull ContentScale contentScale, @Nullable Composer composer, int i) {
        SizeResolver sizeResolver;
        composer.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i, -1, "coil.compose.updateRequest (AsyncImage.kt:183)");
        }
        if (imageRequest.getDefined().getSizeResolver() == null) {
            if (Intrinsics.areEqual(contentScale, ContentScale.Companion.getNone())) {
                sizeResolver = SizeResolvers.create(Size.ORIGINAL);
            } else {
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ConstraintsSizeResolver();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                sizeResolver = (SizeResolver) rememberedValue;
            }
            imageRequest = ImageRequest.newBuilder$default(imageRequest, null, 1, null).size(sizeResolver).build();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageRequest;
    }
}
