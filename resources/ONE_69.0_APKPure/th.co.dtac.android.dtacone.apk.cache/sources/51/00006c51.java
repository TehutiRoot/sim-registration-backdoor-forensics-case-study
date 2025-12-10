package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {

    /* renamed from: a */
    public int f34517a;

    /* renamed from: b */
    public int f34518b;

    /* renamed from: c */
    public LayoutInflater f34519c;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f34518b = i;
        this.f34517a = i;
        this.f34519c = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f34519c.inflate(this.f34518b, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f34519c.inflate(this.f34517a, viewGroup, false);
    }

    public void setDropDownViewResource(int i) {
        this.f34518b = i;
    }

    public void setViewResource(int i) {
        this.f34517a = i;
    }

    @Deprecated
    public ResourceCursorAdapter(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f34518b = i;
        this.f34517a = i;
        this.f34519c = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f34518b = i;
        this.f34517a = i;
        this.f34519c = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}