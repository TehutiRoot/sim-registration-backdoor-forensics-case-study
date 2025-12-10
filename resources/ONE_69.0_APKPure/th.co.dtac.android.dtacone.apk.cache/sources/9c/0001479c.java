package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ImageResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u001aE\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010 \u001a\u00020\u0006H\u0003¢\u0006\u0004\b \u0010\u001f\u001a\u000f\u0010!\u001a\u00020\u0006H\u0003¢\u0006\u0004\b!\u0010\u001f¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;", "faceCompareResult", "", "isCardReader", "isSuccess", "Lkotlin/Function0;", "", "onRetakeIdCard", "onRetakeFace", "ReviewFaceCompareScreen", "(Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "Landroid/graphics/Bitmap;", "i", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "allowClick", "onClick", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/graphics/Bitmap;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/layout/BoxScope;", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "", "resId", OperatorName.NON_STROKING_GRAY, "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", OperatorName.CLOSE_PATH, "(Landroidx/compose/runtime/Composer;I)Lth/co/dtac/android/dtacone/model/upPass/FaceCompareResult;", "e", "(Landroidx/compose/runtime/Composer;I)V", OperatorName.FILL_NON_ZERO, "d", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReviewFaceCompareScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewFaceCompareScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/ReviewFaceCompareScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,274:1\n154#2:275\n154#2:276\n154#2:313\n154#2:349\n154#2:355\n154#2:391\n154#2:397\n154#2:398\n154#2:399\n154#2:435\n76#3,2:277\n78#3:307\n82#3:312\n78#4,11:279\n91#4:311\n78#4,11:320\n91#4:353\n78#4,11:362\n91#4:395\n78#4,11:406\n91#4:439\n456#5,8:290\n464#5,3:304\n467#5,3:308\n456#5,8:331\n464#5,3:345\n467#5,3:350\n456#5,8:373\n464#5,3:387\n467#5,3:392\n456#5,8:417\n464#5,3:431\n467#5,3:436\n4144#6,6:298\n4144#6,6:339\n4144#6,6:381\n4144#6,6:425\n66#7,6:314\n72#7:348\n76#7:354\n66#7,6:356\n72#7:390\n76#7:396\n73#8,6:400\n79#8:434\n83#8:440\n*S KotlinDebug\n*F\n+ 1 ReviewFaceCompareScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/ReviewFaceCompareScreenKt\n*L\n56#1:275\n59#1:276\n109#1:313\n124#1:349\n154#1:355\n168#1:391\n186#1:397\n188#1:398\n189#1:399\n202#1:435\n54#1:277,2\n54#1:307\n54#1:312\n54#1:279,11\n54#1:311\n105#1:320,11\n105#1:353\n150#1:362,11\n150#1:395\n181#1:406,11\n181#1:439\n54#1:290,8\n54#1:304,3\n54#1:308,3\n105#1:331,8\n105#1:345,3\n105#1:350,3\n150#1:373,8\n150#1:387,3\n150#1:392,3\n181#1:417,8\n181#1:431,3\n181#1:436,3\n54#1:298,6\n105#1:339,6\n150#1:381,6\n181#1:425,6\n105#1:314,6\n105#1:348\n105#1:354\n150#1:356,6\n150#1:390\n150#1:396\n181#1:400,6\n181#1:434\n181#1:440\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewFaceCompareScreenKt */
/* loaded from: classes10.dex */
public final class ReviewFaceCompareScreenKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ReviewFaceCompareScreen(@Nullable FaceCompareResult faceCompareResult, boolean z, boolean z2, @NotNull Function0<Unit> onRetakeIdCard, @NotNull Function0<Unit> onRetakeFace, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(onRetakeIdCard, "onRetakeIdCard");
        Intrinsics.checkNotNullParameter(onRetakeFace, "onRetakeFace");
        Composer startRestartGroup = composer.startRestartGroup(-1732539691);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(faceCompareResult)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(z2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changedInstance(onRetakeIdCard)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changedInstance(onRetakeFace)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((46811 & i8) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1732539691, i8, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewFaceCompareScreen (ReviewFaceCompareScreen.kt:44)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            float f = 24;
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = Arrangement.INSTANCE.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(f));
            Modifier m69714paddingVpY3zN4 = PaddingKt.m69714paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(48), C3623Dp.m73842constructorimpl(f));
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            boolean z3 = false;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69714paddingVpY3zN4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(664772665);
            if (faceCompareResult != null) {
                Bitmap m9165i = m9165i(faceCompareResult.getIdDocImage());
                Bitmap m9165i2 = m9165i(faceCompareResult.getFaceImageSelfie());
                if (!z && !z2) {
                    z3 = true;
                }
                m9172b(m9165i, z3, onRetakeIdCard, startRestartGroup, ((i8 >> 3) & 896) | 8, 0);
                m9173a(m9165i2, !z2, onRetakeFace, startRestartGroup, ((i8 >> 6) & 896) | 8, 0);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareScreenKt$ReviewFaceCompareScreen$2(faceCompareResult, z, z2, onRetakeIdCard, onRetakeFace, i));
        }
    }

    /* renamed from: a */
    public static final void m9173a(Bitmap bitmap, boolean z, Function0 function0, Composer composer, int i, int i2) {
        boolean z2;
        ReviewFaceCompareScreenKt$FaceImageBox$1 reviewFaceCompareScreenKt$FaceImageBox$1;
        BoxScopeInstance boxScopeInstance;
        Composer startRestartGroup = composer.startRestartGroup(409709388);
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 4) != 0) {
            reviewFaceCompareScreenKt$FaceImageBox$1 = ReviewFaceCompareScreenKt$FaceImageBox$1.INSTANCE;
        } else {
            reviewFaceCompareScreenKt$FaceImageBox$1 = function0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(409709388, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.FaceImageBox (ReviewFaceCompareScreen.kt:144)");
        }
        Modifier.Companion companion = Modifier.Companion;
        float f = 8;
        Modifier m69531clickableXHw0xAI$default = ClickableKt.m69531clickableXHw0xAI$default(ClipKt.clip(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f))), z2, null, null, reviewFaceCompareScreenKt$FaceImageBox$1, 6, null);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69531clickableXHw0xAI$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
        Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1246141259);
        if (bitmap == null) {
            boxScopeInstance = boxScopeInstance2;
        } else {
            ImageBitmap asImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
            ContentScale crop = ContentScale.Companion.getCrop();
            Modifier clip = ClipKt.clip(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f)));
            boxScopeInstance = boxScopeInstance2;
            ImageKt.m69548Image5hnEew(asImageBitmap, "Face Image", clip, null, crop, 0.0f, null, 0, startRestartGroup, 24632, 232);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-184603882);
        if (z2) {
            m9171c(boxScopeInstance, startRestartGroup, 6);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareScreenKt$FaceImageBox$3(bitmap, z2, reviewFaceCompareScreenKt$FaceImageBox$1, i, i2));
        }
    }

    public static final /* synthetic */ FaceCompareResult access$mockResult(Composer composer, int i) {
        return m9166h(composer, i);
    }

    /* renamed from: b */
    public static final void m9172b(Bitmap bitmap, boolean z, Function0 function0, Composer composer, int i, int i2) {
        boolean z2;
        ReviewFaceCompareScreenKt$IdCardImageBox$1 reviewFaceCompareScreenKt$IdCardImageBox$1;
        BoxScopeInstance boxScopeInstance;
        Composer startRestartGroup = composer.startRestartGroup(-740050886);
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 4) != 0) {
            reviewFaceCompareScreenKt$IdCardImageBox$1 = ReviewFaceCompareScreenKt$IdCardImageBox$1.INSTANCE;
        } else {
            reviewFaceCompareScreenKt$IdCardImageBox$1 = function0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-740050886, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.IdCardImageBox (ReviewFaceCompareScreen.kt:98)");
        }
        Modifier.Companion companion = Modifier.Companion;
        float f = 8;
        Modifier m69531clickableXHw0xAI$default = ClickableKt.m69531clickableXHw0xAI$default(ClipKt.clip(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.5f, false, 2, null), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f))), z2, null, null, reviewFaceCompareScreenKt$IdCardImageBox$1, 6, null);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69531clickableXHw0xAI$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
        Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(598854703);
        if (bitmap == null) {
            boxScopeInstance = boxScopeInstance2;
        } else {
            ImageBitmap asImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
            ContentScale crop = ContentScale.Companion.getCrop();
            Modifier clip = ClipKt.clip(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(f)));
            boxScopeInstance = boxScopeInstance2;
            ImageKt.m69548Image5hnEew(asImageBitmap, "Id Document Image", clip, null, crop, 0.0f, null, 0, startRestartGroup, 24632, 232);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1420048471);
        if (z2) {
            m9171c(boxScopeInstance, startRestartGroup, 6);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareScreenKt$IdCardImageBox$3(bitmap, z2, reviewFaceCompareScreenKt$IdCardImageBox$1, i, i2));
        }
    }

    /* renamed from: c */
    public static final void m9171c(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-814574901);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-814574901, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.RetakeButton (ReviewFaceCompareScreen.kt:177)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            float f = 8;
            float f2 = 4;
            Modifier clip = ClipKt.clip(PaddingKt.m69714paddingVpY3zN4(BackgroundKt.m69504backgroundbw27NRU(boxScope.align(companion, companion2.getBottomEnd()), ColorKt.Color(2566914048L), RoundedCornerShapeKt.m69897RoundedCornerShapea9UjIt4$default(C3623Dp.m73842constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null)), C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f2)), RoundedCornerShapeKt.m69897RoundedCornerShapea9UjIt4$default(C3623Dp.m73842constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(clip);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_camera_outlined, startRestartGroup, 0);
            Color.Companion companion4 = Color.Companion;
            IconKt.m70610Iconww6aTOc(painterResource, (String) null, (Modifier) null, companion4.m71956getWhite0d7_KjU(), startRestartGroup, 3128, 4);
            composer2 = startRestartGroup;
            TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(R.string.retake_photo_label, startRestartGroup, 0), rowScopeInstance.align(PaddingKt.m69717paddingqDBjuR0$default(companion, C3623Dp.m73842constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), companion2.getCenterVertically()), companion4.m71956getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineSmall(), composer2, 384, 0, 65528);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareScreenKt$RetakeButton$2(boxScope, i));
        }
    }

    /* renamed from: d */
    public static final void m9170d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(315696654);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(315696654, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewScreenDtacOnePreview (ReviewFaceCompareScreen.kt:261)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableSingletons$ReviewFaceCompareScreenKt.INSTANCE.m75279getLambda3$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareScreenKt$ReviewScreenDtacOnePreview$1(i));
        }
    }

    /* renamed from: e */
    public static final void m9169e(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(829203882);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(829203882, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewScreenOneDtacPreview (ReviewFaceCompareScreen.kt:231)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_DTAC, false, ComposableSingletons$ReviewFaceCompareScreenKt.INSTANCE.m75277getLambda1$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareScreenKt$ReviewScreenOneDtacPreview$1(i));
        }
    }

    /* renamed from: f */
    public static final void m9168f(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-223787698);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-223787698, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewScreenOneTruePreview (ReviewFaceCompareScreen.kt:246)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableSingletons$ReviewFaceCompareScreenKt.INSTANCE.m75278getLambda2$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewFaceCompareScreenKt$ReviewScreenOneTruePreview$1(i));
        }
    }

    /* renamed from: g */
    public static final String m9167g(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-1410177214);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1410177214, i2, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.getBitmapBase64Resource (ReviewFaceCompareScreen.kt:208)");
        }
        String encodeToString = Base64.encodeToString(BitmapExtKt.toByteArray(AndroidImageBitmap_androidKt.asAndroidBitmap(ImageResources_androidKt.imageResource(ImageBitmap.Companion, i, composer, ((i2 << 3) & 112) | 8))), 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bitmap.to…eArray(), Base64.NO_WRAP)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return encodeToString;
    }

    /* renamed from: h */
    public static final FaceCompareResult m9166h(Composer composer, int i) {
        String str;
        composer.startReplaceableGroup(821334002);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(821334002, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.mockResult (ReviewFaceCompareScreen.kt:214)");
        }
        String m9167g = m9167g(R.drawable.preview_image_id_card, composer, 0);
        String m9167g2 = m9167g(R.drawable.preview_image_face, composer, 0);
        float random = AbstractC11695c.random(new IntRange(0, 100), Random.Default) / 100.0f;
        if (random > 0.8f) {
            str = "match";
        } else {
            str = "not_compare";
        }
        String str2 = str;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(random)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        FaceCompareResult faceCompareResult = new FaceCompareResult(m9167g, m9167g2, null, str2, format, m9167g, 0, false, false, false, false, null, null, 8132, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return faceCompareResult;
    }

    /* renamed from: i */
    public static final Bitmap m9165i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error decoding Base64 string: ");
            sb.append(str);
            return null;
        }
    }
}