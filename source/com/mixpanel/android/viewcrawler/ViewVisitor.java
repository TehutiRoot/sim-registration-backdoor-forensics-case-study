package com.mixpanel.android.viewcrawler;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mixpanel.android.util.MPLog;
import com.mixpanel.android.viewcrawler.Pathfinder;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public abstract class ViewVisitor implements Pathfinder.Accumulator {

    /* renamed from: a */
    public final List f58833a;

    /* renamed from: b */
    public final Pathfinder f58834b = new Pathfinder();

    /* loaded from: classes5.dex */
    public static class AddAccessibilityEventVisitor extends AbstractC9222c {

        /* renamed from: f */
        public final int f58835f;

        /* renamed from: g */
        public final WeakHashMap f58836g;

        /* renamed from: com.mixpanel.android.viewcrawler.ViewVisitor$AddAccessibilityEventVisitor$a */
        /* loaded from: classes5.dex */
        public class C9217a extends View.AccessibilityDelegate {

            /* renamed from: a */
            public View.AccessibilityDelegate f58837a;

            public C9217a(View.AccessibilityDelegate accessibilityDelegate) {
                this.f58837a = accessibilityDelegate;
            }

            /* renamed from: a */
            public View.AccessibilityDelegate m33382a() {
                return this.f58837a;
            }

            /* renamed from: b */
            public void m33381b(C9217a c9217a) {
                View.AccessibilityDelegate accessibilityDelegate = this.f58837a;
                if (accessibilityDelegate == c9217a) {
                    this.f58837a = c9217a.m33382a();
                } else if (accessibilityDelegate instanceof C9217a) {
                    ((C9217a) accessibilityDelegate).m33381b(c9217a);
                }
            }

            /* renamed from: c */
            public boolean m33380c(String str) {
                if (AddAccessibilityEventVisitor.this.getEventName() == str) {
                    return true;
                }
                View.AccessibilityDelegate accessibilityDelegate = this.f58837a;
                if (accessibilityDelegate instanceof C9217a) {
                    return ((C9217a) accessibilityDelegate).m33380c(str);
                }
                return false;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void sendAccessibilityEvent(View view, int i) {
                if (i == AddAccessibilityEventVisitor.this.f58835f) {
                    AddAccessibilityEventVisitor.this.fireEvent(view);
                }
                View.AccessibilityDelegate accessibilityDelegate = this.f58837a;
                if (accessibilityDelegate != null) {
                    accessibilityDelegate.sendAccessibilityEvent(view, i);
                }
            }
        }

        public AddAccessibilityEventVisitor(List<Pathfinder.PathElement> list, int i, String str, OnEventListener onEventListener) {
            super(list, str, onEventListener, false);
            this.f58835f = i;
            this.f58836g = new WeakHashMap();
        }

        @Override // com.mixpanel.android.viewcrawler.Pathfinder.Accumulator
        public void accumulate(View view) {
            View.AccessibilityDelegate m33383b = m33383b(view);
            if ((m33383b instanceof C9217a) && ((C9217a) m33383b).m33380c(getEventName())) {
                return;
            }
            C9217a c9217a = new C9217a(m33383b);
            view.setAccessibilityDelegate(c9217a);
            this.f58836g.put(view, c9217a);
        }

        /* renamed from: b */
        public final View.AccessibilityDelegate m33383b(View view) {
            try {
                return (View.AccessibilityDelegate) view.getClass().getMethod("getAccessibilityDelegate", null).invoke(view, null);
            } catch (IllegalAccessException | NoSuchMethodException unused) {
                return null;
            } catch (InvocationTargetException e) {
                MPLog.m33450w("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", e);
                return null;
            }
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public void cleanup() {
            for (Map.Entry entry : this.f58836g.entrySet()) {
                View view = (View) entry.getKey();
                C9217a c9217a = (C9217a) entry.getValue();
                View.AccessibilityDelegate m33383b = m33383b(view);
                if (m33383b == c9217a) {
                    view.setAccessibilityDelegate(c9217a.m33382a());
                } else if (m33383b instanceof C9217a) {
                    ((C9217a) m33383b).m33381b(c9217a);
                }
            }
            this.f58836g.clear();
        }

        public String name() {
            return getEventName() + " event when (" + this.f58835f + ")";
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public /* bridge */ /* synthetic */ void visit(View view) {
            super.visit(view);
        }
    }

    /* loaded from: classes5.dex */
    public static class AddTextChangeListener extends AbstractC9222c {

        /* renamed from: f */
        public final Map f58839f;

        /* renamed from: com.mixpanel.android.viewcrawler.ViewVisitor$AddTextChangeListener$a */
        /* loaded from: classes5.dex */
        public class C9218a implements TextWatcher {

            /* renamed from: a */
            public final View f58840a;

            public C9218a(View view) {
                this.f58840a = view;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                AddTextChangeListener.this.fireEvent(this.f58840a);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        public AddTextChangeListener(List<Pathfinder.PathElement> list, String str, OnEventListener onEventListener) {
            super(list, str, onEventListener, true);
            this.f58839f = new HashMap();
        }

        @Override // com.mixpanel.android.viewcrawler.Pathfinder.Accumulator
        public void accumulate(View view) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                C9218a c9218a = new C9218a(textView);
                TextWatcher textWatcher = (TextWatcher) this.f58839f.get(textView);
                if (textWatcher != null) {
                    textView.removeTextChangedListener(textWatcher);
                }
                textView.addTextChangedListener(c9218a);
                this.f58839f.put(textView, c9218a);
            }
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public void cleanup() {
            for (Map.Entry entry : this.f58839f.entrySet()) {
                ((TextView) entry.getKey()).removeTextChangedListener((TextWatcher) entry.getValue());
            }
            this.f58839f.clear();
        }

        public String name() {
            return getEventName() + " on Text Change";
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public /* bridge */ /* synthetic */ void visit(View view) {
            super.visit(view);
        }
    }

    /* loaded from: classes5.dex */
    public static class LayoutErrorMessage {

        /* renamed from: a */
        public final String f58842a;

        /* renamed from: b */
        public final String f58843b;

        public LayoutErrorMessage(String str, String str2) {
            this.f58842a = str;
            this.f58843b = str2;
        }

        public String getErrorType() {
            return this.f58842a;
        }

        public String getName() {
            return this.f58843b;
        }
    }

    /* loaded from: classes5.dex */
    public static class LayoutRule {
        public final int anchor;
        public final int verb;
        public final int viewId;

        public LayoutRule(int i, int i2, int i3) {
            this.viewId = i;
            this.verb = i2;
            this.anchor = i3;
        }
    }

    /* loaded from: classes5.dex */
    public static class LayoutUpdateVisitor extends ViewVisitor {

        /* renamed from: i */
        public static final Set f58844i = new HashSet(Arrays.asList(0, 1, 5, 7));

        /* renamed from: j */
        public static final Set f58845j = new HashSet(Arrays.asList(2, 3, 4, 6, 8));

        /* renamed from: c */
        public final WeakHashMap f58846c;

        /* renamed from: d */
        public final List f58847d;

        /* renamed from: e */
        public final String f58848e;

        /* renamed from: f */
        public boolean f58849f;

        /* renamed from: g */
        public final OnLayoutErrorListener f58850g;

        /* renamed from: h */
        public final C9221b f58851h;

        /* renamed from: com.mixpanel.android.viewcrawler.ViewVisitor$LayoutUpdateVisitor$a */
        /* loaded from: classes5.dex */
        public class C9219a implements Comparator {
            public C9219a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(View view, View view2) {
                if (view == view2) {
                    return 0;
                }
                if (view == null) {
                    return -1;
                }
                if (view2 == null) {
                    return 1;
                }
                return view2.hashCode() - view.hashCode();
            }
        }

        public LayoutUpdateVisitor(List<Pathfinder.PathElement> list, List<LayoutRule> list2, String str, OnLayoutErrorListener onLayoutErrorListener) {
            super(list);
            this.f58846c = new WeakHashMap();
            this.f58847d = list2;
            this.f58848e = str;
            this.f58849f = true;
            this.f58850g = onLayoutErrorListener;
            this.f58851h = new C9221b();
        }

        /* renamed from: a */
        public final boolean m33379a(Set set, SparseArray sparseArray) {
            TreeMap treeMap = new TreeMap(new C9219a());
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                View view = (View) sparseArray.valueAt(i);
                int[] rules = ((RelativeLayout.LayoutParams) view.getLayoutParams()).getRules();
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int i2 = rules[((Integer) it.next()).intValue()];
                    if (i2 > 0 && i2 != view.getId()) {
                        arrayList.add(sparseArray.get(i2));
                    }
                }
                treeMap.put(view, arrayList);
            }
            return this.f58851h.m33376b(treeMap);
        }

        @Override // com.mixpanel.android.viewcrawler.Pathfinder.Accumulator
        public void accumulate(View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            SparseArray sparseArray = new SparseArray();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                int id2 = childAt.getId();
                if (id2 > 0) {
                    sparseArray.put(id2, childAt);
                }
            }
            int size = this.f58847d.size();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutRule layoutRule = (LayoutRule) this.f58847d.get(i2);
                View view2 = (View) sparseArray.get(layoutRule.viewId);
                if (view2 != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view2.getLayoutParams();
                    int[] iArr = (int[]) layoutParams.getRules().clone();
                    if (iArr[layoutRule.verb] != layoutRule.anchor) {
                        if (!this.f58846c.containsKey(view2)) {
                            this.f58846c.put(view2, iArr);
                        }
                        layoutParams.addRule(layoutRule.verb, layoutRule.anchor);
                        Set set = f58844i;
                        if (!set.contains(Integer.valueOf(layoutRule.verb))) {
                            set = f58845j;
                            if (!set.contains(Integer.valueOf(layoutRule.verb))) {
                                set = null;
                            }
                        }
                        if (set != null && !m33379a(set, sparseArray)) {
                            cleanup();
                            this.f58850g.onLayoutError(new LayoutErrorMessage("circular_dependency", this.f58848e));
                            return;
                        }
                        view2.setLayoutParams(layoutParams);
                    } else {
                        continue;
                    }
                }
            }
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public void cleanup() {
            Iterator it = this.f58846c.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    View view = (View) entry.getKey();
                    int[] iArr = (int[]) entry.getValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    for (int i = 0; i < iArr.length; i++) {
                        layoutParams.addRule(i, iArr[i]);
                    }
                    view.setLayoutParams(layoutParams);
                } else {
                    this.f58849f = false;
                    return;
                }
            }
        }

        public String name() {
            return "Layout Update";
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public void visit(View view) {
            if (this.f58849f) {
                getPathfinder().m33427c(view, getPath(), this);
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface OnEventListener {
        void OnEvent(View view, String str, boolean z);
    }

    /* loaded from: classes5.dex */
    public interface OnLayoutErrorListener {
        void onLayoutError(LayoutErrorMessage layoutErrorMessage);
    }

    /* loaded from: classes5.dex */
    public static class PropertySetVisitor extends ViewVisitor {

        /* renamed from: c */
        public final C13106ph f58853c;

        /* renamed from: d */
        public final C13106ph f58854d;

        /* renamed from: e */
        public final WeakHashMap f58855e;

        /* renamed from: f */
        public final Object[] f58856f;

        public PropertySetVisitor(List<Pathfinder.PathElement> list, C13106ph c13106ph, C13106ph c13106ph2) {
            super(list);
            this.f58853c = c13106ph;
            this.f58854d = c13106ph2;
            this.f58856f = new Object[1];
            this.f58855e = new WeakHashMap();
        }

        @Override // com.mixpanel.android.viewcrawler.Pathfinder.Accumulator
        public void accumulate(View view) {
            if (this.f58854d != null) {
                Object[] m23631e = this.f58853c.m23631e();
                if (1 == m23631e.length) {
                    Object obj = m23631e[0];
                    Object m23635a = this.f58854d.m23635a(view);
                    if (obj == m23635a) {
                        return;
                    }
                    if (obj != null) {
                        if ((obj instanceof Bitmap) && (m23635a instanceof Bitmap)) {
                            if (((Bitmap) obj).sameAs((Bitmap) m23635a)) {
                                return;
                            }
                        } else if ((obj instanceof BitmapDrawable) && (m23635a instanceof BitmapDrawable)) {
                            Bitmap bitmap = ((BitmapDrawable) obj).getBitmap();
                            Bitmap bitmap2 = ((BitmapDrawable) m23635a).getBitmap();
                            if (bitmap != null && bitmap.sameAs(bitmap2)) {
                                return;
                            }
                        } else if (obj.equals(m23635a)) {
                            return;
                        }
                    }
                    if (!(m23635a instanceof Bitmap) && !(m23635a instanceof BitmapDrawable) && !this.f58855e.containsKey(view)) {
                        Object[] objArr = this.f58856f;
                        objArr[0] = m23635a;
                        if (this.f58853c.m23633c(objArr)) {
                            this.f58855e.put(view, m23635a);
                        } else {
                            this.f58855e.put(view, null);
                        }
                    }
                }
            }
            this.f58853c.m23635a(view);
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public void cleanup() {
            for (Map.Entry entry : this.f58855e.entrySet()) {
                View view = (View) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    Object[] objArr = this.f58856f;
                    objArr[0] = value;
                    this.f58853c.m23634b(view, objArr);
                }
            }
        }

        public String name() {
            return "Property Mutator";
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public /* bridge */ /* synthetic */ void visit(View view) {
            super.visit(view);
        }
    }

    /* loaded from: classes5.dex */
    public static class ViewDetectorVisitor extends AbstractC9222c {

        /* renamed from: f */
        public boolean f58857f;

        public ViewDetectorVisitor(List<Pathfinder.PathElement> list, String str, OnEventListener onEventListener) {
            super(list, str, onEventListener, false);
            this.f58857f = false;
        }

        @Override // com.mixpanel.android.viewcrawler.Pathfinder.Accumulator
        public void accumulate(View view) {
            boolean z;
            if (view != null && !this.f58857f) {
                fireEvent(view);
            }
            if (view != null) {
                z = true;
            } else {
                z = false;
            }
            this.f58857f = z;
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public void cleanup() {
        }

        public String name() {
            return getEventName() + " when Detected";
        }

        @Override // com.mixpanel.android.viewcrawler.ViewVisitor
        public /* bridge */ /* synthetic */ void visit(View view) {
            super.visit(view);
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewVisitor$b */
    /* loaded from: classes5.dex */
    public static class C9221b {
        public C9221b() {
        }

        /* renamed from: a */
        public final boolean m33377a(TreeMap treeMap, View view, List list) {
            if (list.contains(view)) {
                return false;
            }
            if (treeMap.containsKey(view)) {
                List list2 = (List) treeMap.remove(view);
                list.add(view);
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    if (!m33377a(treeMap, (View) list2.get(i), list)) {
                        return false;
                    }
                }
                list.remove(view);
                return true;
            }
            return true;
        }

        /* renamed from: b */
        public boolean m33376b(TreeMap treeMap) {
            ArrayList arrayList = new ArrayList();
            while (!treeMap.isEmpty()) {
                if (!m33377a(treeMap, (View) treeMap.firstKey(), arrayList)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.ViewVisitor$c */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC9222c extends ViewVisitor {

        /* renamed from: c */
        public final OnEventListener f58858c;

        /* renamed from: d */
        public final String f58859d;

        /* renamed from: e */
        public final boolean f58860e;

        public AbstractC9222c(List list, String str, OnEventListener onEventListener, boolean z) {
            super(list);
            this.f58858c = onEventListener;
            this.f58859d = str;
            this.f58860e = z;
        }

        public void fireEvent(View view) {
            this.f58858c.OnEvent(view, this.f58859d, this.f58860e);
        }

        public String getEventName() {
            return this.f58859d;
        }
    }

    public ViewVisitor(List list) {
        this.f58833a = list;
    }

    public abstract void cleanup();

    public List<Pathfinder.PathElement> getPath() {
        return this.f58833a;
    }

    public Pathfinder getPathfinder() {
        return this.f58834b;
    }

    public void visit(View view) {
        this.f58834b.m33427c(view, this.f58833a, this);
    }
}
