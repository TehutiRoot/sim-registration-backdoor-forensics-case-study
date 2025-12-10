package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.ActionBar;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class C2116b implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final ActionBar.OnNavigationListener f9053a;

    public C2116b(ActionBar.OnNavigationListener onNavigationListener) {
        this.f9053a = onNavigationListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ActionBar.OnNavigationListener onNavigationListener = this.f9053a;
        if (onNavigationListener != null) {
            onNavigationListener.onNavigationItemSelected(i, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}
