package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0011¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R/\u00101\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b$\u0010/\"\u0004\b(\u00100R+\u00105\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b\"\u00103\"\u0004\b&\u00104R\u001f\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m29142d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleContainer;", "rippleContainer", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/material/ripple/RippleContainer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "drawIndication", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "addRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;Lkotlinx/coroutines/CoroutineScope;)V", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "resetHostView", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", OperatorName.CURVE_TO, "F", "d", "Landroidx/compose/runtime/State;", "e", OperatorName.FILL_NON_ZERO, "Landroidx/compose/material/ripple/RippleContainer;", "Landroidx/compose/material/ripple/RippleHostView;", "<set-?>", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/material/ripple/RippleHostView;", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView", OperatorName.CLOSE_PATH, "()Z", "(Z)V", "invalidateTick", "Landroidx/compose/ui/geometry/Size;", "i", OperatorName.SET_LINE_CAPSTYLE, "rippleSize", "", OperatorName.SET_LINE_JOINSTYLE, "I", "rippleRadius", "Lkotlin/Function0;", OperatorName.NON_STROKING_CMYK, "Lkotlin/jvm/functions/Function0;", "onInvalidateRipple", "material-ripple_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,253:1\n81#2:254\n107#2,2:255\n81#2:257\n107#2,2:258\n137#3:260\n245#4:261\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n139#1:254\n139#1:255,2\n147#1:257\n147#1:258,2\n172#1:260\n186#1:261\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {

    /* renamed from: b */
    public final boolean f25543b;

    /* renamed from: c */
    public final float f25544c;

    /* renamed from: d */
    public final State f25545d;

    /* renamed from: e */
    public final State f25546e;

    /* renamed from: f */
    public final RippleContainer f25547f;

    /* renamed from: g */
    public final MutableState f25548g;

    /* renamed from: h */
    public final MutableState f25549h;

    /* renamed from: i */
    public long f25550i;

    /* renamed from: j */
    public int f25551j;

    /* renamed from: k */
    public final Function0 f25552k;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, State state, State state2, RippleContainer rippleContainer, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state, state2, rippleContainer);
    }

    /* renamed from: a */
    public final void m60679a() {
        this.f25547f.disposeRippleIfNeeded(this);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@NotNull PressInteraction.Press interaction, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        RippleHostView rippleHostView = this.f25547f.getRippleHostView(this);
        rippleHostView.m70361addRippleKOepWvA(interaction, this.f25543b, this.f25550i, this.f25551j, ((Color) this.f25545d.getValue()).m71929unboximpl(), ((RippleAlpha) this.f25546e.getValue()).getPressedAlpha(), this.f25552k);
        m60675e(rippleHostView);
    }

    /* renamed from: b */
    public final boolean m60678b() {
        return ((Boolean) this.f25549h.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final RippleHostView m60677c() {
        return (RippleHostView) this.f25548g.getValue();
    }

    /* renamed from: d */
    public final void m60676d(boolean z) {
        this.f25549h.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
        int mo69616roundToPx0680j_4;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.f25550i = contentDrawScope.mo72328getSizeNHjbRc();
        if (Float.isNaN(this.f25544c)) {
            mo69616roundToPx0680j_4 = AbstractC22237sr0.roundToInt(RippleAnimationKt.m70359getRippleEndRadiuscSwnlzA(contentDrawScope, this.f25543b, contentDrawScope.mo72328getSizeNHjbRc()));
        } else {
            mo69616roundToPx0680j_4 = contentDrawScope.mo69616roundToPx0680j_4(this.f25544c);
        }
        this.f25551j = mo69616roundToPx0680j_4;
        long m71929unboximpl = ((Color) this.f25545d.getValue()).m71929unboximpl();
        float pressedAlpha = ((RippleAlpha) this.f25546e.getValue()).getPressedAlpha();
        contentDrawScope.drawContent();
        m70363drawStateLayerH2RKhps(contentDrawScope, this.f25544c, m71929unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        m60678b();
        RippleHostView m60677c = m60677c();
        if (m60677c != null) {
            m60677c.m70362updateRipplePropertiesbiQXAtU(contentDrawScope.mo72328getSizeNHjbRc(), this.f25551j, m71929unboximpl, pressedAlpha);
            m60677c.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    /* renamed from: e */
    public final void m60675e(RippleHostView rippleHostView) {
        this.f25548g.setValue(rippleHostView);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        m60679a();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        m60679a();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@NotNull PressInteraction.Press interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        RippleHostView m60677c = m60677c();
        if (m60677c != null) {
            m60677c.removeRipple();
        }
    }

    public final void resetHostView() {
        m60675e(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance(boolean z, float f, State color, State rippleAlpha, RippleContainer rippleContainer) {
        super(z, rippleAlpha);
        MutableState m65148g;
        MutableState m65148g2;
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        Intrinsics.checkNotNullParameter(rippleContainer, "rippleContainer");
        this.f25543b = z;
        this.f25544c = f;
        this.f25545d = color;
        this.f25546e = rippleAlpha;
        this.f25547f = rippleContainer;
        m65148g = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f25548g = m65148g;
        m65148g2 = AbstractC19036aL1.m65148g(Boolean.TRUE, null, 2, null);
        this.f25549h = m65148g2;
        this.f25550i = Size.Companion.m71764getZeroNHjbRc();
        this.f25551j = -1;
        this.f25552k = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }
}