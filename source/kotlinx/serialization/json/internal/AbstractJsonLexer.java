package kotlinx.serialization.json.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\nH\u0003¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u0010\u0003J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010!J\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH&¢\u0006\u0004\b4\u0010$J\u000f\u00105\u001a\u00020\u0004H&¢\u0006\u0004\b5\u0010!J\u000f\u00106\u001a\u00020\u0004H&¢\u0006\u0004\b6\u0010!J\u000f\u00108\u001a\u000207H&¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006H\u0004¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0013¢\u0006\u0004\b<\u0010\u0003J\u0015\u00108\u001a\u0002072\u0006\u0010=\u001a\u000207¢\u0006\u0004\b8\u0010>J\u0017\u00108\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010?J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0006H\u0004¢\u0006\u0004\b@\u0010?J!\u0010F\u001a\u00020C2\u0006\u0010A\u001a\u0002072\b\b\u0002\u0010B\u001a\u00020\u0004H\u0000¢\u0006\u0004\bD\u0010EJ\r\u0010G\u001a\u000207¢\u0006\u0004\bG\u00109J\u0017\u0010I\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u0004¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010LJ!\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010M\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0013¢\u0006\u0004\bR\u0010\u0003J\u001f\u0010S\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010V\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\n2\u0006\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010\u001dJ\u000f\u0010W\u001a\u00020\u000fH&¢\u0006\u0004\bW\u0010\u001fJ:\u0010X\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0016¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u000f¢\u0006\u0004\bZ\u0010\u001fJ'\u0010Z\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0005¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020\u000f¢\u0006\u0004\b\\\u0010\u001fJ\r\u0010]\u001a\u00020\u000f¢\u0006\u0004\b]\u0010\u001fJ\u001f\u0010^\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014¢\u0006\u0004\b^\u0010_J3\u0010e\u001a\u00020\u00132\u0006\u0010`\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\n2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000f0aH\u0080\bø\u0001\u0000¢\u0006\u0004\bc\u0010dJ\u0015\u0010g\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u0004¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u000fH\u0016¢\u0006\u0004\bi\u0010\u001fJ\u0015\u0010k\u001a\u00020\u00132\u0006\u0010j\u001a\u00020\u000f¢\u0006\u0004\bk\u0010lJ)\u0010F\u001a\u00020C2\u0006\u0010b\u001a\u00020\u000f2\b\b\u0002\u00103\u001a\u00020\n2\b\b\u0002\u0010m\u001a\u00020\u000f¢\u0006\u0004\bF\u0010nJ\r\u0010p\u001a\u00020o¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\u0004¢\u0006\u0004\br\u0010!J\r\u0010s\u001a\u00020\u0004¢\u0006\u0004\bs\u0010!R\u0016\u0010\u001b\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010tR\u0014\u0010v\u001a\u00020u8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010xR(\u0010\u0081\u0001\u001a\u00060zj\u0002`{8\u0004@\u0004X\u0084\u000e¢\u0006\u0013\n\u0004\b\u0019\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010&\u001a\u00020%8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0084\u0001"}, m28850d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "<init>", "()V", "", "isLenient", "", "char", "i", "(ZC)Z", "", "fromIndex", "toIndex", "currentChunkHasEscape", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "stringChunk", "", "consumeChunk", OperatorName.LINE_TO, "(IIZLkotlin/jvm/functions/Function1;)V", "lastPosition", "current", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(II)I", "currentPosition", OperatorName.NON_STROKING_GRAY, "(II)Ljava/lang/String;", OperatorName.SET_LINE_JOINSTYLE, "()Ljava/lang/String;", OperatorName.NON_STROKING_CMYK, "()Z", "startPosition", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)I", "", "source", "startPos", OperatorName.CURVE_TO, "(Ljava/lang/CharSequence;I)I", OperatorName.CLOSE_PATH, "start", "d", "(I)Z", "literalSuffix", "e", "(Ljava/lang/String;I)V", "ensureHaveChars", "isNotEof", "position", "prefetchOrEof", "tryConsumeComma", "canConsumeValue", "", "consumeNextToken", "()B", "isValidValueStart", "(C)Z", "expectEof", "expected", "(B)B", "(C)V", "unexpectedToken", "expectedToken", "wasConsumed", "", "fail$kotlinx_serialization_json", "(BZ)Ljava/lang/Void;", "fail", "peekNextToken", "doConsume", "tryConsumeNull", "(Z)Z", "skipWhitespaces", "()I", "keyToMatch", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "peekString", "(Z)Ljava/lang/String;", "discardPeeked", "indexOf", "(CI)I", "endPos", "substring", "consumeKeyString", "consumeStringChunked", "(ZLkotlin/jvm/functions/Function1;)V", "consumeString", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "consumeStringLenientNotNull", "consumeStringLenient", "appendRange", "(II)V", "condition", "Lkotlin/Function0;", "message", "require$kotlinx_serialization_json", "(ZILkotlin/jvm/functions/Function0;)V", "require", "allowLenientStrings", "skipElement", "(Z)V", "toString", Action.KEY_ATTRIBUTE, "failOnUnknownKey", "(Ljava/lang/String;)V", "hint", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "consumeNumericLiteral", "()J", "consumeBoolean", "consumeBooleanLenient", "I", "Lkotlinx/serialization/json/internal/JsonPath;", ClientCookie.PATH_ATTR, "Lkotlinx/serialization/json/internal/JsonPath;", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", "getSource", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,765:1\n757#1,5:766\n1#2:771\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n218#1:766,5\n*E\n"})
/* loaded from: classes6.dex */
public abstract class AbstractJsonLexer {

