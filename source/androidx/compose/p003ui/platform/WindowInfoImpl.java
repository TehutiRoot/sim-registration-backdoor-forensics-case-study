package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.p003ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.runtime.MutableState;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R3\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8W@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl;", "Landroidx/compose/ui/platform/WindowInfo;", "<init>", "()V", "Landroidx/compose/runtime/MutableState;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/MutableState;", "_isWindowFocused", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "value", "getKeyboardModifiers-k7X9c1A", "()I", "setKeyboardModifiers-5xRPYO0", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "keyboardModifiers", "isWindowFocused", "()Z", "setWindowFocused", "(Z)V", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.WindowInfoImpl */
/* loaded from: classes2.dex */
public final class WindowInfoImpl implements WindowInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final MutableState f30803b;

    /* renamed from: a */
    public final MutableState f30804a;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl$Companion;", "", "()V", "GlobalKeyboardModifiers", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getGlobalKeyboardModifiers$ui_release", "()Landroidx/compose/runtime/MutableState;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.platform.WindowInfoImpl$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.f30803b;
        }

        public Companion() {
        }
    }

    static {
        MutableState m31891g;
        m31891g = AbstractC19508dK1.m31891g(PointerKeyboardModifiers.m72759boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);
        f30803b = m31891g;
    }

    public WindowInfoImpl() {
        MutableState m31891g;
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f30804a = m31891g;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A$annotations  reason: not valid java name */
    public static /* synthetic */ void m73053getKeyboardModifiersk7X9c1A$annotations() {
    }

    @Override // androidx.compose.p003ui.platform.WindowInfo
    @ExperimentalComposeUiApi
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo73052getKeyboardModifiersk7X9c1A() {
        return ((PointerKeyboardModifiers) f30803b.getValue()).m72765unboximpl();
    }

    @Override // androidx.compose.p003ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.f30804a.getValue()).booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0  reason: not valid java name */
    public void m73054setKeyboardModifiers5xRPYO0(int i) {
        f30803b.setValue(PointerKeyboardModifiers.m72759boximpl(i));
    }

    public void setWindowFocused(boolean z) {
        this.f30804a.setValue(Boolean.valueOf(z));
    }
}
