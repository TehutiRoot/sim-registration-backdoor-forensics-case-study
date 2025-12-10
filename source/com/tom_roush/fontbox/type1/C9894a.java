package com.tom_roush.fontbox.type1;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.tom_roush.fontbox.type1.a */
/* loaded from: classes5.dex */
public class C9894a {

    /* renamed from: a */
    public final ByteBuffer f59681a;

    /* renamed from: c */
    public int f59683c = 0;

    /* renamed from: b */
    public Token f59682b = m32834h(null);

    public C9894a(byte[] bArr) {
        this.f59681a = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public final char m32841a() {
        return (char) this.f59681a.get();
    }

    /* renamed from: b */
    public Token m32840b() {
        Token token = this.f59682b;
        this.f59682b = m32834h(token);
        return token;
    }

    /* renamed from: c */
    public Token m32839c() {
        return this.f59682b;
    }

    /* renamed from: d */
    public final Token m32838d(int i) {
        this.f59681a.get();
        byte[] bArr = new byte[i];
        this.f59681a.get(bArr);
        return new Token(bArr, Token.f59639m);
    }

    /* renamed from: e */
    public final String m32837e() {
        char m32841a;
        StringBuilder sb = new StringBuilder();
        while (this.f59681a.hasRemaining() && (m32841a = m32841a()) != '\r' && m32841a != '\n') {
            sb.append(m32841a);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final String m32836f() {
        StringBuilder sb = new StringBuilder();
        while (this.f59681a.hasRemaining()) {
            this.f59681a.mark();
            char m32841a = m32841a();
            if (!Character.isWhitespace(m32841a) && m32841a != '(' && m32841a != ')' && m32841a != '<' && m32841a != '>' && m32841a != '[' && m32841a != ']' && m32841a != '{' && m32841a != '}' && m32841a != '/' && m32841a != '%') {
                sb.append(m32841a);
            } else {
                this.f59681a.reset();
                break;
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public final Token m32835g() {
        StringBuilder sb = new StringBuilder();
        while (this.f59681a.hasRemaining()) {
            char m32841a = m32841a();
            if (m32841a != '\n' && m32841a != '\r') {
                if (m32841a != '\\') {
                    if (m32841a != '(') {
                        if (m32841a != ')') {
                            sb.append(m32841a);
                        } else if (this.f59683c == 0) {
                            return new Token(sb.toString(), Token.f59630d);
                        } else {
                            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                            this.f59683c--;
                        }
                    } else {
                        this.f59683c++;
                        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                    }
                } else {
                    char m32841a2 = m32841a();
                    if (m32841a2 != '(') {
                        if (m32841a2 != ')') {
                            if (m32841a2 != '\\') {
                                if (m32841a2 != 'b') {
                                    if (m32841a2 != 'f') {
                                        if (m32841a2 != 'n' && m32841a2 != 'r') {
                                            if (m32841a2 == 't') {
                                                sb.append('\t');
                                            }
                                        } else {
                                            sb.append("\n");
                                        }
                                    } else {
                                        sb.append('\f');
                                    }
                                } else {
                                    sb.append('\b');
                                }
                            } else {
                                sb.append('\\');
                            }
                        } else {
                            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                        }
                    } else {
                        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                    }
                    if (Character.isDigit(m32841a2)) {
                        try {
                            sb.append((char) Integer.parseInt(String.valueOf(new char[]{m32841a2, m32841a(), m32841a()}), 8));
                        } catch (NumberFormatException e) {
                            throw new IOException(e);
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                sb.append("\n");
            }
        }
        return null;
    }

    /* renamed from: h */
    public final Token m32834h(Token token) {
        boolean z;
        do {
            z = false;
            while (this.f59681a.hasRemaining()) {
                char m32841a = m32841a();
                if (m32841a == '%') {
                    m32837e();
                } else if (m32841a == '(') {
                    return m32835g();
                } else {
                    if (m32841a != ')') {
                        if (m32841a == '[') {
                            return new Token(m32841a, Token.f59635i);
                        }
                        if (m32841a == '{') {
                            return new Token(m32841a, Token.f59637k);
                        }
                        if (m32841a == ']') {
                            return new Token(m32841a, Token.f59636j);
                        }
                        if (m32841a == '}') {
                            return new Token(m32841a, Token.f59638l);
                        }
                        if (m32841a == '/') {
                            return new Token(m32836f(), Token.f59632f);
                        }
                        if (m32841a == '<') {
                            if (m32841a() == m32841a) {
                                return new Token("<<", Token.f59640n);
                            }
                            ByteBuffer byteBuffer = this.f59681a;
                            byteBuffer.position(byteBuffer.position() - 1);
                            return new Token(m32841a, Token.f59631e);
                        } else if (m32841a == '>') {
                            if (m32841a() == m32841a) {
                                return new Token(">>", Token.f59641o);
                            }
                            ByteBuffer byteBuffer2 = this.f59681a;
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            return new Token(m32841a, Token.f59631e);
                        } else {
                            if (!Character.isWhitespace(m32841a)) {
                                if (m32841a == 0) {
                                    Log.w("PdfBox-Android", "NULL byte in font, skipped");
                                } else {
                                    ByteBuffer byteBuffer3 = this.f59681a;
                                    byteBuffer3.position(byteBuffer3.position() - 1);
                                    Token m32833i = m32833i();
                                    if (m32833i != null) {
                                        return m32833i;
                                    }
                                    String m32836f = m32836f();
                                    if (m32836f != null) {
                                        if (!m32836f.equals("RD") && !m32836f.equals("-|")) {
                                            return new Token(m32836f, Token.f59631e);
                                        }
                                        if (token != null && token.m32844d() == Token.f59634h) {
                                            return m32838d(token.m32842f());
                                        }
                                        throw new IOException("expected INTEGER before -| or RD");
                                    }
                                    throw new DamagedFontException("Could not read token at position " + this.f59681a.position());
                                }
                            }
                            z = true;
                        }
                    } else {
                        throw new IOException("unexpected closing parenthesis");
                    }
                }
            }
        } while (z);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[LOOP:1: B:31:0x008e->B:33:0x0094, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.tom_roush.fontbox.type1.Token m32833i() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.type1.C9894a.m32833i():com.tom_roush.fontbox.type1.Token");
    }
}
