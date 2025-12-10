package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class StateSet {
    public static final String TAG = "ConstraintLayoutStates";

    /* renamed from: a */
    public int f33456a = -1;

    /* renamed from: b */
    public int f33457b = -1;

    /* renamed from: c */
    public int f33458c = -1;

    /* renamed from: d */
    public SparseArray f33459d = new SparseArray();

    /* renamed from: e */
    public SparseArray f33460e = new SparseArray();

    /* renamed from: f */
    public ConstraintsChangedListener f33461f = null;

    /* renamed from: androidx.constraintlayout.widget.StateSet$a */
    /* loaded from: classes2.dex */
    public static class C3775a {

        /* renamed from: a */
        public int f33462a;

        /* renamed from: b */
        public ArrayList f33463b = new ArrayList();

        /* renamed from: c */
        public int f33464c;

        /* renamed from: d */
        public boolean f33465d;

        public C3775a(Context context, XmlPullParser xmlPullParser) {
            this.f33464c = -1;
            this.f33465d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f33462a = obtainStyledAttributes.getResourceId(index, this.f33462a);
                } else if (index == R.styleable.State_constraints) {
                    this.f33464c = obtainStyledAttributes.getResourceId(index, this.f33464c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33464c);
                    context.getResources().getResourceName(this.f33464c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f33465d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m57994a(C3776b c3776b) {
            this.f33463b.add(c3776b);
        }

        /* renamed from: b */
        public int m57993b(float f, float f2) {
            for (int i = 0; i < this.f33463b.size(); i++) {
                if (((C3776b) this.f33463b.get(i)).m57992a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.StateSet$b */
    /* loaded from: classes2.dex */
    public static class C3776b {

        /* renamed from: a */
        public float f33466a;

        /* renamed from: b */
        public float f33467b;

        /* renamed from: c */
        public float f33468c;

        /* renamed from: d */
        public float f33469d;

        /* renamed from: e */
        public int f33470e;

        /* renamed from: f */
        public boolean f33471f;

        public C3776b(Context context, XmlPullParser xmlPullParser) {
            this.f33466a = Float.NaN;
            this.f33467b = Float.NaN;
            this.f33468c = Float.NaN;
            this.f33469d = Float.NaN;
            this.f33470e = -1;
            this.f33471f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.f33470e = obtainStyledAttributes.getResourceId(index, this.f33470e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33470e);
                    context.getResources().getResourceName(this.f33470e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f33471f = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f33469d = obtainStyledAttributes.getDimension(index, this.f33469d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f33467b = obtainStyledAttributes.getDimension(index, this.f33467b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f33468c = obtainStyledAttributes.getDimension(index, this.f33468c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f33466a = obtainStyledAttributes.getDimension(index, this.f33466a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m57992a(float f, float f2) {
            if (!Float.isNaN(this.f33466a) && f < this.f33466a) {
                return false;
            }
            if (!Float.isNaN(this.f33467b) && f2 < this.f33467b) {
                return false;
            }
            if (!Float.isNaN(this.f33468c) && f > this.f33468c) {
                return false;
            }
            if (!Float.isNaN(this.f33469d) && f2 > this.f33469d) {
                return false;
            }
            return true;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) {
        m57995a(context, xmlPullParser);
    }

    /* renamed from: a */
    public final void m57995a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.StateSet_defaultState) {
                this.f33456a = obtainStyledAttributes.getResourceId(index, this.f33456a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            C3775a c3775a = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlPullParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c != 2) {
                                if (c == 3) {
                                    C3776b c3776b = new C3776b(context, xmlPullParser);
                                    if (c3775a != null) {
                                        c3775a.m57994a(c3776b);
                                    }
                                }
                            } else {
                                c3775a = new C3775a(context, xmlPullParser);
                                this.f33459d.put(c3775a.f33462a, c3775a);
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public int convertToConstraintSet(int i, int i2, float f, float f2) {
        C3775a c3775a = (C3775a) this.f33459d.get(i2);
        if (c3775a == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            Iterator it = c3775a.f33463b.iterator();
            C3776b c3776b = null;
            while (it.hasNext()) {
                C3776b c3776b2 = (C3776b) it.next();
                if (c3776b2.m57992a(f, f2)) {
                    if (i == c3776b2.f33470e) {
                        return i;
                    }
                    c3776b = c3776b2;
                }
            }
            if (c3776b != null) {
                return c3776b.f33470e;
            }
            return c3775a.f33464c;
        } else if (c3775a.f33464c == i) {
            return i;
        } else {
            Iterator it2 = c3775a.f33463b.iterator();
            while (it2.hasNext()) {
                if (i == ((C3776b) it2.next()).f33470e) {
                    return i;
                }
            }
            return c3775a.f33464c;
        }
    }

    public boolean needsToChange(int i, float f, float f2) {
        Object obj;
        int i2 = this.f33457b;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            obj = this.f33459d.valueAt(0);
        } else {
            obj = this.f33459d.get(i2);
        }
        C3775a c3775a = (C3775a) obj;
        int i3 = this.f33458c;
        if ((i3 == -1 || !((C3776b) c3775a.f33463b.get(i3)).m57992a(f, f2)) && this.f33458c != c3775a.m57993b(f, f2)) {
            return true;
        }
        return false;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.f33461f = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i, int i2, int i3) {
        return updateConstraints(-1, i, i2, i3);
    }

    public int updateConstraints(int i, int i2, float f, float f2) {
        C3775a c3775a;
        if (i == i2) {
            if (i2 == -1) {
                c3775a = (C3775a) this.f33459d.valueAt(0);
            } else {
                c3775a = (C3775a) this.f33459d.get(this.f33457b);
            }
            if (c3775a == null) {
                return -1;
            }
            if (this.f33458c != -1 && ((C3776b) c3775a.f33463b.get(i)).m57992a(f, f2)) {
                return i;
            }
            int m57993b = c3775a.m57993b(f, f2);
            if (i == m57993b) {
                return i;
            }
            if (m57993b == -1) {
                return c3775a.f33464c;
            }
            return ((C3776b) c3775a.f33463b.get(m57993b)).f33470e;
        }
        C3775a c3775a2 = (C3775a) this.f33459d.get(i2);
        if (c3775a2 == null) {
            return -1;
        }
        int m57993b2 = c3775a2.m57993b(f, f2);
        if (m57993b2 == -1) {
            return c3775a2.f33464c;
        }
        return ((C3776b) c3775a2.f33463b.get(m57993b2)).f33470e;
    }
}