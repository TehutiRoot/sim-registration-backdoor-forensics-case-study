package androidx.compose.p003ui.layout;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\f\rJ@\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0007¢\u0006\u0002\b\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout;", "", "layout", "T", "direction", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "BeyondBoundsScope", "LayoutDirection", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout */
/* loaded from: classes2.dex */
public interface BeyondBoundsLayout {

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "", "hasMoreContent", "", "getHasMoreContent", "()Z", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope */
    /* loaded from: classes2.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m29142d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @JvmInline
    /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection */
    /* loaded from: classes2.dex */
    public static final class LayoutDirection {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: b */
        public static final int f30130b = m72977constructorimpl(1);

        /* renamed from: c */
        public static final int f30131c = m72977constructorimpl(2);

        /* renamed from: d */
        public static final int f30132d = m72977constructorimpl(3);

        /* renamed from: e */
        public static final int f30133e = m72977constructorimpl(4);

        /* renamed from: f */
        public static final int f30134f = m72977constructorimpl(5);

        /* renamed from: g */
        public static final int f30135g = m72977constructorimpl(6);

        /* renamed from: a */
        public final int f30136a;

        @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m29142d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection$Companion;", "", "()V", "Above", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "getAbove-hoxUOeE", "()I", "I", "After", "getAfter-hoxUOeE", "Before", "getBefore-hoxUOeE", "Below", "getBelow-hoxUOeE", "Left", "getLeft-hoxUOeE", "Right", "getRight-hoxUOeE", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE  reason: not valid java name */
            public final int m72983getAbovehoxUOeE() {
                return LayoutDirection.f30134f;
            }

            /* renamed from: getAfter-hoxUOeE  reason: not valid java name */
            public final int m72984getAfterhoxUOeE() {
                return LayoutDirection.f30131c;
            }

            /* renamed from: getBefore-hoxUOeE  reason: not valid java name */
            public final int m72985getBeforehoxUOeE() {
                return LayoutDirection.f30130b;
            }

            /* renamed from: getBelow-hoxUOeE  reason: not valid java name */
            public final int m72986getBelowhoxUOeE() {
                return LayoutDirection.f30135g;
            }

            /* renamed from: getLeft-hoxUOeE  reason: not valid java name */
            public final int m72987getLefthoxUOeE() {
                return LayoutDirection.f30132d;
            }

            /* renamed from: getRight-hoxUOeE  reason: not valid java name */
            public final int m72988getRighthoxUOeE() {
                return LayoutDirection.f30133e;
            }

            public Companion() {
            }
        }

        public /* synthetic */ LayoutDirection(int i) {
            this.f30136a = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m72976boximpl(int i) {
            return new LayoutDirection(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m72977constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m72978equalsimpl(int i, Object obj) {
            return (obj instanceof LayoutDirection) && i == ((LayoutDirection) obj).m72982unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m72979equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m72980hashCodeimpl(int i) {
            return i;
        }

        @NotNull
        /* renamed from: toString-impl  reason: not valid java name */
        public static String m72981toStringimpl(int i) {
            if (m72979equalsimpl0(i, f30130b)) {
                return "Before";
            }
            if (m72979equalsimpl0(i, f30131c)) {
                return "After";
            }
            if (m72979equalsimpl0(i, f30132d)) {
                return "Left";
            }
            if (m72979equalsimpl0(i, f30133e)) {
                return "Right";
            }
            if (m72979equalsimpl0(i, f30134f)) {
                return "Above";
            }
            if (m72979equalsimpl0(i, f30135g)) {
                return "Below";
            }
            return "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m72978equalsimpl(this.f30136a, obj);
        }

        public int hashCode() {
            return m72980hashCodeimpl(this.f30136a);
        }

        @NotNull
        public String toString() {
            return m72981toStringimpl(this.f30136a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m72982unboximpl() {
            return this.f30136a;
        }
    }

    @Nullable
    /* renamed from: layout-o7g1Pn8 */
    <T> T mo69823layouto7g1Pn8(int i, @NotNull Function1<? super BeyondBoundsScope, ? extends T> function1);
}