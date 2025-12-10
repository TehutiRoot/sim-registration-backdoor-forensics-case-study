package org.bson.json;

import ch.qos.logback.core.CoreConstants;
import java.io.Reader;
import org.apache.http.message.TokenParser;
import org.bson.BsonRegularExpression;

/* loaded from: classes4.dex */
public class JsonScanner {

    /* renamed from: a */
    public final InterfaceC18815Yg0 f75963a;

    /* loaded from: classes4.dex */
    public enum NumberState {
        SAW_LEADING_MINUS,
        SAW_LEADING_ZERO,
        SAW_INTEGER_DIGITS,
        SAW_DECIMAL_POINT,
        SAW_FRACTION_DIGITS,
        SAW_EXPONENT_LETTER,
        SAW_EXPONENT_SIGN,
        SAW_EXPONENT_DIGITS,
        SAW_MINUS_I,
        DONE,
        INVALID
    }

    /* loaded from: classes4.dex */
    public enum RegularExpressionState {
        IN_PATTERN,
        IN_ESCAPE_SEQUENCE,
        IN_OPTIONS,
        DONE,
        INVALID
    }

    /* renamed from: org.bson.json.JsonScanner$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C12935a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75964a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f75965b;

        static {
            int[] iArr = new int[NumberState.values().length];
            f75965b = iArr;
            try {
                iArr[NumberState.SAW_LEADING_MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75965b[NumberState.SAW_LEADING_ZERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75965b[NumberState.SAW_INTEGER_DIGITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75965b[NumberState.SAW_DECIMAL_POINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75965b[NumberState.SAW_FRACTION_DIGITS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75965b[NumberState.SAW_EXPONENT_LETTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f75965b[NumberState.SAW_EXPONENT_SIGN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f75965b[NumberState.SAW_EXPONENT_DIGITS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f75965b[NumberState.SAW_MINUS_I.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f75965b[NumberState.INVALID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f75965b[NumberState.DONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[RegularExpressionState.values().length];
            f75964a = iArr2;
            try {
                iArr2[RegularExpressionState.IN_PATTERN.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f75964a[RegularExpressionState.IN_ESCAPE_SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f75964a[RegularExpressionState.IN_OPTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f75964a[RegularExpressionState.DONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f75964a[RegularExpressionState.INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public JsonScanner(InterfaceC18815Yg0 interfaceC18815Yg0) {
        this.f75963a = interfaceC18815Yg0;
    }

    /* renamed from: a */
    public void m24128a(int i) {
        this.f75963a.mo23628b(i);
    }

    /* renamed from: b */
    public int m24127b() {
        return this.f75963a.mark();
    }

    /* renamed from: c */
    public C12941a m24126c() {
        int read = this.f75963a.read();
        while (read != -1 && Character.isWhitespace(read)) {
            read = this.f75963a.read();
        }
        if (read == -1) {
            return new C12941a(JsonTokenType.END_OF_FILE, "<eof>");
        }
        if (read != 34) {
            if (read != 44) {
                if (read != 47) {
                    if (read != 58) {
                        if (read != 91) {
                            if (read != 93) {
                                if (read != 123) {
                                    if (read != 125) {
                                        switch (read) {
                                            case 39:
                                                break;
                                            case 40:
                                                return new C12941a(JsonTokenType.LEFT_PAREN, "(");
                                            case 41:
                                                return new C12941a(JsonTokenType.RIGHT_PAREN, ")");
                                            default:
                                                if (read != 45 && !Character.isDigit(read)) {
                                                    if (read != 36 && read != 95 && !Character.isLetter(read)) {
                                                        int position = this.f75963a.getPosition();
                                                        this.f75963a.mo23629a(read);
                                                        throw new JsonParseException("Invalid JSON input. Position: %d. Character: '%c'.", Integer.valueOf(position), Integer.valueOf(read));
                                                    }
                                                    return m24121h((char) read);
                                                }
                                                return m24124e((char) read);
                                        }
                                    } else {
                                        return new C12941a(JsonTokenType.END_OBJECT, "}");
                                    }
                                } else {
                                    return new C12941a(JsonTokenType.BEGIN_OBJECT, "{");
                                }
                            } else {
                                return new C12941a(JsonTokenType.END_ARRAY, "]");
                            }
                        } else {
                            return new C12941a(JsonTokenType.BEGIN_ARRAY, "[");
                        }
                    } else {
                        return new C12941a(JsonTokenType.COLON, ":");
                    }
                } else {
                    return m24123f();
                }
            } else {
                return new C12941a(JsonTokenType.COMMA, ",");
            }
        }
        return m24122g((char) read);
    }

