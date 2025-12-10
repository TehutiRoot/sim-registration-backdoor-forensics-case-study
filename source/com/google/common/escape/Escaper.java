package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.escape.Escaper;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
/* loaded from: classes4.dex */
public abstract class Escaper {

    /* renamed from: a */
    public final Function f53744a = new Function() { // from class: MS
        @Override // com.google.common.base.Function
        public final Object apply(Object obj) {
            return Escaper.this.escape((String) obj);
        }
    };

    public final Function<String, String> asFunction() {
        return this.f53744a;
    }

    public abstract String escape(String str);
}
