package androidx.constraintlayout.motion.widget;

/* loaded from: classes2.dex */
public class OnSwipe {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    public static final int DRAG_ANTICLOCKWISE = 7;
    public static final int DRAG_CLOCKWISE = 6;
    public static final int DRAG_DOWN = 1;
    public static final int DRAG_END = 5;
    public static final int DRAG_LEFT = 2;
    public static final int DRAG_RIGHT = 3;
    public static final int DRAG_START = 4;
    public static final int DRAG_UP = 0;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    public static final int ON_UP_AUTOCOMPLETE = 0;
    public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
    public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
    public static final int ON_UP_DECELERATE = 4;
    public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int ON_UP_NEVER_TO_END = 7;
    public static final int ON_UP_NEVER_TO_START = 6;
    public static final int ON_UP_STOP = 3;
    public static final int SIDE_BOTTOM = 3;
    public static final int SIDE_END = 6;
    public static final int SIDE_LEFT = 1;
    public static final int SIDE_MIDDLE = 4;
    public static final int SIDE_RIGHT = 2;
    public static final int SIDE_START = 5;
    public static final int SIDE_TOP = 0;
    public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
    public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
    public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
    public static final int SPRING_BOUNDARY_OVERSHOOT = 0;

    /* renamed from: a */
    public int f33087a = 0;

    /* renamed from: b */
    public int f33088b = 0;

    /* renamed from: c */
    public int f33089c = -1;

    /* renamed from: d */
    public int f33090d = -1;

    /* renamed from: e */
    public int f33091e = -1;

    /* renamed from: f */
    public int f33092f = 0;

    /* renamed from: g */
    public int f33093g = -1;

    /* renamed from: h */
    public float f33094h = 4.0f;

    /* renamed from: i */
    public float f33095i = 1.2f;

    /* renamed from: j */
    public boolean f33096j = true;

    /* renamed from: k */
    public float f33097k = 1.0f;

    /* renamed from: l */
    public int f33098l = 0;

    /* renamed from: m */
    public float f33099m = 10.0f;

    /* renamed from: n */
    public float f33100n = Float.NaN;

    /* renamed from: o */
    public float f33101o = 1.0f;

    /* renamed from: p */
    public float f33102p = Float.NaN;

    /* renamed from: q */
    public float f33103q = Float.NaN;

    /* renamed from: r */
    public int f33104r = 0;

    /* renamed from: s */
    public int f33105s = 0;

    public int getAutoCompleteMode() {
        return this.f33105s;
    }

    public int getDragDirection() {
        return this.f33087a;
    }

    public float getDragScale() {
        return this.f33097k;
    }

    public float getDragThreshold() {
        return this.f33099m;
    }

    public int getLimitBoundsTo() {
        return this.f33091e;
    }

    public float getMaxAcceleration() {
        return this.f33095i;
    }

    public float getMaxVelocity() {
        return this.f33094h;
    }

    public boolean getMoveWhenScrollAtTop() {
        return this.f33096j;
    }

    public int getNestedScrollFlags() {
        return this.f33098l;
    }

    public int getOnTouchUp() {
        return this.f33092f;
    }

    public int getRotationCenterId() {
        return this.f33093g;
    }

    public int getSpringBoundary() {
        return this.f33104r;
    }

    public float getSpringDamping() {
        return this.f33100n;
    }

    public float getSpringMass() {
        return this.f33101o;
    }

    public float getSpringStiffness() {
        return this.f33102p;
    }

    public float getSpringStopThreshold() {
        return this.f33103q;
    }

    public int getTouchAnchorId() {
        return this.f33089c;
    }

    public int getTouchAnchorSide() {
        return this.f33088b;
    }

    public int getTouchRegionId() {
        return this.f33090d;
    }

    public void setAutoCompleteMode(int i) {
        this.f33105s = i;
    }

    public OnSwipe setDragDirection(int i) {
        this.f33087a = i;
        return this;
    }

    public OnSwipe setDragScale(int i) {
        this.f33097k = i;
        return this;
    }

    public OnSwipe setDragThreshold(int i) {
        this.f33099m = i;
        return this;
    }

    public OnSwipe setLimitBoundsTo(int i) {
        this.f33091e = i;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i) {
        this.f33095i = i;
        return this;
    }

    public OnSwipe setMaxVelocity(int i) {
        this.f33094h = i;
        return this;
    }

    public OnSwipe setMoveWhenScrollAtTop(boolean z) {
        this.f33096j = z;
        return this;
    }

    public OnSwipe setNestedScrollFlags(int i) {
        this.f33098l = i;
        return this;
    }

    public OnSwipe setOnTouchUp(int i) {
        this.f33092f = i;
        return this;
    }

    public OnSwipe setRotateCenter(int i) {
        this.f33093g = i;
        return this;
    }

    public OnSwipe setSpringBoundary(int i) {
        this.f33104r = i;
        return this;
    }

    public OnSwipe setSpringDamping(float f) {
        this.f33100n = f;
        return this;
    }

    public OnSwipe setSpringMass(float f) {
        this.f33101o = f;
        return this;
    }

    public OnSwipe setSpringStiffness(float f) {
        this.f33102p = f;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f) {
        this.f33103q = f;
        return this;
    }

    public OnSwipe setTouchAnchorId(int i) {
        this.f33089c = i;
        return this;
    }

    public OnSwipe setTouchAnchorSide(int i) {
        this.f33088b = i;
        return this;
    }

    public OnSwipe setTouchRegionId(int i) {
        this.f33090d = i;
        return this;
    }
}