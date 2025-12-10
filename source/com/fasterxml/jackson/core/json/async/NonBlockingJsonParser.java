package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.p011io.CharTypes;
import com.fasterxml.jackson.core.p011io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
import java.io.OutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.message.TokenParser;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes3.dex */
public class NonBlockingJsonParser extends NonBlockingJsonParserBase implements ByteArrayFeeder {
    protected byte[] _inputBuffer;
    protected int _origBufferLen;

    /* renamed from: a */
    public static final int f43181a = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* renamed from: b */
    public static final int f43182b = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* renamed from: c */
    public static final int f43183c = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* renamed from: d */
    public static final int f43184d = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* renamed from: e */
    public static final int f43185e = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* renamed from: f */
    public static final int f43186f = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* renamed from: g */
    public static final int f43187g = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* renamed from: h */
    public static final int[] f43188h = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public NonBlockingJsonParser(IOContext iOContext, int i, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i, byteQuadsCanonicalizer);
        this._inputBuffer = ParserMinimalBase.NO_BYTES;
    }

    /* renamed from: A */
    public final JsonToken m49571A(int i, int i2, int i3) {
        int i4;
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._quadLength = i;
                this._pending32 = i2;
                this._pendingBytes = i3;
                this._minorState = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (iArr2[i6] == 0) {
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | i6;
                } else {
                    if (i >= iArr.length) {
                        int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = growArrayBy;
                        iArr = growArrayBy;
                    }
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i2 = i6;
                    i3 = 1;
                }
            } else if (i6 == 34) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i] = NonBlockingJsonParserBase._padLastQuad(i2, i3);
                    i++;
                } else if (i == 0) {
                    return _fieldComplete("");
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            } else {
                if (i6 != 92) {
                    _throwUnquotedSpace(i6, "name");
                } else {
                    i6 = m49558g();
                    if (i6 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i;
                        this._pending32 = i2;
                        this._pendingBytes = i3;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                if (i6 > 127) {
                    int i7 = 0;
                    if (i3 >= 4) {
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (i6 < 2048) {
                        i2 = (i2 << 8) | (i6 >> 6) | CertificateHolderAuthorization.CVCA;
                        i3++;
                    } else {
                        int i8 = (i2 << 8) | (i6 >> 12) | 224;
                        int i9 = i3 + 1;
                        if (i9 >= 4) {
                            iArr[i] = i8;
                            i++;
                            i9 = 0;
                        } else {
                            i7 = i8;
                        }
                        i2 = (i7 << 8) | ((i6 >> 6) & 63) | 128;
                        i3 = i9 + 1;
                    }
                    i6 = (i6 & 63) | 128;
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | i6;
                } else {
                    i4 = i + 1;
                    iArr[i] = i2;
                    i = i4;
                    i2 = i6;
                    i3 = 1;
                }
            }
        }
    }

    /* renamed from: B */
    public final String m49570B(int i, int i2) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = i + 1;
        int i4 = bArr[i] & 255;
        if (iArr[i4] == 0) {
            int i5 = (i2 << 8) | i4;
            int i6 = i + 2;
            int i7 = bArr[i3] & 255;
            if (iArr[i7] == 0) {
                int i8 = (i5 << 8) | i7;
                int i9 = i + 3;
                int i10 = bArr[i6] & 255;
                if (iArr[i10] == 0) {
                    int i11 = (i8 << 8) | i10;
                    int i12 = i + 4;
                    int i13 = bArr[i9] & 255;
                    if (iArr[i13] == 0) {
                        return m49569C(i12, i13, i11);
                    }
                    if (i13 != 34) {
                        return null;
                    }
                    this._inputPtr = i12;
                    return _findName(this._quad1, i11, 4);
                } else if (i10 != 34) {
                    return null;
                } else {
                    this._inputPtr = i9;
                    return _findName(this._quad1, i8, 3);
                }
            } else if (i7 != 34) {
                return null;
            } else {
                this._inputPtr = i6;
                return _findName(this._quad1, i5, 2);
            }
        } else if (i4 != 34) {
            return null;
        } else {
            this._inputPtr = i3;
            return _findName(this._quad1, i2, 1);
        }
    }

    /* renamed from: C */
    public final String m49569C(int i, int i2, int i3) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (iArr[i5] != 0) {
            if (i5 != 34) {
                return null;
            }
            this._inputPtr = i4;
            return _findName(this._quad1, i3, i2, 1);
        }
        int i6 = (i2 << 8) | i5;
        int i7 = i + 2;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 != 34) {
                return null;
            }
            this._inputPtr = i7;
            return _findName(this._quad1, i3, i6, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i + 3;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 != 34) {
                return null;
            }
            this._inputPtr = i10;
            return _findName(this._quad1, i3, i9, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i + 4;
        if ((bArr[i10] & 255) != 34) {
            return null;
        }
        this._inputPtr = i13;
        return _findName(this._quad1, i3, i12, 4);
    }

    /* renamed from: D */
    public final int m49568D(int i) {
        do {
            if (i != 32) {
                if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._currToken = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & 255;
        } while (i <= 32);
        return i;
    }

    /* renamed from: E */
    public final JsonToken m49567E(int i) {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = i;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i != 4) {
            if (i != 5) {
                switch (i) {
                    case 12:
                        return m49562J(i3);
                    case 13:
                        return m49559M(i3);
                    case 14:
                        return m49560L(i3);
                    case 15:
                        return m49561K(i3);
                    default:
                        VersionUtil.throwInternal();
                        return null;
                }
            }
            return m49564H(i3);
        }
        return m49565G(i3);
    }

    /* renamed from: F */
    public final JsonToken m49566F(int i) {
        int i2 = i & 255;
        if (i2 == 239 && this._minorState != 1) {
            return m49546t(1);
        }
        while (i2 <= 32) {
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                if (this._endOfInput) {
                    return _eofAsNextToken();
                }
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3] & 255;
        }
        return m49562J(i2);
    }

    /* renamed from: G */
    public final JsonToken m49565G(int i) {
        String m49549q;
        if (i <= 32 && (i = m49568D(i)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i != 34) {
            if (i == 125) {
                return _closeObjectScope();
            }
            return m49540z(i);
        } else if (this._inputPtr + 13 <= this._inputEnd && (m49549q = m49549q()) != null) {
            return _fieldComplete(m49549q);
        } else {
            return m49571A(0, 0, 0);
        }
    }

    /* renamed from: H */
    public final JsonToken m49564H(int i) {
        String m49549q;
        if (i <= 32 && (i = m49568D(i)) <= 0) {
            this._minorState = 5;
            return this._currToken;
        }
        if (i != 44) {
            if (i == 125) {
                return _closeObjectScope();
            }
            if (i == 35) {
                return m49543w(5);
            }
            if (i == 47) {
                return m49563I(5);
            }
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2];
        this._inputPtr = i2 + 1;
        if (i3 <= 32 && (i3 = m49568D(i3)) <= 0) {
            this._minorState = 4;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i3 != 34) {
            if (i3 == 125 && (this._features & f43181a) != 0) {
                return _closeObjectScope();
            }
            return m49540z(i3);
        } else if (this._inputPtr + 13 <= this._inputEnd && (m49549q = m49549q()) != null) {
            return _fieldComplete(m49549q);
        } else {
            return m49571A(0, 0, 0);
        }
    }

    /* renamed from: I */
    public final JsonToken m49563I(int i) {
        if ((this._features & f43186f) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._pending32 = i;
            this._minorState = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if (b == 42) {
            return m49545u(i, false);
        }
        if (b == 47) {
            return m49544v(i);
        }
        _reportUnexpectedChar(b & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: J */
    public final JsonToken m49562J(int i) {
        if (i <= 32 && (i = m49568D(i)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        this._parsingContext.expectComma();
        if (i == 34) {
            return _startString();
        }
        if (i != 35) {
            if (i != 91) {
                if (i != 93) {
                    if (i != 102) {
                        if (i != 110) {
                            if (i != 116) {
                                if (i != 123) {
                                    if (i != 125) {
                                        switch (i) {
                                            case 45:
                                                return _startNegativeNumber();
                                            case 46:
                                                if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                                                    return _startFloatThatStartsWithPeriod();
                                                }
                                                break;
                                            case 47:
                                                return m49563I(12);
                                            case 48:
                                                return _startNumberLeadingZero();
                                            case 49:
                                            case 50:
                                            case EACTags.TRANSACTION_DATE /* 51 */:
                                            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                            case EACTags.SEX /* 53 */:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                return _startPositiveNumber(i);
                                        }
                                        return _startUnexpectedValue(false, i);
                                    }
                                    return _closeObjectScope();
                                }
                                return _startObjectScope();
                            }
                            return _startTrueToken();
                        }
                        return _startNullToken();
                    }
                    return _startFalseToken();
                }
                return _closeArrayScope();
            }
            return _startArrayScope();
        }
        return m49543w(12);
    }

    /* renamed from: K */
    public final JsonToken m49561K(int i) {
        if (i <= 32 && (i = m49568D(i)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i == 34) {
            return _startString();
        }
        if (i != 35) {
            if (i != 45) {
                if (i != 91) {
                    if (i != 93) {
                        if (i != 102) {
                            if (i != 110) {
                                if (i != 116) {
                                    if (i != 123) {
                                        if (i != 125) {
                                            switch (i) {
                                                case 47:
                                                    return m49563I(15);
                                                case 48:
                                                    return _startNumberLeadingZero();
                                                case 49:
                                                case 50:
                                                case EACTags.TRANSACTION_DATE /* 51 */:
                                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                case EACTags.SEX /* 53 */:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    return _startPositiveNumber(i);
                                            }
                                        } else if ((this._features & f43181a) != 0) {
                                            return _closeObjectScope();
                                        }
                                    } else {
                                        return _startObjectScope();
                                    }
                                } else {
                                    return _startTrueToken();
                                }
                            } else {
                                return _startNullToken();
                            }
                        } else {
                            return _startFalseToken();
                        }
                    } else if ((this._features & f43181a) != 0) {
                        return _closeArrayScope();
                    }
                    return _startUnexpectedValue(true, i);
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return m49543w(15);
    }

    /* renamed from: L */
    public final JsonToken m49560L(int i) {
        if (i <= 32 && (i = m49568D(i)) <= 0) {
            this._minorState = 14;
            return this._currToken;
        }
        if (i != 58) {
            if (i == 47) {
                return m49563I(14);
            }
            if (i == 35) {
                return m49543w(14);
            }
            _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
        }
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2];
        this._inputPtr = i2 + 1;
        if (i3 <= 32 && (i3 = m49568D(i3)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i3 == 34) {
            return _startString();
        }
        if (i3 != 35) {
            if (i3 != 45) {
                if (i3 != 91) {
                    if (i3 != 102) {
                        if (i3 != 110) {
                            if (i3 != 116) {
                                if (i3 != 123) {
                                    switch (i3) {
                                        case 47:
                                            return m49563I(12);
                                        case 48:
                                            return _startNumberLeadingZero();
                                        case 49:
                                        case 50:
                                        case EACTags.TRANSACTION_DATE /* 51 */:
                                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                        case EACTags.SEX /* 53 */:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return _startPositiveNumber(i3);
                                        default:
                                            return _startUnexpectedValue(false, i3);
                                    }
                                }
                                return _startObjectScope();
                            }
                            return _startTrueToken();
                        }
                        return _startNullToken();
                    }
                    return _startFalseToken();
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return m49543w(12);
    }

    /* renamed from: M */
    public final JsonToken m49559M(int i) {
        if (i <= 32 && (i = m49568D(i)) <= 0) {
            this._minorState = 13;
            return this._currToken;
        }
        if (i != 44) {
            if (i == 93) {
                return _closeArrayScope();
            }
            if (i == 125) {
                return _closeObjectScope();
            }
            if (i == 47) {
                return m49563I(13);
            }
            if (i == 35) {
                return m49543w(13);
            }
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        this._parsingContext.expectComma();
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2];
        this._inputPtr = i2 + 1;
        if (i3 <= 32 && (i3 = m49568D(i3)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i3 == 34) {
            return _startString();
        }
        if (i3 != 35) {
            if (i3 != 45) {
                if (i3 != 91) {
                    if (i3 != 93) {
                        if (i3 != 102) {
                            if (i3 != 110) {
                                if (i3 != 116) {
                                    if (i3 != 123) {
                                        if (i3 != 125) {
                                            switch (i3) {
                                                case 47:
                                                    return m49563I(15);
                                                case 48:
                                                    return _startNumberLeadingZero();
                                                case 49:
                                                case 50:
                                                case EACTags.TRANSACTION_DATE /* 51 */:
                                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                case EACTags.SEX /* 53 */:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    return _startPositiveNumber(i3);
                                            }
                                        } else if ((this._features & f43181a) != 0) {
                                            return _closeObjectScope();
                                        }
                                    } else {
                                        return _startObjectScope();
                                    }
                                } else {
                                    return _startTrueToken();
                                }
                            } else {
                                return _startNullToken();
                            }
                        } else {
                            return _startFalseToken();
                        }
                    } else if ((this._features & f43181a) != 0) {
                        return _closeArrayScope();
                    }
                    return _startUnexpectedValue(true, i3);
                }
                return _startArrayScope();
            }
            return _startNegativeNumber();
        }
        return m49543w(15);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        VersionUtil.throwInternal();
        return TokenParser.f74560SP;
    }

    public JsonToken _finishErrorToken() throws IOException {
        do {
            int i = this._inputPtr;
            if (i < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i + 1;
                char c = (char) bArr[i];
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
                this._textBuffer.append(c);
            } else {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
        } while (this._textBuffer.size() < 256);
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public JsonToken _finishErrorTokenWithEOF() throws IOException {
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public final JsonToken _finishFieldWithEscape() throws IOException {
        int i;
        int i2;
        int m49556j = m49556j(this._quoted32, this._quotedDigits);
        if (m49556j < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i3 = this._quadLength;
        int[] iArr = this._quadBuffer;
        if (i3 >= iArr.length) {
            this._quadBuffer = ParserBase.growArrayBy(iArr, 32);
        }
        int i4 = this._pending32;
        int i5 = this._pendingBytes;
        int i6 = 1;
        if (m49556j > 127) {
            int i7 = 0;
            if (i5 >= 4) {
                int[] iArr2 = this._quadBuffer;
                int i8 = this._quadLength;
                this._quadLength = i8 + 1;
                iArr2[i8] = i4;
                i4 = 0;
                i5 = 0;
            }
            if (m49556j < 2048) {
                i = i4 << 8;
                i2 = (m49556j >> 6) | CertificateHolderAuthorization.CVCA;
            } else {
                int i9 = (i4 << 8) | (m49556j >> 12) | 224;
                i5++;
                if (i5 >= 4) {
                    int[] iArr3 = this._quadBuffer;
                    int i10 = this._quadLength;
                    this._quadLength = i10 + 1;
                    iArr3[i10] = i9;
                    i5 = 0;
                } else {
                    i7 = i9;
                }
                i = i7 << 8;
                i2 = ((m49556j >> 6) & 63) | 128;
            }
            i4 = i | i2;
            i5++;
            m49556j = (m49556j & 63) | 128;
        }
        if (i5 < 4) {
            i6 = 1 + i5;
            m49556j |= i4 << 8;
        } else {
            int[] iArr4 = this._quadBuffer;
            int i11 = this._quadLength;
            this._quadLength = i11 + 1;
            iArr4[i11] = i4;
        }
        if (this._minorStateAfterSplit == 9) {
            return m49548r(this._quadLength, m49556j, i6);
        }
        return m49571A(this._quadLength, m49556j, i6);
    }

    public JsonToken _finishFloatExponent(boolean z, int i) throws IOException {
        if (z) {
            this._minorState = 32;
            if (i == 45 || i == 43) {
                this._textBuffer.append((char) i);
                int i2 = this._inputPtr;
                if (i2 >= this._inputEnd) {
                    this._minorState = 32;
                    this._expLength = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i2 + 1;
                i = bArr[i2];
            }
        }
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i3 = this._expLength;
        while (i >= 48 && i <= 57) {
            i3++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i4 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) i;
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i4);
                this._expLength = i3;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i = bArr2[i5];
            currentSegmentSize = i4;
        }
        int i6 = i & 255;
        if (i3 == 0) {
            reportUnexpectedNumberChar(i6, "Exponent indicator not followed by a digit");
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        this._expLength = i3;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    public JsonToken _finishFloatFraction() throws IOException {
        byte b;
        int i = this._fractLength;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            b = bArr[i2];
            if (b < 48 || b > 57) {
                break;
            }
            i++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i3 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) b;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i3);
                this._fractLength = i;
                return JsonToken.NOT_AVAILABLE;
            }
            currentSegmentSize = i3;
        }
        if (i == 0) {
            reportUnexpectedNumberChar(b, "Decimal point not followed by a digit");
        }
        this._fractLength = i;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        if (b != 101 && b != 69) {
            this._inputPtr--;
            this._textBuffer.setCurrentLength(currentSegmentSize);
            this._expLength = 0;
            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
        }
        this._textBuffer.append((char) b);
        this._expLength = 0;
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            this._minorState = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this._minorState = 32;
        byte[] bArr2 = this._inputBuffer;
        this._inputPtr = i4 + 1;
        return _finishFloatExponent(true, bArr2[i4] & 255);
    }

    public JsonToken _finishKeywordToken(String str, int i, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._pending32 = i;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            byte b = this._inputBuffer[i2];
            if (i == length) {
                if (b < 48 || b == 93 || b == 125) {
                    return _valueComplete(jsonToken);
                }
            } else if (b != str.charAt(i)) {
                break;
            } else {
                i++;
                this._inputPtr++;
            }
        }
        this._minorState = 50;
        this._textBuffer.resetWithCopy(str, 0, i);
        return _finishErrorToken();
    }

    public JsonToken _finishKeywordTokenWithEOF(String str, int i, JsonToken jsonToken) throws IOException {
        if (i == str.length()) {
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._textBuffer.resetWithCopy(str, 0, i);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r4._minorState = 50;
        r4._textBuffer.resetWithCopy(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        return _finishErrorToken();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishNonStdToken(int r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = r4._nonStdToken(r5)
            int r1 = r0.length()
        L8:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L1b
            r4._nonStdTokenType = r5
            r4._pending32 = r6
            r5 = 19
            r4._minorState = r5
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r3 = r4._inputBuffer
            r2 = r3[r2]
            if (r6 != r1) goto L32
            r1 = 48
            if (r2 < r1) goto L2d
            r1 = 93
            if (r2 == r1) goto L2d
            r1 = 125(0x7d, float:1.75E-43)
            if (r2 != r1) goto L38
        L2d:
            com.fasterxml.jackson.core.JsonToken r5 = r4._valueNonStdNumberComplete(r5)
            return r5
        L32:
            char r3 = r0.charAt(r6)
            if (r2 == r3) goto L47
        L38:
            r5 = 50
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r1 = 0
            r5.resetWithCopy(r0, r1, r6)
            com.fasterxml.jackson.core.JsonToken r5 = r4._finishErrorToken()
            return r5
        L47:
            int r6 = r6 + 1
            int r2 = r4._inputPtr
            int r2 = r2 + 1
            r4._inputPtr = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNonStdToken(int, int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _finishNonStdTokenWithEOF(int i, int i2) throws IOException {
        String _nonStdToken = _nonStdToken(i);
        if (i2 == _nonStdToken.length()) {
            return _valueNonStdNumberComplete(i);
        }
        this._textBuffer.resetWithCopy(_nonStdToken, 0, i2);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r4._intLength = r0 + r6;
        r4._textBuffer.setCurrentLength(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishNumberIntegralPart(char[] r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4._numberNegative
            if (r0 == 0) goto L6
            r0 = -1
            goto L7
        L6:
            r0 = 0
        L7:
            int r1 = r4._inputPtr
            int r2 = r4._inputEnd
            if (r1 < r2) goto L1b
            r5 = 26
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r2 = r4._inputBuffer
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 48
            if (r2 >= r3) goto L35
            r3 = 46
            if (r2 != r3) goto L42
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4._startFloat(r5, r6, r2)
            return r5
        L35:
            r3 = 57
            if (r2 <= r3) goto L5d
            r3 = 101(0x65, float:1.42E-43)
            if (r2 == r3) goto L51
            r3 = 69
            if (r2 != r3) goto L42
            goto L51
        L42:
            int r0 = r0 + r6
            r4._intLength = r0
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            com.fasterxml.jackson.core.JsonToken r5 = r4._valueComplete(r5)
            return r5
        L51:
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4._startFloat(r5, r6, r2)
            return r5
        L5d:
            int r1 = r1 + 1
            r4._inputPtr = r1
            int r1 = r5.length
            if (r6 < r1) goto L6a
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.expandCurrentSegment()
        L6a:
            int r1 = r6 + 1
            char r2 = (char) r2
            r5[r6] = r2
            r6 = r1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNumberIntegralPart(char[], int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _finishNumberLeadingNegZeroes() throws IOException {
        int i;
        do {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & 255;
            if (i < 48) {
                if (i == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '-';
                    emptyAndGetCurrentSegment[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 2, i);
                }
            } else if (i > 57) {
                if (i != 101 && i != 69) {
                    if (i != 93 && i != 125) {
                        reportUnexpectedNumberChar(i, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                    }
                } else {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = '-';
                    emptyAndGetCurrentSegment2[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 2, i);
                }
            } else if ((this._features & f43182b) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
                continue;
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = '-';
        emptyAndGetCurrentSegment3[1] = (char) i;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 2);
    }

    public JsonToken _finishNumberLeadingZeroes() throws IOException {
        int i;
        do {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i = bArr[i2] & 255;
            if (i < 48) {
                if (i == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 1, i);
                }
            } else if (i > 57) {
                if (i != 101 && i != 69) {
                    if (i != 93 && i != 125) {
                        reportUnexpectedNumberChar(i, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                    }
                } else {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 1, i);
                }
            } else if ((this._features & f43182b) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
                continue;
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = (char) i;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 1);
    }

    public JsonToken _finishNumberMinus(int i) throws IOException {
        if (i <= 48) {
            if (i == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i > 57) {
            if (i == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        emptyAndGetCurrentSegment[1] = (char) i;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment, 2);
    }

    public final JsonToken _finishToken() throws IOException {
        int i = this._minorState;
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    switch (i) {
                        case 7:
                            return m49571A(this._quadLength, this._pending32, this._pendingBytes);
                        case 8:
                            return _finishFieldWithEscape();
                        case 9:
                            return m49548r(this._quadLength, this._pending32, this._pendingBytes);
                        case 10:
                            return m49541y(this._quadLength, this._pending32, this._pendingBytes);
                        default:
                            switch (i) {
                                case 12:
                                    byte[] bArr = this._inputBuffer;
                                    int i2 = this._inputPtr;
                                    this._inputPtr = i2 + 1;
                                    return m49562J(bArr[i2] & 255);
                                case 13:
                                    byte[] bArr2 = this._inputBuffer;
                                    int i3 = this._inputPtr;
                                    this._inputPtr = i3 + 1;
                                    return m49559M(bArr2[i3] & 255);
                                case 14:
                                    byte[] bArr3 = this._inputBuffer;
                                    int i4 = this._inputPtr;
                                    this._inputPtr = i4 + 1;
                                    return m49560L(bArr3[i4] & 255);
                                case 15:
                                    byte[] bArr4 = this._inputBuffer;
                                    int i5 = this._inputPtr;
                                    this._inputPtr = i5 + 1;
                                    return m49561K(bArr4[i5] & 255);
                                case 16:
                                    return _finishKeywordToken(AbstractJsonLexerKt.NULL, this._pending32, JsonToken.VALUE_NULL);
                                case 17:
                                    return _finishKeywordToken("true", this._pending32, JsonToken.VALUE_TRUE);
                                case 18:
                                    return _finishKeywordToken("false", this._pending32, JsonToken.VALUE_FALSE);
                                case 19:
                                    return _finishNonStdToken(this._nonStdTokenType, this._pending32);
                                default:
                                    switch (i) {
                                        case 23:
                                            byte[] bArr5 = this._inputBuffer;
                                            int i6 = this._inputPtr;
                                            this._inputPtr = i6 + 1;
                                            return _finishNumberMinus(bArr5[i6] & 255);
                                        case 24:
                                            return _finishNumberLeadingZeroes();
                                        case 25:
                                            return _finishNumberLeadingNegZeroes();
                                        case 26:
                                            return _finishNumberIntegralPart(this._textBuffer.getBufferWithoutReset(), this._textBuffer.getCurrentSegmentSize());
                                        default:
                                            switch (i) {
                                                case 30:
                                                    return _finishFloatFraction();
                                                case 31:
                                                    byte[] bArr6 = this._inputBuffer;
                                                    int i7 = this._inputPtr;
                                                    this._inputPtr = i7 + 1;
                                                    return _finishFloatExponent(true, bArr6[i7] & 255);
                                                case 32:
                                                    byte[] bArr7 = this._inputBuffer;
                                                    int i8 = this._inputPtr;
                                                    this._inputPtr = i8 + 1;
                                                    return _finishFloatExponent(false, bArr7[i8] & 255);
                                                default:
                                                    switch (i) {
                                                        case 40:
                                                            return m49542x();
                                                        case 41:
                                                            int m49556j = m49556j(this._quoted32, this._quotedDigits);
                                                            if (m49556j < 0) {
                                                                return JsonToken.NOT_AVAILABLE;
                                                            }
                                                            this._textBuffer.append((char) m49556j);
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return m49547s();
                                                            }
                                                            return m49542x();
                                                        case 42:
                                                            TextBuffer textBuffer = this._textBuffer;
                                                            int i9 = this._pending32;
                                                            byte[] bArr8 = this._inputBuffer;
                                                            int i10 = this._inputPtr;
                                                            this._inputPtr = i10 + 1;
                                                            textBuffer.append((char) m49552n(i9, bArr8[i10]));
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return m49547s();
                                                            }
                                                            return m49542x();
                                                        case 43:
                                                            int i11 = this._pending32;
                                                            int i12 = this._pendingBytes;
                                                            byte[] bArr9 = this._inputBuffer;
                                                            int i13 = this._inputPtr;
                                                            this._inputPtr = i13 + 1;
                                                            if (!m49554l(i11, i12, bArr9[i13])) {
                                                                return JsonToken.NOT_AVAILABLE;
                                                            }
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return m49547s();
                                                            }
                                                            return m49542x();
                                                        case 44:
                                                            int i14 = this._pending32;
                                                            int i15 = this._pendingBytes;
                                                            byte[] bArr10 = this._inputBuffer;
                                                            int i16 = this._inputPtr;
                                                            this._inputPtr = i16 + 1;
                                                            if (!m49553m(i14, i15, bArr10[i16])) {
                                                                return JsonToken.NOT_AVAILABLE;
                                                            }
                                                            if (this._minorStateAfterSplit == 45) {
                                                                return m49547s();
                                                            }
                                                            return m49542x();
                                                        case 45:
                                                            return m49547s();
                                                        default:
                                                            switch (i) {
                                                                case 50:
                                                                    return _finishErrorToken();
                                                                case EACTags.TRANSACTION_DATE /* 51 */:
                                                                    return m49563I(this._pending32);
                                                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                                    return m49545u(this._pending32, true);
                                                                case EACTags.SEX /* 53 */:
                                                                    return m49545u(this._pending32, false);
                                                                case 54:
                                                                    return m49544v(this._pending32);
                                                                case 55:
                                                                    return m49543w(this._pending32);
                                                                default:
                                                                    VersionUtil.throwInternal();
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                byte[] bArr11 = this._inputBuffer;
                int i17 = this._inputPtr;
                this._inputPtr = i17 + 1;
                return m49564H(bArr11[i17] & 255);
            }
            byte[] bArr12 = this._inputBuffer;
            int i18 = this._inputPtr;
            this._inputPtr = i18 + 1;
            return m49565G(bArr12[i18] & 255);
        }
        return m49546t(this._pending32);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final JsonToken _finishTokenWithEOF() throws IOException {
        JsonToken jsonToken = this._currToken;
        int i = this._minorState;
        if (i != 3) {
            if (i != 12) {
                if (i != 50) {
                    switch (i) {
                        case 16:
                            return _finishKeywordTokenWithEOF(AbstractJsonLexerKt.NULL, this._pending32, JsonToken.VALUE_NULL);
                        case 17:
                            return _finishKeywordTokenWithEOF("true", this._pending32, JsonToken.VALUE_TRUE);
                        case 18:
                            return _finishKeywordTokenWithEOF("false", this._pending32, JsonToken.VALUE_FALSE);
                        case 19:
                            return _finishNonStdTokenWithEOF(this._nonStdTokenType, this._pending32);
                        default:
                            switch (i) {
                                case 24:
                                case 25:
                                    return _valueCompleteInt(0, "0");
                                case 26:
                                    int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                                    if (this._numberNegative) {
                                        currentSegmentSize--;
                                    }
                                    this._intLength = currentSegmentSize;
                                    return _valueComplete(JsonToken.VALUE_NUMBER_INT);
                                default:
                                    switch (i) {
                                        case 30:
                                            this._expLength = 0;
                                            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                        case 31:
                                            _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                            _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                            return _eofAsNextToken();
                                        case 32:
                                            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                                        default:
                                            switch (i) {
                                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                case EACTags.SEX /* 53 */:
                                                    _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                                    break;
                                                case 54:
                                                case 55:
                                                    break;
                                                default:
                                                    _reportInvalidEOF(": was expecting rest of token (internal state: " + this._minorState + ")", this._currToken);
                                                    return jsonToken;
                                            }
                                            return _eofAsNextToken();
                                    }
                            }
                    }
                }
                return _finishErrorTokenWithEOF();
            }
            return _eofAsNextToken();
        }
        return _eofAsNextToken();
    }

    public JsonToken _reportErrorToken(String str) throws IOException {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.contentsAsString(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    public JsonToken _startAposString() throws IOException {
        int i = this._inputPtr;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = f43188h;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (i < min) {
            int i3 = bArr[i] & 255;
            if (i3 == 39) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return _valueComplete(JsonToken.VALUE_STRING);
            } else if (iArr[i3] != 0) {
                break;
            } else {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            }
        }
        this._textBuffer.setCurrentLength(i2);
        this._inputPtr = i;
        return m49547s();
    }

    public JsonToken _startFalseToken() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this._inputPtr = i6;
                            return _valueComplete(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this._minorState = 18;
        return _finishKeywordToken("false", 1, JsonToken.VALUE_FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        r3 = r3 & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r9 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        reportUnexpectedNumberChar(r3, "Decimal point not followed by a digit");
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00ee -> B:40:0x009a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _startFloat(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startFloat(char[], int, int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _startFloatThatStartsWithPeriod() throws IOException {
        this._numberNegative = false;
        this._intLength = 0;
        return _startFloat(this._textBuffer.emptyAndGetCurrentSegment(), 0, 46);
    }

    public JsonToken _startNegativeNumber() throws IOException {
        this._numberNegative = true;
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            this._minorState = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = 2;
        if (i2 <= 48) {
            if (i2 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i2 > 57) {
            if (i2 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        emptyAndGetCurrentSegment[1] = (char) i2;
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        int i5 = this._inputBuffer[i4];
        while (true) {
            if (i5 < 48) {
                if (i5 == 46) {
                    this._intLength = i3 - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i3, i5);
                }
            } else if (i5 > 57) {
                if (i5 == 101 || i5 == 69) {
                    this._intLength = i3 - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i3, i5);
                }
            } else {
                if (i3 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i6 = i3 + 1;
                emptyAndGetCurrentSegment[i3] = (char) i5;
                int i7 = this._inputPtr + 1;
                this._inputPtr = i7;
                if (i7 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i6);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                i5 = this._inputBuffer[i7] & 255;
                i3 = i6;
            }
        }
        this._intLength = i3 - 1;
        this._textBuffer.setCurrentLength(i3);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startNullToken() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return _valueComplete(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this._minorState = 16;
        return _finishKeywordToken(AbstractJsonLexerKt.NULL, 1, JsonToken.VALUE_NULL);
    }

    public JsonToken _startNumberLeadingZero() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            this._minorState = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i2 = i + 1;
        int i3 = this._inputBuffer[i] & 255;
        if (i3 < 48) {
            if (i3 == 46) {
                this._inputPtr = i2;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment, 1, i3);
            }
        } else if (i3 > 57) {
            if (i3 != 101 && i3 != 69) {
                if (i3 != 93 && i3 != 125) {
                    reportUnexpectedNumberChar(i3, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else {
                this._inputPtr = i2;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment2[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment2, 1, i3);
            }
        } else {
            return _finishNumberLeadingZeroes();
        }
        return _valueCompleteInt(0, "0");
    }

    public JsonToken _startPositiveNumber(int i) throws IOException {
        this._numberNegative = false;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = (char) i;
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = this._inputBuffer[i2] & 255;
        int i4 = 1;
        while (true) {
            if (i3 < 48) {
                if (i3 == 46) {
                    this._intLength = i4;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i4, i3);
                }
            } else if (i3 > 57) {
                if (i3 == 101 || i3 == 69) {
                    this._intLength = i4;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i4, i3);
                }
            } else {
                if (i4 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i5 = i4 + 1;
                emptyAndGetCurrentSegment[i4] = (char) i3;
                int i6 = this._inputPtr + 1;
                this._inputPtr = i6;
                if (i6 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i5);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken2;
                    return jsonToken2;
                }
                i3 = this._inputBuffer[i6] & 255;
                i4 = i5;
            }
        }
        this._intLength = i4;
        this._textBuffer.setCurrentLength(i4);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startString() throws IOException {
        int i = this._inputPtr;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = f43188h;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 == 34) {
                    this._inputPtr = i + 1;
                    this._textBuffer.setCurrentLength(i2);
                    return _valueComplete(JsonToken.VALUE_STRING);
                }
            } else {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            }
        }
        this._textBuffer.setCurrentLength(i2);
        this._inputPtr = i;
        return m49542x();
    }

    public JsonToken _startTrueToken() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return _valueComplete(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this._minorState = 17;
        return _finishKeywordToken("true", 1, JsonToken.VALUE_TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r4 != 44) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (r2._parsingContext.inArray() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
        if ((r2._features & com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.f43183c) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        r2._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _startUnexpectedValue(boolean r3, int r4) throws java.io.IOException {
        /*
            r2 = this;
            r3 = 39
            if (r4 == r3) goto L4b
            r3 = 73
            r0 = 1
            if (r4 == r3) goto L46
            r3 = 78
            if (r4 == r3) goto L40
            r3 = 93
            if (r4 == r3) goto L24
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 == r3) goto L57
            r3 = 43
            if (r4 == r3) goto L1e
            r3 = 44
            if (r4 == r3) goto L2d
            goto L57
        L1e:
            r3 = 2
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r3, r0)
            return r3
        L24:
            com.fasterxml.jackson.core.json.JsonReadContext r3 = r2._parsingContext
            boolean r3 = r3.inArray()
            if (r3 != 0) goto L2d
            goto L57
        L2d:
            int r3 = r2._features
            int r1 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.f43183c
            r3 = r3 & r1
            if (r3 == 0) goto L57
            int r3 = r2._inputPtr
            int r3 = r3 - r0
            r2._inputPtr = r3
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            com.fasterxml.jackson.core.JsonToken r3 = r2._valueComplete(r3)
            return r3
        L40:
            r3 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r3, r0)
            return r3
        L46:
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r0, r0)
            return r3
        L4b:
            int r3 = r2._features
            int r0 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.f43184d
            r3 = r3 & r0
            if (r3 == 0) goto L57
            com.fasterxml.jackson.core.JsonToken r3 = r2._startAposString()
            return r3
        L57:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "expected a valid value "
            r3.append(r0)
            java.lang.String r0 = r2._validJsonValueList()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2._reportUnexpectedChar(r4, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startUnexpectedValue(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public void endOfInput() {
        this._endOfInput = true;
    }

    @Override // com.fasterxml.jackson.core.async.ByteArrayFeeder
    public void feedInput(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this._inputPtr;
        int i4 = this._inputEnd;
        if (i3 < i4) {
            _reportError("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(i4 - i3));
        }
        if (i2 < i) {
            _reportError("Input end (%d) may not be before start (%d)", Integer.valueOf(i2), Integer.valueOf(i));
        }
        if (this._endOfInput) {
            _reportError("Already closed, can not feed more input");
        }
        this._currInputProcessed += this._origBufferLen;
        this._currInputRowStart = i - (this._inputEnd - this._currInputRowStart);
        this._currBufferStart = i;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i2;
        this._origBufferLen = i2 - i;
    }

    /* renamed from: g */
    public final int m49558g() {
        if (this._inputEnd - this._inputPtr < 5) {
            return m49556j(0, -1);
        }
        return m49557i();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ByteArrayFeeder getNonBlockingInputFeeder() {
        return this;
    }

    /* renamed from: i */
    public final int m49557i() {
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if (b != 34 && b != 47 && b != 92) {
            if (b != 98) {
                if (b != 102) {
                    if (b != 110) {
                        if (b != 114) {
                            if (b != 116) {
                                if (b != 117) {
                                    return _handleUnrecognizedCharacterEscape((char) b);
                                }
                                this._inputPtr = i + 2;
                                byte b2 = bArr[i2];
                                int charToHex = CharTypes.charToHex(b2);
                                if (charToHex >= 0) {
                                    byte[] bArr2 = this._inputBuffer;
                                    int i3 = this._inputPtr;
                                    this._inputPtr = i3 + 1;
                                    b2 = bArr2[i3];
                                    int charToHex2 = CharTypes.charToHex(b2);
                                    if (charToHex2 >= 0) {
                                        int i4 = (charToHex << 4) | charToHex2;
                                        byte[] bArr3 = this._inputBuffer;
                                        int i5 = this._inputPtr;
                                        this._inputPtr = i5 + 1;
                                        byte b3 = bArr3[i5];
                                        int charToHex3 = CharTypes.charToHex(b3);
                                        if (charToHex3 >= 0) {
                                            int i6 = (i4 << 4) | charToHex3;
                                            byte[] bArr4 = this._inputBuffer;
                                            int i7 = this._inputPtr;
                                            this._inputPtr = i7 + 1;
                                            b3 = bArr4[i7];
                                            int charToHex4 = CharTypes.charToHex(b3);
                                            if (charToHex4 >= 0) {
                                                return (i6 << 4) | charToHex4;
                                            }
                                        }
                                        b2 = b3;
                                    }
                                }
                                _reportUnexpectedChar(b2 & 255, "expected a hex-digit for character escape sequence");
                                return -1;
                            }
                            return 9;
                        }
                        return 13;
                    }
                    return 10;
                }
                return 12;
            }
            return 8;
        }
        return (char) b;
    }

    /* renamed from: j */
    public final int m49556j(int i, int i2) {
        int i3 = this._inputPtr;
        int i4 = this._inputEnd;
        if (i3 >= i4) {
            this._quoted32 = i;
            this._quotedDigits = i2;
            return -1;
        }
        byte[] bArr = this._inputBuffer;
        int i5 = i3 + 1;
        this._inputPtr = i5;
        byte b = bArr[i3];
        if (i2 == -1) {
            if (b != 34 && b != 47 && b != 92) {
                if (b != 98) {
                    if (b != 102) {
                        if (b != 110) {
                            if (b != 114) {
                                if (b != 116) {
                                    if (b != 117) {
                                        return _handleUnrecognizedCharacterEscape((char) b);
                                    }
                                    i2 = 0;
                                    if (i5 >= i4) {
                                        this._quotedDigits = 0;
                                        this._quoted32 = 0;
                                        return -1;
                                    }
                                    this._inputPtr = i3 + 2;
                                    b = bArr[i5];
                                } else {
                                    return 9;
                                }
                            } else {
                                return 13;
                            }
                        } else {
                            return 10;
                        }
                    } else {
                        return 12;
                    }
                } else {
                    return 8;
                }
            } else {
                return b;
            }
        }
        int i6 = b & 255;
        while (true) {
            int charToHex = CharTypes.charToHex(i6);
            if (charToHex < 0) {
                _reportUnexpectedChar(i6 & 255, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | charToHex;
            i2++;
            if (i2 == 4) {
                return i;
            }
            int i7 = this._inputPtr;
            if (i7 >= this._inputEnd) {
                this._quotedDigits = i2;
                this._quoted32 = i;
                return -1;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i7 + 1;
            i6 = bArr2[i7] & 255;
        }
    }

    /* renamed from: k */
    public final boolean m49555k(int i, int i2, boolean z) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i < 32) {
                            _throwUnquotedSpace(i, "string value");
                        } else {
                            _reportInvalidChar(i);
                        }
                        this._textBuffer.append((char) i);
                        return true;
                    }
                    int i3 = i & 7;
                    if (z) {
                        byte[] bArr = this._inputBuffer;
                        int i4 = this._inputPtr;
                        this._inputPtr = i4 + 1;
                        return m49553m(i3, 1, bArr[i4]);
                    }
                    this._pending32 = i3;
                    this._pendingBytes = 1;
                    this._minorState = 44;
                    return false;
                }
                int i5 = i & 15;
                if (z) {
                    byte[] bArr2 = this._inputBuffer;
                    int i6 = this._inputPtr;
                    this._inputPtr = i6 + 1;
                    return m49554l(i5, 1, bArr2[i6]);
                }
                this._minorState = 43;
                this._pending32 = i5;
                this._pendingBytes = 1;
                return false;
            } else if (z) {
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                this._textBuffer.append((char) m49552n(i, bArr3[i7]));
                return true;
            } else {
                this._minorState = 42;
                this._pending32 = i;
                return false;
            }
        }
        int m49556j = m49556j(0, -1);
        if (m49556j < 0) {
            this._minorState = 41;
            return false;
        }
        this._textBuffer.append((char) m49556j);
        return true;
    }

    /* renamed from: l */
    public final boolean m49554l(int i, int i2, int i3) {
        if (i2 == 1) {
            if ((i3 & CertificateHolderAuthorization.CVCA) != 128) {
                _reportInvalidOther(i3 & 255, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            i3 = bArr[i4];
        }
        if ((i3 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        this._textBuffer.append((char) ((i << 6) | (i3 & 63)));
        return true;
    }

    /* renamed from: m */
    public final boolean m49553m(int i, int i2, int i3) {
        if (i2 == 1) {
            if ((i3 & CertificateHolderAuthorization.CVCA) != 128) {
                _reportInvalidOther(i3 & 255, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            i3 = bArr[i4];
            i2 = 2;
        }
        if (i2 == 2) {
            if ((i3 & CertificateHolderAuthorization.CVCA) != 128) {
                _reportInvalidOther(i3 & 255, this._inputPtr);
            }
            i = (i << 6) | (i3 & 63);
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i;
                this._pendingBytes = 3;
                return false;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i3 = bArr2[i5];
        }
        if ((i3 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        int i6 = ((i << 6) | (i3 & 63)) - 65536;
        this._textBuffer.append((char) ((i6 >> 10) | GeneratorBase.SURR1_FIRST));
        this._textBuffer.append((char) ((i6 & 1023) | 56320));
        return true;
    }

    /* renamed from: n */
    public final int m49552n(int i, int i2) {
        if ((i2 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i2 & 255, this._inputPtr);
        }
        return ((i & 31) << 6) | (i2 & 63);
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public final boolean needMoreInput() {
        if (this._inputPtr >= this._inputEnd && !this._endOfInput) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            if (this._endOfInput) {
                if (this._currToken == JsonToken.NOT_AVAILABLE) {
                    return _finishTokenWithEOF();
                }
                return _eofAsNextToken();
            }
            return JsonToken.NOT_AVAILABLE;
        } else if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return _finishToken();
        } else {
            this._numTypesValid = 0;
            this._tokenInputTotal = this._currInputProcessed + i;
            this._binaryValue = null;
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            switch (this._majorState) {
                case 0:
                    return m49566F(i2);
                case 1:
                    return m49562J(i2);
                case 2:
                    return m49565G(i2);
                case 3:
                    return m49564H(i2);
                case 4:
                    return m49560L(i2);
                case 5:
                    return m49562J(i2);
                case 6:
                    return m49559M(i2);
                default:
                    VersionUtil.throwInternal();
                    return null;
            }
        }
    }

    /* renamed from: o */
    public final int m49551o(int i, int i2, int i3) {
        int i4 = i & 15;
        if ((i2 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i2 & 255, this._inputPtr);
        }
        int i5 = (i4 << 6) | (i2 & 63);
        if ((i3 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        return (i5 << 6) | (i3 & 63);
    }

    /* renamed from: p */
    public final int m49550p(int i, int i2, int i3, int i4) {
        if ((i2 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i2 & 255, this._inputPtr);
        }
        int i5 = ((i & 7) << 6) | (i2 & 63);
        if ((i3 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        int i6 = (i5 << 6) | (i3 & 63);
        if ((i4 & CertificateHolderAuthorization.CVCA) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        return ((i6 << 6) | (i4 & 63)) - 65536;
    }

    /* renamed from: q */
    public final String m49549q() {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i = this._inputPtr;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        if (iArr[i3] == 0) {
            int i4 = i + 2;
            int i5 = bArr[i2] & 255;
            if (iArr[i5] == 0) {
                int i6 = i5 | (i3 << 8);
                int i7 = i + 3;
                int i8 = bArr[i4] & 255;
                if (iArr[i8] == 0) {
                    int i9 = (i6 << 8) | i8;
                    int i10 = i + 4;
                    int i11 = bArr[i7] & 255;
                    if (iArr[i11] == 0) {
                        int i12 = (i9 << 8) | i11;
                        int i13 = i + 5;
                        int i14 = bArr[i10] & 255;
                        if (iArr[i14] == 0) {
                            this._quad1 = i12;
                            return m49570B(i13, i14);
                        } else if (i14 != 34) {
                            return null;
                        } else {
                            this._inputPtr = i13;
                            return _findName(i12, 4);
                        }
                    } else if (i11 != 34) {
                        return null;
                    } else {
                        this._inputPtr = i10;
                        return _findName(i9, 3);
                    }
                } else if (i8 != 34) {
                    return null;
                } else {
                    this._inputPtr = i7;
                    return _findName(i6, 2);
                }
            } else if (i5 != 34) {
                return null;
            } else {
                this._inputPtr = i4;
                return _findName(i3, 1);
            }
        } else if (i3 != 34) {
            return null;
        } else {
            this._inputPtr = i2;
            return "";
        }
    }

    /* renamed from: r */
    public final JsonToken m49548r(int i, int i2, int i3) {
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._quadLength = i;
                this._pending32 = i2;
                this._pendingBytes = i3;
                this._minorState = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            int i5 = bArr[i4] & 255;
            if (i5 == 39) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i] = NonBlockingJsonParserBase._padLastQuad(i2, i3);
                    i++;
                } else if (i == 0) {
                    return _fieldComplete("");
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            }
            if (i5 != 34 && iArr2[i5] != 0) {
                if (i5 != 92) {
                    _throwUnquotedSpace(i5, "name");
                } else {
                    i5 = m49558g();
                    if (i5 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 9;
                        this._quadLength = i;
                        this._pending32 = i2;
                        this._pendingBytes = i3;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i5 > 127) {
                    int i6 = 0;
                    if (i3 >= 4) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    if (i5 < 2048) {
                        i2 = (i2 << 8) | (i5 >> 6) | CertificateHolderAuthorization.CVCA;
                        i3++;
                    } else {
                        int i7 = (i2 << 8) | (i5 >> 12) | 224;
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i6 = i7;
                        }
                        i2 = (i6 << 8) | ((i5 >> 6) & 63) | 128;
                        i3 = i8 + 1;
                    }
                    i5 = (i5 & 63) | 128;
                }
            }
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | i5;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i5;
                i3 = 1;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase, com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd;
        int i2 = this._inputPtr;
        int i3 = i - i2;
        if (i3 > 0) {
            outputStream.write(this._inputBuffer, i2, i3);
        }
        return i3;
    }

    /* renamed from: s */
    public final JsonToken m49547s() {
        int[] iArr = f43188h;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i = this._inputPtr;
        int i2 = this._inputEnd - 5;
        while (i < this._inputEnd) {
            boolean z = false;
            int i3 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i);
            while (true) {
                if (i < min) {
                    int i4 = i + 1;
                    int i5 = bArr[i] & 255;
                    int i6 = iArr[i5];
                    if (i6 != 0 && i5 != 34) {
                        if (i4 >= i2) {
                            this._inputPtr = i4;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            int i7 = iArr[i5];
                            if (i4 < this._inputEnd) {
                                z = true;
                            }
                            if (!m49555k(i5, i7, z)) {
                                this._minorStateAfterSplit = 45;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                            currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                            i = this._inputPtr;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 != 4) {
                                            if (i5 < 32) {
                                                _throwUnquotedSpace(i5, "string value");
                                            } else {
                                                _reportInvalidChar(i5);
                                            }
                                            i = i4;
                                        } else {
                                            byte[] bArr2 = this._inputBuffer;
                                            int i8 = i + 3;
                                            i += 4;
                                            int m49550p = m49550p(i5, bArr2[i4], bArr2[i + 2], bArr2[i8]);
                                            int i9 = currentSegmentSize + 1;
                                            bufferWithoutReset[currentSegmentSize] = (char) ((m49550p >> 10) | GeneratorBase.SURR1_FIRST);
                                            if (i9 >= bufferWithoutReset.length) {
                                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                                currentSegmentSize = 0;
                                            } else {
                                                currentSegmentSize = i9;
                                            }
                                            i5 = (m49550p & 1023) | 56320;
                                        }
                                    } else {
                                        byte[] bArr3 = this._inputBuffer;
                                        int i10 = i + 2;
                                        i += 3;
                                        i5 = m49551o(i5, bArr3[i4], bArr3[i10]);
                                    }
                                } else {
                                    i += 2;
                                    i5 = m49552n(i5, this._inputBuffer[i4]);
                                }
                            } else {
                                this._inputPtr = i4;
                                i5 = m49557i();
                                i = this._inputPtr;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            } else {
                                i3 = currentSegmentSize;
                            }
                            currentSegmentSize = i3 + 1;
                            bufferWithoutReset[i3] = (char) i5;
                        }
                    } else if (i5 == 39) {
                        this._inputPtr = i4;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return _valueComplete(JsonToken.VALUE_STRING);
                    } else {
                        bufferWithoutReset[currentSegmentSize] = (char) i5;
                        currentSegmentSize++;
                        i = i4;
                    }
                }
            }
        }
        this._inputPtr = i;
        this._minorState = 45;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    /* renamed from: t */
    public final JsonToken m49546t(int i) {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i2 + 1;
                int i3 = bArr[i2] & 255;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            this._currInputProcessed -= 3;
                            return m49566F(i3);
                        }
                    } else if (i3 != 191) {
                        _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i3));
                    }
                } else if (i3 != 187) {
                    _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i3));
                }
                i++;
            } else {
                this._pending32 = i;
                this._minorState = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
        }
    }

    /* renamed from: u */
    public final JsonToken m49545u(int i, boolean z) {
        int i2;
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                if (z) {
                    i2 = 52;
                } else {
                    i2 = 53;
                }
                this._minorState = i2;
                this._pending32 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            int i5 = bArr[i3] & 255;
            if (i5 < 32) {
                if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (i5 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i4;
                } else if (i5 != 9) {
                    _throwInvalidSpace(i5);
                }
            } else if (i5 == 42) {
                z = true;
            } else if (i5 == 47 && z) {
                return m49567E(i);
            }
            z = false;
        }
    }

    /* renamed from: v */
    public final JsonToken m49544v(int i) {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 54;
                this._pending32 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
        return m49567E(i);
    }

    /* renamed from: w */
    public final JsonToken m49543w(int i) {
        if ((this._features & f43187g) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                this._minorState = 55;
                this._pending32 = i;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 < 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i3;
                    break;
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
        return m49567E(i);
    }

    /* renamed from: x */
    public final JsonToken m49542x() {
        int[] iArr = f43188h;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i = this._inputPtr;
        int i2 = this._inputEnd - 5;
        while (i < this._inputEnd) {
            boolean z = false;
            int i3 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i);
            while (true) {
                if (i < min) {
                    int i4 = i + 1;
                    int i5 = bArr[i] & 255;
                    int i6 = iArr[i5];
                    if (i6 != 0) {
                        if (i5 == 34) {
                            this._inputPtr = i4;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        } else if (i4 >= i2) {
                            this._inputPtr = i4;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            int i7 = iArr[i5];
                            if (i4 < this._inputEnd) {
                                z = true;
                            }
                            if (!m49555k(i5, i7, z)) {
                                this._minorStateAfterSplit = 40;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                            currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                            i = this._inputPtr;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 != 4) {
                                            if (i5 < 32) {
                                                _throwUnquotedSpace(i5, "string value");
                                            } else {
                                                _reportInvalidChar(i5);
                                            }
                                            i = i4;
                                        } else {
                                            byte[] bArr2 = this._inputBuffer;
                                            int i8 = i + 3;
                                            i += 4;
                                            int m49550p = m49550p(i5, bArr2[i4], bArr2[i + 2], bArr2[i8]);
                                            int i9 = currentSegmentSize + 1;
                                            bufferWithoutReset[currentSegmentSize] = (char) ((m49550p >> 10) | GeneratorBase.SURR1_FIRST);
                                            if (i9 >= bufferWithoutReset.length) {
                                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                                currentSegmentSize = 0;
                                            } else {
                                                currentSegmentSize = i9;
                                            }
                                            i5 = (m49550p & 1023) | 56320;
                                        }
                                    } else {
                                        byte[] bArr3 = this._inputBuffer;
                                        int i10 = i + 2;
                                        i += 3;
                                        i5 = m49551o(i5, bArr3[i4], bArr3[i10]);
                                    }
                                } else {
                                    i += 2;
                                    i5 = m49552n(i5, this._inputBuffer[i4]);
                                }
                            } else {
                                this._inputPtr = i4;
                                i5 = m49557i();
                                i = this._inputPtr;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            } else {
                                i3 = currentSegmentSize;
                            }
                            currentSegmentSize = i3 + 1;
                            bufferWithoutReset[i3] = (char) i5;
                        }
                    } else {
                        bufferWithoutReset[currentSegmentSize] = (char) i5;
                        currentSegmentSize++;
                        i = i4;
                    }
                }
            }
        }
        this._inputPtr = i;
        this._minorState = 40;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    /* renamed from: y */
    public final JsonToken m49541y(int i, int i2, int i3) {
        int[] iArr = this._quadBuffer;
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._quadLength = i;
                this._pending32 = i2;
                this._pendingBytes = i3;
                this._minorState = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            int i5 = this._inputBuffer[i4] & 255;
            if (inputCodeUtf8JsNames[i5] != 0) {
                if (i3 > 0) {
                    if (i >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i] = i2;
                    i++;
                }
                String findName = this._symbols.findName(iArr, i);
                if (findName == null) {
                    findName = _addName(iArr, i, i3);
                }
                return _fieldComplete(findName);
            }
            this._inputPtr = i4 + 1;
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | i5;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i5;
                i3 = 1;
            }
        }
    }

    /* renamed from: z */
    public final JsonToken m49540z(int i) {
        if (i != 35) {
            if (i != 39) {
                if (i != 47) {
                    if (i == 93) {
                        return _closeArrayScope();
                    }
                } else {
                    return m49563I(4);
                }
            } else if ((this._features & f43184d) != 0) {
                return m49548r(0, 0, 0);
            }
        } else if ((this._features & f43187g) != 0) {
            return m49543w(4);
        }
        if ((this._features & f43185e) == 0) {
            _reportUnexpectedChar((char) i, "was expecting double-quote to start field name");
        }
        if (CharTypes.getInputCodeUtf8JsNames()[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return m49541y(0, i, 1);
    }
}
