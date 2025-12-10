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
    public int f48940a;

    /* renamed from: b */
    public RunnableC22033rg2 f48941b;

    /* renamed from: c */
    public boolean f48942c;

    /* renamed from: b */
    public final void m45964b(Task task) {
        if (!this.f48942c) {
            this.f48942c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (task != null) {
                AutoResolveHelper.m45969e(activity, this.f48940a, task);
            } else {
                AutoResolveHelper.m45970d(activity, this.f48940a, 0, new Intent());
            }
        }
    }

    /* renamed from: c */
    public final void m45963c() {
        RunnableC22033rg2 runnableC22033rg2 = this.f48941b;
        if (runnableC22033rg2 != null) {
            runnableC22033rg2.m23469b(this);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f48940a = getArguments().getInt("requestCode");
        if (AutoResolveHelper.f48729b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f48941b = null;
        } else {
            this.f48941b = (RunnableC22033rg2) RunnableC22033rg2.f77589e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.f48942c = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m45963c();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC22033rg2 runnableC22033rg2 = this.f48941b;
        if (runnableC22033rg2 != null) {
            runnableC22033rg2.m23468c(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        m45964b(null);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f48942c);
        m45963c();
    }
}