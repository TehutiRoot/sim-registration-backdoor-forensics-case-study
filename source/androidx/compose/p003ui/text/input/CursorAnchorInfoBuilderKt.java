package androidx.compose.p003ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28850d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroid/view/inputmethod/CursorAnchorInfo;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/TextLayoutResult;Landroid/graphics/Matrix;)Landroid/view/inputmethod/CursorAnchorInfo;", "", "selectionStart", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;ILandroidx/compose/ui/text/TextLayoutResult;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.CursorAnchorInfoBuilderKt */
/* loaded from: classes2.dex */
public final class CursorAnchorInfoBuilderKt {
    /* renamed from: a */
    public static final CursorAnchorInfo.Builder m59035a(CursorAnchorInfo.Builder builder, int i, TextLayoutResult textLayoutResult) {
        boolean z;
        int i2;
        if (i < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i);
        if (textLayoutResult.getBidiRunDirection(i) == ResolvedTextDirection.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i2);
        return builder;
    }

    @NotNull
    public static final CursorAnchorInfo build(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextFieldValue textFieldValue, @NotNull TextLayoutResult textLayoutResult, @NotNull Matrix matrix) {
        int i;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int m73214getMinimpl = TextRange.m73214getMinimpl(textFieldValue.m73425getSelectiond9O1mEE());
        builder.setSelectionRange(m73214getMinimpl, TextRange.m73213getMaximpl(textFieldValue.m73425getSelectiond9O1mEE()));
        m59035a(builder, m73214getMinimpl, textLayoutResult);
        TextRange m73424getCompositionMzsxiRA = textFieldValue.m73424getCompositionMzsxiRA();
        int i2 = -1;
        if (m73424getCompositionMzsxiRA != null) {
            i = TextRange.m73214getMinimpl(m73424getCompositionMzsxiRA.m73220unboximpl());
        } else {
            i = -1;
        }
        TextRange m73424getCompositionMzsxiRA2 = textFieldValue.m73424getCompositionMzsxiRA();
        if (m73424getCompositionMzsxiRA2 != null) {
            i2 = TextRange.m73213getMaximpl(m73424getCompositionMzsxiRA2.m73220unboximpl());
        }
        if (i >= 0 && i < i2) {
            builder.setComposingText(i, textFieldValue.getText().subSequence(i, i2));
        }
        CursorAnchorInfo build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build()");
        return build;
    }
}
