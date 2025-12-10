package androidx.compose.p003ui.text.input;

import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p003ui.platform.coreshims.SoftwareKeyboardControllerCompat;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m28850d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "", "restartInput", "()V", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "(IIII)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/compose/ui/platform/coreshims/SoftwareKeyboardControllerCompat;", OperatorName.CURVE_TO, "Landroidx/compose/ui/platform/coreshims/SoftwareKeyboardControllerCompat;", "softwareKeyboardControllerCompat", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl */
/* loaded from: classes2.dex */
public final class InputMethodManagerImpl implements InputMethodManager {

    /* renamed from: a */
    public final View f31384a;

    /* renamed from: b */
    public final Lazy f31385b;

    /* renamed from: c */
    public final SoftwareKeyboardControllerCompat f31386c;

    public InputMethodManagerImpl(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f31384a = view;
        this.f31385b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new InputMethodManagerImpl$imm$2(this));
        this.f31386c = new SoftwareKeyboardControllerCompat(view);
    }

    /* renamed from: a */
    public final InputMethodManager m59028a() {
        return (InputMethodManager) this.f31385b.getValue();
    }

    @Override // androidx.compose.p003ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.f31386c.hide();
    }

    @Override // androidx.compose.p003ui.text.input.InputMethodManager
    public void restartInput() {
        m59028a().restartInput(this.f31384a);
    }

    @Override // androidx.compose.p003ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.f31386c.show();
    }

    @Override // androidx.compose.p003ui.text.input.InputMethodManager
    public void updateExtractedText(int i, @NotNull ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        m59028a().updateExtractedText(this.f31384a, i, extractedText);
    }

    @Override // androidx.compose.p003ui.text.input.InputMethodManager
    public void updateSelection(int i, int i2, int i3, int i4) {
        m59028a().updateSelection(this.f31384a, i, i2, i3, i4);
    }
}
