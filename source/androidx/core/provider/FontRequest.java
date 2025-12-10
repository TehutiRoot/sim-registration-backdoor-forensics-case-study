package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes2.dex */
public final class FontRequest {

    /* renamed from: a */
    public final String f33967a;

    /* renamed from: b */
    public final String f33968b;

    /* renamed from: c */
    public final String f33969c;

    /* renamed from: d */
    public final List f33970d;

    /* renamed from: e */
    public final int f33971e;

    /* renamed from: f */
    public final String f33972f;

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f33967a = (String) Preconditions.checkNotNull(str);
        this.f33968b = (String) Preconditions.checkNotNull(str2);
        this.f33969c = (String) Preconditions.checkNotNull(str3);
        this.f33970d = (List) Preconditions.checkNotNull(list);
        this.f33971e = 0;
        this.f33972f = m57140a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m57140a(String str, String str2, String str3) {
        return str + HelpFormatter.DEFAULT_OPT_PREFIX + str2 + HelpFormatter.DEFAULT_OPT_PREFIX + str3;
    }

    /* renamed from: b */
    public String m57139b() {
        return this.f33972f;
    }

    @Nullable
    public List<List<byte[]>> getCertificates() {
        return this.f33970d;
    }

    @ArrayRes
    public int getCertificatesArrayResId() {
        return this.f33971e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String getIdentifier() {
        return this.f33972f;
    }

    @NonNull
    public String getProviderAuthority() {
        return this.f33967a;
    }

    @NonNull
    public String getProviderPackage() {
        return this.f33968b;
    }

    @NonNull
    public String getQuery() {
        return this.f33969c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f33967a + ", mProviderPackage: " + this.f33968b + ", mQuery: " + this.f33969c + ", mCertificates:");
        for (int i = 0; i < this.f33970d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f33970d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f33971e);
        return sb.toString();
    }

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i) {
        this.f33967a = (String) Preconditions.checkNotNull(str);
        this.f33968b = (String) Preconditions.checkNotNull(str2);
        this.f33969c = (String) Preconditions.checkNotNull(str3);
        this.f33970d = null;
        Preconditions.checkArgument(i != 0);
        this.f33971e = i;
        this.f33972f = m57140a(str, str2, str3);
    }
}
