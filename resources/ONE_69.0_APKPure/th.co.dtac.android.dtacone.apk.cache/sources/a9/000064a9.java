package androidx.compose.p003ui.text.android;

import android.text.Layout;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "<init>", "()V", "", "value", "Landroid/text/Layout$Alignment;", "get", "(I)Landroid/text/Layout$Alignment;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/text/Layout$Alignment;", "ALIGN_LEFT_FRAMEWORK", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "ALIGN_RIGHT_FRAMEWORK", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.TextAlignmentAdapter */
/* loaded from: classes2.dex */
public final class TextAlignmentAdapter {
    @NotNull
    public static final TextAlignmentAdapter INSTANCE = new TextAlignmentAdapter();

    /* renamed from: a */
    public static final Layout.Alignment f31231a;

    /* renamed from: b */
    public static final Layout.Alignment f31232b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f31231a = alignment;
        f31232b = alignment2;
    }

    @NotNull
    public final Layout.Alignment get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return f31232b;
                    }
                    return f31231a;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}