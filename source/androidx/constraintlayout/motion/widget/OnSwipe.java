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
    public int f32999a = 0;

    /* renamed from: b */
    public int f33000b = 0;

    /* renamed from: c */
    public int f33001c = -1;

    /* renamed from: d */
    public int f33002d = -1;

    /* renamed from: e */
    public int f33003e = -1;

    /* renamed from: f */
    public int f33004f = 0;

    /* renamed from: g */
    public int f33005g = -1;

    /* renamed from: h */
    public float f33006h = 4.0f;

    /* renamed from: i */
    public float f33007i = 1.2f;

    /* renamed from: j */
    public boolean f33008j = true;

    /* renamed from: k */
    public float f33009k = 1.0f;

    /* renamed from: l */
    public int f33010l = 0;

    /* renamed from: m */
    public float f33011m = 10.0f;

    /* renamed from: n */
    public float f33012n = Float.NaN;

    /* renamed from: o */
    public float f33013o = 1.0f;

    /* renamed from: p */
    public float f33014p = Float.NaN;

    /* renamed from: q */
    public float f33015q = Float.NaN;

    /* renamed from: r */
    public int f33016r = 0;

    /* renamed from: s */
    public int f33017s = 0;

    public int getAutoCompleteMode() {
        return this.f33017s;
    }

    public int getDragDirection() {
        return this.f32999a;
    }

    public float getDragScale() {
        return this.f33009k;
    }

    public float getDragThreshold() {
        return this.f33011m;
    }

    public int getLimitBoundsTo() {
        return this.f33003e;
    }

    public float getMaxAcceleration() {
        return this.f33007i;
    }

    public float getMaxVelocity() {
        return this.f33006h;
    }

    public boolean getMoveWhenScrollAtTop() {
        return this.f33008j;
    }

    public int getNestedScrollFlags() {
        return this.f33010l;
    }

    public int getOnTouchUp() {
        return this.f33004f;
    }

    public int getRotationCenterId() {
        return this.f33005g;
    }

    public int getSpringBoundary() {
        return this.f33016r;
    }

    public float getSpringDamping() {
        return this.f33012n;
    }

    public float getSpringMass() {
        return this.f33013o;
    }

    public float getSpringStiffness() {
        return this.f33014p;
    }

    public float getSpringStopThreshold() {
        return this.f33015q;
    }

    public int getTouchAnchorId() {
        return this.f33001c;
    }

    public int getTouchAnchorSide() {
        return this.f33000b;
    }

    public int getTouchRegionId() {
        return this.f33002d;
    }

    public void setAutoCompleteMode(int i) {
        this.f33017s = i;
    }

    public OnSwipe setDragDirection(int i) {
        this.f32999a = i;
        return this;
    }

    public OnSwipe setDragScale(int i) {
        this.f33009k = i;
        return this;
    }

    public OnSwipe setDragThreshold(int i) {
        this.f33011m = i;
        return this;
    }

    public OnSwipe setLimitBoundsTo(int i) {
        this.f33003e = i;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i) {
        this.f33007i = i;
        return this;
    }

    public OnSwipe setMaxVelocity(int i) {
        this.f33006h = i;
        return this;
    }

    public OnSwipe setMoveWhenScrollAtTop(boolean z) {
        this.f33008j = z;
        return this;
    }

    public OnSwipe setNestedScrollFlags(int i) {
        this.f33010l = i;
        return this;
    }

    public OnSwipe setOnTouchUp(int i) {
        this.f33004f = i;
        return this;
    }

    public OnSwipe setRotateCenter(int i) {
        this.f33005g = i;
        return this;
    }

    public OnSwipe setSpringBoundary(int i) {
        this.f33016r = i;
        return this;
    }

    public OnSwipe setSpringDamping(float f) {
        this.f33012n = f;
        return this;
    }

    public OnSwipe setSpringMass(float f) {
        this.f33013o = f;
        return this;
    }

    public OnSwipe setSpringStiffness(float f) {
        this.f33014p = f;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f) {
        this.f33015q = f;
        return this;
    }

    public OnSwipe setTouchAnchorId(int i) {
        this.f33001c = i;
        return this;
    }

    public OnSwipe setTouchAnchorSide(int i) {
        this.f33000b = i;
        return this;
    }

    public OnSwipe setTouchRegionId(int i) {
        this.f33002d = i;
        return this;
    }
}
