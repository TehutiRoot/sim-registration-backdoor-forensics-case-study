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
    public static final HashMap f32769g;

    /* renamed from: h */
    public static final HashMap f32770h;

    /* renamed from: a */
    public final MotionLayout f32771a;

    /* renamed from: b */
    public MotionScene f32772b;

    /* renamed from: c */
    public String f32773c = null;

    /* renamed from: d */
    public String f32774d = null;

    /* renamed from: e */
    public int f32775e = -1;

    /* renamed from: f */
    public int f32776f = -1;

    static {
        HashMap hashMap = new HashMap();
        f32769g = hashMap;
        HashMap hashMap2 = new HashMap();
        f32770h = hashMap2;
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
        this.f32771a = motionLayout;
    }

    /* renamed from: a */
    public static void m58491a(int i, ConstraintSet constraintSet, View view, HashMap hashMap, int i2, int i3) {
        int i4;
        String str = (String) f32769g.get(Pair.create(Integer.valueOf(i2), Integer.valueOf(i3)));
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            String str3 = (String) f32770h.get(str);
            if (str3 != null) {
                i4 = m58490b(i, (String) hashMap.get(str3));
            } else {
                i4 = 0;
            }
            constraintSet.connect(view.getId(), i2, Integer.parseInt(str2), i3, i4);
        }
    }

    /* renamed from: b */
    public static int m58490b(int i, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i) / 160.0f);
    }

    /* renamed from: c */
    public static void m58489c(int i, ConstraintSet constraintSet, View view, HashMap hashMap) {
        String str = (String) hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            constraintSet.setEditorAbsoluteX(view.getId(), m58490b(i, str));
        }
        String str2 = (String) hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            constraintSet.setEditorAbsoluteY(view.getId(), m58490b(i, str2));
        }
    }

    /* renamed from: d */
    public static void m58488d(ConstraintSet constraintSet, View view, HashMap hashMap, int i) {
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
    public static void m58487e(int i, ConstraintSet constraintSet, View view, HashMap hashMap, int i2) {
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
                i3 = m58490b(i, str2);
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
            MotionLayout motionLayout = this.f32771a;
            if (motionLayout.f32990x == null || view == null || (motionController = (MotionController) motionLayout.f32932H.get(view)) == null) {
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
                this.f32771a.f32990x.getDuration();
                return motionController.m58343h(str, fArr2, i3);
            }
            int duration = this.f32771a.f32990x.getDuration() / 16;
            motionController.m58349b(fArr2, null);
            return duration;
        }
        int duration2 = this.f32771a.f32990x.getDuration() / 16;
        motionController.m58348c(fArr2, duration2);
        return duration2;
    }

    public void disableAutoTransition(boolean z) {
        this.f32771a.m58314M(z);
    }

    public void dumpConstraintSet(String str) {
        MotionLayout motionLayout = this.f32771a;
        if (motionLayout.f32990x == null) {
            motionLayout.f32990x = this.f32772b;
        }
        int m58304W = motionLayout.m58304W(str);
        PrintStream printStream = System.out;
        printStream.println(" dumping  " + str + " (" + m58304W + ")");
        try {
            this.f32771a.f32990x.m58227h(m58304W).dump(this.f32771a.f32990x, new int[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        MotionScene motionScene = this.f32771a.f32990x;
        if (motionScene == null) {
            return -1;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = (MotionController) this.f32771a.f32932H.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.m58349b(fArr, null);
        return duration;
    }

    public int getAnimationPath(Object obj, float[] fArr, int i) {
        MotionLayout motionLayout = this.f32771a;
        if (motionLayout.f32990x == null) {
            return -1;
        }
        MotionController motionController = (MotionController) motionLayout.f32932H.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.m58348c(fArr, i);
        return i;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        MotionScene motionScene = this.f32771a.f32990x;
        if (motionScene == null) {
            return;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = (MotionController) this.f32771a.f32932H.get(obj);
        if (motionController == null) {
            return;
        }
        motionController.m58346e(fArr, duration);
    }

    public String getEndState() {
        int endState = this.f32771a.getEndState();
        if (this.f32776f == endState) {
            return this.f32774d;
        }
        String m58308S = this.f32771a.m58308S(endState);
        if (m58308S != null) {
            this.f32774d = m58308S;
            this.f32776f = endState;
        }
        return m58308S;
    }

    public int getKeyFrameInfo(Object obj, int i, int[] iArr) {
        MotionController motionController = (MotionController) this.f32771a.f32932H.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(i, iArr);
    }

    public float getKeyFramePosition(Object obj, int i, float f, float f2) {
        MotionController motionController;
        if (!(obj instanceof View) || (motionController = (MotionController) this.f32771a.f32932H.get((View) obj)) == null) {
            return 0.0f;
        }
        return motionController.m58339l(i, f, f2);
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        MotionController motionController = (MotionController) this.f32771a.f32932H.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFramePositions(iArr, fArr);
    }

    public Object getKeyframe(int i, int i2, int i3) {
        MotionLayout motionLayout = this.f32771a;
        MotionScene motionScene = motionLayout.f32990x;
        if (motionScene == null) {
            return null;
        }
        return motionScene.m58222m(motionLayout.getContext(), i, i2, i3);
    }

    public Object getKeyframeAtLocation(Object obj, float f, float f2) {
        MotionController motionController;
        View view = (View) obj;
        MotionLayout motionLayout = this.f32771a;
        if (motionLayout.f32990x == null) {
            return -1;
        }
        if (view == null || (motionController = (MotionController) motionLayout.f32932H.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return motionController.m58338m(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    public Boolean getPositionKeyframe(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr) {
        if (obj instanceof AbstractC18215Oh0) {
            View view = (View) obj2;
            ((MotionController) this.f32771a.f32932H.get(view)).m58333r(view, (AbstractC18215Oh0) obj, f, f2, strArr, fArr);
            this.f32771a.rebuildScene();
            this.f32771a.f32948P = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public float getProgress() {
        return this.f32771a.getProgress();
    }

    public String getStartState() {
        int startState = this.f32771a.getStartState();
        if (this.f32775e == startState) {
            return this.f32773c;
        }
        String m58308S = this.f32771a.m58308S(startState);
        if (m58308S != null) {
            this.f32773c = m58308S;
            this.f32775e = startState;
        }
        return this.f32771a.m58308S(startState);
    }

    public String getState() {
        if (this.f32773c != null && this.f32774d != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.f32773c;
            }
            if (progress >= 0.99f) {
                return this.f32774d;
            }
        }
        return this.f32773c;
    }

    public long getTransitionTimeMs() {
        return this.f32771a.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        if (this.f32773c != null && this.f32774d != null) {
            return true;
        }
        return false;
    }

    public void setAttributes(int i, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int m58304W = this.f32771a.m58304W(str);
        ConstraintSet m58227h = this.f32771a.f32990x.m58227h(m58304W);
        if (m58227h == null) {
            return;
        }
        m58227h.clear(view.getId());
        m58487e(i, m58227h, view, hashMap, 0);
        m58487e(i, m58227h, view, hashMap, 1);
        m58491a(i, m58227h, view, hashMap, 6, 6);
        m58491a(i, m58227h, view, hashMap, 6, 7);
        m58491a(i, m58227h, view, hashMap, 7, 7);
        m58491a(i, m58227h, view, hashMap, 7, 6);
        m58491a(i, m58227h, view, hashMap, 1, 1);
        m58491a(i, m58227h, view, hashMap, 1, 2);
        m58491a(i, m58227h, view, hashMap, 2, 2);
        m58491a(i, m58227h, view, hashMap, 2, 1);
        m58491a(i, m58227h, view, hashMap, 3, 3);
        m58491a(i, m58227h, view, hashMap, 3, 4);
        m58491a(i, m58227h, view, hashMap, 4, 3);
        m58491a(i, m58227h, view, hashMap, 4, 4);
        m58491a(i, m58227h, view, hashMap, 5, 5);
        m58488d(m58227h, view, hashMap, 0);
        m58488d(m58227h, view, hashMap, 1);
        m58489c(i, m58227h, view, hashMap);
        this.f32771a.updateState(m58304W, m58227h);
        this.f32771a.requestLayout();
    }

    public void setKeyFrame(Object obj, int i, String str, Object obj2) {
        MotionScene motionScene = this.f32771a.f32990x;
        if (motionScene != null) {
            motionScene.setKeyframe((View) obj, i, str, obj2);
            MotionLayout motionLayout = this.f32771a;
            motionLayout.f32944N = i / 100.0f;
            motionLayout.f32940L = 0.0f;
            motionLayout.rebuildScene();
            this.f32771a.m58312O(true);
        }
    }

    public boolean setKeyFramePosition(Object obj, int i, int i2, float f, float f2) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f32771a;
        if (motionLayout.f32990x != null) {
            MotionController motionController = (MotionController) motionLayout.f32932H.get(obj);
            MotionLayout motionLayout2 = this.f32771a;
            int i3 = (int) (motionLayout2.f32938K * 100.0f);
            if (motionController != null) {
                View view = (View) obj;
                if (motionLayout2.f32990x.m58209z(view, i3)) {
                    float m58339l = motionController.m58339l(2, f, f2);
                    float m58339l2 = motionController.m58339l(5, f, f2);
                    this.f32771a.f32990x.setKeyframe(view, i3, "motion:percentX", Float.valueOf(m58339l));
                    this.f32771a.f32990x.setKeyframe(view, i3, "motion:percentY", Float.valueOf(m58339l2));
                    this.f32771a.rebuildScene();
                    this.f32771a.m58312O(true);
                    this.f32771a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        if (obj instanceof Key) {
            ((Key) obj).setValue(str, obj2);
            this.f32771a.rebuildScene();
            this.f32771a.f32948P = true;
        }
    }

    public void setState(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f32773c == str) {
            return;
        }
        this.f32773c = str;
        this.f32774d = null;
        MotionLayout motionLayout = this.f32771a;
        if (motionLayout.f32990x == null) {
            motionLayout.f32990x = this.f32772b;
        }
        int m58304W = motionLayout.m58304W(str);
        this.f32775e = m58304W;
        if (m58304W != 0) {
            if (m58304W == this.f32771a.getStartState()) {
                this.f32771a.setProgress(0.0f);
            } else if (m58304W == this.f32771a.getEndState()) {
                this.f32771a.setProgress(1.0f);
            } else {
                this.f32771a.transitionToState(m58304W);
                this.f32771a.setProgress(1.0f);
            }
        }
        this.f32771a.requestLayout();
    }

    public void setToolPosition(float f) {
        MotionLayout motionLayout = this.f32771a;
        if (motionLayout.f32990x == null) {
            motionLayout.f32990x = this.f32772b;
        }
        motionLayout.setProgress(f);
        this.f32771a.m58312O(true);
        this.f32771a.requestLayout();
        this.f32771a.invalidate();
    }

    public void setTransition(String str, String str2) {
        MotionLayout motionLayout = this.f32771a;
        if (motionLayout.f32990x == null) {
            motionLayout.f32990x = this.f32772b;
        }
        int m58304W = motionLayout.m58304W(str);
        int m58304W2 = this.f32771a.m58304W(str2);
        this.f32771a.setTransition(m58304W, m58304W2);
        this.f32775e = m58304W;
        this.f32776f = m58304W2;
        this.f32773c = str;
        this.f32774d = str2;
    }

    public void setViewDebug(Object obj, int i) {
        MotionController motionController;
        if ((obj instanceof View) && (motionController = (MotionController) this.f32771a.f32932H.get(obj)) != null) {
            motionController.setDrawPath(i);
            this.f32771a.invalidate();
        }
    }

    public Object getKeyframe(Object obj, int i, int i2) {
        if (this.f32771a.f32990x == null) {
            return null;
        }
        int id2 = ((View) obj).getId();
        MotionLayout motionLayout = this.f32771a;
        return motionLayout.f32990x.m58222m(motionLayout.getContext(), i, id2, i2);
    }
}