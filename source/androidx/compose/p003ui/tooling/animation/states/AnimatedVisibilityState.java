package androidx.compose.p003ui.tooling.animation.states;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0014\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
/* renamed from: androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState */
/* loaded from: classes2.dex */
public final class AnimatedVisibilityState implements ComposeAnimationState {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final String f31702b = m58905a("Enter");

    /* renamed from: c */
    public static final String f31703c = m58905a("Exit");

    /* renamed from: a */
    public final String f31704a;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState$Companion;", "", "()V", "Enter", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "getEnter-jXw82LU", "()Ljava/lang/String;", "Ljava/lang/String;", "Exit", "getExit-jXw82LU", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: getEnter-jXw82LU  reason: not valid java name */
        public final String m73613getEnterjXw82LU() {
            return AnimatedVisibilityState.f31702b;
        }

        @NotNull
        /* renamed from: getExit-jXw82LU  reason: not valid java name */
        public final String m73614getExitjXw82LU() {
            return AnimatedVisibilityState.f31703c;
        }

        public Companion() {
        }
    }

    public /* synthetic */ AnimatedVisibilityState(String str) {
        this.f31704a = str;
    }

    /* renamed from: a */
    public static String m58905a(String str) {
        return str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ AnimatedVisibilityState m73607boximpl(String str) {
        return new AnimatedVisibilityState(str);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m73608equalsimpl(String str, Object obj) {
        return (obj instanceof AnimatedVisibilityState) && Intrinsics.areEqual(str, ((AnimatedVisibilityState) obj).m73612unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m73609equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m73610hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m73611toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m73608equalsimpl(this.f31704a, obj);
    }

    @NotNull
    public final String getValue() {
        return this.f31704a;
    }

    public int hashCode() {
        return m73610hashCodeimpl(this.f31704a);
    }

    @NotNull
    public String toString() {
        return m73611toStringimpl(this.f31704a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m73612unboximpl() {
        return this.f31704a;
    }
}
