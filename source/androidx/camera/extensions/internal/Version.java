package androidx.camera.extensions.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

@AutoValue
@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class Version implements Comparable<Version> {
    public static final Version VERSION_1_0 = create(1, 0, 0, "");
    public static final Version VERSION_1_1 = create(1, 1, 0, "");
    public static final Version VERSION_1_2 = create(1, 2, 0, "");
    public static final Version VERSION_1_3 = create(1, 3, 0, "");
    public static final Version VERSION_1_4 = create(1, 4, 0, "");

    /* renamed from: a */
    public static final Pattern f11526a = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:\\-(.+))?");

    /* renamed from: a */
    public static BigInteger m62602a(Version version) {
        return BigInteger.valueOf(version.getMajor()).shiftLeft(32).or(BigInteger.valueOf(version.mo25957c())).shiftLeft(32).or(BigInteger.valueOf(version.mo25956d()));
    }

    @NonNull
    public static Version create(int i, int i2, int i3, @NonNull String str) {
        return new C12421o9(i, i2, i3, str);
    }

    @Nullable
    public static Version parse(@NonNull String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f11526a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2));
        int parseInt3 = Integer.parseInt(matcher.group(3));
        if (matcher.group(4) != null) {
            str2 = matcher.group(4);
        } else {
            str2 = "";
        }
        return create(parseInt, parseInt2, parseInt3, str2);
    }

    /* renamed from: b */
    public abstract String mo25958b();

    /* renamed from: c */
    public abstract int mo25957c();

    /* renamed from: d */
    public abstract int mo25956d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        if (!Integer.valueOf(getMajor()).equals(Integer.valueOf(version.getMajor())) || !Integer.valueOf(mo25957c()).equals(Integer.valueOf(version.mo25957c())) || !Integer.valueOf(mo25956d()).equals(Integer.valueOf(version.mo25956d()))) {
            return false;
        }
        return true;
    }

    public abstract int getMajor();

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(getMajor()), Integer.valueOf(mo25957c()), Integer.valueOf(mo25956d()));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(getMajor() + "." + mo25957c() + "." + mo25956d());
        if (!TextUtils.isEmpty(mo25958b())) {
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX + mo25958b());
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Version version) {
        return m62602a(this).compareTo(m62602a(version));
    }

    public int compareTo(int i) {
        return compareTo(i, 0);
    }

    public int compareTo(int i, int i2) {
        if (getMajor() == i) {
            return Integer.compare(mo25957c(), i2);
        }
        return Integer.compare(getMajor(), i);
    }
}
