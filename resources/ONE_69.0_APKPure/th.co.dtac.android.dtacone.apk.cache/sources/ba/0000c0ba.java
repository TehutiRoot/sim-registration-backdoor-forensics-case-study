package com.tom_roush.fontbox.type1;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.tom_roush.fontbox.type1.a */
/* loaded from: classes5.dex */
public class C9883a {

    /* renamed from: a */
    public final ByteBuffer f59693a;

    /* renamed from: c */
    public int f59695c = 0;

    /* renamed from: b */
    public Token f59694b = m32826h(null);

    public C9883a(byte[] bArr) {
        this.f59693a = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public final char m32833a() {
        return (char) this.f59693a.get();
    }

    /* renamed from: b */
    public Token m32832b() {
        Token token = this.f59694b;
        this.f59694b = m32826h(token);
        return token;
    }

    /* renamed from: c */
    public Token m32831c() {
        return this.f59694b;
    }

    /* renamed from: d */
    public final Token m32830d(int i) {
        this.f59693a.get();
        byte[] bArr = new byte[i];
        this.f59693a.get(bArr);
        return new Token(bArr, Token.f59651m);
    }

    /* renamed from: e */
    public final String m32829e() {
        char m32833a;
        StringBuilder sb = new StringBuilder();
        while (this.f59693a.hasRemaining() && (m32833a = m32833a()) != '\r' && m32833a != '\n') {
            sb.append(m32833a);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final String m32828f() {
        StringBuilder sb = new StringBuilder();
        while (this.f59693a.hasRemaining()) {
            this.f59693a.mark();
            char m32833a = m32833a();
            if (!Character.isWhitespace(m32833a) && m32833a != '(' && m32833a != ')' && m32833a != '<' && m32833a != '>' && m32833a != '[' && m32833a != ']' && m32833a != '{' && m32833a != '}' && m32833a != '/' && m32833a != '%') {
                sb.append(m32833a);
            } else {
                this.f59693a.reset();
                break;
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public final Token m32827g() {
        StringBuilder sb = new StringBuilder();
        while (this.f59693a.hasRemaining()) {
            char m32833a = m32833a();
            if (m32833a != '\n' && m32833a != '\r') {
                if (m32833a != '\\') {
                    if (m32833a != '(') {
                        if (m32833a != ')') {
                            sb.append(m32833a);
                        } else if (this.f59695c == 0) {
                            return new Token(sb.toString(), Token.f59642d);
                        } else {
                            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                            this.f59695c--;
                        }
                    } else {
                        this.f59695c++;
                        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                    }
                } else {
                    char m32833a2 = m32833a();
                    if (m32833a2 != '(') {
                        if (m32833a2 != ')') {
                            if (m32833a2 != '\\') {
                                if (m32833a2 != 'b') {
                                    if (m32833a2 != 'f') {
                                        if (m32833a2 != 'n' && m32833a2 != 'r') {
                                            if (m32833a2 == 't') {
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
                    if (Character.isDigit(m32833a2)) {
                        try {
                            sb.append((char) Integer.parseInt(String.valueOf(new char[]{m32833a2, m32833a(), m32833a()}), 8));
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
    public final Token m32826h(Token token) {
        boolean z;
        do {
            z = false;
            while (this.f59693a.hasRemaining()) {
                char m32833a = m32833a();
                if (m32833a == '%') {
                    m32829e();
                } else if (m32833a == '(') {
                    return m32827g();
                } else {
                    if (m32833a != ')') {
                        if (m32833a == '[') {
                            return new Token(m32833a, Token.f59647i);
                        }
                        if (m32833a == '{') {
                            return new Token(m32833a, Token.f59649k);
                        }
                        if (m32833a == ']') {
                            return new Token(m32833a, Token.f59648j);
                        }
                        if (m32833a == '}') {
                            return new Token(m32833a, Token.f59650l);
                        }
                        if (m32833a == '/') {
                            return new Token(m32828f(), Token.f59644f);
                        }
                        if (m32833a == '<') {
                            if (m32833a() == m32833a) {
                                return new Token("<<", Token.f59652n);
                            }
                            ByteBuffer byteBuffer = this.f59693a;
                            byteBuffer.position(byteBuffer.position() - 1);
                            return new Token(m32833a, Token.f59643e);
                        } else if (m32833a == '>') {
                            if (m32833a() == m32833a) {
                                return new Token(">>", Token.f59653o);
                            }
                            ByteBuffer byteBuffer2 = this.f59693a;
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            return new Token(m32833a, Token.f59643e);
                        } else {
                            if (!Character.isWhitespace(m32833a)) {
                                if (m32833a == 0) {
                                    Log.w("PdfBox-Android", "NULL byte in font, skipped");
                                } else {
                                    ByteBuffer byteBuffer3 = this.f59693a;
                                    byteBuffer3.position(byteBuffer3.position() - 1);
                                    Token m32825i = m32825i();
                                    if (m32825i != null) {
                                        return m32825i;
                                    }
                                    String m32828f = m32828f();
                                    if (m32828f != null) {
                                        if (!m32828f.equals("RD") && !m32828f.equals("-|")) {
                                            return new Token(m32828f, Token.f59643e);
                                        }
                                        if (token != null && token.m32836d() == Token.f59646h) {
                                            return m32830d(token.m32834f());
                                        }
                                        throw new IOException("expected INTEGER before -| or RD");
                                    }
                                    throw new DamagedFontException("Could not read token at position " + this.f59693a.position());
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
    public final com.tom_roush.fontbox.type1.Token m32825i() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.type1.C9883a.m32825i():com.tom_roush.fontbox.type1.Token");
    }
}