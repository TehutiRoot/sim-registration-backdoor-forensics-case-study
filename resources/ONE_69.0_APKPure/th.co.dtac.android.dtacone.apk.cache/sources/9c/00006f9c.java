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
    public final FragmentHostCallback f35539a;

    public FragmentController(FragmentHostCallback fragmentHostCallback) {
        this.f35539a = fragmentHostCallback;
    }

    @NonNull
    public static FragmentController createController(@NonNull FragmentHostCallback<?> fragmentHostCallback) {
        return new FragmentController((FragmentHostCallback) Preconditions.checkNotNull(fragmentHostCallback, "callbacks == null"));
    }

    public void attachHost(@Nullable Fragment fragment) {
        FragmentHostCallback fragmentHostCallback = this.f35539a;
        fragmentHostCallback.f35545e.m54307m(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public void dispatchActivityCreated() {
        this.f35539a.f35545e.m54280x();
    }

    @Deprecated
    public void dispatchConfigurationChanged(@NonNull Configuration configuration) {
        this.f35539a.f35545e.m54276z(configuration, true);
    }

    public boolean dispatchContextItemSelected(@NonNull MenuItem menuItem) {
        return this.f35539a.f35545e.m54395A(menuItem);
    }

    public void dispatchCreate() {
        this.f35539a.f35545e.m54393B();
    }

    @Deprecated
    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        return this.f35539a.f35545e.m54391C(menu, menuInflater);
    }

    public void dispatchDestroy() {
        this.f35539a.f35545e.m54389D();
    }

    public void dispatchDestroyView() {
        this.f35539a.f35545e.m54387E();
    }

    @Deprecated
    public void dispatchLowMemory() {
        this.f35539a.f35545e.m54385F(true);
    }

    @Deprecated
    public void dispatchMultiWindowModeChanged(boolean z) {
        this.f35539a.f35545e.m54383G(z, true);
    }

    @Deprecated
    public boolean dispatchOptionsItemSelected(@NonNull MenuItem menuItem) {
        return this.f35539a.f35545e.m54377J(menuItem);
    }

    @Deprecated
    public void dispatchOptionsMenuClosed(@NonNull Menu menu) {
        this.f35539a.f35545e.m54375K(menu);
    }

    public void dispatchPause() {
        this.f35539a.f35545e.m54371M();
    }

    @Deprecated
    public void dispatchPictureInPictureModeChanged(boolean z) {
        this.f35539a.f35545e.m54369N(z, true);
    }

    @Deprecated
    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu) {
        return this.f35539a.f35545e.m54367O(menu);
    }

    @Deprecated
    public void dispatchReallyStop() {
    }

    public void dispatchResume() {
        this.f35539a.f35545e.m54363Q();
    }

    public void dispatchStart() {
        this.f35539a.f35545e.m54361R();
    }

    public void dispatchStop() {
        this.f35539a.f35545e.m54357T();
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
        return this.f35539a.f35545e.m54345Z(true);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return this.f35539a.f35545e.m54327f0(str);
    }

    @NonNull
    public List<Fragment> getActiveFragments(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f35539a.f35545e.m54306m0();
    }

    public int getActiveFragmentsCount() {
        return this.f35539a.f35545e.m54309l0();
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.f35539a.f35545e;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        this.f35539a.f35545e.m54364P0();
    }

    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f35539a.f35545e.m54291r0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void reportLoaderStart() {
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable List<Fragment> list) {
        this.f35539a.f35545e.m54344Z0(parcelable, new FragmentManagerNonConfig(list, null, null));
    }

    @Deprecated
    public void restoreLoaderNonConfig(@SuppressLint({"UnknownNullness"}) SimpleArrayMap<String, LoaderManager> simpleArrayMap) {
    }

    @Deprecated
    public void restoreSaveState(@Nullable Parcelable parcelable) {
        FragmentHostCallback fragmentHostCallback = this.f35539a;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            fragmentHostCallback.f35545e.m54338b1(parcelable);
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
        return this.f35539a.f35545e.m54332d1();
    }

    @Nullable
    @Deprecated
    public List<Fragment> retainNonConfig() {
        FragmentManagerNonConfig m54332d1 = this.f35539a.f35545e.m54332d1();
        if (m54332d1 != null && m54332d1.m54266b() != null) {
            return new ArrayList(m54332d1.m54266b());
        }
        return null;
    }

    @Nullable
    @Deprecated
    public Parcelable saveAllState() {
        return this.f35539a.f35545e.m54326f1();
    }

    @Deprecated
    public void restoreAllState(@Nullable Parcelable parcelable, @Nullable FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.f35539a.f35545e.m54344Z0(parcelable, fragmentManagerNonConfig);
    }
}