    /* renamed from: d */
    public void m24125d(int i) {
        this.f75963a.mo23627c(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public final C12941a m24124e(char c) {
        NumberState numberState;
        NumberState numberState2;
        JsonTokenType jsonTokenType;
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        if (c == '-') {
            numberState = NumberState.SAW_LEADING_MINUS;
        } else if (c != '0') {
            numberState = NumberState.SAW_INTEGER_DIGITS;
        } else {
            numberState = NumberState.SAW_LEADING_ZERO;
        }
        JsonTokenType jsonTokenType2 = JsonTokenType.INT64;
        while (true) {
            int read = this.f75963a.read();
            switch (C12935a.f75965b[numberState.ordinal()]) {
                case 1:
                    if (read != 48) {
                        if (read != 73) {
                            if (Character.isDigit(read)) {
                                numberState2 = NumberState.SAW_INTEGER_DIGITS;
                                break;
                            } else {
                                numberState2 = NumberState.INVALID;
                                break;
                            }
                        } else {
                            numberState2 = NumberState.SAW_MINUS_I;
                            break;
                        }
                    } else {
                        numberState2 = NumberState.SAW_LEADING_ZERO;
                        break;
                    }
                case 2:
                    if (read != -1 && read != 41 && read != 44) {
                        if (read != 46) {
                            if (read != 69) {
                                if (read != 93) {
                                    if (read != 101) {
                                        if (read != 125) {
                                            if (Character.isDigit(read)) {
                                                numberState = NumberState.SAW_INTEGER_DIGITS;
                                            } else if (Character.isWhitespace(read)) {
                                                numberState = NumberState.DONE;
                                            } else {
                                                numberState = NumberState.INVALID;
                                            }
                                        }
                                    }
                                }
                            }
                            numberState = NumberState.SAW_EXPONENT_LETTER;
                        } else {
                            numberState = NumberState.SAW_DECIMAL_POINT;
                        }
                        numberState2 = numberState;
                        break;
                    }
                    numberState = NumberState.DONE;
                    numberState2 = numberState;
                case 3:
                    if (read != -1 && read != 41 && read != 44) {
                        if (read != 46) {
                            if (read != 69) {
                                if (read != 93) {
                                    if (read != 101) {
                                        if (read != 125) {
                                            if (Character.isDigit(read)) {
                                                numberState = NumberState.SAW_INTEGER_DIGITS;
                                            } else if (Character.isWhitespace(read)) {
                                                numberState = NumberState.DONE;
                                            } else {
                                                numberState = NumberState.INVALID;
                                            }
                                        }
                                    }
                                }
                            }
                            numberState = NumberState.SAW_EXPONENT_LETTER;
                        } else {
                            numberState = NumberState.SAW_DECIMAL_POINT;
                        }
                        numberState2 = numberState;
                        break;
                    }
                    numberState = NumberState.DONE;
                    numberState2 = numberState;
                case 4:
                    jsonTokenType = JsonTokenType.DOUBLE;
                    if (Character.isDigit(read)) {
                        numberState2 = NumberState.SAW_FRACTION_DIGITS;
                    } else {
                        numberState2 = NumberState.INVALID;
                    }
                    jsonTokenType2 = jsonTokenType;
                    break;
                case 5:
                    if (read != -1 && read != 41 && read != 44) {
                        if (read != 69) {
                            if (read != 93) {
                                if (read != 101) {
                                    if (read != 125) {
                                        if (Character.isDigit(read)) {
                                            numberState = NumberState.SAW_FRACTION_DIGITS;
                                        } else if (Character.isWhitespace(read)) {
                                            numberState = NumberState.DONE;
                                        } else {
                                            numberState = NumberState.INVALID;
                                        }
                                        numberState2 = numberState;
                                        break;
                                    }
                                }
                            }
                        }
                        numberState = NumberState.SAW_EXPONENT_LETTER;
                        numberState2 = numberState;
                    }
                    numberState = NumberState.DONE;
                    numberState2 = numberState;
                case 6:
                    jsonTokenType = JsonTokenType.DOUBLE;
                    if (read != 43 && read != 45) {
                        if (Character.isDigit(read)) {
                            numberState2 = NumberState.SAW_EXPONENT_DIGITS;
                        } else {
                            numberState2 = NumberState.INVALID;
                        }
                    } else {
                        numberState2 = NumberState.SAW_EXPONENT_SIGN;
                    }
                    jsonTokenType2 = jsonTokenType;
                    break;
                case 7:
                    if (Character.isDigit(read)) {
                        numberState = NumberState.SAW_EXPONENT_DIGITS;
                    } else {
                        numberState = NumberState.INVALID;
                    }
                    numberState2 = numberState;
                    break;
                case 8:
                    if (read != 41 && read != 44 && read != 93 && read != 125) {
                        if (Character.isDigit(read)) {
                            numberState = NumberState.SAW_EXPONENT_DIGITS;
                        } else if (Character.isWhitespace(read)) {
                            numberState = NumberState.DONE;
                        } else {
                            numberState = NumberState.INVALID;
                        }
                    } else {
                        numberState = NumberState.DONE;
                    }
                    numberState2 = numberState;
                    break;
                case 9:
                    char[] cArr = {'n', 'f', 'i', 'n', 'i', 't', 'y'};
                    for (int i = 0; i < 7; i++) {
                        if (read != cArr[i]) {
                            numberState = NumberState.INVALID;
                            numberState2 = numberState;
                            break;
                        } else {
                            sb.append((char) read);
                            read = this.f75963a.read();
                        }
                    }
                    jsonTokenType = JsonTokenType.DOUBLE;
                    if (read != -1 && read != 41 && read != 44 && read != 93 && read != 125) {
                        if (Character.isWhitespace(read)) {
                            numberState2 = NumberState.DONE;
                        } else {
                            numberState2 = NumberState.INVALID;
                        }
                    } else {
                        numberState2 = NumberState.DONE;
                    }
                    jsonTokenType2 = jsonTokenType;
                default:
                    numberState2 = numberState;
                    break;
            }
            int i2 = C12935a.f75965b[numberState2.ordinal()];
            if (i2 == 10) {
                throw new JsonParseException("Invalid JSON number");
            }
            if (i2 != 11) {
                sb.append((char) read);
                numberState = numberState2;
            } else {
                this.f75963a.mo23629a(read);
                String sb2 = sb.toString();
                JsonTokenType jsonTokenType3 = JsonTokenType.DOUBLE;
                if (jsonTokenType2 == jsonTokenType3) {
                    return new C12941a(jsonTokenType3, Double.valueOf(Double.parseDouble(sb2)));
                }
                long parseLong = Long.parseLong(sb2);
                if (parseLong >= -2147483648L && parseLong <= 2147483647L) {
                    return new C12941a(JsonTokenType.INT32, Integer.valueOf((int) parseLong));
                }
                return new C12941a(JsonTokenType.INT64, Long.valueOf(parseLong));
            }
        }
    }

    /* renamed from: f */
    public final C12941a m24123f() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        RegularExpressionState regularExpressionState = RegularExpressionState.IN_PATTERN;
        while (true) {
            int read = this.f75963a.read();
            int[] iArr = C12935a.f75964a;
            int i = iArr[regularExpressionState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (read != -1 && read != 41 && read != 44 && read != 93) {
                            if (read != 105 && read != 109 && read != 115 && read != 120) {
                                if (read != 125) {
                                    if (Character.isWhitespace(read)) {
                                        regularExpressionState = RegularExpressionState.DONE;
                                    } else {
                                        regularExpressionState = RegularExpressionState.INVALID;
                                    }
                                }
                            } else {
                                regularExpressionState = RegularExpressionState.IN_OPTIONS;
                            }
                        }
                        regularExpressionState = RegularExpressionState.DONE;
                    }
                } else {
                    regularExpressionState = RegularExpressionState.IN_PATTERN;
                }
            } else if (read != -1) {
                if (read != 47) {
                    if (read != 92) {
                        regularExpressionState = RegularExpressionState.IN_PATTERN;
                    } else {
                        regularExpressionState = RegularExpressionState.IN_ESCAPE_SEQUENCE;
                    }
                } else {
                    regularExpressionState = RegularExpressionState.IN_OPTIONS;
                }
            } else {
                regularExpressionState = RegularExpressionState.INVALID;
            }
            int i2 = iArr[regularExpressionState.ordinal()];
            if (i2 != 4) {
                if (i2 != 5) {
                    if (iArr[regularExpressionState.ordinal()] != 3) {
                        sb.append((char) read);
                    } else if (read != 47) {
                        sb2.append((char) read);
                    }
                } else {
                    throw new JsonParseException("Invalid JSON regular expression. Position: %d.", Integer.valueOf(this.f75963a.getPosition()));
                }
            } else {
                this.f75963a.mo23629a(read);
                return new C12941a(JsonTokenType.REGULAR_EXPRESSION, new BsonRegularExpression(sb.toString(), sb2.toString()));
            }
        }
    }

    /* renamed from: g */
    public final C12941a m24122g(char c) {
        int read;
        StringBuilder sb = new StringBuilder();
        do {
            read = this.f75963a.read();
            if (read != 92) {
                if (read == c) {
                    return new C12941a(JsonTokenType.STRING, sb.toString());
                }
                if (read != -1) {
                    sb.append((char) read);
                    continue;
                } else {
                    continue;
                }
            } else {
                read = this.f75963a.read();
                if (read != 34) {
                    if (read != 39) {
                        if (read != 47) {
                            if (read != 92) {
                                if (read != 98) {
                                    if (read != 102) {
                                        if (read != 110) {
                                            if (read != 114) {
                                                if (read != 116) {
                                                    if (read == 117) {
                                                        int read2 = this.f75963a.read();
                                                        int read3 = this.f75963a.read();
                                                        int read4 = this.f75963a.read();
                                                        int read5 = this.f75963a.read();
                                                        if (read5 != -1) {
                                                            sb.append((char) Integer.parseInt(new String(new char[]{(char) read2, (char) read3, (char) read4, (char) read5}), 16));
                                                            continue;
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        throw new JsonParseException("Invalid escape sequence in JSON string '\\%c'.", Integer.valueOf(read));
                                                    }
                                                } else {
                                                    sb.append('\t');
                                                    continue;
                                                }
                                            } else {
                                                sb.append(TokenParser.f74557CR);
                                                continue;
                                            }
                                        } else {
                                            sb.append('\n');
                                            continue;
                                        }
                                    } else {
                                        sb.append('\f');
                                        continue;
                                    }
                                } else {
                                    sb.append('\b');
                                    continue;
                                }
                            } else {
                                sb.append('\\');
                                continue;
                            }
                        } else {
                            sb.append('/');
                            continue;
                        }
                    } else {
                        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
                        continue;
                    }
                } else {
                    sb.append('\"');
                    continue;
                }
            }
        } while (read != -1);
        throw new JsonParseException("End of file in JSON string.");
    }

    /* renamed from: h */
    public final C12941a m24121h(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        int read = this.f75963a.read();
        while (true) {
            if (read != 36 && read != 95 && !Character.isLetterOrDigit(read)) {
                this.f75963a.mo23629a(read);
                return new C12941a(JsonTokenType.UNQUOTED_STRING, sb.toString());
            }
            sb.append((char) read);
            read = this.f75963a.read();
        }
    }

    public JsonScanner(String str) {
        this(new C21626ph0(str));
    }

    public JsonScanner(Reader reader) {
        this(new C21454oh0(reader));
    }
}
