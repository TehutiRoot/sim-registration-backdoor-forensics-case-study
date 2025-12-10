package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.key.Key;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.KeyInputModifierNode;
import androidx.compose.p003ui.input.pointer.PointerEvent;
import androidx.compose.p003ui.input.pointer.PointerEventPass;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.node.PointerInputModifierNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode {

    /* renamed from: p */
    public MutableInteractionSource f12842p;

    /* renamed from: q */
    public boolean f12843q;

    /* renamed from: r */
    public String f12844r;

    /* renamed from: s */
    public Role f12845s;

    /* renamed from: t */
    public Function0 f12846t;

    /* renamed from: u */
    public final InteractionData f12847u;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m29142d2 = {"Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "", "<init>", "()V", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "getCurrentKeyPressInteractions", "()Ljava/util/Map;", "currentKeyPressInteractions", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getPressInteraction", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "setPressInteraction", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "pressInteraction", "Landroidx/compose/ui/geometry/Offset;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getCentreOffset-F1C5BW0", "()J", "setCentreOffset-k-4lQ0M", "(J)V", "centreOffset", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class InteractionData {
        public static final int $stable = 8;

        /* renamed from: b */
        public PressInteraction.Press f12849b;

        /* renamed from: a */
        public final Map f12848a = new LinkedHashMap();

        /* renamed from: c */
        public long f12850c = Offset.Companion.m71702getZeroF1C5BW0();

        /* renamed from: getCentreOffset-F1C5BW0  reason: not valid java name */
        public final long m69497getCentreOffsetF1C5BW0() {
            return this.f12850c;
        }

        @NotNull
        public final Map<Key, PressInteraction.Press> getCurrentKeyPressInteractions() {
            return this.f12848a;
        }

        @Nullable
        public final PressInteraction.Press getPressInteraction() {
            return this.f12849b;
        }

        /* renamed from: setCentreOffset-k-4lQ0M  reason: not valid java name */
        public final void m69498setCentreOffsetk4lQ0M(long j) {
            this.f12850c = j;
        }

        public final void setPressInteraction(@Nullable PressInteraction.Press press) {
            this.f12849b = press;
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, role, function0);
    }

    /* renamed from: d */
    public final void m61592d() {
        PressInteraction.Press pressInteraction = this.f12847u.getPressInteraction();
        if (pressInteraction != null) {
            this.f12842p.tryEmit(new PressInteraction.Cancel(pressInteraction));
        }
        for (PressInteraction.Press press : this.f12847u.getCurrentKeyPressInteractions().values()) {
            this.f12842p.tryEmit(new PressInteraction.Cancel(press));
        }
        this.f12847u.setPressInteraction(null);
        this.f12847u.getCurrentKeyPressInteractions().clear();
    }

    /* renamed from: e */
    public abstract AbstractClickablePointerInputNode mo61477e();

    /* renamed from: f */
    public final InteractionData m61591f() {
        return this.f12847u;
    }

    /* renamed from: g */
    public final void m61590g(MutableInteractionSource interactionSource, boolean z, String str, Role role, Function0 onClick) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (!Intrinsics.areEqual(this.f12842p, interactionSource)) {
            m61592d();
            this.f12842p = interactionSource;
        }
        if (this.f12843q != z) {
            if (!z) {
                m61592d();
            }
            this.f12843q = z;
        }
        this.f12844r = str;
        this.f12845s = role;
        this.f12846t = onClick;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return AbstractC18033Ll1.m67510a(this);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        mo61477e().onCancelPointerInput();
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        AbstractC18033Ll1.m67509b(this);
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onDetach() {
        m61592d();
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo69365onKeyEventZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f12843q && Clickable_androidKt.m69542isPressZmokQxo(event)) {
            if (this.f12847u.getCurrentKeyPressInteractions().containsKey(Key.m72477boximpl(KeyEvent_androidKt.m72788getKeyZmokQxo(event)))) {
                return false;
            }
            PressInteraction.Press press = new PressInteraction.Press(this.f12847u.m69497getCentreOffsetF1C5BW0(), null);
            this.f12847u.getCurrentKeyPressInteractions().put(Key.m72477boximpl(KeyEvent_androidKt.m72788getKeyZmokQxo(event)), press);
            AbstractC1539Vc.m65885e(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
        } else if (!this.f12843q || !Clickable_androidKt.m69541isClickZmokQxo(event)) {
            return false;
        } else {
            PressInteraction.Press remove = this.f12847u.getCurrentKeyPressInteractions().remove(Key.m72477boximpl(KeyEvent_androidKt.m72788getKeyZmokQxo(event)));
            if (remove != null) {
                AbstractC1539Vc.m65885e(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, remove, null), 3, null);
            }
            this.f12846t.invoke();
        }
        return true;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public void mo69496onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        mo61477e().mo69496onPointerEventH0pRuoY(pointerEvent, pass, j);
    }

    @Override // androidx.compose.p003ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo69366onPreKeyEventZmokQxo(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        AbstractC18033Ll1.m67508c(this);
    }

    @Override // androidx.compose.p003ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return AbstractC18033Ll1.m67507d(this);
    }

    public AbstractClickableNode(MutableInteractionSource interactionSource, boolean z, String str, Role role, Function0 onClick) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12842p = interactionSource;
        this.f12843q = z;
        this.f12844r = str;
        this.f12845s = role;
        this.f12846t = onClick;
        this.f12847u = new InteractionData();
    }
}