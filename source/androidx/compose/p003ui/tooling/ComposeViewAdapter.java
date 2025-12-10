package androidx.compose.p003ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.layout.LayoutInfo;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.p003ui.tooling.animation.AnimationSearch;
import androidx.compose.p003ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.p003ui.tooling.data.Group;
import androidx.compose.p003ui.tooling.data.NodeGroup;
import androidx.compose.p003ui.tooling.data.SlotTreeKt;
import androidx.compose.p003ui.tooling.data.SourceLocation;
import androidx.compose.p003ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\t*\b\u0081\u0001\u0085\u0001\u0089\u0001\u008d\u0001\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u0004\u0018\u00010\u001b*\u00020\u001e2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010\u0015J\"\u0010*\u001a\u00020\u00132\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00130'¢\u0006\u0002\b(H\u0003¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J7\u00103\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0013H\u0014¢\u0006\u0004\b5\u0010\u0015J\u0017\u00108\u001a\u00020\u00132\u0006\u00107\u001a\u000206H\u0014¢\u0006\u0004\b8\u00109J\u009f\u0001\u0010K\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020\u001b2\u0016\b\u0002\u0010>\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030=\u0018\u00010<2\b\b\u0002\u0010?\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020\f2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020\f2\b\b\u0002\u0010E\u001a\u00020\f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00130'2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00130'H\u0001¢\u0006\u0004\bI\u0010JJ\u000f\u0010M\u001a\u00020\u0013H\u0000¢\u0006\u0004\bL\u0010\u0015J\r\u0010N\u001a\u00020\f¢\u0006\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010SR\u0016\u0010A\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010UR\u0016\u0010@\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010UR(\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00100V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R(\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001b0V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010W\u001a\u0004\b^\u0010Y\"\u0004\b_\u0010[R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010PR\u0016\u0010N\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010UR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010gR!\u0010j\u001a\r\u0012\u0004\u0012\u00020\u00130'¢\u0006\u0002\b(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010iR+\u0010)\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130'¢\u0006\u0002\b(0k8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010l\u0012\u0004\bm\u0010\u0015R\u0016\u0010D\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0016\u0010E\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010UR\u0016\u0010F\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00130'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010t\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010U\u001a\u0004\bq\u0010O\"\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR)\u0010z\u001a\u00020y8\u0000@\u0000X\u0081.¢\u0006\u0019\n\u0004\bz\u0010{\u0012\u0005\b\u0080\u0001\u0010\u0015\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0092\u0001\u001a\u00020\u001b*\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b]\u0010\u0091\u0001R\u001a\u0010\u0094\u0001\u001a\u00020\b*\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bb\u0010\u0093\u0001¨\u0006\u0095\u0001"}, m28850d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/ui/tooling/data/Group;", "", "i", "(Landroidx/compose/ui/tooling/data/Group;)Z", OperatorName.MOVE_TO, "Landroidx/compose/ui/tooling/ViewInfo;", "o", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/ViewInfo;", "", OperatorName.ENDPATH, "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, OperatorName.CLOSE_PATH, "Landroidx/compose/ui/unit/IntRect;", "box", "", "e", "(Landroidx/compose/ui/tooling/data/Group;Landroidx/compose/ui/unit/IntRect;)Ljava/lang/String;", "", "Ljava/lang/reflect/Method;", "d", "(Ljava/lang/Object;)Ljava/lang/reflect/Method;", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, OperatorName.LINE_TO, "(Ljava/lang/Object;II)Ljava/lang/String;", OperatorName.NON_STROKING_CMYK, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", OperatorName.SET_LINE_JOINSTYLE, "(Landroid/util/AttributeSet;)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "className", "methodName", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProvider", "parameterProviderIndex", "debugPaintBounds", "debugViewInfos", "", "animationClockStartTime", "forceCompositionInvalidation", "lookForDesignInfoProviders", "designInfoProvidersArgument", "onCommit", "onDraw", "init$ui_tooling_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "init", "dispose$ui_tooling_release", "dispose", "hasAnimations", "()Z", "Ljava/lang/String;", "TAG", "Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Z", "", "Ljava/util/List;", "getViewInfos$ui_tooling_release", "()Ljava/util/List;", "setViewInfos$ui_tooling_release", "(Ljava/util/List;)V", "viewInfos", OperatorName.FILL_NON_ZERO, "getDesignInfoList$ui_tooling_release", "setDesignInfoList$ui_tooling_release", "designInfoList", "Landroidx/compose/ui/tooling/CompositionDataRecord;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/tooling/CompositionDataRecord;", "slotTableRecord", "composableName", "Landroidx/compose/ui/tooling/ThreadSafeException;", "Landroidx/compose/ui/tooling/ThreadSafeException;", "delayedException", "Lkotlin/jvm/functions/Function2;", "previewComposition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "getContent$annotations", "p", "Lkotlin/jvm/functions/Function0;", OperatorName.SAVE, "getStitchTrees$ui_tooling_release", "setStitchTrees$ui_tooling_release", "(Z)V", "stitchTrees", "Landroid/graphics/Paint;", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroid/graphics/Paint;", "debugBoundsPaint", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "clock", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "getClock$ui_tooling_release$annotations", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1;", "FakeSavedStateRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1", "t", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1;", "FakeViewModelStoreOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1", "u", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1;", "FakeOnBackPressedDispatcherOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1;", "FakeActivityResultRegistryOwner", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "fileName", "(Landroidx/compose/ui/tooling/data/Group;)I", "lineNumber", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposeViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,675:1\n766#2:676\n857#2,2:677\n1549#2:679\n1620#2,3:680\n1549#2:683\n1620#2,3:684\n1549#2:687\n1620#2,3:688\n1549#2:691\n1620#2,3:692\n1360#2:695\n1446#2,2:696\n1603#2,9:698\n1855#2:707\n1856#2:710\n1612#2:711\n1448#2,3:712\n1747#2,3:715\n1360#2:718\n1446#2,5:719\n1855#2,2:724\n1#3:708\n1#3:709\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n*L\n260#1:676\n260#1:677,2\n261#1:679\n261#1:680,3\n280#1:683\n280#1:684,3\n319#1:687\n319#1:688,3\n334#1:691\n334#1:692,3\n336#1:695\n336#1:696,2\n341#1:698,9\n341#1:707\n341#1:710\n341#1:711\n336#1:712,3\n350#1:715,3\n410#1:718\n410#1:719,5\n411#1:724,2\n341#1:709\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter */
/* loaded from: classes2.dex */
public final class ComposeViewAdapter extends FrameLayout {

