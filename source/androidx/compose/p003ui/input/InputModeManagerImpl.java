package androidx.compose.p003ui.input;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.MutableState;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000eR4\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "Landroidx/compose/ui/input/InputMode;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "inputMode", "requestInputMode-iuPiT84", "(I)Z", "requestInputMode", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function1;", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "getInputMode-aOaMEAU", "()I", "setInputMode-iuPiT84", "(I)V", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,76:1\n81#2:77\n107#2,2:78\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:77\n72#1:78,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.InputModeManagerImpl */
/* loaded from: classes2.dex */
public final class InputModeManagerImpl implements InputModeManager {

    /* renamed from: a */
    public final Function1 f29585a;

    /* renamed from: b */
    public final MutableState f29586b;

    public /* synthetic */ InputModeManagerImpl(int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1);
    }

    @Override // androidx.compose.p003ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo72290getInputModeaOaMEAU() {
        return ((InputMode) this.f29586b.getValue()).m72287unboximpl();
    }

    @Override // androidx.compose.p003ui.input.InputModeManager
    @ExperimentalComposeUiApi
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo72291requestInputModeiuPiT84(int i) {
        return ((Boolean) this.f29585a.invoke(InputMode.m72281boximpl(i))).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84  reason: not valid java name */
    public void m72292setInputModeiuPiT84(int i) {
        this.f29586b.setValue(InputMode.m72281boximpl(i));
    }

    public InputModeManagerImpl(int i, Function1 onRequestInputModeChange) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(onRequestInputModeChange, "onRequestInputModeChange");
        this.f29585a = onRequestInputModeChange;
        m31891g = AbstractC19508dK1.m31891g(InputMode.m72281boximpl(i), null, 2, null);
        this.f29586b = m31891g;
    }
}
