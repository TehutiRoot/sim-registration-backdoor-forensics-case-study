package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.PopupPositionProvider;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001aR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, m28850d2 = {"Landroidx/compose/material3/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "contentOffset", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "component1-RKDOV3M", "()J", "component1", "component2", "()Landroidx/compose/ui/unit/Density;", "component3", "()Lkotlin/jvm/functions/Function2;", "copy-rOJDEFc", "(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;)Landroidx/compose/material3/DropdownMenuPositionProvider;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getContentOffset-RKDOV3M", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/unit/Density;", "getDensity", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function2;", "getOnPositionCalculated", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,443:1\n1#2:444\n179#3,2:445\n179#3,2:447\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/DropdownMenuPositionProvider\n*L\n342#1:445,2\n351#1:447,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {

    /* renamed from: a */
    public final long f25758a;

    /* renamed from: b */
    public final Density f25759b;

    /* renamed from: c */
    public final Function2 f25760c;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/IntRect;", "<anonymous parameter 1>", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.DropdownMenuPositionProvider$1 */
    /* loaded from: classes2.dex */
    public static final class C32861 extends Lambda implements Function2<IntRect, IntRect, Unit> {
        public static final C32861 INSTANCE = new C32861();

        public C32861() {
            super(2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
            Intrinsics.checkNotNullParameter(intRect, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(intRect2, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
            invoke2(intRect, intRect2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-rOJDEFc$default  reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m70377copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j, Density density, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dropdownMenuPositionProvider.f25758a;
        }
        if ((i & 2) != 0) {
            density = dropdownMenuPositionProvider.f25759b;
        }
        if ((i & 4) != 0) {
            function2 = dropdownMenuPositionProvider.f25760c;
        }
        return dropdownMenuPositionProvider.m70379copyrOJDEFc(j, density, function2);
    }

    @Override // androidx.compose.p003ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo69834calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long j, @NotNull LayoutDirection layoutDirection, long j2) {
        Sequence sequenceOf;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int mo69432roundToPx0680j_4 = this.f25759b.mo69432roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo69432roundToPx0680j_42 = this.f25759b.mo69432roundToPx0680j_4(DpOffset.m73719getXD9Ej5fM(this.f25758a));
        int mo69432roundToPx0680j_43 = this.f25759b.mo69432roundToPx0680j_4(DpOffset.m73721getYD9Ej5fM(this.f25758a));
        int left = anchorBounds.getLeft() + mo69432roundToPx0680j_42;
        int right = (anchorBounds.getRight() - mo69432roundToPx0680j_42) - IntSize.m73818getWidthimpl(j2);
        int m73818getWidthimpl = IntSize.m73818getWidthimpl(j) - IntSize.m73818getWidthimpl(j2);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer valueOf = Integer.valueOf(left);
            Integer valueOf2 = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                m73818getWidthimpl = 0;
            }
            sequenceOf = SequencesKt__SequencesKt.sequenceOf(valueOf, valueOf2, Integer.valueOf(m73818getWidthimpl));
        } else {
            Integer valueOf3 = Integer.valueOf(right);
            Integer valueOf4 = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m73818getWidthimpl(j)) {
                m73818getWidthimpl = 0;
            }
            sequenceOf = SequencesKt__SequencesKt.sequenceOf(valueOf3, valueOf4, Integer.valueOf(m73818getWidthimpl));
        }
        Iterator it = sequenceOf.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + IntSize.m73818getWidthimpl(j2) <= IntSize.m73818getWidthimpl(j)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(anchorBounds.getBottom() + mo69432roundToPx0680j_43, mo69432roundToPx0680j_4);
        int top = (anchorBounds.getTop() - mo69432roundToPx0680j_43) - IntSize.m73817getHeightimpl(j2);
        Iterator it2 = SequencesKt__SequencesKt.sequenceOf(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m73817getHeightimpl(j2) / 2)), Integer.valueOf((IntSize.m73817getHeightimpl(j) - IntSize.m73817getHeightimpl(j2)) - mo69432roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo69432roundToPx0680j_4 && intValue2 + IntSize.m73817getHeightimpl(j2) <= IntSize.m73817getHeightimpl(j) - mo69432roundToPx0680j_4) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.f25760c.invoke(anchorBounds, new IntRect(right, top, IntSize.m73818getWidthimpl(j2) + right, IntSize.m73817getHeightimpl(j2) + top));
        return IntOffsetKt.IntOffset(right, top);
    }

    /* renamed from: component1-RKDOV3M  reason: not valid java name */
    public final long m70378component1RKDOV3M() {
        return this.f25758a;
    }

    @NotNull
    public final Density component2() {
        return this.f25759b;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> component3() {
        return this.f25760c;
    }

    @NotNull
    /* renamed from: copy-rOJDEFc  reason: not valid java name */
    public final DropdownMenuPositionProvider m70379copyrOJDEFc(long j, @NotNull Density density, @NotNull Function2<? super IntRect, ? super IntRect, Unit> onPositionCalculated) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j, density, onPositionCalculated, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DropdownMenuPositionProvider) {
            DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
            return DpOffset.m73718equalsimpl0(this.f25758a, dropdownMenuPositionProvider.f25758a) && Intrinsics.areEqual(this.f25759b, dropdownMenuPositionProvider.f25759b) && Intrinsics.areEqual(this.f25760c, dropdownMenuPositionProvider.f25760c);
        }
        return false;
    }

    /* renamed from: getContentOffset-RKDOV3M  reason: not valid java name */
    public final long m70380getContentOffsetRKDOV3M() {
        return this.f25758a;
    }

    @NotNull
    public final Density getDensity() {
        return this.f25759b;
    }

    @NotNull
    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.f25760c;
    }

    public int hashCode() {
        return (((DpOffset.m73723hashCodeimpl(this.f25758a) * 31) + this.f25759b.hashCode()) * 31) + this.f25760c.hashCode();
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m73726toStringimpl(this.f25758a)) + ", density=" + this.f25759b + ", onPositionCalculated=" + this.f25760c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public DropdownMenuPositionProvider(long j, Density density, Function2 onPositionCalculated) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(onPositionCalculated, "onPositionCalculated");
        this.f25758a = j;
        this.f25759b = density;
        this.f25760c = onPositionCalculated;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j, Density density, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, density, (i & 4) != 0 ? C32861.INSTANCE : function2, null);
    }
}
