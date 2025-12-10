package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class PlainTextFormatter {

    /* renamed from: a */
    public final C10443i6 f60709a;

    /* renamed from: b */
    public final boolean f60710b;

    /* renamed from: c */
    public final float f60711c;

    /* renamed from: d */
    public final PDPageContentStream f60712d;

    /* renamed from: e */
    public final PlainText f60713e;

    /* renamed from: f */
    public final TextAlign f60714f;

    /* renamed from: g */
    public float f60715g;

    /* renamed from: h */
    public float f60716h;

    /* loaded from: classes5.dex */
    public enum TextAlign {
        LEFT(0),
        CENTER(1),
        RIGHT(2),
        JUSTIFY(4);
        
        private final int alignment;

        TextAlign(int i) {
            this.alignment = i;
        }

        public int getTextAlign() {
            return this.alignment;
        }

        public static TextAlign valueOf(int i) {
            TextAlign[] values;
            for (TextAlign textAlign : values()) {
                if (textAlign.getTextAlign() == i) {
                    return textAlign;
                }
            }
            return LEFT;
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainTextFormatter$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9964a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60717a;

        static {
            int[] iArr = new int[TextAlign.values().length];
            f60717a = iArr;
            try {
                iArr[TextAlign.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60717a[TextAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60717a[TextAlign.JUSTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainTextFormatter$b */
    /* loaded from: classes5.dex */
    public static class C9965b {

        /* renamed from: a */
        public PDPageContentStream f60718a;

        /* renamed from: b */
        public C10443i6 f60719b;

        /* renamed from: e */
        public PlainText f60722e;

        /* renamed from: c */
        public boolean f60720c = false;

        /* renamed from: d */
        public float f60721d = 0.0f;

        /* renamed from: f */
        public TextAlign f60723f = TextAlign.LEFT;

        /* renamed from: g */
        public float f60724g = 0.0f;

        /* renamed from: h */
        public float f60725h = 0.0f;

        public C9965b(PDPageContentStream pDPageContentStream) {
            this.f60718a = pDPageContentStream;
        }

        /* renamed from: i */
        public PlainTextFormatter m32206i() {
            return new PlainTextFormatter(this, null);
        }

        /* renamed from: j */
        public C9965b m32205j(float f, float f2) {
            this.f60724g = f;
            this.f60725h = f2;
            return this;
        }

        /* renamed from: k */
        public C9965b m32204k(C10443i6 c10443i6) {
            this.f60719b = c10443i6;
            return this;
        }

        /* renamed from: l */
        public C9965b m32203l(PlainText plainText) {
            this.f60722e = plainText;
            return this;
        }

        /* renamed from: m */
        public C9965b m32202m(int i) {
            this.f60723f = TextAlign.valueOf(i);
            return this;
        }

        /* renamed from: n */
        public C9965b m32201n(float f) {
            this.f60721d = f;
            return this;
        }

        /* renamed from: o */
        public C9965b m32200o(boolean z) {
            this.f60720c = z;
            return this;
        }
    }

    public /* synthetic */ PlainTextFormatter(C9965b c9965b, C9964a c9964a) {
        this(c9965b);
    }

    /* renamed from: a */
    public void m32216a() {
        PlainText plainText = this.f60713e;
        if (plainText != null && !plainText.m32228a().isEmpty()) {
            boolean z = true;
            for (PlainText.C9962b c9962b : this.f60713e.m32228a()) {
                if (this.f60710b) {
                    m32215b(c9962b.m32221a(this.f60709a.m30674a(), this.f60709a.m30673b(), this.f60711c), z);
                    z = false;
                } else {
                    float stringWidth = (this.f60709a.m30674a().getStringWidth(c9962b.m32220b()) * this.f60709a.m30673b()) / 1000.0f;
                    float f = 0.0f;
                    if (stringWidth < this.f60711c) {
                        int i = C9964a.f60717a[this.f60714f.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                f = this.f60711c - stringWidth;
                            }
                        } else {
                            f = (this.f60711c - stringWidth) / 2.0f;
                        }
                    }
                    this.f60712d.newLineAtOffset(this.f60715g + f, this.f60716h);
                    this.f60712d.showText(c9962b.m32220b());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m32215b(List list, boolean z) {
        Iterator it = list.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            PlainText.C9961a c9961a = (PlainText.C9961a) it.next();
            int i = C9964a.f60717a[this.f60714f.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        f2 = 0.0f;
                    } else if (list.indexOf(c9961a) != list.size() - 1) {
                        f3 = c9961a.m32225c(this.f60711c);
                    }
                } else {
                    f2 = this.f60711c - c9961a.m32224d();
                }
            } else {
                f2 = (this.f60711c - c9961a.m32224d()) / 2.0f;
            }
            float f4 = (-f) + f2 + this.f60715g;
            if (list.indexOf(c9961a) == 0 && z) {
                this.f60712d.newLineAtOffset(f4, this.f60716h);
            } else {
                this.f60716h -= this.f60709a.m30672c();
                this.f60712d.newLineAtOffset(f4, -this.f60709a.m30672c());
            }
            f += f4;
            List<PlainText.C9963c> m32223e = c9961a.m32223e();
            int i2 = 0;
            for (PlainText.C9963c c9963c : m32223e) {
                this.f60712d.showText(c9963c.m32218b());
                float floatValue = ((Float) c9963c.m32219a().getIterator().getAttribute(PlainText.TextAttribute.WIDTH)).floatValue();
                if (i2 != m32223e.size() - 1) {
                    this.f60712d.newLineAtOffset(floatValue + f3, 0.0f);
                    f = f + floatValue + f3;
                }
                i2++;
            }
        }
        this.f60715g -= f;
    }

    public PlainTextFormatter(C9965b c9965b) {
        this.f60709a = c9965b.f60719b;
        this.f60710b = c9965b.f60720c;
        this.f60711c = c9965b.f60721d;
        this.f60712d = c9965b.f60718a;
        this.f60713e = c9965b.f60722e;
        this.f60714f = c9965b.f60723f;
        this.f60715g = c9965b.f60724g;
        this.f60716h = c9965b.f60725h;
    }
}
