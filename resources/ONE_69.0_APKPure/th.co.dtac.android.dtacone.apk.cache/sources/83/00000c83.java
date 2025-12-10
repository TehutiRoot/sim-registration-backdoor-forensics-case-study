package p000;

import android.widget.SearchView;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: NC1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class NC1 {

    /* renamed from: NC1$a */
    /* loaded from: classes5.dex */
    public static final class C0917a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ SearchView f4098a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4099b;

        public C0917a(SearchView searchView, boolean z) {
            this.f4098a = searchView;
            this.f4099b = z;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public final void accept(CharSequence charSequence) {
            this.f4098a.setQuery(charSequence, this.f4099b);
        }
    }

    /* renamed from: a */
    public static final Consumer m67265a(SearchView query, boolean z) {
        Intrinsics.checkParameterIsNotNull(query, "$this$query");
        return new C0917a(query, z);
    }
}