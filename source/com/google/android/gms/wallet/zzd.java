package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final class zzd extends Fragment {

    /* renamed from: a */
    public int f48928a;

    /* renamed from: b */
    public RunnableC22482uf2 f48929b;

    /* renamed from: c */
    public boolean f48930c;

    /* renamed from: b */
    public final void m45979b(Task task) {
        if (!this.f48930c) {
            this.f48930c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                AutoResolveHelper.m45984e(activity, this.f48928a, task);
            } else {
                AutoResolveHelper.m45985d(activity, this.f48928a, 0, new Intent());
            }
        }
    }

    /* renamed from: c */
    public final void m45978c() {
        RunnableC22482uf2 runnableC22482uf2 = this.f48929b;
        if (runnableC22482uf2 != null) {
            runnableC22482uf2.m1244b(this);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f48928a = getArguments().getInt("requestCode");
        if (AutoResolveHelper.f48717b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f48929b = null;
        } else {
            this.f48929b = (RunnableC22482uf2) RunnableC22482uf2.f107422e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.f48930c = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m45978c();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC22482uf2 runnableC22482uf2 = this.f48929b;
        if (runnableC22482uf2 != null) {
            runnableC22482uf2.m1243c(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        m45979b(null);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f48930c);
        m45978c();
    }
}
