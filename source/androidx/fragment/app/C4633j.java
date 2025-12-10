package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p005os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes2.dex */
public class C4633j {

    /* renamed from: a */
    public final C4625f f35685a;

    /* renamed from: b */
    public final C4636k f35686b;

    /* renamed from: c */
    public final Fragment f35687c;

    /* renamed from: d */
    public boolean f35688d = false;

    /* renamed from: e */
    public int f35689e = -1;

    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes2.dex */
    public class View$OnAttachStateChangeListenerC4634a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f35690a;

        public View$OnAttachStateChangeListenerC4634a(View view) {
            this.f35690a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f35690a.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(this.f35690a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.j$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4635b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35692a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f35692a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35692a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35692a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35692a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C4633j(C4625f c4625f, C4636k c4636k, Fragment fragment) {
        this.f35685a = c4625f;
        this.f35686b = c4636k;
        this.f35687c = fragment;
    }

    /* renamed from: a */
    public void m54224a() {
        Bundle bundle;
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f35687c);
        }
        Bundle bundle2 = this.f35687c.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        this.f35687c.performActivityCreated(bundle);
        this.f35685a.m54260a(this.f35687c, bundle, false);
    }

    /* renamed from: b */
    public void m54223b() {
        Fragment m54371h0 = FragmentManager.m54371h0(this.f35687c.mContainer);
        Fragment parentFragment = this.f35687c.getParentFragment();
        if (m54371h0 != null && !m54371h0.equals(parentFragment)) {
            Fragment fragment = this.f35687c;
            FragmentStrictMode.onWrongNestedHierarchy(fragment, m54371h0, fragment.mContainerId);
        }
        int m54190j = this.f35686b.m54190j(this.f35687c);
        Fragment fragment2 = this.f35687c;
        fragment2.mContainer.addView(fragment2.mView, m54190j);
    }

