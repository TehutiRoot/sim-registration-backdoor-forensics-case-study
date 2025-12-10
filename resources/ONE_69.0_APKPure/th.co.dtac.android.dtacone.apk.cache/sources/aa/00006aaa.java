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
    public final String f34055a;

    /* renamed from: b */
    public final String f34056b;

    /* renamed from: c */
    public final String f34057c;

    /* renamed from: d */
    public final List f34058d;

    /* renamed from: e */
    public final int f34059e;

    /* renamed from: f */
    public final String f34060f;

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f34055a = (String) Preconditions.checkNotNull(str);
        this.f34056b = (String) Preconditions.checkNotNull(str2);
        this.f34057c = (String) Preconditions.checkNotNull(str3);
        this.f34058d = (List) Preconditions.checkNotNull(list);
        this.f34059e = 0;
        this.f34060f = m57090a(str, str2, str3);
    }

    /* renamed from: a */
    public final String m57090a(String str, String str2, String str3) {
        return str + HelpFormatter.DEFAULT_OPT_PREFIX + str2 + HelpFormatter.DEFAULT_OPT_PREFIX + str3;
    }

    /* renamed from: b */
    public String m57089b() {
        return this.f34060f;
    }

    @Nullable
    public List<List<byte[]>> getCertificates() {
        return this.f34058d;
    }

    @ArrayRes
    public int getCertificatesArrayResId() {
        return this.f34059e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String getIdentifier() {
        return this.f34060f;
    }

    @NonNull
    public String getProviderAuthority() {
        return this.f34055a;
    }

    @NonNull
    public String getProviderPackage() {
        return this.f34056b;
    }

    @NonNull
    public String getQuery() {
        return this.f34057c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f34055a + ", mProviderPackage: " + this.f34056b + ", mQuery: " + this.f34057c + ", mCertificates:");
        for (int i = 0; i < this.f34058d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f34058d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f34059e);
        return sb.toString();
    }

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i) {
        this.f34055a = (String) Preconditions.checkNotNull(str);
        this.f34056b = (String) Preconditions.checkNotNull(str2);
        this.f34057c = (String) Preconditions.checkNotNull(str3);
        this.f34058d = null;
        Preconditions.checkArgument(i != 0);
        this.f34059e = i;
        this.f34060f = m57090a(str, str2, str3);
    }
}