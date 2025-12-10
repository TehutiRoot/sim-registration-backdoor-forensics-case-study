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
    public final ArrayList f35547a;

    /* renamed from: b */
    public FrameLayout f35548b;

    /* renamed from: c */
    public Context f35549c;

    /* renamed from: d */
    public FragmentManager f35550d;

    /* renamed from: e */
    public int f35551e;

    /* renamed from: f */
    public TabHost.OnTabChangeListener f35552f;

    /* renamed from: g */
    public C4609c f35553g;

    /* renamed from: h */
    public boolean f35554h;

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    /* loaded from: classes2.dex */
    public static class C4606a implements TabHost.TabContentFactory {

        /* renamed from: a */
        public final Context f35555a;

        public C4606a(Context context) {
            this.f35555a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f35555a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$b */
    /* loaded from: classes2.dex */
    public static class C4607b extends View.BaseSavedState {
        public static final Parcelable.Creator<C4607b> CREATOR = new C4608a();

        /* renamed from: a */
        public String f35556a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$b$a */
        /* loaded from: classes2.dex */
        public class C4608a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4607b createFromParcel(Parcel parcel) {
                return new C4607b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C4607b[] newArray(int i) {
                return new C4607b[i];
            }
        }

        public C4607b(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f35556a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f35556a);
        }

        public C4607b(Parcel parcel) {
            super(parcel);
            this.f35556a = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$c */
    /* loaded from: classes2.dex */
    public static final class C4609c {

        /* renamed from: a */
        public final String f35557a;

        /* renamed from: b */
        public final Class f35558b;

        /* renamed from: c */
        public final Bundle f35559c;

        /* renamed from: d */
        public Fragment f35560d;

        public C4609c(String str, Class cls, Bundle bundle) {
            this.f35557a = str;
            this.f35558b = cls;
            this.f35559c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context) {
        super(context, null);
        this.f35547a = new ArrayList();
        m54308e(context, null);
    }

    /* renamed from: a */
    public final FragmentTransaction m54312a(String str, FragmentTransaction fragmentTransaction) {
        Fragment fragment;
        C4609c m54309d = m54309d(str);
        if (this.f35553g != m54309d) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.f35550d.beginTransaction();
            }
            C4609c c4609c = this.f35553g;
            if (c4609c != null && (fragment = c4609c.f35560d) != null) {
                fragmentTransaction.detach(fragment);
            }
            if (m54309d != null) {
                Fragment fragment2 = m54309d.f35560d;
                if (fragment2 == null) {
                    Fragment instantiate = this.f35550d.getFragmentFactory().instantiate(this.f35549c.getClassLoader(), m54309d.f35558b.getName());
                    m54309d.f35560d = instantiate;
                    instantiate.setArguments(m54309d.f35559c);
                    fragmentTransaction.add(this.f35551e, m54309d.f35560d, m54309d.f35557a);
                } else {
                    fragmentTransaction.attach(fragment2);
                }
            }
            this.f35553g = m54309d;
        }
        return fragmentTransaction;
    }

    @Deprecated
    public void addTab(@NonNull TabHost.TabSpec tabSpec, @NonNull Class<?> cls, @Nullable Bundle bundle) {
        tabSpec.setContent(new C4606a(this.f35549c));
        String tag = tabSpec.getTag();
        C4609c c4609c = new C4609c(tag, cls, bundle);
        if (this.f35554h) {
            Fragment findFragmentByTag = this.f35550d.findFragmentByTag(tag);
            c4609c.f35560d = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                FragmentTransaction beginTransaction = this.f35550d.beginTransaction();
                beginTransaction.detach(c4609c.f35560d);
                beginTransaction.commit();
            }
        }
        this.f35547a.add(c4609c);
        addTab(tabSpec);
    }

    /* renamed from: b */
    public final void m54311b() {
        if (this.f35548b == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f35551e);
            this.f35548b = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f35551e);
            }
        }
    }

    /* renamed from: c */
    public final void m54310c(Context context) {
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
            this.f35548b = frameLayout2;
            frameLayout2.setId(this.f35551e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: d */
    public final C4609c m54309d(String str) {
        int size = this.f35547a.size();
        for (int i = 0; i < size; i++) {
            C4609c c4609c = (C4609c) this.f35547a.get(i);
            if (c4609c.f35557a.equals(str)) {
                return c4609c;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m54308e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f35551e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f35547a.size();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < size; i++) {
            C4609c c4609c = (C4609c) this.f35547a.get(i);
            Fragment findFragmentByTag = this.f35550d.findFragmentByTag(c4609c.f35557a);
            c4609c.f35560d = findFragmentByTag;
            if (findFragmentByTag != null && !findFragmentByTag.isDetached()) {
                if (c4609c.f35557a.equals(currentTabTag)) {
                    this.f35553g = c4609c;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f35550d.beginTransaction();
                    }
                    fragmentTransaction.detach(c4609c.f35560d);
                }
            }
        }
        this.f35554h = true;
        FragmentTransaction m54312a = m54312a(currentTabTag, fragmentTransaction);
        if (m54312a != null) {
            m54312a.commit();
            this.f35550d.executePendingTransactions();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35554h = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C4607b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4607b c4607b = (C4607b) parcelable;
        super.onRestoreInstanceState(c4607b.getSuperState());
        setCurrentTabByTag(c4607b.f35556a);
    }

    @Override // android.view.View
    @NonNull
    @Deprecated
    public Parcelable onSaveInstanceState() {
        C4607b c4607b = new C4607b(super.onSaveInstanceState());
        c4607b.f35556a = getCurrentTabTag();
        return c4607b;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@Nullable String str) {
        FragmentTransaction m54312a;
        if (this.f35554h && (m54312a = m54312a(str, null)) != null) {
            m54312a.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f35552f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.f35552f = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        m54310c(context);
        super.setup();
        this.f35549c = context;
        this.f35550d = fragmentManager;
        m54311b();
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35547a = new ArrayList();
        m54308e(context, attributeSet);
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager, int i) {
        m54310c(context);
        super.setup();
        this.f35549c = context;
        this.f35550d = fragmentManager;
        this.f35551e = i;
        m54311b();
        this.f35548b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
