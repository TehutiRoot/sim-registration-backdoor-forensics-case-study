package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class C2098b implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final ActionBar.OnNavigationListener f9141a;

    public C2098b(ActionBar.OnNavigationListener onNavigationListener) {
        this.f9141a = onNavigationListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ActionBar.OnNavigationListener onNavigationListener = this.f9141a;
        if (onNavigationListener != null) {
            onNavigationListener.onNavigationItemSelected(i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}