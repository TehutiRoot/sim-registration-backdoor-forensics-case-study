package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class PlainTextFormatter {

    /* renamed from: a */
    public final C10428i6 f60721a;

    /* renamed from: b */
    public final boolean f60722b;

    /* renamed from: c */
    public final float f60723c;

    /* renamed from: d */
    public final PDPageContentStream f60724d;

    /* renamed from: e */
    public final PlainText f60725e;

    /* renamed from: f */
    public final TextAlign f60726f;

    /* renamed from: g */
    public float f60727g;

    /* renamed from: h */
    public float f60728h;

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
    public static /* synthetic */ class C9953a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60729a;

        static {
            int[] iArr = new int[TextAlign.values().length];
            f60729a = iArr;
            try {
                iArr[TextAlign.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60729a[TextAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60729a[TextAlign.JUSTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PlainTextFormatter$b */
    /* loaded from: classes5.dex */
    public static class C9954b {

        /* renamed from: a */
        public PDPageContentStream f60730a;

        /* renamed from: b */
        public C10428i6 f60731b;

        /* renamed from: e */
        public PlainText f60734e;

        /* renamed from: c */
        public boolean f60732c = false;

        /* renamed from: d */
        public float f60733d = 0.0f;

        /* renamed from: f */
        public TextAlign f60735f = TextAlign.LEFT;

        /* renamed from: g */
        public float f60736g = 0.0f;

        /* renamed from: h */
        public float f60737h = 0.0f;

        public C9954b(PDPageContentStream pDPageContentStream) {
            this.f60730a = pDPageContentStream;
        }

        /* renamed from: i */
        public PlainTextFormatter m32198i() {
            return new PlainTextFormatter(this, null);
        }

        /* renamed from: j */
        public C9954b m32197j(float f, float f2) {
            this.f60736g = f;
            this.f60737h = f2;
            return this;
        }

        /* renamed from: k */
        public C9954b m32196k(C10428i6 c10428i6) {
            this.f60731b = c10428i6;
            return this;
        }

        /* renamed from: l */
        public C9954b m32195l(PlainText plainText) {
            this.f60734e = plainText;
            return this;
        }

        /* renamed from: m */
        public C9954b m32194m(int i) {
            this.f60735f = TextAlign.valueOf(i);
            return this;
        }

        /* renamed from: n */
        public C9954b m32193n(float f) {
            this.f60733d = f;
            return this;
        }

        /* renamed from: o */
        public C9954b m32192o(boolean z) {
            this.f60732c = z;
            return this;
        }
    }

    public /* synthetic */ PlainTextFormatter(C9954b c9954b, C9953a c9953a) {
        this(c9954b);
    }

    /* renamed from: a */
    public void m32208a() {
        PlainText plainText = this.f60725e;
        if (plainText != null && !plainText.m32220a().isEmpty()) {
            boolean z = true;
            for (PlainText.C9951b c9951b : this.f60725e.m32220a()) {
                if (this.f60722b) {
                    m32207b(c9951b.m32213a(this.f60721a.m31046a(), this.f60721a.m31045b(), this.f60723c), z);
                    z = false;
                } else {
                    float stringWidth = (this.f60721a.m31046a().getStringWidth(c9951b.m32212b()) * this.f60721a.m31045b()) / 1000.0f;
                    float f = 0.0f;
                    if (stringWidth < this.f60723c) {
                        int i = C9953a.f60729a[this.f60726f.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                f = this.f60723c - stringWidth;
                            }
                        } else {
                            f = (this.f60723c - stringWidth) / 2.0f;
                        }
                    }
                    this.f60724d.newLineAtOffset(this.f60727g + f, this.f60728h);
                    this.f60724d.showText(c9951b.m32212b());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m32207b(List list, boolean z) {
        Iterator it = list.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            PlainText.C9950a c9950a = (PlainText.C9950a) it.next();
            int i = C9953a.f60729a[this.f60726f.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        f2 = 0.0f;
                    } else if (list.indexOf(c9950a) != list.size() - 1) {
                        f3 = c9950a.m32217c(this.f60723c);
                    }
                } else {
                    f2 = this.f60723c - c9950a.m32216d();
                }
            } else {
                f2 = (this.f60723c - c9950a.m32216d()) / 2.0f;
            }
            float f4 = (-f) + f2 + this.f60727g;
            if (list.indexOf(c9950a) == 0 && z) {
                this.f60724d.newLineAtOffset(f4, this.f60728h);
            } else {
                this.f60728h -= this.f60721a.m31044c();
                this.f60724d.newLineAtOffset(f4, -this.f60721a.m31044c());
            }
            f += f4;
            List<PlainText.C9952c> m32215e = c9950a.m32215e();
            int i2 = 0;
            for (PlainText.C9952c c9952c : m32215e) {
                this.f60724d.showText(c9952c.m32210b());
                float floatValue = ((Float) c9952c.m32211a().getIterator().getAttribute(PlainText.TextAttribute.WIDTH)).floatValue();
                if (i2 != m32215e.size() - 1) {
                    this.f60724d.newLineAtOffset(floatValue + f3, 0.0f);
                    f = f + floatValue + f3;
                }
                i2++;
            }
        }
        this.f60727g -= f;
    }

    public PlainTextFormatter(C9954b c9954b) {
        this.f60721a = c9954b.f60731b;
        this.f60722b = c9954b.f60732c;
        this.f60723c = c9954b.f60733d;
        this.f60724d = c9954b.f60730a;
        this.f60725e = c9954b.f60734e;
        this.f60726f = c9954b.f60735f;
        this.f60727g = c9954b.f60736g;
        this.f60728h = c9954b.f60737h;
    }
}