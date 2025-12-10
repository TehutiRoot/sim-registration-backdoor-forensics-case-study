package androidx.compose.p003ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLengthBeforeCursor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLengthAfterCursor", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand */
/* loaded from: classes2.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f31360a;

    /* renamed from: b */
    public final int f31361b;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.f31360a = i;
        this.f31361b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[LOOP:0: B:3:0x000a->B:12:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[LOOP:1: B:14:0x003e->B:23:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b A[EDGE_INSN: B:26:0x003b->B:13:0x003b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:24:0x0079 ?: BREAK  , SYNTHETIC] */
    @Override // androidx.compose.p003ui.text.input.EditCommand
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyTo(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.EditingBuffer r8) {
        /*
            r7 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r7.f31360a
            r1 = 0
            r2 = 0
            r3 = 0
        La:
            if (r2 >= r0) goto L3b
            int r4 = r3 + 1
            int r5 = r8.getSelectionStart$ui_text_release()
            if (r5 <= r4) goto L31
            int r5 = r8.getSelectionStart$ui_text_release()
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            char r5 = r8.get$ui_text_release(r5)
            int r6 = r8.getSelectionStart$ui_text_release()
            int r6 = r6 - r4
            char r6 = r8.get$ui_text_release(r6)
            boolean r5 = androidx.compose.p003ui.text.input.EditCommandKt.access$isSurrogatePair(r5, r6)
            if (r5 == 0) goto L31
            int r3 = r3 + 2
            goto L32
        L31:
            r3 = r4
        L32:
            int r4 = r8.getSelectionStart$ui_text_release()
            if (r3 == r4) goto L3b
            int r2 = r2 + 1
            goto La
        L3b:
            int r0 = r7.f31361b
            r2 = 0
        L3e:
            if (r1 >= r0) goto L79
            int r4 = r2 + 1
            int r5 = r8.getSelectionEnd$ui_text_release()
            int r5 = r5 + r4
            int r6 = r8.getLength$ui_text_release()
            if (r5 >= r6) goto L6a
            int r5 = r8.getSelectionEnd$ui_text_release()
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            char r5 = r8.get$ui_text_release(r5)
            int r6 = r8.getSelectionEnd$ui_text_release()
            int r6 = r6 + r4
            char r6 = r8.get$ui_text_release(r6)
            boolean r5 = androidx.compose.p003ui.text.input.EditCommandKt.access$isSurrogatePair(r5, r6)
            if (r5 == 0) goto L6a
            int r2 = r2 + 2
            goto L6b
        L6a:
            r2 = r4
        L6b:
            int r4 = r8.getSelectionEnd$ui_text_release()
            int r4 = r4 + r2
            int r5 = r8.getLength$ui_text_release()
            if (r4 == r5) goto L79
            int r1 = r1 + 1
            goto L3e
        L79:
            int r0 = r8.getSelectionEnd$ui_text_release()
            int r1 = r8.getSelectionEnd$ui_text_release()
            int r1 = r1 + r2
            r8.delete$ui_text_release(r0, r1)
            int r0 = r8.getSelectionStart$ui_text_release()
            int r0 = r0 - r3
            int r1 = r8.getSelectionStart$ui_text_release()
            r8.delete$ui_text_release(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.input.DeleteSurroundingTextInCodePointsCommand.applyTo(androidx.compose.ui.text.input.EditingBuffer):void");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        if (this.f31360a == deleteSurroundingTextInCodePointsCommand.f31360a && this.f31361b == deleteSurroundingTextInCodePointsCommand.f31361b) {
            return true;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.f31361b;
    }

    public final int getLengthBeforeCursor() {
        return this.f31360a;
    }

    public int hashCode() {
        return (this.f31360a * 31) + this.f31361b;
    }

    @NotNull
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f31360a + ", lengthAfterCursor=" + this.f31361b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