    /* renamed from: a */
    public final String f31585a;

    /* renamed from: b */
    public final ComposeView f31586b;

    /* renamed from: c */
    public boolean f31587c;
    public PreviewAnimationClock clock;

    /* renamed from: d */
    public boolean f31588d;

    /* renamed from: e */
    public List f31589e;

    /* renamed from: f */
    public List f31590f;

    /* renamed from: g */
    public final CompositionDataRecord f31591g;

    /* renamed from: h */
    public String f31592h;

    /* renamed from: i */
    public boolean f31593i;

    /* renamed from: j */
    public final ThreadSafeException f31594j;

    /* renamed from: k */
    public Function2 f31595k;

    /* renamed from: l */
    public final MutableState f31596l;

    /* renamed from: m */
    public boolean f31597m;

    /* renamed from: n */
    public boolean f31598n;

    /* renamed from: o */
    public String f31599o;

    /* renamed from: p */
    public Function0 f31600p;

    /* renamed from: q */
    public boolean f31601q;

    /* renamed from: r */
    public final Paint f31602r;

    /* renamed from: s */
    public final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 f31603s;

    /* renamed from: t */
    public final ComposeViewAdapter$FakeViewModelStoreOwner$1 f31604t;

    /* renamed from: u */
    public final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 f31605u;

