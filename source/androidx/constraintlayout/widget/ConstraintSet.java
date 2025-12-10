package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.core.p005os.EnvironmentCompat;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.asn1.eac.EACTags;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquiry700MhzFragment;

/* loaded from: classes2.dex */
public class ConstraintSet {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int CIRCLE_REFERENCE = 8;
    public static final int END = 7;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_GUIDELINE = 0;
    public static final int INVISIBLE = 4;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GUIDELINE = 1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: e */
    public static final int[] f33304e = {0, 4, 8};

    /* renamed from: f */
    public static SparseIntArray f33305f = new SparseIntArray();

    /* renamed from: g */
    public static SparseIntArray f33306g = new SparseIntArray();

    /* renamed from: a */
    public boolean f33307a;
    public String mIdString;
    public String derivedState = "";
    public int mRotate = 0;

    /* renamed from: b */
    public HashMap f33308b = new HashMap();

    /* renamed from: c */
    public boolean f33309c = true;

    /* renamed from: d */
    public HashMap f33310d = new HashMap();

    /* loaded from: classes2.dex */
    public static class Constraint {

        /* renamed from: a */
        public int f33311a;

        /* renamed from: b */
        public String f33312b;

        /* renamed from: c */
        public C3782a f33313c;
        public final PropertySet propertySet = new PropertySet();
        public final Motion motion = new Motion();
        public final Layout layout = new Layout();
        public final Transform transform = new Transform();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.ConstraintSet$Constraint$a */
        /* loaded from: classes2.dex */
        public static class C3782a {

            /* renamed from: a */
            public int[] f33314a = new int[10];

            /* renamed from: b */
            public int[] f33315b = new int[10];

            /* renamed from: c */
            public int f33316c = 0;

            /* renamed from: d */
            public int[] f33317d = new int[10];

            /* renamed from: e */
            public float[] f33318e = new float[10];

            /* renamed from: f */
            public int f33319f = 0;

            /* renamed from: g */
            public int[] f33320g = new int[5];

            /* renamed from: h */
            public String[] f33321h = new String[5];

            /* renamed from: i */
            public int f33322i = 0;

            /* renamed from: j */
            public int[] f33323j = new int[4];

            /* renamed from: k */
            public boolean[] f33324k = new boolean[4];

            /* renamed from: l */
            public int f33325l = 0;

            /* renamed from: a */
            public void m58084a(int i, float f) {
                int i2 = this.f33319f;
                int[] iArr = this.f33317d;
                if (i2 >= iArr.length) {
                    this.f33317d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f33318e;
                    this.f33318e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f33317d;
                int i3 = this.f33319f;
                iArr2[i3] = i;
                float[] fArr2 = this.f33318e;
                this.f33319f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public void m58083b(int i, int i2) {
                int i3 = this.f33316c;
                int[] iArr = this.f33314a;
                if (i3 >= iArr.length) {
                    this.f33314a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f33315b;
                    this.f33315b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f33314a;
                int i4 = this.f33316c;
                iArr3[i4] = i;
                int[] iArr4 = this.f33315b;
                this.f33316c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public void m58082c(int i, String str) {
                int i2 = this.f33322i;
                int[] iArr = this.f33320g;
                if (i2 >= iArr.length) {
                    this.f33320g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f33321h;
                    this.f33321h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f33320g;
                int i3 = this.f33322i;
                iArr2[i3] = i;
                String[] strArr2 = this.f33321h;
                this.f33322i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public void m58081d(int i, boolean z) {
                int i2 = this.f33325l;
                int[] iArr = this.f33323j;
                if (i2 >= iArr.length) {
                    this.f33323j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f33324k;
                    this.f33324k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f33323j;
                int i3 = this.f33325l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f33324k;
                this.f33325l = i3 + 1;
                zArr2[i3] = z;
            }

            /* renamed from: e */
            public void m58080e(Constraint constraint) {
                for (int i = 0; i < this.f33316c; i++) {
                    ConstraintSet.m58104u(constraint, this.f33314a[i], this.f33315b[i]);
                }
                for (int i2 = 0; i2 < this.f33319f; i2++) {
                    ConstraintSet.m58105t(constraint, this.f33317d[i2], this.f33318e[i2]);
                }
                for (int i3 = 0; i3 < this.f33322i; i3++) {
                    ConstraintSet.m58103v(constraint, this.f33320g[i3], this.f33321h[i3]);
                }
                for (int i4 = 0; i4 < this.f33325l; i4++) {
                    ConstraintSet.m58102w(constraint, this.f33323j[i4], this.f33324k[i4]);
                }
            }

            /* renamed from: f */
            public void m58079f(String str) {
                for (int i = 0; i < this.f33316c; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f33314a[i]);
                    sb.append(" = ");
                    sb.append(this.f33315b[i]);
                }
                for (int i2 = 0; i2 < this.f33319f; i2++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f33317d[i2]);
                    sb2.append(" = ");
                    sb2.append(this.f33318e[i2]);
                }
                for (int i3 = 0; i3 < this.f33322i; i3++) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f33320g[i3]);
                    sb3.append(" = ");
                    sb3.append(this.f33321h[i3]);
                }
                for (int i4 = 0; i4 < this.f33325l; i4++) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f33323j[i4]);
                    sb4.append(" = ");
                    sb4.append(this.f33324k[i4]);
                }
            }
        }

