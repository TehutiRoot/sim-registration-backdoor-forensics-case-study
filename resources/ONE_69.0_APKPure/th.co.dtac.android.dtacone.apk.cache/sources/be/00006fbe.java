package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes2.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    public final ArrayList f35635a;

    /* renamed from: b */
    public FrameLayout f35636b;

    /* renamed from: c */
    public Context f35637c;

    /* renamed from: d */
    public FragmentManager f35638d;

    /* renamed from: e */
    public int f35639e;

    /* renamed from: f */
    public TabHost.OnTabChangeListener f35640f;

    /* renamed from: g */
    public C4591c f35641g;

    /* renamed from: h */
    public boolean f35642h;

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    /* loaded from: classes2.dex */
    public static class C4588a implements TabHost.TabContentFactory {

        /* renamed from: a */
        public final Context f35643a;

        public C4588a(Context context) {
            this.f35643a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f35643a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$b */
    /* loaded from: classes2.dex */
    public static class C4589b extends View.BaseSavedState {
        public static final Parcelable.Creator<C4589b> CREATOR = new C4590a();

        /* renamed from: a */
        public String f35644a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$b$a */
        /* loaded from: classes2.dex */
        public class C4590a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4589b createFromParcel(Parcel parcel) {
                return new C4589b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C4589b[] newArray(int i) {
                return new C4589b[i];
            }
        }

        public C4589b(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f35644a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f35644a);
        }

        public C4589b(Parcel parcel) {
            super(parcel);
            this.f35644a = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$c */
    /* loaded from: classes2.dex */
    public static final class C4591c {

        /* renamed from: a */
        public final String f35645a;

        /* renamed from: b */
        public final Class f35646b;

        /* renamed from: c */
        public final Bundle f35647c;

        /* renamed from: d */
        public Fragment f35648d;

        public C4591c(String str, Class cls, Bundle bundle) {
            this.f35645a = str;
            this.f35646b = cls;
            this.f35647c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context) {
        super(context, null);
        this.f35635a = new ArrayList();
        m54259e(context, null);
    }

    /* renamed from: a */
    public final FragmentTransaction m54263a(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        C4591c m54260d = m54260d(str);
        if (this.f35641g != m54260d) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f35638d.beginTransaction();
            }
            C4591c c4591c = this.f35641g;
            if (c4591c != null && (fragment = c4591c.f35648d) != null) {
                fragmentTransaction.detach(fragment);
            }
            if (m54260d != null) {
                Fragment fragment2 = m54260d.f35648d;
                if (fragment2 == null) {
                    Fragment instantiate = this.f35638d.getFragmentFactory().instantiate(this.f35637c.getClassLoader(), m54260d.f35646b.getName());
                    m54260d.f35648d = instantiate;
                    instantiate.setArguments(m54260d.f35647c);
                    fragmentTransaction.add(this.f35639e, m54260d.f35648d, m54260d.f35645a);
                } else {
                    fragmentTransaction.attach(fragment2);
                }
            }
            this.f35641g = m54260d;
        }
        return fragmentTransaction;
    }

    @Deprecated
    public void addTab(@NonNull TabHost.TabSpec tabSpec, @NonNull Class<?> cls, @Nullable Bundle bundle) {
        tabSpec.setContent(new C4588a(this.f35637c));
        String tag = tabSpec.getTag();
        C4591c c4591c = new C4591c(tag, cls, bundle);
        if (this.f35642h) {
            Fragment findFragmentByTag = this.f35638d.findFragmentByTag(tag);
            c4591c.f35648d = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                FragmentTransaction beginTransaction = this.f35638d.beginTransaction();
                beginTransaction.detach(c4591c.f35648d);
                beginTransaction.commit();
            }
        }
        this.f35635a.add(c4591c);
        addTab(tabSpec);
    }

    /* renamed from: b */
    public final void m54262b() {
        if (this.f35636b == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f35639e);
            this.f35636b = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f35639e);
            }
        }
    }

    /* renamed from: c */
    public final void m54261c(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f35636b = frameLayout2;
            frameLayout2.setId(this.f35639e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: d */
    public final C4591c m54260d(String str) {
        int size = this.f35635a.size();
        for (int i = 0; i < size; i++) {
            C4591c c4591c = (C4591c) this.f35635a.get(i);
            if (c4591c.f35645a.equals(str)) {
                return c4591c;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m54259e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f35639e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f35635a.size();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < size; i++) {
            C4591c c4591c = (C4591c) this.f35635a.get(i);
            Fragment findFragmentByTag = this.f35638d.findFragmentByTag(c4591c.f35645a);
            c4591c.f35648d = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                if (c4591c.f35645a.equals(currentTabTag)) {
                    this.f35641g = c4591c;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f35638d.beginTransaction();
                    }
                    fragmentTransaction.detach(c4591c.f35648d);
                }
            }
        }
        this.f35642h = true;
        FragmentTransaction m54263a = m54263a(currentTabTag, fragmentTransaction);
        if (m54263a != null) {
            m54263a.commit();
            this.f35638d.executePendingTransactions();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35642h = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C4589b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4589b c4589b = (C4589b) parcelable;
        super.onRestoreInstanceState(c4589b.getSuperState());
        setCurrentTabByTag(c4589b.f35644a);
    }

    @Override // android.view.View
    @NonNull
    @Deprecated
    public Parcelable onSaveInstanceState() {
        C4589b c4589b = new C4589b(super.onSaveInstanceState());
        c4589b.f35644a = getCurrentTabTag();
        return c4589b;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@Nullable String str) {
        FragmentTransaction m54263a;
        if (this.f35642h && (m54263a = m54263a(str, null)) != null) {
            m54263a.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f35640f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.f35640f = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        m54261c(context);
        super.setup();
        this.f35637c = context;
        this.f35638d = fragmentManager;
        m54262b();
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35635a = new ArrayList();
        m54259e(context, attributeSet);
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager, int i) {
        m54261c(context);
        super.setup();
        this.f35637c = context;
        this.f35638d = fragmentManager;
        this.f35639e = i;
        m54262b();
        this.f35636b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}