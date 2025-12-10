package androidx.compose.p003ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardCapitalization;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.TextInputServiceAndroid_androidKt;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28850d2 = {"Landroid/view/inputmethod/EditorInfo;", "", OperatorName.FILL_NON_ZERO, "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "update", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "bits", "flag", "", "e", "(II)Z", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt */
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid_androidKt {
    /* renamed from: a */
    public static /* synthetic */ void m59007a(Runnable runnable, long j) {
        m59004d(runnable, j);
    }

    @NotNull
    public static final Executor asExecutor(@NotNull final Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "<this>");
        return new Executor() { // from class: kS1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.m59006b(choreographer, runnable);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m59006b(Choreographer choreographer, Runnable runnable) {
        m59005c(choreographer, runnable);
    }

    /* renamed from: c */
    public static final void m59005c(Choreographer this_asExecutor, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this_asExecutor, "$this_asExecutor");
        this_asExecutor.postFrameCallback(new Choreographer.FrameCallback() { // from class: lS1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                TextInputServiceAndroid_androidKt.m59007a(runnable, j);
            }
        });
    }

    /* renamed from: d */
    public static final void m59004d(Runnable runnable, long j) {
        runnable.run();
    }

    /* renamed from: e */
    public static final boolean m59003e(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: f */
    public static final void m59002f(EditorInfo editorInfo) {
        if (!EmojiCompat.isConfigured()) {
            return;
        }
        EmojiCompat.get().updateEditorInfo(editorInfo);
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int m73376getImeActioneUduSuo = imeOptions.m73376getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i = 6;
        if (ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73365getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73369getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73367getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73368getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73370getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73371getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73372getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m73353equalsimpl0(m73376getImeActioneUduSuo, companion.m73366getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int m73377getKeyboardTypePjHm6EE = imeOptions.m73377getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73418getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73411getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73414getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73417getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73419getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73413getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73416getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73415getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m73398equalsimpl0(m73377getKeyboardTypePjHm6EE, companion2.m73412getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && m59003e(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m73353equalsimpl0(imeOptions.m73376getImeActioneUduSuo(), companion.m73365getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m59003e(editorInfo.inputType, 1)) {
            int m73375getCapitalizationIUNYP9k = imeOptions.m73375getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m73383equalsimpl0(m73375getCapitalizationIUNYP9k, companion3.m73391getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m73383equalsimpl0(m73375getCapitalizationIUNYP9k, companion3.m73394getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m73383equalsimpl0(m73375getCapitalizationIUNYP9k, companion3.m73393getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m73216getStartimpl(textFieldValue.m73425getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m73211getEndimpl(textFieldValue.m73425getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
    }
}
