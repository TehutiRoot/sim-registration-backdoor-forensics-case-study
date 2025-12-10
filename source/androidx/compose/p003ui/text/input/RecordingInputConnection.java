package androidx.compose.p003ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.p003ui.text.TextRange;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u00152\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u00103J!\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010+\u001a\u00020\u0017H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b:\u00103J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b<\u00103J\u0019\u0010>\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bH\u00103J\u0017\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H\u0016¢\u0006\u0004\bM\u0010NJ#\u0010S\u001a\u00020\u00062\b\u0010P\u001a\u0004\u0018\u00010O2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ)\u0010X\u001a\u00020\u00062\u0006\u0010V\u001a\u00020U2\u0006\u0010+\u001a\u00020\u00172\b\u0010W\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\r2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0006H\u0002¢\u0006\u0004\b^\u0010\u0011J\u000f\u0010_\u001a\u00020\u0006H\u0002¢\u0006\u0004\b_\u0010\u0011J\u0017\u0010a\u001a\u00020\r2\u0006\u0010`\u001a\u00020\u0017H\u0002¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b^\u0010f\u001a\u0004\bg\u0010\u0011R\u0016\u0010i\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010hR*\u0010p\u001a\u00020\u00022\u0006\u0010j\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010hR\u0016\u0010t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010fR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020Z0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010f¨\u0006{"}, m28850d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "initState", "Landroidx/compose/ui/text/input/InputEventCallback2;", "eventCallback", "", "autoCorrect", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputMethodManager;)V", "beginBatchEdit", "()Z", "endBatchEdit", "closeConnection", "()V", "", TextBundle.TEXT_ENTRY, "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Landroidx/compose/ui/text/input/EditCommand;", "editCommand", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/input/EditCommand;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "code", "d", "(I)V", "Landroidx/compose/ui/text/input/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "Z", "getAutoCorrect", "I", "batchDepth", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "mTextFieldValue", "e", "currentExtractedTextRequestToken", OperatorName.FILL_NON_ZERO, "extractedTextMonitorMode", "", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "editCommands", OperatorName.CLOSE_PATH, "isActive", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,403:1\n80#1,5:404\n80#1,5:409\n80#1,5:414\n80#1,5:419\n80#1,5:424\n80#1,5:429\n80#1,5:434\n80#1,5:439\n80#1,5:444\n80#1,5:449\n80#1,5:454\n80#1,5:459\n80#1,5:464\n80#1,5:469\n80#1,5:474\n80#1,5:479\n80#1,5:484\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n139#1:404,5\n175#1:409,5\n180#1:414,5\n186#1:419,5\n194#1:424,5\n205#1:429,5\n211#1:434,5\n217#1:439,5\n223#1:444,5\n259#1:449,5\n295#1:454,5\n321#1:459,5\n344#1:464,5\n354#1:469,5\n366#1:474,5\n386#1:479,5\n395#1:484,5\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.RecordingInputConnection */
/* loaded from: classes2.dex */
public final class RecordingInputConnection implements InputConnection {

    /* renamed from: a */
    public final InputEventCallback2 f31425a;

    /* renamed from: b */
    public final boolean f31426b;

    /* renamed from: c */
    public int f31427c;

    /* renamed from: d */
    public TextFieldValue f31428d;

    /* renamed from: e */
    public int f31429e;

    /* renamed from: f */
    public boolean f31430f;

    /* renamed from: g */
    public final List f31431g;

    /* renamed from: h */
    public boolean f31432h;

    public RecordingInputConnection(@NotNull TextFieldValue initState, @NotNull InputEventCallback2 eventCallback, boolean z) {
        Intrinsics.checkNotNullParameter(initState, "initState");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f31425a = eventCallback;
        this.f31426b = z;
        this.f31428d = initState;
        this.f31431g = new ArrayList();
        this.f31432h = true;
    }

    /* renamed from: a */
    public final void m59019a(EditCommand editCommand) {
        m59018b();
        try {
            this.f31431g.add(editCommand);
        } finally {
            m59017c();
        }
    }

    /* renamed from: b */
    public final boolean m59018b() {
        this.f31427c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.f31432h;
        if (z) {
            return m59018b();
        }
        return z;
    }

