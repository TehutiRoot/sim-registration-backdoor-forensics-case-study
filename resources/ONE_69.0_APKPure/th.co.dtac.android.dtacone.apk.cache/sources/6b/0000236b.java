package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.input.pointer.PointerId;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Metadata(m29143d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J'\u0010\u0016\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u0018\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010%J%\u0010'\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010%J%\u0010(\u001a\u00020#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010%J9\u0010/\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.JE\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u0002002\"\u00105\u001a\u001e\b\u0001\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020003\u0012\u0006\u0012\u0004\u0018\u00010402H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u00020\u0019*\u00020\u000b¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010;R!\u0010=\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010<R\u0014\u0010?\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010>R\u0014\u0010@\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0014\u0010A\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010>R\u0014\u0010B\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010>R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010DR\u0014\u0010F\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010>R\u0014\u0010G\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010>R\u0014\u0010H\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u0014\u0010I\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00190J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR(\u0010S\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bR\u0010\u001b\u001a\u0004\bO\u0010\n\"\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010NR\u001f\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bW\u0010XR#\u0010]\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00190+8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b[\u0010\\R!\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010g\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010h\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\n\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006i"}, m29142d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/compose/foundation/OverscrollConfiguration;", "overscrollConfig", "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "", OperatorName.LINE_TO, "()Z", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroid/widget/EdgeEffect;", OneNadOutboundSearchFragment.POSITION_LEFT, "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", OperatorName.CURVE_TO, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "e", OneNadOutboundSearchFragment.POSITION_RIGHT, "d", "bottom", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "", OperatorName.FILL_NON_ZERO, "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/geometry/Offset;", "delta", OperatorName.NON_STROKING_CMYK, "(J)Z", "scroll", "displacement", "", OperatorName.SET_LINE_JOINSTYLE, "(JJ)F", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "drawOverscroll", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/OverscrollConfiguration;", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "leftEffect", "rightEffect", "", "Ljava/util/List;", "allEffects", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "redrawSignal", OperatorName.MOVE_TO, "Z", "getInvalidationEnabled$foundation_release", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "invalidationEnabled", OperatorName.ENDPATH, "scrollCycleInProgress", "Landroidx/compose/ui/geometry/Size;", "o", OperatorName.SET_LINE_CAPSTYLE, "containerSize", "Landroidx/compose/ui/unit/IntSize;", "p", "Lkotlin/jvm/functions/Function1;", "onNewSize", "Landroidx/compose/ui/input/pointer/PointerId;", OperatorName.SAVE, "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/Modifier;", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "effectModifier", "isInProgress", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,589:1\n33#2,6:590\n101#2,2:597\n33#2,6:599\n103#2:605\n33#2,6:607\n135#3:596\n245#4:606\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n123#1:590,6\n266#1:597,2\n266#1:599,6\n266#1:605\n445#1:607,6\n341#1:596\n351#1:606\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    /* renamed from: a */
    public final OverscrollConfiguration f12857a;

    /* renamed from: b */
    public Offset f12858b;

    /* renamed from: c */
    public final EdgeEffect f12859c;

    /* renamed from: d */
    public final EdgeEffect f12860d;

    /* renamed from: e */
    public final EdgeEffect f12861e;

    /* renamed from: f */
    public final EdgeEffect f12862f;

    /* renamed from: g */
    public final List f12863g;

    /* renamed from: h */
    public final EdgeEffect f12864h;

    /* renamed from: i */
    public final EdgeEffect f12865i;

    /* renamed from: j */
    public final EdgeEffect f12866j;

    /* renamed from: k */
    public final EdgeEffect f12867k;

    /* renamed from: l */
    public final MutableState f12868l;

    /* renamed from: m */
    public boolean f12869m;

    /* renamed from: n */
    public boolean f12870n;

    /* renamed from: o */
    public long f12871o;

    /* renamed from: p */
    public final Function1 f12872p;

    /* renamed from: q */
    public PointerId f12873q;

    /* renamed from: r */
    public final Modifier f12874r;

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull OverscrollConfiguration overscrollConfig) {
        Modifier modifier;
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.f12857a = overscrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, null);
        this.f12859c = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, null);
        this.f12860d = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, null);
        this.f12861e = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, null);
        this.f12862f = create4;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EdgeEffect[]{create3, create, create4, create2});
        this.f12863g = listOf;
        this.f12864h = edgeEffectCompat.create(context, null);
        this.f12865i = edgeEffectCompat.create(context, null);
        this.f12866j = edgeEffectCompat.create(context, null);
        this.f12867k = edgeEffectCompat.create(context, null);
        int size = listOf.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) listOf.get(i)).setColor(ColorKt.m71972toArgb8_81llA(this.f12857a.m69565getGlowColor0d7_KjU()));
        }
        Unit unit = Unit.INSTANCE;
        this.f12868l = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
        this.f12869m = true;
        this.f12871o = Size.Companion.m71764getZeroNHjbRc();
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.f12872p = androidEdgeEffectOverscrollEffect$onNewSize$1;
        Modifier.Companion companion = Modifier.Companion;
        modifier = AndroidOverscrollKt.f12875a;
        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(companion.then(modifier), unit, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), androidEdgeEffectOverscrollEffect$onNewSize$1);
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C2748x9a0aa7c(this);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        this.f12874r = onSizeChanged.then(new C12197lK(this, noInspectorInfo));
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    /* renamed from: a */
    public final void m61582a() {
        List list = this.f12863g;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            m61577f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @org.jetbrains.annotations.Nullable
    /* renamed from: applyToFling-BMRW4eQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo69499applyToFlingBMRW4eQ(long r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.p003ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super androidx.compose.p003ui.unit.Velocity>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo69499applyToFlingBMRW4eQ(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140 A[ADDED_TO_REGION] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo69500applyToScrollRhakbz0(long r18, int r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.p003ui.geometry.Offset, androidx.compose.p003ui.geometry.Offset> r21) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.mo69500applyToScrollRhakbz0(long, int, kotlin.jvm.functions.Function1):long");
    }

    /* renamed from: b */
    public final boolean m61581b(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m71755getWidthimpl(this.f12871o), (-Size.m71752getHeightimpl(this.f12871o)) + drawScope.mo69622toPx0680j_4(this.f12857a.getDrawPadding().mo69342calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: c */
    public final boolean m61580c(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m71752getHeightimpl(this.f12871o), drawScope.mo69622toPx0680j_4(this.f12857a.getDrawPadding().mo69343calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: d */
    public final boolean m61579d(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int roundToInt = AbstractC22237sr0.roundToInt(Size.m71755getWidthimpl(this.f12871o));
        float mo69344calculateRightPaddingu2uoSUM = this.f12857a.getDrawPadding().mo69344calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + drawScope.mo69622toPx0680j_4(mo69344calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void drawOverscroll(@NotNull DrawScope drawScope) {
        boolean z;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (Size.m71757isEmptyimpl(this.f12871o)) {
            return;
        }
        androidx.compose.p003ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.f12868l.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.f12866j) != 0.0f) {
            m61579d(drawScope, this.f12866j, nativeCanvas);
            this.f12866j.finish();
        }
        boolean z2 = false;
        if (!this.f12861e.isFinished()) {
            z = m61580c(drawScope, this.f12861e, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.f12866j, edgeEffectCompat.getDistanceCompat(this.f12861e), 0.0f);
        } else {
            z = false;
        }
        if (edgeEffectCompat.getDistanceCompat(this.f12864h) != 0.0f) {
            m61581b(drawScope, this.f12864h, nativeCanvas);
            this.f12864h.finish();
        }
        if (!this.f12859c.isFinished()) {
            if (!m61578e(drawScope, this.f12859c, nativeCanvas) && !z) {
                z = false;
            } else {
                z = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.f12864h, edgeEffectCompat.getDistanceCompat(this.f12859c), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.f12867k) != 0.0f) {
            m61580c(drawScope, this.f12867k, nativeCanvas);
            this.f12867k.finish();
        }
        if (!this.f12862f.isFinished()) {
            if (!m61579d(drawScope, this.f12862f, nativeCanvas) && !z) {
                z = false;
            } else {
                z = true;
            }
            edgeEffectCompat.onPullDistanceCompat(this.f12867k, edgeEffectCompat.getDistanceCompat(this.f12862f), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.f12865i) != 0.0f) {
            m61578e(drawScope, this.f12865i, nativeCanvas);
            this.f12865i.finish();
        }
        if (!this.f12860d.isFinished()) {
            z2 = (m61581b(drawScope, this.f12860d, nativeCanvas) || z) ? true : true;
            edgeEffectCompat.onPullDistanceCompat(this.f12865i, edgeEffectCompat.getDistanceCompat(this.f12860d), 0.0f);
            z = z2;
        }
        if (z) {
            m61577f();
        }
    }

    /* renamed from: e */
    public final boolean m61578e(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo69622toPx0680j_4(this.f12857a.getDrawPadding().mo69345calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: f */
    public final void m61577f() {
        if (this.f12869m) {
            this.f12868l.setValue(Unit.INSTANCE);
        }
    }

    /* renamed from: g */
    public final float m61576g(long j, long j2) {
        float m71686getXimpl = Offset.m71686getXimpl(j2) / Size.m71755getWidthimpl(this.f12871o);
        float m71687getYimpl = Offset.m71687getYimpl(j) / Size.m71752getHeightimpl(this.f12871o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float m71752getHeightimpl = (-edgeEffectCompat.onPullDistanceCompat(this.f12860d, -m71687getYimpl, 1 - m71686getXimpl)) * Size.m71752getHeightimpl(this.f12871o);
        if (edgeEffectCompat.getDistanceCompat(this.f12860d) != 0.0f) {
            return Offset.m71687getYimpl(j);
        }
        return m71752getHeightimpl;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public Modifier getEffectModifier() {
        return this.f12874r;
    }

    public final boolean getInvalidationEnabled$foundation_release() {
        return this.f12869m;
    }

    /* renamed from: h */
    public final float m61575h(long j, long j2) {
        float m71687getYimpl = Offset.m71687getYimpl(j2) / Size.m71752getHeightimpl(this.f12871o);
        float m71686getXimpl = Offset.m71686getXimpl(j) / Size.m71755getWidthimpl(this.f12871o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.f12861e, m71686getXimpl, 1 - m71687getYimpl) * Size.m71755getWidthimpl(this.f12871o);
        if (edgeEffectCompat.getDistanceCompat(this.f12861e) != 0.0f) {
            return Offset.m71686getXimpl(j);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: i */
    public final float m61574i(long j, long j2) {
        float m71687getYimpl = Offset.m71687getYimpl(j2) / Size.m71752getHeightimpl(this.f12871o);
        float m71686getXimpl = Offset.m71686getXimpl(j) / Size.m71755getWidthimpl(this.f12871o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float m71755getWidthimpl = (-edgeEffectCompat.onPullDistanceCompat(this.f12862f, -m71686getXimpl, m71687getYimpl)) * Size.m71755getWidthimpl(this.f12871o);
        if (edgeEffectCompat.getDistanceCompat(this.f12862f) != 0.0f) {
            return Offset.m71686getXimpl(j);
        }
        return m71755getWidthimpl;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        boolean z;
        List list = this.f12863g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (EdgeEffectCompat.INSTANCE.getDistanceCompat((EdgeEffect) list.get(i)) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final float m61573j(long j, long j2) {
        float m71686getXimpl = Offset.m71686getXimpl(j2) / Size.m71755getWidthimpl(this.f12871o);
        float m71687getYimpl = Offset.m71687getYimpl(j) / Size.m71752getHeightimpl(this.f12871o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float onPullDistanceCompat = edgeEffectCompat.onPullDistanceCompat(this.f12859c, m71687getYimpl, m71686getXimpl) * Size.m71752getHeightimpl(this.f12871o);
        if (edgeEffectCompat.getDistanceCompat(this.f12859c) != 0.0f) {
            return Offset.m71687getYimpl(j);
        }
        return onPullDistanceCompat;
    }

    /* renamed from: k */
    public final boolean m61572k(long j) {
        boolean z;
        boolean z2 = false;
        if (!this.f12861e.isFinished() && Offset.m71686getXimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.f12861e, Offset.m71686getXimpl(j));
            z = this.f12861e.isFinished();
        } else {
            z = false;
        }
        if (!this.f12862f.isFinished() && Offset.m71686getXimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.f12862f, Offset.m71686getXimpl(j));
            if (!z && !this.f12862f.isFinished()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!this.f12859c.isFinished() && Offset.m71687getYimpl(j) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.f12859c, Offset.m71687getYimpl(j));
            if (!z && !this.f12859c.isFinished()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!this.f12860d.isFinished() && Offset.m71687getYimpl(j) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.f12860d, Offset.m71687getYimpl(j));
            return (z || this.f12860d.isFinished()) ? true : true;
        }
        return z;
    }

    /* renamed from: l */
    public final boolean m61571l() {
        boolean z;
        long m71765getCenteruvyYCjk = SizeKt.m71765getCenteruvyYCjk(this.f12871o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.f12861e) == 0.0f) {
            z = false;
        } else {
            m61575h(Offset.Companion.m71702getZeroF1C5BW0(), m71765getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.f12862f) != 0.0f) {
            m61574i(Offset.Companion.m71702getZeroF1C5BW0(), m71765getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.f12859c) != 0.0f) {
            m61573j(Offset.Companion.m71702getZeroF1C5BW0(), m71765getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.f12860d) == 0.0f) {
            return z;
        }
        m61576g(Offset.Companion.m71702getZeroF1C5BW0(), m71765getCenteruvyYCjk);
        return true;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.f12869m = z;
    }
}