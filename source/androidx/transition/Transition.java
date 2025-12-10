package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public abstract class Transition implements Cloneable {

    /* renamed from: H */
    public static final int[] f37745H = {2, 1, 3, 4};

    /* renamed from: I */
    public static final PathMotion f37746I = new C5109a();

    /* renamed from: J */
    public static ThreadLocal f37747J = new ThreadLocal();
    public static final int MATCH_ID = 3;
    public static final int MATCH_INSTANCE = 1;
    public static final int MATCH_ITEM_ID = 4;
    public static final int MATCH_NAME = 2;

    /* renamed from: D */
    public TransitionPropagation f37751D;

    /* renamed from: E */
    public EpicenterCallback f37752E;

    /* renamed from: F */
    public ArrayMap f37753F;

    /* renamed from: t */
    public ArrayList f37774t;

    /* renamed from: u */
    public ArrayList f37775u;

    /* renamed from: a */
    public String f37755a = getClass().getName();

    /* renamed from: b */
    public long f37756b = -1;

    /* renamed from: c */
    public long f37757c = -1;

    /* renamed from: d */
    public TimeInterpolator f37758d = null;

    /* renamed from: e */
    public ArrayList f37759e = new ArrayList();

    /* renamed from: f */
    public ArrayList f37760f = new ArrayList();

    /* renamed from: g */
    public ArrayList f37761g = null;

    /* renamed from: h */
    public ArrayList f37762h = null;

    /* renamed from: i */
    public ArrayList f37763i = null;

    /* renamed from: j */
    public ArrayList f37764j = null;

    /* renamed from: k */
    public ArrayList f37765k = null;

    /* renamed from: l */
    public ArrayList f37766l = null;

    /* renamed from: m */
    public ArrayList f37767m = null;

    /* renamed from: n */
    public ArrayList f37768n = null;

    /* renamed from: o */
    public ArrayList f37769o = null;

    /* renamed from: p */
    public C21940rV1 f37770p = new C21940rV1();

    /* renamed from: q */
    public C21940rV1 f37771q = new C21940rV1();

    /* renamed from: r */
    public TransitionSet f37772r = null;

    /* renamed from: s */
    public int[] f37773s = f37745H;

    /* renamed from: v */
    public ViewGroup f37776v = null;

    /* renamed from: w */
    public boolean f37777w = false;

    /* renamed from: x */
    public ArrayList f37778x = new ArrayList();

    /* renamed from: y */
    public int f37779y = 0;

    /* renamed from: z */
    public boolean f37780z = false;

    /* renamed from: A */
    public boolean f37748A = false;

    /* renamed from: B */
    public ArrayList f37749B = null;

    /* renamed from: C */
    public ArrayList f37750C = new ArrayList();

    /* renamed from: G */
    public PathMotion f37754G = f37746I;

    /* loaded from: classes2.dex */
    public static abstract class EpicenterCallback {
        public abstract Rect onGetEpicenter(@NonNull Transition transition);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface MatchOrder {
    }

    /* loaded from: classes2.dex */
    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);
    }

    /* renamed from: androidx.transition.Transition$a */
    /* loaded from: classes2.dex */
    public static class C5109a extends PathMotion {
        @Override // androidx.transition.PathMotion
        public Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    /* loaded from: classes2.dex */
    public class C5110b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ArrayMap f37781a;

        public C5110b(ArrayMap arrayMap) {
            Transition.this = r1;
            this.f37781a = arrayMap;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f37781a.remove(animator);
            Transition.this.f37778x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.f37778x.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    /* loaded from: classes2.dex */
    public class C5111c extends AnimatorListenerAdapter {
        public C5111c() {
            Transition.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.end();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    /* loaded from: classes2.dex */
    public static class C5112d {

        /* renamed from: a */
        public View f37784a;

        /* renamed from: b */
        public String f37785b;

        /* renamed from: c */
        public TransitionValues f37786c;

        /* renamed from: d */
        public InterfaceC19117b42 f37787d;

        /* renamed from: e */
        public Transition f37788e;

        public C5112d(View view, String str, Transition transition, InterfaceC19117b42 interfaceC19117b42, TransitionValues transitionValues) {
            this.f37784a = view;
            this.f37785b = str;
            this.f37786c = transitionValues;
            this.f37787d = interfaceC19117b42;
            this.f37788e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    /* loaded from: classes2.dex */
    public static class C5113e {
        /* renamed from: a */
        public static ArrayList m52630a(ArrayList arrayList, Object obj) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        /* renamed from: b */
        public static ArrayList m52629b(ArrayList arrayList, Object obj) {
            if (arrayList != null) {
                arrayList.remove(obj);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    public Transition() {
    }

    /* renamed from: b */
    public static void m52652b(C21940rV1 c21940rV1, View view, TransitionValues transitionValues) {
        c21940rV1.f77297a.put(view, transitionValues);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c21940rV1.f77298b.indexOfKey(id2) >= 0) {
                c21940rV1.f77298b.put(id2, null);
            } else {
                c21940rV1.f77298b.put(id2, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (c21940rV1.f77300d.containsKey(transitionName)) {
                c21940rV1.f77300d.put(transitionName, null);
            } else {
                c21940rV1.f77300d.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c21940rV1.f77299c.indexOfKey(itemIdAtPosition) >= 0) {
                    View view2 = (View) c21940rV1.f77299c.get(itemIdAtPosition);
                    if (view2 != null) {
                        ViewCompat.setHasTransientState(view2, false);
                        c21940rV1.f77299c.put(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.setHasTransientState(view, true);
                c21940rV1.f77299c.put(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: c */
    public static boolean m52651c(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static ArrayList m52646i(ArrayList arrayList, Object obj, boolean z) {
        if (obj != null) {
            if (z) {
                return C5113e.m52630a(arrayList, obj);
            }
            return C5113e.m52629b(arrayList, obj);
        }
        return arrayList;
    }

    /* renamed from: n */
    public static ArrayMap m52642n() {
        ArrayMap arrayMap = (ArrayMap) f37747J.get();
        if (arrayMap == null) {
            ArrayMap arrayMap2 = new ArrayMap();
            f37747J.set(arrayMap2);
            return arrayMap2;
        }
        return arrayMap;
    }

    /* renamed from: o */
    public static boolean m52641o(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: q */
    public static boolean m52639q(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.values.get(str);
        Object obj2 = transitionValues2.values.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: w */
    public static int[] m52633w(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + OperatorName.SHOW_TEXT_LINE);
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: A */
    public Transition mo52615A(ViewGroup viewGroup) {
        this.f37776v = viewGroup;
        return this;
    }

    /* renamed from: B */
    public String mo52614B(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f37757c != -1) {
            str2 = str2 + "dur(" + this.f37757c + ") ";
        }
        if (this.f37756b != -1) {
            str2 = str2 + "dly(" + this.f37756b + ") ";
        }
        if (this.f37758d != null) {
            str2 = str2 + "interp(" + this.f37758d + ") ";
        }
        if (this.f37759e.size() > 0 || this.f37760f.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f37759e.size() > 0) {
                for (int i = 0; i < this.f37759e.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f37759e.get(i);
                }
            }
            if (this.f37760f.size() > 0) {
                for (int i2 = 0; i2 < this.f37760f.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f37760f.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* renamed from: a */
    public final void m52653a(ArrayMap arrayMap, ArrayMap arrayMap2) {
        for (int i = 0; i < arrayMap.size(); i++) {
            TransitionValues transitionValues = (TransitionValues) arrayMap.valueAt(i);
            if (m52640p(transitionValues.view)) {
                this.f37774t.add(transitionValues);
                this.f37775u.add(null);
            }
        }
        for (int i2 = 0; i2 < arrayMap2.size(); i2++) {
            TransitionValues transitionValues2 = (TransitionValues) arrayMap2.valueAt(i2);
            if (m52640p(transitionValues2.view)) {
                this.f37775u.add(transitionValues2);
                this.f37774t.add(null);
            }
        }
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transitionListener) {
        if (this.f37749B == null) {
            this.f37749B = new ArrayList();
        }
        this.f37749B.add(transitionListener);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.f37760f.add(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C5111c());
        animator.start();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.f37778x.size() - 1; size >= 0; size--) {
            ((Animator) this.f37778x.get(size)).cancel();
        }
        ArrayList arrayList = this.f37749B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f37749B.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((TransitionListener) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    public abstract void captureEndValues(@NonNull TransitionValues transitionValues);

    public abstract void captureStartValues(@NonNull TransitionValues transitionValues);

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, C21940rV1 c21940rV1, C21940rV1 c21940rV12, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        Animator createAnimator;
        int i;
        View view;
        Animator animator;
        TransitionValues transitionValues;
        Animator animator2;
        TransitionValues transitionValues2;
        ArrayMap m52642n = m52642n();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            TransitionValues transitionValues3 = arrayList.get(i2);
            TransitionValues transitionValues4 = arrayList2.get(i2);
            if (transitionValues3 != null && !transitionValues3.f37809a.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f37809a.contains(this)) {
                transitionValues4 = null;
            }
            if ((transitionValues3 == null && transitionValues4 == null) || ((transitionValues3 != null && transitionValues4 != null && !isTransitionRequired(transitionValues3, transitionValues4)) || (createAnimator = createAnimator(viewGroup, transitionValues3, transitionValues4)) == null)) {
                i = size;
            } else {
                if (transitionValues4 != null) {
                    view = transitionValues4.view;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        transitionValues2 = new TransitionValues(view);
                        i = size;
                        TransitionValues transitionValues5 = (TransitionValues) c21940rV12.f77297a.get(view);
                        if (transitionValues5 != null) {
                            int i3 = 0;
                            while (i3 < transitionProperties.length) {
                                Map<String, Object> map = transitionValues2.values;
                                String str = transitionProperties[i3];
                                map.put(str, transitionValues5.values.get(str));
                                i3++;
                                transitionProperties = transitionProperties;
                            }
                        }
                        int size2 = m52642n.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size2) {
                                C5112d c5112d = (C5112d) m52642n.get((Animator) m52642n.keyAt(i4));
                                if (c5112d.f37786c != null && c5112d.f37784a == view && c5112d.f37785b.equals(getName()) && c5112d.f37786c.equals(transitionValues2)) {
                                    animator2 = null;
                                    break;
                                }
                                i4++;
                            } else {
                                animator2 = createAnimator;
                                break;
                            }
                        }
                    } else {
                        i = size;
                        animator2 = createAnimator;
                        transitionValues2 = null;
                    }
                    animator = animator2;
                    transitionValues = transitionValues2;
                } else {
                    i = size;
                    view = transitionValues3.view;
                    animator = createAnimator;
                    transitionValues = null;
                }
                if (animator != null) {
                    TransitionPropagation transitionPropagation = this.f37751D;
                    if (transitionPropagation != null) {
                        long startDelay = transitionPropagation.getStartDelay(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.f37750C.size(), (int) startDelay);
                        j = Math.min(startDelay, j);
                    }
                    m52642n.put(animator, new C5112d(view, getName(), this, AbstractC22210t32.m22527d(viewGroup), transitionValues));
                    this.f37750C.add(animator);
                    j = j;
                }
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = (Animator) this.f37750C.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay((sparseIntArray.valueAt(i5) - j) + animator3.getStartDelay());
            }
        }
    }

    /* renamed from: d */
    public final void m52650d(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f37763i;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id2))) {
            return;
        }
        ArrayList arrayList2 = this.f37764j;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList arrayList3 = this.f37765k;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f37765k.get(i)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            TransitionValues transitionValues = new TransitionValues(view);
            if (z) {
                captureStartValues(transitionValues);
            } else {
                captureEndValues(transitionValues);
            }
            transitionValues.f37809a.add(this);
            mo52610e(transitionValues);
            if (z) {
                m52652b(this.f37770p, view, transitionValues);
            } else {
                m52652b(this.f37771q, view, transitionValues);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList arrayList4 = this.f37767m;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id2))) {
                return;
            }
            ArrayList arrayList5 = this.f37768n;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList arrayList6 = this.f37769o;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((Class) this.f37769o.get(i2)).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m52650d(viewGroup.getChildAt(i3), z);
            }
        }
    }

    /* renamed from: e */
    public void mo52610e(TransitionValues transitionValues) {
        String[] propagationProperties;
        if (this.f37751D == null || transitionValues.values.isEmpty() || (propagationProperties = this.f37751D.getPropagationProperties()) == null) {
            return;
        }
        for (String str : propagationProperties) {
            if (!transitionValues.values.containsKey(str)) {
                this.f37751D.captureValues(transitionValues);
                return;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i = this.f37779y - 1;
        this.f37779y = i;
        if (i == 0) {
            ArrayList arrayList = this.f37749B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f37749B.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((TransitionListener) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.f37770p.f77299c.size(); i3++) {
                View view = (View) this.f37770p.f77299c.valueAt(i3);
                if (view != null) {
                    ViewCompat.setHasTransientState(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f37771q.f77299c.size(); i4++) {
                View view2 = (View) this.f37771q.f77299c.valueAt(i4);
                if (view2 != null) {
                    ViewCompat.setHasTransientState(view2, false);
                }
            }
            this.f37748A = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z) {
        this.f37768n = m52644k(this.f37768n, view, z);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z) {
        this.f37764j = m52644k(this.f37764j, view, z);
        return this;
    }

    /* renamed from: f */
    public void m52649f(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayMap arrayMap;
        m52648g(z);
        if ((this.f37759e.size() <= 0 && this.f37760f.size() <= 0) || (((arrayList = this.f37761g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f37762h) != null && !arrayList2.isEmpty()))) {
            m52650d(viewGroup, z);
        } else {
            for (int i = 0; i < this.f37759e.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f37759e.get(i)).intValue());
                if (findViewById != null) {
                    TransitionValues transitionValues = new TransitionValues(findViewById);
                    if (z) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.f37809a.add(this);
                    mo52610e(transitionValues);
                    if (z) {
                        m52652b(this.f37770p, findViewById, transitionValues);
                    } else {
                        m52652b(this.f37771q, findViewById, transitionValues);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f37760f.size(); i2++) {
                View view = (View) this.f37760f.get(i2);
                TransitionValues transitionValues2 = new TransitionValues(view);
                if (z) {
                    captureStartValues(transitionValues2);
                } else {
                    captureEndValues(transitionValues2);
                }
                transitionValues2.f37809a.add(this);
                mo52610e(transitionValues2);
                if (z) {
                    m52652b(this.f37770p, view, transitionValues2);
                } else {
                    m52652b(this.f37771q, view, transitionValues2);
                }
            }
        }
        if (!z && (arrayMap = this.f37753F) != null) {
            int size = arrayMap.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f37770p.f77300d.remove((String) this.f37753F.keyAt(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f37770p.f77300d.put((String) this.f37753F.valueAt(i4), view2);
                }
            }
        }
    }

    /* renamed from: g */
    public void m52648g(boolean z) {
        if (z) {
            this.f37770p.f77297a.clear();
            this.f37770p.f77298b.clear();
            this.f37770p.f77299c.clear();
            return;
        }
        this.f37771q.f77297a.clear();
        this.f37771q.f77298b.clear();
        this.f37771q.f77299c.clear();
    }

    public long getDuration() {
        return this.f37757c;
    }

    @Nullable
    public Rect getEpicenter() {
        EpicenterCallback epicenterCallback = this.f37752E;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.onGetEpicenter(this);
    }

    @Nullable
    public EpicenterCallback getEpicenterCallback() {
        return this.f37752E;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.f37758d;
    }

    @NonNull
    public String getName() {
        return this.f37755a;
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.f37754G;
    }

    @Nullable
    public TransitionPropagation getPropagation() {
        return this.f37751D;
    }

    public long getStartDelay() {
        return this.f37756b;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.f37759e;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.f37761g;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.f37762h;
    }

    @NonNull
    public List<View> getTargets() {
        return this.f37760f;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public TransitionValues getTransitionValues(@NonNull View view, boolean z) {
        C21940rV1 c21940rV1;
        TransitionSet transitionSet = this.f37772r;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z);
        }
        if (z) {
            c21940rV1 = this.f37770p;
        } else {
            c21940rV1 = this.f37771q;
        }
        return (TransitionValues) c21940rV1.f77297a.get(view);
    }

    /* renamed from: h */
    public final ArrayList m52647h(ArrayList arrayList, int i, boolean z) {
        if (i > 0) {
            if (z) {
                return C5113e.m52630a(arrayList, Integer.valueOf(i));
            }
            return C5113e.m52629b(arrayList, Integer.valueOf(i));
        }
        return arrayList;
    }

    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties != null) {
            for (String str : transitionProperties) {
                if (!m52639q(transitionValues, transitionValues2, str)) {
                }
            }
            return false;
        }
        for (String str2 : transitionValues.values.keySet()) {
            if (m52639q(transitionValues, transitionValues2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: j */
    public final ArrayList m52645j(ArrayList arrayList, Class cls, boolean z) {
        if (cls != null) {
            if (z) {
                return C5113e.m52630a(arrayList, cls);
            }
            return C5113e.m52629b(arrayList, cls);
        }
        return arrayList;
    }

    /* renamed from: k */
    public final ArrayList m52644k(ArrayList arrayList, View view, boolean z) {
        if (view != null) {
            if (z) {
                return C5113e.m52630a(arrayList, view);
            }
            return C5113e.m52629b(arrayList, view);
        }
        return arrayList;
    }

    /* renamed from: l */
    public void mo52609l(ViewGroup viewGroup) {
        ArrayMap m52642n = m52642n();
        int size = m52642n.size();
        if (viewGroup != null && size != 0) {
            InterfaceC19117b42 m22527d = AbstractC22210t32.m22527d(viewGroup);
            ArrayMap arrayMap = new ArrayMap(m52642n);
            m52642n.clear();
            for (int i = size - 1; i >= 0; i--) {
                C5112d c5112d = (C5112d) arrayMap.valueAt(i);
                if (c5112d.f37784a != null && m22527d != null && m22527d.equals(c5112d.f37787d)) {
                    ((Animator) arrayMap.keyAt(i)).end();
                }
            }
        }
    }

    /* renamed from: m */
    public TransitionValues m52643m(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        TransitionSet transitionSet = this.f37772r;
        if (transitionSet != null) {
            return transitionSet.m52643m(view, z);
        }
        if (z) {
            arrayList = this.f37774t;
        } else {
            arrayList = this.f37775u;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                TransitionValues transitionValues = (TransitionValues) arrayList.get(i);
                if (transitionValues == null) {
                    return null;
                }
                if (transitionValues.view == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f37775u;
        } else {
            arrayList2 = this.f37774t;
        }
        return (TransitionValues) arrayList2.get(i);
    }

    /* renamed from: p */
    public boolean m52640p(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f37763i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f37764j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f37765k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f37765k.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f37766l != null && ViewCompat.getTransitionName(view) != null && this.f37766l.contains(ViewCompat.getTransitionName(view))) {
            return false;
        }
        if ((this.f37759e.size() == 0 && this.f37760f.size() == 0 && (((arrayList = this.f37762h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f37761g) == null || arrayList2.isEmpty()))) || this.f37759e.contains(Integer.valueOf(id2)) || this.f37760f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f37761g;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.f37762h != null) {
            for (int i2 = 0; i2 < this.f37762h.size(); i2++) {
                if (((Class) this.f37762h.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        if (!this.f37748A) {
            ArrayMap m52642n = m52642n();
            int size = m52642n.size();
            InterfaceC19117b42 m22527d = AbstractC22210t32.m22527d(view);
            for (int i = size - 1; i >= 0; i--) {
                C5112d c5112d = (C5112d) m52642n.valueAt(i);
                if (c5112d.f37784a != null && m22527d.equals(c5112d.f37787d)) {
                    AbstractC0918N4.m67251b((Animator) m52642n.keyAt(i));
                }
            }
            ArrayList arrayList = this.f37749B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f37749B.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((TransitionListener) arrayList2.get(i2)).onTransitionPause(this);
                }
            }
            this.f37780z = true;
        }
    }

    /* renamed from: r */
    public final void m52638r(ArrayMap arrayMap, ArrayMap arrayMap2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) sparseArray.valueAt(i);
            if (view2 != null && m52640p(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i))) != null && m52640p(view)) {
                TransitionValues transitionValues = (TransitionValues) arrayMap.get(view2);
                TransitionValues transitionValues2 = (TransitionValues) arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.f37774t.add(transitionValues);
                    this.f37775u.add(transitionValues2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transitionListener) {
        ArrayList arrayList = this.f37749B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(transitionListener);
        if (this.f37749B.size() == 0) {
            this.f37749B = null;
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.f37760f.remove(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        if (this.f37780z) {
            if (!this.f37748A) {
                ArrayMap m52642n = m52642n();
                int size = m52642n.size();
                InterfaceC19117b42 m22527d = AbstractC22210t32.m22527d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C5112d c5112d = (C5112d) m52642n.valueAt(i);
                    if (c5112d.f37784a != null && m22527d.equals(c5112d.f37787d)) {
                        AbstractC0918N4.m67250c((Animator) m52642n.keyAt(i));
                    }
                }
                ArrayList arrayList = this.f37749B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f37749B.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((TransitionListener) arrayList2.get(i2)).onTransitionResume(this);
                    }
                }
            }
            this.f37780z = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        ArrayMap m52642n = m52642n();
        Iterator it = this.f37750C.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m52642n.containsKey(animator)) {
                start();
                m52631y(animator, m52642n);
            }
        }
        this.f37750C.clear();
        end();
    }

    /* renamed from: s */
    public final void m52637s(ArrayMap arrayMap, ArrayMap arrayMap2) {
        TransitionValues transitionValues;
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View view = (View) arrayMap.keyAt(size);
            if (view != null && m52640p(view) && (transitionValues = (TransitionValues) arrayMap2.remove(view)) != null && m52640p(transitionValues.view)) {
                this.f37774t.add((TransitionValues) arrayMap.removeAt(size));
                this.f37775u.add(transitionValues);
            }
        }
    }

    @NonNull
    public Transition setDuration(long j) {
        this.f37757c = j;
        return this;
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback epicenterCallback) {
        this.f37752E = epicenterCallback;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f37758d = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i = 0; i < iArr.length; i++) {
                if (m52641o(iArr[i])) {
                    if (m52651c(iArr, i)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.f37773s = (int[]) iArr.clone();
            return;
        }
        this.f37773s = f37745H;
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f37754G = f37746I;
        } else {
            this.f37754G = pathMotion;
        }
    }

    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        this.f37751D = transitionPropagation;
    }

    @NonNull
    public Transition setStartDelay(long j) {
        this.f37756b = j;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.f37779y == 0) {
            ArrayList arrayList = this.f37749B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f37749B.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((TransitionListener) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.f37748A = false;
        }
        this.f37779y++;
    }

    /* renamed from: t */
    public final void m52636t(ArrayMap arrayMap, ArrayMap arrayMap2, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        View view;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) longSparseArray.valueAt(i);
            if (view2 != null && m52640p(view2) && (view = (View) longSparseArray2.get(longSparseArray.keyAt(i))) != null && m52640p(view)) {
                TransitionValues transitionValues = (TransitionValues) arrayMap.get(view2);
                TransitionValues transitionValues2 = (TransitionValues) arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.f37774t.add(transitionValues);
                    this.f37775u.add(transitionValues2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    public String toString() {
        return mo52614B("");
    }

    /* renamed from: u */
    public final void m52635u(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3, ArrayMap arrayMap4) {
        View view;
        int size = arrayMap3.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayMap3.valueAt(i);
            if (view2 != null && m52640p(view2) && (view = (View) arrayMap4.get(arrayMap3.keyAt(i))) != null && m52640p(view)) {
                TransitionValues transitionValues = (TransitionValues) arrayMap.get(view2);
                TransitionValues transitionValues2 = (TransitionValues) arrayMap2.get(view);
                if (transitionValues != null && transitionValues2 != null) {
                    this.f37774t.add(transitionValues);
                    this.f37775u.add(transitionValues2);
                    arrayMap.remove(view2);
                    arrayMap2.remove(view);
                }
            }
        }
    }

    /* renamed from: v */
    public final void m52634v(C21940rV1 c21940rV1, C21940rV1 c21940rV12) {
        ArrayMap arrayMap = new ArrayMap(c21940rV1.f77297a);
        ArrayMap arrayMap2 = new ArrayMap(c21940rV12.f77297a);
        int i = 0;
        while (true) {
            int[] iArr = this.f37773s;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                m52636t(arrayMap, arrayMap2, c21940rV1.f77299c, c21940rV12.f77299c);
                            }
                        } else {
                            m52638r(arrayMap, arrayMap2, c21940rV1.f77298b, c21940rV12.f77298b);
                        }
                    } else {
                        m52635u(arrayMap, arrayMap2, c21940rV1.f77300d, c21940rV12.f77300d);
                    }
                } else {
                    m52637s(arrayMap, arrayMap2);
                }
                i++;
            } else {
                m52653a(arrayMap, arrayMap2);
                return;
            }
        }
    }

    /* renamed from: x */
    public void m52632x(ViewGroup viewGroup) {
        C5112d c5112d;
        this.f37774t = new ArrayList();
        this.f37775u = new ArrayList();
        m52634v(this.f37770p, this.f37771q);
        ArrayMap m52642n = m52642n();
        int size = m52642n.size();
        InterfaceC19117b42 m22527d = AbstractC22210t32.m22527d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) m52642n.keyAt(i);
            if (animator != null && (c5112d = (C5112d) m52642n.get(animator)) != null && c5112d.f37784a != null && m22527d.equals(c5112d.f37787d)) {
                TransitionValues transitionValues = c5112d.f37786c;
                View view = c5112d.f37784a;
                TransitionValues transitionValues2 = getTransitionValues(view, true);
                TransitionValues m52643m = m52643m(view, true);
                if (transitionValues2 == null && m52643m == null) {
                    m52643m = (TransitionValues) this.f37771q.f77297a.get(view);
                }
                if ((transitionValues2 != null || m52643m != null) && c5112d.f37788e.isTransitionRequired(transitionValues, m52643m)) {
                    if (!animator.isRunning() && !animator.isStarted()) {
                        m52642n.remove(animator);
                    } else {
                        animator.cancel();
                    }
                }
            }
        }
        createAnimators(viewGroup, this.f37770p, this.f37771q, this.f37774t, this.f37775u);
        runAnimators();
    }

    /* renamed from: y */
    public final void m52631y(Animator animator, ArrayMap arrayMap) {
        if (animator != null) {
            animator.addListener(new C5110b(arrayMap));
            animate(animator);
        }
    }

    /* renamed from: z */
    public void mo52608z(boolean z) {
        this.f37777w = z;
    }

    @NonNull
    public Transition addTarget(@IdRes int i) {
        if (i != 0) {
            this.f37759e.add(Integer.valueOf(i));
        }
        return this;
    }

    /* renamed from: clone */
    public Transition m73913clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f37750C = new ArrayList();
            transition.f37770p = new C21940rV1();
            transition.f37771q = new C21940rV1();
            transition.f37774t = null;
            transition.f37775u = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i, boolean z) {
        this.f37767m = m52647h(this.f37767m, i, z);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i, boolean z) {
        this.f37763i = m52647h(this.f37763i, i, z);
        return this;
    }

    @NonNull
    public Transition removeTarget(@IdRes int i) {
        if (i != 0) {
            this.f37759e.remove(Integer.valueOf(i));
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.f37761g == null) {
            this.f37761g = new ArrayList();
        }
        this.f37761g.add(str);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z) {
        this.f37769o = m52645j(this.f37769o, cls, z);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z) {
        this.f37766l = m52646i(this.f37766l, str, z);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList arrayList = this.f37761g;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z) {
        this.f37765k = m52645j(this.f37765k, cls, z);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList arrayList = this.f37762h;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.f37762h == null) {
            this.f37762h = new ArrayList();
        }
        this.f37762h.add(cls);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67267c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, TypedValues.TransitionType.S_DURATION, 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = TypedArrayUtils.getNamedInt(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(m52633w(namedString));
        }
        obtainStyledAttributes.recycle();
    }
}
