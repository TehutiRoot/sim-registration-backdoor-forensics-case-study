package p000;

import android.view.View;
import com.jakewharton.rxbinding3.view.RxView;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zC1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC23268zC1 {

    /* renamed from: zC1$a */
    /* loaded from: classes5.dex */
    public static final class C17179a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f108998a;

        /* renamed from: b */
        public final /* synthetic */ int f108999b;

        public C17179a(View view, int i) {
            this.f108998a = view;
            this.f108999b = i;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public final void accept(Boolean value) {
            int i;
            View view = this.f108998a;
            Intrinsics.checkExpressionValueIsNotNull(value, "value");
            if (value.booleanValue()) {
                i = 0;
            } else {
                i = this.f108999b;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static final Consumer m127a(View visibility, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(visibility, "$this$visibility");
        boolean z2 = false;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((i == 4 || i == 8) ? true : true) {
                return new C17179a(visibility, i);
            }
            throw new IllegalArgumentException("Must set visibility to INVISIBLE or GONE when false.".toString());
        }
        throw new IllegalArgumentException("Setting visibility to VISIBLE when false would have no effect.".toString());
    }

    /* renamed from: b */
    public static /* synthetic */ Consumer m126b(View view, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return RxView.visibility(view, i);
    }
}
