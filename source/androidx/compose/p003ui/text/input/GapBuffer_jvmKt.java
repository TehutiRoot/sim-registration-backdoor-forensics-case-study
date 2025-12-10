package androidx.compose.p003ui.text.input;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¨\u0006\t"}, m28850d2 = {"toCharArray", "", "", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", "", "startIndex", "endIndex", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.input.GapBuffer_jvmKt */
/* loaded from: classes2.dex */
public final class GapBuffer_jvmKt {
    public static final void toCharArray(@NotNull String str, @NotNull char[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i2, i3, destination, i);
    }
}
