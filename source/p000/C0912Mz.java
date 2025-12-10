package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;

/* renamed from: Mz */
/* loaded from: classes3.dex */
public class C0912Mz {

    /* renamed from: a */
    public final Context f3968a;

    /* renamed from: b */
    public final Clock f3969b;

    /* renamed from: c */
    public final Clock f3970c;

    public C0912Mz(Context context, Clock clock, Clock clock2) {
        this.f3968a = context;
        this.f3969b = clock;
        this.f3970c = clock2;
    }

    /* renamed from: a */
    public CreationContext m67257a(String str) {
        return CreationContext.create(this.f3968a, this.f3969b, this.f3970c, str);
    }
}
