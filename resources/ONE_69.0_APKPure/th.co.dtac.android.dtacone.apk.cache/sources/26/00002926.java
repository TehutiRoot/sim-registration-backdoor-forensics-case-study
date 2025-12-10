package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.p003ui.input.key.KeyEventType;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.CommitTextCommand;
import androidx.compose.p003ui.text.input.EditCommand;
import androidx.compose.p003ui.text.input.EditProcessor;
import androidx.compose.p003ui.text.input.FinishComposingTextCommand;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.TextFieldValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u00002\u00020\u0001B\u0086\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u0016*\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J(\u0010-\u001a\u00020\u00162\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b+H\u0002¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001d\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bO\u0010P\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, m29142d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "Landroidx/compose/foundation/text/TextFieldState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "editable", "singleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyCombiner", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "process", "", "Landroidx/compose/ui/text/input/EditCommand;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/List;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/input/EditCommand;)V", "Landroidx/compose/ui/text/input/CommitTextCommand;", "d", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "block", OperatorName.CURVE_TO, "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/text/TextFieldState;", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Z", "getEditable", "()Z", "e", "getSingleLine", OperatorName.FILL_NON_ZERO, "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", OperatorName.CLOSE_PATH, "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "i", "Landroidx/compose/foundation/text/DeadKeyCombiner;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/foundation/text/KeyMapping;", OperatorName.NON_STROKING_CMYK, "Lkotlin/jvm/functions/Function1;", OperatorName.LINE_TO, "I", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldKeyInput {

    /* renamed from: a */
    public final TextFieldState f14115a;

    /* renamed from: b */
    public final TextFieldSelectionManager f14116b;

    /* renamed from: c */
    public final TextFieldValue f14117c;

    /* renamed from: d */
    public final boolean f14118d;

    /* renamed from: e */
    public final boolean f14119e;

    /* renamed from: f */
    public final TextPreparedSelectionState f14120f;

    /* renamed from: g */
    public final OffsetMapping f14121g;

    /* renamed from: h */
    public final UndoManager f14122h;

    /* renamed from: i */
    public final DeadKeyCombiner f14123i;

    /* renamed from: j */
    public final KeyMapping f14124j;

    /* renamed from: k */
    public final Function1 f14125k;

    /* renamed from: l */
    public final int f14126l;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/input/TextFieldValue;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$1 */
    /* loaded from: classes.dex */
    public static final class C29871 extends Lambda implements Function1<TextFieldValue, Unit> {
        public static final C29871 INSTANCE = new C29871();

        public C29871() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, function1, i);
    }

    /* renamed from: a */
    public final void m61009a(EditCommand editCommand) {
        m61008b(AbstractC10100ds.listOf(editCommand));
    }

    /* renamed from: b */
    public final void m61008b(List list) {
        EditProcessor processor = this.f14115a.getProcessor();
        List<? extends EditCommand> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new FinishComposingTextCommand());
        this.f14125k.invoke(processor.apply(mutableList));
    }

    /* renamed from: c */
    public final void m61007c(Function1 function1) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.f14117c, this.f14121g, this.f14115a.getLayoutResult(), this.f14120f);
        function1.invoke(textFieldPreparedSelection);
        if (!TextRange.m73393equalsimpl0(textFieldPreparedSelection.m70016getSelectiond9O1mEE(), this.f14117c.m73609getSelectiond9O1mEE()) || !Intrinsics.areEqual(textFieldPreparedSelection.getAnnotatedString(), this.f14117c.getAnnotatedString())) {
            this.f14125k.invoke(textFieldPreparedSelection.getValue());
        }
    }

    /* renamed from: d */
    public final CommitTextCommand m61006d(KeyEvent keyEvent) {
        Integer m69917consumeZmokQxo;
        if (!TextFieldKeyInput_androidKt.m69975isTypedEventZmokQxo(keyEvent) || (m69917consumeZmokQxo = this.f14123i.m69917consumeZmokQxo(keyEvent)) == null) {
            return null;
        }
        String sb = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), m69917consumeZmokQxo.intValue()).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().appendCo…ntX(codePoint).toString()");
        return new CommitTextCommand(sb, 1);
    }

    public final boolean getEditable() {
        return this.f14118d;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.f14121g;
    }

    @NotNull
    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.f14120f;
    }

    @NotNull
    public final TextFieldSelectionManager getSelectionManager() {
        return this.f14116b;
    }

    public final boolean getSingleLine() {
        return this.f14119e;
    }

    @NotNull
    public final TextFieldState getState() {
        return this.f14115a;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.f14122h;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return this.f14117c;
    }

    /* renamed from: process-ZmokQxo  reason: not valid java name */
    public final boolean m69971processZmokQxo(@NotNull KeyEvent event) {
        KeyCommand mo69919mapZmokQxo;
        Intrinsics.checkNotNullParameter(event, "event");
        CommitTextCommand m61006d = m61006d(event);
        if (m61006d != null) {
            if (this.f14118d) {
                m61009a(m61006d);
                this.f14120f.resetCachedX();
                return true;
            }
            return false;
        } else if (!KeyEventType.m72781equalsimpl0(KeyEvent_androidKt.m72789getTypeZmokQxo(event), KeyEventType.Companion.m72785getKeyDownCS__XNY()) || (mo69919mapZmokQxo = this.f14124j.mo69919mapZmokQxo(event)) == null || (mo69919mapZmokQxo.getEditsText() && !this.f14118d)) {
            return false;
        } else {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            m61007c(new TextFieldKeyInput$process$2(mo69919mapZmokQxo, this, booleanRef));
            UndoManager undoManager = this.f14122h;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
            return booleanRef.element;
        }
    }

    public TextFieldKeyInput(TextFieldState state, TextFieldSelectionManager selectionManager, TextFieldValue value, boolean z, boolean z2, TextPreparedSelectionState preparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner keyCombiner, KeyMapping keyMapping, Function1 onValueChange, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(preparedSelectionState, "preparedSelectionState");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(keyCombiner, "keyCombiner");
        Intrinsics.checkNotNullParameter(keyMapping, "keyMapping");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        this.f14115a = state;
        this.f14116b = selectionManager;
        this.f14117c = value;
        this.f14118d = z;
        this.f14119e = z2;
        this.f14120f = preparedSelectionState;
        this.f14121g = offsetMapping;
        this.f14122h = undoManager;
        this.f14123i = keyCombiner;
        this.f14124j = keyMapping;
        this.f14125k = onValueChange;
        this.f14126l = i;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, Function1 function1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, textPreparedSelectionState, (i2 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i2 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i2 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i2 & 1024) != 0 ? C29871.INSTANCE : function1, i, null);
    }
}