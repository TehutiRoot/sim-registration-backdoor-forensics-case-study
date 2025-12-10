package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.Velocity;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012<\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u0019\u0012<\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\u0017*\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:RP\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u00198\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b;\u0010<RP\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0010¢\u0006\u0002\b\u00198\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, m29142d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/DraggableState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "create", "()Landroidx/compose/foundation/gestures/DraggableNode;", "node", "update", "(Landroidx/compose/foundation/gestures/DraggableNode;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/gestures/DraggableState;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "d", "Landroidx/compose/foundation/gestures/Orientation;", "e", "Z", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", OperatorName.NON_STROKING_GRAY, "Lkotlin/jvm/functions/Function0;", OperatorName.CLOSE_PATH, "Lkotlin/jvm/functions/Function3;", "i", OperatorName.SET_LINE_JOINSTYLE, "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableElement extends ModifierNodeElement<DraggableNode> {

    /* renamed from: b */
    public final DraggableState f13058b;

    /* renamed from: c */
    public final Function1 f13059c;

    /* renamed from: d */
    public final Orientation f13060d;

    /* renamed from: e */
    public final boolean f13061e;

    /* renamed from: f */
    public final MutableInteractionSource f13062f;

    /* renamed from: g */
    public final Function0 f13063g;

    /* renamed from: h */
    public final Function3 f13064h;

    /* renamed from: i */
    public final Function3 f13065i;

    /* renamed from: j */
    public final boolean f13066j;

    public DraggableElement(@NotNull DraggableState state, @NotNull Function1<? super PointerInputChange, Boolean> canDrag, @NotNull Orientation orientation, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function0<Boolean> startDragImmediately, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        this.f13058b = state;
        this.f13059c = canDrag;
        this.f13060d = orientation;
        this.f13061e = z;
        this.f13062f = mutableInteractionSource;
        this.f13063g = startDragImmediately;
        this.f13064h = onDragStarted;
        this.f13065i = onDragStopped;
        this.f13066j = z2;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(DraggableElement.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DraggableElement");
        DraggableElement draggableElement = (DraggableElement) obj;
        if (Intrinsics.areEqual(this.f13058b, draggableElement.f13058b) && Intrinsics.areEqual(this.f13059c, draggableElement.f13059c) && this.f13060d == draggableElement.f13060d && this.f13061e == draggableElement.f13061e && Intrinsics.areEqual(this.f13062f, draggableElement.f13062f) && Intrinsics.areEqual(this.f13063g, draggableElement.f13063g) && Intrinsics.areEqual(this.f13064h, draggableElement.f13064h) && Intrinsics.areEqual(this.f13065i, draggableElement.f13065i) && this.f13066j == draggableElement.f13066j) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int i;
        int hashCode = ((((((this.f13058b.hashCode() * 31) + this.f13059c.hashCode()) * 31) + this.f13060d.hashCode()) * 31) + AbstractC1694Xp.m65565a(this.f13061e)) * 31;
        MutableInteractionSource mutableInteractionSource = this.f13062f;
        if (mutableInteractionSource != null) {
            i = mutableInteractionSource.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + this.f13063g.hashCode()) * 31) + this.f13064h.hashCode()) * 31) + this.f13065i.hashCode()) * 31) + AbstractC1694Xp.m65565a(this.f13066j);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("canDrag", this.f13059c);
        inspectorInfo.getProperties().set("orientation", this.f13060d);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.f13061e));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.f13066j));
        inspectorInfo.getProperties().set("interactionSource", this.f13062f);
        inspectorInfo.getProperties().set("startDragImmediately", this.f13063g);
        inspectorInfo.getProperties().set("onDragStarted", this.f13064h);
        inspectorInfo.getProperties().set("onDragStopped", this.f13065i);
        inspectorInfo.getProperties().set(RemoteConfigConstants.ResponseFieldKey.STATE, this.f13058b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    @NotNull
    public DraggableNode create() {
        return new DraggableNode(this.f13058b, this.f13059c, this.f13060d, this.f13061e, this.f13062f, this.f13063g, this.f13064h, this.f13065i, this.f13066j);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void update(@NotNull DraggableNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.update(this.f13058b, this.f13059c, this.f13060d, this.f13061e, this.f13062f, this.f13063g, this.f13064h, this.f13065i, this.f13066j);
    }
}