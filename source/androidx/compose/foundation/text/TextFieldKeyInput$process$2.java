package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.CommitTextCommand;
import androidx.compose.p003ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p003ui.text.input.EditCommand;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.TextFieldValue;
import ch.qos.logback.classic.net.SyslogAppender;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput$process$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKeyInput$process$2 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
    final /* synthetic */ KeyCommand $command;
    final /* synthetic */ Ref.BooleanRef $consumed;
    final /* synthetic */ TextFieldKeyInput this$0;

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$1 */
    /* loaded from: classes.dex */
    public static final class C30061 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final C30061 INSTANCE = new C30061();

        public C30061() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection collapseLeftOr) {
            Intrinsics.checkNotNullParameter(collapseLeftOr, "$this$collapseLeftOr");
            collapseLeftOr.moveCursorLeft();
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$2 */
    /* loaded from: classes.dex */
    public static final class C30072 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final C30072 INSTANCE = new C30072();

        public C30072() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection collapseRightOr) {
            Intrinsics.checkNotNullParameter(collapseRightOr, "$this$collapseRightOr");
            collapseRightOr.moveCursorRight();
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$3 */
    /* loaded from: classes.dex */
    public static final class C30083 extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {
        public static final C30083 INSTANCE = new C30083();

        public C30083() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            return new DeleteSurroundingTextCommand(TextRange.m73211getEndimpl(deleteIfSelectedOr.m69832getSelectiond9O1mEE()) - deleteIfSelectedOr.getPrecedingCharacterIndex(), 0);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$4 */
    /* loaded from: classes.dex */
    public static final class C30094 extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {
        public static final C30094 INSTANCE = new C30094();

        public C30094() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            int nextCharacterIndex = deleteIfSelectedOr.getNextCharacterIndex();
            if (nextCharacterIndex != -1) {
                return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m73211getEndimpl(deleteIfSelectedOr.m69832getSelectiond9O1mEE()));
            }
            return null;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$5 */
    /* loaded from: classes.dex */
    public static final class C30105 extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {
        public static final C30105 INSTANCE = new C30105();

        public C30105() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            Integer previousWordOffset = deleteIfSelectedOr.getPreviousWordOffset();
            if (previousWordOffset != null) {
                return new DeleteSurroundingTextCommand(TextRange.m73211getEndimpl(deleteIfSelectedOr.m69832getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
            }
            return null;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$6 */
    /* loaded from: classes.dex */
    public static final class C30116 extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {
        public static final C30116 INSTANCE = new C30116();

        public C30116() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            Integer nextWordOffset = deleteIfSelectedOr.getNextWordOffset();
            if (nextWordOffset != null) {
                return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m73211getEndimpl(deleteIfSelectedOr.m69832getSelectiond9O1mEE()));
            }
            return null;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$7 */
    /* loaded from: classes.dex */
    public static final class C30127 extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {
        public static final C30127 INSTANCE = new C30127();

        public C30127() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            Integer lineStartByOffset = deleteIfSelectedOr.getLineStartByOffset();
            if (lineStartByOffset != null) {
                return new DeleteSurroundingTextCommand(TextRange.m73211getEndimpl(deleteIfSelectedOr.m69832getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
            }
            return null;
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$8 */
    /* loaded from: classes.dex */
    public static final class C30138 extends Lambda implements Function1<TextFieldPreparedSelection, EditCommand> {
        public static final C30138 INSTANCE = new C30138();

        public C30138() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final EditCommand invoke(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            Integer lineEndByOffset = deleteIfSelectedOr.getLineEndByOffset();
            if (lineEndByOffset != null) {
                return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m73211getEndimpl(deleteIfSelectedOr.m69832getSelectiond9O1mEE()));
            }
            return null;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInput$process$2(KeyCommand keyCommand, TextFieldKeyInput textFieldKeyInput, Ref.BooleanRef booleanRef) {
        super(1);
        this.$command = keyCommand;
        this.this$0 = textFieldKeyInput;
        this.$consumed = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        invoke2(textFieldPreparedSelection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldPreparedSelection commandExecutionContext) {
        int i;
        TextFieldValue undo;
        Function1 function1;
        TextFieldValue redo;
        Function1 function12;
        Intrinsics.checkNotNullParameter(commandExecutionContext, "$this$commandExecutionContext");
        switch (WhenMappings.$EnumSwitchMapping$0[this.$command.ordinal()]) {
            case 1:
                this.this$0.getSelectionManager().copy$foundation_release(false);
                return;
            case 2:
                this.this$0.getSelectionManager().paste$foundation_release();
                return;
            case 3:
                this.this$0.getSelectionManager().cut$foundation_release();
                return;
            case 4:
                commandExecutionContext.collapseLeftOr(C30061.INSTANCE);
                return;
            case 5:
                commandExecutionContext.collapseRightOr(C30072.INSTANCE);
                return;
            case 6:
                commandExecutionContext.moveCursorLeftByWord();
                return;
            case 7:
                commandExecutionContext.moveCursorRightByWord();
                return;
            case 8:
                commandExecutionContext.moveCursorPrevByParagraph();
                return;
            case 9:
                commandExecutionContext.moveCursorNextByParagraph();
                return;
            case 10:
                commandExecutionContext.moveCursorUpByLine();
                return;
            case 11:
                commandExecutionContext.moveCursorDownByLine();
                return;
            case 12:
                commandExecutionContext.moveCursorUpByPage();
                return;
            case 13:
                commandExecutionContext.moveCursorDownByPage();
                return;
            case 14:
                commandExecutionContext.moveCursorToLineStart();
                return;
            case 15:
                commandExecutionContext.moveCursorToLineEnd();
                return;
            case 16:
                commandExecutionContext.moveCursorToLineLeftSide();
                return;
            case 17:
                commandExecutionContext.moveCursorToLineRightSide();
                return;
            case 18:
                commandExecutionContext.moveCursorToHome();
                return;
            case 19:
                commandExecutionContext.moveCursorToEnd();
                return;
            case 20:
                List<EditCommand> deleteIfSelectedOr = commandExecutionContext.deleteIfSelectedOr(C30083.INSTANCE);
                if (deleteIfSelectedOr != null) {
                    this.this$0.m61058b(deleteIfSelectedOr);
                    return;
                }
                return;
            case 21:
                List<EditCommand> deleteIfSelectedOr2 = commandExecutionContext.deleteIfSelectedOr(C30094.INSTANCE);
                if (deleteIfSelectedOr2 != null) {
                    this.this$0.m61058b(deleteIfSelectedOr2);
                    return;
                }
                return;
            case 22:
                List<EditCommand> deleteIfSelectedOr3 = commandExecutionContext.deleteIfSelectedOr(C30105.INSTANCE);
                if (deleteIfSelectedOr3 != null) {
                    this.this$0.m61058b(deleteIfSelectedOr3);
                    return;
                }
                return;
            case 23:
                List<EditCommand> deleteIfSelectedOr4 = commandExecutionContext.deleteIfSelectedOr(C30116.INSTANCE);
                if (deleteIfSelectedOr4 != null) {
                    this.this$0.m61058b(deleteIfSelectedOr4);
                    return;
                }
                return;
            case 24:
                List<EditCommand> deleteIfSelectedOr5 = commandExecutionContext.deleteIfSelectedOr(C30127.INSTANCE);
                if (deleteIfSelectedOr5 != null) {
                    this.this$0.m61058b(deleteIfSelectedOr5);
                    return;
                }
                return;
            case 25:
                List<EditCommand> deleteIfSelectedOr6 = commandExecutionContext.deleteIfSelectedOr(C30138.INSTANCE);
                if (deleteIfSelectedOr6 != null) {
                    this.this$0.m61058b(deleteIfSelectedOr6);
                    return;
                }
                return;
            case 26:
                if (!this.this$0.getSingleLine()) {
                    this.this$0.m61059a(new CommitTextCommand("\n", 1));
                    return;
                }
                Function1<ImeAction, Unit> onImeActionPerformed = this.this$0.getState().getOnImeActionPerformed();
                i = this.this$0.f14038l;
                onImeActionPerformed.invoke(ImeAction.m73350boximpl(i));
                return;
            case 27:
                if (!this.this$0.getSingleLine()) {
                    this.this$0.m61059a(new CommitTextCommand(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, 1));
                    return;
                } else {
                    this.$consumed.element = false;
                    return;
                }
            case 28:
                commandExecutionContext.selectAll();
                return;
            case 29:
                commandExecutionContext.moveCursorLeft().selectMovement();
                return;
            case 30:
                commandExecutionContext.moveCursorRight().selectMovement();
                return;
            case 31:
                commandExecutionContext.moveCursorLeftByWord().selectMovement();
                return;
            case 32:
                commandExecutionContext.moveCursorRightByWord().selectMovement();
                return;
            case 33:
                commandExecutionContext.moveCursorPrevByParagraph().selectMovement();
                return;
            case 34:
                commandExecutionContext.moveCursorNextByParagraph().selectMovement();
                return;
            case 35:
                commandExecutionContext.moveCursorToLineStart().selectMovement();
                return;
            case 36:
                commandExecutionContext.moveCursorToLineEnd().selectMovement();
                return;
            case 37:
                commandExecutionContext.moveCursorToLineLeftSide().selectMovement();
                return;
            case 38:
                commandExecutionContext.moveCursorToLineRightSide().selectMovement();
                return;
            case 39:
                commandExecutionContext.moveCursorUpByLine().selectMovement();
                return;
            case 40:
                commandExecutionContext.moveCursorDownByLine().selectMovement();
                return;
            case 41:
                commandExecutionContext.moveCursorUpByPage().selectMovement();
                return;
            case 42:
                commandExecutionContext.moveCursorDownByPage().selectMovement();
                return;
            case 43:
                commandExecutionContext.moveCursorToHome().selectMovement();
                return;
            case 44:
                commandExecutionContext.moveCursorToEnd().selectMovement();
                return;
            case 45:
                commandExecutionContext.deselect();
                return;
            case 46:
                UndoManager undoManager = this.this$0.getUndoManager();
                if (undoManager != null) {
                    undoManager.makeSnapshot(commandExecutionContext.getValue());
                }
                UndoManager undoManager2 = this.this$0.getUndoManager();
                if (undoManager2 == null || (undo = undoManager2.undo()) == null) {
                    return;
                }
                function1 = this.this$0.f14037k;
                function1.invoke(undo);
                return;
            case 47:
                UndoManager undoManager3 = this.this$0.getUndoManager();
                if (undoManager3 == null || (redo = undoManager3.redo()) == null) {
                    return;
                }
                function12 = this.this$0.f14037k;
                function12.invoke(redo);
                return;
            case 48:
                KeyEventHelpers_androidKt.showCharacterPalette();
                return;
            default:
                return;
        }
    }
}
