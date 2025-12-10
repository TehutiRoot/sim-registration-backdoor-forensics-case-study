package androidx.compose.p003ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInteropFilter;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m28850d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", OperatorName.CURVE_TO, "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "getShareWithSiblings", "()Z", "shareWithSiblings", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,349:1\n101#2,2:350\n33#2,6:352\n103#2:358\n86#2,2:359\n33#2,6:361\n88#2:367\n101#2,2:368\n33#2,6:370\n103#2:376\n33#2,6:377\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:350,2\n223#1:352,6\n223#1:358\n238#1:359,2\n238#1:361,6\n238#1:367\n280#1:368,2\n280#1:370,6\n280#1:376\n314#1:377,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1 */
/* loaded from: classes2.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    /* renamed from: c */
    public PointerInteropFilter.DispatchToViewState f29991c = PointerInteropFilter.DispatchToViewState.Unknown;

    /* renamed from: d */
    public final /* synthetic */ PointerInteropFilter f29992d;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f29992d = pointerInteropFilter;
    }

    /* renamed from: a */
    public final void m59603a(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).isConsumed()) {
                if (this.f29991c == PointerInteropFilter.DispatchToViewState.Dispatching) {
                    LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                    if (layoutCoordinates$ui_release != null) {
                        PointerInteropUtils_androidKt.m72757toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release.mo72818localToRootMKHz9U(Offset.Companion.m71518getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.f29992d));
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.f29991c = PointerInteropFilter.DispatchToViewState.NotDispatching;
                return;
            }
        }
        LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
        if (layoutCoordinates$ui_release2 != null) {
            PointerInteropUtils_androidKt.m72758toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release2.mo72818localToRootMKHz9U(Offset.Companion.m71518getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.f29992d));
            if (this.f29991c == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
                InternalPointerEvent internalPointerEvent$ui_release = pointerEvent.getInternalPointerEvent$ui_release();
                if (internalPointerEvent$ui_release != null) {
                    internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.f29992d.getDisallowIntercept$ui_release());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    /* renamed from: b */
    public final void m59602b() {
        this.f29991c = PointerInteropFilter.DispatchToViewState.Unknown;
        this.f29992d.setDisallowIntercept$ui_release(false);
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.p003ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.f29991c == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.f29992d));
            m59602b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.p003ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo72733onPointerEventH0pRuoY(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.input.pointer.PointerEvent r5, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.input.pointer.PointerEventPass r6, long r7) {
        /*
            r4 = this;
            java.lang.String r7 = "pointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r7 = "pass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.util.List r7 = r5.getChanges()
            androidx.compose.ui.input.pointer.PointerInteropFilter r8 = r4.f29992d
            boolean r8 = r8.getDisallowIntercept$ui_release()
            r0 = 0
            if (r8 != 0) goto L36
            int r8 = r7.size()
            r1 = 0
        L1c:
            if (r1 >= r8) goto L34
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p003ui.input.pointer.PointerInputChange) r2
            boolean r3 = androidx.compose.p003ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r2)
            if (r3 != 0) goto L36
            boolean r2 = androidx.compose.p003ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r2)
            if (r2 == 0) goto L31
            goto L36
        L31:
            int r1 = r1 + 1
            goto L1c
        L34:
            r8 = 0
            goto L37
        L36:
            r8 = 1
        L37:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r1 = r4.f29991c
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = androidx.compose.p003ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r1 == r2) goto L4f
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p003ui.input.pointer.PointerEventPass.Initial
            if (r6 != r1) goto L46
            if (r8 == 0) goto L46
            r4.m59603a(r5)
        L46:
            androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p003ui.input.pointer.PointerEventPass.Final
            if (r6 != r1) goto L4f
            if (r8 != 0) goto L4f
            r4.m59603a(r5)
        L4f:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p003ui.input.pointer.PointerEventPass.Final
            if (r6 != r5) goto L6c
            int r5 = r7.size()
        L57:
            if (r0 >= r5) goto L69
            java.lang.Object r6 = r7.get(r0)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p003ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.p003ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r6)
            if (r6 != 0) goto L66
            goto L6c
        L66:
            int r0 = r0 + 1
            goto L57
        L69:
            r4.m59602b()
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.mo72733onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }
}
