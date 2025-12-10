package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    public static final int WEST = 3;

    /* renamed from: e */
    public float f32743e;

    /* renamed from: f */
    public int f32744f;

    /* renamed from: g */
    public int f32745g;

    /* renamed from: h */
    public int f32746h;

    /* renamed from: i */
    public int f32747i;

    /* renamed from: j */
    public boolean f32748j;

    /* renamed from: k */
    public int f32749k;

    /* renamed from: l */
    public int f32750l;

    public MotionEffect(Context context) {
        super(context);
        this.f32743e = 0.1f;
        this.f32744f = 49;
        this.f32745g = 50;
        this.f32746h = 0;
        this.f32747i = 0;
        this.f32748j = true;
        this.f32749k = -1;
        this.f32750l = -1;
    }

    /* renamed from: g */
    private void m58493g(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f32744f);
                    this.f32744f = i2;
                    this.f32744f = Math.max(Math.min(i2, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f32745g);
                    this.f32745g = i3;
                    this.f32745g = Math.max(Math.min(i3, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationX) {
                    this.f32746h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f32746h);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationY) {
                    this.f32747i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f32747i);
                } else if (index == R.styleable.MotionEffect_motionEffect_alpha) {
                    this.f32743e = obtainStyledAttributes.getFloat(index, this.f32743e);
                } else if (index == R.styleable.MotionEffect_motionEffect_move) {
                    this.f32750l = obtainStyledAttributes.getInt(index, this.f32750l);
                } else if (index == R.styleable.MotionEffect_motionEffect_strict) {
                    this.f32748j = obtainStyledAttributes.getBoolean(index, this.f32748j);
                } else if (index == R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.f32749k = obtainStyledAttributes.getResourceId(index, this.f32749k);
                }
            }
            int i4 = this.f32744f;
            int i5 = this.f32745g;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f32744f = i4 - 1;
                } else {
                    this.f32745g = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x017d, code lost:
        if (r14 == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0191, code lost:
        if (r14 == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a1, code lost:
        if (r15 == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b1, code lost:
        if (r15 == 0.0f) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r24) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32743e = 0.1f;
        this.f32744f = 49;
        this.f32745g = 50;
        this.f32746h = 0;
        this.f32747i = 0;
        this.f32748j = true;
        this.f32749k = -1;
        this.f32750l = -1;
        m58493g(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32743e = 0.1f;
        this.f32744f = 49;
        this.f32745g = 50;
        this.f32746h = 0;
        this.f32747i = 0;
        this.f32748j = true;
        this.f32749k = -1;
        this.f32750l = -1;
        m58493g(context, attributeSet);
    }
}