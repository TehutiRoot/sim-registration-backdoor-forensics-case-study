package p000;

import android.graphics.Path;
import com.tom_roush.fontbox.ttf.GlyphDescription;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: t60  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C22217t60 {

    /* renamed from: a */
    public GlyphDescription f79991a;

    public C22217t60(GlyphDescription glyphDescription) {
        this.f79991a = glyphDescription;
    }

    /* renamed from: a */
    public final Path m22512a(C13975a[] c13975aArr) {
        Path path = new Path();
        int length = c13975aArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (c13975aArr[i2].f79995d) {
                C13975a c13975a = c13975aArr[i];
                C13975a c13975a2 = c13975aArr[i2];
                ArrayList arrayList = new ArrayList();
                for (int i3 = i; i3 <= i2; i3++) {
                    arrayList.add(c13975aArr[i3]);
                }
                if (c13975aArr[i].f79994c) {
                    arrayList.add(c13975a);
                } else if (c13975aArr[i2].f79994c) {
                    arrayList.add(0, c13975a2);
                } else {
                    C13975a m22507f = m22507f(c13975a, c13975a2);
                    arrayList.add(0, m22507f);
                    arrayList.add(m22507f);
                }
                m22506g(path, (C13975a) arrayList.get(0));
                int size = arrayList.size();
                int i4 = 1;
                while (i4 < size) {
                    C13975a c13975a3 = (C13975a) arrayList.get(i4);
                    if (c13975a3.f79994c) {
                        m22509d(path, c13975a3);
                    } else {
                        int i5 = i4 + 1;
                        if (((C13975a) arrayList.get(i5)).f79994c) {
                            m22505h(path, c13975a3, (C13975a) arrayList.get(i5));
                            i4 = i5;
                        } else {
                            m22505h(path, c13975a3, m22507f(c13975a3, (C13975a) arrayList.get(i5)));
                        }
                    }
                    i4++;
                }
                path.close();
                i = i2 + 1;
            }
        }
        return path;
    }

    /* renamed from: b */
    public final C13975a[] m22511b(GlyphDescription glyphDescription) {
        boolean z;
        int pointCount = glyphDescription.getPointCount();
        C13975a[] c13975aArr = new C13975a[pointCount];
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < pointCount; i3++) {
            if (i == -1) {
                i = glyphDescription.getEndPtOfContours(i2);
            }
            boolean z2 = true;
            if (i == i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2++;
                i = -1;
            }
            short xCoordinate = glyphDescription.getXCoordinate(i3);
            short yCoordinate = glyphDescription.getYCoordinate(i3);
            if ((glyphDescription.getFlags(i3) & 1) == 0) {
                z2 = false;
            }
            c13975aArr[i3] = new C13975a(xCoordinate, yCoordinate, z2, z);
        }
        return c13975aArr;
    }

    /* renamed from: c */
    public Path m22510c() {
        return m22512a(m22511b(this.f79991a));
    }

    /* renamed from: d */
    public final void m22509d(Path path, C13975a c13975a) {
        path.lineTo(c13975a.f79992a, c13975a.f79993b);
        if (PDFBoxConfig.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("lineTo: ");
            sb.append(String.format(Locale.US, "%d,%d", Integer.valueOf(c13975a.f79992a), Integer.valueOf(c13975a.f79993b)));
        }
    }

    /* renamed from: e */
    public final int m22508e(int i, int i2) {
        return i + ((i2 - i) / 2);
    }

    /* renamed from: f */
    public final C13975a m22507f(C13975a c13975a, C13975a c13975a2) {
        return new C13975a(m22508e(c13975a.f79992a, c13975a2.f79992a), m22508e(c13975a.f79993b, c13975a2.f79993b));
    }

    /* renamed from: g */
    public final void m22506g(Path path, C13975a c13975a) {
        path.moveTo(c13975a.f79992a, c13975a.f79993b);
        if (PDFBoxConfig.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveTo: ");
            sb.append(String.format(Locale.US, "%d,%d", Integer.valueOf(c13975a.f79992a), Integer.valueOf(c13975a.f79993b)));
        }
    }

    /* renamed from: h */
    public final void m22505h(Path path, C13975a c13975a, C13975a c13975a2) {
        path.quadTo(c13975a.f79992a, c13975a.f79993b, c13975a2.f79992a, c13975a2.f79993b);
        if (PDFBoxConfig.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("quadTo: ");
            sb.append(String.format(Locale.US, "%d,%d %d,%d", Integer.valueOf(c13975a.f79992a), Integer.valueOf(c13975a.f79993b), Integer.valueOf(c13975a2.f79992a), Integer.valueOf(c13975a2.f79993b)));
        }
    }

    /* renamed from: t60$a */
    /* loaded from: classes5.dex */
    public static class C13975a {

        /* renamed from: a */
        public int f79992a;

        /* renamed from: b */
        public int f79993b;

        /* renamed from: c */
        public boolean f79994c;

        /* renamed from: d */
        public boolean f79995d;

        public C13975a(int i, int i2, boolean z, boolean z2) {
            this.f79992a = i;
            this.f79993b = i2;
            this.f79994c = z;
            this.f79995d = z2;
        }

        public String toString() {
            String str;
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(this.f79992a);
            Integer valueOf2 = Integer.valueOf(this.f79993b);
            String str2 = "";
            if (!this.f79994c) {
                str = "";
            } else {
                str = "onCurve";
            }
            if (this.f79995d) {
                str2 = "endOfContour";
            }
            return String.format(locale, "Point(%d,%d,%s,%s)", valueOf, valueOf2, str, str2);
        }

        public C13975a(int i, int i2) {
            this(i, i2, true, false);
        }
    }
}
