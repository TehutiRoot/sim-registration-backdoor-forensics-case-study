package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B$\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\fJ\u0013\u0010\u0016\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\fR!\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR!\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0017R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R+\u00105\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b\u001c\u00103\"\u0004\b!\u00104R+\u00107\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b\u0019\u00103\"\u0004\b\u001f\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, m28850d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "Landroidx/compose/ui/geometry/Offset;", "origin", "Landroidx/compose/ui/unit/Dp;", "radius", "", "bounded", "<init>", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "animate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finish", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "draw", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/geometry/Offset;", "F", OperatorName.CURVE_TO, "Z", "", "d", "Ljava/lang/Float;", "startRadius", "e", "targetRadius", OperatorName.FILL_NON_ZERO, "targetCenter", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/animation/core/Animatable;", "animatedAlpha", OperatorName.CLOSE_PATH, "animatedRadiusPercent", "i", "animatedCenterPercent", "Lkotlinx/coroutines/CompletableDeferred;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlinx/coroutines/CompletableDeferred;", "finishSignalDeferred", "<set-?>", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/runtime/MutableState;", "()Z", "(Z)V", "finishedFadingIn", OperatorName.LINE_TO, "finishRequested", "material-ripple_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,194:1\n81#2:195\n107#2,2:196\n81#2:198\n107#2,2:199\n137#3:201\n214#4,8:202\n261#4,11:210\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n76#1:195\n76#1:196,2\n77#1:198\n77#1:199,2\n130#1:201\n158#1:202,8\n158#1:210,11\n*E\n"})
/* loaded from: classes.dex */
public final class RippleAnimation {

    /* renamed from: a */
    public Offset f25479a;

    /* renamed from: b */
    public final float f25480b;

    /* renamed from: c */
    public final boolean f25481c;

    /* renamed from: d */
    public Float f25482d;

    /* renamed from: e */
    public Float f25483e;

    /* renamed from: f */
    public Offset f25484f;

    /* renamed from: g */
    public final Animatable f25485g;

    /* renamed from: h */
    public final Animatable f25486h;

    /* renamed from: i */
    public final Animatable f25487i;

    /* renamed from: j */
    public final CompletableDeferred f25488j;

    /* renamed from: k */
    public final MutableState f25489k;

    /* renamed from: l */
    public final MutableState f25490l;

    public /* synthetic */ RippleAnimation(Offset offset, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f, z);
    }

    /* renamed from: a */
    public final Object m60721a(Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RippleAnimation$fadeIn$2(this, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animate(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L56
        L47:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.m60721a(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.m60716f(r5)
            kotlinx.coroutines.CompletableDeferred r7 = r2.f25488j
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.m60720b(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public final Object m60720b(Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RippleAnimation$fadeOut$2(this, null), continuation);
        if (coroutineScope == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return coroutineScope;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final boolean m60719c() {
        return ((Boolean) this.f25490l.getValue()).booleanValue();
    }

    /* renamed from: d */
    public final boolean m60718d() {
        return ((Boolean) this.f25489k.getValue()).booleanValue();
    }

    /* renamed from: draw-4WTKRHQ  reason: not valid java name */
    public final void m70174draw4WTKRHQ(@NotNull DrawScope draw, long j) {
        float floatValue;
        Float valueOf;
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (this.f25482d == null) {
            this.f25482d = Float.valueOf(RippleAnimationKt.m70176getRippleStartRadiusuvyYCjk(draw.mo72144getSizeNHjbRc()));
        }
        if (this.f25483e == null) {
            if (Float.isNaN(this.f25480b)) {
                valueOf = Float.valueOf(RippleAnimationKt.m70175getRippleEndRadiuscSwnlzA(draw, this.f25481c, draw.mo72144getSizeNHjbRc()));
            } else {
                valueOf = Float.valueOf(draw.mo69438toPx0680j_4(this.f25480b));
            }
            this.f25483e = valueOf;
        }
        if (this.f25479a == null) {
            this.f25479a = Offset.m71491boximpl(draw.mo72143getCenterF1C5BW0());
        }
        if (this.f25484f == null) {
            this.f25484f = Offset.m71491boximpl(OffsetKt.Offset(Size.m71571getWidthimpl(draw.mo72144getSizeNHjbRc()) / 2.0f, Size.m71568getHeightimpl(draw.mo72144getSizeNHjbRc()) / 2.0f));
        }
        if (m60719c() && !m60718d()) {
            floatValue = 1.0f;
        } else {
            floatValue = ((Number) this.f25485g.getValue()).floatValue();
        }
        Float f = this.f25482d;
        Intrinsics.checkNotNull(f);
        float floatValue2 = f.floatValue();
        Float f2 = this.f25483e;
        Intrinsics.checkNotNull(f2);
        float lerp = MathHelpersKt.lerp(floatValue2, f2.floatValue(), ((Number) this.f25486h.getValue()).floatValue());
        Offset offset = this.f25479a;
        Intrinsics.checkNotNull(offset);
        float m71502getXimpl = Offset.m71502getXimpl(offset.m71512unboximpl());
        Offset offset2 = this.f25484f;
        Intrinsics.checkNotNull(offset2);
        float lerp2 = MathHelpersKt.lerp(m71502getXimpl, Offset.m71502getXimpl(offset2.m71512unboximpl()), ((Number) this.f25487i.getValue()).floatValue());
        Offset offset3 = this.f25479a;
        Intrinsics.checkNotNull(offset3);
        float m71503getYimpl = Offset.m71503getYimpl(offset3.m71512unboximpl());
        Offset offset4 = this.f25484f;
        Intrinsics.checkNotNull(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m71503getYimpl, Offset.m71503getYimpl(offset4.m71512unboximpl()), ((Number) this.f25487i.getValue()).floatValue()));
        long m71734copywmQWz5c$default = Color.m71734copywmQWz5c$default(j, Color.m71737getAlphaimpl(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.f25481c) {
            float m71571getWidthimpl = Size.m71571getWidthimpl(draw.mo72144getSizeNHjbRc());
            float m71568getHeightimpl = Size.m71568getHeightimpl(draw.mo72144getSizeNHjbRc());
            int m71724getIntersectrtfAjoo = ClipOp.Companion.m71724getIntersectrtfAjoo();
            DrawContext drawContext = draw.getDrawContext();
            long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo72153clipRectN_I0leg(0.0f, 0.0f, m71571getWidthimpl, m71568getHeightimpl, m71724getIntersectrtfAjoo);
            AbstractC12212lK.m26490x(draw, m71734copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            drawContext.getCanvas().restore();
            drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
            return;
        }
        AbstractC12212lK.m26490x(draw, m71734copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
    }

    /* renamed from: e */
    public final void m60717e(boolean z) {
        this.f25490l.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void m60716f(boolean z) {
        this.f25489k.setValue(Boolean.valueOf(z));
    }

    public final void finish() {
        m60717e(true);
        this.f25488j.complete(Unit.INSTANCE);
    }

    public RippleAnimation(Offset offset, float f, boolean z) {
        MutableState m31891g;
        MutableState m31891g2;
        this.f25479a = offset;
        this.f25480b = f;
        this.f25481c = z;
        this.f25485g = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f25486h = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f25487i = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f25488j = CompletableDeferredKt.CompletableDeferred((Job) null);
        Boolean bool = Boolean.FALSE;
        m31891g = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f25489k = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(bool, null, 2, null);
        this.f25490l = m31891g2;
    }
}
