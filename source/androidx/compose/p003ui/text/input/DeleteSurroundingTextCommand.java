package androidx.compose.p003ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLengthBeforeCursor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLengthAfterCursor", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,563:1\n23#2,3:564\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n268#1:564,3\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.DeleteSurroundingTextCommand */
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f31358a;

    /* renamed from: b */
    public final int f31359b;

    public DeleteSurroundingTextCommand(int i, int i2) {
        this.f31358a = i;
        this.f31359b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
    }

    @Override // androidx.compose.p003ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int selectionEnd$ui_text_release = buffer.getSelectionEnd$ui_text_release();
        int i = this.f31359b;
        int i2 = selectionEnd$ui_text_release + i;
        if (((selectionEnd$ui_text_release ^ i2) & (i ^ i2)) < 0) {
            i2 = buffer.getLength$ui_text_release();
        }
        buffer.delete$ui_text_release(buffer.getSelectionEnd$ui_text_release(), Math.min(i2, buffer.getLength$ui_text_release()));
        buffer.delete$ui_text_release(Math.max(0, MathUtilsKt.subtractExactOrElse(buffer.getSelectionStart$ui_text_release(), this.f31358a, DeleteSurroundingTextCommand$applyTo$start$1.INSTANCE)), buffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        if (this.f31358a == deleteSurroundingTextCommand.f31358a && this.f31359b == deleteSurroundingTextCommand.f31359b) {
            return true;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.f31359b;
    }

    public final int getLengthBeforeCursor() {
        return this.f31358a;
    }

    public int hashCode() {
        return (this.f31358a * 31) + this.f31359b;
    }

    @NotNull
    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f31358a + ", lengthAfterCursor=" + this.f31359b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
