package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.input.key.Key_androidKt;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\r8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001b\u0010\u0012\u001a\u00020\u0001*\u00020\r8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\"\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\r8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\b\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "", "isComposeRootInScrollableContainer", "(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z", "Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/view/View;)Z", "", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getTapIndicationDelay", "()J", "TapIndicationDelay", "Landroidx/compose/ui/input/key/KeyEvent;", "isPress-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isPress", "isClick-ZmokQxo", "isClick", "isEnter", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Clickable_androidKt {

    /* renamed from: a */
    public static final long f12825a = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public static final boolean m61599a(KeyEvent keyEvent) {
        int m72611getNativeKeyCodeYVgTNJs = Key_androidKt.m72611getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m72604getKeyZmokQxo(keyEvent));
        if (m72611getNativeKeyCodeYVgTNJs != 23 && m72611getNativeKeyCodeYVgTNJs != 66 && m72611getNativeKeyCodeYVgTNJs != 160) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m61598b(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final long getTapIndicationDelay() {
        return f12825a;
    }

    /* renamed from: isClick-ZmokQxo  reason: not valid java name */
    public static final boolean m69355isClickZmokQxo(@NotNull KeyEvent isClick) {
        Intrinsics.checkNotNullParameter(isClick, "$this$isClick");
        if (KeyEventType.m72597equalsimpl0(KeyEvent_androidKt.m72605getTypeZmokQxo(isClick), KeyEventType.Companion.m72602getKeyUpCS__XNY()) && m61599a(isClick)) {
            return true;
        }
        return false;
    }

    public static final boolean isComposeRootInScrollableContainer(@NotNull CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        Intrinsics.checkNotNullParameter(compositionLocalConsumerModifierNode, "<this>");
        return m61598b((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(compositionLocalConsumerModifierNode, AndroidCompositionLocals_androidKt.getLocalView()));
    }

    /* renamed from: isPress-ZmokQxo  reason: not valid java name */
    public static final boolean m69356isPressZmokQxo(@NotNull KeyEvent isPress) {
        Intrinsics.checkNotNullParameter(isPress, "$this$isPress");
        if (KeyEventType.m72597equalsimpl0(KeyEvent_androidKt.m72605getTypeZmokQxo(isPress), KeyEventType.Companion.m72601getKeyDownCS__XNY()) && m61599a(isPress)) {
            return true;
        }
        return false;
    }
}
