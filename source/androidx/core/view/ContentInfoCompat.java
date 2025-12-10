package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;

    /* renamed from: a */
    public final InterfaceC4101f f34134a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Source {
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$a */
    /* loaded from: classes2.dex */
    public static final class C4096a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static Pair<ContentInfo, ContentInfo> m57042a(@NonNull ContentInfo contentInfo, @NonNull final Predicate<ClipData.Item> predicate) {
            ContentInfo contentInfo2;
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                if (test) {
                    contentInfo2 = contentInfo;
                } else {
                    contentInfo2 = null;
                }
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair m57044c = ContentInfoCompat.m57044c(clip, new androidx.core.util.Predicate() { // from class: Dx
                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate2) {
                    return AbstractC20438im1.m30576a(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate negate() {
                    return AbstractC20438im1.m30575b(this);
                }

                @Override // androidx.core.util.Predicate
                /* renamed from: or */
                public /* synthetic */ androidx.core.util.Predicate mo62or(androidx.core.util.Predicate predicate2) {
                    return AbstractC20438im1.m30574c(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (m57044c.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (m57044c.second == null) {
                return Pair.create(contentInfo, null);
            }
            return Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) m57044c.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) m57044c.second).build());
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4098c {
        /* renamed from: a */
        void mo57041a(Uri uri);

        /* renamed from: b */
        void mo57040b(int i);

        ContentInfoCompat build();

        /* renamed from: c */
        void mo57039c(ClipData clipData);

        /* renamed from: d */
        void mo57038d(int i);

        void setExtras(Bundle bundle);
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$e */
    /* loaded from: classes2.dex */
    public static final class C4100e implements InterfaceC4101f {

        /* renamed from: a */
        public final ContentInfo f34142a;

        public C4100e(ContentInfo contentInfo) {
            this.f34142a = AbstractC0217Cx.m68719a(Preconditions.checkNotNull(contentInfo));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        /* renamed from: a */
        public Uri mo57037a() {
            Uri linkUri;
            linkUri = this.f34142a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        /* renamed from: b */
        public ContentInfo mo57036b() {
            return this.f34142a;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public ClipData getClip() {
            ClipData clip;
            clip = this.f34142a.getClip();
            return clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public Bundle getExtras() {
            Bundle extras;
            extras = this.f34142a.getExtras();
            return extras;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public int getFlags() {
            int flags;
            flags = this.f34142a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public int getSource() {
            int source;
            source = this.f34142a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f34142a + "}";
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4101f {
        /* renamed from: a */
        Uri mo57037a();

        /* renamed from: b */
        ContentInfo mo57036b();

        ClipData getClip();

        Bundle getExtras();

        int getFlags();

        int getSource();
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$g */
    /* loaded from: classes2.dex */
    public static final class C4102g implements InterfaceC4101f {

        /* renamed from: a */
        public final ClipData f34143a;

        /* renamed from: b */
        public final int f34144b;

        /* renamed from: c */
        public final int f34145c;

        /* renamed from: d */
        public final Uri f34146d;

        /* renamed from: e */
        public final Bundle f34147e;

        public C4102g(C4099d c4099d) {
            this.f34143a = (ClipData) Preconditions.checkNotNull(c4099d.f34137a);
            this.f34144b = Preconditions.checkArgumentInRange(c4099d.f34138b, 0, 5, "source");
            this.f34145c = Preconditions.checkFlagsArgument(c4099d.f34139c, 1);
            this.f34146d = c4099d.f34140d;
            this.f34147e = c4099d.f34141e;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        /* renamed from: a */
        public Uri mo57037a() {
            return this.f34146d;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        /* renamed from: b */
        public ContentInfo mo57036b() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public ClipData getClip() {
            return this.f34143a;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public Bundle getExtras() {
            return this.f34147e;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public int getFlags() {
            return this.f34145c;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4101f
        public int getSource() {
            return this.f34144b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f34143a.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.m57043d(this.f34144b));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.m57045b(this.f34145c));
            String str2 = "";
            if (this.f34146d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f34146d.toString().length() + ")";
            }
            sb.append(str);
            if (this.f34147e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    public ContentInfoCompat(InterfaceC4101f interfaceC4101f) {
        this.f34134a = interfaceC4101f;
    }

    /* renamed from: a */
    public static ClipData m57046a(ClipDescription clipDescription, List list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem((ClipData.Item) list.get(i));
        }
        return clipData;
    }

    /* renamed from: b */
    public static String m57045b(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    /* renamed from: c */
    public static Pair m57044c(ClipData clipData, androidx.core.util.Predicate predicate) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(m57046a(clipData.getDescription(), arrayList), m57046a(clipData.getDescription(), arrayList2));
    }

    /* renamed from: d */
    public static String m57043d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return String.valueOf(i);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    @NonNull
    @RequiresApi(31)
    public static ContentInfoCompat toContentInfoCompat(@NonNull ContentInfo contentInfo) {
        return new ContentInfoCompat(new C4100e(contentInfo));
    }

    @NonNull
    public ClipData getClip() {
        return this.f34134a.getClip();
    }

    @Nullable
    public Bundle getExtras() {
        return this.f34134a.getExtras();
    }

    public int getFlags() {
        return this.f34134a.getFlags();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.f34134a.mo57037a();
    }

    public int getSource() {
        return this.f34134a.getSource();
    }

    @NonNull
    public Pair<ContentInfoCompat, ContentInfoCompat> partition(@NonNull androidx.core.util.Predicate<ClipData.Item> predicate) {
        ClipData clip = this.f34134a.getClip();
        if (clip.getItemCount() == 1) {
            boolean test = predicate.test(clip.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair m57044c = m57044c(clip, predicate);
        if (m57044c.first == null) {
            return Pair.create(null, this);
        }
        if (m57044c.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new Builder(this).setClip((ClipData) m57044c.first).build(), new Builder(this).setClip((ClipData) m57044c.second).build());
    }

    @NonNull
    @RequiresApi(31)
    public ContentInfo toContentInfo() {
        ContentInfo mo57036b = this.f34134a.mo57036b();
        Objects.requireNonNull(mo57036b);
        return AbstractC0217Cx.m68719a(mo57036b);
    }

    @NonNull
    public String toString() {
        return this.f34134a.toString();
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$b */
    /* loaded from: classes2.dex */
    public static final class C4097b implements InterfaceC4098c {

        /* renamed from: a */
        public final ContentInfo.Builder f34136a;

        public C4097b(ClipData clipData, int i) {
            this.f34136a = AbstractC0772Kx.m67575a(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: a */
        public void mo57041a(Uri uri) {
            this.f34136a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: b */
        public void mo57040b(int i) {
            this.f34136a.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        public ContentInfoCompat build() {
            ContentInfo build;
            build = this.f34136a.build();
            return new ContentInfoCompat(new C4100e(build));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: c */
        public void mo57039c(ClipData clipData) {
            this.f34136a.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: d */
        public void mo57038d(int i) {
            this.f34136a.setSource(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        public void setExtras(Bundle bundle) {
            this.f34136a.setExtras(bundle);
        }

        public C4097b(ContentInfoCompat contentInfoCompat) {
            AbstractC0910Mx.m67261a();
            this.f34136a = AbstractC0836Lx.m67452a(contentInfoCompat.toContentInfo());
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$d */
    /* loaded from: classes2.dex */
    public static final class C4099d implements InterfaceC4098c {

        /* renamed from: a */
        public ClipData f34137a;

        /* renamed from: b */
        public int f34138b;

        /* renamed from: c */
        public int f34139c;

        /* renamed from: d */
        public Uri f34140d;

        /* renamed from: e */
        public Bundle f34141e;

        public C4099d(ClipData clipData, int i) {
            this.f34137a = clipData;
            this.f34138b = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: a */
        public void mo57041a(Uri uri) {
            this.f34140d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: b */
        public void mo57040b(int i) {
            this.f34139c = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new C4102g(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: c */
        public void mo57039c(ClipData clipData) {
            this.f34137a = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        /* renamed from: d */
        public void mo57038d(int i) {
            this.f34138b = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.InterfaceC4098c
        public void setExtras(Bundle bundle) {
            this.f34141e = bundle;
        }

        public C4099d(ContentInfoCompat contentInfoCompat) {
            this.f34137a = contentInfoCompat.getClip();
            this.f34138b = contentInfoCompat.getSource();
            this.f34139c = contentInfoCompat.getFlags();
            this.f34140d = contentInfoCompat.getLinkUri();
            this.f34141e = contentInfoCompat.getExtras();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final InterfaceC4098c f34135a;

        public Builder(@NonNull ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f34135a = new C4097b(contentInfoCompat);
            } else {
                this.f34135a = new C4099d(contentInfoCompat);
            }
        }

        @NonNull
        public ContentInfoCompat build() {
            return this.f34135a.build();
        }

        @NonNull
        public Builder setClip(@NonNull ClipData clipData) {
            this.f34135a.mo57039c(clipData);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.f34135a.setExtras(bundle);
            return this;
        }

        @NonNull
        public Builder setFlags(int i) {
            this.f34135a.mo57040b(i);
            return this;
        }

        @NonNull
        public Builder setLinkUri(@Nullable Uri uri) {
            this.f34135a.mo57041a(uri);
            return this;
        }

        @NonNull
        public Builder setSource(int i) {
            this.f34135a.mo57038d(i);
            return this;
        }

        public Builder(@NonNull ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f34135a = new C4097b(clipData, i);
            } else {
                this.f34135a = new C4099d(clipData, i);
            }
        }
    }

    @NonNull
    @RequiresApi(31)
    public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
        return C4096a.m57042a(contentInfo, predicate);
    }
}
