package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import java.io.PrintStream;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class DesignTool {

    /* renamed from: g */
    public static final HashMap f32681g;

    /* renamed from: h */
    public static final HashMap f32682h;

    /* renamed from: a */
    public final MotionLayout f32683a;

    /* renamed from: b */
    public MotionScene f32684b;

    /* renamed from: c */
    public String f32685c = null;

    /* renamed from: d */
    public String f32686d = null;

    /* renamed from: e */
    public int f32687e = -1;

    /* renamed from: f */
    public int f32688f = -1;

    static {
        HashMap hashMap = new HashMap();
        f32681g = hashMap;
        HashMap hashMap2 = new HashMap();
        f32682h = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public DesignTool(MotionLayout motionLayout) {
        this.f32683a = motionLayout;
    }

    /* renamed from: a */
    public static void m58541a(int i, ConstraintSet constraintSet, View view, HashMap hashMap, int i2, int i3) {
        int i4;
        String str = (String) f32681g.get(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            String str3 = (String) f32682h.get(str);
            if (str3 != null) {
                i4 = m58540b(i, (String) hashMap.get(str3));
            } else {
                i4 = 0;
            }
            constraintSet.connect(view.getId(), i2, Integer.parseInt(str2), i3, i4);
        }
    }

    /* renamed from: b */
    public static int m58540b(int i, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i) / 160.0f);
    }

    /* renamed from: c */
    public static void m58539c(int i, ConstraintSet constraintSet, View view, HashMap hashMap) {
        String str = (String) hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            constraintSet.setEditorAbsoluteX(view.getId(), m58540b(i, str));
        }
        String str2 = (String) hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            constraintSet.setEditorAbsoluteY(view.getId(), m58540b(i, str2));
        }
    }

    /* renamed from: d */
    public static void m58538d(ConstraintSet constraintSet, View view, HashMap hashMap, int i) {
        String str;
        if (i == 1) {
            str = "layout_constraintVertical_bias";
        } else {
            str = "layout_constraintHorizontal_bias";
        }
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            if (i == 0) {
                constraintSet.setHorizontalBias(view.getId(), Float.parseFloat(str2));
            } else if (i == 1) {
                constraintSet.setVerticalBias(view.getId(), Float.parseFloat(str2));
            }
        }
    }

    /* renamed from: e */
    public static void m58537e(int i, ConstraintSet constraintSet, View view, HashMap hashMap, int i2) {
        String str;
        int i3;
        if (i2 == 1) {
            str = "layout_height";
        } else {
            str = "layout_width";
        }
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            if (!str2.equalsIgnoreCase("wrap_content")) {
                i3 = m58540b(i, str2);
            } else {
                i3 = -2;
            }
            if (i2 == 0) {
                constraintSet.constrainWidth(view.getId(), i3);
            } else {
                constraintSet.constrainHeight(view.getId(), i3);
            }
        }
    }

    public int designAccess(int i, String str, Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        MotionController motionController;
        View view = (View) obj;
        if (i != 0) {
            MotionLayout motionLayout = this.f32683a;
            if (motionLayout.f32902x == null || view == null || (motionController = (MotionController) motionLayout.f32844H.get(view)) == null) {
                return -1;
            }
        } else {
            motionController = null;
        }
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return -1;
                }
                this.f32683a.f32902x.getDuration();
                return motionController.m58393h(str, fArr2, i3);
            }
            int duration = this.f32683a.f32902x.getDuration() / 16;
            motionController.m58399b(fArr2, null);
            return duration;
        }
        int duration2 = this.f32683a.f32902x.getDuration() / 16;
        motionController.m58398c(fArr2, duration2);
        return duration2;
    }

    public void disableAutoTransition(boolean z) {
        this.f32683a.m58364M(z);
    }

    public void dumpConstraintSet(String str) {
        MotionLayout motionLayout = this.f32683a;
        if (motionLayout.f32902x == null) {
            motionLayout.f32902x = this.f32684b;
        }
        int m58354W = motionLayout.m58354W(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + m58354W + ")");
        try {
            this.f32683a.f32902x.m58277h(m58354W).dump(this.f32683a.f32902x, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        MotionScene motionScene = this.f32683a.f32902x;
        if (motionScene == null) {
            return -1;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = (MotionController) this.f32683a.f32844H.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.m58399b(fArr, null);
        return duration;
    }

    public int getAnimationPath(Object obj, float[] fArr, int i) {
        MotionLayout motionLayout = this.f32683a;
        if (motionLayout.f32902x == null) {
            return -1;
        }
        MotionController motionController = (MotionController) motionLayout.f32844H.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.m58398c(fArr, i);
        return i;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        MotionScene motionScene = this.f32683a.f32902x;
        if (motionScene == null) {
            return;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = (MotionController) this.f32683a.f32844H.get(obj);
        if (motionController == null) {
            return;
        }
        motionController.m58396e(fArr, duration);
    }

    public String getEndState() {
        int endState = this.f32683a.getEndState();
        if (this.f32688f == endState) {
            return this.f32686d;
        }
        String m58358S = this.f32683a.m58358S(endState);
        if (m58358S != null) {
            this.f32686d = m58358S;
            this.f32688f = endState;
        }
        return m58358S;
    }

    public int getKeyFrameInfo(Object obj, int i, int[] iArr) {
        MotionController motionController = (MotionController) this.f32683a.f32844H.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(i, iArr);
    }

    public float getKeyFramePosition(Object obj, int i, float f, float f2) {
        MotionController motionController;
        if (!(obj instanceof View) || (motionController = (MotionController) this.f32683a.f32844H.get((View) obj)) == null) {
            return 0.0f;
        }
        return motionController.m58389l(i, f, f2);
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        MotionController motionController = (MotionController) this.f32683a.f32844H.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFramePositions(iArr, fArr);
    }

    public Object getKeyframe(int i, int i2, int i3) {
        MotionLayout motionLayout = this.f32683a;
        MotionScene motionScene = motionLayout.f32902x;
        if (motionScene == null) {
            return null;
        }
        return motionScene.m58272m(motionLayout.getContext(), i, i2, i3);
    }

    public Object getKeyframeAtLocation(Object obj, float f, float f2) {
        MotionController motionController;
        View view = (View) obj;
        MotionLayout motionLayout = this.f32683a;
        if (motionLayout.f32902x == null) {
            return -1;
        }
        if (view == null || (motionController = (MotionController) motionLayout.f32844H.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return motionController.m58388m(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    public Boolean getPositionKeyframe(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (obj instanceof AbstractC17794Ih0) {
            View view = (View) obj2;
            ((MotionController) this.f32683a.f32844H.get(view)).m58383r(view, (AbstractC17794Ih0) obj, f, f2, strArr, fArr);
            this.f32683a.rebuildScene();
            this.f32683a.f32860P = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public float getProgress() {
        return this.f32683a.getProgress();
    }

    public String getStartState() {
        int startState = this.f32683a.getStartState();
        if (this.f32687e == startState) {
            return this.f32685c;
        }
        String m58358S = this.f32683a.m58358S(startState);
        if (m58358S != null) {
            this.f32685c = m58358S;
            this.f32687e = startState;
        }
        return this.f32683a.m58358S(startState);
    }

    public String getState() {
        if (this.f32685c != null && this.f32686d != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.f32685c;
            }
            if (progress >= 0.99f) {
                return this.f32686d;
            }
        }
        return this.f32685c;
    }

    public long getTransitionTimeMs() {
        return this.f32683a.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        if (this.f32685c != null && this.f32686d != null) {
            return true;
        }
        return false;
    }

    public void setAttributes(int i, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int m58354W = this.f32683a.m58354W(str);
        ConstraintSet m58277h = this.f32683a.f32902x.m58277h(m58354W);
        if (m58277h == null) {
            return;
        }
        m58277h.clear(view.getId());
        m58537e(i, m58277h, view, hashMap, 0);
        m58537e(i, m58277h, view, hashMap, 1);
        m58541a(i, m58277h, view, hashMap, 6, 6);
        m58541a(i, m58277h, view, hashMap, 6, 7);
        m58541a(i, m58277h, view, hashMap, 7, 7);
        m58541a(i, m58277h, view, hashMap, 7, 6);
        m58541a(i, m58277h, view, hashMap, 1, 1);
        m58541a(i, m58277h, view, hashMap, 1, 2);
        m58541a(i, m58277h, view, hashMap, 2, 2);
        m58541a(i, m58277h, view, hashMap, 2, 1);
        m58541a(i, m58277h, view, hashMap, 3, 3);
        m58541a(i, m58277h, view, hashMap, 3, 4);
        m58541a(i, m58277h, view, hashMap, 4, 3);
        m58541a(i, m58277h, view, hashMap, 4, 4);
        m58541a(i, m58277h, view, hashMap, 5, 5);
        m58538d(m58277h, view, hashMap, 0);
        m58538d(m58277h, view, hashMap, 1);
        m58539c(i, m58277h, view, hashMap);
        this.f32683a.updateState(m58354W, m58277h);
        this.f32683a.requestLayout();
    }

    public void setKeyFrame(Object obj, int i, String str, Object obj2) {
        MotionScene motionScene = this.f32683a.f32902x;
        if (motionScene != null) {
            motionScene.setKeyframe((View) obj, i, str, obj2);
            MotionLayout motionLayout = this.f32683a;
            motionLayout.f32856N = i / 100.0f;
            motionLayout.f32852L = 0.0f;
            motionLayout.rebuildScene();
            this.f32683a.m58362O(true);
        }
    }

    public boolean setKeyFramePosition(Object obj, int i, int i2, float f, float f2) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f32683a;
        if (motionLayout.f32902x != null) {
            MotionController motionController = (MotionController) motionLayout.f32844H.get(obj);
            MotionLayout motionLayout2 = this.f32683a;
            int i3 = (int) (motionLayout2.f32850K * 100.0f);
            if (motionController != null) {
                View view = (View) obj;
                if (motionLayout2.f32902x.m58259z(view, i3)) {
                    float m58389l = motionController.m58389l(2, f, f2);
                    float m58389l2 = motionController.m58389l(5, f, f2);
                    this.f32683a.f32902x.setKeyframe(view, i3, "motion:percentX", Float.valueOf(m58389l));
                    this.f32683a.f32902x.setKeyframe(view, i3, "motion:percentY", Float.valueOf(m58389l2));
                    this.f32683a.rebuildScene();
                    this.f32683a.m58362O(true);
                    this.f32683a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        if (obj instanceof Key) {
            ((Key) obj).setValue(str, obj2);
            this.f32683a.rebuildScene();
            this.f32683a.f32860P = true;
        }
    }

    public void setState(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f32685c == str) {
            return;
        }
        this.f32685c = str;
        this.f32686d = null;
        MotionLayout motionLayout = this.f32683a;
        if (motionLayout.f32902x == null) {
            motionLayout.f32902x = this.f32684b;
        }
        int m58354W = motionLayout.m58354W(str);
        this.f32687e = m58354W;
        if (m58354W != 0) {
            if (m58354W == this.f32683a.getStartState()) {
                this.f32683a.setProgress(0.0f);
            } else if (m58354W == this.f32683a.getEndState()) {
                this.f32683a.setProgress(1.0f);
            } else {
                this.f32683a.transitionToState(m58354W);
                this.f32683a.setProgress(1.0f);
            }
        }
        this.f32683a.requestLayout();
    }

    public void setToolPosition(float f) {
        MotionLayout motionLayout = this.f32683a;
        if (motionLayout.f32902x == null) {
            motionLayout.f32902x = this.f32684b;
        }
        motionLayout.setProgress(f);
        this.f32683a.m58362O(true);
        this.f32683a.requestLayout();
        this.f32683a.invalidate();
    }

    public void setTransition(String str, String str2) {
        MotionLayout motionLayout = this.f32683a;
        if (motionLayout.f32902x == null) {
            motionLayout.f32902x = this.f32684b;
        }
        int m58354W = motionLayout.m58354W(str);
        int m58354W2 = this.f32683a.m58354W(str2);
        this.f32683a.setTransition(m58354W, m58354W2);
        this.f32687e = m58354W;
        this.f32688f = m58354W2;
        this.f32685c = str;
        this.f32686d = str2;
    }

    public void setViewDebug(Object obj, int i) {
        MotionController motionController;
        if ((obj instanceof View) && (motionController = (MotionController) this.f32683a.f32844H.get(obj)) != null) {
            motionController.setDrawPath(i);
            this.f32683a.invalidate();
        }
    }

    public Object getKeyframe(Object obj, int i, int i2) {
        if (this.f32683a.f32902x == null) {
            return null;
        }
        int id2 = ((View) obj).getId();
        MotionLayout motionLayout = this.f32683a;
        return motionLayout.f32902x.m58272m(motionLayout.getContext(), i, id2, i2);
    }
}
