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
    public final ConstraintLayout f33373a;

    /* renamed from: b */
    public ConstraintSet f33374b;

    /* renamed from: c */
    public int f33375c = -1;

    /* renamed from: d */
    public int f33376d = -1;

    /* renamed from: e */
    public SparseArray f33377e = new SparseArray();

    /* renamed from: f */
    public SparseArray f33378f = new SparseArray();

    /* renamed from: g */
    public ConstraintsChangedListener f33379g = null;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$a */
    /* loaded from: classes2.dex */
    public static class C3762a {

        /* renamed from: a */
        public int f33380a;

        /* renamed from: b */
        public ArrayList f33381b = new ArrayList();

        /* renamed from: c */
        public int f33382c;

        /* renamed from: d */
        public ConstraintSet f33383d;

        public C3762a(Context context, XmlPullParser xmlPullParser) {
            this.f33382c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.f33380a = obtainStyledAttributes.getResourceId(index, this.f33380a);
                } else if (index == R.styleable.State_constraints) {
                    this.f33382c = obtainStyledAttributes.getResourceId(index, this.f33382c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33382c);
                    context.getResources().getResourceName(this.f33382c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f33383d = constraintSet;
                        constraintSet.clone(context, this.f33382c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m58078a(C3763b c3763b) {
            this.f33381b.add(c3763b);
        }

        /* renamed from: b */
        public int m58077b(float f, float f2) {
            for (int i = 0; i < this.f33381b.size(); i++) {
                if (((C3763b) this.f33381b.get(i)).m58076a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$b */
    /* loaded from: classes2.dex */
    public static class C3763b {

        /* renamed from: a */
        public float f33384a;

        /* renamed from: b */
        public float f33385b;

        /* renamed from: c */
        public float f33386c;

        /* renamed from: d */
        public float f33387d;

        /* renamed from: e */
        public int f33388e;

        /* renamed from: f */
        public ConstraintSet f33389f;

        public C3763b(Context context, XmlPullParser xmlPullParser) {
            this.f33384a = Float.NaN;
            this.f33385b = Float.NaN;
            this.f33386c = Float.NaN;
            this.f33387d = Float.NaN;
            this.f33388e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.f33388e = obtainStyledAttributes.getResourceId(index, this.f33388e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f33388e);
                    context.getResources().getResourceName(this.f33388e);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f33389f = constraintSet;
                        constraintSet.clone(context, this.f33388e);
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.f33387d = obtainStyledAttributes.getDimension(index, this.f33387d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.f33385b = obtainStyledAttributes.getDimension(index, this.f33385b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.f33386c = obtainStyledAttributes.getDimension(index, this.f33386c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.f33384a = obtainStyledAttributes.getDimension(index, this.f33384a);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m58076a(float f, float f2) {
            if (!Float.isNaN(this.f33384a) && f < this.f33384a) {
                return false;
            }
            if (!Float.isNaN(this.f33385b) && f2 < this.f33385b) {
                return false;
            }
            if (!Float.isNaN(this.f33386c) && f > this.f33386c) {
                return false;
            }
            if (!Float.isNaN(this.f33387d) && f2 > this.f33387d) {
                return false;
            }
            return true;
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        this.f33373a = constraintLayout;
        m58080a(context, i);
    }

    /* renamed from: a */
    public final void m58080a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C3762a c3762a = null;
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
                                        m58079b(context, xml);
                                        continue;
                                    }
                                } else {
                                    C3763b c3763b = new C3763b(context, xml);
                                    if (c3762a != null) {
                                        c3762a.m58078a(c3763b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                c3762a = new C3762a(context, xml);
                                this.f33377e.put(c3762a.f33380a, c3762a);
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
    public final void m58079b(Context context, XmlPullParser xmlPullParser) {
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
                this.f33378f.put(i, constraintSet);
                return;
            }
        }
    }

    public boolean needsToChange(int i, float f, float f2) {
        Object obj;
        int i2 = this.f33375c;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            obj = this.f33377e.valueAt(0);
        } else {
            obj = this.f33377e.get(i2);
        }
        C3762a c3762a = (C3762a) obj;
        int i3 = this.f33376d;
        if ((i3 == -1 || !((C3763b) c3762a.f33381b.get(i3)).m58076a(f, f2)) && this.f33376d != c3762a.m58077b(f, f2)) {
            return true;
        }
        return false;
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.f33379g = constraintsChangedListener;
    }

    public void updateConstraints(int i, float f, float f2) {
        ConstraintSet constraintSet;
        int i2;
        C3762a c3762a;
        int m58077b;
        ConstraintSet constraintSet2;
        int i3;
        int i4 = this.f33375c;
        if (i4 == i) {
            if (i == -1) {
                c3762a = (C3762a) this.f33377e.valueAt(0);
            } else {
                c3762a = (C3762a) this.f33377e.get(i4);
            }
            int i5 = this.f33376d;
            if ((i5 != -1 && ((C3763b) c3762a.f33381b.get(i5)).m58076a(f, f2)) || this.f33376d == (m58077b = c3762a.m58077b(f, f2))) {
                return;
            }
            if (m58077b == -1) {
                constraintSet2 = this.f33374b;
            } else {
                constraintSet2 = ((C3763b) c3762a.f33381b.get(m58077b)).f33389f;
            }
            if (m58077b == -1) {
                i3 = c3762a.f33382c;
            } else {
                i3 = ((C3763b) c3762a.f33381b.get(m58077b)).f33388e;
            }
            if (constraintSet2 == null) {
                return;
            }
            this.f33376d = m58077b;
            ConstraintsChangedListener constraintsChangedListener = this.f33379g;
            if (constraintsChangedListener != null) {
                constraintsChangedListener.preLayoutChange(-1, i3);
            }
            constraintSet2.applyTo(this.f33373a);
            ConstraintsChangedListener constraintsChangedListener2 = this.f33379g;
            if (constraintsChangedListener2 != null) {
                constraintsChangedListener2.postLayoutChange(-1, i3);
                return;
            }
            return;
        }
        this.f33375c = i;
        C3762a c3762a2 = (C3762a) this.f33377e.get(i);
        int m58077b2 = c3762a2.m58077b(f, f2);
        if (m58077b2 == -1) {
            constraintSet = c3762a2.f33383d;
        } else {
            constraintSet = ((C3763b) c3762a2.f33381b.get(m58077b2)).f33389f;
        }
        if (m58077b2 == -1) {
            i2 = c3762a2.f33382c;
        } else {
            i2 = ((C3763b) c3762a2.f33381b.get(m58077b2)).f33388e;
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
        this.f33376d = m58077b2;
        ConstraintsChangedListener constraintsChangedListener3 = this.f33379g;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i, i2);
        }
        constraintSet.applyTo(this.f33373a);
        ConstraintsChangedListener constraintsChangedListener4 = this.f33379g;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i, i2);
        }
    }
}