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
    public final IEscapeUtil f39988a;

    /* renamed from: b */
    public final TokenStream f39989b;

    /* renamed from: c */
    public final String f39990c;

    /* renamed from: d */
    public final int f39991d;

    /* renamed from: e */
    public char f39992e;

    /* renamed from: f */
    public int f39993f;

    public OptionTokenizer(TokenStream tokenStream) {
        this(tokenStream, new AsIsEscapeUtil());
    }

    /* renamed from: a */
    public void m51426a(List list, List list2) {
        list.add(new C22348tU1(1006, list2));
        this.f39989b.f40001e = TokenStream.TokenizerState.LITERAL_STATE;
    }

    /* renamed from: b */
    public void m51425b(String str, StringBuffer stringBuffer) {
        TokenStream tokenStream = this.f39989b;
        int i = tokenStream.f40002f;
        if (i < this.f39991d) {
            String str2 = this.f39990c;
            tokenStream.f40002f = i + 1;
            this.f39988a.escape(str, stringBuffer, str2.charAt(i), this.f39989b.f40002f);
        }
    }

    /* renamed from: c */
    public void m51424c(char c, List list) {
        String trim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.f39989b.f40002f < this.f39991d) {
            int i = this.f39993f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        char c2 = this.f39992e;
                        if (c == c2) {
                            trim = stringBuffer.toString();
                            arrayList.add(trim);
                            stringBuffer.setLength(0);
                            this.f39993f = 0;
                        } else {
                            if (c == '\\') {
                                m51425b(String.valueOf(c2), stringBuffer);
                            }
                            stringBuffer.append(c);
                        }
                    }
                } else if (c != ',') {
                    if (c == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        m51426a(list, arrayList);
                        return;
                    }
                    stringBuffer.append(c);
                } else {
                    trim = stringBuffer.toString().trim();
                    arrayList.add(trim);
                    stringBuffer.setLength(0);
                    this.f39993f = 0;
                }
            } else if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c == '\"' || c == '\'') {
                    this.f39993f = 2;
                    this.f39992e = c;
                } else if (c == ',') {
                    continue;
                } else if (c == '}') {
                    m51426a(list, arrayList);
                    return;
                } else {
                    stringBuffer.append(c);
                    this.f39993f = 1;
                }
            }
            c = this.f39990c.charAt(this.f39989b.f40002f);
            this.f39989b.f40002f++;
        }
        if (c != '}') {
            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
        }
        int i2 = this.f39993f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
            }
            arrayList.add(stringBuffer.toString().trim());
        }
        m51426a(list, arrayList);
    }

    public OptionTokenizer(TokenStream tokenStream, IEscapeUtil iEscapeUtil) {
        this.f39993f = 0;
        this.f39989b = tokenStream;
        this.f39990c = tokenStream.f39997a;
        this.f39991d = tokenStream.f39998b;
        this.f39988a = iEscapeUtil;
    }
}