package co.omise.android.p009ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: co.omise.android.ui.NumberRangeSpinnerAdapter */
/* loaded from: classes3.dex */
public abstract class NumberRangeSpinnerAdapter implements SpinnerAdapter {
    private final int max;
    private final int min;
    private List<DataSetObserver> observers = new ArrayList();

    public NumberRangeSpinnerAdapter(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return (this.max - this.min) + 1;
    }

    @Override // android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(17367050, viewGroup, false);
        }
        ((TextView) view.findViewById(16908308)).setText(getItemDropDownLabel(((Integer) getItem(i)).intValue()));
        return view;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Integer.valueOf(this.min + i);
    }

    public String getItemDropDownLabel(int i) {
        return Integer.toString(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return getItem(i).hashCode();
    }

    public String getItemLabel(int i) {
        return Integer.toString(i);
    }

    @Override // android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    public int getPosition(int i) {
        return i - this.min;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(17367048, viewGroup, false);
        }
        ((TextView) view.findViewById(16908308)).setText(getItemLabel(((Integer) getItem(i)).intValue()));
        return view;
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        return false;
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.observers.add(dataSetObserver);
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.observers.remove(dataSetObserver);
    }
}