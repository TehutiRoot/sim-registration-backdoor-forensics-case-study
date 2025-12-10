package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class Key {
    public static final String ALPHA = "alpha";
    public static final String CURVEFIT = "curveFit";
    public static final String CUSTOM = "CUSTOM";
    public static final String ELEVATION = "elevation";
    public static final String MOTIONPROGRESS = "motionProgress";
    public static final String PIVOT_X = "transformPivotX";
    public static final String PIVOT_Y = "transformPivotY";
    public static final String PROGRESS = "progress";
    public static final String ROTATION = "rotation";
    public static final String ROTATION_X = "rotationX";
    public static final String ROTATION_Y = "rotationY";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String TRANSITIONEASING = "transitionEasing";
    public static final String TRANSITION_PATH_ROTATE = "transitionPathRotate";
    public static final String TRANSLATION_X = "translationX";
    public static final String TRANSLATION_Y = "translationY";
    public static final String TRANSLATION_Z = "translationZ";
    public static int UNSET = -1;
    public static final String VISIBILITY = "visibility";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_VARIES_BY = "waveVariesBy";

    /* renamed from: a */
    public int f32689a;

    /* renamed from: b */
    public int f32690b;

    /* renamed from: c */
    public String f32691c;

    /* renamed from: d */
    public HashMap f32692d;
    protected int mType;

    public Key() {
        int i = UNSET;
        this.f32689a = i;
        this.f32690b = i;
        this.f32691c = null;
    }

    /* renamed from: a */
    public boolean m58536a(String str) {
        String str2 = this.f32691c;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public abstract void addValues(HashMap<String, ViewSpline> hashMap);

    /* renamed from: b */
    public boolean m58535b(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    /* renamed from: c */
    public float m58534c(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    /* renamed from: clone */
    public abstract Key m73903clone();

    public Key copy(Key key) {
        this.f32689a = key.f32689a;
        this.f32690b = key.f32690b;
        this.f32691c = key.f32691c;
        this.mType = key.mType;
        this.f32692d = key.f32692d;
        return this;
    }

    /* renamed from: d */
    public int m58533d(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }

    public abstract void getAttributeNames(HashSet hashSet);

    public int getFramePosition() {
        return this.f32689a;
    }

    public abstract void load(Context context, AttributeSet attributeSet);

    public void setFramePosition(int i) {
        this.f32689a = i;
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
    }

    public abstract void setValue(String str, Object obj);

    public Key setViewId(int i) {
        this.f32690b = i;
        return this;
    }
}
