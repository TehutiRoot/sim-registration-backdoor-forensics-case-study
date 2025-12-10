package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000 l2\u00020\u0001:\u0001lB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J%\u0010'\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010*\u001a\u00020\u0014H\u0080@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010)J3\u0010/\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0017\u00101\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R$\u00108\u001a\u0002038@X\u0080\u0084\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R4\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u00107\"\u0004\b=\u0010>R4\u0010D\u001a\u00020@2\u0006\u0010:\u001a\u00020@8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010;\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u0016R+\u0010H\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010;\u001a\u0004\bE\u00102\"\u0004\bF\u0010GR+\u0010L\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bJ\u00102\"\u0004\bK\u0010GR+\u0010R\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010;\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010V\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010;\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001b\u0010\\\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u00105\u001a\u0004\b4\u00102R&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020^0]8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bd\u0010BR\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\be\u0010BR\u0014\u0010g\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010BR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00020h8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, m28850d2 = {"Landroidx/compose/material3/TimePickerState;", "", "", "initialHour", "initialMinute", "", "is24Hour", "<init>", "(IIZ)V", "hour", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "angle", OperatorName.CURVE_TO, "(F)F", "d", "(F)I", "e", "minute", "", "setMinute$material3_release", "(I)V", "setMinute", "setHour$material3_release", "setHour", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "maxDist", "moveSelector$material3_release", "(FFF)V", "moveSelector", "value", "isSelected$material3_release", "(I)Z", "isSelected", "fromTap", "update$material3_release", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "animateToCurrent$material3_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToCurrent", "settle", "autoSwitchToMinute", "onTap$material3_release", "(FFFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTap", "Z", "is24hour", "()Z", "Landroidx/compose/ui/unit/DpOffset;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/State;", "getSelectorPos-RKDOV3M$material3_release", "()J", "selectorPos", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "getCenter-nOcc-ac$material3_release", "setCenter--gyyYBs$material3_release", "(J)V", Constant.VIEW_CENTER, "Landroidx/compose/material3/Selection;", "getSelection-JiIwxys$material3_release", "()I", "setSelection-iHAOin8$material3_release", "selection", "isAfternoonToggle$material3_release", "setAfternoonToggle$material3_release", "(Z)V", "isAfternoonToggle", OperatorName.FILL_NON_ZERO, "isInnerCircle$material3_release", "setInnerCircle$material3_release", "isInnerCircle", OperatorName.NON_STROKING_GRAY, "getHourAngle$material3_release", "()F", "setHourAngle$material3_release", "(F)V", "hourAngle", OperatorName.CLOSE_PATH, "getMinuteAngle$material3_release", "setMinuteAngle$material3_release", "minuteAngle", "Landroidx/compose/foundation/MutatorMutex;", "i", "Landroidx/compose/foundation/MutatorMutex;", "mutex", OperatorName.SET_LINE_JOINSTYLE, "isAfternoon", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/animation/core/Animatable;", "getCurrentAngle$material3_release", "()Landroidx/compose/animation/core/Animatable;", "currentAngle", "getMinute", "getHour", "getHourForDisplay$material3_release", "hourForDisplay", "", "getValues$material3_release", "()Ljava/util/List;", "values", "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1673:1\n1#2:1674\n76#3:1675\n76#3:1676\n102#3,2:1677\n76#3:1679\n102#3,2:1680\n76#3:1682\n102#3,2:1683\n76#3:1685\n102#3,2:1686\n76#3:1688\n102#3,2:1689\n76#3:1691\n102#3,2:1692\n76#3:1694\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n*L\n507#1:1675\n523#1:1676\n523#1:1677,2\n526#1:1679\n526#1:1680,2\n527#1:1682\n527#1:1683,2\n528#1:1685\n528#1:1686,2\n530#1:1688\n530#1:1689,2\n531#1:1691\n531#1:1692,2\n534#1:1694\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final boolean f26401a;

    /* renamed from: b */
    public final State f26402b;

    /* renamed from: c */
    public final MutableState f26403c;

    /* renamed from: d */
    public final MutableState f26404d;

    /* renamed from: e */
    public final MutableState f26405e;

    /* renamed from: f */
    public final MutableState f26406f;

    /* renamed from: g */
    public final MutableState f26407g;

    /* renamed from: h */
    public final MutableState f26408h;

    /* renamed from: i */
    public final MutatorMutex f26409i;

    /* renamed from: j */
    public final State f26410j;

    /* renamed from: k */
    public final Animatable f26411k;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, m28850d2 = {"Landroidx/compose/material3/TimePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerState;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TimePickerState, ?> Saver() {
            return SaverKt.Saver(TimePickerState$Companion$Saver$1.INSTANCE, TimePickerState$Companion$Saver$2.INSTANCE);
        }

        public Companion() {
        }
    }

    public TimePickerState(int i, int i2, boolean z) {
        MutableState m31891g;
        MutableState m31891g2;
        boolean z2;
        MutableState m31891g3;
        MutableState m31891g4;
        MutableState m31891g5;
        MutableState m31891g6;
        if (i >= 0 && i < 24) {
            if (i >= 0 && i < 60) {
                this.f26401a = z;
                this.f26402b = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new TimePickerState$selectorPos$2(this, z));
                m31891g = AbstractC19508dK1.m31891g(IntOffset.m73767boximpl(IntOffset.Companion.m73786getZeronOccac()), null, 2, null);
                this.f26403c = m31891g;
                m31891g2 = AbstractC19508dK1.m31891g(Selection.m70532boximpl(Selection.Companion.m70538getHourJiIwxys()), null, 2, null);
                this.f26404d = m31891g2;
                if (i > 12 && !z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m31891g3 = AbstractC19508dK1.m31891g(Boolean.valueOf(z2), null, 2, null);
                this.f26405e = m31891g3;
                m31891g4 = AbstractC19508dK1.m31891g(Boolean.valueOf(i >= 12), null, 2, null);
                this.f26406f = m31891g4;
                m31891g5 = AbstractC19508dK1.m31891g(Float.valueOf(((i * 0.5235988f) % 12) - 1.5707964f), null, 2, null);
                this.f26407g = m31891g5;
                m31891g6 = AbstractC19508dK1.m31891g(Float.valueOf((i2 * 0.10471976f) - 1.5707964f), null, 2, null);
                this.f26408h = m31891g6;
                this.f26409i = new MutatorMutex();
                this.f26410j = SnapshotStateKt.derivedStateOf(new TimePickerState$isAfternoon$2(this));
                this.f26411k = AnimatableKt.Animatable$default(getHourAngle$material3_release(), 0.0f, 2, null);
                return;
            }
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
    }

    public static /* synthetic */ Object update$material3_release$default(TimePickerState timePickerState, float f, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return timePickerState.update$material3_release(f, z, continuation);
    }

    /* renamed from: a */
    public final int m60418a(int i) {
        if (!this.f26401a || !isInnerCircle$material3_release() || i != 0) {
            if (this.f26401a) {
                return i % 24;
            }
            if (i % 12 != 0) {
                if (m60417b()) {
                    return i - 12;
                }
                return i;
            }
        }
        return 12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateToCurrent$material3_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.TimePickerState$animateToCurrent$1
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = (androidx.compose.material3.TimePickerState$animateToCurrent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.TimePickerState$animateToCurrent$1 r0 = new androidx.compose.material3.TimePickerState$animateToCurrent$1
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lbb
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            float r1 = r6.F$0
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            kotlin.ResultKt.throwOnFailure(r11)
            goto L96
        L41:
            kotlin.ResultKt.throwOnFailure(r11)
            int r11 = r10.m70734getSelectionJiIwxys$material3_release()
            androidx.compose.material3.Selection$Companion r1 = androidx.compose.material3.Selection.Companion
            int r1 = r1.m70538getHourJiIwxys()
            boolean r11 = androidx.compose.material3.Selection.m70534equalsimpl0(r11, r1)
            if (r11 == 0) goto L61
            float r11 = r10.getMinuteAngle$material3_release()
            float r1 = r10.getHourAngle$material3_release()
            kotlin.Pair r11 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r11, r1)
            goto L6d
        L61:
            float r11 = r10.getHourAngle$material3_release()
            float r1 = r10.getMinuteAngle$material3_release()
            kotlin.Pair r11 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r11, r1)
        L6d:
            java.lang.Object r1 = r11.component1()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r11 = r11.component2()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            androidx.compose.animation.core.Animatable r4 = r10.f26411k
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r6.L$0 = r10
            r6.F$0 = r11
            r6.label = r3
            java.lang.Object r1 = r4.snapTo(r1, r6)
            if (r1 != r0) goto L94
            return r0
        L94:
            r3 = r10
            r1 = r11
        L96:
            androidx.compose.animation.core.Animatable r11 = r3.f26411k
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r1, r7, r4, r7)
            r6.L$0 = r7
            r6.label = r2
            r5 = 0
            r8 = 12
            r9 = 0
            r1 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r9
            java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto Lbb
            return r0
        Lbb:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.animateToCurrent$material3_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public final boolean m60417b() {
        return ((Boolean) this.f26410j.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final float m60416c(float f) {
        float f2 = f + 1.5707964f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    /* renamed from: d */
    public final int m60415d(float f) {
        return ((int) ((f + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12;
    }

    /* renamed from: e */
    public final int m60414e(float f) {
        return ((int) ((f + (0.05235988f + 1.5707963267948966d)) / 0.10471976f)) % 60;
    }

    /* renamed from: getCenter-nOcc-ac$material3_release  reason: not valid java name */
    public final long m70733getCenternOccac$material3_release() {
        return ((IntOffset) this.f26403c.getValue()).m73785unboximpl();
    }

    @NotNull
    public final Animatable<Float, AnimationVector1D> getCurrentAngle$material3_release() {
        return this.f26411k;
    }

    public final int getHour() {
        int i;
        int m60415d = m60415d(getHourAngle$material3_release());
        if (m60417b()) {
            i = 12;
        } else {
            i = 0;
        }
        return m60415d + i;
    }

    public final float getHourAngle$material3_release() {
        return ((Number) this.f26407g.getValue()).floatValue();
    }

    public final int getHourForDisplay$material3_release() {
        return m60418a(getHour());
    }

    public final int getMinute() {
        return m60414e(getMinuteAngle$material3_release());
    }

    public final float getMinuteAngle$material3_release() {
        return ((Number) this.f26408h.getValue()).floatValue();
    }

    /* renamed from: getSelection-JiIwxys$material3_release  reason: not valid java name */
    public final int m70734getSelectionJiIwxys$material3_release() {
        return ((Selection) this.f26404d.getValue()).m70537unboximpl();
    }

    /* renamed from: getSelectorPos-RKDOV3M$material3_release  reason: not valid java name */
    public final long m70735getSelectorPosRKDOV3M$material3_release() {
        return ((DpOffset) this.f26402b.getValue()).m73727unboximpl();
    }

    @NotNull
    public final List<Integer> getValues$material3_release() {
        if (Selection.m70534equalsimpl0(m70734getSelectionJiIwxys$material3_release(), Selection.Companion.m70539getMinuteJiIwxys())) {
            return TimePickerKt.access$getMinutes$p();
        }
        return TimePickerKt.access$getHours$p();
    }

    public final boolean is24hour() {
        return this.f26401a;
    }

    public final boolean isAfternoonToggle$material3_release() {
        return ((Boolean) this.f26405e.getValue()).booleanValue();
    }

    public final boolean isInnerCircle$material3_release() {
        return ((Boolean) this.f26406f.getValue()).booleanValue();
    }

    public final boolean isSelected$material3_release(int i) {
        int i2;
        if (Selection.m70534equalsimpl0(m70734getSelectionJiIwxys$material3_release(), Selection.Companion.m70539getMinuteJiIwxys())) {
            if (i == getMinute()) {
                return true;
            }
        } else {
            int hour = getHour();
            if (m60417b()) {
                i2 = 12;
            } else {
                i2 = 0;
            }
            if (hour == i + i2) {
                return true;
            }
        }
        return false;
    }

    public final void moveSelector$material3_release(float f, float f2, float f3) {
        boolean z;
        if (Selection.m70534equalsimpl0(m70734getSelectionJiIwxys$material3_release(), Selection.Companion.m70538getHourJiIwxys()) && this.f26401a) {
            if (TimePickerKt.access$dist(f, f2, IntOffset.m73776getXimpl(m70733getCenternOccac$material3_release()), IntOffset.m73777getYimpl(m70733getCenternOccac$material3_release())) < f3) {
                z = true;
            } else {
                z = false;
            }
            setInnerCircle$material3_release(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onTap$material3_release(float r11, float r12, float r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.onTap$material3_release(float, float, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setAfternoonToggle$material3_release(boolean z) {
        this.f26405e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setCenter--gyyYBs$material3_release  reason: not valid java name */
    public final void m70736setCentergyyYBs$material3_release(long j) {
        this.f26403c.setValue(IntOffset.m73767boximpl(j));
    }

    public final void setHour$material3_release(int i) {
        boolean z;
        if (i <= 12 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        setInnerCircle$material3_release(z);
        setHourAngle$material3_release(((i * 0.5235988f) % 12) - 1.5707964f);
    }

    public final void setHourAngle$material3_release(float f) {
        this.f26407g.setValue(Float.valueOf(f));
    }

    public final void setInnerCircle$material3_release(boolean z) {
        this.f26406f.setValue(Boolean.valueOf(z));
    }

    public final void setMinute$material3_release(int i) {
        setMinuteAngle$material3_release((i * 0.10471976f) - 1.5707964f);
    }

    public final void setMinuteAngle$material3_release(float f) {
        this.f26408h.setValue(Float.valueOf(f));
    }

    /* renamed from: setSelection-iHAOin8$material3_release  reason: not valid java name */
    public final void m70737setSelectioniHAOin8$material3_release(int i) {
        this.f26404d.setValue(Selection.m70532boximpl(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object settle(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.TimePickerState$settle$1
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.material3.TimePickerState$settle$1 r0 = (androidx.compose.material3.TimePickerState$settle$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.TimePickerState$settle$1 r0 = new androidx.compose.material3.TimePickerState$settle$1
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.ResultKt.throwOnFailure(r11)
            goto L94
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            java.lang.Object r1 = r6.L$1
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.TimePickerState r3 = (androidx.compose.material3.TimePickerState) r3
            kotlin.ResultKt.throwOnFailure(r11)
            goto L6d
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            androidx.compose.animation.core.Animatable r11 = r10.f26411k
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            float r1 = r10.getMinuteAngle$material3_release()
            kotlin.Pair r1 = androidx.compose.material3.TimePickerKt.access$valuesForAnimation(r11, r1)
            androidx.compose.animation.core.Animatable r11 = r10.f26411k
            java.lang.Object r4 = r1.getFirst()
            r6.L$0 = r10
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r11 = r11.snapTo(r4, r6)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            r3 = r10
        L6d:
            androidx.compose.animation.core.Animatable r11 = r3.f26411k
            java.lang.Object r3 = r1.getSecond()
            r1 = 0
            r4 = 6
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r5, r1, r7, r4, r7)
            r6.L$0 = r7
            r6.L$1 = r7
            r6.label = r2
            r5 = 0
            r8 = 12
            r9 = 0
            r1 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r9
            java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L94
            return r0
        L94:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerState.settle(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object update$material3_release(float f, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object mutate = this.f26409i.mutate(MutatePriority.UserInput, new TimePickerState$update$2(this, f, z, null), continuation);
        if (mutate == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return mutate;
        }
        return Unit.INSTANCE;
    }
}
