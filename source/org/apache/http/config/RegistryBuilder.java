package org.apache.http.config;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public final class RegistryBuilder<I> {

    /* renamed from: a */
    public final Map f73782a = new HashMap();

    public static <I> RegistryBuilder<I> create() {
        return new RegistryBuilder<>();
    }

    public Registry<I> build() {
        return new Registry<>(this.f73782a);
    }

    public RegistryBuilder<I> register(String str, I i) {
        Args.notEmpty(str, OperatorName.BEGIN_INLINE_IMAGE_DATA);
        Args.notNull(i, "Item");
        this.f73782a.put(str.toLowerCase(Locale.ROOT), i);
        return this;
    }

    public String toString() {
        return this.f73782a.toString();
    }
}
