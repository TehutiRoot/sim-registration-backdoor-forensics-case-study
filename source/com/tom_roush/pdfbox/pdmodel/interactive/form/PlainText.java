package com.tom_roush.pdfbox.pdmodel.interactive.form;

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
    public final List f60703a;

    /* loaded from: classes5.dex */
    public static class TextAttribute extends AttributedCharacterIterator.Attribute {
        public static final AttributedCharacterIterator.Attribute WIDTH = new TextAttribute("width");
        private static final long serialVersionUID = -3138885145941283005L;

        public TextAttribute(String str) {
            super(str);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText$a */
    /* loaded from: classes5.dex */
    public static class C9961a {

        /* renamed from: a */
        public final List f60704a = new ArrayList();

        /* renamed from: b */
        public float f60705b;

        /* renamed from: a */
        public void m32227a(C9963c c9963c) {
            this.f60704a.add(c9963c);
        }

        /* renamed from: b */
        public float m32226b(PDFont pDFont, float f) {
            float f2 = f / 1000.0f;
            float f3 = 0.0f;
            int i = 0;
            for (C9963c c9963c : this.f60704a) {
                f3 += ((Float) c9963c.m32219a().getIterator().getAttribute(TextAttribute.WIDTH)).floatValue();
                String m32218b = c9963c.m32218b();
                if (i == this.f60704a.size() - 1 && Character.isWhitespace(m32218b.charAt(m32218b.length() - 1))) {
                    f3 -= pDFont.getStringWidth(m32218b.substring(m32218b.length() - 1)) * f2;
                }
                i++;
            }
            return f3;
        }

        /* renamed from: c */
        public float m32225c(float f) {
            return (f - this.f60705b) / (this.f60704a.size() - 1);
        }

        /* renamed from: d */
        public float m32224d() {
            return this.f60705b;
        }

        /* renamed from: e */
        public List m32223e() {
            return this.f60704a;
        }

        /* renamed from: f */
        public void m32222f(float f) {
            this.f60705b = f;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText$b */
    /* loaded from: classes5.dex */
    public static class C9962b {

        /* renamed from: a */
        public final String f60706a;

        public C9962b(String str) {
            this.f60706a = str;
        }

        /* renamed from: a */
        public List m32221a(PDFont pDFont, float f, float f2) {
            String substring;
            BreakIterator lineInstance = BreakIterator.getLineInstance();
            lineInstance.setText(this.f60706a);
            float f3 = f / 1000.0f;
            int first = lineInstance.first();
            int next = lineInstance.next();
            ArrayList arrayList = new ArrayList();
            C9961a c9961a = new C9961a();
            float f4 = 0.0f;
            while (next != -1) {
                String substring2 = this.f60706a.substring(first, next);
                float stringWidth = pDFont.getStringWidth(substring2) * f3;
                int i = next - first;
                f4 += stringWidth;
                boolean z = true;
                if (f4 >= f2 && Character.isWhitespace(substring2.charAt(substring2.length() - 1))) {
                    f4 -= pDFont.getStringWidth(substring2.substring(substring2.length() - 1)) * f3;
                }
                if (f4 >= f2 && !c9961a.m32223e().isEmpty()) {
                    c9961a.m32222f(c9961a.m32226b(pDFont, f));
                    arrayList.add(c9961a);
                    c9961a = new C9961a();
                    f4 = pDFont.getStringWidth(substring2) * f3;
                }
                if (stringWidth > f2 && c9961a.m32223e().isEmpty()) {
                    do {
                        i--;
                        substring = substring2.substring(0, i);
                    } while (pDFont.getStringWidth(substring) * f3 >= f2);
                    stringWidth = pDFont.getStringWidth(substring) * f3;
                    substring2 = substring;
                    f4 = stringWidth;
                } else {
                    z = false;
                }
                AttributedString attributedString = new AttributedString(substring2);
                attributedString.addAttribute(TextAttribute.WIDTH, Float.valueOf(stringWidth));
                C9963c c9963c = new C9963c(substring2);
                c9963c.m32217c(attributedString);
                c9961a.m32227a(c9963c);
                if (z) {
                    first += i;
                } else {
                    int i2 = next;
                    next = lineInstance.next();
                    first = i2;
                }
            }
            c9961a.m32222f(c9961a.m32226b(pDFont, f));
            arrayList.add(c9961a);
            return arrayList;
        }

        /* renamed from: b */
        public String m32220b() {
            return this.f60706a;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText$c */
    /* loaded from: classes5.dex */
    public static class C9963c {

        /* renamed from: a */
        public AttributedString f60707a;

        /* renamed from: b */
        public final String f60708b;

        public C9963c(String str) {
            this.f60708b = str;
        }

        /* renamed from: a */
        public AttributedString m32219a() {
            return this.f60707a;
        }

        /* renamed from: b */
        public String m32218b() {
            return this.f60708b;
        }

        /* renamed from: c */
        public void m32217c(AttributedString attributedString) {
            this.f60707a = attributedString;
        }
    }

    public PlainText(String str) {
        if (str.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            this.f60703a = arrayList;
            arrayList.add(new C9962b(""));
            return;
        }
        String[] split = str.replace('\t', TokenParser.f74560SP).split("\\r\\n|\\n|\\r|\\u2028|\\u2029");
        this.f60703a = new ArrayList(split.length);
        for (String str2 : split) {
            if (str2.length() == 0) {
                str2 = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
            }
            this.f60703a.add(new C9962b(str2));
        }
    }

    /* renamed from: a */
    public List m32228a() {
        return this.f60703a;
    }
}
