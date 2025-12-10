package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.AnnotatedStringKt;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R$\u0010 \u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001c8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m28850d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "reset", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextInputSession;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "apply", "(Ljava/util/List;)Landroidx/compose/ui/text/input/TextFieldValue;", "toTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "failedCommand", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", "<set-?>", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text_release", "mBufferState", "Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n33#2,6:174\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:174,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.EditProcessor */
/* loaded from: classes2.dex */
public final class EditProcessor {
    public static final int $stable = 8;

    /* renamed from: a */
    public TextFieldValue f31362a = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m73221getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);

    /* renamed from: b */
    public EditingBuffer f31363b = new EditingBuffer(this.f31362a.getAnnotatedString(), this.f31362a.m73425getSelectiond9O1mEE(), (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String m59033a(List list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.f31363b.getLength$ui_text_release() + ", composition=" + this.f31363b.m73347getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m73219toStringimpl(this.f31363b.m73348getSelectiond9O1mEE$ui_text_release())) + "):");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        CollectionsKt___CollectionsKt.joinTo(list, sb, (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : new EditProcessor$generateBatchErrorMessage$1$1(editCommand, this));
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final TextFieldValue apply(@NotNull List<? extends EditCommand> editCommands) {
        EditCommand editCommand;
        Exception e;
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        EditCommand editCommand2 = null;
        try {
            int size = editCommands.size();
            int i = 0;
            while (i < size) {
                editCommand = editCommands.get(i);
                try {
                    editCommand.applyTo(this.f31363b);
                    i++;
                    editCommand2 = editCommand;
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(m59033a(editCommands, editCommand), e);
                }
            }
            TextFieldValue textFieldValue = new TextFieldValue(this.f31363b.toAnnotatedString$ui_text_release(), this.f31363b.m73348getSelectiond9O1mEE$ui_text_release(), this.f31363b.m73347getCompositionMzsxiRA$ui_text_release(), (DefaultConstructorMarker) null);
            this.f31362a = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            editCommand = editCommand2;
            e = e3;
        }
    }

    /* renamed from: b */
    public final String m59032b(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        } else if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb2.toString();
        } else if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        } else {
            if (editCommand instanceof DeleteSurroundingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof SetSelectionCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof FinishComposingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof BackspaceCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof MoveCursorCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteAllCommand) {
                return editCommand.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown EditCommand: ");
            String simpleName = Reflection.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "{anonymous EditCommand}";
            }
            sb3.append(simpleName);
            return sb3.toString();
        }
    }

    @NotNull
    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.f31363b;
    }

    @NotNull
    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.f31362a;
    }

    public final void reset(@NotNull TextFieldValue value, @Nullable TextInputSession textInputSession) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual(value.m73424getCompositionMzsxiRA(), this.f31363b.m73347getCompositionMzsxiRA$ui_text_release());
        boolean z3 = false;
        if (!Intrinsics.areEqual(this.f31362a.getAnnotatedString(), value.getAnnotatedString())) {
            this.f31363b = new EditingBuffer(value.getAnnotatedString(), value.m73425getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
        } else if (!TextRange.m73209equalsimpl0(this.f31362a.m73425getSelectiond9O1mEE(), value.m73425getSelectiond9O1mEE())) {
            this.f31363b.setSelection$ui_text_release(TextRange.m73214getMinimpl(value.m73425getSelectiond9O1mEE()), TextRange.m73213getMaximpl(value.m73425getSelectiond9O1mEE()));
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        if (value.m73424getCompositionMzsxiRA() == null) {
            this.f31363b.commitComposition$ui_text_release();
        } else if (!TextRange.m73210getCollapsedimpl(value.m73424getCompositionMzsxiRA().m73220unboximpl())) {
            this.f31363b.setComposition$ui_text_release(TextRange.m73214getMinimpl(value.m73424getCompositionMzsxiRA().m73220unboximpl()), TextRange.m73213getMaximpl(value.m73424getCompositionMzsxiRA().m73220unboximpl()));
        }
        if (z || (!z3 && z2)) {
            this.f31363b.commitComposition$ui_text_release();
            value = TextFieldValue.m73420copy3r_uNRQ$default(value, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue = this.f31362a;
        this.f31362a = value;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue, value);
        }
    }

    @NotNull
    public final TextFieldValue toTextFieldValue() {
        return this.f31362a;
    }
}
