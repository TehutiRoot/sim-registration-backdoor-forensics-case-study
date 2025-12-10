package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: androidx.cursoradapter.widget.a */
/* loaded from: classes2.dex */
public class C4241a extends Filter {

    /* renamed from: a */
    public InterfaceC4242a f34436a;

    /* renamed from: androidx.cursoradapter.widget.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4242a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    public C4241a(InterfaceC4242a interfaceC4242a) {
        this.f34436a = interfaceC4242a;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f34436a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f34436a.runQueryOnBackgroundThread(charSequence);
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
        Cursor cursor = this.f34436a.getCursor();
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            this.f34436a.changeCursor((Cursor) obj);
        }
    }
}
