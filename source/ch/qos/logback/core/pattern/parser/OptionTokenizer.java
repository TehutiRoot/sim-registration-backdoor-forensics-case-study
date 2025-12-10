package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.parser.TokenStream;
import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class OptionTokenizer {

    /* renamed from: a */
    public final IEscapeUtil f39990a;

    /* renamed from: b */
    public final TokenStream f39991b;

    /* renamed from: c */
    public final String f39992c;

    /* renamed from: d */
    public final int f39993d;

    /* renamed from: e */
    public char f39994e;

    /* renamed from: f */
    public int f39995f;

    public OptionTokenizer(TokenStream tokenStream) {
        this(tokenStream, new AsIsEscapeUtil());
    }

    /* renamed from: a */
    public void m51431a(List list, List list2) {
        list.add(new C22796wT1(1006, list2));
        this.f39991b.f40003e = TokenStream.TokenizerState.LITERAL_STATE;
    }

    /* renamed from: b */
    public void m51430b(String str, StringBuffer stringBuffer) {
        TokenStream tokenStream = this.f39991b;
        int i = tokenStream.f40004f;
        if (i < this.f39993d) {
            String str2 = this.f39992c;
            tokenStream.f40004f = i + 1;
            this.f39990a.escape(str, stringBuffer, str2.charAt(i), this.f39991b.f40004f);
        }
    }

    /* renamed from: c */
    public void m51429c(char c, List list) {
        String trim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.f39991b.f40004f < this.f39993d) {
            int i = this.f39995f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        char c2 = this.f39994e;
                        if (c == c2) {
                            trim = stringBuffer.toString();
                            arrayList.add(trim);
                            stringBuffer.setLength(0);
                            this.f39995f = 0;
                        } else {
                            if (c == '\\') {
                                m51430b(String.valueOf(c2), stringBuffer);
                            }
                            stringBuffer.append(c);
                        }
                    }
                } else if (c != ',') {
                    if (c == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        m51431a(list, arrayList);
                        return;
                    }
                    stringBuffer.append(c);
                } else {
                    trim = stringBuffer.toString().trim();
                    arrayList.add(trim);
                    stringBuffer.setLength(0);
                    this.f39995f = 0;
                }
            } else if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c == '\"' || c == '\'') {
                    this.f39995f = 2;
                    this.f39994e = c;
                } else if (c == ',') {
                    continue;
                } else if (c == '}') {
                    m51431a(list, arrayList);
                    return;
                } else {
                    stringBuffer.append(c);
                    this.f39995f = 1;
                }
            }
            c = this.f39992c.charAt(this.f39991b.f40004f);
            this.f39991b.f40004f++;
        }
        if (c != '}') {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        int i2 = this.f39995f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
            }
            arrayList.add(stringBuffer.toString().trim());
        }
        m51431a(list, arrayList);
    }

    public OptionTokenizer(TokenStream tokenStream, IEscapeUtil iEscapeUtil) {
        this.f39995f = 0;
        this.f39991b = tokenStream;
        this.f39992c = tokenStream.f39999a;
        this.f39993d = tokenStream.f40000b;
        this.f39990a = iEscapeUtil;
    }
}