    /* renamed from: c */
    public void m54222c() {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f35687c);
        }
        Fragment fragment = this.f35687c;
        Fragment fragment2 = fragment.mTarget;
        C4633j c4633j = null;
        if (fragment2 != null) {
            C4633j m54185o = this.f35686b.m54185o(fragment2.mWho);
            if (m54185o != null) {
                Fragment fragment3 = this.f35687c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                c4633j = m54185o;
            } else {
                throw new IllegalStateException("Fragment " + this.f35687c + " declared target fragment " + this.f35687c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c4633j = this.f35686b.m54185o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f35687c + " declared target fragment " + this.f35687c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c4633j != null) {
            c4633j.m54212m();
        }
        Fragment fragment4 = this.f35687c;
        fragment4.mHost = fragment4.mFragmentManager.getHost();
        Fragment fragment5 = this.f35687c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m54337t0();
        this.f35685a.m54254g(this.f35687c, false);
        this.f35687c.performAttach();
        this.f35685a.m54259b(this.f35687c, false);
    }

    /* renamed from: d */
    public int m54221d() {
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
        Fragment fragment = this.f35687c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f35689e;
        int i2 = C4635b.f35692a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        i = Math.min(i, -1);
                    } else {
                        i = Math.min(i, 0);
                    }
                } else {
                    i = Math.min(i, 1);
                }
            } else {
                i = Math.min(i, 5);
            }
        }
        Fragment fragment2 = this.f35687c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.f35689e, 2);
                View view = this.f35687c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f35689e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.f35687c.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.f35687c;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            lifecycleImpact = SpecialEffectsController.getOrCreateController(viewGroup, fragment3.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this);
        } else {
            lifecycleImpact = null;
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f35687c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f35687c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.f35687c);
        }
        return i;
    }

    /* renamed from: e */
    public void m54220e() {
        Bundle bundle;
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f35687c);
        }
        Bundle bundle2 = this.f35687c.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        Fragment fragment = this.f35687c;
        if (!fragment.mIsCreated) {
            this.f35685a.m54253h(fragment, bundle, false);
            this.f35687c.performCreate(bundle);
            this.f35685a.m54258c(this.f35687c, bundle, false);
            return;
        }
        fragment.mState = 1;
        fragment.restoreChildFragmentState();
    }

    /* renamed from: f */
    public void m54219f() {
        Bundle bundle;
        String str;
        if (this.f35687c.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.f35687c);
        }
        Bundle bundle2 = this.f35687c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = this.f35687c.performGetLayoutInflater(bundle);
        Fragment fragment = this.f35687c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.m54350o0().onFindViewById(this.f35687c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment2 = this.f35687c;
                        if (!fragment2.mRestored) {
                            try {
                                str = fragment2.getResources().getResourceName(this.f35687c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = EnvironmentCompat.MEDIA_UNKNOWN;
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f35687c.mContainerId) + " (" + str + ") for fragment " + this.f35687c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        FragmentStrictMode.onWrongFragmentContainer(this.f35687c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f35687c + " for a container view with no id");
                }
            }
        }
        Fragment fragment3 = this.f35687c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (this.f35687c.mView != null) {
            if (FragmentManager.isLoggingEnabled(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveto VIEW_CREATED: ");
                sb2.append(this.f35687c);
            }
            this.f35687c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f35687c;
            fragment4.mView.setTag(R.id.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                m54223b();
            }
            Fragment fragment5 = this.f35687c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (ViewCompat.isAttachedToWindow(this.f35687c.mView)) {
                ViewCompat.requestApplyInsets(this.f35687c.mView);
            } else {
                View view = this.f35687c.mView;
                view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC4634a(view));
            }
            this.f35687c.performViewCreated();
            C4625f c4625f = this.f35685a;
            Fragment fragment6 = this.f35687c;
            c4625f.m54248m(fragment6, fragment6.mView, bundle, false);
            int visibility = this.f35687c.mView.getVisibility();
            this.f35687c.setPostOnViewCreatedAlpha(this.f35687c.mView.getAlpha());
            Fragment fragment7 = this.f35687c;
            if (fragment7.mContainer != null && visibility == 0) {
                View findFocus = fragment7.mView.findFocus();
                if (findFocus != null) {
                    this.f35687c.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("requestFocus: Saved focused view ");
                        sb3.append(findFocus);
                        sb3.append(" for Fragment ");
                        sb3.append(this.f35687c);
                    }
                }
                this.f35687c.mView.setAlpha(0.0f);
            }
        }
        this.f35687c.mState = 2;
    }

    /* renamed from: g */
    public void m54218g() {
        boolean z;
        Fragment m54194f;
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f35687c);
        }
        Fragment fragment = this.f35687c;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Fragment fragment2 = this.f35687c;
            if (!fragment2.mBeingSaved) {
                this.f35686b.m54200C(fragment2.mWho, null);
            }
        }
        if (!z && !this.f35686b.m54183q().m54228p(this.f35687c)) {
            String str = this.f35687c.mTargetWho;
            if (str != null && (m54194f = this.f35686b.m54194f(str)) != null && m54194f.mRetainInstance) {
                this.f35687c.mTarget = m54194f;
            }
            this.f35687c.mState = 0;
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.f35687c.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z2 = this.f35686b.m54183q().m54232l();
        } else if (fragmentHostCallback.m54448b() instanceof Activity) {
            z2 = true ^ ((Activity) fragmentHostCallback.m54448b()).isChangingConfigurations();
        }
        if ((z && !this.f35687c.mBeingSaved) || z2) {
            this.f35686b.m54183q().m54241c(this.f35687c);
        }
        this.f35687c.performDestroy();
        this.f35685a.m54257d(this.f35687c, false);
        for (C4633j c4633j : this.f35686b.m54188l()) {
            if (c4633j != null) {
                Fragment m54214k = c4633j.m54214k();
                if (this.f35687c.mWho.equals(m54214k.mTargetWho)) {
                    m54214k.mTarget = this.f35687c;
                    m54214k.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f35687c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f35686b.m54194f(str2);
        }
        this.f35686b.m54180t(this);
    }

    /* renamed from: h */
    public void m54217h() {
        View view;
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f35687c);
        }
        Fragment fragment = this.f35687c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f35687c.performDestroyView();
        this.f35685a.m54247n(this.f35687c, false);
        Fragment fragment2 = this.f35687c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f35687c.mInLayout = false;
    }

    /* renamed from: i */
    public void m54216i() {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f35687c);
        }
        this.f35687c.performDetach();
        this.f35685a.m54256e(this.f35687c, false);
        Fragment fragment = this.f35687c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((fragment.mRemoving && !fragment.isInBackStack()) || this.f35686b.m54183q().m54228p(this.f35687c)) {
            if (FragmentManager.isLoggingEnabled(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f35687c);
            }
            this.f35687c.initState();
        }
    }

    /* renamed from: j */
    public void m54215j() {
        Bundle bundle;
        Fragment fragment = this.f35687c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f35687c);
            }
            Bundle bundle2 = this.f35687c.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            Fragment fragment2 = this.f35687c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle), null, bundle);
            View view = this.f35687c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f35687c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f35687c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f35687c.performViewCreated();
                C4625f c4625f = this.f35685a;
                Fragment fragment5 = this.f35687c;
                c4625f.m54248m(fragment5, fragment5.mView, bundle, false);
                this.f35687c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment m54214k() {
        return this.f35687c;
    }

    /* renamed from: l */
    public final boolean m54213l(View view) {
        if (view == this.f35687c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f35687c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void m54212m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f35688d) {
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(m54214k());
                return;
            }
            return;
        }
        try {
            this.f35688d = true;
            boolean z = false;
            while (true) {
                int m54221d = m54221d();
                Fragment fragment = this.f35687c;
                int i = fragment.mState;
                if (m54221d != i) {
                    if (m54221d > i) {
                        switch (i + 1) {
                            case 0:
                                m54222c();
                                continue;
                            case 1:
                                m54220e();
                                continue;
                            case 2:
                                m54215j();
                                m54219f();
                                continue;
                            case 3:
                                m54224a();
                                continue;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    SpecialEffectsController.getOrCreateController(viewGroup3, fragment.getParentFragmentManager()).enqueueAdd(SpecialEffectsController.Operation.State.from(this.f35687c.mView.getVisibility()), this);
                                }
                                this.f35687c.mState = 4;
                                continue;
                            case 5:
                                m54204u();
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                m54209p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m54216i();
                                continue;
                            case 0:
                                if (fragment.mBeingSaved && this.f35686b.m54182r(fragment.mWho) == null) {
                                    this.f35686b.m54200C(this.f35687c.mWho, m54207r());
                                }
                                m54218g();
                                continue;
                            case 1:
                                m54217h();
                                this.f35687c.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.isLoggingEnabled(3)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("movefrom ACTIVITY_CREATED: ");
                                    sb2.append(this.f35687c);
                                }
                                Fragment fragment2 = this.f35687c;
                                if (fragment2.mBeingSaved) {
                                    this.f35686b.m54200C(fragment2.mWho, m54207r());
                                } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                    m54206s();
                                }
                                Fragment fragment3 = this.f35687c;
                                if (fragment3.mView != null && (viewGroup2 = fragment3.mContainer) != null) {
                                    SpecialEffectsController.getOrCreateController(viewGroup2, fragment3.getParentFragmentManager()).enqueueRemove(this);
                                }
                                this.f35687c.mState = 3;
                                continue;
                            case 4:
                                m54203v();
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                m54211n();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z = true;
                } else {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f35687c.mBeingSaved) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Cleaning up state of never attached fragment: ");
                            sb3.append(this.f35687c);
                        }
                        this.f35686b.m54183q().m54241c(this.f35687c);
                        this.f35686b.m54180t(this);
                        if (FragmentManager.isLoggingEnabled(3)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("initState called for fragment: ");
                            sb4.append(this.f35687c);
                        }
                        this.f35687c.initState();
                    }
                    Fragment fragment4 = this.f35687c;
                    if (fragment4.mHiddenChanged) {
                        if (fragment4.mView != null && (viewGroup = fragment4.mContainer) != null) {
                            SpecialEffectsController orCreateController = SpecialEffectsController.getOrCreateController(viewGroup, fragment4.getParentFragmentManager());
                            if (this.f35687c.mHidden) {
                                orCreateController.enqueueHide(this);
                            } else {
                                orCreateController.enqueueShow(this);
                            }
                        }
                        Fragment fragment5 = this.f35687c;
                        FragmentManager fragmentManager = fragment5.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m54325z0(fragment5);
                        }
                        Fragment fragment6 = this.f35687c;
                        fragment6.mHiddenChanged = false;
                        fragment6.onHiddenChanged(fragment6.mHidden);
                        this.f35687c.mChildFragmentManager.m54429I();
                    }
                    this.f35688d = false;
                    return;
                }
            }
        } catch (Throwable th2) {
            this.f35688d = false;
            throw th2;
        }
    }

    /* renamed from: n */
    public void m54211n() {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f35687c);
        }
        this.f35687c.performPause();
        this.f35685a.m54255f(this.f35687c, false);
    }

    /* renamed from: o */
    public void m54210o(ClassLoader classLoader) {
        Bundle bundle = this.f35687c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f35687c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f35687c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        Fragment fragment = this.f35687c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        Fragment fragment2 = this.f35687c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
        C4631i c4631i = (C4631i) this.f35687c.mSavedFragmentState.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE);
        if (c4631i != null) {
            Fragment fragment3 = this.f35687c;
            fragment3.mTargetWho = c4631i.f35682l;
            fragment3.mTargetRequestCode = c4631i.f35683m;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.f35687c.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = c4631i.f35684n;
            }
        }
        Fragment fragment4 = this.f35687c;
        if (!fragment4.mUserVisibleHint) {
            fragment4.mDeferStart = true;
        }
    }

    /* renamed from: p */
    public void m54209p() {
        String str;
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f35687c);
        }
        View focusedView = this.f35687c.getFocusedView();
        if (focusedView != null && m54213l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f35687c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f35687c.mView.findFocus());
            }
        }
        this.f35687c.setFocusedView(null);
        this.f35687c.performResume();
        this.f35685a.m54252i(this.f35687c, false);
        Fragment fragment = this.f35687c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public Fragment.SavedState m54208q() {
        if (this.f35687c.mState > -1) {
            return new Fragment.SavedState(m54207r());
        }
        return null;
    }

    /* renamed from: r */
    public Bundle m54207r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f35687c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(RemoteConfigConstants.ResponseFieldKey.STATE, new C4631i(this.f35687c));
        if (this.f35687c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f35687c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f35685a.m54251j(this.f35687c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f35687c.mSavedStateRegistryController.performSave(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle m54432G0 = this.f35687c.mChildFragmentManager.m54432G0();
            if (!m54432G0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", m54432G0);
            }
            if (this.f35687c.mView != null) {
                m54206s();
            }
            SparseArray<Parcelable> sparseArray = this.f35687c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f35687c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f35687c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* renamed from: s */
    public void m54206s() {
        if (this.f35687c.mView == null) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append(this.f35687c);
            sb.append(" with view ");
            sb.append(this.f35687c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f35687c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f35687c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f35687c.mViewLifecycleOwner.m54169e(bundle);
        if (!bundle.isEmpty()) {
            this.f35687c.mSavedViewRegistryState = bundle;
        }
    }

    /* renamed from: t */
    public void m54205t(int i) {
        this.f35689e = i;
    }

    /* renamed from: u */
    public void m54204u() {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f35687c);
        }
        this.f35687c.performStart();
        this.f35685a.m54250k(this.f35687c, false);
    }

    /* renamed from: v */
    public void m54203v() {
        if (FragmentManager.isLoggingEnabled(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f35687c);
        }
        this.f35687c.performStop();
        this.f35685a.m54249l(this.f35687c, false);
    }

    public C4633j(C4625f c4625f, C4636k c4636k, ClassLoader classLoader, FragmentFactory fragmentFactory, Bundle bundle) {
        this.f35685a = c4625f;
        this.f35686b = c4636k;
        Fragment m54227a = ((C4631i) bundle.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).m54227a(fragmentFactory, classLoader);
        this.f35687c = m54227a;
        m54227a.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        m54227a.setArguments(bundle2);
        if (FragmentManager.isLoggingEnabled(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(m54227a);
        }
    }

    public C4633j(C4625f c4625f, C4636k c4636k, Fragment fragment, Bundle bundle) {
        this.f35685a = c4625f;
        this.f35686b = c4636k;
        this.f35687c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