        public void applyDelta(Constraint constraint) {
            C3782a c3782a = this.f33313c;
            if (c3782a != null) {
                c3782a.m58080e(constraint);
            }
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.layout;
            layoutParams.leftToLeft = layout.leftToLeft;
            layoutParams.leftToRight = layout.leftToRight;
            layoutParams.rightToLeft = layout.rightToLeft;
            layoutParams.rightToRight = layout.rightToRight;
            layoutParams.topToTop = layout.topToTop;
            layoutParams.topToBottom = layout.topToBottom;
            layoutParams.bottomToTop = layout.bottomToTop;
            layoutParams.bottomToBottom = layout.bottomToBottom;
            layoutParams.baselineToBaseline = layout.baselineToBaseline;
            layoutParams.baselineToTop = layout.baselineToTop;
            layoutParams.baselineToBottom = layout.baselineToBottom;
            layoutParams.startToEnd = layout.startToEnd;
            layoutParams.startToStart = layout.startToStart;
            layoutParams.endToStart = layout.endToStart;
            layoutParams.endToEnd = layout.endToEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.bottomMargin;
            layoutParams.goneStartMargin = layout.goneStartMargin;
            layoutParams.goneEndMargin = layout.goneEndMargin;
            layoutParams.goneTopMargin = layout.goneTopMargin;
            layoutParams.goneBottomMargin = layout.goneBottomMargin;
            layoutParams.horizontalBias = layout.horizontalBias;
            layoutParams.verticalBias = layout.verticalBias;
            layoutParams.circleConstraint = layout.circleConstraint;
            layoutParams.circleRadius = layout.circleRadius;
            layoutParams.circleAngle = layout.circleAngle;
            layoutParams.dimensionRatio = layout.dimensionRatio;
            layoutParams.editorAbsoluteX = layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout.editorAbsoluteY;
            layoutParams.verticalWeight = layout.verticalWeight;
            layoutParams.horizontalWeight = layout.horizontalWeight;
            layoutParams.verticalChainStyle = layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout.horizontalChainStyle;
            layoutParams.constrainedWidth = layout.constrainedWidth;
            layoutParams.constrainedHeight = layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout.widthMax;
            layoutParams.matchConstraintMaxHeight = layout.heightMax;
            layoutParams.matchConstraintMinWidth = layout.widthMin;
            layoutParams.matchConstraintMinHeight = layout.heightMin;
            layoutParams.matchConstraintPercentWidth = layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout.heightPercent;
            layoutParams.orientation = layout.orientation;
            layoutParams.guidePercent = layout.guidePercent;
            layoutParams.guideBegin = layout.guideBegin;
            layoutParams.guideEnd = layout.guideEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.mWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.mHeight;
            String str = layout.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.wrapBehaviorInParent = layout.mWrapBehavior;
            layoutParams.setMarginStart(layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        /* renamed from: h */
        public final void m58092h(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f33311a = i;
            Layout layout = this.layout;
            layout.leftToLeft = layoutParams.leftToLeft;
            layout.leftToRight = layoutParams.leftToRight;
            layout.rightToLeft = layoutParams.rightToLeft;
            layout.rightToRight = layoutParams.rightToRight;
            layout.topToTop = layoutParams.topToTop;
            layout.topToBottom = layoutParams.topToBottom;
            layout.bottomToTop = layoutParams.bottomToTop;
            layout.bottomToBottom = layoutParams.bottomToBottom;
            layout.baselineToBaseline = layoutParams.baselineToBaseline;
            layout.baselineToTop = layoutParams.baselineToTop;
            layout.baselineToBottom = layoutParams.baselineToBottom;
            layout.startToEnd = layoutParams.startToEnd;
            layout.startToStart = layoutParams.startToStart;
            layout.endToStart = layoutParams.endToStart;
            layout.endToEnd = layoutParams.endToEnd;
            layout.horizontalBias = layoutParams.horizontalBias;
            layout.verticalBias = layoutParams.verticalBias;
            layout.dimensionRatio = layoutParams.dimensionRatio;
            layout.circleConstraint = layoutParams.circleConstraint;
            layout.circleRadius = layoutParams.circleRadius;
            layout.circleAngle = layoutParams.circleAngle;
            layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout.orientation = layoutParams.orientation;
            layout.guidePercent = layoutParams.guidePercent;
            layout.guideBegin = layoutParams.guideBegin;
            layout.guideEnd = layoutParams.guideEnd;
            layout.mWidth = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.mHeight = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.topMargin = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.bottomMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.baselineMargin = layoutParams.baselineMargin;
            layout.verticalWeight = layoutParams.verticalWeight;
            layout.horizontalWeight = layoutParams.horizontalWeight;
            layout.verticalChainStyle = layoutParams.verticalChainStyle;
            layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout.constrainedWidth = layoutParams.constrainedWidth;
            layout.constrainedHeight = layoutParams.constrainedHeight;
            layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout.widthMax = layoutParams.matchConstraintMaxWidth;
            layout.heightMax = layoutParams.matchConstraintMaxHeight;
            layout.widthMin = layoutParams.matchConstraintMinWidth;
            layout.heightMin = layoutParams.matchConstraintMinHeight;
            layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout.mConstraintTag = layoutParams.constraintTag;
            layout.goneTopMargin = layoutParams.goneTopMargin;
            layout.goneBottomMargin = layoutParams.goneBottomMargin;
            layout.goneLeftMargin = layoutParams.goneLeftMargin;
            layout.goneRightMargin = layoutParams.goneRightMargin;
            layout.goneStartMargin = layoutParams.goneStartMargin;
            layout.goneEndMargin = layoutParams.goneEndMargin;
            layout.goneBaselineMargin = layoutParams.goneBaselineMargin;
            layout.mWrapBehavior = layoutParams.wrapBehaviorInParent;
            layout.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        /* renamed from: i */
        public final void m58091i(int i, Constraints.LayoutParams layoutParams) {
            m58092h(i, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform = this.transform;
            transform.rotation = layoutParams.rotation;
            transform.rotationX = layoutParams.rotationX;
            transform.rotationY = layoutParams.rotationY;
            transform.scaleX = layoutParams.scaleX;
            transform.scaleY = layoutParams.scaleY;
            transform.transformPivotX = layoutParams.transformPivotX;
            transform.transformPivotY = layoutParams.transformPivotY;
            transform.translationX = layoutParams.translationX;
            transform.translationY = layoutParams.translationY;
            transform.translationZ = layoutParams.translationZ;
            transform.elevation = layoutParams.elevation;
            transform.applyElevation = layoutParams.applyElevation;
        }

        /* renamed from: j */
        public final void m58090j(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            m58091i(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout = this.layout;
                layout.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        /* renamed from: k */
        public final ConstraintAttribute m58089k(String str, ConstraintAttribute.AttributeType attributeType) {
            if (this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str);
                if (constraintAttribute.getType() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = new ConstraintAttribute(str, attributeType);
            this.mCustomConstraints.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        /* renamed from: l */
        public final void m58088l(String str, int i) {
            m58089k(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i);
        }

        /* renamed from: m */
        public final void m58087m(String str, float f) {
            m58089k(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f);
        }

        /* renamed from: n */
        public final void m58086n(String str, int i) {
            m58089k(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i);
        }

        /* renamed from: o */
        public final void m58085o(String str, String str2) {
            m58089k(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        public void printDelta(String str) {
            C3782a c3782a = this.f33313c;
            if (c3782a != null) {
                c3782a.m58079f(str);
            }
        }

        /* renamed from: clone */
        public Constraint m73904clone() {
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.f33311a = this.f33311a;
            constraint.f33313c = this.f33313c;
            return constraint;
        }
    }

    /* loaded from: classes2.dex */
    public static class Layout {
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;

        /* renamed from: a */
        public static SparseIntArray f33326a;
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33326a = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            f33326a.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            f33326a.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            f33326a.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            f33326a.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            f33326a.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            f33326a.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            f33326a.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            f33326a.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f33326a.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            f33326a.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            f33326a.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            f33326a.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            f33326a.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            f33326a.append(R.styleable.Layout_guidelineUseRtl, 90);
            f33326a.append(R.styleable.Layout_android_orientation, 26);
            f33326a.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            f33326a.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            f33326a.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            f33326a.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            f33326a.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            f33326a.append(R.styleable.Layout_layout_goneMarginTop, 16);
            f33326a.append(R.styleable.Layout_layout_goneMarginRight, 14);
            f33326a.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            f33326a.append(R.styleable.Layout_layout_goneMarginStart, 15);
            f33326a.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            f33326a.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            f33326a.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            f33326a.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            f33326a.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            f33326a.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            f33326a.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            f33326a.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            f33326a.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
            f33326a.append(R.styleable.Layout_layout_constraintTop_creator, 91);
            f33326a.append(R.styleable.Layout_layout_constraintRight_creator, 91);
            f33326a.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
            f33326a.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
            f33326a.append(R.styleable.Layout_android_layout_marginLeft, 23);
            f33326a.append(R.styleable.Layout_android_layout_marginRight, 27);
            f33326a.append(R.styleable.Layout_android_layout_marginStart, 30);
            f33326a.append(R.styleable.Layout_android_layout_marginEnd, 8);
            f33326a.append(R.styleable.Layout_android_layout_marginTop, 33);
            f33326a.append(R.styleable.Layout_android_layout_marginBottom, 2);
            f33326a.append(R.styleable.Layout_android_layout_width, 22);
            f33326a.append(R.styleable.Layout_android_layout_height, 21);
            f33326a.append(R.styleable.Layout_layout_constraintWidth, 41);
            f33326a.append(R.styleable.Layout_layout_constraintHeight, 42);
            f33326a.append(R.styleable.Layout_layout_constrainedWidth, 41);
            f33326a.append(R.styleable.Layout_layout_constrainedHeight, 42);
            f33326a.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            f33326a.append(R.styleable.Layout_layout_constraintCircle, 61);
            f33326a.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            f33326a.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            f33326a.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            f33326a.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            f33326a.append(R.styleable.Layout_chainUseRtl, 71);
            f33326a.append(R.styleable.Layout_barrierDirection, 72);
            f33326a.append(R.styleable.Layout_barrierMargin, 73);
            f33326a.append(R.styleable.Layout_constraint_referenced_ids, 74);
            f33326a.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void m58078a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f33326a.get(index);
                switch (i2) {
                    case 1:
                        this.baselineToBaseline = ConstraintSet.m58111n(obtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = ConstraintSet.m58111n(obtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = ConstraintSet.m58111n(obtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = ConstraintSet.m58111n(obtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = ConstraintSet.m58111n(obtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = obtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = obtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = ConstraintSet.m58111n(obtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = ConstraintSet.m58111n(obtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = ConstraintSet.m58111n(obtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = ConstraintSet.m58111n(obtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = ConstraintSet.m58111n(obtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = ConstraintSet.m58111n(obtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = ConstraintSet.m58111n(obtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = ConstraintSet.m58111n(obtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = obtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = obtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    case 41:
                        ConstraintSet.m58110o(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.m58110o(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.circleConstraint = ConstraintSet.m58111n(obtainStyledAttributes, index, this.circleConstraint);
                                continue;
                            case 62:
                                this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                continue;
                            case 63:
                                this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle);
                                continue;
                            default:
                                switch (i2) {
                                    case EACTags.DISPLAY_IMAGE /* 69 */:
                                        this.widthPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.heightPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case EACTags.MESSAGE_REFERENCE /* 71 */:
                                        continue;
                                    case 72:
                                        this.mBarrierDirection = obtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                        continue;
                                    case 73:
                                        this.mBarrierMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                        continue;
                                    case 74:
                                        this.mReferenceIdString = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.mBarrierAllowsGoneWidgets = obtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                        continue;
                                    case 76:
                                        this.mWrapBehavior = obtainStyledAttributes.getInt(index, this.mWrapBehavior);
                                        continue;
                                    case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                                        this.baselineToTop = ConstraintSet.m58111n(obtainStyledAttributes, index, this.baselineToTop);
                                        continue;
                                    case 78:
                                        this.baselineToBottom = ConstraintSet.m58111n(obtainStyledAttributes, index, this.baselineToBottom);
                                        continue;
                                    case 79:
                                        this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                        continue;
                                    case 80:
                                        this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                        continue;
                                    case EACTags.ANSWER_TO_RESET /* 81 */:
                                        this.widthDefault = obtainStyledAttributes.getInt(index, this.widthDefault);
                                        continue;
                                    case EACTags.HISTORICAL_BYTES /* 82 */:
                                        this.heightDefault = obtainStyledAttributes.getInt(index, this.heightDefault);
                                        continue;
                                    case ModuleDescriptor.MODULE_VERSION /* 83 */:
                                        this.heightMax = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                        continue;
                                    case 84:
                                        this.widthMax = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                        continue;
                                    case CustomerEnquiry700MhzFragment.hiddenSubProdHeight /* 85 */:
                                        this.heightMin = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                        continue;
                                    case 86:
                                        this.widthMin = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                        continue;
                                    case 87:
                                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                                        continue;
                                    case SyslogConstants.LOG_FTP /* 88 */:
                                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                                        continue;
                                    case 89:
                                        this.mConstraintTag = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        continue;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f33326a.get(index));
                                        continue;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f33326a.get(index));
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void copyFrom(Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.guidelineUseRtl = layout.guidelineUseRtl;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.baselineToTop = layout.baselineToTop;
            this.baselineToBottom = layout.baselineToBottom;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.baselineMargin = layout.baselineMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.goneBaselineMargin = layout.goneBaselineMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr != null && layout.mReferenceIdString == null) {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.mReferenceIds = null;
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = layout.mWrapBehavior;
        }

        public void dump(MotionScene motionScene, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object lookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(lookUpConstraintName == null ? num : lookUpConstraintName);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f = (Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Motion {

        /* renamed from: a */
        public static SparseIntArray f33327a;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33327a = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            f33327a.append(R.styleable.Motion_pathMotionArc, 2);
            f33327a.append(R.styleable.Motion_transitionEasing, 3);
            f33327a.append(R.styleable.Motion_drawPath, 4);
            f33327a.append(R.styleable.Motion_animateRelativeTo, 5);
            f33327a.append(R.styleable.Motion_animateCircleAngleTo, 6);
            f33327a.append(R.styleable.Motion_motionStagger, 7);
            f33327a.append(R.styleable.Motion_quantizeMotionSteps, 8);
            f33327a.append(R.styleable.Motion_quantizeMotionPhase, 9);
            f33327a.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void m58077a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f33327a.get(index)) {
                    case 1:
                        this.mPathRotate = obtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = obtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.mTransitionEasing = Easing.NAMED_EASING[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.mDrawPath = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.m58111n(obtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = obtainStyledAttributes.getInteger(index, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = obtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = obtainStyledAttributes.getInteger(index, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = obtainStyledAttributes.getFloat(index, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.mQuantizeInterpolatorID = resourceId;
                            if (resourceId != -1) {
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.mQuantizeInterpolatorString = string;
                            if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                                this.mQuantizeInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                this.mQuantizeInterpolatorType = -1;
                                break;
                            }
                        } else {
                            this.mQuantizeInterpolatorType = obtainStyledAttributes.getInteger(index, this.mQuantizeInterpolatorID);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void copyFrom(Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
            this.mPolarRelativeTo = motion.mPolarRelativeTo;
        }
    }

    /* loaded from: classes2.dex */
    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        /* renamed from: a */
        public void m58076a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.visibility = obtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = ConstraintSet.f33304e[this.visibility];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = obtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.mProgress = obtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void copyFrom(PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }
    }

    /* loaded from: classes2.dex */
    public static class Transform {

        /* renamed from: a */
        public static SparseIntArray f33328a;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33328a = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            f33328a.append(R.styleable.Transform_android_rotationX, 2);
            f33328a.append(R.styleable.Transform_android_rotationY, 3);
            f33328a.append(R.styleable.Transform_android_scaleX, 4);
            f33328a.append(R.styleable.Transform_android_scaleY, 5);
            f33328a.append(R.styleable.Transform_android_transformPivotX, 6);
            f33328a.append(R.styleable.Transform_android_transformPivotY, 7);
            f33328a.append(R.styleable.Transform_android_translationX, 8);
            f33328a.append(R.styleable.Transform_android_translationY, 9);
            f33328a.append(R.styleable.Transform_android_translationZ, 10);
            f33328a.append(R.styleable.Transform_android_elevation, 11);
            f33328a.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void m58075a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f33328a.get(index)) {
                    case 1:
                        this.rotation = obtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = obtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = obtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = obtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = obtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = obtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = obtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = obtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = obtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = obtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = obtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = ConstraintSet.m58111n(obtainStyledAttributes, index, this.transformPivotTarget);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void copyFrom(Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.transformPivotTarget = transform.transformPivotTarget;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$a */
    /* loaded from: classes2.dex */
    public class C3783a {

        /* renamed from: a */
        public Writer f33329a;

        /* renamed from: b */
        public ConstraintLayout f33330b;

        /* renamed from: c */
        public Context f33331c;

        /* renamed from: d */
        public int f33332d;

        /* renamed from: e */
        public int f33333e = 0;

        /* renamed from: f */
        public final String f33334f = "'left'";

        /* renamed from: g */
        public final String f33335g = "'right'";

        /* renamed from: h */
        public final String f33336h = "'baseline'";

        /* renamed from: i */
        public final String f33337i = "'bottom'";

        /* renamed from: j */
        public final String f33338j = "'top'";

        /* renamed from: k */
        public final String f33339k = "'start'";

        /* renamed from: l */
        public final String f33340l = "'end'";

        /* renamed from: m */
        public HashMap f33341m = new HashMap();

        public C3783a(Writer writer, ConstraintLayout constraintLayout, int i) {
            this.f33329a = writer;
            this.f33330b = constraintLayout;
            this.f33331c = constraintLayout.getContext();
            this.f33332d = i;
        }

        /* renamed from: a */
        public String m58074a(int i) {
            if (this.f33341m.containsKey(Integer.valueOf(i))) {
                return OperatorName.SHOW_TEXT_LINE + ((String) this.f33341m.get(Integer.valueOf(i))) + OperatorName.SHOW_TEXT_LINE;
            } else if (i == 0) {
                return "'parent'";
            } else {
                String m58073b = m58073b(i);
                this.f33341m.put(Integer.valueOf(i), m58073b);
                return OperatorName.SHOW_TEXT_LINE + m58073b + OperatorName.SHOW_TEXT_LINE;
            }
        }

        /* renamed from: b */
        public String m58073b(int i) {
            try {
                if (i != -1) {
                    return this.f33331c.getResources().getResourceEntryName(i);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i2 = this.f33333e + 1;
                this.f33333e = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i3 = this.f33333e + 1;
                this.f33333e = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        /* renamed from: c */
        public void m58072c(int i, float f, int i2) {
            if (i == -1) {
                return;
            }
            this.f33329a.write("       circle");
            this.f33329a.write(":[");
            this.f33329a.write(m58074a(i));
            Writer writer = this.f33329a;
            writer.write(", " + f);
            Writer writer2 = this.f33329a;
            writer2.write(i2 + "]");
        }

        /* renamed from: d */
        public void m58071d(String str, int i, String str2, int i2, int i3) {
            if (i == -1) {
                return;
            }
            Writer writer = this.f33329a;
            writer.write("       " + str);
            this.f33329a.write(":[");
            this.f33329a.write(m58074a(i));
            this.f33329a.write(" , ");
            this.f33329a.write(str2);
            if (i2 != 0) {
                Writer writer2 = this.f33329a;
                writer2.write(" , " + i2);
            }
            this.f33329a.write("],\n");
        }

        /* renamed from: e */
        public final void m58070e(String str, int i, int i2, float f, int i3, int i4, boolean z) {
            if (i == 0) {
                if (i4 == -1 && i3 == -1) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Writer writer = this.f33329a;
                            writer.write("       " + str + ": '" + f + "%',\n");
                            return;
                        }
                        return;
                    }
                    Writer writer2 = this.f33329a;
                    writer2.write("       " + str + ": '???????????',\n");
                } else if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Writer writer3 = this.f33329a;
                            writer3.write("       " + str + ": {'" + f + "'% ," + i3 + ", " + i4 + "}\n");
                            return;
                        }
                        return;
                    }
                    Writer writer4 = this.f33329a;
                    writer4.write("       " + str + ": {'wrap' ," + i3 + ", " + i4 + "}\n");
                } else {
                    Writer writer5 = this.f33329a;
                    writer5.write("       " + str + ": {'spread' ," + i3 + ", " + i4 + "}\n");
                }
            } else if (i == -2) {
                Writer writer6 = this.f33329a;
                writer6.write("       " + str + ": 'wrap'\n");
            } else if (i == -1) {
                Writer writer7 = this.f33329a;
                writer7.write("       " + str + ": 'parent'\n");
            } else {
                Writer writer8 = this.f33329a;
                writer8.write("       " + str + ": " + i + ",\n");
            }
        }

        /* renamed from: f */
        public final void m58069f(int i, int i2, int i3, float f) {
        }

        /* renamed from: g */
        public void m58068g() {
            this.f33329a.write("\n'ConstraintSet':{\n");
            for (Integer num : ConstraintSet.this.f33310d.keySet()) {
                String m58074a = m58074a(num.intValue());
                Writer writer = this.f33329a;
                writer.write(m58074a + ":{\n");
                Layout layout = ((Constraint) ConstraintSet.this.f33310d.get(num)).layout;
                m58070e("height", layout.mHeight, layout.heightDefault, layout.heightPercent, layout.heightMin, layout.heightMax, layout.constrainedHeight);
                m58070e("width", layout.mWidth, layout.widthDefault, layout.widthPercent, layout.widthMin, layout.widthMax, layout.constrainedWidth);
                m58071d("'left'", layout.leftToLeft, "'left'", layout.leftMargin, layout.goneLeftMargin);
                m58071d("'left'", layout.leftToRight, "'right'", layout.leftMargin, layout.goneLeftMargin);
                m58071d("'right'", layout.rightToLeft, "'left'", layout.rightMargin, layout.goneRightMargin);
                m58071d("'right'", layout.rightToRight, "'right'", layout.rightMargin, layout.goneRightMargin);
                m58071d("'baseline'", layout.baselineToBaseline, "'baseline'", -1, layout.goneBaselineMargin);
                m58071d("'baseline'", layout.baselineToTop, "'top'", -1, layout.goneBaselineMargin);
                m58071d("'baseline'", layout.baselineToBottom, "'bottom'", -1, layout.goneBaselineMargin);
                m58071d("'top'", layout.topToBottom, "'bottom'", layout.topMargin, layout.goneTopMargin);
                m58071d("'top'", layout.topToTop, "'top'", layout.topMargin, layout.goneTopMargin);
                m58071d("'bottom'", layout.bottomToBottom, "'bottom'", layout.bottomMargin, layout.goneBottomMargin);
                m58071d("'bottom'", layout.bottomToTop, "'top'", layout.bottomMargin, layout.goneBottomMargin);
                m58071d("'start'", layout.startToStart, "'start'", layout.startMargin, layout.goneStartMargin);
                m58071d("'start'", layout.startToEnd, "'end'", layout.startMargin, layout.goneStartMargin);
                m58071d("'end'", layout.endToStart, "'start'", layout.endMargin, layout.goneEndMargin);
                m58071d("'end'", layout.endToEnd, "'end'", layout.endMargin, layout.goneEndMargin);
                m58066i("'horizontalBias'", layout.horizontalBias, 0.5f);
                m58066i("'verticalBias'", layout.verticalBias, 0.5f);
                m58072c(layout.circleConstraint, layout.circleAngle, layout.circleRadius);
                m58069f(layout.orientation, layout.guideBegin, layout.guideEnd, layout.guidePercent);
                m58064k("'dimensionRatio'", layout.dimensionRatio);
                m58065j("'barrierMargin'", layout.mBarrierMargin);
                m58065j("'type'", layout.mHelperType);
                m58064k("'ReferenceId'", layout.mReferenceIdString);
                m58063l("'mBarrierAllowsGoneWidgets'", layout.mBarrierAllowsGoneWidgets, true);
                m58065j("'WrapBehavior'", layout.mWrapBehavior);
                m58067h("'verticalWeight'", layout.verticalWeight);
                m58067h("'horizontalWeight'", layout.horizontalWeight);
                m58065j("'horizontalChainStyle'", layout.horizontalChainStyle);
                m58065j("'verticalChainStyle'", layout.verticalChainStyle);
                m58065j("'barrierDirection'", layout.mBarrierDirection);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    m58062m("'ReferenceIds'", iArr);
                }
                this.f33329a.write("}\n");
            }
            this.f33329a.write("}\n");
        }

        /* renamed from: h */
        public void m58067h(String str, float f) {
            if (f == -1.0f) {
                return;
            }
            Writer writer = this.f33329a;
            writer.write("       " + str);
            Writer writer2 = this.f33329a;
            writer2.write(": " + f);
            this.f33329a.write(",\n");
        }

        /* renamed from: i */
        public void m58066i(String str, float f, float f2) {
            if (f == f2) {
                return;
            }
            Writer writer = this.f33329a;
            writer.write("       " + str);
            Writer writer2 = this.f33329a;
            writer2.write(": " + f);
            this.f33329a.write(",\n");
        }

        /* renamed from: j */
        public void m58065j(String str, int i) {
            if (i != 0 && i != -1) {
                Writer writer = this.f33329a;
                writer.write("       " + str);
                this.f33329a.write(":");
                Writer writer2 = this.f33329a;
                writer2.write(", " + i);
                this.f33329a.write("\n");
            }
        }

        /* renamed from: k */
        public void m58064k(String str, String str2) {
            if (str2 == null) {
                return;
            }
            Writer writer = this.f33329a;
            writer.write("       " + str);
            this.f33329a.write(":");
            Writer writer2 = this.f33329a;
            writer2.write(", " + str2);
            this.f33329a.write("\n");
        }

        /* renamed from: l */
        public void m58063l(String str, boolean z, boolean z2) {
            if (z == z2) {
                return;
            }
            Writer writer = this.f33329a;
            writer.write("       " + str);
            Writer writer2 = this.f33329a;
            writer2.write(": " + z);
            this.f33329a.write(",\n");
        }

        /* renamed from: m */
        public void m58062m(String str, int[] iArr) {
            String str2;
            if (iArr == null) {
                return;
            }
            Writer writer = this.f33329a;
            writer.write("       " + str);
            this.f33329a.write(": ");
            for (int i = 0; i < iArr.length; i++) {
                Writer writer2 = this.f33329a;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str2 = "[";
                } else {
                    str2 = ", ";
                }
                sb.append(str2);
                sb.append(m58074a(iArr[i]));
                writer2.write(sb.toString());
            }
            this.f33329a.write("],\n");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintSet$b */
    /* loaded from: classes2.dex */
    public class C3784b {

        /* renamed from: a */
        public Writer f33343a;

        /* renamed from: b */
        public ConstraintLayout f33344b;

        /* renamed from: c */
        public Context f33345c;

        /* renamed from: d */
        public int f33346d;

        /* renamed from: e */
        public int f33347e = 0;

        /* renamed from: f */
        public final String f33348f = "'left'";

        /* renamed from: g */
        public final String f33349g = "'right'";

        /* renamed from: h */
        public final String f33350h = "'baseline'";

        /* renamed from: i */
        public final String f33351i = "'bottom'";

        /* renamed from: j */
        public final String f33352j = "'top'";

        /* renamed from: k */
        public final String f33353k = "'start'";

        /* renamed from: l */
        public final String f33354l = "'end'";

        /* renamed from: m */
        public HashMap f33355m = new HashMap();

        public C3784b(Writer writer, ConstraintLayout constraintLayout, int i) {
            this.f33343a = writer;
            this.f33344b = constraintLayout;
            this.f33345c = constraintLayout.getContext();
            this.f33346d = i;
        }

        /* renamed from: a */
        public String m58061a(int i) {
            if (this.f33355m.containsKey(Integer.valueOf(i))) {
                return "@+id/" + ((String) this.f33355m.get(Integer.valueOf(i))) + "";
            } else if (i == 0) {
                return "parent";
            } else {
                String m58060b = m58060b(i);
                this.f33355m.put(Integer.valueOf(i), m58060b);
                return "@+id/" + m58060b + "";
            }
        }

        /* renamed from: b */
        public String m58060b(int i) {
            try {
                if (i != -1) {
                    return this.f33345c.getResources().getResourceEntryName(i);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i2 = this.f33347e + 1;
                this.f33347e = i2;
                sb.append(i2);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i3 = this.f33347e + 1;
                this.f33347e = i3;
                sb2.append(i3);
                return sb2.toString();
            }
        }

        /* renamed from: c */
        public final void m58059c(String str, int i, int i2) {
            if (i != i2) {
                if (i == -2) {
                    Writer writer = this.f33343a;
                    writer.write("\n       " + str + "=\"wrap_content\"");
                } else if (i == -1) {
                    Writer writer2 = this.f33343a;
                    writer2.write("\n       " + str + "=\"match_parent\"");
                } else {
                    Writer writer3 = this.f33343a;
                    writer3.write("\n       " + str + "=\"" + i + "dp\"");
                }
            }
        }

        /* renamed from: d */
        public final void m58058d(String str, boolean z, boolean z2) {
            if (z != z2) {
                Writer writer = this.f33343a;
                writer.write("\n       " + str + "=\"" + z + "dp\"");
            }
        }

        /* renamed from: e */
        public final void m58057e(String str, int i, int i2) {
            if (i != i2) {
                Writer writer = this.f33343a;
                writer.write("\n       " + str + "=\"" + i + "dp\"");
            }
        }

        /* renamed from: f */
        public final void m58056f(String str, int i, String[] strArr, int i2) {
            if (i != i2) {
                Writer writer = this.f33343a;
                writer.write("\n       " + str + "=\"" + strArr[i] + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
        }

        /* renamed from: g */
        public void m58055g() {
            this.f33343a.write("\n<ConstraintSet>\n");
            for (Integer num : ConstraintSet.this.f33310d.keySet()) {
                String m58061a = m58061a(num.intValue());
                this.f33343a.write("  <Constraint");
                Writer writer = this.f33343a;
                writer.write("\n       android:id=\"" + m58061a + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                Layout layout = ((Constraint) ConstraintSet.this.f33310d.get(num)).layout;
                m58059c("android:layout_width", layout.mWidth, -5);
                m58059c("android:layout_height", layout.mHeight, -5);
                m58054h("app:layout_constraintGuide_begin", (float) layout.guideBegin, -1.0f);
                m58054h("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                m58054h("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                m58054h("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                m58054h("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                m58052j("app:layout_constraintDimensionRatio", layout.dimensionRatio, null);
                m58050l("app:layout_constraintCircle", layout.circleConstraint);
                m58054h("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                m58054h("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                m58054h("android:orientation", layout.orientation, -1.0f);
                m58054h("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                m58054h("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                m58054h("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                m58054h("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                m58054h("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                m58054h("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                m58057e("app:layout_marginLeft", layout.leftMargin, 0);
                m58057e("app:layout_goneMarginLeft", layout.goneLeftMargin, Integer.MIN_VALUE);
                m58057e("app:layout_marginRight", layout.rightMargin, 0);
                m58057e("app:layout_goneMarginRight", layout.goneRightMargin, Integer.MIN_VALUE);
                m58057e("app:layout_marginStart", layout.startMargin, 0);
                m58057e("app:layout_goneMarginStart", layout.goneStartMargin, Integer.MIN_VALUE);
                m58057e("app:layout_marginEnd", layout.endMargin, 0);
                m58057e("app:layout_goneMarginEnd", layout.goneEndMargin, Integer.MIN_VALUE);
                m58057e("app:layout_marginTop", layout.topMargin, 0);
                m58057e("app:layout_goneMarginTop", layout.goneTopMargin, Integer.MIN_VALUE);
                m58057e("app:layout_marginBottom", layout.bottomMargin, 0);
                m58057e("app:layout_goneMarginBottom", layout.goneBottomMargin, Integer.MIN_VALUE);
                m58057e("app:goneBaselineMargin", layout.goneBaselineMargin, Integer.MIN_VALUE);
                m58057e("app:baselineMargin", layout.baselineMargin, 0);
                m58058d("app:layout_constrainedWidth", layout.constrainedWidth, false);
                m58058d("app:layout_constrainedHeight", layout.constrainedHeight, false);
                m58058d("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                m58054h("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                m58050l("app:baselineToBaseline", layout.baselineToBaseline);
                m58050l("app:baselineToBottom", layout.baselineToBottom);
                m58050l("app:baselineToTop", layout.baselineToTop);
                m58050l("app:layout_constraintBottom_toBottomOf", layout.bottomToBottom);
                m58050l("app:layout_constraintBottom_toTopOf", layout.bottomToTop);
                m58050l("app:layout_constraintEnd_toEndOf", layout.endToEnd);
                m58050l("app:layout_constraintEnd_toStartOf", layout.endToStart);
                m58050l("app:layout_constraintLeft_toLeftOf", layout.leftToLeft);
                m58050l("app:layout_constraintLeft_toRightOf", layout.leftToRight);
                m58050l("app:layout_constraintRight_toLeftOf", layout.rightToLeft);
                m58050l("app:layout_constraintRight_toRightOf", layout.rightToRight);
                m58050l("app:layout_constraintStart_toEndOf", layout.startToEnd);
                m58050l("app:layout_constraintStart_toStartOf", layout.startToStart);
                m58050l("app:layout_constraintTop_toBottomOf", layout.topToBottom);
                m58050l("app:layout_constraintTop_toTopOf", layout.topToTop);
                String[] strArr = {"spread", "wrap", "percent"};
                m58056f("app:layout_constraintHeight_default", layout.heightDefault, strArr, 0);
                m58054h("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                m58057e("app:layout_constraintHeight_min", layout.heightMin, 0);
                m58057e("app:layout_constraintHeight_max", layout.heightMax, 0);
                m58058d("android:layout_constrainedHeight", layout.constrainedHeight, false);
                m58056f("app:layout_constraintWidth_default", layout.widthDefault, strArr, 0);
                m58054h("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                m58057e("app:layout_constraintWidth_min", layout.widthMin, 0);
                m58057e("app:layout_constraintWidth_max", layout.widthMax, 0);
                m58058d("android:layout_constrainedWidth", layout.constrainedWidth, false);
                m58054h("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                m58054h("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                m58053i("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle);
                m58053i("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle);
                m58056f("app:barrierDirection", layout.mBarrierDirection, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                m58052j("app:layout_constraintTag", layout.mConstraintTag, null);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    m58051k("'ReferenceIds'", iArr);
                }
                this.f33343a.write(" />\n");
            }
            this.f33343a.write("</ConstraintSet>\n");
        }

        /* renamed from: h */
        public void m58054h(String str, float f, float f2) {
            if (f == f2) {
                return;
            }
            Writer writer = this.f33343a;
            writer.write("\n       " + str);
            Writer writer2 = this.f33343a;
            writer2.write("=\"" + f + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }

        /* renamed from: i */
        public void m58053i(String str, int i) {
            if (i != 0 && i != -1) {
                Writer writer = this.f33343a;
                writer.write("\n       " + str + "=\"" + i + "\"\n");
            }
        }

        /* renamed from: j */
        public void m58052j(String str, String str2, String str3) {
            if (str2 != null && !str2.equals(str3)) {
                Writer writer = this.f33343a;
                writer.write("\n       " + str);
                Writer writer2 = this.f33343a;
                writer2.write("=\"" + str2 + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
        }

        /* renamed from: k */
        public void m58051k(String str, int[] iArr) {
            String str2;
            if (iArr == null) {
                return;
            }
            Writer writer = this.f33343a;
            writer.write("\n       " + str);
            this.f33343a.write(":");
            for (int i = 0; i < iArr.length; i++) {
                Writer writer2 = this.f33343a;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str2 = "[";
                } else {
                    str2 = ", ";
                }
                sb.append(str2);
                sb.append(m58061a(iArr[i]));
                writer2.write(sb.toString());
            }
            this.f33343a.write("],\n");
        }

        /* renamed from: l */
        public void m58050l(String str, int i) {
            if (i == -1) {
                return;
            }
            Writer writer = this.f33343a;
            writer.write("\n       " + str);
            Writer writer2 = this.f33343a;
            writer2.write("=\"" + m58061a(i) + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
    }

    static {
        f33305f.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        f33305f.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        f33305f.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        f33305f.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        f33305f.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        f33305f.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        f33305f.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        f33305f.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        f33305f.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f33305f.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        f33305f.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f33305f.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        f33305f.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        f33305f.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        f33305f.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        f33305f.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        f33305f.append(R.styleable.Constraint_guidelineUseRtl, 99);
        f33305f.append(R.styleable.Constraint_android_orientation, 27);
        f33305f.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        f33305f.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        f33305f.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        f33305f.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        f33305f.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        f33305f.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        f33305f.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        f33305f.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        f33305f.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        f33305f.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        f33305f.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        f33305f.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        f33305f.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f33305f.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        f33305f.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        f33305f.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        f33305f.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        f33305f.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        f33305f.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        f33305f.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        f33305f.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        f33305f.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        f33305f.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        f33305f.append(R.styleable.Constraint_android_layout_marginRight, 28);
        f33305f.append(R.styleable.Constraint_android_layout_marginStart, 31);
        f33305f.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        f33305f.append(R.styleable.Constraint_android_layout_marginTop, 34);
        f33305f.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        f33305f.append(R.styleable.Constraint_android_layout_width, 23);
        f33305f.append(R.styleable.Constraint_android_layout_height, 21);
        f33305f.append(R.styleable.Constraint_layout_constraintWidth, 95);
        f33305f.append(R.styleable.Constraint_layout_constraintHeight, 96);
        f33305f.append(R.styleable.Constraint_android_visibility, 22);
        f33305f.append(R.styleable.Constraint_android_alpha, 43);
        f33305f.append(R.styleable.Constraint_android_elevation, 44);
        f33305f.append(R.styleable.Constraint_android_rotationX, 45);
        f33305f.append(R.styleable.Constraint_android_rotationY, 46);
        f33305f.append(R.styleable.Constraint_android_rotation, 60);
        f33305f.append(R.styleable.Constraint_android_scaleX, 47);
        f33305f.append(R.styleable.Constraint_android_scaleY, 48);
        f33305f.append(R.styleable.Constraint_android_transformPivotX, 49);
        f33305f.append(R.styleable.Constraint_android_transformPivotY, 50);
        f33305f.append(R.styleable.Constraint_android_translationX, 51);
        f33305f.append(R.styleable.Constraint_android_translationY, 52);
        f33305f.append(R.styleable.Constraint_android_translationZ, 53);
        f33305f.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        f33305f.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        f33305f.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        f33305f.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        f33305f.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        f33305f.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        f33305f.append(R.styleable.Constraint_layout_constraintCircle, 61);
        f33305f.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        f33305f.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        f33305f.append(R.styleable.Constraint_animateRelativeTo, 64);
        f33305f.append(R.styleable.Constraint_transitionEasing, 65);
        f33305f.append(R.styleable.Constraint_drawPath, 66);
        f33305f.append(R.styleable.Constraint_transitionPathRotate, 67);
        f33305f.append(R.styleable.Constraint_motionStagger, 79);
        f33305f.append(R.styleable.Constraint_android_id, 38);
        f33305f.append(R.styleable.Constraint_motionProgress, 68);
        f33305f.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        f33305f.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        f33305f.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        f33305f.append(R.styleable.Constraint_chainUseRtl, 71);
        f33305f.append(R.styleable.Constraint_barrierDirection, 72);
        f33305f.append(R.styleable.Constraint_barrierMargin, 73);
        f33305f.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        f33305f.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        f33305f.append(R.styleable.Constraint_pathMotionArc, 76);
        f33305f.append(R.styleable.Constraint_layout_constraintTag, 77);
        f33305f.append(R.styleable.Constraint_visibilityMode, 78);
        f33305f.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        f33305f.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        f33305f.append(R.styleable.Constraint_polarRelativeTo, 82);
        f33305f.append(R.styleable.Constraint_transformPivotTarget, 83);
        f33305f.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        f33305f.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        f33305f.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        f33306g.append(R.styleable.ConstraintOverride_layout_editor_absoluteY, 6);
        f33306g.append(R.styleable.ConstraintOverride_layout_editor_absoluteY, 7);
        f33306g.append(R.styleable.ConstraintOverride_android_orientation, 27);
        f33306g.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        f33306g.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        f33306g.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        f33306g.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        f33306g.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        f33306g.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        f33306g.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        f33306g.append(R.styleable.ConstraintOverride_android_visibility, 22);
        f33306g.append(R.styleable.ConstraintOverride_android_alpha, 43);
        f33306g.append(R.styleable.ConstraintOverride_android_elevation, 44);
        f33306g.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        f33306g.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        f33306g.append(R.styleable.ConstraintOverride_android_rotation, 60);
        f33306g.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        f33306g.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        f33306g.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        f33306g.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        f33306g.append(R.styleable.ConstraintOverride_android_translationX, 51);
        f33306g.append(R.styleable.ConstraintOverride_android_translationY, 52);
        f33306g.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        f33306g.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        f33306g.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        f33306g.append(R.styleable.ConstraintOverride_drawPath, 66);
        f33306g.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        f33306g.append(R.styleable.ConstraintOverride_motionStagger, 79);
        f33306g.append(R.styleable.ConstraintOverride_android_id, 38);
        f33306g.append(R.styleable.ConstraintOverride_motionTarget, 98);
        f33306g.append(R.styleable.ConstraintOverride_motionProgress, 68);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        f33306g.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        f33306g.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        f33306g.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        f33306g.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        f33306g.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f33306g.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        f33306g.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        f33306g.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        f33306g.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        f33306g.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        f33306g.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        f33306g.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        f33306g.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        f33306g.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        f33306g.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        f33306g.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static Constraint buildDelta(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintOverride);
        m58106s(context, constraint, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    /* renamed from: n */
    public static int m58111n(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r4 == (-1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m58110o(java.lang.Object r3, android.content.res.TypedArray r4, int r5, int r6) {
        /*
            if (r3 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r4.peekValue(r5)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L6f
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L28
            int r4 = r4.getInt(r5, r2)
            r5 = -4
            r0 = -2
            if (r4 == r5) goto L24
            r5 = -3
            if (r4 == r5) goto L20
            if (r4 == r0) goto L22
            r5 = -1
            if (r4 == r5) goto L22
        L20:
            r4 = 0
            goto L2d
        L22:
            r2 = r4
            goto L20
        L24:
            r2 = 1
            r4 = 1
            r2 = -2
            goto L2d
        L28:
            int r4 = r4.getDimensionPixelSize(r5, r2)
            goto L22
        L2d:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r5 == 0) goto L3f
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            if (r6 != 0) goto L3a
            r3.width = r2
            r3.constrainedWidth = r4
            goto L6e
        L3a:
            r3.height = r2
            r3.constrainedHeight = r4
            goto L6e
        L3f:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout
            if (r5 == 0) goto L51
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r3
            if (r6 != 0) goto L4c
            r3.mWidth = r2
            r3.constrainedWidth = r4
            goto L6e
        L4c:
            r3.mHeight = r2
            r3.constrainedHeight = r4
            goto L6e
        L51:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.C3782a
            if (r5 == 0) goto L6e
            androidx.constraintlayout.widget.ConstraintSet$Constraint$a r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.C3782a) r3
            if (r6 != 0) goto L64
            r5 = 23
            r3.m58083b(r5, r2)
            r5 = 80
            r3.m58081d(r5, r4)
            goto L6e
        L64:
            r5 = 21
            r3.m58083b(r5, r2)
            r5 = 81
            r3.m58081d(r5, r4)
        L6e:
            return
        L6f:
            java.lang.String r4 = r4.getString(r5)
            m58109p(r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.m58110o(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: p */
    public static void m58109p(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                        }
                        m58108q(layoutParams, trim2);
                        return;
                    } else if (obj instanceof Layout) {
                        ((Layout) obj).dimensionRatio = trim2;
                        return;
                    } else if (obj instanceof Constraint.C3782a) {
                        ((Constraint.C3782a) obj).m58082c(5, trim2);
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                                layoutParams2.horizontalWeight = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                layoutParams2.verticalWeight = parseFloat;
                            }
                        } else if (obj instanceof Layout) {
                            Layout layout = (Layout) obj;
                            if (i == 0) {
                                layout.mWidth = 0;
                                layout.horizontalWeight = parseFloat;
                            } else {
                                layout.mHeight = 0;
                                layout.verticalWeight = parseFloat;
                            }
                        } else if (obj instanceof Constraint.C3782a) {
                            Constraint.C3782a c3782a = (Constraint.C3782a) obj;
                            if (i == 0) {
                                c3782a.m58083b(23, 0);
                                c3782a.m58084a(39, parseFloat);
                            } else {
                                c3782a.m58083b(21, 0);
                                c3782a.m58084a(40, parseFloat);
                            }
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                                layoutParams3.matchConstraintPercentWidth = max;
                                layoutParams3.matchConstraintDefaultWidth = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                                layoutParams3.matchConstraintPercentHeight = max;
                                layoutParams3.matchConstraintDefaultHeight = 2;
                            }
                        } else if (obj instanceof Layout) {
                            Layout layout2 = (Layout) obj;
                            if (i == 0) {
                                layout2.mWidth = 0;
                                layout2.widthPercent = max;
                                layout2.widthDefault = 2;
                            } else {
                                layout2.mHeight = 0;
                                layout2.heightPercent = max;
                                layout2.heightDefault = 2;
                            }
                        } else if (obj instanceof Constraint.C3782a) {
                            Constraint.C3782a c3782a2 = (Constraint.C3782a) obj;
                            if (i == 0) {
                                c3782a2.m58083b(23, 0);
                                c3782a2.m58083b(54, 2);
                            } else {
                                c3782a2.m58083b(21, 0);
                                c3782a2.m58083b(55, 2);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* renamed from: q */
    public static void m58108q(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i2, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                } else {
                    String substring4 = str.substring(i2);
                    if (substring4.length() > 0) {
                        f = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.dimensionRatio = str;
        layoutParams.f33255c = f;
        layoutParams.f33256d = i;
    }

    /* renamed from: s */
    public static void m58106s(Context context, Constraint constraint, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        Constraint.C3782a c3782a = new Constraint.C3782a();
        constraint.f33313c = c3782a;
        constraint.motion.mApply = false;
        constraint.layout.mApply = false;
        constraint.propertySet.mApply = false;
        constraint.transform.mApply = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f33306g.get(index)) {
                case 2:
                    c3782a.m58083b(2, typedArray.getDimensionPixelSize(index, constraint.layout.bottomMargin));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case SyslogConstants.LOG_FTP /* 88 */:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f33305f.get(index));
                    break;
                case 5:
                    c3782a.m58082c(5, typedArray.getString(index));
                    break;
                case 6:
                    c3782a.m58083b(6, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX));
                    break;
                case 7:
                    c3782a.m58083b(7, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY));
                    break;
                case 8:
                    c3782a.m58083b(8, typedArray.getDimensionPixelSize(index, constraint.layout.endMargin));
                    break;
                case 11:
                    c3782a.m58083b(11, typedArray.getDimensionPixelSize(index, constraint.layout.goneBottomMargin));
                    break;
                case 12:
                    c3782a.m58083b(12, typedArray.getDimensionPixelSize(index, constraint.layout.goneEndMargin));
                    break;
                case 13:
                    c3782a.m58083b(13, typedArray.getDimensionPixelSize(index, constraint.layout.goneLeftMargin));
                    break;
                case 14:
                    c3782a.m58083b(14, typedArray.getDimensionPixelSize(index, constraint.layout.goneRightMargin));
                    break;
                case 15:
                    c3782a.m58083b(15, typedArray.getDimensionPixelSize(index, constraint.layout.goneStartMargin));
                    break;
                case 16:
                    c3782a.m58083b(16, typedArray.getDimensionPixelSize(index, constraint.layout.goneTopMargin));
                    break;
                case 17:
                    c3782a.m58083b(17, typedArray.getDimensionPixelOffset(index, constraint.layout.guideBegin));
                    break;
                case 18:
                    c3782a.m58083b(18, typedArray.getDimensionPixelOffset(index, constraint.layout.guideEnd));
                    break;
                case 19:
                    c3782a.m58084a(19, typedArray.getFloat(index, constraint.layout.guidePercent));
                    break;
                case 20:
                    c3782a.m58084a(20, typedArray.getFloat(index, constraint.layout.horizontalBias));
                    break;
                case 21:
                    c3782a.m58083b(21, typedArray.getLayoutDimension(index, constraint.layout.mHeight));
                    break;
                case 22:
                    c3782a.m58083b(22, f33304e[typedArray.getInt(index, constraint.propertySet.visibility)]);
                    break;
                case 23:
                    c3782a.m58083b(23, typedArray.getLayoutDimension(index, constraint.layout.mWidth));
                    break;
                case 24:
                    c3782a.m58083b(24, typedArray.getDimensionPixelSize(index, constraint.layout.leftMargin));
                    break;
                case 27:
                    c3782a.m58083b(27, typedArray.getInt(index, constraint.layout.orientation));
                    break;
                case 28:
                    c3782a.m58083b(28, typedArray.getDimensionPixelSize(index, constraint.layout.rightMargin));
                    break;
                case 31:
                    c3782a.m58083b(31, typedArray.getDimensionPixelSize(index, constraint.layout.startMargin));
                    break;
                case 34:
                    c3782a.m58083b(34, typedArray.getDimensionPixelSize(index, constraint.layout.topMargin));
                    break;
                case 37:
                    c3782a.m58084a(37, typedArray.getFloat(index, constraint.layout.verticalBias));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.f33311a);
                    constraint.f33311a = resourceId;
                    c3782a.m58083b(38, resourceId);
                    break;
                case 39:
                    c3782a.m58084a(39, typedArray.getFloat(index, constraint.layout.horizontalWeight));
                    break;
                case 40:
                    c3782a.m58084a(40, typedArray.getFloat(index, constraint.layout.verticalWeight));
                    break;
                case 41:
                    c3782a.m58083b(41, typedArray.getInt(index, constraint.layout.horizontalChainStyle));
                    break;
                case 42:
                    c3782a.m58083b(42, typedArray.getInt(index, constraint.layout.verticalChainStyle));
                    break;
                case 43:
                    c3782a.m58084a(43, typedArray.getFloat(index, constraint.propertySet.alpha));
                    break;
                case 44:
                    c3782a.m58081d(44, true);
                    c3782a.m58084a(44, typedArray.getDimension(index, constraint.transform.elevation));
                    break;
                case 45:
                    c3782a.m58084a(45, typedArray.getFloat(index, constraint.transform.rotationX));
                    break;
                case 46:
                    c3782a.m58084a(46, typedArray.getFloat(index, constraint.transform.rotationY));
                    break;
                case 47:
                    c3782a.m58084a(47, typedArray.getFloat(index, constraint.transform.scaleX));
                    break;
                case 48:
                    c3782a.m58084a(48, typedArray.getFloat(index, constraint.transform.scaleY));
                    break;
                case 49:
                    c3782a.m58084a(49, typedArray.getDimension(index, constraint.transform.transformPivotX));
                    break;
                case 50:
                    c3782a.m58084a(50, typedArray.getDimension(index, constraint.transform.transformPivotY));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    c3782a.m58084a(51, typedArray.getDimension(index, constraint.transform.translationX));
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    c3782a.m58084a(52, typedArray.getDimension(index, constraint.transform.translationY));
                    break;
                case EACTags.SEX /* 53 */:
                    c3782a.m58084a(53, typedArray.getDimension(index, constraint.transform.translationZ));
                    break;
                case 54:
                    c3782a.m58083b(54, typedArray.getInt(index, constraint.layout.widthDefault));
                    break;
                case 55:
                    c3782a.m58083b(55, typedArray.getInt(index, constraint.layout.heightDefault));
                    break;
                case 56:
                    c3782a.m58083b(56, typedArray.getDimensionPixelSize(index, constraint.layout.widthMax));
                    break;
                case 57:
                    c3782a.m58083b(57, typedArray.getDimensionPixelSize(index, constraint.layout.heightMax));
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    c3782a.m58083b(58, typedArray.getDimensionPixelSize(index, constraint.layout.widthMin));
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    c3782a.m58083b(59, typedArray.getDimensionPixelSize(index, constraint.layout.heightMin));
                    break;
                case 60:
                    c3782a.m58084a(60, typedArray.getFloat(index, constraint.transform.rotation));
                    break;
                case 62:
                    c3782a.m58083b(62, typedArray.getDimensionPixelSize(index, constraint.layout.circleRadius));
                    break;
                case 63:
                    c3782a.m58084a(63, typedArray.getFloat(index, constraint.layout.circleAngle));
                    break;
                case 64:
                    c3782a.m58083b(64, m58111n(typedArray, index, constraint.motion.mAnimateRelativeTo));
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        c3782a.m58082c(65, typedArray.getString(index));
                        break;
                    } else {
                        c3782a.m58082c(65, Easing.NAMED_EASING[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    c3782a.m58083b(66, typedArray.getInt(index, 0));
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    c3782a.m58084a(67, typedArray.getFloat(index, constraint.motion.mPathRotate));
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    c3782a.m58084a(68, typedArray.getFloat(index, constraint.propertySet.mProgress));
                    break;
                case EACTags.DISPLAY_IMAGE /* 69 */:
                    c3782a.m58084a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c3782a.m58084a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case EACTags.MESSAGE_REFERENCE /* 71 */:
                    break;
                case 72:
                    c3782a.m58083b(72, typedArray.getInt(index, constraint.layout.mBarrierDirection));
                    break;
                case 73:
                    c3782a.m58083b(73, typedArray.getDimensionPixelSize(index, constraint.layout.mBarrierMargin));
                    break;
                case 74:
                    c3782a.m58082c(74, typedArray.getString(index));
                    break;
                case 75:
                    c3782a.m58081d(75, typedArray.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    c3782a.m58083b(76, typedArray.getInt(index, constraint.motion.mPathMotionArc));
                    break;
                case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                    c3782a.m58082c(77, typedArray.getString(index));
                    break;
                case 78:
                    c3782a.m58083b(78, typedArray.getInt(index, constraint.propertySet.mVisibilityMode));
                    break;
                case 79:
                    c3782a.m58084a(79, typedArray.getFloat(index, constraint.motion.mMotionStagger));
                    break;
                case 80:
                    c3782a.m58081d(80, typedArray.getBoolean(index, constraint.layout.constrainedWidth));
                    break;
                case EACTags.ANSWER_TO_RESET /* 81 */:
                    c3782a.m58081d(81, typedArray.getBoolean(index, constraint.layout.constrainedHeight));
                    break;
                case EACTags.HISTORICAL_BYTES /* 82 */:
                    c3782a.m58083b(82, typedArray.getInteger(index, constraint.motion.mAnimateCircleAngleTo));
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 83 */:
                    c3782a.m58083b(83, m58111n(typedArray, index, constraint.transform.transformPivotTarget));
                    break;
                case 84:
                    c3782a.m58083b(84, typedArray.getInteger(index, constraint.motion.mQuantizeMotionSteps));
                    break;
                case CustomerEnquiry700MhzFragment.hiddenSubProdHeight /* 85 */:
                    c3782a.m58084a(85, typedArray.getFloat(index, constraint.motion.mQuantizeMotionPhase));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        c3782a.m58083b(89, constraint.motion.mQuantizeInterpolatorID);
                        Motion motion = constraint.motion;
                        if (motion.mQuantizeInterpolatorID != -1) {
                            motion.mQuantizeInterpolatorType = -2;
                            c3782a.m58083b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        c3782a.m58082c(90, constraint.motion.mQuantizeInterpolatorString);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            c3782a.m58083b(89, constraint.motion.mQuantizeInterpolatorID);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            c3782a.m58083b(88, -2);
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            c3782a.m58083b(88, -1);
                            break;
                        }
                    } else {
                        Motion motion2 = constraint.motion;
                        motion2.mQuantizeInterpolatorType = typedArray.getInteger(index, motion2.mQuantizeInterpolatorID);
                        c3782a.m58083b(88, constraint.motion.mQuantizeInterpolatorType);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f33305f.get(index));
                    break;
                case 93:
                    c3782a.m58083b(93, typedArray.getDimensionPixelSize(index, constraint.layout.baselineMargin));
                    break;
                case 94:
                    c3782a.m58083b(94, typedArray.getDimensionPixelSize(index, constraint.layout.goneBaselineMargin));
                    break;
                case 95:
                    m58110o(c3782a, typedArray, index, 0);
                    break;
                case SyslogConstants.LOG_NTP /* 96 */:
                    m58110o(c3782a, typedArray, index, 1);
                    break;
                case 97:
                    c3782a.m58083b(97, typedArray.getInt(index, constraint.layout.mWrapBehavior));
                    break;
                case 98:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId2 = typedArray.getResourceId(index, constraint.f33311a);
                        constraint.f33311a = resourceId2;
                        if (resourceId2 == -1) {
                            constraint.f33312b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.f33312b = typedArray.getString(index);
                        break;
                    } else {
                        constraint.f33311a = typedArray.getResourceId(index, constraint.f33311a);
                        break;
                    }
                case 99:
                    c3782a.m58081d(99, typedArray.getBoolean(index, constraint.layout.guidelineUseRtl));
                    break;
            }
        }
    }

    /* renamed from: t */
    public static void m58105t(Constraint constraint, int i, float f) {
        if (i != 19) {
            if (i != 20) {
                if (i != 37) {
                    if (i != 60) {
                        if (i != 63) {
                            if (i != 79) {
                                if (i != 85) {
                                    if (i != 87) {
                                        if (i != 39) {
                                            if (i != 40) {
                                                switch (i) {
                                                    case 43:
                                                        constraint.propertySet.alpha = f;
                                                        return;
                                                    case 44:
                                                        Transform transform = constraint.transform;
                                                        transform.elevation = f;
                                                        transform.applyElevation = true;
                                                        return;
                                                    case 45:
                                                        constraint.transform.rotationX = f;
                                                        return;
                                                    case 46:
                                                        constraint.transform.rotationY = f;
                                                        return;
                                                    case 47:
                                                        constraint.transform.scaleX = f;
                                                        return;
                                                    case 48:
                                                        constraint.transform.scaleY = f;
                                                        return;
                                                    case 49:
                                                        constraint.transform.transformPivotX = f;
                                                        return;
                                                    case 50:
                                                        constraint.transform.transformPivotY = f;
                                                        return;
                                                    case EACTags.TRANSACTION_DATE /* 51 */:
                                                        constraint.transform.translationX = f;
                                                        return;
                                                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                        constraint.transform.translationY = f;
                                                        return;
                                                    case EACTags.SEX /* 53 */:
                                                        constraint.transform.translationZ = f;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                                                constraint.motion.mPathRotate = f;
                                                                return;
                                                            case EACTags.APPLICATION_IMAGE /* 68 */:
                                                                constraint.propertySet.mProgress = f;
                                                                return;
                                                            case EACTags.DISPLAY_IMAGE /* 69 */:
                                                                constraint.layout.widthPercent = f;
                                                                return;
                                                            case 70:
                                                                constraint.layout.heightPercent = f;
                                                                return;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                return;
                                                        }
                                                }
                                            }
                                            constraint.layout.verticalWeight = f;
                                            return;
                                        }
                                        constraint.layout.horizontalWeight = f;
                                        return;
                                    }
                                    return;
                                }
                                constraint.motion.mQuantizeMotionPhase = f;
                                return;
                            }
                            constraint.motion.mMotionStagger = f;
                            return;
                        }
                        constraint.layout.circleAngle = f;
                        return;
                    }
                    constraint.transform.rotation = f;
                    return;
                }
                constraint.layout.verticalBias = f;
                return;
            }
            constraint.layout.horizontalBias = f;
            return;
        }
        constraint.layout.guidePercent = f;
    }

    /* renamed from: u */
    public static void m58104u(Constraint constraint, int i, int i2) {
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    if (i != 27) {
                        if (i != 28) {
                            if (i != 41) {
                                if (i != 42) {
                                    if (i != 61) {
                                        if (i != 62) {
                                            if (i != 72) {
                                                if (i != 73) {
                                                    switch (i) {
                                                        case 2:
                                                            constraint.layout.bottomMargin = i2;
                                                            return;
                                                        case 11:
                                                            constraint.layout.goneBottomMargin = i2;
                                                            return;
                                                        case 12:
                                                            constraint.layout.goneEndMargin = i2;
                                                            return;
                                                        case 13:
                                                            constraint.layout.goneLeftMargin = i2;
                                                            return;
                                                        case 14:
                                                            constraint.layout.goneRightMargin = i2;
                                                            return;
                                                        case 15:
                                                            constraint.layout.goneStartMargin = i2;
                                                            return;
                                                        case 16:
                                                            constraint.layout.goneTopMargin = i2;
                                                            return;
                                                        case 17:
                                                            constraint.layout.guideBegin = i2;
                                                            return;
                                                        case 18:
                                                            constraint.layout.guideEnd = i2;
                                                            return;
                                                        case 31:
                                                            constraint.layout.startMargin = i2;
                                                            return;
                                                        case 34:
                                                            constraint.layout.topMargin = i2;
                                                            return;
                                                        case 38:
                                                            constraint.f33311a = i2;
                                                            return;
                                                        case 64:
                                                            constraint.motion.mAnimateRelativeTo = i2;
                                                            return;
                                                        case EACTags.ADDRESS /* 66 */:
                                                            constraint.motion.mDrawPath = i2;
                                                            return;
                                                        case 76:
                                                            constraint.motion.mPathMotionArc = i2;
                                                            return;
                                                        case 78:
                                                            constraint.propertySet.mVisibilityMode = i2;
                                                            return;
                                                        case 93:
                                                            constraint.layout.baselineMargin = i2;
                                                            return;
                                                        case 94:
                                                            constraint.layout.goneBaselineMargin = i2;
                                                            return;
                                                        case 97:
                                                            constraint.layout.mWrapBehavior = i2;
                                                            return;
                                                        default:
                                                            switch (i) {
                                                                case 21:
                                                                    constraint.layout.mHeight = i2;
                                                                    return;
                                                                case 22:
                                                                    constraint.propertySet.visibility = i2;
                                                                    return;
                                                                case 23:
                                                                    constraint.layout.mWidth = i2;
                                                                    return;
                                                                case 24:
                                                                    constraint.layout.leftMargin = i2;
                                                                    return;
                                                                default:
                                                                    switch (i) {
                                                                        case 54:
                                                                            constraint.layout.widthDefault = i2;
                                                                            return;
                                                                        case 55:
                                                                            constraint.layout.heightDefault = i2;
                                                                            return;
                                                                        case 56:
                                                                            constraint.layout.widthMax = i2;
                                                                            return;
                                                                        case 57:
                                                                            constraint.layout.heightMax = i2;
                                                                            return;
                                                                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                                                            constraint.layout.widthMin = i2;
                                                                            return;
                                                                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                                                            constraint.layout.heightMin = i2;
                                                                            return;
                                                                        default:
                                                                            switch (i) {
                                                                                case EACTags.HISTORICAL_BYTES /* 82 */:
                                                                                    constraint.motion.mAnimateCircleAngleTo = i2;
                                                                                    return;
                                                                                case ModuleDescriptor.MODULE_VERSION /* 83 */:
                                                                                    constraint.transform.transformPivotTarget = i2;
                                                                                    return;
                                                                                case 84:
                                                                                    constraint.motion.mQuantizeMotionSteps = i2;
                                                                                    return;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 87:
                                                                                            return;
                                                                                        case SyslogConstants.LOG_FTP /* 88 */:
                                                                                            constraint.motion.mQuantizeInterpolatorType = i2;
                                                                                            return;
                                                                                        case 89:
                                                                                            constraint.motion.mQuantizeInterpolatorID = i2;
                                                                                            return;
                                                                                        default:
                                                                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                            return;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                                constraint.layout.mBarrierMargin = i2;
                                                return;
                                            }
                                            constraint.layout.mBarrierDirection = i2;
                                            return;
                                        }
                                        constraint.layout.circleRadius = i2;
                                        return;
                                    }
                                    constraint.layout.circleConstraint = i2;
                                    return;
                                }
                                constraint.layout.verticalChainStyle = i2;
                                return;
                            }
                            constraint.layout.horizontalChainStyle = i2;
                            return;
                        }
                        constraint.layout.rightMargin = i2;
                        return;
                    }
                    constraint.layout.orientation = i2;
                    return;
                }
                constraint.layout.endMargin = i2;
                return;
            }
            constraint.layout.editorAbsoluteY = i2;
            return;
        }
        constraint.layout.editorAbsoluteX = i2;
    }

    /* renamed from: v */
    public static void m58103v(Constraint constraint, int i, String str) {
        if (i != 5) {
            if (i != 65) {
                if (i != 74) {
                    if (i != 77) {
                        if (i != 87) {
                            if (i != 90) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                            } else {
                                constraint.motion.mQuantizeInterpolatorString = str;
                                return;
                            }
                        }
                        return;
                    }
                    constraint.layout.mConstraintTag = str;
                    return;
                }
                Layout layout = constraint.layout;
                layout.mReferenceIdString = str;
                layout.mReferenceIds = null;
                return;
            }
            constraint.motion.mTransitionEasing = str;
            return;
        }
        constraint.layout.dimensionRatio = str;
    }

    /* renamed from: w */
    public static void m58102w(Constraint constraint, int i, boolean z) {
        if (i != 44) {
            if (i != 75) {
                if (i != 87) {
                    if (i != 80) {
                        if (i != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            return;
                        } else {
                            constraint.layout.constrainedHeight = z;
                            return;
                        }
                    }
                    constraint.layout.constrainedWidth = z;
                    return;
                }
                return;
            }
            constraint.layout.mBarrierAllowsGoneWidgets = z;
            return;
        }
        constraint.transform.applyElevation = z;
    }

    /* renamed from: y */
    public static String[] m58100y(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void addColorAttributes(String... strArr) {
        m58117h(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        m58117h(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        m58117h(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        m58117h(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        connect(i, 1, i2, i4, 0);
        if (i3 == 0) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        connect(i, 2, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            connect(i3, 1, i, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 6;
        } else {
            i4 = 7;
        }
        connect(i, 6, i2, i4, 0);
        if (i3 == 0) {
            i5 = 7;
        } else {
            i5 = 6;
        }
        connect(i, 7, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            connect(i3, 6, i, 7, 0);
        }
    }

    public void addToVerticalChain(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 3;
        } else {
            i4 = 4;
        }
        connect(i, 3, i2, i4, 0);
        if (i3 == 0) {
            i5 = 4;
        } else {
            i5 = 3;
        }
        connect(i, 4, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            connect(i3, 3, i, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.f33310d.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + Debug.getName(childAt));
            } else if (this.f33309c && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.f33310d.containsKey(Integer.valueOf(id2)) && (constraint = (Constraint) this.f33310d.get(Integer.valueOf(id2))) != null) {
                    ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                }
            }
        }
    }

    public void applyDeltaFrom(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.f33310d.values()) {
            if (constraint.f33313c != null) {
                if (constraint.f33312b != null) {
                    for (Integer num : this.f33310d.keySet()) {
                        Constraint constraint2 = getConstraint(num.intValue());
                        String str = constraint2.layout.mConstraintTag;
                        if (str != null && constraint.f33312b.matches(str)) {
                            constraint.f33313c.m58080e(constraint2);
                            constraint2.mCustomConstraints.putAll((HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                } else {
                    constraint.f33313c.m58080e(getConstraint(constraint.f33311a));
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        m58116i(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        Constraint constraint;
        int id2 = constraintHelper.getId();
        if (this.f33310d.containsKey(Integer.valueOf(id2)) && (constraint = (Constraint) this.f33310d.get(Integer.valueOf(id2))) != null && (constraintWidget instanceof HelperWidget)) {
            constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void applyToLayoutParams(int i, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        if (this.f33310d.containsKey(Integer.valueOf(i)) && (constraint = (Constraint) this.f33310d.get(Integer.valueOf(i))) != null) {
            constraint.applyTo(layoutParams);
        }
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        m58116i(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void center(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        if (i4 >= 0) {
            if (i7 >= 0) {
                if (f > 0.0f && f <= 1.0f) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 6 && i3 != 7) {
                            connect(i, 3, i2, i3, i4);
                            connect(i, 4, i5, i6, i7);
                            Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(i));
                            if (constraint != null) {
                                constraint.layout.verticalBias = f;
                                return;
                            }
                            return;
                        }
                        connect(i, 6, i2, i3, i4);
                        connect(i, 7, i5, i6, i7);
                        Constraint constraint2 = (Constraint) this.f33310d.get(Integer.valueOf(i));
                        if (constraint2 != null) {
                            constraint2.layout.horizontalBias = f;
                            return;
                        }
                        return;
                    }
                    connect(i, 1, i2, i3, i4);
                    connect(i, 2, i5, i6, i7);
                    Constraint constraint3 = (Constraint) this.f33310d.get(Integer.valueOf(i));
                    if (constraint3 != null) {
                        constraint3.layout.horizontalBias = f;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public void centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 1, i2, i3, i4);
        connect(i, 2, i5, i6, i7);
        Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.horizontalBias = f;
        }
    }

    public void centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 6, i2, i3, i4);
        connect(i, 7, i5, i6, i7);
        Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.horizontalBias = f;
        }
    }

    public void centerVertically(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 3, i2, i3, i4);
        connect(i, 4, i5, i6, i7);
        Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(i));
        if (constraint != null) {
            constraint.layout.verticalBias = f;
        }
    }

    public void clear(int i) {
        this.f33310d.remove(Integer.valueOf(i));
    }

    public void clone(Context context, int i) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void connect(int i, int i2, int i3, int i4, int i5) {
        if (!this.f33310d.containsKey(Integer.valueOf(i))) {
            this.f33310d.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(i));
        if (constraint == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i3;
                    layout.leftToRight = -1;
                } else if (i4 == 2) {
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i3;
                    layout2.leftToLeft = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + m58101x(i4) + " undefined");
                }
                constraint.layout.leftMargin = i5;
                return;
            case 2:
                if (i4 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i3;
                    layout3.rightToRight = -1;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i3;
                    layout4.rightToLeft = -1;
                }
                constraint.layout.rightMargin = i5;
                return;
            case 3:
                if (i4 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i3;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                } else if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout6 = constraint.layout;
                    layout6.topToBottom = i3;
                    layout6.topToTop = -1;
                    layout6.baselineToBaseline = -1;
                    layout6.baselineToTop = -1;
                    layout6.baselineToBottom = -1;
                }
                constraint.layout.topMargin = i5;
                return;
            case 4:
                if (i4 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i3;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                } else if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout8 = constraint.layout;
                    layout8.bottomToTop = i3;
                    layout8.bottomToBottom = -1;
                    layout8.baselineToBaseline = -1;
                    layout8.baselineToTop = -1;
                    layout8.baselineToBottom = -1;
                }
                constraint.layout.bottomMargin = i5;
                return;
            case 5:
                if (i4 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i3;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                } else if (i4 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i3;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                } else if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout11 = constraint.layout;
                    layout11.baselineToBottom = i3;
                    layout11.bottomToBottom = -1;
                    layout11.bottomToTop = -1;
                    layout11.topToTop = -1;
                    layout11.topToBottom = -1;
                    return;
                }
            case 6:
                if (i4 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i3;
                    layout12.startToEnd = -1;
                } else if (i4 != 7) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i3;
                    layout13.startToStart = -1;
                }
                constraint.layout.startMargin = i5;
                return;
            case 7:
                if (i4 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i3;
                    layout14.endToStart = -1;
                } else if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i3;
                    layout15.endToEnd = -1;
                }
                constraint.layout.endMargin = i5;
                return;
            default:
                throw new IllegalArgumentException(m58101x(i2) + " to " + m58101x(i4) + " unknown");
        }
    }

    public void constrainCircle(int i, int i2, int i3, float f) {
        Layout layout = m58112m(i).layout;
        layout.circleConstraint = i2;
        layout.circleRadius = i3;
        layout.circleAngle = f;
    }

    public void constrainDefaultHeight(int i, int i2) {
        m58112m(i).layout.heightDefault = i2;
    }

    public void constrainDefaultWidth(int i, int i2) {
        m58112m(i).layout.widthDefault = i2;
    }

    public void constrainHeight(int i, int i2) {
        m58112m(i).layout.mHeight = i2;
    }

    public void constrainMaxHeight(int i, int i2) {
        m58112m(i).layout.heightMax = i2;
    }

    public void constrainMaxWidth(int i, int i2) {
        m58112m(i).layout.widthMax = i2;
    }

    public void constrainMinHeight(int i, int i2) {
        m58112m(i).layout.heightMin = i2;
    }

    public void constrainMinWidth(int i, int i2) {
        m58112m(i).layout.widthMin = i2;
    }

    public void constrainPercentHeight(int i, float f) {
        m58112m(i).layout.heightPercent = f;
    }

    public void constrainPercentWidth(int i, float f) {
        m58112m(i).layout.widthPercent = f;
    }

    public void constrainWidth(int i, int i2) {
        m58112m(i).layout.mWidth = i2;
    }

    public void constrainedHeight(int i, boolean z) {
        m58112m(i).layout.constrainedHeight = z;
    }

    public void constrainedWidth(int i, boolean z) {
        m58112m(i).layout.constrainedWidth = z;
    }

    public void create(int i, int i2) {
        Layout layout = m58112m(i).layout;
        layout.mIsGuideline = true;
        layout.orientation = i2;
    }

    public void createBarrier(int i, int i2, int i3, int... iArr) {
        Layout layout = m58112m(i).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i2;
        layout.mBarrierMargin = i3;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m58114k(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    public void createHorizontalChainRtl(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m58114k(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    public void createVerticalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length >= 2) {
            if (fArr != null && fArr.length != iArr.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (fArr != null) {
                m58112m(iArr[0]).layout.verticalWeight = fArr[0];
            }
            m58112m(iArr[0]).layout.verticalChainStyle = i5;
            connect(iArr[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr.length; i6++) {
                int i7 = i6 - 1;
                connect(iArr[i6], 3, iArr[i7], 4, 0);
                connect(iArr[i7], 4, iArr[i6], 3, 0);
                if (fArr != null) {
                    m58112m(iArr[i6]).layout.verticalWeight = fArr[i6];
                }
            }
            connect(iArr[iArr.length - 1], 4, i3, i4, 0);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public void dump(MotionScene motionScene, int... iArr) {
        HashSet hashSet;
        Integer[] numArr;
        Set keySet = this.f33310d.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            Constraint constraint = (Constraint) this.f33310d.get(num);
            if (constraint != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                constraint.layout.dump(motionScene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public boolean getApplyElevation(int i) {
        return m58112m(i).transform.applyElevation;
    }

    public Constraint getConstraint(int i) {
        if (this.f33310d.containsKey(Integer.valueOf(i))) {
            return (Constraint) this.f33310d.get(Integer.valueOf(i));
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.f33308b;
    }

    public int getHeight(int i) {
        return m58112m(i).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.f33310d.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i) {
        return m58112m(i);
    }

    public int[] getReferencedIds(int i) {
        int[] iArr = m58112m(i).layout.mReferenceIds;
        if (iArr == null) {
            return new int[0];
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int getVisibility(int i) {
        return m58112m(i).propertySet.visibility;
    }

    public int getVisibilityMode(int i) {
        return m58112m(i).propertySet.mVisibilityMode;
    }

    public int getWidth(int i) {
        return m58112m(i).layout.mWidth;
    }

    /* renamed from: h */
    public final void m58117h(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.f33308b.containsKey(strArr[i])) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.f33308b.get(strArr[i]);
                if (constraintAttribute != null && constraintAttribute.getType() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                this.f33308b.put(strArr[i], new ConstraintAttribute(strArr[i], attributeType));
            }
        }
    }

    /* renamed from: i */
    public void m58116i(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f33310d.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.f33310d.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + Debug.getName(childAt));
            } else if (this.f33309c && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f33310d.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(id2));
                        if (constraint != null) {
                            if (childAt instanceof Barrier) {
                                constraint.layout.mHelperType = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(constraint.layout.mBarrierDirection);
                                barrier.setMargin(constraint.layout.mBarrierMargin);
                                barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                                Layout layout = constraint.layout;
                                int[] iArr = layout.mReferenceIds;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.mReferenceIdString;
                                    if (str != null) {
                                        layout.mReferenceIds = m58115j(barrier, str);
                                        barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.validate();
                            constraint.applyTo(layoutParams);
                            if (z) {
                                ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                            }
                            childAt.setLayoutParams(layoutParams);
                            PropertySet propertySet = constraint.propertySet;
                            if (propertySet.mVisibilityMode == 0) {
                                childAt.setVisibility(propertySet.visibility);
                            }
                            childAt.setAlpha(constraint.propertySet.alpha);
                            childAt.setRotation(constraint.transform.rotation);
                            childAt.setRotationX(constraint.transform.rotationX);
                            childAt.setRotationY(constraint.transform.rotationY);
                            childAt.setScaleX(constraint.transform.scaleX);
                            childAt.setScaleY(constraint.transform.scaleY);
                            Transform transform = constraint.transform;
                            if (transform.transformPivotTarget != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget);
                                if (findViewById != null) {
                                    float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                    float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.transformPivotX)) {
                                    childAt.setPivotX(constraint.transform.transformPivotX);
                                }
                                if (!Float.isNaN(constraint.transform.transformPivotY)) {
                                    childAt.setPivotY(constraint.transform.transformPivotY);
                                }
                            }
                            childAt.setTranslationX(constraint.transform.translationX);
                            childAt.setTranslationY(constraint.transform.translationY);
                            childAt.setTranslationZ(constraint.transform.translationZ);
                            Transform transform2 = constraint.transform;
                            if (transform2.applyElevation) {
                                childAt.setElevation(transform2.elevation);
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WARNING NO CONSTRAINTS for view ");
                        sb.append(id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = (Constraint) this.f33310d.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.layout;
                    int[] iArr2 = layout2.mReferenceIds;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.mReferenceIdString;
                        if (str2 != null) {
                            layout2.mReferenceIds = m58115j(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                        }
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public boolean isForceId() {
        return this.f33309c;
    }

    /* renamed from: j */
    public final int[] m58115j(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: k */
    public final void m58114k(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        if (iArr.length >= 2) {
            if (fArr != null && fArr.length != iArr.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (fArr != null) {
                m58112m(iArr[0]).layout.horizontalWeight = fArr[0];
            }
            m58112m(iArr[0]).layout.horizontalChainStyle = i5;
            connect(iArr[0], i6, i, i2, -1);
            for (int i8 = 1; i8 < iArr.length; i8++) {
                int i9 = i8 - 1;
                connect(iArr[i8], i6, iArr[i9], i7, -1);
                connect(iArr[i9], i7, iArr[i8], i6, -1);
                if (fArr != null) {
                    m58112m(iArr[i8]).layout.horizontalWeight = fArr[i8];
                }
            }
            connect(iArr[iArr.length - 1], i7, i3, i4, -1);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    /* renamed from: l */
    public final Constraint m58113l(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        Constraint constraint = new Constraint();
        if (z) {
            iArr = R.styleable.ConstraintOverride;
        } else {
            iArr = R.styleable.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m58107r(context, constraint, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    public void load(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    Constraint m58113l = m58113l(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m58113l.layout.mIsGuideline = true;
                    }
                    this.f33310d.put(Integer.valueOf(m58113l.f33311a), m58113l);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: m */
    public final Constraint m58112m(int i) {
        if (!this.f33310d.containsKey(Integer.valueOf(i))) {
            this.f33310d.put(Integer.valueOf(i), new Constraint());
        }
        return (Constraint) this.f33310d.get(Integer.valueOf(i));
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length == 2) {
                constraint.m58088l(split2[0], Color.parseColor(split2[1]));
            } else {
                Log.w("ConstraintSet", " Unable to parse " + split[i]);
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length == 2) {
                constraint.m58087m(split2[0], Float.parseFloat(split2[1]));
            } else {
                Log.w("ConstraintSet", " Unable to parse " + split[i]);
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            if (split2.length == 2) {
                constraint.m58087m(split2[0], Integer.decode(split2[1]).intValue());
            } else {
                Log.w("ConstraintSet", " Unable to parse " + split[i]);
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        String[] m58100y = m58100y(str);
        for (int i = 0; i < m58100y.length; i++) {
            String[] split = m58100y[i].split("=");
            Log.w("ConstraintSet", " Unable to parse " + m58100y[i]);
            constraint.m58085o(split[0], split[1]);
        }
    }

    /* renamed from: r */
    public final void m58107r(Context context, Constraint constraint, TypedArray typedArray, boolean z) {
        if (z) {
            m58106s(context, constraint, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index && R.styleable.Constraint_android_layout_marginEnd != index) {
                constraint.motion.mApply = true;
                constraint.layout.mApply = true;
                constraint.propertySet.mApply = true;
                constraint.transform.mApply = true;
            }
            switch (f33305f.get(index)) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.baselineToBaseline = m58111n(typedArray, index, layout.baselineToBaseline);
                    break;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.bottomMargin = typedArray.getDimensionPixelSize(index, layout2.bottomMargin);
                    break;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.bottomToBottom = m58111n(typedArray, index, layout3.bottomToBottom);
                    break;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = m58111n(typedArray, index, layout4.bottomToTop);
                    break;
                case 5:
                    constraint.layout.dimensionRatio = typedArray.getString(index);
                    break;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                    break;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                    break;
                case 8:
                    Layout layout7 = constraint.layout;
                    layout7.endMargin = typedArray.getDimensionPixelSize(index, layout7.endMargin);
                    break;
                case 9:
                    Layout layout8 = constraint.layout;
                    layout8.endToEnd = m58111n(typedArray, index, layout8.endToEnd);
                    break;
                case 10:
                    Layout layout9 = constraint.layout;
                    layout9.endToStart = m58111n(typedArray, index, layout9.endToStart);
                    break;
                case 11:
                    Layout layout10 = constraint.layout;
                    layout10.goneBottomMargin = typedArray.getDimensionPixelSize(index, layout10.goneBottomMargin);
                    break;
                case 12:
                    Layout layout11 = constraint.layout;
                    layout11.goneEndMargin = typedArray.getDimensionPixelSize(index, layout11.goneEndMargin);
                    break;
                case 13:
                    Layout layout12 = constraint.layout;
                    layout12.goneLeftMargin = typedArray.getDimensionPixelSize(index, layout12.goneLeftMargin);
                    break;
                case 14:
                    Layout layout13 = constraint.layout;
                    layout13.goneRightMargin = typedArray.getDimensionPixelSize(index, layout13.goneRightMargin);
                    break;
                case 15:
                    Layout layout14 = constraint.layout;
                    layout14.goneStartMargin = typedArray.getDimensionPixelSize(index, layout14.goneStartMargin);
                    break;
                case 16:
                    Layout layout15 = constraint.layout;
                    layout15.goneTopMargin = typedArray.getDimensionPixelSize(index, layout15.goneTopMargin);
                    break;
                case 17:
                    Layout layout16 = constraint.layout;
                    layout16.guideBegin = typedArray.getDimensionPixelOffset(index, layout16.guideBegin);
                    break;
                case 18:
                    Layout layout17 = constraint.layout;
                    layout17.guideEnd = typedArray.getDimensionPixelOffset(index, layout17.guideEnd);
                    break;
                case 19:
                    Layout layout18 = constraint.layout;
                    layout18.guidePercent = typedArray.getFloat(index, layout18.guidePercent);
                    break;
                case 20:
                    Layout layout19 = constraint.layout;
                    layout19.horizontalBias = typedArray.getFloat(index, layout19.horizontalBias);
                    break;
                case 21:
                    Layout layout20 = constraint.layout;
                    layout20.mHeight = typedArray.getLayoutDimension(index, layout20.mHeight);
                    break;
                case 22:
                    PropertySet propertySet = constraint.propertySet;
                    propertySet.visibility = typedArray.getInt(index, propertySet.visibility);
                    PropertySet propertySet2 = constraint.propertySet;
                    propertySet2.visibility = f33304e[propertySet2.visibility];
                    break;
                case 23:
                    Layout layout21 = constraint.layout;
                    layout21.mWidth = typedArray.getLayoutDimension(index, layout21.mWidth);
                    break;
                case 24:
                    Layout layout22 = constraint.layout;
                    layout22.leftMargin = typedArray.getDimensionPixelSize(index, layout22.leftMargin);
                    break;
                case 25:
                    Layout layout23 = constraint.layout;
                    layout23.leftToLeft = m58111n(typedArray, index, layout23.leftToLeft);
                    break;
                case 26:
                    Layout layout24 = constraint.layout;
                    layout24.leftToRight = m58111n(typedArray, index, layout24.leftToRight);
                    break;
                case 27:
                    Layout layout25 = constraint.layout;
                    layout25.orientation = typedArray.getInt(index, layout25.orientation);
                    break;
                case 28:
                    Layout layout26 = constraint.layout;
                    layout26.rightMargin = typedArray.getDimensionPixelSize(index, layout26.rightMargin);
                    break;
                case 29:
                    Layout layout27 = constraint.layout;
                    layout27.rightToLeft = m58111n(typedArray, index, layout27.rightToLeft);
                    break;
                case 30:
                    Layout layout28 = constraint.layout;
                    layout28.rightToRight = m58111n(typedArray, index, layout28.rightToRight);
                    break;
                case 31:
                    Layout layout29 = constraint.layout;
                    layout29.startMargin = typedArray.getDimensionPixelSize(index, layout29.startMargin);
                    break;
                case 32:
                    Layout layout30 = constraint.layout;
                    layout30.startToEnd = m58111n(typedArray, index, layout30.startToEnd);
                    break;
                case 33:
                    Layout layout31 = constraint.layout;
                    layout31.startToStart = m58111n(typedArray, index, layout31.startToStart);
                    break;
                case 34:
                    Layout layout32 = constraint.layout;
                    layout32.topMargin = typedArray.getDimensionPixelSize(index, layout32.topMargin);
                    break;
                case 35:
                    Layout layout33 = constraint.layout;
                    layout33.topToBottom = m58111n(typedArray, index, layout33.topToBottom);
                    break;
                case 36:
                    Layout layout34 = constraint.layout;
                    layout34.topToTop = m58111n(typedArray, index, layout34.topToTop);
                    break;
                case 37:
                    Layout layout35 = constraint.layout;
                    layout35.verticalBias = typedArray.getFloat(index, layout35.verticalBias);
                    break;
                case 38:
                    constraint.f33311a = typedArray.getResourceId(index, constraint.f33311a);
                    break;
                case 39:
                    Layout layout36 = constraint.layout;
                    layout36.horizontalWeight = typedArray.getFloat(index, layout36.horizontalWeight);
                    break;
                case 40:
                    Layout layout37 = constraint.layout;
                    layout37.verticalWeight = typedArray.getFloat(index, layout37.verticalWeight);
                    break;
                case 41:
                    Layout layout38 = constraint.layout;
                    layout38.horizontalChainStyle = typedArray.getInt(index, layout38.horizontalChainStyle);
                    break;
                case 42:
                    Layout layout39 = constraint.layout;
                    layout39.verticalChainStyle = typedArray.getInt(index, layout39.verticalChainStyle);
                    break;
                case 43:
                    PropertySet propertySet3 = constraint.propertySet;
                    propertySet3.alpha = typedArray.getFloat(index, propertySet3.alpha);
                    break;
                case 44:
                    Transform transform = constraint.transform;
                    transform.applyElevation = true;
                    transform.elevation = typedArray.getDimension(index, transform.elevation);
                    break;
                case 45:
                    Transform transform2 = constraint.transform;
                    transform2.rotationX = typedArray.getFloat(index, transform2.rotationX);
                    break;
                case 46:
                    Transform transform3 = constraint.transform;
                    transform3.rotationY = typedArray.getFloat(index, transform3.rotationY);
                    break;
                case 47:
                    Transform transform4 = constraint.transform;
                    transform4.scaleX = typedArray.getFloat(index, transform4.scaleX);
                    break;
                case 48:
                    Transform transform5 = constraint.transform;
                    transform5.scaleY = typedArray.getFloat(index, transform5.scaleY);
                    break;
                case 49:
                    Transform transform6 = constraint.transform;
                    transform6.transformPivotX = typedArray.getDimension(index, transform6.transformPivotX);
                    break;
                case 50:
                    Transform transform7 = constraint.transform;
                    transform7.transformPivotY = typedArray.getDimension(index, transform7.transformPivotY);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    Transform transform8 = constraint.transform;
                    transform8.translationX = typedArray.getDimension(index, transform8.translationX);
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    Transform transform9 = constraint.transform;
                    transform9.translationY = typedArray.getDimension(index, transform9.translationY);
                    break;
                case EACTags.SEX /* 53 */:
                    Transform transform10 = constraint.transform;
                    transform10.translationZ = typedArray.getDimension(index, transform10.translationZ);
                    break;
                case 54:
                    Layout layout40 = constraint.layout;
                    layout40.widthDefault = typedArray.getInt(index, layout40.widthDefault);
                    break;
                case 55:
                    Layout layout41 = constraint.layout;
                    layout41.heightDefault = typedArray.getInt(index, layout41.heightDefault);
                    break;
                case 56:
                    Layout layout42 = constraint.layout;
                    layout42.widthMax = typedArray.getDimensionPixelSize(index, layout42.widthMax);
                    break;
                case 57:
                    Layout layout43 = constraint.layout;
                    layout43.heightMax = typedArray.getDimensionPixelSize(index, layout43.heightMax);
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    Layout layout44 = constraint.layout;
                    layout44.widthMin = typedArray.getDimensionPixelSize(index, layout44.widthMin);
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    Layout layout45 = constraint.layout;
                    layout45.heightMin = typedArray.getDimensionPixelSize(index, layout45.heightMin);
                    break;
                case 60:
                    Transform transform11 = constraint.transform;
                    transform11.rotation = typedArray.getFloat(index, transform11.rotation);
                    break;
                case 61:
                    Layout layout46 = constraint.layout;
                    layout46.circleConstraint = m58111n(typedArray, index, layout46.circleConstraint);
                    break;
                case 62:
                    Layout layout47 = constraint.layout;
                    layout47.circleRadius = typedArray.getDimensionPixelSize(index, layout47.circleRadius);
                    break;
                case 63:
                    Layout layout48 = constraint.layout;
                    layout48.circleAngle = typedArray.getFloat(index, layout48.circleAngle);
                    break;
                case 64:
                    Motion motion = constraint.motion;
                    motion.mAnimateRelativeTo = m58111n(typedArray, index, motion.mAnimateRelativeTo);
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        constraint.motion.mTransitionEasing = typedArray.getString(index);
                        break;
                    } else {
                        constraint.motion.mTransitionEasing = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    Motion motion2 = constraint.motion;
                    motion2.mPathRotate = typedArray.getFloat(index, motion2.mPathRotate);
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    PropertySet propertySet4 = constraint.propertySet;
                    propertySet4.mProgress = typedArray.getFloat(index, propertySet4.mProgress);
                    break;
                case EACTags.DISPLAY_IMAGE /* 69 */:
                    constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case EACTags.MESSAGE_REFERENCE /* 71 */:
                    break;
                case 72:
                    Layout layout49 = constraint.layout;
                    layout49.mBarrierDirection = typedArray.getInt(index, layout49.mBarrierDirection);
                    break;
                case 73:
                    Layout layout50 = constraint.layout;
                    layout50.mBarrierMargin = typedArray.getDimensionPixelSize(index, layout50.mBarrierMargin);
                    break;
                case 74:
                    constraint.layout.mReferenceIdString = typedArray.getString(index);
                    break;
                case 75:
                    Layout layout51 = constraint.layout;
                    layout51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                    break;
                case 76:
                    Motion motion3 = constraint.motion;
                    motion3.mPathMotionArc = typedArray.getInt(index, motion3.mPathMotionArc);
                    break;
                case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                    constraint.layout.mConstraintTag = typedArray.getString(index);
                    break;
                case 78:
                    PropertySet propertySet5 = constraint.propertySet;
                    propertySet5.mVisibilityMode = typedArray.getInt(index, propertySet5.mVisibilityMode);
                    break;
                case 79:
                    Motion motion4 = constraint.motion;
                    motion4.mMotionStagger = typedArray.getFloat(index, motion4.mMotionStagger);
                    break;
                case 80:
                    Layout layout52 = constraint.layout;
                    layout52.constrainedWidth = typedArray.getBoolean(index, layout52.constrainedWidth);
                    break;
                case EACTags.ANSWER_TO_RESET /* 81 */:
                    Layout layout53 = constraint.layout;
                    layout53.constrainedHeight = typedArray.getBoolean(index, layout53.constrainedHeight);
                    break;
                case EACTags.HISTORICAL_BYTES /* 82 */:
                    Motion motion5 = constraint.motion;
                    motion5.mAnimateCircleAngleTo = typedArray.getInteger(index, motion5.mAnimateCircleAngleTo);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 83 */:
                    Transform transform12 = constraint.transform;
                    transform12.transformPivotTarget = m58111n(typedArray, index, transform12.transformPivotTarget);
                    break;
                case 84:
                    Motion motion6 = constraint.motion;
                    motion6.mQuantizeMotionSteps = typedArray.getInteger(index, motion6.mQuantizeMotionSteps);
                    break;
                case CustomerEnquiry700MhzFragment.hiddenSubProdHeight /* 85 */:
                    Motion motion7 = constraint.motion;
                    motion7.mQuantizeMotionPhase = typedArray.getFloat(index, motion7.mQuantizeMotionPhase);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        Motion motion8 = constraint.motion;
                        if (motion8.mQuantizeInterpolatorID != -1) {
                            motion8.mQuantizeInterpolatorType = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            break;
                        }
                    } else {
                        Motion motion9 = constraint.motion;
                        motion9.mQuantizeInterpolatorType = typedArray.getInteger(index, motion9.mQuantizeInterpolatorID);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f33305f.get(index));
                    break;
                case SyslogConstants.LOG_FTP /* 88 */:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f33305f.get(index));
                    break;
                case 91:
                    Layout layout54 = constraint.layout;
                    layout54.baselineToTop = m58111n(typedArray, index, layout54.baselineToTop);
                    break;
                case 92:
                    Layout layout55 = constraint.layout;
                    layout55.baselineToBottom = m58111n(typedArray, index, layout55.baselineToBottom);
                    break;
                case 93:
                    Layout layout56 = constraint.layout;
                    layout56.baselineMargin = typedArray.getDimensionPixelSize(index, layout56.baselineMargin);
                    break;
                case 94:
                    Layout layout57 = constraint.layout;
                    layout57.goneBaselineMargin = typedArray.getDimensionPixelSize(index, layout57.goneBaselineMargin);
                    break;
                case 95:
                    m58110o(constraint.layout, typedArray, index, 0);
                    break;
                case SyslogConstants.LOG_NTP /* 96 */:
                    m58110o(constraint.layout, typedArray, index, 1);
                    break;
                case 97:
                    Layout layout58 = constraint.layout;
                    layout58.mWrapBehavior = typedArray.getInt(index, layout58.mWrapBehavior);
                    break;
            }
        }
        Layout layout59 = constraint.layout;
        if (layout59.mReferenceIdString != null) {
            layout59.mReferenceIds = null;
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        for (Integer num : constraintSet.f33310d.keySet()) {
            num.intValue();
            Constraint constraint = (Constraint) constraintSet.f33310d.get(num);
            if (!this.f33310d.containsKey(num)) {
                this.f33310d.put(num, new Constraint());
            }
            Constraint constraint2 = (Constraint) this.f33310d.get(num);
            if (constraint2 != null) {
                Layout layout = constraint2.layout;
                if (!layout.mApply) {
                    layout.copyFrom(constraint.layout);
                }
                PropertySet propertySet = constraint2.propertySet;
                if (!propertySet.mApply) {
                    propertySet.copyFrom(constraint.propertySet);
                }
                Transform transform = constraint2.transform;
                if (!transform.mApply) {
                    transform.copyFrom(constraint.transform);
                }
                Motion motion = constraint2.motion;
                if (!motion.mApply) {
                    motion.copyFrom(constraint.motion);
                }
                for (String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.f33308b.remove(str);
    }

    public void removeFromHorizontalChain(int i) {
        Constraint constraint;
        if (!this.f33310d.containsKey(Integer.valueOf(i)) || (constraint = (Constraint) this.f33310d.get(Integer.valueOf(i))) == null) {
            return;
        }
        Layout layout = constraint.layout;
        int i2 = layout.leftToRight;
        int i3 = layout.rightToLeft;
        if (i2 == -1 && i3 == -1) {
            int i4 = layout.startToEnd;
            int i5 = layout.endToStart;
            if (i4 != -1 || i5 != -1) {
                if (i4 != -1 && i5 != -1) {
                    connect(i4, 7, i5, 6, 0);
                    connect(i5, 6, i2, 7, 0);
                } else if (i5 != -1) {
                    int i6 = layout.rightToRight;
                    if (i6 != -1) {
                        connect(i2, 7, i6, 7, 0);
                    } else {
                        int i7 = layout.leftToLeft;
                        if (i7 != -1) {
                            connect(i5, 6, i7, 6, 0);
                        }
                    }
                }
            }
            clear(i, 6);
            clear(i, 7);
            return;
        }
        if (i2 != -1 && i3 != -1) {
            connect(i2, 2, i3, 1, 0);
            connect(i3, 1, i2, 2, 0);
        } else {
            int i8 = layout.rightToRight;
            if (i8 != -1) {
                connect(i2, 2, i8, 2, 0);
            } else {
                int i9 = layout.leftToLeft;
                if (i9 != -1) {
                    connect(i3, 1, i9, 1, 0);
                }
            }
        }
        clear(i, 1);
        clear(i, 2);
    }

    public void removeFromVerticalChain(int i) {
        if (this.f33310d.containsKey(Integer.valueOf(i))) {
            Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(i));
            if (constraint == null) {
                return;
            }
            Layout layout = constraint.layout;
            int i2 = layout.topToBottom;
            int i3 = layout.bottomToTop;
            if (i2 != -1 || i3 != -1) {
                if (i2 != -1 && i3 != -1) {
                    connect(i2, 4, i3, 3, 0);
                    connect(i3, 3, i2, 4, 0);
                } else {
                    int i4 = layout.bottomToBottom;
                    if (i4 != -1) {
                        connect(i2, 4, i4, 4, 0);
                    } else {
                        int i5 = layout.topToTop;
                        if (i5 != -1) {
                            connect(i3, 3, i5, 3, 0);
                        }
                    }
                }
            }
        }
        clear(i, 3);
        clear(i, 4);
    }

    public void setAlpha(int i, float f) {
        m58112m(i).propertySet.alpha = f;
    }

    public void setApplyElevation(int i, boolean z) {
        m58112m(i).transform.applyElevation = z;
    }

    public void setBarrierType(int i, int i2) {
        m58112m(i).layout.mHelperType = i2;
    }

    public void setColorValue(int i, String str, int i2) {
        m58112m(i).m58088l(str, i2);
    }

    public void setDimensionRatio(int i, String str) {
        m58112m(i).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i, int i2) {
        m58112m(i).layout.editorAbsoluteX = i2;
    }

    public void setEditorAbsoluteY(int i, int i2) {
        m58112m(i).layout.editorAbsoluteY = i2;
    }

    public void setElevation(int i, float f) {
        m58112m(i).transform.elevation = f;
        m58112m(i).transform.applyElevation = true;
    }

    public void setFloatValue(int i, String str, float f) {
        m58112m(i).m58087m(str, f);
    }

    public void setForceId(boolean z) {
        this.f33309c = z;
    }

    public void setGoneMargin(int i, int i2, int i3) {
        Constraint m58112m = m58112m(i);
        switch (i2) {
            case 1:
                m58112m.layout.goneLeftMargin = i3;
                return;
            case 2:
                m58112m.layout.goneRightMargin = i3;
                return;
            case 3:
                m58112m.layout.goneTopMargin = i3;
                return;
            case 4:
                m58112m.layout.goneBottomMargin = i3;
                return;
            case 5:
                m58112m.layout.goneBaselineMargin = i3;
                return;
            case 6:
                m58112m.layout.goneStartMargin = i3;
                return;
            case 7:
                m58112m.layout.goneEndMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i, int i2) {
        m58112m(i).layout.guideBegin = i2;
        m58112m(i).layout.guideEnd = -1;
        m58112m(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i, int i2) {
        m58112m(i).layout.guideEnd = i2;
        m58112m(i).layout.guideBegin = -1;
        m58112m(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i, float f) {
        m58112m(i).layout.guidePercent = f;
        m58112m(i).layout.guideEnd = -1;
        m58112m(i).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i, float f) {
        m58112m(i).layout.horizontalBias = f;
    }

    public void setHorizontalChainStyle(int i, int i2) {
        m58112m(i).layout.horizontalChainStyle = i2;
    }

    public void setHorizontalWeight(int i, float f) {
        m58112m(i).layout.horizontalWeight = f;
    }

    public void setIntValue(int i, String str, int i2) {
        m58112m(i).m58086n(str, i2);
    }

    public void setLayoutWrapBehavior(int i, int i2) {
        if (i2 >= 0 && i2 <= 3) {
            m58112m(i).layout.mWrapBehavior = i2;
        }
    }

    public void setMargin(int i, int i2, int i3) {
        Constraint m58112m = m58112m(i);
        switch (i2) {
            case 1:
                m58112m.layout.leftMargin = i3;
                return;
            case 2:
                m58112m.layout.rightMargin = i3;
                return;
            case 3:
                m58112m.layout.topMargin = i3;
                return;
            case 4:
                m58112m.layout.bottomMargin = i3;
                return;
            case 5:
                m58112m.layout.baselineMargin = i3;
                return;
            case 6:
                m58112m.layout.startMargin = i3;
                return;
            case 7:
                m58112m.layout.endMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i, int... iArr) {
        m58112m(i).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i, float f) {
        m58112m(i).transform.rotation = f;
    }

    public void setRotationX(int i, float f) {
        m58112m(i).transform.rotationX = f;
    }

    public void setRotationY(int i, float f) {
        m58112m(i).transform.rotationY = f;
    }

    public void setScaleX(int i, float f) {
        m58112m(i).transform.scaleX = f;
    }

    public void setScaleY(int i, float f) {
        m58112m(i).transform.scaleY = f;
    }

    public void setStringValue(int i, String str, String str2) {
        m58112m(i).m58085o(str, str2);
    }

    public void setTransformPivot(int i, float f, float f2) {
        Transform transform = m58112m(i).transform;
        transform.transformPivotY = f2;
        transform.transformPivotX = f;
    }

    public void setTransformPivotX(int i, float f) {
        m58112m(i).transform.transformPivotX = f;
    }

    public void setTransformPivotY(int i, float f) {
        m58112m(i).transform.transformPivotY = f;
    }

    public void setTranslation(int i, float f, float f2) {
        Transform transform = m58112m(i).transform;
        transform.translationX = f;
        transform.translationY = f2;
    }

    public void setTranslationX(int i, float f) {
        m58112m(i).transform.translationX = f;
    }

    public void setTranslationY(int i, float f) {
        m58112m(i).transform.translationY = f;
    }

    public void setTranslationZ(int i, float f) {
        m58112m(i).transform.translationZ = f;
    }

    public void setValidateOnParse(boolean z) {
        this.f33307a = z;
    }

    public void setVerticalBias(int i, float f) {
        m58112m(i).layout.verticalBias = f;
    }

    public void setVerticalChainStyle(int i, int i2) {
        m58112m(i).layout.verticalChainStyle = i2;
    }

    public void setVerticalWeight(int i, float f) {
        m58112m(i).layout.verticalWeight = f;
    }

    public void setVisibility(int i, int i2) {
        m58112m(i).propertySet.visibility = i2;
    }

    public void setVisibilityMode(int i, int i2) {
        m58112m(i).propertySet.mVisibilityMode = i2;
    }

    public void writeState(Writer writer, ConstraintLayout constraintLayout, int i) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i & 1) == 1) {
            new C3784b(writer, constraintLayout, i).m58055g();
        } else {
            new C3783a(writer, constraintLayout, i).m58068g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    /* renamed from: x */
    public final String m58101x(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void clear(int i, int i2) {
        Constraint constraint;
        if (!this.f33310d.containsKey(Integer.valueOf(i)) || (constraint = (Constraint) this.f33310d.get(Integer.valueOf(i))) == null) {
            return;
        }
        switch (i2) {
            case 1:
                Layout layout = constraint.layout;
                layout.leftToRight = -1;
                layout.leftToLeft = -1;
                layout.leftMargin = -1;
                layout.goneLeftMargin = Integer.MIN_VALUE;
                return;
            case 2:
                Layout layout2 = constraint.layout;
                layout2.rightToRight = -1;
                layout2.rightToLeft = -1;
                layout2.rightMargin = -1;
                layout2.goneRightMargin = Integer.MIN_VALUE;
                return;
            case 3:
                Layout layout3 = constraint.layout;
                layout3.topToBottom = -1;
                layout3.topToTop = -1;
                layout3.topMargin = 0;
                layout3.goneTopMargin = Integer.MIN_VALUE;
                return;
            case 4:
                Layout layout4 = constraint.layout;
                layout4.bottomToTop = -1;
                layout4.bottomToBottom = -1;
                layout4.bottomMargin = 0;
                layout4.goneBottomMargin = Integer.MIN_VALUE;
                return;
            case 5:
                Layout layout5 = constraint.layout;
                layout5.baselineToBaseline = -1;
                layout5.baselineToTop = -1;
                layout5.baselineToBottom = -1;
                layout5.baselineMargin = 0;
                layout5.goneBaselineMargin = Integer.MIN_VALUE;
                return;
            case 6:
                Layout layout6 = constraint.layout;
                layout6.startToEnd = -1;
                layout6.startToStart = -1;
                layout6.startMargin = 0;
                layout6.goneStartMargin = Integer.MIN_VALUE;
                return;
            case 7:
                Layout layout7 = constraint.layout;
                layout7.endToStart = -1;
                layout7.endToEnd = -1;
                layout7.endMargin = 0;
                layout7.goneEndMargin = Integer.MIN_VALUE;
                return;
            case 8:
                Layout layout8 = constraint.layout;
                layout8.circleAngle = -1.0f;
                layout8.circleRadius = -1;
                layout8.circleConstraint = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void clone(ConstraintSet constraintSet) {
        this.f33310d.clear();
        for (Integer num : constraintSet.f33310d.keySet()) {
            Constraint constraint = (Constraint) constraintSet.f33310d.get(num);
            if (constraint != null) {
                this.f33310d.put(num, constraint.m73904clone());
            }
        }
    }

    public void centerHorizontally(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f33310d.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f33309c && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f33310d.containsKey(Integer.valueOf(id2))) {
                this.f33310d.put(Integer.valueOf(id2), new Constraint());
            }
            Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(id2));
            if (constraint != null) {
                constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.f33308b, childAt);
                constraint.m58092h(id2, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    Transform transform = constraint.transform;
                    transform.transformPivotX = pivotX;
                    transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                Transform transform2 = constraint.transform;
                if (transform2.applyElevation) {
                    transform2.elevation = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cf, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f33309c && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f33310d.containsKey(Integer.valueOf(id2))) {
                this.f33310d.put(Integer.valueOf(id2), new Constraint());
            }
            Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(id2));
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.m58092h(id2, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                PropertySet propertySet = constraint.propertySet;
                if (!propertySet.mApply) {
                    propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                Transform transform = constraint.transform;
                if (!transform.mApply) {
                    transform.mApply = true;
                    transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        Transform transform2 = constraint.transform;
                        transform2.transformPivotX = pivotX;
                        transform2.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    Transform transform3 = constraint.transform;
                    if (transform3.applyElevation) {
                        transform3.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f33310d.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f33309c && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f33310d.containsKey(Integer.valueOf(id2))) {
                this.f33310d.put(Integer.valueOf(id2), new Constraint());
            }
            Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(id2));
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    constraint.m58090j((ConstraintHelper) childAt, id2, layoutParams);
                }
                constraint.m58091i(id2, layoutParams);
            }
        }
    }

    public void connect(int i, int i2, int i3, int i4) {
        if (!this.f33310d.containsKey(Integer.valueOf(i))) {
            this.f33310d.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = (Constraint) this.f33310d.get(Integer.valueOf(i));
        if (constraint == null) {
            return;
        }
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i3;
                    layout.leftToRight = -1;
                    return;
                } else if (i4 == 2) {
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i3;
                    layout2.leftToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m58101x(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i3;
                    layout3.rightToRight = -1;
                    return;
                } else if (i4 != 2) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i3;
                    layout4.rightToLeft = -1;
                    return;
                }
            case 3:
                if (i4 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i3;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                    return;
                } else if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout6 = constraint.layout;
                    layout6.topToBottom = i3;
                    layout6.topToTop = -1;
                    layout6.baselineToBaseline = -1;
                    layout6.baselineToTop = -1;
                    layout6.baselineToBottom = -1;
                    return;
                }
            case 4:
                if (i4 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i3;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                    return;
                } else if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout8 = constraint.layout;
                    layout8.bottomToTop = i3;
                    layout8.bottomToBottom = -1;
                    layout8.baselineToBaseline = -1;
                    layout8.baselineToTop = -1;
                    layout8.baselineToBottom = -1;
                    return;
                }
            case 5:
                if (i4 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i3;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                } else if (i4 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i3;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                } else if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout11 = constraint.layout;
                    layout11.baselineToBottom = i3;
                    layout11.bottomToBottom = -1;
                    layout11.bottomToTop = -1;
                    layout11.topToTop = -1;
                    layout11.topToBottom = -1;
                    return;
                }
            case 6:
                if (i4 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i3;
                    layout12.startToEnd = -1;
                    return;
                } else if (i4 != 7) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i3;
                    layout13.startToStart = -1;
                    return;
                }
            case 7:
                if (i4 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i3;
                    layout14.endToStart = -1;
                    return;
                } else if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + m58101x(i4) + " undefined");
                } else {
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i3;
                    layout15.endToEnd = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(m58101x(i2) + " to " + m58101x(i4) + " unknown");
        }
    }
}
