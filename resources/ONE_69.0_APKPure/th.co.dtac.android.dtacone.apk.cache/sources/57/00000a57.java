package p000;

import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.commons.p028io.serialization.ClassNameMatcher;

/* renamed from: Ku1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17988Ku1 implements ClassNameMatcher {

    /* renamed from: a */
    public final Pattern f3439a;

    public C17988Ku1(Pattern pattern) {
        Objects.requireNonNull(pattern, "pattern");
        this.f3439a = pattern;
    }

    @Override // org.apache.commons.p028io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.f3439a.matcher(str).matches();
    }
}