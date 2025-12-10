package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: androidx.cursoradapter.widget.a */
/* loaded from: classes2.dex */
public class C4223a extends Filter {

    /* renamed from: a */
    public InterfaceC4224a f34524a;

    /* renamed from: androidx.cursoradapter.widget.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4224a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    public C4223a(InterfaceC4224a interfaceC4224a) {
        this.f34524a = interfaceC4224a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f34524a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f34524a.runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filterResults.count = runQueryOnBackgroundThread.getCount();
            filterResults.values = runQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursor = this.f34524a.getCursor();
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            this.f34524a.changeCursor((Cursor) obj);
        }
    }
}