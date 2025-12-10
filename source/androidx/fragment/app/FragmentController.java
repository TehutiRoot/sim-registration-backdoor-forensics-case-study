package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FragmentController {

    /* renamed from: a */
    public final FragmentHostCallback f35451a;

    public FragmentController(FragmentHostCallback fragmentHostCallback) {
        this.f35451a = fragmentHostCallback;
    }

    @NonNull
    public static FragmentController createController(@NonNull FragmentHostCallback<?> fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) Preconditions.checkNotNull(fragmentHostCallback, "callbacks == null"));
    }

    public void attachHost(@Nullable Fragment fragment) {
        FragmentHostCallback fragmentHostCallback = this.f35451a;
        fragmentHostCallback.f35457e.m54357m(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public void dispatchActivityCreated() {
        this.f35451a.f35457e.m54330x();
    }

    @Deprecated
    public void dispatchConfigurationChanged(@NonNull Configuration configuration) {
        this.f35451a.f35457e.m54326z(configuration, true);
    }

    public boolean dispatchContextItemSelected(@NonNull MenuItem menuItem) {
        return this.f35451a.f35457e.m54445A(menuItem);
    }

    public void dispatchCreate() {
        this.f35451a.f35457e.m54443B();
    }

    @Deprecated
    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        return this.f35451a.f35457e.m54441C(menu, menuInflater);
    }

    public void dispatchDestroy() {
        this.f35451a.f35457e.m54439D();
    }

    public void dispatchDestroyView() {
        this.f35451a.f35457e.m54437E();
    }

    @Deprecated
    public void dispatchLowMemory() {
        this.f35451a.f35457e.m54435F(true);
    }

    @Deprecated
    public void dispatchMultiWindowModeChanged(boolean z) {
        this.f35451a.f35457e.m54433G(z, true);
    }

    @Deprecated
    public boolean dispatchOptionsItemSelected(@NonNull MenuItem menuItem) {
        return this.f35451a.f35457e.m54427J(menuItem);
    }

    @Deprecated
    public void dispatchOptionsMenuClosed(@NonNull Menu menu) {
        this.f35451a.f35457e.m54425K(menu);
    }

    public void dispatchPause() {
        this.f35451a.f35457e.m54421M();
    }

    @Deprecated
    public void dispatchPictureInPictureModeChanged(boolean z) {
        this.f35451a.f35457e.m54419N(z, true);
    }

    @Deprecated
    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu) {
        return this.f35451a.f35457e.m54417O(menu);
    }

    @Deprecated
    public void dispatchReallyStop() {
    }

    public void dispatchResume() {
        this.f35451a.f35457e.m54413Q();
    }

    public void dispatchStart() {
        this.f35451a.f35457e.m54411R();
    }

    public void dispatchStop() {
        this.f35451a.f35457e.m54407T();
    }

    @Deprecated
    public void doLoaderDestroy() {
    }

    @Deprecated
    public void doLoaderRetain() {
    }

    @Deprecated
    public void doLoaderStart() {
    }

    @Deprecated
    public void doLoaderStop(boolean z) {
    }

    @Deprecated
    public void dumpLoaders(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    public boolean execPendingActions() {
        return this.f35451a.f35457e.m54395Z(true);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return this.f35451a.f35457e.m54377f0(str);
    }

    @NonNull
    public List<Fragment> getActiveFragments(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f35451a.f35457e.m54356m0();
    }

    public int getActiveFragmentsCount() {
        return this.f35451a.f35457e.m54359l0();
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.f35451a.f35457e;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        this.f35451a.f35457e.m54414P0();
    }

    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f35451a.f35457e.m54341r0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void reportLoaderStart() {
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable List<Fragment> list) {
        this.f35451a.f35457e.m54394Z0(parcelable, new FragmentManagerNonConfig(list, null, null));
    }

    @Deprecated
    public void restoreLoaderNonConfig(@SuppressLint({"UnknownNullness"}) SimpleArrayMap<String, LoaderManager> simpleArrayMap) {
    }

    @Deprecated
    public void restoreSaveState(@Nullable Parcelable parcelable) {
        FragmentHostCallback fragmentHostCallback = this.f35451a;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            fragmentHostCallback.f35457e.m54388b1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @Nullable
    @Deprecated
    public SimpleArrayMap<String, LoaderManager> retainLoaderNonConfig() {
        return null;
    }

    @Nullable
    @Deprecated
    public FragmentManagerNonConfig retainNestedNonConfig() {
        return this.f35451a.f35457e.m54382d1();
    }

    @Nullable
    @Deprecated
    public List<Fragment> retainNonConfig() {
        FragmentManagerNonConfig m54382d1 = this.f35451a.f35457e.m54382d1();
        if (m54382d1 != null && m54382d1.m54315b() != null) {
            return new ArrayList(m54382d1.m54315b());
        }
        return null;
    }

    @Nullable
    @Deprecated
    public Parcelable saveAllState() {
        return this.f35451a.f35457e.m54376f1();
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.f35451a.f35457e.m54394Z0(parcelable, fragmentManagerNonConfig);
    }
}
