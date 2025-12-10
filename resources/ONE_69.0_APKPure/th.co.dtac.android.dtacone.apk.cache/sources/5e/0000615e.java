package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.modifier.ModifierLocalKt;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m29142d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalBeyondBoundsLayout", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalBeyondBoundsLayout", "ui_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.BeyondBoundsLayoutKt */
/* loaded from: classes2.dex */
public final class BeyondBoundsLayoutKt {

    /* renamed from: a */
    public static final ProvidableModifierLocal f30137a = ModifierLocalKt.modifierLocalOf(BeyondBoundsLayoutKt$ModifierLocalBeyondBoundsLayout$1.INSTANCE);

    @NotNull
    public static final ProvidableModifierLocal<BeyondBoundsLayout> getModifierLocalBeyondBoundsLayout() {
        return f30137a;
    }
}