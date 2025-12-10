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
    public final List f60715a;

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
    public static class C9950a {

        /* renamed from: a */
        public final List f60716a = new ArrayList();

        /* renamed from: b */
        public float f60717b;

        /* renamed from: a */
        public void m32219a(C9952c c9952c) {
            this.f60716a.add(c9952c);
        }

        /* renamed from: b */
        public float m32218b(PDFont pDFont, float f) {
            float f2 = f / 1000.0f;
            float f3 = 0.0f;
            int i = 0;
            for (C9952c c9952c : this.f60716a) {
                f3 += ((Float) c9952c.m32211a().getIterator().getAttribute(TextAttribute.WIDTH)).floatValue();
                String m32210b = c9952c.m32210b();
                if (i == this.f60716a.size() - 1 && Character.isWhitespace(m32210b.charAt(m32210b.length() - 1))) {
                    f3 -= pDFont.getStringWidth(m32210b.substring(m32210b.length() - 1)) * f2;
                }
                i++;
            }
            return f3;
        }

        /* renamed from: c */
        public float m32217c(float f) {
            return (f - this.f60717b) / (this.f60716a.size() - 1);
        }

        /* renamed from: d */
        public float m32216d() {
            return this.f60717b;
        }

        /* renamed from: e */
        public List m32215e() {
            return this.f60716a;
        }

        /* renamed from: f */
        public void m32214f(float f) {
            this.f60717b = f;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText$b */
    /* loaded from: classes5.dex */
    public static class C9951b {

        /* renamed from: a */
        public final String f60718a;

        public C9951b(String str) {
            this.f60718a = str;
        }

        /* renamed from: a */
        public List m32213a(PDFont pDFont, float f, float f2) {
            String substring;
            BreakIterator lineInstance = BreakIterator.getLineInstance();
            lineInstance.setText(this.f60718a);
            float f3 = f / 1000.0f;
            int first = lineInstance.first();
            int next = lineInstance.next();
            ArrayList arrayList = new ArrayList();
            C9950a c9950a = new C9950a();
            float f4 = 0.0f;
            while (next != -1) {
                String substring2 = this.f60718a.substring(first, next);
                float stringWidth = pDFont.getStringWidth(substring2) * f3;
                int i = next - first;
                f4 += stringWidth;
                boolean z = true;
                if (f4 >= f2 && Character.isWhitespace(substring2.charAt(substring2.length() - 1))) {
                    f4 -= pDFont.getStringWidth(substring2.substring(substring2.length() - 1)) * f3;
                }
                if (f4 >= f2 && !c9950a.m32215e().isEmpty()) {
                    c9950a.m32214f(c9950a.m32218b(pDFont, f));
                    arrayList.add(c9950a);
                    c9950a = new C9950a();
                    f4 = pDFont.getStringWidth(substring2) * f3;
                }
                if (stringWidth > f2 && c9950a.m32215e().isEmpty()) {
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
                C9952c c9952c = new C9952c(substring2);
                c9952c.m32209c(attributedString);
                c9950a.m32219a(c9952c);
                if (z) {
                    first += i;
                } else {
                    int i2 = next;
                    next = lineInstance.next();
                    first = i2;
                }
            }
            c9950a.m32214f(c9950a.m32218b(pDFont, f));
            arrayList.add(c9950a);
            return arrayList;
        }

        /* renamed from: b */
        public String m32212b() {
            return this.f60718a;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText$c */
    /* loaded from: classes5.dex */
    public static class C9952c {

        /* renamed from: a */
        public AttributedString f60719a;

        /* renamed from: b */
        public final String f60720b;

        public C9952c(String str) {
            this.f60720b = str;
        }

        /* renamed from: a */
        public AttributedString m32211a() {
            return this.f60719a;
        }

        /* renamed from: b */
        public String m32210b() {
            return this.f60720b;
        }

        /* renamed from: c */
        public void m32209c(AttributedString attributedString) {
            this.f60719a = attributedString;
        }
    }

    public PlainText(String str) {
        if (str.isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            this.f60715a = arrayList;
            arrayList.add(new C9951b(""));
            return;
        }
        String[] split = str.replace('\t', TokenParser.f74644SP).split("\\r\\n|\\n|\\r|\\u2028|\\u2029");
        this.f60715a = new ArrayList(split.length);
        for (String str2 : split) {
            if (str2.length() == 0) {
                str2 = HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
            }
            this.f60715a.add(new C9951b(str2));
        }
    }

    /* renamed from: a */
    public List m32220a() {
        return this.f60715a;
    }
}