    /* renamed from: v */
    public final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 f31606v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Function2 function2;
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f31585a = "ComposeViewAdapter";
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f31586b = new ComposeView(context2, null, 0, 6, null);
        this.f31589e = CollectionsKt__CollectionsKt.emptyList();
        this.f31590f = CollectionsKt__CollectionsKt.emptyList();
        this.f31591g = CompositionDataRecord.Companion.create();
        this.f31592h = "";
        this.f31594j = new ThreadSafeException();
        this.f31595k = ComposableSingletons$ComposeViewAdapterKt.INSTANCE.m73598getLambda2$ui_tooling_release();
        function2 = ComposeViewAdapterKt.f31614a;
        m31891g = AbstractC19508dK1.m31891g(function2, null, 2, null);
        this.f31596l = m31891g;
        this.f31599o = "";
        this.f31600p = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.f31601q = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m71788toArgb8_81llA(Color.Companion.m71769getRed0d7_KjU()));
        this.f31602r = paint;
        this.f31603s = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.f31604t = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.f31605u = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1

            /* renamed from: a */
            public final OnBackPressedDispatcher f31608a = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            @NotNull
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.f31608a;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            @NotNull
            public LifecycleRegistry getLifecycle() {
                return ComposeViewAdapter.access$getFakeSavedStateRegistryOwner$p(ComposeViewAdapter.this).getLifecycleRegistry();
            }
        };
        this.f31606v = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1

            /* renamed from: a */
            public final C3627x466dc6c4 f31607a = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i, @NotNull ActivityResultContract<I, O> contract, I i2, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                    Intrinsics.checkNotNullParameter(contract, "contract");
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            @NotNull
            public C3627x466dc6c4 getActivityResultRegistry() {
                return this.f31607a;
            }
        };
        m58949j(attrs);
    }

    public static final /* synthetic */ ComposeViewAdapter$FakeSavedStateRegistryOwner$1 access$getFakeSavedStateRegistryOwner$p(ComposeViewAdapter composeViewAdapter) {
        return composeViewAdapter.f31603s;
    }

    @VisibleForTesting
    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void init$ui_tooling_release$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i, boolean z, boolean z2, long j, boolean z3, boolean z4, String str3, Function0 function0, Function0 function02, int i2, Object obj) {
        Class cls2;
        int i3;
        boolean z5;
        boolean z6;
        long j2;
        boolean z7;
        boolean z8;
        String str4;
        ComposeViewAdapter$init$1 composeViewAdapter$init$1;
        ComposeViewAdapter$init$2 composeViewAdapter$init$2;
        if ((i2 & 4) != 0) {
            cls2 = null;
        } else {
            cls2 = cls;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i2 & 32) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i2 & 64) != 0) {
            j2 = -1;
        } else {
            j2 = j;
        }
        if ((i2 & 128) != 0) {
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i2 & 256) != 0) {
            z8 = false;
        } else {
            z8 = z4;
        }
        if ((i2 & 512) != 0) {
            str4 = null;
        } else {
            str4 = str3;
        }
        if ((i2 & 1024) != 0) {
            composeViewAdapter$init$1 = ComposeViewAdapter$init$1.INSTANCE;
        } else {
            composeViewAdapter$init$1 = function0;
        }
        if ((i2 & 2048) != 0) {
            composeViewAdapter$init$2 = ComposeViewAdapter$init$2.INSTANCE;
        } else {
            composeViewAdapter$init$2 = function02;
        }
        composeViewAdapter.init$ui_tooling_release(str, str2, cls2, i3, z5, z6, j2, z7, z8, str4, composeViewAdapter$init$1, composeViewAdapter$init$2);
    }

    /* renamed from: a */
    public final void m58958a(Function2 function2, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(493526445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(493526445, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.kt:437)");
        }
        ProvidableCompositionLocal<Font.ResourceLoader> localFontLoader = CompositionLocalsKt.getLocalFontLoader();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ProvidedValue<Font.ResourceLoader> provides = localFontLoader.provides(new LayoutlibFontResourceLoader(context));
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{provides, localFontFamilyResolver.provides(FontFamilyResolver_androidKt.createFontFamilyResolver(context2)), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(this.f31605u), LocalActivityResultRegistryOwner.INSTANCE.provides(this.f31606v)}, ComposableLambdaKt.composableLambda(startRestartGroup, -1966112531, true, new ComposeViewAdapter$WrapPreview$1(this, function2, i)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposeViewAdapter$WrapPreview$2(this, function2, i));
        }
    }

    /* renamed from: b */
    public final void m58957b() {
        Set<CompositionData> store = this.f31591g.getStore();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(store, 10));
        for (CompositionData compositionData : store) {
            arrayList.add(SlotTreeKt.asTree(compositionData));
        }
        AnimationSearch animationSearch = new AnimationSearch(new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return ((ComposeViewAdapter) this.receiver).getClock$ui_tooling_release();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(@Nullable Object obj) {
                ((ComposeViewAdapter) this.receiver).setClock$ui_tooling_release((PreviewAnimationClock) obj);
            }
        }, new ComposeViewAdapter$findAndTrackAnimations$2(this));
        animationSearch.findAll(arrayList);
        this.f31593i = animationSearch.getHasAnimations();
        if (this.clock != null) {
            animationSearch.trackAll();
        }
    }

    /* renamed from: c */
    public final void m58956c() {
        Set<CompositionData> store = this.f31591g.getStore();
        ArrayList<Group> arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(store, 10));
        for (CompositionData compositionData : store) {
            arrayList.add(SlotTreeKt.asTree(compositionData));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Group group : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Group group2 : PreviewUtilsKt.findAll(group, new ComposeViewAdapter$findDesignInfoProviders$1$1(this))) {
                String m58954e = m58954e(group2, group2.getBox());
                if (m58954e == null) {
                    Iterator<T> it = group2.getChildren().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String m58954e2 = m58954e((Group) it.next(), group2.getBox());
                            if (m58954e2 != null) {
                                m58954e = m58954e2;
                                break;
                            }
                        } else {
                            m58954e = null;
                            break;
                        }
                    }
                }
                if (m58954e != null) {
                    arrayList3.add(m58954e);
                }
            }
            AbstractC10410hs.addAll(arrayList2, arrayList3);
        }
        this.f31590f = arrayList2;
    }

    /* renamed from: d */
    public final Method m58955d(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f31597m) {
            m58948k();
        }
        this.f31600p.invoke();
        if (!this.f31588d) {
            return;
        }
        ArrayList<ViewInfo> arrayList = new ArrayList();
        for (ViewInfo viewInfo : this.f31589e) {
            AbstractC10410hs.addAll(arrayList, CollectionsKt___CollectionsKt.plus((Collection) AbstractC10108ds.listOf(viewInfo), (Iterable) viewInfo.allChildren()));
        }
        for (ViewInfo viewInfo2 : arrayList) {
            if (viewInfo2.hasBounds()) {
                canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getRight(), viewInfo2.getBounds().getBottom()), this.f31602r);
            }
        }
    }

    public final void dispose$ui_tooling_release() {
        this.f31586b.disposeComposition();
        if (this.clock != null) {
            getClock$ui_tooling_release().dispose();
        }
        this.f31603s.getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        this.f31604t.getViewModelStore().clear();
    }

    /* renamed from: e */
    public final String m58954e(Group group, IntRect intRect) {
        String str;
        Iterator<T> it = group.getData().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                str = m58947l(next, intRect.getLeft(), intRect.getRight());
                continue;
            }
        } while (str == null);
        return str;
    }

    /* renamed from: f */
    public final String m58953f(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        if (location == null || (sourceFile = location.getSourceFile()) == null) {
            return "";
        }
        return sourceFile;
    }

    /* renamed from: g */
    public final int m58952g(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    @NotNull
    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock previewAnimationClock = this.clock;
        if (previewAnimationClock != null) {
            return previewAnimationClock;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clock");
        return null;
    }

    @NotNull
    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.f31590f;
    }

    public final boolean getStitchTrees$ui_tooling_release() {
        return this.f31601q;
    }

    @NotNull
    public final List<ViewInfo> getViewInfos$ui_tooling_release() {
        return this.f31589e;
    }

    /* renamed from: h */
    public final boolean m58951h(Group group) {
        Method method;
        Collection<Object> data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        for (Object obj : data) {
            if (obj != null) {
                method = m58955d(obj);
                continue;
            } else {
                method = null;
                continue;
            }
            if (method != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasAnimations() {
        return this.f31593i;
    }

    /* renamed from: i */
    public final boolean m58950i(Group group) {
        if (m58953f(group).length() == 0 && m58952g(group) == -1) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public final void init$ui_tooling_release(@NotNull String className, @NotNull String methodName, @Nullable Class<? extends PreviewParameterProvider<?>> cls, int i, boolean z, boolean z2, long j, boolean z3, boolean z4, @Nullable String str, @NotNull Function0<Unit> onCommit, @NotNull Function0<Unit> onDraw) {
        String str2;
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(onCommit, "onCommit");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.f31588d = z;
        this.f31587c = z2;
        this.f31592h = methodName;
        this.f31597m = z3;
        this.f31598n = z4;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f31599o = str2;
        this.f31600p = onDraw;
        ComposableLambda composableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-1704541905, true, new ComposeViewAdapter$init$3(onCommit, this, j, className, methodName, cls, i));
        this.f31595k = composableLambdaInstance;
        this.f31586b.setContent(composableLambdaInstance);
        invalidate();
    }

    /* renamed from: j */
    public final void m58949j(AttributeSet attributeSet) {
        long j;
        ViewTreeLifecycleOwner.set(this, this.f31603s);
        ViewTreeSavedStateRegistryOwner.set(this, this.f31603s);
        ViewTreeViewModelStoreOwner.set(this, this.f31604t);
        addView(this.f31586b);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        Class<? extends PreviewParameterProvider<?>> cls = null;
        String substringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default(attributeValue, '.', (String) null, 2, (Object) null);
        String substringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(attributeValue, '.', (String) null, 2, (Object) null);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        if (attributeValue2 != null) {
            cls = PreviewUtilsKt.asPreviewProviderClass(attributeValue2);
        }
        try {
            String attributeValue3 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime");
            Intrinsics.checkNotNullExpressionValue(attributeValue3, "attrs.getAttributeValue(…animationClockStartTime\")");
            j = Long.parseLong(attributeValue3);
        } catch (Exception unused) {
            j = -1;
        }
        Class<? extends PreviewParameterProvider<?>> cls2 = cls;
        long j2 = j;
        init$ui_tooling_release$default(this, substringBeforeLast$default, substringAfterLast$default, cls2, attributeIntValue, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.f31588d), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.f31587c), j2, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.f31598n), attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 3072, null);
    }

    /* renamed from: k */
    public final void m58948k() {
        this.f31596l.setValue(ComposableSingletons$ComposeViewAdapterKt.INSTANCE.m73599getLambda3$ui_tooling_release());
        this.f31596l.setValue(this.f31595k);
        invalidate();
    }

    /* renamed from: l */
    public final String m58947l(Object obj, int i, int i2) {
        Method m58955d = m58955d(obj);
        if (m58955d == null) {
            return null;
        }
        try {
            Object invoke = m58955d.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), this.f31599o);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) invoke;
            if (str.length() == 0) {
                return null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final boolean m58946m(Group group) {
        NodeGroup nodeGroup;
        Object obj;
        if (m58950i(group) && group.getChildren().isEmpty()) {
            LayoutInfo layoutInfo = null;
            if (group instanceof NodeGroup) {
                nodeGroup = (NodeGroup) group;
            } else {
                nodeGroup = null;
            }
            if (nodeGroup != null) {
                obj = nodeGroup.getNode();
            } else {
                obj = null;
            }
            if (obj instanceof LayoutInfo) {
                layoutInfo = obj;
            }
            if (layoutInfo == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void m58945n() {
        Set<CompositionData> store = this.f31591g.getStore();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(store, 10));
        for (CompositionData compositionData : store) {
            arrayList.add(m58944o(SlotTreeKt.asTree(compositionData)));
        }
        List<ViewInfo> list = CollectionsKt___CollectionsKt.toList(arrayList);
        if (this.f31601q) {
            list = ShadowViewInfoKt.stitchTrees(list);
        }
        this.f31589e = list;
        if (this.f31587c) {
            ViewInfoUtilKt.toDebugString$default(list, 0, null, 3, null);
        }
    }

    /* renamed from: o */
    public final ViewInfo m58944o(Group group) {
        NodeGroup nodeGroup;
        Object obj;
        int i;
        LayoutInfo layoutInfo = null;
        if (group instanceof NodeGroup) {
            nodeGroup = (NodeGroup) group;
        } else {
            nodeGroup = null;
        }
        if (nodeGroup != null) {
            obj = nodeGroup.getNode();
        } else {
            obj = null;
        }
        if (obj instanceof LayoutInfo) {
            layoutInfo = obj;
        }
        LayoutInfo layoutInfo2 = layoutInfo;
        if (group.getChildren().size() == 1 && m58950i(group) && layoutInfo2 == null) {
            return m58944o((Group) CollectionsKt___CollectionsKt.single(group.getChildren()));
        }
        ArrayList<Group> arrayList = new ArrayList();
        for (Object obj2 : group.getChildren()) {
            if (!m58946m((Group) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList, 10));
        for (Group group2 : arrayList) {
            arrayList2.add(m58944o(group2));
        }
        SourceLocation location = group.getLocation();
        String str = (location == null || (r1 = location.getSourceFile()) == null) ? "" : "";
        SourceLocation location2 = group.getLocation();
        if (location2 != null) {
            i = location2.getLineNumber();
        } else {
            i = -1;
        }
        return new ViewInfo(str, i, group.getBox(), group.getLocation(), arrayList2, layoutInfo2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View rootView = this.f31586b.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "composeView.rootView");
        ViewTreeLifecycleOwner.set(rootView, this.f31603s);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f31594j.throwIfPresent();
        m58945n();
        if (this.f31592h.length() > 0) {
            m58957b();
            if (this.f31598n) {
                m58956c();
            }
        }
    }

    public final void setClock$ui_tooling_release(@NotNull PreviewAnimationClock previewAnimationClock) {
        Intrinsics.checkNotNullParameter(previewAnimationClock, "<set-?>");
        this.clock = previewAnimationClock;
    }

    public final void setDesignInfoList$ui_tooling_release(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f31590f = list;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z) {
        this.f31601q = z;
    }

    public final void setViewInfos$ui_tooling_release(@NotNull List<ViewInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f31589e = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Function2 function2;
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f31585a = "ComposeViewAdapter";
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f31586b = new ComposeView(context2, null, 0, 6, null);
        this.f31589e = CollectionsKt__CollectionsKt.emptyList();
        this.f31590f = CollectionsKt__CollectionsKt.emptyList();
        this.f31591g = CompositionDataRecord.Companion.create();
        this.f31592h = "";
        this.f31594j = new ThreadSafeException();
        this.f31595k = ComposableSingletons$ComposeViewAdapterKt.INSTANCE.m73598getLambda2$ui_tooling_release();
        function2 = ComposeViewAdapterKt.f31614a;
        m31891g = AbstractC19508dK1.m31891g(function2, null, 2, null);
        this.f31596l = m31891g;
        this.f31599o = "";
        this.f31600p = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.f31601q = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m71788toArgb8_81llA(Color.Companion.m71769getRed0d7_KjU()));
        this.f31602r = paint;
        this.f31603s = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.f31604t = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.f31605u = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1

            /* renamed from: a */
            public final OnBackPressedDispatcher f31608a = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            @NotNull
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.f31608a;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            @NotNull
            public LifecycleRegistry getLifecycle() {
                return ComposeViewAdapter.access$getFakeSavedStateRegistryOwner$p(ComposeViewAdapter.this).getLifecycleRegistry();
            }
        };
        this.f31606v = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1

            /* renamed from: a */
            public final C3627x466dc6c4 f31607a = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i2, @NotNull ActivityResultContract<I, O> contract, I i22, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                    Intrinsics.checkNotNullParameter(contract, "contract");
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            @NotNull
            public C3627x466dc6c4 getActivityResultRegistry() {
                return this.f31607a;
            }
        };
        m58949j(attrs);
    }
}
