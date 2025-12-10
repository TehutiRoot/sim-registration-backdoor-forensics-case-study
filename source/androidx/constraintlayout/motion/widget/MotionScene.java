package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class MotionScene {
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final int UNSET = -1;

    /* renamed from: a */
    public final MotionLayout f32956a;

    /* renamed from: n */
    public MotionEvent f32969n;

    /* renamed from: q */
    public MotionLayout.MotionTracker f32972q;

    /* renamed from: r */
    public boolean f32973r;

    /* renamed from: s */
    public final ViewTransitionController f32974s;

    /* renamed from: t */
    public float f32975t;

    /* renamed from: u */
    public float f32976u;

    /* renamed from: b */
    public StateSet f32957b = null;

    /* renamed from: c */
    public Transition f32958c = null;

    /* renamed from: d */
    public boolean f32959d = false;

    /* renamed from: e */
    public ArrayList f32960e = new ArrayList();

    /* renamed from: f */
    public Transition f32961f = null;

    /* renamed from: g */
    public ArrayList f32962g = new ArrayList();

    /* renamed from: h */
    public SparseArray f32963h = new SparseArray();

    /* renamed from: i */
    public HashMap f32964i = new HashMap();

    /* renamed from: j */
    public SparseIntArray f32965j = new SparseIntArray();

    /* renamed from: k */
    public boolean f32966k = false;

    /* renamed from: l */
    public int f32967l = 400;

    /* renamed from: m */
    public int f32968m = 0;

    /* renamed from: o */
    public boolean f32970o = false;

    /* renamed from: p */
    public boolean f32971p = false;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionScene$a  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class animationInterpolatorC3760a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ Easing f32998a;

        public animationInterpolatorC3760a(MotionScene motionScene, Easing easing) {
            this.f32998a = easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f32998a.get(f);
        }
    }

    public MotionScene(MotionLayout motionLayout) {
        this.f32956a = motionLayout;
        this.f32974s = new ViewTransitionController(motionLayout);
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: A */
    public final boolean m58298A() {
        if (this.f32972q != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final void m58297B(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            Transition transition = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            if (this.f32966k) {
                                PrintStream printStream = System.out;
                                printStream.println("parsing = " + name);
                            }
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1239391468:
                                    if (name.equals(ViewTransition.KEY_FRAME_SET_TAG)) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -687739768:
                                    if (name.equals("Include")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 61998586:
                                    if (name.equals(ViewTransition.VIEW_TRANSITION_TAG)) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 269306229:
                                    if (name.equals("Transition")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 312750793:
                                    if (name.equals("OnClick")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 327855227:
                                    if (name.equals("OnSwipe")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 793277014:
                                    if (name.equals(TypedValues.MotionScene.NAME)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1942574248:
                                    if (name.equals("include")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    m58293F(context, xml);
                                    continue;
                                case 1:
                                    ArrayList arrayList = this.f32960e;
                                    transition = new Transition(this, context, xml);
                                    arrayList.add(transition);
                                    if (this.f32958c == null && !transition.f32978b) {
                                        this.f32958c = transition;
                                        if (transition.f32988l != null) {
                                            this.f32958c.f32988l.m58181x(this.f32973r);
                                        }
                                    }
                                    if (transition.f32978b) {
                                        if (transition.f32979c == -1) {
                                            this.f32961f = transition;
                                        } else {
                                            this.f32962g.add(transition);
                                        }
                                        this.f32960e.remove(transition);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 2:
                                    if (transition == null) {
                                        String resourceEntryName = context.getResources().getResourceEntryName(i);
                                        int lineNumber = xml.getLineNumber();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(" OnSwipe (");
                                        sb.append(resourceEntryName);
                                        sb.append(".xml:");
                                        sb.append(lineNumber);
                                        sb.append(")");
                                    }
                                    if (transition != null) {
                                        transition.f32988l = new C3764a(context, this.f32956a, xml);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 3:
                                    if (transition != null) {
                                        transition.addOnClick(context, xml);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 4:
                                    this.f32957b = new StateSet(context, xml);
                                    continue;
                                case 5:
                                    m58296C(context, xml);
                                    continue;
                                case 6:
                                case 7:
                                    m58294E(context, xml);
                                    continue;
                                case '\b':
                                    KeyFrames keyFrames = new KeyFrames(context, xml);
                                    if (transition != null) {
                                        transition.f32987k.add(keyFrames);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case '\t':
                                    this.f32974s.add(new ViewTransition(context, xml));
                                    continue;
                                default:
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: C */
    public final int m58296C(Context context, XmlPullParser xmlPullParser) {
        char c;
        char c2;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (this.f32966k) {
                PrintStream printStream = System.out;
                printStream.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i2 = m58274k(context, attributeValue);
                    continue;
                case 1:
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3387192:
                                if (attributeValue.equals(SchedulerSupport.NONE)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                constraintSet.mRotate = 4;
                                break;
                            case 1:
                                constraintSet.mRotate = 2;
                                break;
                            case 2:
                                constraintSet.mRotate = 0;
                                break;
                            case 3:
                                constraintSet.mRotate = 1;
                                break;
                            case 4:
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case 2:
                    i = m58274k(context, attributeValue);
                    this.f32964i.put(stripID(attributeValue), Integer.valueOf(i));
                    constraintSet.mIdString = Debug.getName(context, i);
                    break;
            }
        }
        if (i != -1) {
            if (this.f32956a.f32870U != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, xmlPullParser);
            if (i2 != -1) {
                this.f32965j.put(i, i2);
            }
            this.f32963h.put(i, constraintSet);
        }
        return i;
    }

    /* renamed from: D */
    public final int m58295D(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m58296C(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: E */
    public final void m58294E(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.include_constraintSet) {
                m58295D(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: F */
    public final void m58293F(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.f32967l);
                this.f32967l = i2;
                if (i2 < 8) {
                    this.f32967l = 8;
                }
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.f32968m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: G */
    public void m58292G(float f, float f2) {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            this.f32958c.f32988l.m58184u(f, f2);
        }
    }

    /* renamed from: H */
    public void m58291H(float f, float f2) {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            this.f32958c.f32988l.m58183v(f, f2);
        }
    }

    /* renamed from: I */
    public void m58290I(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f32972q == null) {
            this.f32972q = this.f32956a.obtainVelocityTracker();
        }
        this.f32972q.addMovement(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action != 0) {
                if (action == 2 && !this.f32970o) {
                    float rawY = motionEvent.getRawY() - this.f32976u;
                    float rawX = motionEvent.getRawX() - this.f32975t;
                    if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f32969n) == null) {
                        return;
                    }
                    Transition bestTransitionFor = bestTransitionFor(i, rawX, rawY, motionEvent2);
                    if (bestTransitionFor != null) {
                        motionLayout.setTransition(bestTransitionFor);
                        RectF m58189p = this.f32958c.f32988l.m58189p(this.f32956a, rectF);
                        if (m58189p != null && !m58189p.contains(this.f32969n.getX(), this.f32969n.getY())) {
                            z = true;
                        }
                        this.f32971p = z;
                        this.f32958c.f32988l.m58179z(this.f32975t, this.f32976u);
                    }
                }
            } else {
                this.f32975t = motionEvent.getRawX();
                this.f32976u = motionEvent.getRawY();
                this.f32969n = motionEvent;
                this.f32970o = false;
                if (this.f32958c.f32988l != null) {
                    RectF m58199f = this.f32958c.f32988l.m58199f(this.f32956a, rectF);
                    if (m58199f != null && !m58199f.contains(this.f32969n.getX(), this.f32969n.getY())) {
                        this.f32969n = null;
                        this.f32970o = true;
                        return;
                    }
                    RectF m58189p2 = this.f32958c.f32988l.m58189p(this.f32956a, rectF);
                    if (m58189p2 != null && !m58189p2.contains(this.f32969n.getX(), this.f32969n.getY())) {
                        this.f32971p = true;
                    } else {
                        this.f32971p = false;
                    }
                    this.f32958c.f32988l.m58182w(this.f32975t, this.f32976u);
                    return;
                }
                return;
            }
        }
        if (this.f32970o) {
            return;
        }
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null && !this.f32971p) {
            this.f32958c.f32988l.m58186s(motionEvent, this.f32972q, i, this);
        }
        this.f32975t = motionEvent.getRawX();
        this.f32976u = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (motionTracker = this.f32972q) != null) {
            motionTracker.recycle();
            this.f32972q = null;
            int i2 = motionLayout.f32834C;
            if (i2 != -1) {
                m58279f(motionLayout, i2);
            }
        }
    }

    /* renamed from: J */
    public final void m58289J(int i, MotionLayout motionLayout) {
        ConstraintSet constraintSet = (ConstraintSet) this.f32963h.get(i);
        constraintSet.derivedState = constraintSet.mIdString;
        int i2 = this.f32965j.get(i);
        if (i2 > 0) {
            m58289J(i2, motionLayout);
            ConstraintSet constraintSet2 = (ConstraintSet) this.f32963h.get(i2);
            if (constraintSet2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb.append(Debug.getName(this.f32956a.getContext(), i2));
                return;
            }
            constraintSet.derivedState += RemoteSettings.FORWARD_SLASH_STRING + constraintSet2.derivedState;
            constraintSet.readFallback(constraintSet2);
        } else {
            constraintSet.derivedState += "  layout";
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    /* renamed from: K */
    public void m58288K(MotionLayout motionLayout) {
        for (int i = 0; i < this.f32963h.size(); i++) {
            int keyAt = this.f32963h.keyAt(i);
            if (m58260y(keyAt)) {
                return;
            }
            m58289J(keyAt, motionLayout);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m58287L(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.StateSet r0 = r6.f32957b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.stateGetConstraintID(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.StateSet r2 = r6.f32957b
            int r2 = r2.stateGetConstraintID(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r8
            goto L1a
        L18:
            r0 = r7
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.f32958c
            if (r3 == 0) goto L2d
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58258a(r3)
            if (r3 != r8) goto L2d
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.f32958c
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58256c(r3)
            if (r3 != r7) goto L2d
            return
        L2d:
            java.util.ArrayList r3 = r6.f32960e
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58258a(r4)
            if (r5 != r2) goto L4b
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58256c(r4)
            if (r5 == r0) goto L57
        L4b:
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58258a(r4)
            if (r5 != r8) goto L33
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58256c(r4)
            if (r5 != r7) goto L33
        L57:
            r6.f32958c = r4
            if (r4 == 0) goto L6c
            androidx.constraintlayout.motion.widget.a r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58247l(r4)
            if (r7 == 0) goto L6c
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.f32958c
            androidx.constraintlayout.motion.widget.a r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58247l(r7)
            boolean r8 = r6.f32973r
            r7.m58181x(r8)
        L6c:
            return
        L6d:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.f32961f
            java.util.ArrayList r3 = r6.f32962g
            java.util.Iterator r3 = r3.iterator()
        L75:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = androidx.constraintlayout.motion.widget.MotionScene.Transition.m58258a(r4)
            if (r5 != r8) goto L75
            r7 = r4
            goto L75
        L89:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.m58255d(r8, r0)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.m58257b(r8, r2)
            if (r0 == r1) goto L9b
            java.util.ArrayList r7 = r6.f32960e
            r7.add(r8)
        L9b:
            r6.f32958c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.m58287L(int, int):void");
    }

    /* renamed from: M */
    public void m58286M() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            this.f32958c.f32988l.m58205A();
        }
    }

    /* renamed from: N */
    public boolean m58285N() {
        Iterator it = this.f32960e.iterator();
        while (it.hasNext()) {
            if (((Transition) it.next()).f32988l != null) {
                return true;
            }
        }
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return true;
        }
        return false;
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i) {
        Iterator it = this.f32960e.iterator();
        while (it.hasNext()) {
            Transition transition = (Transition) it.next();
            if (transition.f32989m.size() > 0) {
                Iterator it2 = transition.f32989m.iterator();
                while (it2.hasNext()) {
                    ((Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator it3 = this.f32962g.iterator();
        while (it3.hasNext()) {
            Transition transition2 = (Transition) it3.next();
            if (transition2.f32989m.size() > 0) {
                Iterator it4 = transition2.f32989m.iterator();
                while (it4.hasNext()) {
                    ((Transition.TransitionOnClick) it4.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator it5 = this.f32960e.iterator();
        while (it5.hasNext()) {
            Transition transition3 = (Transition) it5.next();
            if (transition3.f32989m.size() > 0) {
                Iterator it6 = transition3.f32989m.iterator();
                while (it6.hasNext()) {
                    ((Transition.TransitionOnClick) it6.next()).addOnClickListeners(motionLayout, i, transition3);
                }
            }
        }
        Iterator it7 = this.f32962g.iterator();
        while (it7.hasNext()) {
            Transition transition4 = (Transition) it7.next();
            if (transition4.f32989m.size() > 0) {
                Iterator it8 = transition4.f32989m.iterator();
                while (it8.hasNext()) {
                    ((Transition.TransitionOnClick) it8.next()).addOnClickListeners(motionLayout, i, transition4);
                }
            }
        }
    }

    public void addTransition(Transition transition) {
        int m58273l = m58273l(transition);
        if (m58273l == -1) {
            this.f32960e.add(transition);
        } else {
            this.f32960e.set(m58273l, transition);
        }
    }

    public boolean applyViewTransition(int i, MotionController motionController) {
        return this.f32974s.m58214d(i, motionController);
    }

    public Transition bestTransitionFor(int i, float f, float f2, MotionEvent motionEvent) {
        float f3;
        if (i != -1) {
            List<Transition> transitionsWithState = getTransitionsWithState(i);
            RectF rectF = new RectF();
            float f4 = 0.0f;
            Transition transition = null;
            for (Transition transition2 : transitionsWithState) {
                if (!transition2.f32991o && transition2.f32988l != null) {
                    transition2.f32988l.m58181x(this.f32973r);
                    RectF m58189p = transition2.f32988l.m58189p(this.f32956a, rectF);
                    if (m58189p == null || motionEvent == null || m58189p.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF m58199f = transition2.f32988l.m58199f(this.f32956a, rectF);
                        if (m58199f == null || motionEvent == null || m58199f.contains(motionEvent.getX(), motionEvent.getY())) {
                            float m58204a = transition2.f32988l.m58204a(f, f2);
                            if (transition2.f32988l.f33086l && motionEvent != null) {
                                float x = motionEvent.getX() - transition2.f32988l.f33083i;
                                float y = motionEvent.getY() - transition2.f32988l.f33084j;
                                m58204a = ((float) (Math.atan2(f2 + y, f + x) - Math.atan2(x, y))) * 10.0f;
                            }
                            if (transition2.f32979c == i) {
                                f3 = -1.0f;
                            } else {
                                f3 = 1.1f;
                            }
                            float f5 = m58204a * f3;
                            if (f5 > f4) {
                                transition = transition2;
                                f4 = f5;
                            }
                        }
                    }
                }
            }
            return transition;
        }
        return this.f32958c;
    }

    public void disableAutoTransition(boolean z) {
        this.f32959d = z;
    }

    public void enableViewTransition(int i, boolean z) {
        this.f32974s.m58213e(i, z);
    }

    /* renamed from: f */
    public boolean m58279f(MotionLayout motionLayout, int i) {
        Transition transition;
        if (m58298A() || this.f32959d) {
            return false;
        }
        Iterator it = this.f32960e.iterator();
        while (it.hasNext()) {
            Transition transition2 = (Transition) it.next();
            if (transition2.f32990n != 0 && ((transition = this.f32958c) != transition2 || !transition.isTransitionFlag(2))) {
                if (i == transition2.f32980d && (transition2.f32990n == 4 || transition2.f32990n == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition2);
                    if (transition2.f32990n == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.m58362O(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.m58353X();
                    }
                    return true;
                } else if (i == transition2.f32979c && (transition2.f32990n == 3 || transition2.f32990n == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(transition2);
                    if (transition2.f32990n == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.m58362O(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.m58353X();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public int m58278g() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58201d();
        }
        return 0;
    }

    public int gatPathMotionArc() {
        Transition transition = this.f32958c;
        if (transition != null) {
            return transition.f32992p;
        }
        return -1;
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
        if (this.f32966k) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            printStream.println("size " + this.f32963h.size());
        }
        for (int i = 0; i < this.f32963h.size(); i++) {
            int keyAt = this.f32963h.keyAt(i);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f32966k) {
                PrintStream printStream2 = System.out;
                printStream2.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return (ConstraintSet) this.f32963h.get(keyAt);
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.f32963h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f32963h.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.f32960e;
    }

    public int getDuration() {
        Transition transition = this.f32958c;
        if (transition != null) {
            return transition.f32984h;
        }
        return this.f32967l;
    }

    public Interpolator getInterpolator() {
        int i = this.f32958c.f32981e;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animationInterpolatorC3760a(this, Easing.getInterpolator(this.f32958c.f32982f));
        }
        return AnimationUtils.loadInterpolator(this.f32956a.getContext(), this.f32958c.f32983g);
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.f32958c;
        if (transition == null) {
            Transition transition2 = this.f32961f;
            if (transition2 != null) {
                Iterator it = transition2.f32987k.iterator();
                while (it.hasNext()) {
                    ((KeyFrames) it.next()).addFrames(motionController);
                }
                return;
            }
            return;
        }
        Iterator it2 = transition.f32987k.iterator();
        while (it2.hasNext()) {
            ((KeyFrames) it2.next()).addFrames(motionController);
        }
    }

    public float getPathPercent(View view, int i) {
        return 0.0f;
    }

    public float getStaggered() {
        Transition transition = this.f32958c;
        if (transition != null) {
            return transition.f32985i;
        }
        return 0.0f;
    }

    public Transition getTransitionById(int i) {
        Iterator it = this.f32960e.iterator();
        while (it.hasNext()) {
            Transition transition = (Transition) it.next();
            if (transition.f32977a == i) {
                return transition;
            }
        }
        return null;
    }

    public List<Transition> getTransitionsWithState(int i) {
        int m58267r = m58267r(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f32960e.iterator();
        while (it.hasNext()) {
            Transition transition = (Transition) it.next();
            if (transition.f32980d == m58267r || transition.f32979c == m58267r) {
                arrayList.add(transition);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public ConstraintSet m58277h(int i) {
        return m58276i(i, -1, -1);
    }

    /* renamed from: i */
    public ConstraintSet m58276i(int i, int i2, int i3) {
        int stateGetConstraintID;
        if (this.f32966k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            printStream.println("size " + this.f32963h.size());
        }
        StateSet stateSet = this.f32957b;
        if (stateSet != null && (stateGetConstraintID = stateSet.stateGetConstraintID(i, i2, i3)) != -1) {
            i = stateGetConstraintID;
        }
        if (this.f32963h.get(i) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Warning could not find ConstraintSet id/");
            sb.append(Debug.getName(this.f32956a.getContext(), i));
            sb.append(" In MotionScene");
            SparseArray sparseArray = this.f32963h;
            return (ConstraintSet) sparseArray.get(sparseArray.keyAt(0));
        }
        return (ConstraintSet) this.f32963h.get(i);
    }

    public boolean isViewTransitionEnabled(int i) {
        return this.f32974s.m58211g(i);
    }

    /* renamed from: j */
    public int m58275j() {
        Transition transition = this.f32958c;
        if (transition != null) {
            return transition.f32979c;
        }
        return -1;
    }

    /* renamed from: k */
    public final int m58274k(Context context, String str) {
        int i;
        if (str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f32966k) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i == -1 && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        return i;
    }

    /* renamed from: l */
    public final int m58273l(Transition transition) {
        int i = transition.f32977a;
        if (i != -1) {
            for (int i2 = 0; i2 < this.f32960e.size(); i2++) {
                if (((Transition) this.f32960e.get(i2)).f32977a == i) {
                    return i2;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public int lookUpConstraintId(String str) {
        Integer num = (Integer) this.f32964i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int i) {
        for (Map.Entry entry : this.f32964i.entrySet()) {
            Integer num = (Integer) entry.getValue();
            if (num != null && num.intValue() == i) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: m */
    public Key m58272m(Context context, int i, int i2, int i3) {
        Transition transition = this.f32958c;
        if (transition == null) {
            return null;
        }
        Iterator it = transition.f32987k.iterator();
        while (it.hasNext()) {
            KeyFrames keyFrames = (KeyFrames) it.next();
            for (Integer num : keyFrames.getKeys()) {
                if (i2 == num.intValue()) {
                    Iterator<Key> it2 = keyFrames.getKeyFramesForView(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        Key next = it2.next();
                        if (next.f32689a == i3 && next.mType == i) {
                            return next;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    public float m58271n() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58198g();
        }
        return 0.0f;
    }

    /* renamed from: o */
    public float m58270o() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58197h();
        }
        return 0.0f;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* renamed from: p */
    public boolean m58269p() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58196i();
        }
        return false;
    }

    /* renamed from: q */
    public float m58268q(float f, float f2) {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58195j(f, f2);
        }
        return 0.0f;
    }

    /* renamed from: r */
    public final int m58267r(int i) {
        int stateGetConstraintID;
        StateSet stateSet = this.f32957b;
        if (stateSet != null && (stateGetConstraintID = stateSet.stateGetConstraintID(i, -1, -1)) != -1) {
            return stateGetConstraintID;
        }
        return i;
    }

    public void removeTransition(Transition transition) {
        int m58273l = m58273l(transition);
        if (m58273l != -1) {
            this.f32960e.remove(m58273l);
        }
    }

    /* renamed from: s */
    public int m58266s() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58194k();
        }
        return 0;
    }

    public void setConstraintSet(int i, ConstraintSet constraintSet) {
        this.f32963h.put(i, constraintSet);
    }

    public void setDuration(int i) {
        Transition transition = this.f32958c;
        if (transition != null) {
            transition.setDuration(i);
        } else {
            this.f32967l = i;
        }
    }

    public void setKeyframe(View view, int i, String str, Object obj) {
        Transition transition = this.f32958c;
        if (transition == null) {
            return;
        }
        Iterator it = transition.f32987k.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f32689a == i) {
                    if (obj != null) {
                        Float f = (Float) obj;
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public void setRtl(boolean z) {
        this.f32973r = z;
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            this.f32958c.f32988l.m58181x(this.f32973r);
        }
    }

    public void setTransition(Transition transition) {
        this.f32958c = transition;
        if (transition != null && transition.f32988l != null) {
            this.f32958c.f32988l.m58181x(this.f32973r);
        }
    }

    /* renamed from: t */
    public float m58265t() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58193l();
        }
        return 0.0f;
    }

    /* renamed from: u */
    public float m58264u() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58192m();
        }
        return 0.0f;
    }

    /* renamed from: v */
    public float m58263v() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58191n();
        }
        return 0.0f;
    }

    public boolean validateLayout(MotionLayout motionLayout) {
        if (motionLayout == this.f32956a && motionLayout.f32902x == this) {
            return true;
        }
        return false;
    }

    public void viewTransition(int i, View... viewArr) {
        this.f32974s.m58207k(i, viewArr);
    }

    /* renamed from: w */
    public float m58262w() {
        Transition transition = this.f32958c;
        if (transition != null && transition.f32988l != null) {
            return this.f32958c.f32988l.m58190o();
        }
        return 0.0f;
    }

    /* renamed from: x */
    public int m58261x() {
        Transition transition = this.f32958c;
        if (transition != null) {
            return transition.f32980d;
        }
        return -1;
    }

    /* renamed from: y */
    public final boolean m58260y(int i) {
        int i2 = this.f32965j.get(i);
        int size = this.f32965j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f32965j.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m58259z(View view, int i) {
        Transition transition = this.f32958c;
        if (transition == null) {
            return false;
        }
        Iterator it = transition.f32987k.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f32689a == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;

        /* renamed from: a */
        public int f32977a;

        /* renamed from: b */
        public boolean f32978b;

        /* renamed from: c */
        public int f32979c;

        /* renamed from: d */
        public int f32980d;

        /* renamed from: e */
        public int f32981e;

        /* renamed from: f */
        public String f32982f;

        /* renamed from: g */
        public int f32983g;

        /* renamed from: h */
        public int f32984h;

        /* renamed from: i */
        public float f32985i;

        /* renamed from: j */
        public final MotionScene f32986j;

        /* renamed from: k */
        public ArrayList f32987k;

        /* renamed from: l */
        public C3764a f32988l;

        /* renamed from: m */
        public ArrayList f32989m;

        /* renamed from: n */
        public int f32990n;

        /* renamed from: o */
        public boolean f32991o;

        /* renamed from: p */
        public int f32992p;

        /* renamed from: q */
        public int f32993q;

        /* renamed from: r */
        public int f32994r;

        public Transition(MotionScene motionScene, Transition transition) {
            this.f32977a = -1;
            this.f32978b = false;
            this.f32979c = -1;
            this.f32980d = -1;
            this.f32981e = 0;
            this.f32982f = null;
            this.f32983g = -1;
            this.f32984h = 400;
            this.f32985i = 0.0f;
            this.f32987k = new ArrayList();
            this.f32988l = null;
            this.f32989m = new ArrayList();
            this.f32990n = 0;
            this.f32991o = false;
            this.f32992p = -1;
            this.f32993q = 0;
            this.f32994r = 0;
            this.f32986j = motionScene;
            this.f32984h = motionScene.f32967l;
            if (transition != null) {
                this.f32992p = transition.f32992p;
                this.f32981e = transition.f32981e;
                this.f32982f = transition.f32982f;
                this.f32983g = transition.f32983g;
                this.f32984h = transition.f32984h;
                this.f32987k = transition.f32987k;
                this.f32985i = transition.f32985i;
                this.f32993q = transition.f32993q;
            }
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            this.f32987k.add(keyFrames);
        }

        public void addOnClick(int i, int i2) {
            Iterator it = this.f32989m.iterator();
            while (it.hasNext()) {
                TransitionOnClick transitionOnClick = (TransitionOnClick) it.next();
                if (transitionOnClick.f32996b == i) {
                    transitionOnClick.f32997c = i2;
                    return;
                }
            }
            this.f32989m.add(new TransitionOnClick(this, i, i2));
        }

        public String debugString(Context context) {
            String resourceEntryName;
            if (this.f32980d == -1) {
                resourceEntryName = AbstractJsonLexerKt.NULL;
            } else {
                resourceEntryName = context.getResources().getResourceEntryName(this.f32980d);
            }
            if (this.f32979c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f32979c);
        }

        public int getAutoTransition() {
            return this.f32990n;
        }

        public int getDuration() {
            return this.f32984h;
        }

        public int getEndConstraintSetId() {
            return this.f32979c;
        }

        public int getId() {
            return this.f32977a;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.f32987k;
        }

        public int getLayoutDuringTransition() {
            return this.f32993q;
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.f32989m;
        }

        public int getPathMotionArc() {
            return this.f32992p;
        }

        public float getStagger() {
            return this.f32985i;
        }

        public int getStartConstraintSetId() {
            return this.f32980d;
        }

        public C3764a getTouchResponse() {
            return this.f32988l;
        }

        public boolean isEnabled() {
            return !this.f32991o;
        }

        public boolean isTransitionFlag(int i) {
            if ((i & this.f32994r) != 0) {
                return true;
            }
            return false;
        }

        public void removeOnClick(int i) {
            TransitionOnClick transitionOnClick;
            Iterator it = this.f32989m.iterator();
            while (true) {
                if (it.hasNext()) {
                    transitionOnClick = (TransitionOnClick) it.next();
                    if (transitionOnClick.f32996b == i) {
                        break;
                    }
                } else {
                    transitionOnClick = null;
                    break;
                }
            }
            if (transitionOnClick != null) {
                this.f32989m.remove(transitionOnClick);
            }
        }

        public void setAutoTransition(int i) {
            this.f32990n = i;
        }

        public void setDuration(int i) {
            this.f32984h = Math.max(i, 8);
        }

        public void setEnable(boolean z) {
            setEnabled(z);
        }

        public void setEnabled(boolean z) {
            this.f32991o = !z;
        }

        public void setInterpolatorInfo(int i, String str, int i2) {
            this.f32981e = i;
            this.f32982f = str;
            this.f32983g = i2;
        }

        public void setLayoutDuringTransition(int i) {
            this.f32993q = i;
        }

        public void setOnSwipe(OnSwipe onSwipe) {
            C3764a c3764a;
            if (onSwipe == null) {
                c3764a = null;
            } else {
                c3764a = new C3764a(this.f32986j.f32956a, onSwipe);
            }
            this.f32988l = c3764a;
        }

        public void setOnTouchUp(int i) {
            C3764a touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.m58180y(i);
            }
        }

        public void setPathMotionArc(int i) {
            this.f32992p = i;
        }

        public void setStagger(float f) {
            this.f32985i = f;
        }

        public void setTransitionFlag(int i) {
            this.f32994r = i;
        }

        /* renamed from: t */
        public final void m58239t(MotionScene motionScene, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.f32979c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f32979c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.f32979c);
                        motionScene.f32963h.append(this.f32979c, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f32979c = motionScene.m58295D(context, this.f32979c);
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.f32980d = typedArray.getResourceId(index, this.f32980d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f32980d);
                    if ("layout".equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.f32980d);
                        motionScene.f32963h.append(this.f32980d, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f32980d = motionScene.m58295D(context, this.f32980d);
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f32983g = resourceId;
                        if (resourceId != -1) {
                            this.f32981e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f32982f = string;
                        if (string != null) {
                            if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                                this.f32983g = typedArray.getResourceId(index, -1);
                                this.f32981e = -2;
                            } else {
                                this.f32981e = -1;
                            }
                        }
                    } else {
                        this.f32981e = typedArray.getInteger(index, this.f32981e);
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.f32984h);
                    this.f32984h = i3;
                    if (i3 < 8) {
                        this.f32984h = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.f32985i = typedArray.getFloat(index, this.f32985i);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.f32990n = typedArray.getInteger(index, this.f32990n);
                } else if (index == R.styleable.Transition_android_id) {
                    this.f32977a = typedArray.getResourceId(index, this.f32977a);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.f32991o = typedArray.getBoolean(index, this.f32991o);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.f32992p = typedArray.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.f32993q = typedArray.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.f32994r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f32980d == -1) {
                this.f32978b = true;
            }
        }

        /* renamed from: u */
        public final void m58238u(MotionScene motionScene, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transition);
            m58239t(motionScene, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.f32989m.add(new TransitionOnClick(context, this, xmlPullParser));
        }

        /* loaded from: classes2.dex */
        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;

            /* renamed from: a */
            public final Transition f32995a;

            /* renamed from: b */
            public int f32996b;

            /* renamed from: c */
            public int f32997c;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
                this.f32996b = -1;
                this.f32997c = 17;
                this.f32995a = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == R.styleable.OnClick_targetId) {
                        this.f32996b = obtainStyledAttributes.getResourceId(index, this.f32996b);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.f32997c = obtainStyledAttributes.getInt(index, this.f32997c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* renamed from: a */
            public boolean m58237a(Transition transition, MotionLayout motionLayout) {
                Transition transition2 = this.f32995a;
                if (transition2 != transition) {
                    int i = transition2.f32979c;
                    int i2 = this.f32995a.f32980d;
                    if (i2 == -1) {
                        if (motionLayout.f32834C != i) {
                            return true;
                        }
                        return false;
                    }
                    int i3 = motionLayout.f32834C;
                    if (i3 == i2 || i3 == i) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View] */
            public void addOnClickListeners(MotionLayout motionLayout, int i, Transition transition) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.f32996b;
                MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 != null) {
                    int i3 = transition.f32980d;
                    int i4 = transition.f32979c;
                    if (i3 == -1) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    int i5 = this.f32997c;
                    boolean z5 = false;
                    if ((i5 & 1) != 0 && i == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i5 & 256) != 0 && i == i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z6 = z | z2;
                    if ((i5 & 1) != 0 && i == i3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z7 = z3 | z6;
                    if ((i5 & 16) != 0 && i == i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z8 = z7 | z4;
                    if ((i5 & 4096) != 0 && i == i4) {
                        z5 = true;
                    }
                    if (z8 | z5) {
                        motionLayout2.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("OnClick could not find id ");
                sb.append(this.f32996b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z;
                boolean z2;
                MotionLayout motionLayout = this.f32995a.f32986j.f32956a;
                if (!motionLayout.isInteractionEnabled()) {
                    return;
                }
                if (this.f32995a.f32980d == -1) {
                    int currentState = motionLayout.getCurrentState();
                    if (currentState == -1) {
                        motionLayout.transitionToState(this.f32995a.f32979c);
                        return;
                    }
                    Transition transition = new Transition(this.f32995a.f32986j, this.f32995a);
                    transition.f32980d = currentState;
                    transition.f32979c = this.f32995a.f32979c;
                    motionLayout.setTransition(transition);
                    motionLayout.transitionToEnd();
                    return;
                }
                Transition transition2 = this.f32995a.f32986j.f32958c;
                int i = this.f32997c;
                boolean z3 = false;
                if ((i & 1) == 0 && (i & 256) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i & 16) == 0 && (i & 4096) == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    Transition transition3 = this.f32995a.f32986j.f32958c;
                    Transition transition4 = this.f32995a;
                    if (transition3 != transition4) {
                        motionLayout.setTransition(transition4);
                    }
                    if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                        z3 = z;
                        z2 = false;
                    }
                } else {
                    z3 = z;
                }
                if (m58237a(transition2, motionLayout)) {
                    if (z3 && (this.f32997c & 1) != 0) {
                        motionLayout.setTransition(this.f32995a);
                        motionLayout.transitionToEnd();
                    } else if (z2 && (this.f32997c & 16) != 0) {
                        motionLayout.setTransition(this.f32995a);
                        motionLayout.transitionToStart();
                    } else if (z3 && (this.f32997c & 256) != 0) {
                        motionLayout.setTransition(this.f32995a);
                        motionLayout.setProgress(1.0f);
                    } else if (z2 && (this.f32997c & 4096) != 0) {
                        motionLayout.setTransition(this.f32995a);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                int i = this.f32996b;
                if (i == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i);
                if (findViewById == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" (*)  could not find id ");
                    sb.append(this.f32996b);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            public TransitionOnClick(Transition transition, int i, int i2) {
                this.f32995a = transition;
                this.f32996b = i;
                this.f32997c = i2;
            }
        }

        public Transition(int i, MotionScene motionScene, int i2, int i3) {
            this.f32977a = -1;
            this.f32978b = false;
            this.f32979c = -1;
            this.f32980d = -1;
            this.f32981e = 0;
            this.f32982f = null;
            this.f32983g = -1;
            this.f32984h = 400;
            this.f32985i = 0.0f;
            this.f32987k = new ArrayList();
            this.f32988l = null;
            this.f32989m = new ArrayList();
            this.f32990n = 0;
            this.f32991o = false;
            this.f32992p = -1;
            this.f32993q = 0;
            this.f32994r = 0;
            this.f32977a = i;
            this.f32986j = motionScene;
            this.f32980d = i2;
            this.f32979c = i3;
            this.f32984h = motionScene.f32967l;
            this.f32993q = motionScene.f32968m;
        }

        public Transition(MotionScene motionScene, Context context, XmlPullParser xmlPullParser) {
            this.f32977a = -1;
            this.f32978b = false;
            this.f32979c = -1;
            this.f32980d = -1;
            this.f32981e = 0;
            this.f32982f = null;
            this.f32983g = -1;
            this.f32984h = 400;
            this.f32985i = 0.0f;
            this.f32987k = new ArrayList();
            this.f32988l = null;
            this.f32989m = new ArrayList();
            this.f32990n = 0;
            this.f32991o = false;
            this.f32992p = -1;
            this.f32993q = 0;
            this.f32994r = 0;
            this.f32984h = motionScene.f32967l;
            this.f32993q = motionScene.f32968m;
            this.f32986j = motionScene;
            m58238u(motionScene, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    public MotionScene(Context context, MotionLayout motionLayout, int i) {
        this.f32956a = motionLayout;
        this.f32974s = new ViewTransitionController(motionLayout);
        m58297B(context, i);
        this.f32963h.put(R.id.motion_base, new ConstraintSet());
        this.f32964i.put("motion_base", Integer.valueOf(R.id.motion_base));
    }
}
