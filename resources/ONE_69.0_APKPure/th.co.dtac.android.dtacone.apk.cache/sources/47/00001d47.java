package androidx.browser.trusted;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class Token {

    /* renamed from: a */
    public final C22694vU1 f10307a;

    public Token(C22694vU1 c22694vU1) {
        this.f10307a = c22694vU1;
    }

    @Nullable
    public static Token create(@NonNull String str, @NonNull PackageManager packageManager) {
        List m23455b = AbstractC22038ri1.m23455b(str, packageManager);
        if (m23455b == null) {
            return null;
        }
        try {
            return new Token(C22694vU1.m903c(str, m23455b));
        } catch (IOException unused) {
            return null;
        }
    }

    @NonNull
    public static Token deserialize(@NonNull byte[] bArr) {
        return new Token(C22694vU1.m901e(bArr));
    }

    public boolean matches(@NonNull String str, @NonNull PackageManager packageManager) {
        return AbstractC22038ri1.m23453d(str, packageManager, this.f10307a);
    }

    @NonNull
    public byte[] serialize() {
        return this.f10307a.m897i();
    }
}