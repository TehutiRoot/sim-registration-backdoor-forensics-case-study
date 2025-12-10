package p000;

import android.widget.RadioGroup;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: NB1 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class NB1 {

    /* renamed from: NB1$a */
    /* loaded from: classes5.dex */
    public static final class C0927a implements Consumer {

        /* renamed from: a */
        public final /* synthetic */ RadioGroup f4030a;

        public C0927a(RadioGroup radioGroup) {
            this.f4030a = radioGroup;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public final void accept(Integer num) {
            if (num != null && num.intValue() == -1) {
                this.f4030a.clearCheck();
                return;
            }
            RadioGroup radioGroup = this.f4030a;
            if (num == null) {
                Intrinsics.throwNpe();
            }
            radioGroup.check(num.intValue());
        }
    }

    /* renamed from: a */
    public static final Consumer m67239a(RadioGroup checked) {
        Intrinsics.checkParameterIsNotNull(checked, "$this$checked");
        return new C0927a(checked);
    }
}
