package androidx.browser.trusted;

import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class Token {

    /* renamed from: a */
    public final C23140yT1 f10219a;

    public Token(C23140yT1 c23140yT1) {
        this.f10219a = c23140yT1;
    }

    @Nullable
    public static Token create(@NonNull String str, @NonNull PackageManager packageManager) {
        List m1230b = AbstractC22487uh1.m1230b(str, packageManager);
        if (m1230b == null) {
            return null;
        }
        try {
            return new Token(C23140yT1.m255c(str, m1230b));
        } catch (IOException unused) {
            return null;
        }
    }

    @NonNull
    public static Token deserialize(@NonNull byte[] bArr) {
        return new Token(C23140yT1.m253e(bArr));
    }

    public boolean matches(@NonNull String str, @NonNull PackageManager packageManager) {
        return AbstractC22487uh1.m1228d(str, packageManager, this.f10219a);
    }

    @NonNull
    public byte[] serialize() {
        return this.f10219a.m249i();
    }
}
