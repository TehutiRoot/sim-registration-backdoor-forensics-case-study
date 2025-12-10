package p000;

import android.widget.SearchView;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: QB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class QB1 {

    /* renamed from: QB1$a */
    /* loaded from: classes5.dex */
    public static final class C1154a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ SearchView f4986a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4987b;

        public C1154a(SearchView searchView, boolean z) {
            this.f4986a = searchView;
            this.f4987b = z;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public final void accept(CharSequence charSequence) {
            this.f4986a.setQuery(charSequence, this.f4987b);
        }
    }

    /* renamed from: a */
    public static final Consumer m66640a(SearchView query, boolean z) {
        Intrinsics.checkParameterIsNotNull(query, "$this$query");
        return new C1154a(query, z);
    }
}
