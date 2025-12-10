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
    public final Handler f35595a = new Handler();

    /* renamed from: b */
    public final Runnable f35596b = new RunnableC4612a();

    /* renamed from: c */
    public final AdapterView.OnItemClickListener f35597c = new C4613b();

    /* renamed from: d */
    public ListAdapter f35598d;

    /* renamed from: e */
    public ListView f35599e;

    /* renamed from: f */
    public View f35600f;

    /* renamed from: g */
    public TextView f35601g;

    /* renamed from: h */
    public View f35602h;

    /* renamed from: i */
    public View f35603i;

    /* renamed from: j */
    public CharSequence f35604j;

    /* renamed from: k */
    public boolean f35605k;

    /* renamed from: androidx.fragment.app.ListFragment$a */
    /* loaded from: classes2.dex */
    public class RunnableC4612a implements Runnable {
        public RunnableC4612a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.f35599e;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.ListFragment$b */
    /* loaded from: classes2.dex */
    public class C4613b implements AdapterView.OnItemClickListener {
        public C4613b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            ListFragment.this.onListItemClick((ListView) adapterView, view, i, j);
        }
    }

    @Nullable
    public ListAdapter getListAdapter() {
        return this.f35598d;
    }

    @NonNull
    public ListView getListView() {
        m54296l();
        return this.f35599e;
    }

    public long getSelectedItemId() {
        m54296l();
        return this.f35599e.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        m54296l();
        return this.f35599e.getSelectedItemPosition();
    }

    /* renamed from: l */
    public final void m54296l() {
        if (this.f35599e != null) {
            return;
        }
        View view = getView();
        if (view != null) {
            if (view instanceof ListView) {
                this.f35599e = (ListView) view;
            } else {
                TextView textView = (TextView) view.findViewById(16711681);
                this.f35601g = textView;
                if (textView == null) {
                    this.f35600f = view.findViewById(16908292);
                } else {
                    textView.setVisibility(8);
                }
                this.f35602h = view.findViewById(16711682);
                this.f35603i = view.findViewById(16711683);
                View findViewById = view.findViewById(16908298);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById;
                this.f35599e = listView;
                View view2 = this.f35600f;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                } else {
                    CharSequence charSequence = this.f35604j;
                    if (charSequence != null) {
                        this.f35601g.setText(charSequence);
                        this.f35599e.setEmptyView(this.f35601g);
                    }
                }
            }
            this.f35605k = true;
            this.f35599e.setOnItemClickListener(this.f35597c);
            ListAdapter listAdapter = this.f35598d;
            if (listAdapter != null) {
                this.f35598d = null;
                setListAdapter(listAdapter);
            } else if (this.f35602h != null) {
                m54295m(false, false);
            }
            this.f35595a.post(this.f35596b);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    /* renamed from: m */
    public final void m54295m(boolean z, boolean z2) {
        m54296l();
        View view = this.f35602h;
        if (view != null) {
            if (this.f35605k == z) {
                return;
            }
            this.f35605k = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f35603i.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f35603i.clearAnimation();
                }
                this.f35602h.setVisibility(8);
                this.f35603i.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f35603i.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f35603i.clearAnimation();
            }
            this.f35602h.setVisibility(0);
            this.f35603i.setVisibility(8);
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
        this.f35595a.removeCallbacks(this.f35596b);
        this.f35599e = null;
        this.f35605k = false;
        this.f35603i = null;
        this.f35602h = null;
        this.f35600f = null;
        this.f35601g = null;
        super.onDestroyView();
    }

    public void onListItemClick(@NonNull ListView listView, @NonNull View view, int i, long j) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m54296l();
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
        m54296l();
        TextView textView = this.f35601g;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f35604j == null) {
                this.f35599e.setEmptyView(this.f35601g);
            }
            this.f35604j = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void setListAdapter(@Nullable ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        if (this.f35598d != null) {
            z = true;
        } else {
            z = false;
        }
        this.f35598d = listAdapter;
        ListView listView = this.f35599e;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f35605k && !z) {
                if (requireView().getWindowToken() != null) {
                    z2 = true;
                }
                m54295m(true, z2);
            }
        }
    }

    public void setListShown(boolean z) {
        m54295m(z, true);
    }

    public void setListShownNoAnimation(boolean z) {
        m54295m(z, false);
    }

    public void setSelection(int i) {
        m54296l();
        this.f35599e.setSelection(i);
    }
}
