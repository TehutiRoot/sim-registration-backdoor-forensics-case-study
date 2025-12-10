package p000;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContext;
import com.google.android.datatransport.runtime.time.Clock;

/* renamed from: Mz */
/* loaded from: classes3.dex */
public class C0901Mz {

    /* renamed from: a */
    public final Context f4029a;

    /* renamed from: b */
    public final Clock f4030b;

    /* renamed from: c */
    public final Clock f4031c;

    public C0901Mz(Context context, Clock clock, Clock clock2) {
        this.f4029a = context;
        this.f4030b = clock;
        this.f4031c = clock2;
    }

    /* renamed from: a */
    public CreationContext m67300a(String str) {
        return CreationContext.create(this.f4029a, this.f4030b, this.f4031c, str);
    }
}