package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.ExperimentalTextApi;
import kotlin.Metadata;

@ExperimentalTextApi
@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0082\u0001\u0001\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/text/input/PlatformTextInput;", "", "", "requestInputFocus", "()V", "releaseInputFocus", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistryImpl$a;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.PlatformTextInput */
/* loaded from: classes2.dex */
public interface PlatformTextInput {
    void releaseInputFocus();

    void requestInputFocus();
}
