package p000;

import android.widget.RadioGroup;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: KC1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class KC1 {

    /* renamed from: KC1$a */
    /* loaded from: classes5.dex */
    public static final class C0712a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ RadioGroup f3248a;

        public C0712a(RadioGroup radioGroup) {
            this.f3248a = radioGroup;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public final void accept(Integer num) {
            if (num != null && num.intValue() == -1) {
                this.f3248a.clearCheck();
                return;
            }
            RadioGroup radioGroup = this.f3248a;
            if (num == null) {
                Intrinsics.throwNpe();
            }
            radioGroup.check(num.intValue());
        }
    }

    /* renamed from: a */
    public static final Consumer m67737a(RadioGroup checked) {
        Intrinsics.checkParameterIsNotNull(checked, "$this$checked");
        return new C0712a(checked);
    }
}