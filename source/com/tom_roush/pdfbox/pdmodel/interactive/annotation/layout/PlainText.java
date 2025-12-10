package com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout;

import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;

/* loaded from: classes5.dex */
public class PlainText {

    /* renamed from: a */
    public final List f60600a;

    /* loaded from: classes5.dex */
    public static class TextAttribute extends AttributedCharacterIterator.Attribute {
        public static final AttributedCharacterIterator.Attribute WIDTH = new TextAttribute("width");
        private static final long serialVersionUID = -3138885145941283005L;

        public TextAttribute(String str) {
            super(str);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout.PlainText$a */
    /* loaded from: classes5.dex */
    public static class C9953a {

        /* renamed from: a */
        public final List f60601a = new ArrayList();

        /* renamed from: b */
        public float f60602b;

        /* renamed from: a */
        public void m32308a(C9955c c9955c) {
            this.f60601a.add(c9955c);
        }

        /* renamed from: b */
        public float m32307b(PDFont pDFont, float f) {
            float f2 = f / 1000.0f;
            float f3 = 0.0f;
            int i = 0;
            for (C9955c c9955c : this.f60601a) {
                f3 += ((Float) c9955c.m32300a().getIterator().getAttribute(TextAttribute.WIDTH)).floatValue();
                String m32299b = c9955c.m32299b();
                if (i == this.f60601a.size() - 1 && Character.isWhitespace(m32299b.charAt(m32299b.length() - 1))) {
                    f3 -= pDFont.getStringWidth(m32299b.substring(m32299b.length() - 1)) * f2;
                }
                i++;
            }
            return f3;
        }

        /* renamed from: c */
        public float m32306c(float f) {
            return (f - this.f60602b) / (this.f60601a.size() - 1);
        }

        /* renamed from: d */
        public float m32305d() {
            return this.f60602b;
        }

        /* renamed from: e */
        public List m32304e() {
            return this.f60601a;
        }

        /* renamed from: f */
        public void m32303f(float f) {
            this.f60602b = f;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout.PlainText$b */
    /* loaded from: classes5.dex */
    public static class C9954b {

        /* renamed from: a */
        public final String f60603a;

        public C9954b(String str) {
            this.f60603a = str;
        }

        /* renamed from: a */
        public List m32302a(PDFont pDFont, float f, float f2) {
            BreakIterator lineInstance = BreakIterator.getLineInstance();
            lineInstance.setText(this.f60603a);
            float f3 = f / 1000.0f;
            int first = lineInstance.first();
            int next = lineInstance.next();
            ArrayList arrayList = new ArrayList();
            C9953a c9953a = new C9953a();
            float f4 = 0.0f;
            while (true) {
                int i = next;
                int i2 = first;
                first = i;
                if (first != -1) {
                    String substring = this.f60603a.substring(i2, first);
                    float stringWidth = pDFont.getStringWidth(substring) * f3;
                    f4 += stringWidth;
                    if (f4 >= f2 && Character.isWhitespace(substring.charAt(substring.length() - 1))) {
                        f4 -= pDFont.getStringWidth(substring.substring(substring.length() - 1)) * f3;
                    }
                    if (f4 >= f2) {
                        c9953a.m32303f(c9953a.m32307b(pDFont, f));
                        arrayList.add(c9953a);
                        c9953a = new C9953a();
                        f4 = pDFont.getStringWidth(substring) * f3;
                    }
                    AttributedString attributedString = new AttributedString(substring);
                    attributedString.addAttribute(TextAttribute.WIDTH, Float.valueOf(stringWidth));
                    C9955c c9955c = new C9955c(substring);
                    c9955c.m32298c(attributedString);
                    c9953a.m32308a(c9955c);
                    next = lineInstance.next();
                } else {
                    c9953a.m32303f(c9953a.m32307b(pDFont, f));
                    arrayList.add(c9953a);
                    return arrayList;
                }
            }
        }

        /* renamed from: b */
        public String m32301b() {
            return this.f60603a;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout.PlainText$c */
    /* loaded from: classes5.dex */
    public static class C9955c {

        /* renamed from: a */
        public AttributedString f60604a;

        /* renamed from: b */
        public final String f60605b;

        public C9955c(String str) {
            this.f60605b = str;
        }

        /* renamed from: a */
        public AttributedString m32300a() {
            return this.f60604a;
        }

        /* renamed from: b */
        public String m32299b() {
            return this.f60605b;
        }

        /* renamed from: c */
        public void m32298c(AttributedString attributedString) {
            this.f60604a = attributedString;
        }
    }

    public PlainText(String str) {
        String[] split = str.replace('\t', TokenParser.f74560SP).split("\\r\\n|\\n|\\r|\\u2028|\\u2029");
        this.f60600a = new ArrayList(split.length);
        for (String str2 : split) {
            if (str2.length() == 0) {
                str2 = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
            }
            this.f60600a.add(new C9954b(str2));
        }
    }

    /* renamed from: a */
    public List m32309a() {
        return this.f60600a;
    }

    public PlainText(List<String> list) {
        this.f60600a = new ArrayList(list.size());
        for (String str : list) {
            this.f60600a.add(new C9954b(str));
        }
    }
}