    /* renamed from: a */
    public String f71350a;
    @JvmField
    public int currentPosition;
    @JvmField
    @NotNull
    public final JsonPath path = new JsonPath();

    /* renamed from: b */
    public StringBuilder f71351b = new StringBuilder();

    /* renamed from: f */
    public static final double m26675f(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (z) {
            return Math.pow(10.0d, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = abstractJsonLexer.currentPosition;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return abstractJsonLexer.fail(str, i, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, byte b, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return abstractJsonLexer.fail$kotlinx_serialization_json(b, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Function0 message, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = abstractJsonLexer.currentPosition;
            }
            int i3 = i;
            Intrinsics.checkNotNullParameter(message, "message");
            if (z) {
                return;
            }
            fail$default(abstractJsonLexer, (String) message.invoke(), i3, null, 4, null);
            throw new KotlinNothingValueException();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return abstractJsonLexer.tryConsumeNull(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    /* renamed from: a */
    public final int m26680a(int i) {
        int prefetchOrEof = prefetchOrEof(i);
        if (prefetchOrEof != -1) {
            int i2 = prefetchOrEof + 1;
            char charAt = getSource().charAt(prefetchOrEof);
            if (charAt == 'u') {
                return m26678c(getSource(), i2);
            }
            char escapeToChar = AbstractJsonLexerKt.escapeToChar(charAt);
            if (escapeToChar != 0) {
                this.f71351b.append(escapeToChar);
                return i2;
            }
            fail$default(this, "Invalid escaped char '" + charAt + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void appendRange(int i, int i2) {
        this.f71351b.append(getSource(), i, i2);
    }

    /* renamed from: b */
    public final int m26679b(int i, int i2) {
        appendRange(i, i2);
        return m26680a(i2 + 1);
    }

    /* renamed from: c */
    public final int m26678c(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.currentPosition = i;
            ensureHaveChars();
            if (this.currentPosition + 4 < charSequence.length()) {
                return m26678c(charSequence, this.currentPosition);
            }
            fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.f71351b.append((char) ((m26673h(charSequence, i) << 12) + (m26673h(charSequence, i + 1) << 8) + (m26673h(charSequence, i + 2) << 4) + m26673h(charSequence, i + 3)));
        return i2;
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return m26677d(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z;
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces != getSource().length()) {
            if (getSource().charAt(skipWhitespaces) == '\"') {
                skipWhitespaces++;
                z = true;
            } else {
                z = false;
            }
            boolean m26677d = m26677d(skipWhitespaces);
            if (z) {
                if (this.currentPosition != getSource().length()) {
                    if (getSource().charAt(this.currentPosition) == '\"') {
                        this.currentPosition++;
                    } else {
                        fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    fail$default(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return m26677d;
        }
        fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte b) {
        byte consumeNextToken = consumeNextToken();
        if (consumeNextToken == b) {
            return consumeNextToken;
        }
        fail$kotlinx_serialization_json$default(this, b, false, 2, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f9, code lost:
        fail$default(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0209, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
        if (r5 == r0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0148, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0149, code lost:
        if (r0 == r5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
        if (r10 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014f, code lost:
        if (r0 == (r5 - 1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
        if (r1 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0153, code lost:
        if (r3 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015f, code lost:
        if (getSource().charAt(r5) != '\"') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0161, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
        fail$default(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0175, code lost:
        fail$default(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
        r17.currentPosition = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0188, code lost:
        if (r9 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
        r0 = r11 * m26675f(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
        if (r0 > 9.223372036854776E18d) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019b, code lost:
        if (r0 < (-9.223372036854776E18d)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a3, code lost:
        if (java.lang.Math.floor(r0) != r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a5, code lost:
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a7, code lost:
        fail$default(r17, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cb, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cc, code lost:
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01dc, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dd, code lost:
        if (r10 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
        if (r11 == Long.MIN_VALUE) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
        fail$default(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f8, code lost:
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long consumeNumericLiteral() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonLexer.consumeNumericLiteral():long");
    }

    @NotNull
    public final String consumeString() {
        if (this.f71350a != null) {
            return m26671j();
        }
        return consumeKeyString();
    }

    public void consumeStringChunked(boolean z, @NotNull Function1<? super String, Unit> consumeChunk) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        byte peekNextToken = peekNextToken();
        if (z && peekNextToken != 0) {
            return;
        }
        if (!z) {
            consumeNextToken('\"');
        }
        int i3 = this.currentPosition;
        char charAt = getSource().charAt(i3);
        boolean z2 = false;
        int i4 = i3;
        while (m26672i(z, charAt)) {
            if (!z && charAt == '\\') {
                i2 = prefetchOrEof(m26679b(i3, i4));
                z2 = true;
                i = i2;
            } else {
                int i5 = i4 + 1;
                i = i3;
                i2 = i5;
            }
            if (i2 >= getSource().length()) {
                m26669l(i, i2, z2, consumeChunk);
                int prefetchOrEof = prefetchOrEof(i2);
                if (prefetchOrEof != -1) {
                    i3 = prefetchOrEof;
                    i4 = i3;
                    z2 = false;
                } else {
                    fail$default(this, "EOF", prefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                int i6 = i;
                i4 = i2;
                i3 = i6;
            }
            charAt = getSource().charAt(i4);
        }
        m26669l(i3, i4, z2, consumeChunk);
        this.currentPosition = i4;
        if (!z) {
            consumeNextToken('\"');
        }
    }

    @NotNull
    public final String consumeStringLenient() {
        String m26674g;
        if (this.f71350a != null) {
            return m26671j();
        }
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces < getSource().length() && skipWhitespaces != -1) {
            byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces));
            if (charToTokenClass == 1) {
                return consumeString();
            }
            if (charToTokenClass == 0) {
                boolean z = false;
                while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces)) == 0) {
                    skipWhitespaces++;
                    if (skipWhitespaces >= getSource().length()) {
                        appendRange(this.currentPosition, skipWhitespaces);
                        int prefetchOrEof = prefetchOrEof(skipWhitespaces);
                        if (prefetchOrEof == -1) {
                            this.currentPosition = skipWhitespaces;
                            return m26674g(0, 0);
                        }
                        skipWhitespaces = prefetchOrEof;
                        z = true;
                    }
                }
                if (!z) {
                    m26674g = substring(this.currentPosition, skipWhitespaces);
                } else {
                    m26674g = m26674g(this.currentPosition, skipWhitespaces);
                }
                this.currentPosition = skipWhitespaces;
                return m26674g;
            }
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(skipWhitespaces), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        fail$default(this, "EOF", skipWhitespaces, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final String consumeStringLenientNotNull() {
        String consumeStringLenient = consumeStringLenient();
        if (Intrinsics.areEqual(consumeStringLenient, AbstractJsonLexerKt.NULL) && m26670k()) {
            fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return consumeStringLenient;
    }

    /* renamed from: d */
    public final boolean m26677d(int i) {
        int prefetchOrEof = prefetchOrEof(i);
        if (prefetchOrEof < getSource().length() && prefetchOrEof != -1) {
            int i2 = prefetchOrEof + 1;
            int charAt = getSource().charAt(prefetchOrEof) | TokenParser.f74560SP;
            if (charAt != 102) {
                if (charAt == 116) {
                    m26676e("rue", i2);
                    return true;
                }
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            m26676e("alse", i2);
            return false;
        }
        fail$default(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void discardPeeked() {
        this.f71350a = null;
    }

    /* renamed from: e */
    public final void m26676e(String str, int i) {
        if (getSource().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (getSource().charAt(i + i2) | TokenParser.f74560SP)) {
                    fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.currentPosition = i + str.length();
            return;
        }
        fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void ensureHaveChars() {
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Void fail(@NotNull String message, int i, @NotNull String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw JsonExceptionsKt.JsonDecodingException(i, message + " at path: " + this.path.getPath() + str, getSource());
    }

    @NotNull
    public final Void fail$kotlinx_serialization_json(byte b, boolean z) {
        int i;
        String str;
        String str2 = AbstractJsonLexerKt.tokenDescription(b);
        if (z) {
            i = this.currentPosition - 1;
        } else {
            i = this.currentPosition;
        }
        int i2 = i;
        if (this.currentPosition != getSource().length() && i2 >= 0) {
            str = String.valueOf(getSource().charAt(i2));
        } else {
            str = "EOF";
        }
        fail$default(this, "Expected " + str2 + ", but had '" + str + "' instead", i2, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void failOnUnknownKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (Object) null);
        fail("Encountered an unknown key '" + key + CoreConstants.SINGLE_QUOTE_CHAR, lastIndexOf$default, AbstractJsonLexerKt.ignoreUnknownKeysHint);
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public final String m26674g(int i, int i2) {
        appendRange(i, i2);
        String sb = this.f71351b.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        this.f71351b.setLength(0);
        return sb;
    }

    @NotNull
    public final StringBuilder getEscapedString() {
        return this.f71351b;
    }

    @NotNull
    public abstract CharSequence getSource();

    /* renamed from: h */
    public final int m26673h(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public final boolean m26672i(boolean z, char c) {
        if (z) {
            if (AbstractJsonLexerKt.charToTokenClass(c) != 0) {
                return false;
            }
        } else if (c == '\"') {
            return false;
        }
        return true;
    }

    public int indexOf(char c, int i) {
        return StringsKt__StringsKt.indexOf$default(getSource(), c, i, false, 4, (Object) null);
    }

    public final boolean isNotEof() {
        if (peekNextToken() != 10) {
            return true;
        }
        return false;
    }

    public final boolean isValidValueStart(char c) {
        return !(c == '}' || c == ']' || c == ':' || c == ',');
    }

    /* renamed from: j */
    public final String m26671j() {
        String str = this.f71350a;
        Intrinsics.checkNotNull(str);
        this.f71350a = null;
        return str;
    }

    /* renamed from: k */
    public final boolean m26670k() {
        if (getSource().charAt(this.currentPosition - 1) != '\"') {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final void m26669l(int i, int i2, boolean z, Function1 function1) {
        if (z) {
            function1.invoke(m26674g(i, i2));
        } else {
            function1.invoke(substring(i, i2));
        }
    }

    @Nullable
    public abstract String peekLeadingMatchingValue(@NotNull String str, boolean z);

    public final byte peekNextToken() {
        CharSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = prefetchOrEof;
                    return AbstractJsonLexerKt.charToTokenClass(charAt);
                }
                i = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    @Nullable
    public final String peekString(boolean z) {
        String consumeString;
        byte peekNextToken = peekNextToken();
        if (z) {
            if (peekNextToken != 1 && peekNextToken != 0) {
                return null;
            }
            consumeString = consumeStringLenient();
        } else if (peekNextToken != 1) {
            return null;
        } else {
            consumeString = consumeString();
        }
        this.f71350a = consumeString;
        return consumeString;
    }

    public abstract int prefetchOrEof(int i);

    public final void require$kotlinx_serialization_json(boolean z, int i, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (z) {
            return;
        }
        fail$default(this, message.invoke(), i, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void setEscapedString(@NotNull StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<set-?>");
        this.f71351b = sb;
    }

    public final void skipElement(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte peekNextToken = peekNextToken();
        if (peekNextToken != 8 && peekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte peekNextToken2 = peekNextToken();
            if (peekNextToken2 == 1) {
                if (z) {
                    consumeStringLenient();
                } else {
                    consumeKeyString();
                }
            } else {
                if (peekNextToken2 == 8 || peekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(peekNextToken2));
                } else if (peekNextToken2 == 9) {
                    if (((Number) CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList)).byteValue() == 8) {
                        AbstractC10410hs.removeLast(arrayList);
                    } else {
                        int i = this.currentPosition;
                        throw JsonExceptionsKt.JsonDecodingException(i, "found ] instead of } at path: " + this.path, getSource());
                    }
                } else if (peekNextToken2 == 7) {
                    if (((Number) CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList)).byteValue() == 6) {
                        AbstractC10410hs.removeLast(arrayList);
                    } else {
                        int i2 = this.currentPosition;
                        throw JsonExceptionsKt.JsonDecodingException(i2, "found } instead of ] at path: " + this.path, getSource());
                    }
                } else if (peekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            }
        }
    }

    public int skipWhitespaces() {
        int prefetchOrEof;
        char charAt;
        int i = this.currentPosition;
        while (true) {
            prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof == -1 || !((charAt = getSource().charAt(prefetchOrEof)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = prefetchOrEof + 1;
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }

    @NotNull
    public String substring(int i, int i2) {
        return getSource().subSequence(i, i2).toString();
    }

    @NotNull
    public String toString() {
        return "JsonReader(source='" + ((Object) getSource()) + "', currentPosition=" + this.currentPosition + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public abstract boolean tryConsumeComma();

    public final boolean tryConsumeNull(boolean z) {
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - prefetchOrEof;
        if (length < 4 || prefetchOrEof == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (AbstractJsonLexerKt.NULL.charAt(i) != getSource().charAt(prefetchOrEof + i)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(prefetchOrEof + 4)) == 0) {
            return false;
        }
        if (z) {
            this.currentPosition = prefetchOrEof + 4;
            return true;
        }
        return true;
    }

    public final void unexpectedToken(char c) {
        int i = this.currentPosition;
        if (i > 0 && c == '\"') {
            try {
                this.currentPosition = i - 1;
                String consumeStringLenient = consumeStringLenient();
                this.currentPosition = i;
                if (Intrinsics.areEqual(consumeStringLenient, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.currentPosition = i;
                throw th2;
            }
        }
        fail$kotlinx_serialization_json$default(this, AbstractJsonLexerKt.charToTokenClass(c), false, 2, null);
        throw new KotlinNothingValueException();
    }

    public void consumeNextToken(char c) {
        ensureHaveChars();
        CharSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                int i2 = prefetchOrEof + 1;
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = i2;
                    if (charAt == c) {
                        return;
                    }
                    unexpectedToken(c);
                }
                i = i2;
            } else {
                this.currentPosition = prefetchOrEof;
                unexpectedToken(c);
                return;
            }
        }
    }

    @NotNull
    public final String consumeString(@NotNull CharSequence source, int i, int i2) {
        String m26674g;
        int prefetchOrEof;
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                prefetchOrEof = prefetchOrEof(m26679b(i, i2));
                if (prefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", prefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    appendRange(i, i2);
                    prefetchOrEof = prefetchOrEof(i2);
                    if (prefetchOrEof == -1) {
                        fail$default(this, "Unexpected EOF", prefetchOrEof, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            i = prefetchOrEof;
            i2 = i;
            z = true;
            charAt = source.charAt(i2);
        }
        if (!z) {
            m26674g = substring(i, i2);
        } else {
            m26674g = m26674g(i, i2);
        }
        this.currentPosition = i2 + 1;
        return m26674g;
    }
}
