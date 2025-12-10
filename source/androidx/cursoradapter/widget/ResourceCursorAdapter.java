package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {

    /* renamed from: a */
    public int f34429a;

    /* renamed from: b */
    public int f34430b;

    /* renamed from: c */
    public LayoutInflater f34431c;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f34430b = i;
        this.f34429a = i;
        this.f34431c = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f34431c.inflate(this.f34430b, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f34431c.inflate(this.f34429a, viewGroup, false);
    }

    public void setDropDownViewResource(int i) {
        this.f34430b = i;
    }

    public void setViewResource(int i) {
        this.f34429a = i;
    }

    @Deprecated
    public ResourceCursorAdapter(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f34430b = i;
        this.f34429a = i;
        this.f34431c = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f34430b = i;
        this.f34429a = i;
        this.f34431c = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
