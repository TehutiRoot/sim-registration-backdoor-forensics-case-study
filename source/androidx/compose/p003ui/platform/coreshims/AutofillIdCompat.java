package androidx.compose.p003ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.compose.ui.platform.coreshims.AutofillIdCompat */
/* loaded from: classes2.dex */
public class AutofillIdCompat {

    /* renamed from: a */
    public final Object f30838a;

    public AutofillIdCompat(AutofillId autofillId) {
        this.f30838a = autofillId;
    }

    @NonNull
    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(@NonNull AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @NonNull
    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return AbstractC0924N9.m67240a(this.f30838a);
    }
}
