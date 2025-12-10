package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.databinding.ObservableList;
import java.util.List;

/* renamed from: iK0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C20421iK0 extends BaseAdapter {

    /* renamed from: a */
    public List f62817a;

    /* renamed from: b */
    public ObservableList.OnListChangedCallback f62818b;

    /* renamed from: c */
    public final Context f62819c;

    /* renamed from: d */
    public final int f62820d;

    /* renamed from: e */
    public final int f62821e;

    /* renamed from: f */
    public final int f62822f;

    /* renamed from: g */
    public final LayoutInflater f62823g;

    /* renamed from: iK0$a */
    /* loaded from: classes2.dex */
    public class C10446a extends ObservableList.OnListChangedCallback {
        public C10446a() {
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            C20421iK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
            C20421iK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
            C20421iK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
            C20421iK0.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
            C20421iK0.this.notifyDataSetChanged();
        }
    }

    public C20421iK0(Context context, List list, int i, int i2, int i3) {
        LayoutInflater layoutInflater;
        this.f62819c = context;
        this.f62821e = i;
        this.f62820d = i2;
        this.f62822f = i3;
        if (i == 0) {
            layoutInflater = null;
        } else {
            layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }
        this.f62823g = layoutInflater;
        m30986b(list);
    }

    /* renamed from: a */
    public View m30987a(int i, int i2, View view, ViewGroup viewGroup) {
        View findViewById;
        CharSequence valueOf;
        if (view == null) {
            if (i == 0) {
                view = new TextView(this.f62819c);
            } else {
                view = this.f62823g.inflate(i, viewGroup, false);
            }
        }
        int i3 = this.f62822f;
        if (i3 == 0) {
            findViewById = view;
        } else {
            findViewById = view.findViewById(i3);
        }
        TextView textView = (TextView) findViewById;
        Object obj = this.f62817a.get(i2);
        if (obj instanceof CharSequence) {
            valueOf = (CharSequence) obj;
        } else {
            valueOf = String.valueOf(obj);
        }
        textView.setText(valueOf);
        return view;
    }

    /* renamed from: b */
    public void m30986b(List list) {
        List list2 = this.f62817a;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof ObservableList) {
            ((ObservableList) list2).removeOnListChangedCallback(this.f62818b);
        }
        this.f62817a = list;
        if (list instanceof ObservableList) {
            if (this.f62818b == null) {
                this.f62818b = new C10446a();
            }
            ((ObservableList) this.f62817a).addOnListChangedCallback(this.f62818b);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f62817a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m30987a(this.f62820d, i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f62817a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m30987a(this.f62821e, i, view, viewGroup);
    }
}