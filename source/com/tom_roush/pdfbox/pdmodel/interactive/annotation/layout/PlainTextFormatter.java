package com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout;

import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout.PlainText;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class PlainTextFormatter {

    /* renamed from: a */
    public final AppearanceStyle f60606a;

    /* renamed from: b */
    public final boolean f60607b;

    /* renamed from: c */
    public final float f60608c;

    /* renamed from: d */
    public final PDAppearanceContentStream f60609d;

    /* renamed from: e */
    public final PlainText f60610e;

    /* renamed from: f */
    public final TextAlign f60611f;

    /* renamed from: g */
    public float f60612g;

    /* renamed from: h */
    public float f60613h;

    /* loaded from: classes5.dex */
    public static class Builder {

        /* renamed from: a */
        public PDAppearanceContentStream f60614a;

        /* renamed from: b */
        public AppearanceStyle f60615b;

        /* renamed from: e */
        public PlainText f60618e;

        /* renamed from: c */
        public boolean f60616c = false;

        /* renamed from: d */
        public float f60617d = 0.0f;

        /* renamed from: f */
        public TextAlign f60619f = TextAlign.LEFT;

        /* renamed from: g */
        public float f60620g = 0.0f;

        /* renamed from: h */
        public float f60621h = 0.0f;

        public Builder(PDAppearanceContentStream pDAppearanceContentStream) {
            this.f60614a = pDAppearanceContentStream;
        }

        public PlainTextFormatter build() {
            return new PlainTextFormatter(this, null);
        }

        public Builder initialOffset(float f, float f2) {
            this.f60620g = f;
            this.f60621h = f2;
            return this;
        }

        public Builder style(AppearanceStyle appearanceStyle) {
            this.f60615b = appearanceStyle;
            return this;
        }

        public Builder text(PlainText plainText) {
            this.f60618e = plainText;
            return this;
        }

        public Builder textAlign(int i) {
            this.f60619f = TextAlign.valueOf(i);
            return this;
        }

        public Builder width(float f) {
            this.f60617d = f;
            return this;
        }

        public Builder wrapLines(boolean z) {
            this.f60616c = z;
            return this;
        }

        public Builder textAlign(TextAlign textAlign) {
            this.f60619f = textAlign;
            return this;
        }
    }

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

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C9956a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60622a;

        static {
            int[] iArr = new int[TextAlign.values().length];
            f60622a = iArr;
            try {
                iArr[TextAlign.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60622a[TextAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60622a[TextAlign.JUSTIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public /* synthetic */ PlainTextFormatter(Builder builder, C9956a c9956a) {
        this(builder);
    }

    /* renamed from: a */
    public final void m32297a(List list, boolean z) {
        Iterator it = list.iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            PlainText.C9953a c9953a = (PlainText.C9953a) it.next();
            int i = C9956a.f60622a[this.f60611f.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        f2 = 0.0f;
                    } else if (list.indexOf(c9953a) != list.size() - 1) {
                        f3 = c9953a.m32306c(this.f60608c);
                    }
                } else {
                    f2 = this.f60608c - c9953a.m32305d();
                }
            } else {
                f2 = (this.f60608c - c9953a.m32305d()) / 2.0f;
            }
            float f4 = (-f) + f2 + this.f60612g;
            if (list.indexOf(c9953a) == 0 && z) {
                this.f60609d.newLineAtOffset(f4, this.f60613h);
            } else {
                this.f60613h -= this.f60606a.m32310c();
                this.f60609d.newLineAtOffset(f4, -this.f60606a.m32310c());
            }
            f += f4;
            List<PlainText.C9955c> m32304e = c9953a.m32304e();
            int i2 = 0;
            for (PlainText.C9955c c9955c : m32304e) {
                this.f60609d.showText(c9955c.m32299b());
                float floatValue = ((Float) c9955c.m32300a().getIterator().getAttribute(PlainText.TextAttribute.WIDTH)).floatValue();
                if (i2 != m32304e.size() - 1) {
                    this.f60609d.newLineAtOffset(floatValue + f3, 0.0f);
                    f = f + floatValue + f3;
                }
                i2++;
            }
        }
        this.f60612g -= f;
    }

    public void format() throws IOException {
        PlainText plainText = this.f60610e;
        if (plainText != null && !plainText.m32309a().isEmpty()) {
            boolean z = true;
            for (PlainText.C9954b c9954b : this.f60610e.m32309a()) {
                if (this.f60607b) {
                    m32297a(c9954b.m32302a(this.f60606a.m32312a(), this.f60606a.m32311b(), this.f60608c), z);
                    z = false;
                } else {
                    float stringWidth = (this.f60606a.m32312a().getStringWidth(c9954b.m32301b()) * this.f60606a.m32311b()) / 1000.0f;
                    float f = 0.0f;
                    if (stringWidth < this.f60608c) {
                        int i = C9956a.f60622a[this.f60611f.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                f = this.f60608c - stringWidth;
                            }
                        } else {
                            f = (this.f60608c - stringWidth) / 2.0f;
                        }
                    }
                    this.f60609d.newLineAtOffset(this.f60612g + f, this.f60613h);
                    this.f60609d.showText(c9954b.m32301b());
                }
            }
        }
    }

    public PlainTextFormatter(Builder builder) {
        this.f60606a = builder.f60615b;
        this.f60607b = builder.f60616c;
        this.f60608c = builder.f60617d;
        this.f60609d = builder.f60614a;
        this.f60610e = builder.f60618e;
        this.f60611f = builder.f60619f;
        this.f60612g = builder.f60620g;
        this.f60613h = builder.f60621h;
    }
}
