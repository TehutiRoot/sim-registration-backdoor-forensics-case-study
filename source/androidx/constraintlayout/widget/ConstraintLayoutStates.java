package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class ConstraintLayoutStates {
    public static final String TAG = "ConstraintLayoutStates";

    /* renamed from: a */
    public final ConstraintLayout f33285a;

    /* renamed from: b */
    public ConstraintSet f33286b;

    /* renamed from: c */
    public int f33287c = -1;

    /* renamed from: d */
    public int f33288d = -1;

    /* renamed from: e */
    public SparseArray f33289e = new SparseArray();

    /* renamed from: f */
    public SparseArray f33290f = new SparseArray();

    /* renamed from: g */
    public ConstraintsChangedListener f33291g = null;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$a */
    /* loaded from: classes2.dex */
    public static class C3780a {

        /* renamed from: a */
        public int f33292a;

        /* renamed from: b */
        public ArrayList f33293b = new ArrayList();

        /* renamed from: c */
        public int f33294c;

        /* renamed from: d */
        public ConstraintSet f33295d;

        public C3780a(Context context, XmlPullParser xmlPullParser) {
            this.f33294c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f33292a = obtainStyledAttributes.getResourceId(index, this.f33292a);
                } else if (index == R.styleable.State_constraints) {
                    this.f33294c = obtainStyledAttributes.getResourceId(index, this.f33294c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33294c);
                    context.getResources().getResourceName(this.f33294c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f33295d = constraintSet;
                        constraintSet.clone(context, this.f33294c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m58128a(C3781b c3781b) {
            this.f33293b.add(c3781b);
        }

        /* renamed from: b */
        public int m58127b(float f, float f2) {
            for (int i = 0; i < this.f33293b.size(); i++) {
                if (((C3781b) this.f33293b.get(i)).m58126a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$b */
    /* loaded from: classes2.dex */
    public static class C3781b {

        /* renamed from: a */
        public float f33296a;

        /* renamed from: b */
        public float f33297b;

        /* renamed from: c */
        public float f33298c;

        /* renamed from: d */
        public float f33299d;

        /* renamed from: e */
        public int f33300e;

        /* renamed from: f */
        public ConstraintSet f33301f;

        public C3781b(Context context, XmlPullParser xmlPullParser) {
            this.f33296a = Float.NaN;
            this.f33297b = Float.NaN;
            this.f33298c = Float.NaN;
            this.f33299d = Float.NaN;
            this.f33300e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.f33300e = obtainStyledAttributes.getResourceId(index, this.f33300e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33300e);
                    context.getResources().getResourceName(this.f33300e);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f33301f = constraintSet;
                        constraintSet.clone(context, this.f33300e);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f33299d = obtainStyledAttributes.getDimension(index, this.f33299d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f33297b = obtainStyledAttributes.getDimension(index, this.f33297b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f33298c = obtainStyledAttributes.getDimension(index, this.f33298c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f33296a = obtainStyledAttributes.getDimension(index, this.f33296a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m58126a(float f, float f2) {
            if (!Float.isNaN(this.f33296a) && f < this.f33296a) {
                return false;
            }
            if (!Float.isNaN(this.f33297b) && f2 < this.f33297b) {
                return false;
            }
            if (!Float.isNaN(this.f33298c) && f > this.f33298c) {
                return false;
            }
            if (!Float.isNaN(this.f33299d) && f2 > this.f33299d) {
                return false;
            }
            return true;
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        this.f33285a = constraintLayout;
        m58130a(context, i);
    }

    /* renamed from: a */
    public final void m58130a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C3780a c3780a = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
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
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c = 0;
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
                                if (c != 3) {
                                    if (c != 4) {
                                        continue;
                                    } else {
                                        m58129b(context, xml);
                                        continue;
                                    }
                                } else {
                                    C3781b c3781b = new C3781b(context, xml);
                                    if (c3780a != null) {
                                        c3780a.m58128a(c3781b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                c3780a = new C3780a(context, xml);
                                this.f33289e.put(c3780a.f33292a, c3780a);
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
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

    /* renamed from: b */
    public final void m58129b(Context context, XmlPullParser xmlPullParser) {
        int i;
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1 && attributeValue.length() > 1) {
                    i = Integer.parseInt(attributeValue.substring(1));
                }
                constraintSet.load(context, xmlPullParser);
                this.f33290f.put(i, constraintSet);
                return;
            }
        }
    }

    public boolean needsToChange(int i, float f, float f2) {
        Object obj;
        int i2 = this.f33287c;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            obj = this.f33289e.valueAt(0);
        } else {
            obj = this.f33289e.get(i2);
        }
        C3780a c3780a = (C3780a) obj;
        int i3 = this.f33288d;
        if ((i3 == -1 || !((C3781b) c3780a.f33293b.get(i3)).m58126a(f, f2)) && this.f33288d != c3780a.m58127b(f, f2)) {
            return true;
        }
        return false;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.f33291g = constraintsChangedListener;
    }

    public void updateConstraints(int i, float f, float f2) {
        ConstraintSet constraintSet;
        int i2;
        C3780a c3780a;
        int m58127b;
        ConstraintSet constraintSet2;
        int i3;
        int i4 = this.f33287c;
        if (i4 == i) {
            if (i == -1) {
                c3780a = (C3780a) this.f33289e.valueAt(0);
            } else {
                c3780a = (C3780a) this.f33289e.get(i4);
            }
            int i5 = this.f33288d;
            if ((i5 != -1 && ((C3781b) c3780a.f33293b.get(i5)).m58126a(f, f2)) || this.f33288d == (m58127b = c3780a.m58127b(f, f2))) {
                return;
            }
            if (m58127b == -1) {
                constraintSet2 = this.f33286b;
            } else {
                constraintSet2 = ((C3781b) c3780a.f33293b.get(m58127b)).f33301f;
            }
            if (m58127b == -1) {
                i3 = c3780a.f33294c;
            } else {
                i3 = ((C3781b) c3780a.f33293b.get(m58127b)).f33300e;
            }
            if (constraintSet2 == null) {
                return;
            }
            this.f33288d = m58127b;
            ConstraintsChangedListener constraintsChangedListener = this.f33291g;
            if (constraintsChangedListener != null) {
                constraintsChangedListener.preLayoutChange(-1, i3);
            }
            constraintSet2.applyTo(this.f33285a);
            ConstraintsChangedListener constraintsChangedListener2 = this.f33291g;
            if (constraintsChangedListener2 != null) {
                constraintsChangedListener2.postLayoutChange(-1, i3);
                return;
            }
            return;
        }
        this.f33287c = i;
        C3780a c3780a2 = (C3780a) this.f33289e.get(i);
        int m58127b2 = c3780a2.m58127b(f, f2);
        if (m58127b2 == -1) {
            constraintSet = c3780a2.f33295d;
        } else {
            constraintSet = ((C3781b) c3780a2.f33293b.get(m58127b2)).f33301f;
        }
        if (m58127b2 == -1) {
            i2 = c3780a2.f33294c;
        } else {
            i2 = ((C3781b) c3780a2.f33293b.get(m58127b2)).f33300e;
        }
        if (constraintSet == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(i);
            sb.append(", dim =");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            return;
        }
        this.f33288d = m58127b2;
        ConstraintsChangedListener constraintsChangedListener3 = this.f33291g;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i, i2);
        }
        constraintSet.applyTo(this.f33285a);
        ConstraintsChangedListener constraintsChangedListener4 = this.f33291g;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i, i2);
        }
    }
}
