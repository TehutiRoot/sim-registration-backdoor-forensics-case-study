package androidx.compose.p003ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.internal.ViewUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\u00020\u00198\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R \u0010!\u001a\u00020\u001e8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0012R3\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00108\u0006@@X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010&R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "<init>", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Landroid/view/MotionEvent;", "motionEvent", "copy", "(Ljava/util/List;Landroid/view/MotionEvent;)Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventType;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()I", "Ljava/util/List;", "getChanges", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "Landroidx/compose/ui/input/pointer/PointerButtons;", OperatorName.CURVE_TO, "I", "getButtons-ry648PA", "buttons", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "d", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", "e", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "type", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,201:1\n33#2,6:202\n33#2,6:208\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n71#1:202,6\n96#1:208,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerEvent */
/* loaded from: classes2.dex */
public final class PointerEvent {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f29924a;

    /* renamed from: b */
    public final InternalPointerEvent f29925b;

    /* renamed from: c */
    public final int f29926c;

    /* renamed from: d */
    public final int f29927d;

    /* renamed from: e */
    public int f29928e;

    public PointerEvent(@NotNull List<PointerInputChange> changes, @Nullable InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.f29924a = changes;
        this.f29925b = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.f29926c = PointerButtons.m72650constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.f29927d = PointerKeyboardModifiers.m72760constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.f29928e = m59618a();
    }

    /* renamed from: a */
    public final int m59618a() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.Companion.m72673getScroll7fucELk();
                            case 9:
                                return PointerEventType.Companion.m72668getEnter7fucELk();
                            case 10:
                                return PointerEventType.Companion.m72669getExit7fucELk();
                            default:
                                return PointerEventType.Companion.m72674getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.Companion.m72670getMove7fucELk();
                }
                return PointerEventType.Companion.m72672getRelease7fucELk();
            }
            return PointerEventType.Companion.m72671getPress7fucELk();
        }
        List list = this.f29924a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m72672getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m72671getPress7fucELk();
            }
        }
        return PointerEventType.Companion.m72670getMove7fucELk();
    }

    @NotNull
    public final List<PointerInputChange> component1() {
        return this.f29924a;
    }

    @NotNull
    public final PointerEvent copy(@NotNull List<PointerInputChange> changes, @Nullable MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(changes, "changes");
        if (motionEvent == null) {
            return new PointerEvent(changes, null);
        }
        if (Intrinsics.areEqual(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(changes, this.f29925b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(changes.size());
        ArrayList arrayList = new ArrayList(changes.size());
        int size = changes.size();
        int i = 0;
        while (i < size) {
            PointerInputChange pointerInputChange = changes.get(i);
            linkedHashMap.put(PointerId.m72694boximpl(pointerInputChange.m72713getIdJ3iCeTQ()), pointerInputChange);
            long m72713getIdJ3iCeTQ = pointerInputChange.m72713getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long m72714getPositionF1C5BW0 = pointerInputChange.m72714getPositionF1C5BW0();
            long m72714getPositionF1C5BW02 = pointerInputChange.m72714getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int m72717getTypeT8wyACA = pointerInputChange.m72717getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.f29925b;
            int i2 = i;
            if (internalPointerEvent != null && internalPointerEvent.m72648issuesEnterExitEvent0FcD4WY(pointerInputChange.m72713getIdJ3iCeTQ())) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new PointerInputEventData(m72713getIdJ3iCeTQ, uptimeMillis, m72714getPositionF1C5BW0, m72714getPositionF1C5BW02, pressed, pressure, m72717getTypeT8wyACA, z, null, 0L, ViewUtils.EDGE_TO_EDGE_FLAGS, null));
            i = i2 + 1;
        }
        return new PointerEvent(changes, new InternalPointerEvent(linkedHashMap, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA */
    public final int m72656getButtonsry648PA() {
        return this.f29926c;
    }

    @NotNull
    public final List<PointerInputChange> getChanges() {
        return this.f29924a;
    }

    @Nullable
    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.f29925b;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public final int m72657getKeyboardModifiersk7X9c1A() {
        return this.f29927d;
    }

    @Nullable
    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.f29925b;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk */
    public final int m72658getType7fucELk() {
        return this.f29928e;
    }

    /* renamed from: setType-EhbLWgg$ui_release */
    public final void m72659setTypeEhbLWgg$ui_release(int i) {
        this.f29928e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerEvent(@NotNull List<PointerInputChange> changes) {
        this(changes, null);
        Intrinsics.checkNotNullParameter(changes, "changes");
    }
}
