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
    public int f33368a = -1;

    /* renamed from: b */
    public int f33369b = -1;

    /* renamed from: c */
    public int f33370c = -1;

    /* renamed from: d */
    public SparseArray f33371d = new SparseArray();

    /* renamed from: e */
    public SparseArray f33372e = new SparseArray();

    /* renamed from: f */
    public ConstraintsChangedListener f33373f = null;

    /* renamed from: androidx.constraintlayout.widget.StateSet$a */
    /* loaded from: classes2.dex */
    public static class C3793a {

        /* renamed from: a */
        public int f33374a;

        /* renamed from: b */
        public ArrayList f33375b = new ArrayList();

        /* renamed from: c */
        public int f33376c;

        /* renamed from: d */
        public boolean f33377d;

        public C3793a(Context context, XmlPullParser xmlPullParser) {
            this.f33376c = -1;
            this.f33377d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f33374a = obtainStyledAttributes.getResourceId(index, this.f33374a);
                } else if (index == R.styleable.State_constraints) {
                    this.f33376c = obtainStyledAttributes.getResourceId(index, this.f33376c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33376c);
                    context.getResources().getResourceName(this.f33376c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f33377d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m58044a(C3794b c3794b) {
            this.f33375b.add(c3794b);
        }

        /* renamed from: b */
        public int m58043b(float f, float f2) {
            for (int i = 0; i < this.f33375b.size(); i++) {
                if (((C3794b) this.f33375b.get(i)).m58042a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.StateSet$b */
    /* loaded from: classes2.dex */
    public static class C3794b {

        /* renamed from: a */
        public float f33378a;

        /* renamed from: b */
        public float f33379b;

        /* renamed from: c */
        public float f33380c;

        /* renamed from: d */
        public float f33381d;

        /* renamed from: e */
        public int f33382e;

        /* renamed from: f */
        public boolean f33383f;

        public C3794b(Context context, XmlPullParser xmlPullParser) {
            this.f33378a = Float.NaN;
            this.f33379b = Float.NaN;
            this.f33380c = Float.NaN;
            this.f33381d = Float.NaN;
            this.f33382e = -1;
            this.f33383f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.f33382e = obtainStyledAttributes.getResourceId(index, this.f33382e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33382e);
                    context.getResources().getResourceName(this.f33382e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f33383f = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f33381d = obtainStyledAttributes.getDimension(index, this.f33381d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f33379b = obtainStyledAttributes.getDimension(index, this.f33379b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f33380c = obtainStyledAttributes.getDimension(index, this.f33380c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f33378a = obtainStyledAttributes.getDimension(index, this.f33378a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m58042a(float f, float f2) {
            if (!Float.isNaN(this.f33378a) && f < this.f33378a) {
                return false;
            }
            if (!Float.isNaN(this.f33379b) && f2 < this.f33379b) {
                return false;
            }
            if (!Float.isNaN(this.f33380c) && f > this.f33380c) {
                return false;
            }
            if (!Float.isNaN(this.f33381d) && f2 > this.f33381d) {
                return false;
            }
            return true;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) {
        m58045a(context, xmlPullParser);
    }

    /* renamed from: a */
    public final void m58045a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.StateSet_defaultState) {
                this.f33368a = obtainStyledAttributes.getResourceId(index, this.f33368a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            C3793a c3793a = null;
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
                                    C3794b c3794b = new C3794b(context, xmlPullParser);
                                    if (c3793a != null) {
                                        c3793a.m58044a(c3794b);
                                    }
                                }
                            } else {
                                c3793a = new C3793a(context, xmlPullParser);
                                this.f33371d.put(c3793a.f33374a, c3793a);
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
        C3793a c3793a = (C3793a) this.f33371d.get(i2);
        if (c3793a == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            Iterator it = c3793a.f33375b.iterator();
            C3794b c3794b = null;
            while (it.hasNext()) {
                C3794b c3794b2 = (C3794b) it.next();
                if (c3794b2.m58042a(f, f2)) {
                    if (i == c3794b2.f33382e) {
                        return i;
                    }
                    c3794b = c3794b2;
                }
            }
            if (c3794b != null) {
                return c3794b.f33382e;
            }
            return c3793a.f33376c;
        } else if (c3793a.f33376c == i) {
            return i;
        } else {
            Iterator it2 = c3793a.f33375b.iterator();
            while (it2.hasNext()) {
                if (i == ((C3794b) it2.next()).f33382e) {
                    return i;
                }
            }
            return c3793a.f33376c;
        }
    }

    public boolean needsToChange(int i, float f, float f2) {
        Object obj;
        int i2 = this.f33369b;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            obj = this.f33371d.valueAt(0);
        } else {
            obj = this.f33371d.get(i2);
        }
        C3793a c3793a = (C3793a) obj;
        int i3 = this.f33370c;
        if ((i3 == -1 || !((C3794b) c3793a.f33375b.get(i3)).m58042a(f, f2)) && this.f33370c != c3793a.m58043b(f, f2)) {
            return true;
        }
        return false;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.f33373f = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i, int i2, int i3) {
        return updateConstraints(-1, i, i2, i3);
    }

    public int updateConstraints(int i, int i2, float f, float f2) {
        C3793a c3793a;
        if (i == i2) {
            if (i2 == -1) {
                c3793a = (C3793a) this.f33371d.valueAt(0);
            } else {
                c3793a = (C3793a) this.f33371d.get(this.f33369b);
            }
            if (c3793a == null) {
                return -1;
            }
            if (this.f33370c != -1 && ((C3794b) c3793a.f33375b.get(i)).m58042a(f, f2)) {
                return i;
            }
            int m58043b = c3793a.m58043b(f, f2);
            if (i == m58043b) {
                return i;
            }
            if (m58043b == -1) {
                return c3793a.f33376c;
            }
            return ((C3794b) c3793a.f33375b.get(m58043b)).f33382e;
        }
        C3793a c3793a2 = (C3793a) this.f33371d.get(i2);
        if (c3793a2 == null) {
            return -1;
        }
        int m58043b2 = c3793a2.m58043b(f, f2);
        if (m58043b2 == -1) {
            return c3793a2.f33376c;
        }
        return ((C3794b) c3793a2.f33375b.get(m58043b2)).f33382e;
    }
}
