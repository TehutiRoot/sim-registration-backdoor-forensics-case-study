package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class ListFragment extends Fragment {

    /* renamed from: a */
    public final Handler f35683a = new Handler();

    /* renamed from: b */
    public final Runnable f35684b = new RunnableC4594a();

    /* renamed from: c */
    public final AdapterView.OnItemClickListener f35685c = new C4595b();

    /* renamed from: d */
    public ListAdapter f35686d;

    /* renamed from: e */
    public ListView f35687e;

    /* renamed from: f */
    public View f35688f;

    /* renamed from: g */
    public TextView f35689g;

    /* renamed from: h */
    public View f35690h;

    /* renamed from: i */
    public View f35691i;

    /* renamed from: j */
    public CharSequence f35692j;

    /* renamed from: k */
    public boolean f35693k;

    /* renamed from: androidx.fragment.app.ListFragment$a */
    /* loaded from: classes2.dex */
    public class RunnableC4594a implements Runnable {
        public RunnableC4594a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.f35687e;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.ListFragment$b */
    /* loaded from: classes2.dex */
    public class C4595b implements AdapterView.OnItemClickListener {
        public C4595b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            ListFragment.this.onListItemClick((ListView) adapterView, view, i, j);
        }
    }

    @Nullable
    public ListAdapter getListAdapter() {
        return this.f35686d;
    }

    @NonNull
    public ListView getListView() {
        m54247l();
        return this.f35687e;
    }

    public long getSelectedItemId() {
        m54247l();
        return this.f35687e.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        m54247l();
        return this.f35687e.getSelectedItemPosition();
    }

    /* renamed from: l */
    public final void m54247l() {
        if (this.f35687e != null) {
            return;
        }
        View view = getView();
        if (view != null) {
            if (view instanceof ListView) {
                this.f35687e = (ListView) view;
            } else {
                TextView textView = (TextView) view.findViewById(16711681);
                this.f35689g = textView;
                if (textView == null) {
                    this.f35688f = view.findViewById(16908292);
                } else {
                    textView.setVisibility(8);
                }
                this.f35690h = view.findViewById(16711682);
                this.f35691i = view.findViewById(16711683);
                View findViewById = view.findViewById(16908298);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById;
                this.f35687e = listView;
                View view2 = this.f35688f;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                } else {
                    CharSequence charSequence = this.f35692j;
                    if (charSequence != null) {
                        this.f35689g.setText(charSequence);
                        this.f35687e.setEmptyView(this.f35689g);
                    }
                }
            }
            this.f35693k = true;
            this.f35687e.setOnItemClickListener(this.f35685c);
            ListAdapter listAdapter = this.f35686d;
            if (listAdapter != null) {
                this.f35686d = null;
                setListAdapter(listAdapter);
            } else if (this.f35690h != null) {
                m54246m(false, false);
            }
            this.f35683a.post(this.f35684b);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    /* renamed from: m */
    public final void m54246m(boolean z, boolean z2) {
        m54247l();
        View view = this.f35690h;
        if (view != null) {
            if (this.f35693k == z) {
                return;
            }
            this.f35693k = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f35691i.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f35691i.clearAnimation();
                }
                this.f35690h.setVisibility(8);
                this.f35691i.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f35691i.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f35691i.clearAnimation();
            }
            this.f35690h.setVisibility(0);
            this.f35691i.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f35683a.removeCallbacks(this.f35684b);
        this.f35687e = null;
        this.f35693k = false;
        this.f35691i = null;
        this.f35690h = null;
        this.f35688f = null;
        this.f35689g = null;
        super.onDestroyView();
    }

    public void onListItemClick(@NonNull ListView listView, @NonNull View view, int i, long j) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m54247l();
    }

    @NonNull
    public final ListAdapter requireListAdapter() {
        ListAdapter listAdapter = getListAdapter();
        if (listAdapter != null) {
            return listAdapter;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void setEmptyText(@Nullable CharSequence charSequence) {
        m54247l();
        TextView textView = this.f35689g;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f35692j == null) {
                this.f35687e.setEmptyView(this.f35689g);
            }
            this.f35692j = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void setListAdapter(@Nullable ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        if (this.f35686d != null) {
            z = true;
        } else {
            z = false;
        }
        this.f35686d = listAdapter;
        ListView listView = this.f35687e;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f35693k && !z) {
                if (requireView().getWindowToken() != null) {
                    z2 = true;
                }
                m54246m(true, z2);
            }
        }
    }

    public void setListShown(boolean z) {
        m54246m(z, true);
    }

    public void setListShownNoAnimation(boolean z) {
        m54246m(z, false);
    }

    public void setSelection(int i) {
        m54247l();
        this.f35687e.setSelection(i);
    }
}