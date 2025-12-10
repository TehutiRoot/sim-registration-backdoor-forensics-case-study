package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.android.TextLayout;
import androidx.compose.p003ui.text.android.selection.WordBoundary;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.AndroidParagraph$wordBoundary$2 */
/* loaded from: classes2.dex */
public final class AndroidParagraph$wordBoundary$2 extends Lambda implements Function0<WordBoundary> {
    final /* synthetic */ AndroidParagraph this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$wordBoundary$2(AndroidParagraph androidParagraph) {
        super(0);
        this.this$0 = androidParagraph;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final WordBoundary invoke() {
        TextLayout textLayout;
        Locale textLocale$ui_text_release = this.this$0.getTextLocale$ui_text_release();
        textLayout = this.this$0.f30961e;
        return new WordBoundary(textLocale$ui_text_release, textLayout.getText());
    }
}
