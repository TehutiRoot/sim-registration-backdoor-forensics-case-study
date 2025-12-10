package androidx.compose.p003ui.text.input;

import android.view.View;
import androidx.compose.p003ui.text.ExperimentalTextApi;
import androidx.compose.p003ui.text.input.PlatformTextInputAdapter;
import androidx.compose.runtime.Immutable;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Immutable
@ExperimentalTextApi
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m29142d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "T", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "", "createAdapter", "platformTextInput", "Landroidx/compose/ui/text/input/PlatformTextInput;", Promotion.ACTION_VIEW, "Landroid/view/View;", "(Landroidx/compose/ui/text/input/PlatformTextInput;Landroid/view/View;)Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPlugin */
/* loaded from: classes2.dex */
public interface PlatformTextInputPlugin<T extends PlatformTextInputAdapter> {
    @NotNull
    T createAdapter(@NotNull PlatformTextInput platformTextInput, @NotNull View view);
}