package androidx.compose.p003ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0012J/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"R \u0010)\u001a\u00020$8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010%\u0012\u0004\b(\u0010\u0003\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u0016\u00101\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00100\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent$ui_release", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent", "", "pointerId", "", "endStream", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/view/MotionEvent;)V", OperatorName.FILL_NON_ZERO, "", "e", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "d", "(I)J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, FirebaseAnalytics.Param.INDEX, "pressed", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", OperatorName.CURVE_TO, "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroid/view/MotionEvent;IZ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", OperatorName.SET_LINE_CAPSTYLE, "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "canHover", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.MotionEventAdapter */
/* loaded from: classes2.dex */
public final class MotionEventAdapter {

    /* renamed from: a */
    public long f29908a;

    /* renamed from: b */
    public final SparseLongArray f29909b = new SparseLongArray();

    /* renamed from: c */
    public final SparseBooleanArray f29910c = new SparseBooleanArray();

    /* renamed from: d */
    public final List f29911d = new ArrayList();

    /* renamed from: e */
    public int f29912e = -1;

    /* renamed from: f */
    public int f29913f = -1;

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    /* renamed from: a */
    public final void m59626a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.f29909b.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.f29909b;
                    long j = this.f29908a;
                    this.f29908a = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f29909b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f29909b;
            long j2 = this.f29908a;
            this.f29908a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f29910c.put(pointerId2, true);
            }
        }
    }

    /* renamed from: b */
    public final void m59625b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType != this.f29912e || source != this.f29913f) {
            this.f29912e = toolType;
            this.f29913f = source;
            this.f29910c.clear();
            this.f29909b.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p003ui.input.pointer.PointerInputEventData m59624c(androidx.compose.p003ui.input.pointer.PositionCalculator r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.MotionEventAdapter.m59624c(androidx.compose.ui.input.pointer.PositionCalculator, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.PointerInputEventData");
    }

    @Nullable
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@NotNull MotionEvent motionEvent, @NotNull PositionCalculator positionCalculator) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f29909b.clear();
            this.f29910c.clear();
            return null;
        }
        m59625b(motionEvent);
        m59626a(motionEvent);
        if (actionMasked != 10 && actionMasked != 7 && actionMasked != 9) {
            z = false;
        } else {
            z = true;
        }
        if (actionMasked == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.f29910c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                i = -1;
            } else {
                i = motionEvent.getActionIndex();
            }
        } else {
            i = 0;
        }
        this.f29911d.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            List list = this.f29911d;
            if (!z && i2 != i && (!z2 || motionEvent.getButtonState() != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            list.add(m59624c(positionCalculator, motionEvent, i2, z3));
        }
        m59621f(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.f29911d, motionEvent);
    }

    /* renamed from: d */
    public final long m59623d(int i) {
        long j;
        int indexOfKey = this.f29909b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.f29909b.valueAt(indexOfKey);
        } else {
            j = this.f29908a;
            this.f29908a = 1 + j;
            this.f29909b.put(i, j);
        }
        return PointerId.m72695constructorimpl(j);
    }

    /* renamed from: e */
    public final boolean m59622e(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    public final void endStream(int i) {
        this.f29910c.delete(i);
        this.f29909b.delete(i);
    }

    /* renamed from: f */
    public final void m59621f(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f29910c.get(pointerId, false)) {
                this.f29909b.delete(pointerId);
                this.f29910c.delete(pointerId);
            }
        }
        if (this.f29909b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f29909b.size() - 1; -1 < size; size--) {
                int keyAt = this.f29909b.keyAt(size);
                if (!m59622e(motionEvent, keyAt)) {
                    this.f29909b.removeAt(size);
                    this.f29910c.delete(keyAt);
                }
            }
        }
    }

    @NotNull
    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.f29909b;
    }
}
