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
    public static int f32718n;

    /* renamed from: o */
    public static float f32719o;

    /* renamed from: d */
    public ConstraintLayout f32720d;

    /* renamed from: e */
    public int f32721e;

    /* renamed from: f */
    public float[] f32722f;

    /* renamed from: g */
    public int[] f32723g;

    /* renamed from: h */
    public int f32724h;

    /* renamed from: i */
    public int f32725i;

    /* renamed from: j */
    public String f32726j;

    /* renamed from: k */
    public String f32727k;

    /* renamed from: l */
    public Float f32728l;

    /* renamed from: m */
    public Integer f32729m;

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
        this.f32725i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m58500g(str.substring(i).trim());
                return;
            } else {
                m58500g(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f32724h = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m58499h(str.substring(i).trim());
                return;
            } else {
                m58499h(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    public void addViewToCircularFlow(View view, int i, float f) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.f32725i++;
        float[] angles = getAngles();
        this.f32722f = angles;
        angles[this.f32725i - 1] = f;
        this.f32724h++;
        int[] radius = getRadius();
        this.f32723g = radius;
        radius[this.f32724h - 1] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        m58498i();
    }

    /* renamed from: g */
    public final void m58500g(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.f32722f) == null) {
            return;
        }
        if (this.f32725i + 1 > fArr.length) {
            this.f32722f = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f32722f[this.f32725i] = Integer.parseInt(str);
        this.f32725i++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f32722f, this.f32725i);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f32723g, this.f32724h);
    }

    /* renamed from: h */
    public final void m58499h(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.f32723g) == null) {
            return;
        }
        if (this.f32724h + 1 > iArr.length) {
            this.f32723g = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f32723g[this.f32724h] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.f32724h++;
    }

    /* renamed from: i */
    public final void m58498i() {
        this.f32720d = (ConstraintLayout) getParent();
        for (int i = 0; i < this.mCount; i++) {
            View viewById = this.f32720d.getViewById(this.mIds[i]);
            if (viewById != null) {
                int i2 = f32718n;
                float f = f32719o;
                int[] iArr = this.f32723g;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    Integer num = this.f32729m;
                    if (num != null && num.intValue() != -1) {
                        this.f32724h++;
                        if (this.f32723g == null) {
                            this.f32723g = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f32723g = radius;
                        radius[this.f32724h - 1] = i2;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Added radius to view with id: ");
                        sb.append(this.mMap.get(Integer.valueOf(viewById.getId())));
                    }
                }
                float[] fArr = this.f32722f;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    Float f2 = this.f32728l;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.f32725i++;
                        if (this.f32722f == null) {
                            this.f32722f = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f32722f = angles;
                        angles[this.f32725i - 1] = f;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Added angle to view with id: ");
                        sb2.append(this.mMap.get(Integer.valueOf(viewById.getId())));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f;
                layoutParams.circleConstraint = this.f32721e;
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
                    this.f32721e = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f32726j = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f32727k = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f32719o));
                    this.f32728l = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f32718n));
                    this.f32729m = valueOf2;
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
    public final float[] m58497j(float[] fArr, int i) {
        if (fArr != null && i >= 0 && i < this.f32725i) {
            return removeElementFromArray(fArr, i);
        }
        return fArr;
    }

    /* renamed from: k */
    public final int[] m58496k(int[] iArr, int i) {
        if (iArr != null && i >= 0 && i < this.f32724h) {
            return removeElementFromArray(iArr, i);
        }
        return iArr;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f32726j;
        if (str != null) {
            this.f32722f = new float[1];
            setAngles(str);
        }
        String str2 = this.f32727k;
        if (str2 != null) {
            this.f32723g = new int[1];
            setRadius(str2);
        }
        Float f = this.f32728l;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f32729m;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        m58498i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        int removeView = super.removeView(view);
        if (removeView == -1) {
            return removeView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f32720d);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.f32720d);
        float[] fArr = this.f32722f;
        if (removeView < fArr.length) {
            this.f32722f = m58497j(fArr, removeView);
            this.f32725i--;
        }
        int[] iArr = this.f32723g;
        if (removeView < iArr.length) {
            this.f32723g = m58496k(iArr, removeView);
            this.f32724h--;
        }
        m58498i();
        return removeView;
    }

    public void setDefaultAngle(float f) {
        f32719o = f;
    }

    public void setDefaultRadius(int i) {
        f32718n = i;
    }

    public void updateAngle(View view, float f) {
        if (!isUpdatable(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update angle to view with id: ");
            sb.append(view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.f32722f.length) {
            return;
        }
        float[] angles = getAngles();
        this.f32722f = angles;
        angles[indexFromId] = f;
        m58498i();
    }

    public void updateRadius(View view, int i) {
        if (!isUpdatable(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update radius to view with id: ");
            sb.append(view.getId());
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.f32723g.length) {
            return;
        }
        int[] radius = getRadius();
        this.f32723g = radius;
        radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        m58498i();
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
            this.f32722f = angles;
            angles[indexFromId] = f;
        }
        if (getRadius().length > indexFromId) {
            int[] radius = getRadius();
            this.f32723g = radius;
            radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        }
        m58498i();
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