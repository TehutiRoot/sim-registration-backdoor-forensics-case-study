package com.tom_roush.fontbox.cff;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.tom_roush.fontbox.encoding.StandardEncoding;
import com.tom_roush.fontbox.type1.Type1CharStringReader;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class Type1CharString {

    /* renamed from: a */
    public Type1CharStringReader f59314a;

    /* renamed from: b */
    public final String f59315b;

    /* renamed from: c */
    public final String f59316c;
    protected int commandCount;

    /* renamed from: d */
    public Path f59317d;

    /* renamed from: e */
    public int f59318e;

    /* renamed from: f */
    public PointF f59319f;

    /* renamed from: g */
    public PointF f59320g;

    /* renamed from: h */
    public boolean f59321h;

    /* renamed from: i */
    public final List f59322i;
    protected List<Object> type1Sequence;

    /* renamed from: com.tom_roush.fontbox.cff.Type1CharString$a */
    /* loaded from: classes5.dex */
    public class C9867a extends CharStringHandler {
        public C9867a() {
        }

        @Override // com.tom_roush.fontbox.cff.CharStringHandler
        public List handleCommand(List list, CharStringCommand charStringCommand) {
            return Type1CharString.this.m33019d(list, charStringCommand);
        }
    }

    public Type1CharString(Type1CharStringReader type1CharStringReader, String str, String str2, List<Object> list) {
        this(type1CharStringReader, str, str2);
        this.type1Sequence = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public List m33019d(List list, CharStringCommand charStringCommand) {
        this.commandCount++;
        String str = CharStringCommand.TYPE1_VOCABULARY.get(charStringCommand.getKey());
        if ("rmoveto".equals(str)) {
            if (list.size() >= 2) {
                if (this.f59321h) {
                    this.f59322i.add(new PointF(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue()));
                    return null;
                }
                m33016g((Number) list.get(0), (Number) list.get(1));
                return null;
            }
            return null;
        } else if ("vmoveto".equals(str)) {
            if (!list.isEmpty()) {
                if (this.f59321h) {
                    this.f59322i.add(new PointF(0.0f, ((Number) list.get(0)).floatValue()));
                    return null;
                }
                m33016g(0, (Number) list.get(0));
                return null;
            }
            return null;
        } else if ("hmoveto".equals(str)) {
            if (!list.isEmpty()) {
                if (this.f59321h) {
                    this.f59322i.add(new PointF(((Number) list.get(0)).floatValue(), 0.0f));
                    return null;
                }
                m33016g((Number) list.get(0), 0);
                return null;
            }
            return null;
        } else if ("rlineto".equals(str)) {
            if (list.size() >= 2) {
                m33017f((Number) list.get(0), (Number) list.get(1));
                return null;
            }
            return null;
        } else if ("hlineto".equals(str)) {
            if (!list.isEmpty()) {
                m33017f((Number) list.get(0), 0);
                return null;
            }
            return null;
        } else if ("vlineto".equals(str)) {
            if (!list.isEmpty()) {
                m33017f(0, (Number) list.get(0));
                return null;
            }
            return null;
        } else if ("rrcurveto".equals(str)) {
            if (list.size() >= 6) {
                m33015h((Number) list.get(0), (Number) list.get(1), (Number) list.get(2), (Number) list.get(3), (Number) list.get(4), (Number) list.get(5));
                return null;
            }
            return null;
        } else if ("closepath".equals(str)) {
            m33020c();
            return null;
        } else if ("sbw".equals(str)) {
            if (list.size() >= 3) {
                this.f59319f = new PointF(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
                this.f59318e = ((Number) list.get(2)).intValue();
                this.f59320g.set(this.f59319f);
                return null;
            }
            return null;
        } else if ("hsbw".equals(str)) {
            if (list.size() >= 2) {
                this.f59319f = new PointF(((Number) list.get(0)).floatValue(), 0.0f);
                this.f59318e = ((Number) list.get(1)).intValue();
                this.f59320g.set(this.f59319f);
                return null;
            }
            return null;
        } else if ("vhcurveto".equals(str)) {
            if (list.size() >= 4) {
                m33015h(0, (Number) list.get(0), (Number) list.get(1), (Number) list.get(2), (Number) list.get(3), 0);
                return null;
            }
            return null;
        } else if ("hvcurveto".equals(str)) {
            if (list.size() >= 4) {
                m33015h((Number) list.get(0), 0, (Number) list.get(1), (Number) list.get(2), 0, (Number) list.get(3));
                return null;
            }
            return null;
        } else if ("seac".equals(str)) {
            if (list.size() >= 5) {
                m33014i((Number) list.get(0), (Number) list.get(1), (Number) list.get(2), (Number) list.get(3), (Number) list.get(4));
                return null;
            }
            return null;
        } else if ("setcurrentpoint".equals(str)) {
            if (list.size() >= 2) {
                m33013j((Number) list.get(0), (Number) list.get(1));
                return null;
            }
            return null;
        } else if ("callothersubr".equals(str)) {
            if (!list.isEmpty()) {
                m33021b(((Number) list.get(0)).intValue());
                return null;
            }
            return null;
        } else if ("div".equals(str)) {
            float floatValue = ((Number) list.get(list.size() - 2)).floatValue() / ((Number) list.get(list.size() - 1)).floatValue();
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(Float.valueOf(floatValue));
            return arrayList;
        } else if (!"hstem".equals(str) && !"vstem".equals(str) && !"hstem3".equals(str) && !"vstem3".equals(str) && !"dotsection".equals(str) && !"endchar".equals(str)) {
            if (!"return".equals(str) && !"callsubr".equals(str)) {
                if (str == null) {
                    Log.w("PdfBox-Android", "Unknown charstring command: " + charStringCommand.getKey() + " in glyph " + this.f59316c + " of font " + this.f59315b);
                    return null;
                }
                throw new IllegalArgumentException("Unhandled command: " + str);
            }
            Log.w("PdfBox-Android", "Unexpected charstring command: " + str + " in glyph " + this.f59316c + " of font " + this.f59315b);
            return null;
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public final void m33021b(int i) {
        if (i == 0) {
            this.f59321h = false;
            if (this.f59322i.size() < 7) {
                Log.w("PdfBox-Android", "flex without moveTo in font " + this.f59315b + ", glyph " + this.f59316c + ", command " + this.commandCount);
                return;
            }
            PointF pointF = (PointF) this.f59322i.get(0);
            PointF pointF2 = this.f59320g;
            pointF.set(pointF2.x + pointF.x, pointF2.y + pointF.y);
            PointF pointF3 = (PointF) this.f59322i.get(1);
            pointF3.set(pointF.x + pointF3.x, pointF.y + pointF3.y);
            float f = pointF3.x;
            PointF pointF4 = this.f59320g;
            pointF3.set(f - pointF4.x, pointF3.y - pointF4.y);
            PointF pointF5 = (PointF) this.f59322i.get(1);
            PointF pointF6 = (PointF) this.f59322i.get(2);
            PointF pointF7 = (PointF) this.f59322i.get(3);
            m33015h(Float.valueOf(pointF5.x), Float.valueOf(pointF5.y), Float.valueOf(pointF6.x), Float.valueOf(pointF6.y), Float.valueOf(pointF7.x), Float.valueOf(pointF7.y));
            PointF pointF8 = (PointF) this.f59322i.get(4);
            PointF pointF9 = (PointF) this.f59322i.get(5);
            PointF pointF10 = (PointF) this.f59322i.get(6);
            m33015h(Float.valueOf(pointF8.x), Float.valueOf(pointF8.y), Float.valueOf(pointF9.x), Float.valueOf(pointF9.y), Float.valueOf(pointF10.x), Float.valueOf(pointF10.y));
            this.f59322i.clear();
        } else if (i == 1) {
            this.f59321h = true;
        } else {
            Log.w("PdfBox-Android", "Invalid callothersubr parameter: " + i);
        }
    }

    /* renamed from: c */
    public final void m33020c() {
        if (this.f59317d.isEmpty()) {
            Log.w("PdfBox-Android", "closepath without initial moveTo in font " + this.f59315b + ", glyph " + this.f59316c);
        } else {
            this.f59317d.close();
        }
        Path path = this.f59317d;
        PointF pointF = this.f59320g;
        path.moveTo(pointF.x, pointF.y);
    }

    /* renamed from: e */
    public final void m33018e() {
        this.f59317d = new Path();
        this.f59319f = new PointF(0.0f, 0.0f);
        this.f59318e = 0;
        new C9867a().handleSequence(this.type1Sequence);
    }

    /* renamed from: f */
    public final void m33017f(Number number, Number number2) {
        float floatValue = this.f59320g.x + number.floatValue();
        float floatValue2 = this.f59320g.y + number2.floatValue();
        if (this.f59317d.isEmpty()) {
            Log.w("PdfBox-Android", "rlineTo without initial moveTo in font " + this.f59315b + ", glyph " + this.f59316c);
            this.f59317d.moveTo(floatValue, floatValue2);
        } else {
            this.f59317d.lineTo(floatValue, floatValue2);
        }
        this.f59320g.set(floatValue, floatValue2);
    }

    /* renamed from: g */
    public final void m33016g(Number number, Number number2) {
        float floatValue = this.f59320g.x + number.floatValue();
        float floatValue2 = this.f59320g.y + number2.floatValue();
        this.f59317d.moveTo(floatValue, floatValue2);
        this.f59320g.set(floatValue, floatValue2);
    }

    public RectF getBounds() {
        if (this.f59317d == null) {
            m33018e();
        }
        RectF rectF = new RectF();
        this.f59317d.computeBounds(rectF, true);
        return rectF;
    }

    public String getName() {
        return this.f59316c;
    }

    public Path getPath() {
        if (this.f59317d == null) {
            m33018e();
        }
        return this.f59317d;
    }

    public List<Object> getType1Sequence() {
        return this.type1Sequence;
    }

    public int getWidth() {
        if (this.f59317d == null) {
            m33018e();
        }
        return this.f59318e;
    }

    /* renamed from: h */
    public final void m33015h(Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
        float floatValue = this.f59320g.x + number.floatValue();
        float floatValue2 = this.f59320g.y + number2.floatValue();
        float floatValue3 = floatValue + number3.floatValue();
        float floatValue4 = floatValue2 + number4.floatValue();
        float floatValue5 = number5.floatValue() + floatValue3;
        float floatValue6 = number6.floatValue() + floatValue4;
        if (this.f59317d.isEmpty()) {
            Log.w("PdfBox-Android", "rrcurveTo without initial moveTo in font " + this.f59315b + ", glyph " + this.f59316c);
            this.f59317d.moveTo(floatValue5, floatValue6);
        } else {
            this.f59317d.cubicTo(floatValue, floatValue2, floatValue3, floatValue4, floatValue5, floatValue6);
        }
        this.f59320g.set(floatValue5, floatValue6);
    }

    /* renamed from: i */
    public final void m33014i(Number number, Number number2, Number number3, Number number4, Number number5) {
        try {
            this.f59317d.op(this.f59314a.getType1CharString(StandardEncoding.INSTANCE.getName(number4.intValue())).getPath(), Path.Op.UNION);
        } catch (IOException unused) {
            Log.w("PdfBox-Android", "invalid seac character in glyph " + this.f59316c + " of font " + this.f59315b);
        }
        try {
            Type1CharString type1CharString = this.f59314a.getType1CharString(StandardEncoding.INSTANCE.getName(number5.intValue()));
            AffineTransform.getTranslateInstance((this.f59319f.x + number2.floatValue()) - number.floatValue(), this.f59319f.y + number3.floatValue());
            this.f59317d.op(type1CharString.getPath(), Path.Op.UNION);
        } catch (IOException unused2) {
            Log.w("PdfBox-Android", "invalid seac character in glyph " + this.f59316c + " of font " + this.f59315b);
        }
    }

    /* renamed from: j */
    public final void m33013j(Number number, Number number2) {
        this.f59320g.set(number.floatValue(), number2.floatValue());
    }

    public String toString() {
        return this.type1Sequence.toString().replace("|", "\n").replace(",", HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
    }

    public Type1CharString(Type1CharStringReader type1CharStringReader, String str, String str2) {
        this.f59317d = null;
        this.f59318e = 0;
        this.f59319f = null;
        this.f59320g = null;
        this.f59321h = false;
        this.f59322i = new ArrayList();
        this.f59314a = type1CharStringReader;
        this.f59315b = str;
        this.f59316c = str2;
        this.f59320g = new PointF(0.0f, 0.0f);
    }
}
