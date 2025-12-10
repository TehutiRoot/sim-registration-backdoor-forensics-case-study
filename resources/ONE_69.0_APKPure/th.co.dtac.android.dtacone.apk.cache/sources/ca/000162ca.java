package p000;

import android.graphics.Path;
import com.tom_roush.fontbox.ttf.GlyphDescription;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: z60  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C23320z60 {

    /* renamed from: a */
    public GlyphDescription f109246a;

    public C23320z60(GlyphDescription glyphDescription) {
        this.f109246a = glyphDescription;
    }

    /* renamed from: a */
    public final Path m202a(C17185a[] c17185aArr) {
        Path path = new Path();
        int length = c17185aArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (c17185aArr[i2].f109250d) {
                C17185a c17185a = c17185aArr[i];
                C17185a c17185a2 = c17185aArr[i2];
                ArrayList arrayList = new ArrayList();
                for (int i3 = i; i3 <= i2; i3++) {
                    arrayList.add(c17185aArr[i3]);
                }
                if (c17185aArr[i].f109249c) {
                    arrayList.add(c17185a);
                } else if (c17185aArr[i2].f109249c) {
                    arrayList.add(0, c17185a2);
                } else {
                    C17185a m197f = m197f(c17185a, c17185a2);
                    arrayList.add(0, m197f);
                    arrayList.add(m197f);
                }
                m196g(path, (C17185a) arrayList.get(0));
                int size = arrayList.size();
                int i4 = 1;
                while (i4 < size) {
                    C17185a c17185a3 = (C17185a) arrayList.get(i4);
                    if (c17185a3.f109249c) {
                        m199d(path, c17185a3);
                    } else {
                        int i5 = i4 + 1;
                        if (((C17185a) arrayList.get(i5)).f109249c) {
                            m195h(path, c17185a3, (C17185a) arrayList.get(i5));
                            i4 = i5;
                        } else {
                            m195h(path, c17185a3, m197f(c17185a3, (C17185a) arrayList.get(i5)));
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
    public final C17185a[] m201b(GlyphDescription glyphDescription) {
        boolean z;
        int pointCount = glyphDescription.getPointCount();
        C17185a[] c17185aArr = new C17185a[pointCount];
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
            c17185aArr[i3] = new C17185a(xCoordinate, yCoordinate, z2, z);
        }
        return c17185aArr;
    }

    /* renamed from: c */
    public Path m200c() {
        return m202a(m201b(this.f109246a));
    }

    /* renamed from: d */
    public final void m199d(Path path, C17185a c17185a) {
        path.lineTo(c17185a.f109247a, c17185a.f109248b);
        if (PDFBoxConfig.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("lineTo: ");
            sb.append(String.format(Locale.US, "%d,%d", Integer.valueOf(c17185a.f109247a), Integer.valueOf(c17185a.f109248b)));
        }
    }

    /* renamed from: e */
    public final int m198e(int i, int i2) {
        return i + ((i2 - i) / 2);
    }

    /* renamed from: f */
    public final C17185a m197f(C17185a c17185a, C17185a c17185a2) {
        return new C17185a(m198e(c17185a.f109247a, c17185a2.f109247a), m198e(c17185a.f109248b, c17185a2.f109248b));
    }

    /* renamed from: g */
    public final void m196g(Path path, C17185a c17185a) {
        path.moveTo(c17185a.f109247a, c17185a.f109248b);
        if (PDFBoxConfig.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveTo: ");
            sb.append(String.format(Locale.US, "%d,%d", Integer.valueOf(c17185a.f109247a), Integer.valueOf(c17185a.f109248b)));
        }
    }

    /* renamed from: h */
    public final void m195h(Path path, C17185a c17185a, C17185a c17185a2) {
        path.quadTo(c17185a.f109247a, c17185a.f109248b, c17185a2.f109247a, c17185a2.f109248b);
        if (PDFBoxConfig.isDebugEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append("quadTo: ");
            sb.append(String.format(Locale.US, "%d,%d %d,%d", Integer.valueOf(c17185a.f109247a), Integer.valueOf(c17185a.f109248b), Integer.valueOf(c17185a2.f109247a), Integer.valueOf(c17185a2.f109248b)));
        }
    }

    /* renamed from: z60$a */
    /* loaded from: classes5.dex */
    public static class C17185a {

        /* renamed from: a */
        public int f109247a;

        /* renamed from: b */
        public int f109248b;

        /* renamed from: c */
        public boolean f109249c;

        /* renamed from: d */
        public boolean f109250d;

        public C17185a(int i, int i2, boolean z, boolean z2) {
            this.f109247a = i;
            this.f109248b = i2;
            this.f109249c = z;
            this.f109250d = z2;
        }

        public String toString() {
            String str;
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(this.f109247a);
            Integer valueOf2 = Integer.valueOf(this.f109248b);
            String str2 = "";
            if (!this.f109249c) {
                str = "";
            } else {
                str = "onCurve";
            }
            if (this.f109250d) {
                str2 = "endOfContour";
            }
            return String.format(locale, "Point(%d,%d,%s,%s)", valueOf, valueOf2, str, str2);
        }

        public C17185a(int i, int i2) {
            this(i, i2, true, false);
        }
    }
}