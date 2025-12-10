package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: n */
    public static int f32630n;

    /* renamed from: o */
    public static float f32631o;

    /* renamed from: d */
    public ConstraintLayout f32632d;

    /* renamed from: e */
    public int f32633e;

    /* renamed from: f */
    public float[] f32634f;

    /* renamed from: g */
    public int[] f32635g;

    /* renamed from: h */
    public int f32636h;

    /* renamed from: i */
    public int f32637i;

    /* renamed from: j */
    public String f32638j;

    /* renamed from: k */
    public String f32639k;

    /* renamed from: l */
    public Float f32640l;

    /* renamed from: m */
    public Integer f32641m;

    public CircularFlow(Context context) {
        super(context);
    }

    public static int[] removeElementFromArray(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != i) {
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return iArr2;
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f32637i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m58550g(str.substring(i).trim());
                return;
            } else {
                m58550g(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f32636h = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m58549h(str.substring(i).trim());
                return;
            } else {
                m58549h(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    public void addViewToCircularFlow(View view, int i, float f) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.f32637i++;
        float[] angles = getAngles();
        this.f32634f = angles;
        angles[this.f32637i - 1] = f;
        this.f32636h++;
        int[] radius = getRadius();
        this.f32635g = radius;
        radius[this.f32636h - 1] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        m58548i();
    }

    /* renamed from: g */
    public final void m58550g(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.f32634f) == null) {
            return;
        }
        if (this.f32637i + 1 > fArr.length) {
            this.f32634f = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f32634f[this.f32637i] = Integer.parseInt(str);
        this.f32637i++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f32634f, this.f32637i);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f32635g, this.f32636h);
    }

    /* renamed from: h */
    public final void m58549h(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.f32635g) == null) {
            return;
        }
        if (this.f32636h + 1 > iArr.length) {
            this.f32635g = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f32635g[this.f32636h] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.f32636h++;
    }

    /* renamed from: i */
    public final void m58548i() {
        this.f32632d = (ConstraintLayout) getParent();
        for (int i = 0; i < this.mCount; i++) {
            View viewById = this.f32632d.getViewById(this.mIds[i]);
            if (viewById != null) {
                int i2 = f32630n;
                float f = f32631o;
                int[] iArr = this.f32635g;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num = this.f32641m;
                    if (num != null && num.intValue() != -1) {
                        this.f32636h++;
                        if (this.f32635g == null) {
                            this.f32635g = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f32635g = radius;
                        radius[this.f32636h - 1] = i2;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Added radius to view with id: ");
                        sb.append(this.mMap.get(Integer.valueOf(viewById.getId())));
                    }
                }
                float[] fArr = this.f32634f;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    Float f2 = this.f32640l;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.f32637i++;
                        if (this.f32634f == null) {
                            this.f32634f = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f32634f = angles;
                        angles[this.f32637i - 1] = f;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Added angle to view with id: ");
                        sb2.append(this.mMap.get(Integer.valueOf(viewById.getId())));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f;
                layoutParams.circleConstraint = this.f32633e;
                layoutParams.circleRadius = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f32633e = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f32638j = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f32639k = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f32631o));
                    this.f32640l = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f32630n));
                    this.f32641m = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean isUpdatable(View view) {
        if (!containsId(view.getId()) || indexFromId(view.getId()) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final float[] m58547j(float[] fArr, int i) {
        if (fArr != null && i >= 0 && i < this.f32637i) {
            return removeElementFromArray(fArr, i);
        }
        return fArr;
    }

    /* renamed from: k */
    public final int[] m58546k(int[] iArr, int i) {
        if (iArr != null && i >= 0 && i < this.f32636h) {
            return removeElementFromArray(iArr, i);
        }
        return iArr;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f32638j;
        if (str != null) {
            this.f32634f = new float[1];
            setAngles(str);
        }
        String str2 = this.f32639k;
        if (str2 != null) {
            this.f32635g = new int[1];
            setRadius(str2);
        }
        Float f = this.f32640l;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f32641m;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        m58548i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        int removeView = super.removeView(view);
        if (removeView == -1) {
            return removeView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f32632d);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.f32632d);
        float[] fArr = this.f32634f;
        if (removeView < fArr.length) {
            this.f32634f = m58547j(fArr, removeView);
            this.f32637i--;
        }
        int[] iArr = this.f32635g;
        if (removeView < iArr.length) {
            this.f32635g = m58546k(iArr, removeView);
            this.f32636h--;
        }
        m58548i();
        return removeView;
    }

    public void setDefaultAngle(float f) {
        f32631o = f;
    }

    public void setDefaultRadius(int i) {
        f32630n = i;
    }

    public void updateAngle(View view, float f) {
        if (!isUpdatable(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update angle to view with id: ");
            sb.append(view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.f32634f.length) {
            return;
        }
        float[] angles = getAngles();
        this.f32634f = angles;
        angles[indexFromId] = f;
        m58548i();
    }

    public void updateRadius(View view, int i) {
        if (!isUpdatable(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update radius to view with id: ");
            sb.append(view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.f32635g.length) {
            return;
        }
        int[] radius = getRadius();
        this.f32635g = radius;
        radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        m58548i();
    }

    public void updateReference(View view, int i, float f) {
        if (!isUpdatable(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update radius and angle to view with id: ");
            sb.append(view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (getAngles().length > indexFromId) {
            float[] angles = getAngles();
            this.f32634f = angles;
            angles[indexFromId] = f;
        }
        if (getRadius().length > indexFromId) {
            int[] radius = getRadius();
            this.f32635g = radius;
            radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        }
        m58548i();
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static float[] removeElementFromArray(float[] fArr, int i) {
        float[] fArr2 = new float[fArr.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (i3 != i) {
                fArr2[i2] = fArr[i3];
                i2++;
            }
        }
        return fArr2;
    }
}
