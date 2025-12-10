package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m29142d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "<init>", "()V", "", OperatorName.FILL_NON_ZERO, "e", "", OperatorName.CURVE_TO, "", "esc", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(IC)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(CC)V", "", "cl", "d", "(IB)V", "(CB)V", "", "ESCAPE_2_CHAR", "[C", "", "CHAR_TO_TOKEN", "[B", "kotlinx-serialization-json"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class CharMappings {
    @JvmField
    @NotNull
    public static final byte[] CHAR_TO_TOKEN;
    @JvmField
    @NotNull
    public static final char[] ESCAPE_2_CHAR;
    @NotNull
    public static final CharMappings INSTANCE;

    static {
        CharMappings charMappings = new CharMappings();
        INSTANCE = charMappings;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[WebSocketProtocol.PAYLOAD_SHORT];
        charMappings.m26938f();
        charMappings.m26939e();
    }

    /* renamed from: a */
    public final void m26943a(char c, char c2) {
        m26942b(c, c2);
    }

    /* renamed from: b */
    public final void m26942b(int i, char c) {
        if (c != 'u') {
            ESCAPE_2_CHAR[c] = (char) i;
        }
    }

    /* renamed from: c */
    public final void m26941c(char c, byte b) {
        m26940d(c, b);
    }

    /* renamed from: d */
    public final void m26940d(int i, byte b) {
        CHAR_TO_TOKEN[i] = b;
    }

    /* renamed from: e */
    public final void m26939e() {
        for (int i = 0; i < 33; i++) {
            m26940d(i, Byte.MAX_VALUE);
        }
        m26940d(9, (byte) 3);
        m26940d(10, (byte) 3);
        m26940d(13, (byte) 3);
        m26940d(32, (byte) 3);
        m26941c(',', (byte) 4);
        m26941c(':', (byte) 5);
        m26941c('{', (byte) 6);
        m26941c('}', (byte) 7);
        m26941c(AbstractJsonLexerKt.BEGIN_LIST, (byte) 8);
        m26941c(AbstractJsonLexerKt.END_LIST, (byte) 9);
        m26941c('\"', (byte) 1);
        m26941c('\\', (byte) 2);
    }

    /* renamed from: f */
    public final void m26938f() {
        for (int i = 0; i < 32; i++) {
            m26942b(i, AbstractJsonLexerKt.UNICODE_ESC);
        }
        m26942b(8, 'b');
        m26942b(9, 't');
        m26942b(10, 'n');
        m26942b(12, 'f');
        m26942b(13, 'r');
        m26943a('/', '/');
        m26943a('\"', '\"');
        m26943a('\\', '\\');
    }
}