    /* renamed from: c */
    public final boolean m59017c() {
        int i = this.f31427c - 1;
        this.f31427c = i;
        if (i == 0 && (!this.f31431g.isEmpty())) {
            this.f31425a.onEditCommands(CollectionsKt___CollectionsKt.toMutableList((Collection) this.f31431g));
            this.f31431g.clear();
        }
        if (this.f31427c > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f31432h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f31431g.clear();
        this.f31427c = 0;
        this.f31432h = false;
        this.f31425a.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        boolean z = this.f31432h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        boolean z = this.f31432h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z = this.f31432h;
        if (z) {
            return this.f31426b;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence, int i) {
        boolean z = this.f31432h;
        if (z) {
            m59019a(new CommitTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* renamed from: d */
    public final void m59016d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f31432h;
        if (z) {
            m59019a(new DeleteSurroundingTextCommand(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f31432h;
        if (z) {
            m59019a(new DeleteSurroundingTextInCodePointsCommand(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return m59017c();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.f31432h;
        if (z) {
            m59019a(new FinishComposingTextCommand());
            return true;
        }
        return z;
    }

    public final boolean getAutoCorrect() {
        return this.f31426b;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f31428d.getText(), TextRange.m73214getMinimpl(this.f31428d.m73425getSelectiond9O1mEE()), i);
    }

    @NotNull
    public final InputEventCallback2 getEventCallback() {
        return this.f31425a;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f31430f = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.f31429e = i2;
        }
        return InputState_androidKt.toExtractedText(this.f31428d);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @NotNull
    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.f31428d;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int i) {
        if (TextRange.m73210getCollapsedimpl(this.f31428d.m73425getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.f31428d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.getTextAfterSelection(this.f31428d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.getTextBeforeSelection(this.f31428d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.f31432h;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    m59019a(new SetSelectionCommand(0, this.f31428d.getText().length()));
                    break;
                case 16908320:
                    m59016d(277);
                    break;
                case 16908321:
                    m59016d(278);
                    break;
                case 16908322:
                    m59016d(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int m73365getDefaulteUduSuo;
        boolean z = this.f31432h;
        if (z) {
            if (i != 0) {
                switch (i) {
                    case 2:
                        m73365getDefaulteUduSuo = ImeAction.Companion.m73367getGoeUduSuo();
                        break;
                    case 3:
                        m73365getDefaulteUduSuo = ImeAction.Companion.m73371getSearcheUduSuo();
                        break;
                    case 4:
                        m73365getDefaulteUduSuo = ImeAction.Companion.m73372getSendeUduSuo();
                        break;
                    case 5:
                        m73365getDefaulteUduSuo = ImeAction.Companion.m73368getNexteUduSuo();
                        break;
                    case 6:
                        m73365getDefaulteUduSuo = ImeAction.Companion.m73366getDoneeUduSuo();
                        break;
                    case 7:
                        m73365getDefaulteUduSuo = ImeAction.Companion.m73370getPreviouseUduSuo();
                        break;
                    default:
                        Log.w(RecordingInputConnection_androidKt.TAG, "IME sends unsupported Editor Action: " + i);
                        m73365getDefaulteUduSuo = ImeAction.Companion.m73365getDefaulteUduSuo();
                        break;
                }
            } else {
                m73365getDefaulteUduSuo = ImeAction.Companion.m73365getDefaulteUduSuo();
            }
            this.f31425a.mo73379onImeActionKlQnJC8(m73365getDefaulteUduSuo);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        boolean z = this.f31432h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z = this.f31432h;
        if (z) {
            Log.w(RecordingInputConnection_androidKt.TAG, "requestCursorUpdates is not supported");
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = this.f31432h;
        if (z) {
            this.f31425a.onKeyEvent(event);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f31432h;
        if (z) {
            m59019a(new SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence, int i) {
        boolean z = this.f31432h;
        if (z) {
            m59019a(new SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(@NotNull TextFieldValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f31428d = value;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.f31432h;
        if (z) {
            m59019a(new SetSelectionCommand(i, i2));
            return true;
        }
        return z;
    }

    public final void updateInputState(@NotNull TextFieldValue state, @NotNull InputMethodManager inputMethodManager) {
        int i;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        if (!this.f31432h) {
            return;
        }
        setMTextFieldValue$ui_release(state);
        if (this.f31430f) {
            inputMethodManager.updateExtractedText(this.f31429e, InputState_androidKt.toExtractedText(state));
        }
        TextRange m73424getCompositionMzsxiRA = state.m73424getCompositionMzsxiRA();
        int i2 = -1;
        if (m73424getCompositionMzsxiRA != null) {
            i = TextRange.m73214getMinimpl(m73424getCompositionMzsxiRA.m73220unboximpl());
        } else {
            i = -1;
        }
        TextRange m73424getCompositionMzsxiRA2 = state.m73424getCompositionMzsxiRA();
        if (m73424getCompositionMzsxiRA2 != null) {
            i2 = TextRange.m73213getMaximpl(m73424getCompositionMzsxiRA2.m73220unboximpl());
        }
        inputMethodManager.updateSelection(TextRange.m73214getMinimpl(state.m73425getSelectiond9O1mEE()), TextRange.m73213getMaximpl(state.m73425getSelectiond9O1mEE()), i, i2);
    }
}
