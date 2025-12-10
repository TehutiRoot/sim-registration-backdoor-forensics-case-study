package p000;

import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.commons.p028io.serialization.ClassNameMatcher;

/* renamed from: Nt1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18144Nt1 implements ClassNameMatcher {

    /* renamed from: a */
    public final Pattern f4224a;

    public C18144Nt1(Pattern pattern) {
        Objects.requireNonNull(pattern, "pattern");
        this.f4224a = pattern;
    }

    @Override // org.apache.commons.p028io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.f4224a.matcher(str).matches();
    }
}
