package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.databinding.ObservableList;
import java.util.List;

/* renamed from: cK0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C19335cK0 extends BaseAdapter {

    /* renamed from: a */
    public List f39395a;

    /* renamed from: b */
    public ObservableList.OnListChangedCallback f39396b;

    /* renamed from: c */
    public final Context f39397c;

    /* renamed from: d */
    public final int f39398d;

    /* renamed from: e */
    public final int f39399e;

    /* renamed from: f */
    public final int f39400f;

    /* renamed from: g */
    public final LayoutInflater f39401g;

    /* renamed from: cK0$a */
    /* loaded from: classes2.dex */
    public class C5437a extends ObservableList.OnListChangedCallback {
        public C5437a() {
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            C19335cK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
            C19335cK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
            C19335cK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
            C19335cK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
            C19335cK0.this.notifyDataSetChanged();
        }
    }

    public C19335cK0(Context context, List list, int i, int i2, int i3) {
        LayoutInflater layoutInflater;
        this.f39397c = context;
        this.f39399e = i;
        this.f39398d = i2;
        this.f39400f = i3;
        if (i == 0) {
            layoutInflater = null;
        } else {
            layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }
        this.f39401g = layoutInflater;
        m51694b(list);
    }

    /* renamed from: a */
    public View m51695a(int i, int i2, View view, ViewGroup viewGroup) {
        View findViewById;
        CharSequence valueOf;
        if (view == null) {
            if (i == 0) {
                view = new TextView(this.f39397c);
            } else {
                view = this.f39401g.inflate(i, viewGroup, false);
            }
        }
        int i3 = this.f39400f;
        if (i3 == 0) {
            findViewById = view;
        } else {
            findViewById = view.findViewById(i3);
        }
        TextView textView = (TextView) findViewById;
        Object obj = this.f39395a.get(i2);
        if (obj instanceof CharSequence) {
            valueOf = (CharSequence) obj;
        } else {
            valueOf = String.valueOf(obj);
        }
        textView.setText(valueOf);
        return view;
    }

    /* renamed from: b */
    public void m51694b(List list) {
        List list2 = this.f39395a;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof ObservableList) {
            ((ObservableList) list2).removeOnListChangedCallback(this.f39396b);
        }
        this.f39395a = list;
        if (list instanceof ObservableList) {
            if (this.f39396b == null) {
                this.f39396b = new C5437a();
            }
            ((ObservableList) this.f39395a).addOnListChangedCallback(this.f39396b);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f39395a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m51695a(this.f39398d, i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f39395a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m51695a(this.f39399e, i, view, viewGroup);
    }
}
