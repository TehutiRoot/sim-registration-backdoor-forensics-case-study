package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* loaded from: classes2.dex */
public class MotionWidget implements TypedValues {
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: a */
    public WidgetFrame f32040a;

    /* renamed from: b */
    public Motion f32041b;

    /* renamed from: c */
    public PropertySet f32042c;

    /* renamed from: d */
    public float f32043d;

    /* renamed from: e */
    public float f32044e;

    /* loaded from: classes2.dex */
    public static class Motion {
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
    }

    /* loaded from: classes2.dex */
    public static class PropertySet {
        public int visibility = 4;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;
    }

    public MotionWidget() {
        this.f32040a = new WidgetFrame();
        this.f32041b = new Motion();
        this.f32042c = new PropertySet();
    }

    public MotionWidget findViewById(int i) {
        return null;
    }

    public float getAlpha() {
        return this.f32042c.alpha;
    }

    public int getBottom() {
        return this.f32040a.bottom;
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.f32040a.getCustomAttribute(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.f32040a.getCustomAttributeNames();
    }

    public int getHeight() {
        WidgetFrame widgetFrame = this.f32040a;
        return widgetFrame.bottom - widgetFrame.top;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        int m29207a = AbstractC20566jW1.m29207a(str);
        if (m29207a != -1) {
            return m29207a;
        }
        return AbstractC21254nW1.m26124a(str);
    }

    public int getLeft() {
        return this.f32040a.left;
    }

    public String getName() {
        return this.f32040a.getId();
    }

    public MotionWidget getParent() {
        return null;
    }

    public float getPivotX() {
        return this.f32040a.pivotX;
    }

    public float getPivotY() {
        return this.f32040a.pivotY;
    }

    public int getRight() {
        return this.f32040a.right;
    }

    public float getRotationX() {
        return this.f32040a.rotationX;
    }

    public float getRotationY() {
        return this.f32040a.rotationY;
    }

    public float getRotationZ() {
        return this.f32040a.rotationZ;
    }

    public float getScaleX() {
        return this.f32040a.scaleX;
    }

    public float getScaleY() {
        return this.f32040a.scaleY;
    }

    public int getTop() {
        return this.f32040a.top;
    }

    public float getTranslationX() {
        return this.f32040a.translationX;
    }

    public float getTranslationY() {
        return this.f32040a.translationY;
    }

    public float getTranslationZ() {
        return this.f32040a.translationZ;
    }

    public float getValueAttributes(int i) {
        switch (i) {
            case 303:
                return this.f32040a.alpha;
            case 304:
                return this.f32040a.translationX;
            case 305:
                return this.f32040a.translationY;
            case 306:
                return this.f32040a.translationZ;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f32040a.rotationX;
            case 309:
                return this.f32040a.rotationY;
            case 310:
                return this.f32040a.rotationZ;
            case 311:
                return this.f32040a.scaleX;
            case 312:
                return this.f32040a.scaleY;
            case 313:
                return this.f32040a.pivotX;
            case 314:
                return this.f32040a.pivotY;
            case 315:
                return this.f32043d;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return this.f32044e;
        }
    }

    public int getVisibility() {
        return this.f32042c.visibility;
    }

    public WidgetFrame getWidgetFrame() {
        return this.f32040a;
    }

    public int getWidth() {
        WidgetFrame widgetFrame = this.f32040a;
        return widgetFrame.right - widgetFrame.left;
    }

    public int getX() {
        return this.f32040a.left;
    }

    public int getY() {
        return this.f32040a.top;
    }

    public void layout(int i, int i2, int i3, int i4) {
        setBounds(i, i2, i3, i4);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        if (this.f32040a == null) {
            this.f32040a = new WidgetFrame((ConstraintWidget) null);
        }
        WidgetFrame widgetFrame = this.f32040a;
        widgetFrame.top = i2;
        widgetFrame.left = i;
        widgetFrame.right = i3;
        widgetFrame.bottom = i4;
    }

    public void setCustomAttribute(String str, int i, float f) {
        this.f32040a.setCustomAttribute(str, i, f);
    }

    public void setInterpolatedValue(CustomAttribute customAttribute, float[] fArr) {
        this.f32040a.setCustomAttribute(customAttribute.f31969b, TypedValues.Custom.TYPE_FLOAT, fArr[0]);
    }

    public void setPivotX(float f) {
        this.f32040a.pivotX = f;
    }

    public void setPivotY(float f) {
        this.f32040a.pivotY = f;
    }

    public void setRotationX(float f) {
        this.f32040a.rotationX = f;
    }

    public void setRotationY(float f) {
        this.f32040a.rotationY = f;
    }

    public void setRotationZ(float f) {
        this.f32040a.rotationZ = f;
    }

    public void setScaleX(float f) {
        this.f32040a.scaleX = f;
    }

    public void setScaleY(float f) {
        this.f32040a.scaleY = f;
    }

    public void setTranslationX(float f) {
        this.f32040a.translationX = f;
    }

    public void setTranslationY(float f) {
        this.f32040a.translationY = f;
    }

    public void setTranslationZ(float f) {
        this.f32040a.translationZ = f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        return false;
    }

    public boolean setValueAttributes(int i, float f) {
        switch (i) {
            case 303:
                this.f32040a.alpha = f;
                return true;
            case 304:
                this.f32040a.translationX = f;
                return true;
            case 305:
                this.f32040a.translationY = f;
                return true;
            case 306:
                this.f32040a.translationZ = f;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f32040a.rotationX = f;
                return true;
            case 309:
                this.f32040a.rotationY = f;
                return true;
            case 310:
                this.f32040a.rotationZ = f;
                return true;
            case 311:
                this.f32040a.scaleX = f;
                return true;
            case 312:
                this.f32040a.scaleY = f;
                return true;
            case 313:
                this.f32040a.pivotX = f;
                return true;
            case 314:
                this.f32040a.pivotY = f;
                return true;
            case 315:
                this.f32043d = f;
                return true;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                this.f32044e = f;
                return true;
        }
    }

    public boolean setValueMotion(int i, int i2) {
        switch (i) {
            case TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO /* 605 */:
                this.f32041b.mAnimateRelativeTo = i2;
                return true;
            case TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO /* 606 */:
                this.f32041b.mAnimateCircleAngleTo = i2;
                return true;
            case TypedValues.MotionType.TYPE_PATHMOTION_ARC /* 607 */:
                this.f32041b.mPathMotionArc = i2;
                return true;
            case TypedValues.MotionType.TYPE_DRAW_PATH /* 608 */:
                this.f32041b.mDrawPath = i2;
                return true;
            case TypedValues.MotionType.TYPE_POLAR_RELATIVETO /* 609 */:
                this.f32041b.mPolarRelativeTo = i2;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS /* 610 */:
                this.f32041b.mQuantizeMotionSteps = i2;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE /* 611 */:
                this.f32041b.mQuantizeInterpolatorType = i2;
                return true;
            case 612:
                this.f32041b.mQuantizeInterpolatorID = i2;
                return true;
            default:
                return false;
        }
    }

    public void setVisibility(int i) {
        this.f32042c.visibility = i;
    }

    public String toString() {
        return this.f32040a.left + ", " + this.f32040a.top + ", " + this.f32040a.right + ", " + this.f32040a.bottom;
    }

    public void setCustomAttribute(String str, int i, int i2) {
        this.f32040a.setCustomAttribute(str, i, i2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        return setValueAttributes(i, i2);
    }

    public void setCustomAttribute(String str, int i, boolean z) {
        this.f32040a.setCustomAttribute(str, i, z);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (setValueAttributes(i, f)) {
            return true;
        }
        return setValueMotion(i, f);
    }

    public void setCustomAttribute(String str, int i, String str2) {
        this.f32040a.setCustomAttribute(str, i, str2);
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        this.f32040a = new WidgetFrame();
        this.f32041b = new Motion();
        this.f32042c = new PropertySet();
        this.f32040a = widgetFrame;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        return setValueMotion(i, str);
    }

    public boolean setValueMotion(int i, String str) {
        if (i == 603) {
            this.f32041b.mTransitionEasing = str;
            return true;
        } else if (i != 604) {
            return false;
        } else {
            this.f32041b.mQuantizeInterpolatorString = str;
            return true;
        }
    }

    public boolean setValueMotion(int i, float f) {
        switch (i) {
            case 600:
                this.f32041b.mMotionStagger = f;
                return true;
            case 601:
                this.f32041b.mPathRotate = f;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE /* 602 */:
                this.f32041b.mQuantizeMotionPhase = f;
                return true;
            default:
                return false;
        }
    }
}
