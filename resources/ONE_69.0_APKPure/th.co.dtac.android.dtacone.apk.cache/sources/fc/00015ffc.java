package p000;

import android.view.View;
import com.jakewharton.rxbinding3.view.RxView;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wD1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC22823wD1 {

    /* renamed from: wD1$a */
    /* loaded from: classes5.dex */
    public static final class C16964a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ View f108362a;

        /* renamed from: b */
        public final /* synthetic */ int f108363b;

        public C16964a(View view, int i) {
            this.f108362a = view;
            this.f108363b = i;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public final void accept(Boolean value) {
            int i;
            View view = this.f108362a;
            Intrinsics.checkExpressionValueIsNotNull(value, "value");
            if (value.booleanValue()) {
                i = 0;
            } else {
                i = this.f108363b;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static final Consumer m792a(View visibility, int i) {
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
                return new C16964a(visibility, i);
            }
            throw new IllegalArgumentException("Must set visibility to INVISIBLE or GONE when false.".toString());
        }
        throw new IllegalArgumentException("Setting visibility to VISIBLE when false would have no effect.".toString());
    }

    /* renamed from: b */
    public static /* synthetic */ Consumer m791b(View view, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return RxView.visibility(view, i);
    }
}