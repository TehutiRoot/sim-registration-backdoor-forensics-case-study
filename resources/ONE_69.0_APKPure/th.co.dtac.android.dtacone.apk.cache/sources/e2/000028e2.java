package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.p003ui.input.key.KeyEvent_androidKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m29142d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "consume", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "deadKeyCode", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes.dex */
public final class DeadKeyCombiner {

    /* renamed from: a */
    public Integer f14050a;

    @Nullable
    /* renamed from: consume-ZmokQxo  reason: not valid java name */
    public final Integer m69917consumeZmokQxo(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int m72790getUtf16CodePointZmokQxo = KeyEvent_androidKt.m72790getUtf16CodePointZmokQxo(event);
        Integer num = null;
        if ((Integer.MIN_VALUE & m72790getUtf16CodePointZmokQxo) != 0) {
            this.f14050a = Integer.valueOf(m72790getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.f14050a;
        if (num2 != null) {
            this.f14050a = null;
            Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), m72790getUtf16CodePointZmokQxo));
            if (valueOf.intValue() != 0) {
                num = valueOf;
            }
            if (num == null) {
                return Integer.valueOf(m72790getUtf16CodePointZmokQxo);
            }
            return num;
        }
        return Integer.valueOf(m72790getUtf16CodePointZmokQxo);
    }
}