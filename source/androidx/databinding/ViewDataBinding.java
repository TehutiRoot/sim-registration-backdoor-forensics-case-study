package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.databinding.library.R;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.ViewBinding;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {
    public static final String BINDING_TAG_PREFIX = "binding_";

    /* renamed from: p */
    public static final int f34502p = 8;

    /* renamed from: a */
    public final Runnable f34511a;

    /* renamed from: b */
    public boolean f34512b;

    /* renamed from: c */
    public boolean f34513c;

    /* renamed from: d */
    public O32[] f34514d;

    /* renamed from: e */
    public final View f34515e;

    /* renamed from: f */
    public CallbackRegistry f34516f;

    /* renamed from: g */
    public boolean f34517g;

    /* renamed from: h */
    public Choreographer f34518h;

    /* renamed from: i */
    public final Choreographer.FrameCallback f34519i;

    /* renamed from: j */
    public Handler f34520j;

    /* renamed from: k */
    public ViewDataBinding f34521k;

    /* renamed from: l */
    public LifecycleOwner f34522l;

    /* renamed from: m */
    public C4282j f34523m;
    protected final DataBindingComponent mBindingComponent;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean mInStateFlowRegisterObserver;

    /* renamed from: n */
    public boolean f34524n;

    /* renamed from: o */
    public static int f34501o = Build.VERSION.SDK_INT;

    /* renamed from: q */
    public static final boolean f34503q = true;

    /* renamed from: r */
    public static final InterfaceC0838Lz f34504r = new C4273a();

    /* renamed from: s */
    public static final InterfaceC0838Lz f34505s = new C4274b();

    /* renamed from: t */
    public static final InterfaceC0838Lz f34506t = new C4275c();

    /* renamed from: u */
    public static final InterfaceC0838Lz f34507u = new C4276d();

    /* renamed from: v */
    public static final CallbackRegistry.NotifierCallback f34508v = new C4277e();

    /* renamed from: w */
    public static final ReferenceQueue f34509w = new ReferenceQueue();

    /* renamed from: x */
    public static final View.OnAttachStateChangeListener f34510x = new View$OnAttachStateChangeListenerC4278f();

    /* loaded from: classes2.dex */
    public static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i) {
            this.layouts = new String[i];
            this.indexes = new int[i];
            this.layoutIds = new int[i];
        }

        public void setIncludes(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i] = strArr;
            this.indexes[i] = iArr;
            this.layoutIds[i] = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {

        /* renamed from: a */
        public final int f34525a;

        public PropertyChangedInverseListener(int i) {
            this.f34525a = i;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            if (i == this.f34525a || i == 0) {
                onChange();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    /* loaded from: classes2.dex */
    public class C4273a implements InterfaceC0838Lz {
        @Override // p000.InterfaceC0838Lz
        /* renamed from: a */
        public O32 mo23372a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new C4285m(viewDataBinding, i, referenceQueue).m56305b();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    /* loaded from: classes2.dex */
    public class C4274b implements InterfaceC0838Lz {
        @Override // p000.InterfaceC0838Lz
        /* renamed from: a */
        public O32 mo23372a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new C4283k(viewDataBinding, i, referenceQueue).m56311b();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    /* loaded from: classes2.dex */
    public class C4275c implements InterfaceC0838Lz {
        @Override // p000.InterfaceC0838Lz
        /* renamed from: a */
        public O32 mo23372a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new C4284l(viewDataBinding, i, referenceQueue).m56308b();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    /* loaded from: classes2.dex */
    public class C4276d implements InterfaceC0838Lz {
        @Override // p000.InterfaceC0838Lz
        /* renamed from: a */
        public O32 mo23372a(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            return new C4281i(viewDataBinding, i, referenceQueue).m56314c();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    /* loaded from: classes2.dex */
    public class C4277e extends CallbackRegistry.NotifierCallback {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        /* renamed from: a */
        public void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i, Void r4) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        onRebindCallback.onBound(viewDataBinding);
                        return;
                    }
                    return;
                }
                onRebindCallback.onCanceled(viewDataBinding);
            } else if (!onRebindCallback.onPreBind(viewDataBinding)) {
                viewDataBinding.f34513c = true;
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    /* loaded from: classes2.dex */
    public class View$OnAttachStateChangeListenerC4278f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m56322l(view).f34511a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    /* loaded from: classes2.dex */
    public class RunnableC4279g implements Runnable {
        public RunnableC4279g() {
            ViewDataBinding.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f34512b = false;
            }
            ViewDataBinding.m56318p();
            if (!ViewDataBinding.this.f34515e.isAttachedToWindow()) {
                ViewDataBinding.this.f34515e.removeOnAttachStateChangeListener(ViewDataBinding.f34510x);
                ViewDataBinding.this.f34515e.addOnAttachStateChangeListener(ViewDataBinding.f34510x);
                return;
            }
            ViewDataBinding.this.executePendingBindings();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    /* loaded from: classes2.dex */
    public class Choreographer$FrameCallbackC4280h implements Choreographer.FrameCallback {
        public Choreographer$FrameCallbackC4280h() {
            ViewDataBinding.this = r1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            ViewDataBinding.this.f34511a.run();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$i */
    /* loaded from: classes2.dex */
    public static class C4281i implements Observer, InterfaceC19507dK0 {

        /* renamed from: a */
        public final O32 f34528a;

        /* renamed from: b */
        public WeakReference f34529b = null;

        public C4281i(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.f34528a = new O32(viewDataBinding, i, this, referenceQueue);
        }

        /* renamed from: b */
        private LifecycleOwner m56315b() {
            WeakReference weakReference = this.f34529b;
            if (weakReference == null) {
                return null;
            }
            return (LifecycleOwner) weakReference.get();
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: a */
        public void addListener(LiveData liveData) {
            LifecycleOwner m56315b = m56315b();
            if (m56315b != null) {
                liveData.observe(m56315b, this);
            }
        }

        /* renamed from: c */
        public O32 m56314c() {
            return this.f34528a;
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: d */
        public void removeListener(LiveData liveData) {
            liveData.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            ViewDataBinding m67135a = this.f34528a.m67135a();
            if (m67135a != null) {
                O32 o32 = this.f34528a;
                m67135a.handleFieldChange(o32.f4288b, o32.m67134b(), 0);
            }
        }

        @Override // p000.InterfaceC19507dK0
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            LifecycleOwner m56315b = m56315b();
            LiveData liveData = (LiveData) this.f34528a.m67134b();
            if (liveData != null) {
                if (m56315b != null) {
                    liveData.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    liveData.observe(lifecycleOwner, this);
                }
            }
            if (lifecycleOwner != null) {
                this.f34529b = new WeakReference(lifecycleOwner);
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$j */
    /* loaded from: classes2.dex */
    public static class C4282j implements LifecycleObserver {

        /* renamed from: a */
        public final WeakReference f34530a;

        public /* synthetic */ C4282j(ViewDataBinding viewDataBinding, C4273a c4273a) {
            this(viewDataBinding);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) this.f34530a.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }

        public C4282j(ViewDataBinding viewDataBinding) {
            this.f34530a = new WeakReference(viewDataBinding);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$k */
    /* loaded from: classes2.dex */
    public static class C4283k extends ObservableList.OnListChangedCallback implements InterfaceC19507dK0 {

        /* renamed from: a */
        public final O32 f34531a;

        public C4283k(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.f34531a = new O32(viewDataBinding, i, this, referenceQueue);
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: a */
        public void addListener(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        /* renamed from: b */
        public O32 m56311b() {
            return this.f34531a;
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: c */
        public void removeListener(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            ObservableList observableList2;
            ViewDataBinding m67135a = this.f34531a.m67135a();
            if (m67135a == null || (observableList2 = (ObservableList) this.f34531a.m67134b()) != observableList) {
                return;
            }
            m67135a.handleFieldChange(this.f34531a.f4288b, observableList2, 0);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
            onChanged(observableList);
        }

        @Override // p000.InterfaceC19507dK0
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$l */
    /* loaded from: classes2.dex */
    public static class C4284l extends ObservableMap.OnMapChangedCallback implements InterfaceC19507dK0 {

        /* renamed from: a */
        public final O32 f34532a;

        public C4284l(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.f34532a = new O32(viewDataBinding, i, this, referenceQueue);
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: a */
        public void addListener(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        /* renamed from: b */
        public O32 m56308b() {
            return this.f34532a;
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: c */
        public void removeListener(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(ObservableMap observableMap, Object obj) {
            ViewDataBinding m67135a = this.f34532a.m67135a();
            if (m67135a != null && observableMap == this.f34532a.m67134b()) {
                m67135a.handleFieldChange(this.f34532a.f4288b, observableMap, 0);
            }
        }

        @Override // p000.InterfaceC19507dK0
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$m */
    /* loaded from: classes2.dex */
    public static class C4285m extends Observable.OnPropertyChangedCallback implements InterfaceC19507dK0 {

        /* renamed from: a */
        public final O32 f34533a;

        public C4285m(ViewDataBinding viewDataBinding, int i, ReferenceQueue referenceQueue) {
            this.f34533a = new O32(viewDataBinding, i, this, referenceQueue);
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: a */
        public void addListener(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        /* renamed from: b */
        public O32 m56305b() {
            return this.f34533a;
        }

        @Override // p000.InterfaceC19507dK0
        /* renamed from: c */
        public void removeListener(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            ViewDataBinding m67135a = this.f34533a.m67135a();
            if (m67135a == null || ((Observable) this.f34533a.m67134b()) != observable) {
                return;
            }
            m67135a.handleFieldChange(this.f34533a.f4288b, observable, i);
        }

        @Override // p000.InterfaceC19507dK0
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i) {
        this.f34511a = new RunnableC4279g();
        this.f34512b = false;
        this.f34513c = false;
        this.mBindingComponent = dataBindingComponent;
        this.f34514d = new O32[i];
        this.f34515e = view;
        if (Looper.myLooper() != null) {
            if (f34503q) {
                this.f34518h = Choreographer.getInstance();
                this.f34519i = new Choreographer$FrameCallbackC4280h();
                return;
            }
            this.f34519i = null;
            this.f34520j = new Handler(Looper.myLooper());
            return;
        }
        throw new IllegalStateException("DataBinding must be created in view's UI Thread");
    }

    public static ViewDataBinding bind(Object obj, View view, int i) {
        return DataBindingUtil.m56360a(m56327g(obj), view, i);
    }

    public static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.m56326h();
    }

    /* renamed from: g */
    public static DataBindingComponent m56327g(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static int getBuildSdkInt() {
        return f34501o;
    }

    public static int getColorFromResource(View view, int i) {
        int color;
        if (Build.VERSION.SDK_INT >= 23) {
            color = view.getContext().getColor(i);
            return color;
        }
        return view.getResources().getColor(i);
    }

    public static ColorStateList getColorStateListFromResource(View view, int i) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList = view.getContext().getColorStateList(i);
            return colorStateList;
        }
        return view.getResources().getColorStateList(i);
    }

    public static Drawable getDrawableFromResource(View view, int i) {
        return view.getContext().getDrawable(i);
    }

    public static <K, T> T getFrom(Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    public static <T> T getFromArray(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static <T> T getFromList(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: i */
    public static int m56325i(String str, int i, IncludedLayouts includedLayouts, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = includedLayouts.layouts[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <T extends ViewDataBinding> T inflateInternal(@NonNull LayoutInflater layoutInflater, int i, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (T) DataBindingUtil.inflate(layoutInflater, i, viewGroup, z, m56327g(obj));
    }

    /* renamed from: j */
    public static int m56324j(ViewGroup viewGroup, int i) {
        String str;
        String str2 = (String) viewGroup.getChildAt(i).getTag();
        String substring = str2.substring(0, str2.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getTag() instanceof String) {
                str = (String) childAt.getTag();
            } else {
                str = null;
            }
            if (str != null && str.startsWith(substring)) {
                if (str.length() == str2.length() && str.charAt(str.length() - 1) == '0') {
                    return i;
                }
                if (m56321m(str, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: l */
    public static ViewDataBinding m56322l(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m56321m(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m56320n(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0112 A[SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m56320n(androidx.databinding.DataBindingComponent r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.IncludedLayouts r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.m56320n(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$IncludedLayouts, android.util.SparseIntArray, boolean):void");
    }

    /* renamed from: o */
    public static int m56319o(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* renamed from: p */
    public static void m56318p() {
        while (true) {
            Reference poll = f34509w.poll();
            if (poll != null) {
                if (poll instanceof O32) {
                    ((O32) poll).m67131e();
                }
            } else {
                return;
            }
        }
    }

    public static boolean parse(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    public static <T> void setTo(T[] tArr, int i, T t) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return;
        }
        tArr[i] = t;
    }

    public void addOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        if (this.f34516f == null) {
            this.f34516f = new CallbackRegistry(f34508v);
        }
        this.f34516f.add(onRebindCallback);
    }

    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    public abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.f34521k;
        if (viewDataBinding == null) {
            m56326h();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    @Nullable
    public LifecycleOwner getLifecycleOwner() {
        return this.f34522l;
    }

    public Object getObservedField(int i) {
        O32 o32 = this.f34514d[i];
        if (o32 == null) {
            return null;
        }
        return o32.m67134b();
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f34515e;
    }

    /* renamed from: h */
    public final void m56326h() {
        if (this.f34517g) {
            requestRebind();
        } else if (!hasPendingBindings()) {
        } else {
            this.f34517g = true;
            this.f34513c = false;
            CallbackRegistry callbackRegistry = this.f34516f;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.f34513c) {
                    this.f34516f.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.f34513c) {
                executeBindings();
                CallbackRegistry callbackRegistry2 = this.f34516f;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.f34517g = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void handleFieldChange(int i, Object obj, int i2) {
        if (!this.f34524n && !this.mInStateFlowRegisterObserver && onFieldChange(i, obj, i2)) {
            requestRebind();
        }
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    /* renamed from: k */
    public void m56323k() {
        executeBindings();
    }

    public abstract boolean onFieldChange(int i, Object obj, int i2);

    public void registerTo(int i, Object obj, InterfaceC0838Lz interfaceC0838Lz) {
        if (obj == null) {
            return;
        }
        O32 o32 = this.f34514d[i];
        if (o32 == null) {
            o32 = interfaceC0838Lz.mo23372a(this, i, f34509w);
            this.f34514d[i] = o32;
            LifecycleOwner lifecycleOwner = this.f34522l;
            if (lifecycleOwner != null) {
                o32.m67133c(lifecycleOwner);
            }
        }
        o32.m67132d(obj);
    }

    public void removeOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        CallbackRegistry callbackRegistry = this.f34516f;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    public void requestRebind() {
        ViewDataBinding viewDataBinding = this.f34521k;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        LifecycleOwner lifecycleOwner = this.f34522l;
        if (lifecycleOwner != null && !lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f34512b) {
                    return;
                }
                this.f34512b = true;
                if (f34503q) {
                    this.f34518h.postFrameCallback(this.f34519i);
                } else {
                    this.f34520j.post(this.f34511a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f34521k = this;
        }
    }

    @MainThread
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        O32[] o32Arr;
        if (lifecycleOwner instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        LifecycleOwner lifecycleOwner2 = this.f34522l;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.f34523m);
        }
        this.f34522l = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.f34523m == null) {
                this.f34523m = new C4282j(this, null);
            }
            lifecycleOwner.getLifecycle().addObserver(this.f34523m);
        }
        for (O32 o32 : this.f34514d) {
            if (o32 != null) {
                o32.m67133c(lifecycleOwner);
            }
        }
    }

    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i, @Nullable Object obj);

    public void unbind() {
        O32[] o32Arr;
        for (O32 o32 : this.f34514d) {
            if (o32 != null) {
                o32.m67131e();
            }
        }
    }

    public boolean unregisterFrom(int i) {
        O32 o32 = this.f34514d[i];
        if (o32 != null) {
            return o32.m67131e();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int i, LiveData<?> liveData) {
        this.f34524n = true;
        try {
            return updateRegistration(i, liveData, f34507u);
        } finally {
            this.f34524n = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean updateRegistration(int i, Object obj, InterfaceC0838Lz interfaceC0838Lz) {
        if (obj == null) {
            return unregisterFrom(i);
        }
        O32 o32 = this.f34514d[i];
        if (o32 == null) {
            registerTo(i, obj, interfaceC0838Lz);
            return true;
        } else if (o32.m67134b() == obj) {
            return false;
        } else {
            unregisterFrom(i);
            registerTo(i, obj, interfaceC0838Lz);
            return true;
        }
    }

    public static byte parse(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    public static long safeUnbox(Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public static boolean getFromArray(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    public static <T> T getFromList(SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View view : viewArr) {
            m56320n(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    public static short parse(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    public static short safeUnbox(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public static void setTo(boolean[] zArr, int i, boolean z) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return;
        }
        zArr[i] = z;
    }

    @TargetApi(16)
    public static <T> T getFromList(LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    public static int parse(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static byte safeUnbox(Byte b) {
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    public static byte getFromArray(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i];
    }

    public static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    public static long parse(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static char safeUnbox(Character ch2) {
        if (ch2 == null) {
            return (char) 0;
        }
        return ch2.charValue();
    }

    public static void setTo(byte[] bArr, int i, byte b) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return;
        }
        bArr[i] = b;
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    public static float parse(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static double safeUnbox(Double d) {
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public static short getFromArray(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return (short) 0;
        }
        return sArr[i];
    }

    public static int getFromList(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    public static double parse(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static float safeUnbox(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static void setTo(short[] sArr, int i, short s) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return;
        }
        sArr[i] = s;
    }

    public boolean updateRegistration(int i, Observable observable) {
        return updateRegistration(i, observable, f34504r);
    }

    @TargetApi(18)
    public static long getFromList(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0L;
        }
        return sparseLongArray.get(i);
    }

    public static char parse(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean updateRegistration(int i, ObservableList observableList) {
        return updateRegistration(i, observableList, f34505s);
    }

    public static char getFromArray(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    public static void setTo(char[] cArr, int i, char c) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return;
        }
        cArr[i] = c;
    }

    public boolean updateRegistration(int i, ObservableMap observableMap) {
        return updateRegistration(i, observableMap, f34506t);
    }

    public static int getFromArray(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    public static void setTo(int[] iArr, int i, int i2) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return;
        }
        iArr[i] = i2;
    }

    public static long getFromArray(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0L;
        }
        return jArr[i];
    }

    public static void setTo(long[] jArr, int i, long j) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return;
        }
        jArr[i] = j;
    }

    public ViewDataBinding(Object obj, View view, int i) {
        this(m56327g(obj), view, i);
    }

    public static float getFromArray(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    public static void setTo(float[] fArr, int i, float f) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return;
        }
        fArr[i] = f;
    }

    public static double getFromArray(double[] dArr, int i) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return 0.0d;
        }
        return dArr[i];
    }

    public static void setTo(double[] dArr, int i, double d) {
        if (dArr == null || i < 0 || i >= dArr.length) {
            return;
        }
        dArr[i] = d;
    }

    public static <T> void setTo(List<T> list, int i, T t) {
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        list.set(i, t);
    }

    public static <T> void setTo(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray == null || i < 0 || i >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i, t);
    }

    @TargetApi(16)
    public static <T> void setTo(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray == null || i < 0 || i >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i, t);
    }

    public static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray == null || i < 0 || i >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i, t);
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray == null || i < 0 || i >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i, z);
    }

    public static void setTo(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray == null || i < 0 || i >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i, i2);
    }

    @TargetApi(18)
    public static void setTo(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray == null || i < 0 || i >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i, j);
    }

    public static <K, T> void setTo(Map<K, T> map, K k, T t) {
        if (map == null) {
            return;
        }
        map.put(k, t);
    }
}
